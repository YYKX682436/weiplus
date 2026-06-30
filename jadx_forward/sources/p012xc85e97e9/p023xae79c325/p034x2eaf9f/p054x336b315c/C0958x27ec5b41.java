package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* renamed from: androidx.camera.core.streamsharing.ResolutionsMerger */
/* loaded from: classes14.dex */
public class C0958x27ec5b41 {

    /* renamed from: SAME_AREA_WIDTH_HEIGHT_RATIO */
    private static final double f2323x553294e5 = java.lang.Math.sqrt(2.3703703703703702d);
    private static final java.lang.String TAG = "ResolutionsMerger";

    /* renamed from: mCameraInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 f2324x643e79c0;

    /* renamed from: mChildSizesCache */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> f2325xb9c8781f;

    /* renamed from: mChildrenConfigs */
    private final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> f2326x14066245;

    /* renamed from: mFallbackAspectRatio */
    private final android.util.Rational f2327x9c6f90a4;

    /* renamed from: mSensorAspectRatio */
    private final android.util.Rational f2328x6714658c;

    /* renamed from: mSensorSize */
    private final android.util.Size f2329x42353328;

    /* renamed from: mSizeSorter */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e f2330x5d5a1279;

    /* renamed from: androidx.camera.core.streamsharing.ResolutionsMerger$CompareAspectRatioByOverlappingAreaToReference */
    /* loaded from: classes14.dex */
    public static class CompareAspectRatioByOverlappingAreaToReference implements java.util.Comparator<android.util.Rational> {

        /* renamed from: mReferenceAspectRatio */
        private final android.util.Rational f2331xb66b7a55;

        /* renamed from: mReverse */
        private final boolean f2332xdfa705b5;

        public CompareAspectRatioByOverlappingAreaToReference(android.util.Rational rational, boolean z17) {
            this.f2331xb66b7a55 = rational;
            this.f2332xdfa705b5 = z17;
        }

        @Override // java.util.Comparator
        public int compare(android.util.Rational rational, android.util.Rational rational2) {
            float m6516x2ce21235 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41.m6516x2ce21235(rational, this.f2331xb66b7a55);
            float m6516x2ce212352 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41.m6516x2ce21235(rational2, this.f2331xb66b7a55);
            if (this.f2332xdfa705b5) {
                return java.lang.Float.compare(m6516x2ce212352, m6516x2ce21235);
            }
            return java.lang.Float.compare(m6516x2ce21235, m6516x2ce212352);
        }
    }

    public C0958x27ec5b41(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> set) {
        this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5960x1b5f820(interfaceC0677x9e0bc522.mo3090x8af45b9f().mo2976x54436cb4()), interfaceC0677x9e0bc522.mo3091xbefeb46(), set);
    }

    /* renamed from: areCroppingInDifferentDirection */
    private boolean m6515xeeb0cce1(float f17, float f18, float f19) {
        if (f17 == f18 || f18 == f19) {
            return false;
        }
        return f17 > f18 ? f18 < f19 : f18 > f19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeAreaOverlapping */
    public static float m6516x2ce21235(android.util.Rational rational, android.util.Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    /* renamed from: filterOutChildSizesCausingDoubleCropping */
    private java.util.List<android.util.Size> m6517xac5e5cad(android.util.Rational rational, java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (!m6537xe0147abd(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: filterOutChildSizesThatWillNeverBeSelected */
    private static java.util.List<android.util.Size> m6518x3da34485(java.util.List<android.util.Size> list) {
        android.util.Rational rational;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (android.util.Rational) it.next();
                if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                android.util.Size size2 = (android.util.Size) hashMap.get(rational);
                java.util.Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = m6548x183e20c9(size);
            }
            arrayList.add(size);
            hashMap.put(rational, size);
        }
        return arrayList;
    }

    /* renamed from: filterOutParentSizeThatIsTooSmall */
    public static java.util.List<android.util.Size> m6519xc18483e5(java.util.Collection<android.util.Size> collection, java.util.List<android.util.Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (m6536x8e230fb5(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: filterResolutionsByAspectRatio */
    public static java.util.List<android.util.Size> m6520xc788374d(android.util.Rational rational, java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: findCloserAspectRatio */
    private static android.util.Rational m6521xc988c00(android.util.Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f2323x553294e5 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d;
    }

    /* renamed from: getCameraSupportedHighResolutions */
    private java.util.List<android.util.Size> m6522x931d48f2() {
        return this.f2324x643e79c0.mo3177x8984b12d(34);
    }

    /* renamed from: getCameraSupportedResolutions */
    private java.util.List<android.util.Size> m6523xeb405674() {
        return this.f2324x643e79c0.mo3179x2103142f(34);
    }

    /* renamed from: getCenterCroppedRectangle */
    private static android.graphics.Rect m6524x321a7d1b(android.util.Rational rational, android.util.Size size) {
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        android.util.Rational m6548x183e20c9 = m6548x183e20c9(size);
        if (rational.floatValue() == m6548x183e20c9.floatValue()) {
            rectF2 = new android.graphics.RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > m6548x183e20c9.floatValue()) {
                float f17 = width;
                float floatValue = f17 / rational.floatValue();
                float f18 = (height - floatValue) / 2.0f;
                rectF = new android.graphics.RectF(0.0f, f18, f17, floatValue + f18);
            } else {
                float f19 = height;
                float floatValue2 = rational.floatValue() * f19;
                float f27 = (width - floatValue2) / 2.0f;
                rectF = new android.graphics.RectF(f27, 0.0f, floatValue2 + f27, f19);
            }
            rectF2 = rectF;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF2.round(rect);
        return rect;
    }

    /* renamed from: getChildrenRequiredResolutions */
    private java.util.Set<android.util.Size> m6525xdf153673() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = this.f2326x14066245.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m6531x93fadae9(it.next()));
        }
        return hashSet;
    }

    /* renamed from: getCropRectOfReferenceAspectRatio */
    public static android.graphics.Rect m6526x9a6ed569(android.util.Size size, android.util.Size size2) {
        return m6524x321a7d1b(m6548x183e20c9(size2), size);
    }

    /* renamed from: getFallbackAspectRatio */
    private static android.util.Rational m6527xa035f1b(android.util.Rational rational) {
        android.util.Rational rational2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d;
        if (rational.equals(rational2)) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba;
        }
        if (rational.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba)) {
            return rational2;
        }
        throw new java.lang.IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    /* renamed from: getParentSizesThatAreTooLarge */
    public static java.util.List<android.util.Size> m6528x86839562(java.util.Collection<android.util.Size> collection, java.util.List<android.util.Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.List<android.util.Size> m6540xea1c546c = m6540xea1c546c(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : m6540xea1c546c) {
            if (m6535x3b2513a3(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* renamed from: getPreferredChildSizePairInternal */
    private android.util.Pair<android.graphics.Rect, android.util.Size> m6529x939be89(android.graphics.Rect rect, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, boolean z17) {
        android.util.Size m6551x277251b2;
        if (z17) {
            m6551x277251b2 = m6552xa02ec37d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5960x1b5f820(rect), interfaceC0768x83509b59);
        } else {
            android.util.Size m5960x1b5f820 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5960x1b5f820(rect);
            m6551x277251b2 = m6551x277251b2(m5960x1b5f820, interfaceC0768x83509b59);
            rect = m6526x9a6ed569(m5960x1b5f820, m6551x277251b2);
        }
        return new android.util.Pair<>(rect, m6551x277251b2);
    }

    /* renamed from: getSensorAspectRatio */
    private static android.util.Rational m6530x1d6765c3(android.util.Size size) {
        android.util.Rational m6521xc988c00 = m6521xc988c00(size);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "The closer aspect ratio to the sensor size (" + size + ") is " + m6521xc988c00 + ".");
        return m6521xc988c00;
    }

    /* renamed from: getSortedChildSizes */
    private java.util.List<android.util.Size> m6531x93fadae9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        if (!this.f2326x14066245.contains(interfaceC0768x83509b59)) {
            throw new java.lang.IllegalArgumentException("Invalid child config: " + interfaceC0768x83509b59);
        }
        if (this.f2325xb9c8781f.containsKey(interfaceC0768x83509b59)) {
            java.util.List<android.util.Size> list = this.f2325xb9c8781f.get(interfaceC0768x83509b59);
            java.util.Objects.requireNonNull(list);
            return list;
        }
        java.util.List<android.util.Size> m6518x3da34485 = m6518x3da34485(this.f2330x5d5a1279.m6128x340adcd6(interfaceC0768x83509b59));
        this.f2325xb9c8781f.put(interfaceC0768x83509b59, m6518x3da34485);
        return m6518x3da34485;
    }

    /* renamed from: getSupportedPrivResolutions */
    private static java.util.List<android.util.Size> m6532x91e93200(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
            if (((java.lang.Integer) pair.first).equals(34)) {
                return java.util.Arrays.asList((android.util.Size[]) pair.second);
            }
        }
        return new java.util.ArrayList();
    }

    /* renamed from: groupSizesByAspectRatio */
    private java.util.Map<android.util.Rational, java.util.List<android.util.Size>> m6533xf464f29(java.util.List<android.util.Size> list) {
        java.util.List list2;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.util.Rational rational = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d;
        hashMap.put(rational, new java.util.ArrayList());
        android.util.Rational rational2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba;
        hashMap.put(rational2, new java.util.ArrayList());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        for (android.util.Size size : list) {
            if (size.getHeight() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list2 = null;
                        break;
                    }
                    android.util.Rational rational3 = (android.util.Rational) it.next();
                    if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational3)) {
                        list2 = (java.util.List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new java.util.ArrayList();
                    android.util.Rational m6548x183e20c9 = m6548x183e20c9(size);
                    arrayList.add(m6548x183e20c9);
                    hashMap.put(m6548x183e20c9, list2);
                }
                list2.add(size);
            }
        }
        return hashMap;
    }

    /* renamed from: hasUpscaling */
    public static boolean m6534x66f33312(android.util.Size size, android.util.Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    /* renamed from: isAllChildSizesCanBeCroppedOutWithoutUpscalingParent */
    private static boolean m6535x3b2513a3(java.util.Collection<android.util.Size> collection, android.util.Size size) {
        java.util.Iterator<android.util.Size> it = collection.iterator();
        while (it.hasNext()) {
            if (m6534x66f33312(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent */
    private static boolean m6536x8e230fb5(java.util.Collection<android.util.Size> collection, android.util.Size size) {
        java.util.Iterator<android.util.Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!m6534x66f33312(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isDoubleCropping */
    private boolean m6537xe0147abd(android.util.Rational rational, android.util.Size size) {
        if (this.f2328x6714658c.equals(rational) || p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
            return false;
        }
        return m6515xeeb0cce1(this.f2328x6714658c.floatValue(), rational.floatValue(), m6549xfb5d76f0(size).floatValue());
    }

    /* renamed from: needToAddSensorResolutions */
    private boolean m6539xcbae6ddd() {
        java.util.Iterator<android.util.Size> it = m6525xdf153673().iterator();
        while (it.hasNext()) {
            if (!p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(it.next(), this.f2327x9c6f90a4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: removeDuplicates */
    private static java.util.List<android.util.Size> m6540xea1c546c(java.util.List<android.util.Size> list) {
        return list.isEmpty() ? list : new java.util.ArrayList(new java.util.LinkedHashSet(list));
    }

    /* renamed from: reverseRect */
    public static android.graphics.Rect m6541x5aacdfe6(android.graphics.Rect rect) {
        return new android.graphics.Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    /* renamed from: selectOtherAspectRatioParentResolutionsWithFovPriority */
    private java.util.List<android.util.Size> m6542x87f49f8d(java.util.List<android.util.Size> list, boolean z17) {
        java.util.Map<android.util.Rational, java.util.List<android.util.Size>> m6533xf464f29 = m6533xf464f29(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(m6533xf464f29.keySet());
        m6546xfdb301f8(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Rational rational = (android.util.Rational) it.next();
            if (!rational.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba) && !rational.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d)) {
                java.util.List<android.util.Size> list2 = m6533xf464f29.get(rational);
                java.util.Objects.requireNonNull(list2);
                arrayList2.addAll(m6544x2fee5e9b(rational, list2, z17));
            }
        }
        return arrayList2;
    }

    /* renamed from: selectParentResolutions */
    private java.util.List<android.util.Size> m6543x52bd30a1(java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m6539xcbae6ddd()) {
            arrayList.addAll(m6544x2fee5e9b(this.f2328x6714658c, list, false));
        }
        arrayList.addAll(m6544x2fee5e9b(this.f2327x9c6f90a4, list, false));
        arrayList.addAll(m6542x87f49f8d(list, false));
        if (arrayList.isEmpty()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(m6542x87f49f8d(list, true));
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Parent resolutions: " + arrayList);
        return arrayList;
    }

    /* renamed from: selectParentResolutionsByAspectRatio */
    private java.util.List<android.util.Size> m6544x2fee5e9b(android.util.Rational rational, java.util.List<android.util.Size> list, boolean z17) {
        java.util.List<android.util.Size> m6520xc788374d = m6520xc788374d(rational, list);
        m6547x71709d53(m6520xc788374d);
        java.util.HashSet hashSet = new java.util.HashSet(m6520xc788374d);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = this.f2326x14066245.iterator();
        while (it.hasNext()) {
            java.util.List<android.util.Size> m6531x93fadae9 = m6531x93fadae9(it.next());
            if (!z17) {
                m6531x93fadae9 = m6517xac5e5cad(rational, m6531x93fadae9);
            }
            if (m6531x93fadae9.isEmpty()) {
                return new java.util.ArrayList();
            }
            m6520xc788374d = m6519xc18483e5(m6531x93fadae9, m6520xc788374d);
            hashSet.retainAll(m6528x86839562(m6531x93fadae9, m6520xc788374d));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : m6520xc788374d) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* renamed from: shouldIncludeHighResolutions */
    private boolean m6545x46999610() {
        boolean z17;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m5488x7fe0c6a1;
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = this.f2326x14066245.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> next = it.next();
            if (!next.m5756x1401fe54(false) && (next instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) && (m5488x7fe0c6a1 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) next).m5488x7fe0c6a1(null)) != null) {
                z17 = true;
                if (m5488x7fe0c6a1.m6496xf14a8a81() == 1) {
                    break;
                }
            }
        }
        return z17;
    }

    /* renamed from: sortByFov */
    private void m6546xfdb301f8(java.util.List<android.util.Rational> list) {
        java.util.Collections.sort(list, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41.CompareAspectRatioByOverlappingAreaToReference(m6548x183e20c9(this.f2329x42353328), true));
    }

    /* renamed from: sortInDescendingOrder */
    public static void m6547x71709d53(java.util.List<android.util.Size> list) {
        java.util.Collections.sort(list, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1(true));
    }

    /* renamed from: toRational */
    private static android.util.Rational m6548x183e20c9(android.util.Size size) {
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: toRationalWithMod16Considered */
    private static android.util.Rational m6549xfb5d76f0(android.util.Size size) {
        android.util.Rational rational = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d;
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
            return rational;
        }
        android.util.Rational rational2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba;
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational2) ? rational2 : m6548x183e20c9(size);
    }

    /* renamed from: getMergedResolutions */
    public java.util.List<android.util.Size> m6550x801375c5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 interfaceC0730x35b9a1e8) {
        java.util.List<android.util.Size> m6523xeb405674 = m6523xeb405674();
        if (m6545x46999610()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(m6523xeb405674);
            arrayList.addAll(m6522x931d48f2());
            m6523xeb405674 = arrayList;
        }
        java.util.List list = (java.util.List) interfaceC0730x35b9a1e8.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1695x2ed2d6ac, null);
        if (list != null) {
            m6523xeb405674 = m6532x91e93200(list);
        }
        return m6543x52bd30a1(m6523xeb405674);
    }

    /* renamed from: getPreferredChildSize */
    public android.util.Size m6551x277251b2(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        java.util.List<android.util.Size> m6531x93fadae9 = m6531x93fadae9(interfaceC0768x83509b59);
        for (android.util.Size size2 : m6531x93fadae9) {
            if (!m6538xe0147abd(size, size2) && !m6534x66f33312(size2, size)) {
                return size2;
            }
        }
        for (android.util.Size size3 : m6531x93fadae9) {
            if (!m6534x66f33312(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    /* renamed from: getPreferredChildSizeForViewport */
    public android.util.Size m6552xa02ec37d(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        java.util.Iterator<android.util.Size> it = m6531x93fadae9(interfaceC0768x83509b59).iterator();
        while (it.hasNext()) {
            android.util.Size m5960x1b5f820 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5960x1b5f820(m6526x9a6ed569(it.next(), size));
            if (!m6534x66f33312(m5960x1b5f820, size)) {
                return m5960x1b5f820;
            }
        }
        return size;
    }

    /* renamed from: getPreferredChildSizePair */
    public android.util.Pair<android.graphics.Rect, android.util.Size> m6553x9dd3ffac(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, android.graphics.Rect rect, int i17, boolean z17) {
        boolean z18;
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5956x99b544a7(i17)) {
            rect = m6541x5aacdfe6(rect);
            z18 = true;
        } else {
            z18 = false;
        }
        android.util.Pair<android.graphics.Rect, android.util.Size> m6529x939be89 = m6529x939be89(rect, interfaceC0768x83509b59, z17);
        android.graphics.Rect rect2 = (android.graphics.Rect) m6529x939be89.first;
        android.util.Size size = (android.util.Size) m6529x939be89.second;
        if (z18) {
            size = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5963x5aad6603(size);
            rect2 = m6541x5aacdfe6(rect2);
        }
        return new android.util.Pair<>(rect2, size);
    }

    private C0958x27ec5b41(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> set) {
        this(size, interfaceC0675x66574570, set, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e(interfaceC0675x66574570, size));
    }

    public C0958x27ec5b41(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> set, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e c0838x392b74e) {
        this.f2325xb9c8781f = new java.util.HashMap();
        this.f2329x42353328 = size;
        android.util.Rational m6530x1d6765c3 = m6530x1d6765c3(size);
        this.f2328x6714658c = m6530x1d6765c3;
        this.f2327x9c6f90a4 = m6527xa035f1b(m6530x1d6765c3);
        this.f2324x643e79c0 = interfaceC0675x66574570;
        this.f2326x14066245 = set;
        this.f2330x5d5a1279 = c0838x392b74e;
    }

    /* renamed from: isDoubleCropping */
    private boolean m6538xe0147abd(android.util.Size size, android.util.Size size2) {
        return m6537xe0147abd(m6549xfb5d76f0(size), size2);
    }
}

package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.SupportedOutputSizesSorter */
/* loaded from: classes14.dex */
public class C0838x392b74e {
    private static final java.lang.String TAG = "SupportedOutputSizesCollector";

    /* renamed from: mCameraInfoInternal */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 f2085xf7e2e49d;

    /* renamed from: mFullFovRatio */
    private final android.util.Rational f2086x76306bfa;

    /* renamed from: mLensFacing */
    private final int f2087x4d541ec5;

    /* renamed from: mSensorOrientation */
    private final int f2088xd02e18c9;

    /* renamed from: mSupportedOutputSizesSorterLegacy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0839xc80364b7 f2089x5cde7124;

    public C0838x392b74e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, android.util.Size size) {
        this.f2085xf7e2e49d = interfaceC0675x66574570;
        this.f2088xd02e18c9 = interfaceC0675x66574570.mo3172x3b4734f9();
        this.f2087x4d541ec5 = interfaceC0675x66574570.mo3168x5f62de6e();
        android.util.Rational m6117x1cb3e417 = size != null ? m6117x1cb3e417(size) : m6118x91a899e0(interfaceC0675x66574570);
        this.f2086x76306bfa = m6117x1cb3e417;
        this.f2089x5cde7124 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0839xc80364b7(interfaceC0675x66574570, m6117x1cb3e417);
    }

    /* renamed from: applyAspectRatioStrategy */
    private static java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> m6110x31f288d8(java.util.List<android.util.Size> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 c0953x9920cf06, android.util.Rational rational) {
        return m6111x5073c9f6(m6123xf464f29(list), c0953x9920cf06, rational);
    }

    /* renamed from: applyAspectRatioStrategyFallbackRule */
    private static java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> m6111x5073c9f6(java.util.Map<android.util.Rational, java.util.List<android.util.Size>> map, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 c0953x9920cf06, android.util.Rational rational) {
        boolean z17 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z17 = false;
        }
        android.util.Rational m6122xc2241cb7 = m6122xc2241cb7(c0953x9920cf06.m6495xa2546fc8(), z17);
        if (c0953x9920cf06.m6494xf6a70374() == 0) {
            android.util.Rational m6122xc2241cb72 = m6122xc2241cb7(c0953x9920cf06.m6495xa2546fc8(), z17);
            java.util.Iterator it = new java.util.ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                android.util.Rational rational2 = (android.util.Rational) it.next();
                if (!rational2.equals(m6122xc2241cb72)) {
                    map.remove(rational2);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.Collections.sort(arrayList, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(m6122xc2241cb7, rational));
        java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> linkedHashMap = new java.util.LinkedHashMap<>();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.util.Rational rational3 = (android.util.Rational) it6.next();
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    /* renamed from: applyHighResolutionSettings */
    private java.util.List<android.util.Size> m6112x667a2b3f(java.util.List<android.util.Size> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb, int i17) {
        if (c0955xda4820cb.m6496xf14a8a81() != 1) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f2085xf7e2e49d.mo3177x8984b12d(i17));
        java.util.Collections.sort(arrayList, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1(true));
        return arrayList;
    }

    /* renamed from: applyMaxResolutionRestriction */
    private static void m6113x9583ce0a(java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> linkedHashMap, android.util.Size size) {
        int m6239xfb7d3903 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size);
        java.util.Iterator<android.util.Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            java.util.List<android.util.Size> list = linkedHashMap.get(it.next());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.util.Size size2 : list) {
                if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size2) <= m6239xfb7d3903) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* renamed from: applyResolutionFilter */
    private static java.util.List<android.util.Size> m6114xcaac2ad2(java.util.List<android.util.Size> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364 interfaceC0954xa5894364, int i17, int i18, int i19) {
        if (interfaceC0954xa5894364 == null) {
            return list;
        }
        java.util.List<android.util.Size> mo4439xb408cb78 = interfaceC0954xa5894364.mo4439xb408cb78(new java.util.ArrayList(list), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5807x61e284d7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(i17), i18, i19 == 1));
        if (list.containsAll(mo4439xb408cb78)) {
            return mo4439xb408cb78;
        }
        throw new java.lang.IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    /* renamed from: applyResolutionStrategy */
    private static void m6115x65d8944d(java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> linkedHashMap, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f c0956xfdd1d05f) {
        if (c0956xfdd1d05f == null) {
            return;
        }
        java.util.Iterator<android.util.Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            m6116x7e834deb(linkedHashMap.get(it.next()), c0956xfdd1d05f);
        }
    }

    /* renamed from: applyResolutionStrategyFallbackRule */
    private static void m6116x7e834deb(java.util.List<android.util.Size> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f c0956xfdd1d05f) {
        if (list.isEmpty()) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c0956xfdd1d05f.m6508xf6a70374());
        if (c0956xfdd1d05f.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f.f2320xcf28abe4)) {
            return;
        }
        android.util.Size m6507xbad90fe9 = c0956xfdd1d05f.m6507xbad90fe9();
        int intValue = valueOf.intValue();
        if (intValue == 0) {
            m6127xf3ace52f(list, m6507xbad90fe9);
            return;
        }
        if (intValue == 1) {
            m6125x461ff873(list, m6507xbad90fe9, true);
            return;
        }
        if (intValue == 2) {
            m6125x461ff873(list, m6507xbad90fe9, false);
        } else if (intValue == 3) {
            m6126xb36786cb(list, m6507xbad90fe9, true);
        } else {
            if (intValue != 4) {
                return;
            }
            m6126xb36786cb(list, m6507xbad90fe9, false);
        }
    }

    /* renamed from: calculateFullFovRatioFromActiveArraySize */
    private android.util.Rational m6117x1cb3e417(android.util.Size size) {
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: calculateFullFovRatioFromSupportedOutputSizes */
    private android.util.Rational m6118x91a899e0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570) {
        java.util.List<android.util.Size> mo3179x2103142f = interfaceC0675x66574570.mo3179x2103142f(256);
        if (mo3179x2103142f.isEmpty()) {
            return null;
        }
        android.util.Size size = (android.util.Size) java.util.Collections.max(mo3179x2103142f, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1());
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: getResolutionCandidateList */
    private java.util.List<android.util.Size> m6119xacfdd73f(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17) {
        java.util.List<android.util.Size> m6121x21f04c03 = m6121x21f04c03(list, i17);
        if (m6121x21f04c03 == null) {
            m6121x21f04c03 = this.f2085xf7e2e49d.mo3179x2103142f(i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(m6121x21f04c03);
        java.util.Collections.sort(arrayList, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1(true));
        if (arrayList.isEmpty()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "The retrieved supported resolutions from camera info internal is empty. Format is " + i17 + ".");
        }
        return arrayList;
    }

    /* renamed from: getResolutionListGroupingAspectRatioKeys */
    public static java.util.List<android.util.Rational> m6120x713e2f24(java.util.List<android.util.Size> list) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d);
        arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba);
        for (android.util.Size size : list) {
            android.util.Rational rational = new android.util.Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, (android.util.Rational) it.next())) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    arrayList.add(rational);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: getSizeListByFormat */
    private java.util.List<android.util.Size> m6121x21f04c03(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17) {
        android.util.Size[] sizeArr;
        if (list != null) {
            for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
                if (((java.lang.Integer) pair.first).intValue() == i17) {
                    sizeArr = (android.util.Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return java.util.Arrays.asList(sizeArr);
    }

    /* renamed from: getTargetAspectRatioRationalValue */
    public static android.util.Rational m6122xc2241cb7(int i17, boolean z17) {
        if (i17 != -1) {
            if (i17 == 0) {
                return z17 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1854x8750dd6d : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1853x8750d9ad;
            }
            if (i17 == 1) {
                return z17 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1852x62c8deba : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.f1855x62cd1606;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Undefined target aspect ratio: " + i17);
        }
        return null;
    }

    /* renamed from: groupSizesByAspectRatio */
    public static java.util.Map<android.util.Rational, java.util.List<android.util.Size>> m6123xf464f29(java.util.List<android.util.Size> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<android.util.Rational> it = m6120x713e2f24(list).iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), new java.util.ArrayList());
        }
        for (android.util.Size size : list) {
            for (android.util.Rational rational : hashMap.keySet()) {
                if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
                    ((java.util.List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: sortSupportedOutputSizesByResolutionSelector */
    public static java.util.List<android.util.Size> m6124xfa17e843(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb, java.util.List<android.util.Size> list, android.util.Size size, int i17, android.util.Rational rational, int i18, int i19) {
        java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> m6110x31f288d8 = m6110x31f288d8(list, c0955xda4820cb.m6497xa69ce3f0(), rational);
        if (size != null) {
            m6113x9583ce0a(m6110x31f288d8, size);
        }
        m6115x65d8944d(m6110x31f288d8, c0955xda4820cb.m6499xa36a7635());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<android.util.Size>> it = m6110x31f288d8.values().iterator();
        while (it.hasNext()) {
            for (android.util.Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return m6114xcaac2ad2(arrayList, c0955xda4820cb.m6498x7f9d66ba(), i17, i18, i19);
    }

    /* renamed from: sortSupportedSizesByFallbackRuleClosestHigherThenLower */
    public static void m6125x461ff873(java.util.List<android.util.Size> list, android.util.Size size, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            android.util.Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        java.util.Collections.reverse(list);
        if (z17) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: sortSupportedSizesByFallbackRuleClosestLowerThenHigher */
    private static void m6126xb36786cb(java.util.List<android.util.Size> list, android.util.Size size, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            android.util.Size size2 = list.get(i17);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z17) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: sortSupportedSizesByFallbackRuleNone */
    private static void m6127xf3ace52f(java.util.List<android.util.Size> list, android.util.Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    /* renamed from: getSortedSupportedOutputSizes */
    public java.util.List<android.util.Size> m6128x340adcd6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e interfaceC0717xf80d107e = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) interfaceC0768x83509b59;
        java.util.List<android.util.Size> m5481x5d71f561 = interfaceC0717xf80d107e.m5481x5d71f561(null);
        if (m5481x5d71f561 != null) {
            return m5481x5d71f561;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m5488x7fe0c6a1 = interfaceC0717xf80d107e.m5488x7fe0c6a1(null);
        java.util.List<android.util.Size> m6119xacfdd73f = m6119xacfdd73f(interfaceC0717xf80d107e.m5490x2103142f(null), interfaceC0768x83509b59.mo5446xb124032b());
        if (m5488x7fe0c6a1 == null) {
            return this.f2089x5cde7124.m6134xd6ae7941(m6119xacfdd73f, interfaceC0768x83509b59);
        }
        android.util.Size m5485x1820497a = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) interfaceC0768x83509b59).m5485x1820497a(null);
        int m5495x8d4b9125 = interfaceC0717xf80d107e.m5495x8d4b9125(0);
        if (!interfaceC0768x83509b59.m5756x1401fe54(false)) {
            m6119xacfdd73f = m6112x667a2b3f(m6119xacfdd73f, m5488x7fe0c6a1, interfaceC0768x83509b59.mo5446xb124032b());
        }
        return m6124xfa17e843(interfaceC0717xf80d107e.m5487x7fe0c6a1(), m6119xacfdd73f, m5485x1820497a, m5495x8d4b9125, this.f2086x76306bfa, this.f2088xd02e18c9, this.f2087x4d541ec5);
    }
}

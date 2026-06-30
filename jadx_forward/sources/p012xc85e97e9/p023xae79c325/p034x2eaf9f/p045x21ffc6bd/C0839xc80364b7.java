package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.internal.SupportedOutputSizesSorterLegacy */
/* loaded from: classes14.dex */
public class C0839xc80364b7 {
    private static final java.lang.String TAG = "SupportedOutputSizesCollector";

    /* renamed from: mFullFovRatio */
    private final android.util.Rational f2090x76306bfa;

    /* renamed from: mIsSensorLandscapeResolution */
    private final boolean f2091x830050f6;

    /* renamed from: mLensFacing */
    private final int f2092x4d541ec5;

    /* renamed from: mSensorOrientation */
    private final int f2093xd02e18c9;

    public C0839xc80364b7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, android.util.Rational rational) {
        this.f2093xd02e18c9 = interfaceC0675x66574570.mo3172x3b4734f9();
        this.f2092x4d541ec5 = interfaceC0675x66574570.mo3168x5f62de6e();
        this.f2090x76306bfa = rational;
        boolean z17 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z17 = false;
        }
        this.f2091x830050f6 = z17;
    }

    /* renamed from: flipSizeByRotation */
    private static android.util.Size m6129xb6e0b1a3(android.util.Size size, int i17, int i18, int i19) {
        return (size == null || !m6133x5f27349d(i17, i18, i19)) ? size : new android.util.Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: getAspectRatioGroupKeyOfTargetSize */
    private static android.util.Rational m6130xcb533ae6(android.util.Size size, java.util.List<android.util.Size> list) {
        if (size == null) {
            return null;
        }
        for (android.util.Rational rational : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e.m6120x713e2f24(list)) {
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.m5786xf847b95c(size, rational)) {
                return rational;
            }
        }
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: getTargetAspectRatioByLegacyApi */
    private android.util.Rational m6131xa971bfce(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e interfaceC0717xf80d107e, java.util.List<android.util.Size> list) {
        if (interfaceC0717xf80d107e.m5496x637d78c8()) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e.m6122xc2241cb7(interfaceC0717xf80d107e.m5491x77170b8c(), this.f2091x830050f6);
        }
        android.util.Size m6132xb414d28 = m6132xb414d28(interfaceC0717xf80d107e);
        if (m6132xb414d28 != null) {
            return m6130xcb533ae6(m6132xb414d28, list);
        }
        return null;
    }

    /* renamed from: getTargetSize */
    private android.util.Size m6132xb414d28(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e interfaceC0717xf80d107e) {
        return m6129xb6e0b1a3(interfaceC0717xf80d107e.m5493xdba2c93(null), interfaceC0717xf80d107e.m5495x8d4b9125(0), this.f2092x4d541ec5, this.f2093xd02e18c9);
    }

    /* renamed from: isRotationNeeded */
    private static boolean m6133x5f27349d(int i17, int i18, int i19) {
        int m5807x61e284d7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5807x61e284d7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(i17), i19, 1 == i18);
        return m5807x61e284d7 == 90 || m5807x61e284d7 == 270;
    }

    /* renamed from: sortSupportedOutputSizes */
    public java.util.List<android.util.Size> m6134xd6ae7941(java.util.List<android.util.Size> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59) {
        if (list.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1(true));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e interfaceC0717xf80d107e = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) interfaceC0768x83509b59;
        android.util.Size m5485x1820497a = interfaceC0717xf80d107e.m5485x1820497a(null);
        android.util.Size size = (android.util.Size) arrayList.get(0);
        if (m5485x1820497a == null || p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size) < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(m5485x1820497a)) {
            m5485x1820497a = size;
        }
        android.util.Size m6132xb414d28 = m6132xb414d28(interfaceC0717xf80d107e);
        android.util.Size size2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2129x8adda99d;
        int m6239xfb7d3903 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size2);
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(m5485x1820497a) < m6239xfb7d3903) {
            size2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2130xd0d9565b;
        } else if (m6132xb414d28 != null && p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(m6132xb414d28) < m6239xfb7d3903) {
            size2 = m6132xb414d28;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Size size3 = (android.util.Size) it.next();
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size3) <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(m5485x1820497a) && p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size3) >= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + m5485x1820497a + "\ninitial size list: " + arrayList);
        }
        android.util.Rational m6131xa971bfce = m6131xa971bfce(interfaceC0717xf80d107e, arrayList2);
        if (m6132xb414d28 == null) {
            m6132xb414d28 = interfaceC0717xf80d107e.m5483x6799517(null);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        new java.util.HashMap();
        if (m6131xa971bfce == null) {
            arrayList3.addAll(arrayList2);
            if (m6132xb414d28 != null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e.m6125x461ff873(arrayList3, m6132xb414d28, true);
            }
        } else {
            java.util.Map<android.util.Rational, java.util.List<android.util.Size>> m6123xf464f29 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e.m6123xf464f29(arrayList2);
            if (m6132xb414d28 != null) {
                java.util.Iterator<android.util.Rational> it6 = m6123xf464f29.keySet().iterator();
                while (it6.hasNext()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e.m6125x461ff873(m6123xf464f29.get(it6.next()), m6132xb414d28, true);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(m6123xf464f29.keySet());
            java.util.Collections.sort(arrayList4, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0778x7b7add15.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(m6131xa971bfce, this.f2090x76306bfa));
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                for (android.util.Size size4 : m6123xf464f29.get((android.util.Rational) it7.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}

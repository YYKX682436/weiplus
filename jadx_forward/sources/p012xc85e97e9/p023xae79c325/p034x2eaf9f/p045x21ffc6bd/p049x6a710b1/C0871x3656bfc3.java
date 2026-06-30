package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.SizeUtil */
/* loaded from: classes13.dex */
public final class C0871x3656bfc3 {

    /* renamed from: RESOLUTION_ZERO */
    public static final android.util.Size f2130xd0d9565b = new android.util.Size(0, 0);

    /* renamed from: RESOLUTION_QVGA */
    public static final android.util.Size f2128xd0d57d72 = new android.util.Size(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 240);

    /* renamed from: RESOLUTION_VGA */
    public static final android.util.Size f2129x8adda99d = new android.util.Size(640, 480);

    /* renamed from: RESOLUTION_480P */
    public static final android.util.Size f2126xd0c7db57 = new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 480);

    /* renamed from: RESOLUTION_720P */
    public static final android.util.Size f2127xd0c921ee = new android.util.Size(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);

    /* renamed from: RESOLUTION_1080P */
    public static final android.util.Size f2124x4805c086 = new android.util.Size(1920, 1080);

    /* renamed from: RESOLUTION_1440P */
    public static final android.util.Size f2125x480782fe = new android.util.Size(1920, 1440);

    private C0871x3656bfc3() {
    }

    /* renamed from: findNearestHigherFor */
    public static <T> T m6237x835ea595(android.util.Size size, java.util.TreeMap<android.util.Size, T> treeMap) {
        java.util.Map.Entry<android.util.Size, T> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        java.util.Map.Entry<android.util.Size, T> floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    /* renamed from: getArea */
    public static int m6238xfb7d3903(int i17, int i18) {
        return i17 * i18;
    }

    /* renamed from: getMaxSize */
    public static android.util.Size m6240x701ce34f(java.util.List<android.util.Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (android.util.Size) java.util.Collections.max(list, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1());
    }

    /* renamed from: isLongerInAnyEdge */
    public static boolean m6241x3d6ef831(android.util.Size size, android.util.Size size2) {
        return size.getWidth() > size2.getWidth() || size.getHeight() > size2.getHeight();
    }

    /* renamed from: isSmallerByArea */
    public static boolean m6242xf506458e(android.util.Size size, android.util.Size size2) {
        return m6239xfb7d3903(size) < m6239xfb7d3903(size2);
    }

    /* renamed from: getArea */
    public static int m6239xfb7d3903(android.util.Size size) {
        return m6238xfb7d3903(size.getWidth(), size.getHeight());
    }
}

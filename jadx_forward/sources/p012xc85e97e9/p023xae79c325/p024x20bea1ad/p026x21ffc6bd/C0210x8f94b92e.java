package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CameraSelectionOptimizer */
/* loaded from: classes14.dex */
class C0210x8f94b92e {
    private C0210x8f94b92e() {
    }

    /* renamed from: decideSkippedCameraIdByHeuristic */
    private static java.lang.String m3310x11acbd6b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, java.lang.Integer num, java.util.List<java.lang.String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((java.lang.Integer) c0332x1ad8324a.m3757xc2a5207f("0").get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((java.lang.Integer) c0332x1ad8324a.m3757xc2a5207f("1").get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* renamed from: getSelectedAvailableCameraIds */
    public static java.util.List<java.lang.String> m3311xffdb5e7b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0132x5058c598 c0132x5058c598, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244) {
        java.lang.String str;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> asList = java.util.Arrays.asList(c0132x5058c598.mo3027xa281bd12().m3758x174bbe54());
            if (c0475xc311f244 == null) {
                java.util.Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) it.next());
                }
                return arrayList;
            }
            try {
                str = m3310x11acbd6b(c0132x5058c598.mo3027xa281bd12(), c0475xc311f244.m4282x5f62de6e(), asList);
            } catch (java.lang.IllegalStateException unused) {
                str = null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(c0132x5058c598.m3026x764d3969(str2));
                }
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> it6 = c0475xc311f244.m4280xb408cb78(arrayList2).iterator();
            while (it6.hasNext()) {
                arrayList.add(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) it6.next()).mo3161x72efd496());
            }
            return arrayList;
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0212x8dc75992.m3316x51964ec6(e17));
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0477xb32300c4 e18) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f(e18);
        }
    }
}

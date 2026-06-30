package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize */
/* loaded from: classes13.dex */
public class C0430x1ebae915 {

    /* renamed from: MINI_PREVIEW_SIZE_HUAWEI_MATE_9 */
    private static final android.util.Size f756xd8e1f9f8 = new android.util.Size(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 240);

    /* renamed from: SIZE_COMPARATOR */
    private static final java.util.Comparator<android.util.Size> f757xa2c35bd4 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0783xf2f5bab1();

    /* renamed from: mQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0398x6c784323 f758xbeac7351 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0398x6c784323) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0398x6c784323.class);

    /* renamed from: getSupportedSizes */
    public android.util.Size[] m4110x7b78e57a(android.util.Size[] sizeArr) {
        if (this.f758xbeac7351 == null || !p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0398x6c784323.m4041xdc74fca3()) {
            return sizeArr;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : sizeArr) {
            if (f757xa2c35bd4.compare(size, f756xd8e1f9f8) >= 0) {
                arrayList.add(size);
            }
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }
}

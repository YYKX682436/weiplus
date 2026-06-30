package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2CameraFactory */
/* loaded from: classes14.dex */
public final class C0132x5058c598 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205 {

    /* renamed from: DEFAULT_ALLOWED_CONCURRENT_OPEN_CAMERAS */
    private static final int f171x61332e8c = 1;
    private static final java.lang.String TAG = "Camera2CameraFactory";

    /* renamed from: mAvailableCameraIds */
    private final java.util.List<java.lang.String> f172x2be24fd7;

    /* renamed from: mCameraCoordinator */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab f173x9969adde;

    /* renamed from: mCameraInfos */
    private final java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120> f174x2390beb3 = new java.util.HashMap();

    /* renamed from: mCameraManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a f175x4030095b;

    /* renamed from: mCameraOpenRetryMaxTimeoutInMs */
    private final long f176xce38e674;

    /* renamed from: mCameraStateRegistry */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 f177x2504b71c;

    /* renamed from: mContext */
    private final android.content.Context f178xd6cfe882;

    /* renamed from: mDisplayInfoManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d f179xee58804a;

    /* renamed from: mThreadConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1 f180x579666f9;

    public C0132x5058c598(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1 abstractC0687x3f6d91d1, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, long j17) {
        this.f178xd6cfe882 = context;
        this.f180x579666f9 = abstractC0687x3f6d91d1;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a m3755x3017aa = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.m3755x3017aa(context, abstractC0687x3f6d91d1.mo5106x2b45d85());
        this.f175x4030095b = m3755x3017aa;
        this.f179xee58804a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d.m3381x9cf0d20b(context);
        this.f172x2be24fd7 = m3022x13b26c6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0210x8f94b92e.m3311xffdb5e7b(this, c0475xc311f244));
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p032xa7ffe5b7.C0436xafe7d8be c0436xafe7d8be = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p032xa7ffe5b7.C0436xafe7d8be(m3755x3017aa);
        this.f173x9969adde = c0436xafe7d8be;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 c0684x851c70a9 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9(c0436xafe7d8be, 1);
        this.f177x2504b71c = c0684x851c70a9;
        c0436xafe7d8be.mo4119x162a7075(c0684x851c70a9);
        this.f176xce38e674 = j17;
    }

    /* renamed from: getBackwardCompatibleCameraIds */
    private java.util.List<java.lang.String> m3022x13b26c6(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0209xc028bf62.m3309xa5cad5e1(this.f175x4030095b, str)) {
                arrayList.add(str);
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205
    /* renamed from: getAvailableCameraIds */
    public java.util.Set<java.lang.String> mo3023x3fef5680() {
        return new java.util.LinkedHashSet(this.f172x2be24fd7);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205
    /* renamed from: getCamera */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 mo3024x1390e61b(java.lang.String str) {
        if (this.f172x2be24fd7.contains(str)) {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852(this.f178xd6cfe882, this.f175x4030095b, str, m3026x764d3969(str), this.f173x9969adde, this.f177x2504b71c, this.f180x579666f9.mo5105x2022f80e(), this.f180x579666f9.mo5106x2b45d85(), this.f179xee58804a, this.f176xce38e674);
        }
        throw new java.lang.IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205
    /* renamed from: getCameraCoordinator */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab mo3025x4fbcae15() {
        return this.f173x9969adde;
    }

    /* renamed from: getCameraInfo */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 m3026x764d3969(java.lang.String str) {
        try {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 c0160xa6db3120 = this.f174x2390beb3.get(str);
            if (c0160xa6db3120 != null) {
                return c0160xa6db3120;
            }
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 c0160xa6db31202 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120(str, this.f175x4030095b);
            this.f174x2390beb3.put(str, c0160xa6db31202);
            return c0160xa6db31202;
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0212x8dc75992.m3316x51964ec6(e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205
    /* renamed from: getCameraManager */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a mo3027xa281bd12() {
        return this.f175x4030095b;
    }
}

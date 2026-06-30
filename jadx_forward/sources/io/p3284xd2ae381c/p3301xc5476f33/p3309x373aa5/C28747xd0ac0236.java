package io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5;

/* renamed from: io.flutter.plugin.view.SensitiveContentPlugin */
/* loaded from: classes14.dex */
public class C28747xd0ac0236 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.SensitiveContentMethodHandler {

    /* renamed from: mFlutterActivity */
    private android.app.Activity f71920xe546e31e;

    /* renamed from: mFlutterViewId */
    private final int f71921xb218d66f;

    /* renamed from: mSensitiveContentChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60 f71922xd9e31f53;

    public C28747xd0ac0236(int i17, android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60 c28669x8d394a60) {
        this.f71920xe546e31e = activity;
        this.f71921xb218d66f = i17;
        this.f71922xd9e31f53 = c28669x8d394a60;
        c28669x8d394a60.m138323x12c199a4(this);
    }

    /* renamed from: getFlutterViewNotFoundErrorReason */
    private java.lang.String m138861x59ad18d2() {
        return "FlutterView with ID " + this.f71921xb218d66f + "not found";
    }

    /* renamed from: getNotSupportedErrorReason */
    private java.lang.String m138862x7e46041b() {
        return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
    }

    /* renamed from: destroy */
    public void m138863x5cd39ffa() {
        this.f71922xd9e31f53.m138323x12c199a4(null);
        this.f71920xe546e31e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.SensitiveContentMethodHandler
    /* renamed from: getContentSensitivity */
    public int mo138324x4fe19e5c() {
        if (!mo138325x450f16a4()) {
            return 2;
        }
        android.view.View findViewById = this.f71920xe546e31e.findViewById(this.f71921xb218d66f);
        if (findViewById != null) {
            return findViewById.getContentSensitivity();
        }
        throw new java.lang.IllegalArgumentException(m138861x59ad18d2());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.SensitiveContentMethodHandler
    /* renamed from: isSupported */
    public boolean mo138325x450f16a4() {
        return android.os.Build.VERSION.SDK_INT >= 35;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.SensitiveContentMethodHandler
    /* renamed from: setContentSensitivity */
    public void mo138326xe70d2068(int i17) {
        if (!mo138325x450f16a4()) {
            throw new java.lang.IllegalStateException(m138862x7e46041b());
        }
        android.view.View findViewById = this.f71920xe546e31e.findViewById(this.f71921xb218d66f);
        if (findViewById == null) {
            throw new java.lang.IllegalArgumentException(m138861x59ad18d2());
        }
        if (findViewById.getContentSensitivity() == i17) {
            return;
        }
        findViewById.setContentSensitivity(i17);
        findViewById.invalidate();
    }
}

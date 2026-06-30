package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f127719a;

    /* renamed from: b, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f127720b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;

    /* renamed from: c, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b f127721c = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f127722d = true;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f127723e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f127724f;

    public j(java.lang.Class cls) {
        this.f127719a = cls;
    }

    public com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4 a() {
        java.lang.Class cls = this.f127719a;
        try {
            com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4 c3715xdc67e8d4 = (com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (c3715xdc67e8d4 != null) {
                c3715xdc67e8d4.mo7562xe26dab14(b());
                return c3715xdc67e8d4;
            }
            throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + cls.getCanonicalName() + ") does not match the expected return type.");
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + cls.getName() + ")", e17);
        }
    }

    public android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f127720b;
        if (enumC28568xbdfb1079 == null) {
            enumC28568xbdfb1079 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
        }
        bundle.putString("flutterview_render_mode", enumC28568xbdfb1079.name());
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b = this.f127721c;
        bundle.putString("flutterview_transparency_mode", enumC28578xae92d13b != null ? enumC28578xae92d13b.name() : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent.name());
        bundle.putBoolean("should_attach_engine_to_activity", this.f127722d);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        java.lang.String str = this.f127723e;
        if (str != null) {
            bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca, str);
        }
        bundle.putBoolean(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14350x2800fa36, false);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f127724f;
        if (c3712x3ed8a441 != null) {
            bundle.putParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, c3712x3ed8a441);
        }
        return bundle;
    }
}

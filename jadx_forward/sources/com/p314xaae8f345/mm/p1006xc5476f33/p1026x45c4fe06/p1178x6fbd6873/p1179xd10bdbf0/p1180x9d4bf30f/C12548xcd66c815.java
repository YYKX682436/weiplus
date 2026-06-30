package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.platform.window.activity.WindowAndroidActivityImpl$ActivityLifecycleMonitor */
/* loaded from: classes7.dex */
public final class C12548xcd66c815 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 f169104d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f169105e;

    public C12548xcd66c815(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var) {
        this.f169104d = r0Var;
    }

    public void a(android.content.Context context) {
        android.app.Activity activity = this.f169105e;
        if (activity != null) {
            ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).mo273xed6858b4().c(this);
        }
        android.app.Activity a17 = q75.a.a(context);
        this.f169105e = a17;
        if (a17 != null) {
            ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) a17).mo273xed6858b4().a(this);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    public void m52310xb01dfb57() {
        this.f169104d.f169186o = true;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    public void m52311x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = this.f169104d;
        r0Var.f169185n = false;
        r0Var.f169186o = false;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
    /* renamed from: onStart */
    public void m52312xb05099c3() {
        this.f169104d.f169185n = false;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onStop */
    public void m52313xc39f8281() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = this.f169104d;
        r0Var.f169185n = true;
        r0Var.f169186o = true;
    }
}

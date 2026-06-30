package dq1;

/* loaded from: classes8.dex */
public final class l implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f323884a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f323885b;

    public l(java.lang.ref.WeakReference weakUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakUI, "weakUI");
        this.f323884a = weakUI;
        this.f323885b = "MicroMsg.BizSchemeMiniProgram";
    }

    @Override // l81.e1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f323885b, "onAppBrandProcessDied");
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = (com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197) this.f323884a.get();
        if (activityC12955x181c0197 != null) {
            activityC12955x181c0197.finish();
        }
    }

    @Override // l81.e1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f323885b, "onAppBrandPreconditionError");
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = (com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197) this.f323884a.get();
        if (activityC12955x181c0197 != null) {
            activityC12955x181c0197.finish();
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f323885b, "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f323885b, "onAppBrandUIEnter");
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = (com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197) this.f323884a.get();
        if (activityC12955x181c0197 != null) {
            activityC12955x181c0197.finish();
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f323885b, "onAppBrandUIExit");
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = (com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197) this.f323884a.get();
        if (activityC12955x181c0197 != null) {
            activityC12955x181c0197.finish();
        }
    }
}

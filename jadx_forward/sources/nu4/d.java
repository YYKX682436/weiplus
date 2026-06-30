package nu4;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f421779d;

    /* renamed from: e, reason: collision with root package name */
    public transient boolean f421780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421781f;

    public d(nu4.b0 b0Var) {
        this.f421781f = b0Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f421781f.C, "onAppBackground delay pause hashCode: " + hashCode());
        this.f421780e = true;
        wu5.c cVar = this.f421779d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f421779d = null;
        this.f421779d = ((ku5.t0) ku5.t0.f394148d).k(new nu4.c(this.f421781f, this), 30000L);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        nu4.b0 b0Var = this.f421781f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.C, "jsEngine resume");
        this.f421780e = false;
        wu5.c cVar = this.f421779d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f421779d = null;
        if (b0Var.f412992w) {
            return;
        }
        b0Var.mo51549xc84dc82d();
    }
}

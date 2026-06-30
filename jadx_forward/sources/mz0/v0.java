package mz0;

/* loaded from: classes5.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(mz0.b2 b2Var) {
        super(0);
        this.f414603d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = this.f414603d;
        android.content.ComponentCallbacks2 m80379x76847179 = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        p012xc85e97e9.p093xedfae76a.y yVar = (p012xc85e97e9.p093xedfae76a.y) m80379x76847179;
        mz0.r0 r0Var = new mz0.r0(b2Var);
        android.app.Activity context = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0 c11009x358a2db0 = new com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0(yVar, r0Var, ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151322m.f326585c);
        c11009x358a2db0.f151296g = new mz0.u0(b2Var, c11009x358a2db0);
        return c11009x358a2db0;
    }
}

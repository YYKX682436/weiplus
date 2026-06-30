package mz0;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(mz0.b2 b2Var) {
        super(0);
        this.f414508d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = this.f414508d;
        p3325xe03a0797.p3326xc267989b.y0 m158345xefc66565 = b2Var.m158345xefc66565();
        android.app.Activity context = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class));
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1(m158345xefc66565, c11015x5b190a3b.D, b2Var.q7(), ((java.lang.Boolean) ((jz5.n) b2Var.f414426q).mo141623x754a37bb()).booleanValue());
        c1Var.f151409g = new mz0.h0(b2Var);
        c1Var.f151410h = b2Var.n7();
        c1Var.f151411i = new mz0.i0(b2Var);
        c1Var.f151428z = b2Var.g7();
        return c1Var;
    }
}

package mz0;

/* loaded from: classes5.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(mz0.b2 b2Var) {
        super(0);
        this.f414612d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.w1 w1Var = new mz0.w1();
        android.app.Activity context = this.f414612d.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return new dz0.k0((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class)), w1Var);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}

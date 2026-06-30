package q10;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f441036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f441037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, yz5.p pVar) {
        super(1);
        this.f441036d = z17;
        this.f441037e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String res = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "finishProfile: evaluate done, uploadUrl=".concat(res));
        ku5.u0 u0Var = ku5.t0.f394148d;
        q10.c cVar = new q10.c(this.f441036d, res, this.f441037e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(cVar, 3000L, "FinishProfile_waitClipboard");
        return jz5.f0.f384359a;
    }
}

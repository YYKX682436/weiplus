package nt3;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es0.d f421345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nt3.a0 a0Var, es0.d dVar) {
        super(2);
        this.f421344d = a0Var;
        this.f421345e = dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nt3.k $receiver = (nt3.k) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxGLInitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 18L, 1L);
        }
        nt3.a0 a0Var = this.f421344d;
        nt3.t tVar = new nt3.t(a0Var);
        nt3.u uVar = new nt3.u(a0Var);
        $receiver.f347771h = tVar;
        $receiver.f347772i = uVar;
        $receiver.f347782s = true;
        $receiver.H = a0Var.A;
        $receiver.I = new nt3.s(a0Var, this.f421345e);
        a0Var.f421267y = true;
        if (a0Var.f421268z) {
            a0Var.b();
        }
        return jz5.f0.f384359a;
    }
}

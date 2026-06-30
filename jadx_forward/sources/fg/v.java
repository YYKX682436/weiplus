package fg;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.g f343345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fg.b0 b0Var, fg.g gVar) {
        super(1);
        this.f343344d = b0Var;
        this.f343345e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fg.b0 b0Var = this.f343344d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f343257a, "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(b0Var.f343272p));
        b0Var.a(false, this.f343345e);
        sf.c cVar = sf.c.f488472a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(0, 0, b0Var.f343268l, new fg.u(b0Var)));
        return jz5.f0.f384359a;
    }
}

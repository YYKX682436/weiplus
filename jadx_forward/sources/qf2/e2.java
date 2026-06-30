package qf2;

/* loaded from: classes10.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(qf2.c3 c3Var, yz5.l lVar) {
        super(1);
        this.f443881d = c3Var;
        this.f443882e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorCancelVisitorBattle, result: ");
        sb6.append(booleanValue);
        sb6.append(", curBattle: ");
        qf2.c3 c3Var = this.f443881d;
        sb6.append(((mm2.o4) c3Var.m56788xbba4bfc0(mm2.o4.class)).Z);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", sb6.toString());
        if (booleanValue) {
            c3Var.f443845n = true;
            qf2.c3.b7(c3Var, "AnchorExit");
            db5.t7.h(c3Var.O6(), c3Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqq));
        }
        yz5.l lVar = this.f443882e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f384359a;
    }
}

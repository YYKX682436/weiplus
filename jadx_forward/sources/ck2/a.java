package ck2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck2.o f123938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ck2.o oVar) {
        super(1);
        this.f123938d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        mm2.o6 o6Var;
        p3325xe03a0797.p3326xc267989b.f1 f1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ck2.o oVar = this.f123938d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f123966m, "checkShowLotteryResult notify close: " + booleanValue);
        if (booleanValue && (o6Var = oVar.f123973t) != null && (f1Var = o6Var.f410873d) != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        }
        return jz5.f0.f384359a;
    }
}

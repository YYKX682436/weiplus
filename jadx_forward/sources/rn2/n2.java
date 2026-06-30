package rn2;

/* loaded from: classes3.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(rn2.t2 t2Var) {
        super(2);
        this.f479338d = t2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rn2.f fVar;
        rn2.b bVar = (rn2.b) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        rn2.t2 t2Var = this.f479338d;
        if (bVar != null && (fVar = t2Var.f479387f) != null) {
            ((rn2.c1) fVar).B(bVar.f479179c);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = t2Var.M;
        if (z2Var != null) {
            z2Var.B();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateViewCallback", "choosePrizeSource " + bVar + ", pos:" + intValue);
        return jz5.f0.f384359a;
    }
}

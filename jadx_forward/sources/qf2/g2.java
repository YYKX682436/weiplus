package qf2;

/* loaded from: classes3.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f443918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(qf2.c3 c3Var, dk2.u4 u4Var, yz5.l lVar) {
        super(1);
        this.f443917d = c3Var;
        this.f443918e = u4Var;
        this.f443919f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorFinishVisitorBattle, result: " + booleanValue + ", curBattle: " + ((mm2.o4) this.f443917d.m56788xbba4bfc0(mm2.o4.class)).Z + ' ');
        if (booleanValue) {
            this.f443918e.f315689c = 0;
        }
        yz5.l lVar = this.f443919f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f384359a;
    }
}

package rn2;

/* loaded from: classes3.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(rn2.t2 t2Var) {
        super(2);
        this.f479300d = t2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rn2.b bVar = (rn2.b) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        rn2.t2 t2Var = this.f479300d;
        if (bVar != null) {
            rn2.f fVar = t2Var.f479387f;
            if (fVar != null) {
                ((rn2.c1) fVar).A(bVar);
            }
            t2Var.q(bVar);
            int i17 = bVar.f479179c;
            if (i17 == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409127g, "");
            } else if (i17 == 2) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409129i, "");
            } else if (i17 == 3) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409128h, "");
            } else if (i17 == 5) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409137t, "");
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = t2Var.K;
        if (z2Var != null) {
            z2Var.B();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateViewCallback", "chooserLotteryType " + bVar + ", pos:" + intValue);
        return jz5.f0.f384359a;
    }
}

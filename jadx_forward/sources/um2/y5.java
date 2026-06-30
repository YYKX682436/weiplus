package um2;

/* loaded from: classes3.dex */
public final class y5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.b6 f510634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(um2.b6 b6Var) {
        super(1);
        this.f510634d = b6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        um2.b6 b6Var = this.f510634d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b6Var.f510264f, "checkEnterTargetLiveRoom result:" + c19792x256d2725);
        if (c19792x256d2725 == null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).oj(5, java.lang.String.valueOf(((mm2.e1) b6Var.c(mm2.e1.class)).f410516m), java.lang.String.valueOf(((mm2.e1) b6Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        } else {
            pm0.v.X(new um2.z5(b6Var, c19792x256d2725));
        }
        return jz5.f0.f384359a;
    }
}

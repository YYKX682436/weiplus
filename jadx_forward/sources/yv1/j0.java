package yv1;

/* loaded from: classes12.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yv1.j0 f547625d = new yv1.j0();

    public j0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.clean.CleanService$Companion$exptChangeEventListener$2$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "ExptChangeEvent callback");
                yv1.b1 b1Var = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
                b1Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "tryCreateSecondIndex");
                ((ku5.t0) ku5.t0.f394148d).h(new yv1.z0(b1Var), "MicroMsg.CleanService");
                yv1.b1 b1Var2 = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
                b1Var2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "tryCreateThirdIndex");
                ((ku5.t0) ku5.t0.f394148d).h(new yv1.a1(b1Var2), "MicroMsg.CleanService");
                return false;
            }
        };
    }
}

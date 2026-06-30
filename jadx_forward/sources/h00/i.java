package h00;

/* loaded from: classes8.dex */
public final class i implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_ECS_STRATEGY;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        try {
            if (resp.f114305g != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdStrategy", "[Ecs_EcInit] EcsInitCmdBrandEcsStrategyHandler error: " + resp.f114305g + ", " + resp.b());
                return;
            }
            if (resp.c() != null) {
                r45.oh0 oh0Var = new r45.oh0();
                oh0Var.mo11468x92b714fd(resp.c().g());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdStrategy", "handleResp ok");
                ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ni(2047, oh0Var, "EcsInitCmdStrategy");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f113916d = 2;
        boolean[] zArr = r20Var.f113918f;
        zArr[1] = true;
        r45.nh0 nh0Var = new r45.nh0();
        nh0Var.f462929d = 2047;
        r20Var.f113917e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(nh0Var.mo14344x5f01b1f6());
        zArr[2] = true;
        return r20Var;
    }
}

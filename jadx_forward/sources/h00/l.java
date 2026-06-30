package h00;

/* loaded from: classes8.dex */
public final class l implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_PRESENT_ENTRANCE_INFO;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (resp.f114305g != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdPresentEntranceInfoHandler", "[Ecs_EcInit] EcsInitCmdPresentEntranceInfoHandler error: " + resp.f114305g + ", " + resp.b());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResp respBuffer is null?? ");
        sb6.append(resp.c() == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdPresentEntranceInfoHandler", sb6.toString());
        if (resp.c() != null) {
            try {
                c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
                bw5.t8 t8Var = new bw5.t8();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g c17 = resp.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                bw5.t8 mo11468x92b714fd = t8Var.mo11468x92b714fd(c17.g());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsPresentEntrance");
                ((j00.d2) m3Var).getClass();
                n00.g gVar = n00.g.f415354a;
                gVar.getClass();
                n00.g.f415356c.c(gVar, n00.g.f415355b[0], mo11468x92b714fd);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f113916d = 3;
        r20Var.f113918f[1] = true;
        return r20Var;
    }
}

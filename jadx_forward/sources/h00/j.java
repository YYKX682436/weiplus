package h00;

/* loaded from: classes8.dex */
public final class j implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_CARD_HOLDER_ENTRANCE_INFO;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        try {
            if (resp.f114305g != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdCardHolderEntranceInfo", "[Ecs_EcInit] EcsInitCmdCardHolderEntranceInfoHandler error: " + resp.f114305g + ", " + resp.b());
                return;
            }
            if (resp.c() != null) {
                bw5.c6 c6Var = new bw5.c6();
                c6Var.mo11468x92b714fd(resp.c().g());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdCardHolderEntranceInfo", "handleResp show_type:" + c6Var.f107470d + " title_type:" + c6Var.f107474h);
                h00.a aVar = h00.a.f359341a;
                aVar.getClass();
                h00.a.f359343c.c(aVar, h00.a.f359342b[0], c6Var);
                c00.x3 x3Var = (c00.x3) i95.n0.c(c00.x3.class);
                if (x3Var != null) {
                    g20.g gVar = (g20.g) x3Var;
                    if (gVar.f349309g != null) {
                        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar.f349307e).mo141623x754a37bb()).mo50293x3498a0(new g20.b(gVar));
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f113916d = 1;
        r20Var.f113918f[1] = true;
        return r20Var;
    }
}

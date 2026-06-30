package h00;

/* loaded from: classes8.dex */
public final class k implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_ECS_CONFIG;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (resp.f114305g != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdGetEcsConfigHandler", "[Ecs_EcInit] EcsInitCmdGetEcsConfigHandler error: " + resp.f114305g + ", " + resp.b());
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g c17 = resp.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResp respBuffer is null?? ");
        sb6.append(c17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdGetEcsConfigHandler", sb6.toString());
        if (c17 != null) {
            try {
                bw5.i6 mo11468x92b714fd = new bw5.i6().mo11468x92b714fd(c17.g());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsConfig");
                boolean[] zArr = mo11468x92b714fd.f110011i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsInitCmdGetEcsConfigHandler", "handleResp ok");
                ((h00.b) ((c00.a3) i95.n0.c(c00.a3.class))).wi(mo11468x92b714fd);
                sq.e eVar = (sq.e) i95.n0.c(sq.e.class);
                if (eVar != null) {
                    if (zArr[3]) {
                        long j17 = mo11468x92b714fd.f110008f;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsUserStateMgrService", "updateJsApiKvLimitedSize: " + j17);
                        int i17 = y02.g1.f540138d;
                        y02.e1 e1Var = (y02.e1) p3380x6a61f93.p3387xf51c6630.C30638x21ba7336.m170455x21b0d463();
                        if (e1Var != null) {
                            p3380x6a61f93.p3387xf51c6630.C30638x21ba7336.m170464x21b9b5cc(((y02.g1) e1Var).m105978x2737f10(), j17);
                        }
                    }
                    if (zArr[4]) {
                        java.util.LinkedList linkedList = mo11468x92b714fd.f110009g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getSamplingPolicies(...)");
                        ((t20.l) eVar).wi(linkedList);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f113916d = 4;
        r20Var.f113918f[1] = true;
        return r20Var;
    }
}

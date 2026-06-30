package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes.dex */
public final class ub extends com.tencent.mm.plugin.appbrand.launching.hb {
    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        if (!com.tencent.mm.wexnet.b0.f214356d) {
            com.tencent.mm.wexnet.x xVar = com.tencent.mm.wexnet.y.f214380a;
            int i17 = com.tencent.mm.sdk.platformtools.z.f193115k ? 109 : 108;
            java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(i17, 1);
            java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(i17, 1);
            int Di = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Di(i17, 1);
            java.lang.String str = Bi == null ? "" : Bi;
            if (Ni == null) {
                Ni = "";
            }
            com.tencent.mm.wexnet.p pVar = com.tencent.mm.wexnet.p.f214371e;
            if (!str.equals("")) {
                ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.wexnet.a0(str, Ni, Di, i17, 1, pVar), "XNetLibResHelper#processXnetSoResourceUpdate");
            }
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckXNetSo";
    }
}

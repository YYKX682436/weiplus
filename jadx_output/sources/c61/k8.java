package c61;

@j95.b
/* loaded from: classes8.dex */
public final class k8 extends i95.w implements zy2.y9 {
    public void wi(com.tencent.mm.protobuf.g gVar, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        i95.m c17 = i95.n0.c(c61.t8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.t8 t8Var = (c61.t8) c17;
        byte[] bArr = gVar != null ? gVar.f192156a : null;
        java.lang.String str = t8Var.f39304d;
        if (bArr == null) {
            c61.t8.mj(gVar);
            com.tencent.mars.xlog.Log.i(str, "[revokeRedDot] dataString = " + gVar + ", dataBytes is null, fall back");
            return;
        }
        r45.ct2 ct2Var = new r45.ct2();
        ct2Var.fromProtobuf(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        sb6.append(pm0.v.u(ct2Var.getLong(0)));
        sb6.append('_');
        sb6.append(ct2Var.getInteger(1));
        java.lang.String revokeId = sb6.toString();
        i95.m c18 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.extension.reddot.x2 x2Var = (com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) c18)).nk();
        kotlin.jvm.internal.o.g(revokeId, "revokeId");
        com.tencent.mm.plugin.finder.extension.reddot.jb c19 = x2Var.c(revokeId);
        if (c19 == null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[revokeByRevokeId] revokeId: " + revokeId + " not found, source=" + source);
            x2Var.c1().put(revokeId, revokeId);
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).vj(0, "", revokeId, 0);
        } else {
            x2Var.F(c19.field_ctrInfo, source);
            boolean L = x2Var.L(c19);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[revokeByRevokeId] ret=" + L + " revokeId=" + revokeId + " removeRedDot=" + c19 + ", source=" + source);
            if (L) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                int type = c19.getType();
                java.lang.String str2 = c19.field_tipsId;
                o3Var.vj(type, str2 != null ? str2 : "", revokeId, 1);
                x2Var.Z0().d(source, c19);
            } else {
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                int type2 = c19.getType();
                java.lang.String str3 = c19.field_tipsId;
                o3Var2.vj(type2, str3 != null ? str3 : "", revokeId, 0);
            }
            z17 = L;
        }
        c61.t8.mj(gVar);
        com.tencent.mars.xlog.Log.i(str, "[revokeRedDot] revoke success:" + z17);
    }
}

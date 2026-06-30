package az2;

/* loaded from: classes2.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final r45.xw a(com.tencent.mm.modelbase.f fVar) {
        com.tencent.mm.network.v0 reqResp;
        o45.ah respObj;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        com.tencent.mm.modelbase.m1 m1Var = fVar.f70619e;
        if (m1Var == null || (reqResp = m1Var.getReqResp()) == null || (respObj = reqResp.getRespObj()) == null) {
            return null;
        }
        return respObj.getProfile();
    }

    public final long b(int i17) {
        java.lang.Long l17 = (java.lang.Long) az2.j.f16134s.get(i17);
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }
}

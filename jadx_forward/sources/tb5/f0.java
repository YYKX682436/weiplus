package tb5;

/* loaded from: classes5.dex */
public abstract class f0 {
    public static final java.util.Map a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        v05.b k17;
        int m75939xb282bd08;
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0() & 65535;
        if (mo78013xfb85f7b0 == 49) {
            try {
                l15.c cVar = new l15.c();
                java.lang.String U1 = f9Var.U1();
                if (U1 == null) {
                    U1 = "";
                }
                cVar.m126731xdc93280d(U1, true);
                k17 = cVar.k();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsgLogicFeatureService", e17, "toSimpleMsgInfo type:%s content:%s", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), f9Var.j());
            }
            if (k17 != null) {
                m75939xb282bd08 = k17.m75939xb282bd08(k17.f449898d + 6);
                jz5.l lVar = new jz5.l("msgid", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                jz5.l lVar2 = new jz5.l("svrid", java.lang.Long.valueOf(f9Var.I0()));
                jz5.l lVar3 = new jz5.l("talker", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var.Q0()));
                jz5.l lVar4 = new jz5.l("isAppMsg", java.lang.Boolean.valueOf(f9Var.k2()));
                jz5.l lVar5 = new jz5.l("type", java.lang.Integer.valueOf(mo78013xfb85f7b0));
                jz5.l lVar6 = new jz5.l("appmsgtype", java.lang.Integer.valueOf(m75939xb282bd08));
                jz5.l lVar7 = new jz5.l("createtime", java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
                java.lang.String G1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var.j());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G1, "secPrint(...)");
                return kz5.c1.l(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, new jz5.l("content", r26.i0.t(G1, ",", ";", false)));
            }
        }
        m75939xb282bd08 = 0;
        jz5.l lVar8 = new jz5.l("msgid", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        jz5.l lVar22 = new jz5.l("svrid", java.lang.Long.valueOf(f9Var.I0()));
        jz5.l lVar32 = new jz5.l("talker", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var.Q0()));
        jz5.l lVar42 = new jz5.l("isAppMsg", java.lang.Boolean.valueOf(f9Var.k2()));
        jz5.l lVar52 = new jz5.l("type", java.lang.Integer.valueOf(mo78013xfb85f7b0));
        jz5.l lVar62 = new jz5.l("appmsgtype", java.lang.Integer.valueOf(m75939xb282bd08));
        jz5.l lVar72 = new jz5.l("createtime", java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
        java.lang.String G12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var.j());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G12, "secPrint(...)");
        return kz5.c1.l(lVar8, lVar22, lVar32, lVar42, lVar52, lVar62, lVar72, new jz5.l("content", r26.i0.t(G12, ",", ";", false)));
    }

    public static final java.util.Map b(java.util.Map map) {
        java.util.List F0 = kz5.n0.F0(map.entrySet(), new tb5.e0());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int size = F0.size() - 1;
        int i17 = 0;
        while (i17 < size) {
            java.util.Map.Entry entry = (java.util.Map.Entry) F0.get(i17);
            i17++;
            linkedHashMap.put(entry.getKey(), java.lang.Long.valueOf(((java.lang.Number) ((java.util.Map.Entry) F0.get(i17)).getValue()).longValue() - ((java.lang.Number) entry.getValue()).longValue()));
        }
        return linkedHashMap;
    }
}

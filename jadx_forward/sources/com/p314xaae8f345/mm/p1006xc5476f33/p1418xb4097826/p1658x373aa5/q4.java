package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class q4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214404a;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        this.f214404a = c15260x406bbe1b;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map map;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        r45.ey0 ey0Var;
        ey2.u uVar = this.f214404a.f212447r;
        if (uVar == null) {
            return null;
        }
        r45.en2 m76811x50f46773 = uVar.f339058d.getFeedObject().m59240x7c94657b().m76811x50f46773();
        java.lang.Integer valueOf = (m76811x50f46773 == null || (ey0Var = (r45.ey0) m76811x50f46773.m75936x14adae67(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var.m75939xb282bd08(0));
        java.lang.String str2 = valueOf + '-' + pm0.v.u(uVar.f339071t);
        jz5.l lVar = (jz5.l) uVar.f339075x.mo3195x754a37bb();
        if (lVar != null && (c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d) != null) {
            java.lang.Object obj = c13920xa5f564aa.get(uVar.f339069r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 != null) {
                jz5.l[] lVarArr = new jz5.l[10];
                r45.qt2 qt2Var = uVar.f339060f;
                java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(2);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                lVarArr[0] = new jz5.l("finder_tab_context_id", m75945x2fec8307);
                java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(1);
                lVarArr[1] = new jz5.l("finder_context_id", m75945x2fec83072 != null ? m75945x2fec83072 : "");
                lVarArr[2] = new jz5.l("comment_scene", java.lang.String.valueOf(qt2Var.m75939xb282bd08(5)));
                lVarArr[3] = new jz5.l("session_buffer", abstractC14490x69736cb5.g0());
                lVarArr[4] = new jz5.l("feed_columnid", java.lang.String.valueOf(valueOf));
                lVarArr[5] = new jz5.l("column_exp_index", java.lang.Integer.valueOf(uVar.f339074w + 1));
                lVarArr[6] = new jz5.l("column_trace_id", str2);
                lVarArr[7] = new jz5.l("exp_feedid", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                lVarArr[8] = new jz5.l("from_comment_scene", java.lang.Integer.valueOf(uVar.f339072u));
                lVarArr[9] = new jz5.l("to_comment_scene", java.lang.Integer.valueOf(uVar.f339073v));
                map = kz5.c1.k(lVarArr);
                return map;
            }
        }
        map = kz5.q0.f395534d;
        return map;
    }
}

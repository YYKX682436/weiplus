package mc1;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72828x366c91de = 1033;

    /* renamed from: NAME */
    public static final java.lang.String f72829x24728b = "shareGameLive";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        int optInt = jSONObject.optInt("type", 0);
        if (optInt == 1) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            java.lang.String appId = c0Var.mo48798x74292566();
            int i18 = c0Var.t3().u0().f158814g;
            android.content.Context context = c0Var.getF229340d();
            mc1.j jVar = new mc1.j(this, c0Var, i17);
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            v0Var.f360824m = jVar;
            if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i18).booleanValue()) {
                h63.v[] vVarArr = h63.v.f360817d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f(appId, 0, 3, 0, null, null, 0, 0L, 250, null);
                h63.n0 n0Var = h63.n0.f360798a;
                java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c16049x1ab5a75f, n0Var, null);
                return;
            }
            return;
        }
        if (optInt != 2) {
            c0Var.a(i17, o("fail:unknown type,invalid input"));
            return;
        }
        h63.r1 r1Var2 = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId2 = c0Var.mo48798x74292566();
        int i19 = c0Var.t3().u0().f158814g;
        android.content.Context context2 = c0Var.getF229340d();
        ((h63.v0) r1Var2).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId2, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId2, i19).booleanValue()) {
            h63.v[] vVarArr2 = h63.v.f360817d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f(appId2, 0, 2, 0, null, null, 0, 0L, 250, null);
            h63.o0 o0Var = h63.o0.f360799a;
            java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c16049x1ab5a75f2, o0Var, null);
        }
        c0Var.a(i17, o("ok"));
    }
}

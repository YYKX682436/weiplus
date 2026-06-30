package mc1;

/* loaded from: classes7.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72832x366c91de = 1029;

    /* renamed from: NAME */
    public static final java.lang.String f72833x24728b = "startGameLive";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        ce.g gVar = (ce.g) c0Var.V0().B1(ce.g.class);
        if (gVar != null) {
            ((ce.o) gVar).V(true, false, new de.c());
        }
        java.lang.String path = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        java.lang.String reportInfo = jSONObject.optString("reportInfo", "");
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId = c0Var.mo48798x74292566();
        int i18 = c0Var.t3().u0().f158814g;
        android.content.Context f229340d = c0Var.getF229340d();
        int i19 = ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f360825n;
        long j17 = ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f360826o;
        ((h63.v0) r1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        h63.v[] vVarArr = h63.v.f360817d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f(appId, i18, 0, 0, path, reportInfo, i19, j17, 8, null);
        h63.p0 p0Var = new h63.p0(f229340d);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c16049x1ab5a75f, p0Var, null);
        c0Var.a(i17, o("ok"));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

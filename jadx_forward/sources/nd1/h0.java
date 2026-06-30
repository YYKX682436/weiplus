package nd1;

/* loaded from: classes7.dex */
public final class h0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f72933x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f72934x24728b = "initReadyForPrerender";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke appId:");
        sb6.append(v5Var != null ? v5Var.mo48798x74292566() : null);
        sb6.append(" webviewId:");
        sb6.append(v5Var != null ? v5Var.mo50260x9f1221c2() : 0);
        sb6.append(", url:");
        sb6.append(v5Var != null ? v5Var.X1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiPageInitReadyForPreRender", sb6.toString());
        java.lang.String o17 = o("ok");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "makeReturnJson(...)");
        return o17;
    }
}

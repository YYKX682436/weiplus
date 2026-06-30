package ib3;

/* loaded from: classes5.dex */
public final class u implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("f2fhbdistribute", str)) {
            r45.j4 j4Var = p0Var != null ? p0Var.f152259a : null;
            java.lang.String g17 = x51.j1.g(j4Var != null ? j4Var.f459094h : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceToFaceNewXmlMsgListener", "Full XML content: " + g17);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("sysmsg", g17);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k("wxalite041d1599beb6eb0d45167bc1e9ec7ebe@pay", "pay.facetoface.sysmsg", jSONObject);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceToFaceNewXmlMsgListener", e17.toString());
            }
        }
    }
}

package z43;

/* loaded from: classes5.dex */
public final class o0 implements m33.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551659a;

    public o0(java.lang.String str) {
        this.f551659a = str;
    }

    @Override // m33.w0
    public void a(org.json.JSONObject jSONObject) {
        m33.x0.f404877a.f404878a.remove(this.f551659a);
        if (jSONObject != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("showInputToolView", "onFinish result = " + jSONObject);
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("GCInputDidCommit", jSONObject);
            }
        }
    }

    @Override // m33.w0
    public void b(m33.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("showInputToolView", "GameInputStateChange onChanged state = " + u0Var);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("gamecenter_identifier", this.f551659a);
            jSONObject.put("isShow", u0Var.f404873d);
            jSONObject.put("inputHeight", u0Var.f404872c);
            jSONObject.put("inputTop", u0Var.f404871b);
            jSONObject.put("contentText", u0Var.f404870a);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("GCInputStateChange", jSONObject);
        }
    }
}

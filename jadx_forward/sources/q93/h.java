package q93;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f442456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1802xadb2a389.p1803x48fb3bf9.C16199x7a4c133e f442457f;

    public h(int i17, bw5.lp0 lp0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1802xadb2a389.p1803x48fb3bf9.C16199x7a4c133e c16199x7a4c133e) {
        this.f442455d = i17;
        this.f442456e = lp0Var;
        this.f442457f = c16199x7a4c133e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f442455d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSetTingAudioStateApi", "backgroundAudioListener callback event:%s", java.lang.Integer.valueOf(i17));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
            jSONObject.put("currentTime", z8Var.Di() / 1000);
            jSONObject.put("err_code", i17 == 12 ? -1 : 0);
            jSONObject.put("status", rk4.m.f478367a.a(z8Var.Ri()));
            bw5.lp0 lp0Var = this.f442456e;
            if (lp0Var != null) {
                java.lang.String e17 = lp0Var.d().e();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (e17 == null) {
                    e17 = "";
                }
                jSONObject.put("categoryId", e17);
                int Ai = z8Var.Ai() / 1000;
                jSONObject.put("duration", Ai);
                jSONObject.put("item", z8Var.Ui(lp0Var, Ai));
                jm4.g3 g3Var = zk4.l.f555073c;
                jSONObject.put("buffered", ((g3Var != null ? (int) ((jm4.h3) g3Var).s() : 0) * Ai) / 100);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSetTingAudioStateApi", "onTingAudioStateChanged param=%s", jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(this.f442457f.f225011g, "onTingAudioStateChanged", jSONObject);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppSetTingAudioStateApi", "onPlayerEvent ex " + e18.getMessage());
        }
    }
}

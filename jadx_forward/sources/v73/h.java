package v73;

/* loaded from: classes9.dex */
public class h implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f515226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 f515227e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344, int i17) {
        this.f515227e = activityC16099xbf243344;
        this.f515226d = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = this.f515227e;
        java.lang.String str = activityC16099xbf243344.f223793d;
        java.lang.String str2 = activityC16099xbf243344.f223793d;
        intent.toString();
        if (i17 == this.f515226d && i18 == -1 && intent.getExtras() != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(intent.getExtras().getString("card"));
                r45.n75 n75Var = new r45.n75();
                n75Var.f462667d = jSONObject.optString("bank_name");
                n75Var.f462669f = jSONObject.optString("bank_type");
                n75Var.f462670g = jSONObject.optString("bind_serial");
                n75Var.f462671h = jSONObject.optString("bind_tail");
                n75Var.f462668e = activityC16099xbf243344.H.f462668e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n75Var.f462670g)) {
                    activityC16099xbf243344.G = activityC16099xbf243344.W6(n75Var.f462670g);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC16099xbf243344.G;
                if (c19091x9511676c != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69233x225aa2b6)) {
                    n75Var.f462667d = activityC16099xbf243344.G.f69233x225aa2b6;
                }
                activityC16099xbf243344.I = activityC16099xbf243344.H;
                activityC16099xbf243344.H = n75Var;
                activityC16099xbf243344.Y6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "do modify pay way");
                r73.j jVar = new r73.j(activityC16099xbf243344.H, activityC16099xbf243344.M, activityC16099xbf243344.L);
                jVar.K(activityC16099xbf243344);
                activityC16099xbf243344.m83099x5406100e(jVar, false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e17, "", new java.lang.Object[0]);
            }
        }
    }
}

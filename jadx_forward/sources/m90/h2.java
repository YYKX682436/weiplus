package m90;

/* loaded from: classes4.dex */
public class h2 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        sg3.r rVar = (sg3.r) i95.n0.c(sg3.r.class);
        rVar.getClass();
        try {
            if (z65.c.a()) {
                db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, java.lang.String.format("just debug errType %s errCode %s errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str), 1).show();
            }
            if (m1Var.mo808xfb85f7b0() == 853) {
                android.app.ProgressDialog progressDialog = rVar.f489522m;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    rVar.f489522m = null;
                }
                if (m1Var.equals(rVar.f489523n)) {
                    ab0.x xVar = (ab0.x) m1Var;
                    if (i18 == 0) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_contact_prefs", 0).edit().putBoolean(rVar.cj(((l41.h0) xVar).f397356f, ((l41.h0) xVar).f397358h), true).commit();
                        rVar.mj(((l41.h0) xVar).f397356f);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PluginMessenger", "onSceneEnd VerifyOpenIMContact errCode: " + i18 + " errType: " + i17 + " userName: " + ((l41.h0) xVar).f397356f + " ticket: " + ((l41.h0) xVar).f397357g + " talkerUsername: " + ((l41.h0) xVar).f397358h);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginMessenger", "onSceneEnd " + th6);
        }
    }
}

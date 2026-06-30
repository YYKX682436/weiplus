package le1;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72784x366c91de = 581;

    /* renamed from: NAME */
    private static final java.lang.String f72785x24728b = "hideVirtualBottomNavigationBar";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        C(lVar, i17);
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new le1.d(this, lVar, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiHideVirtualBottomNavigationBar", "hide");
        android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiHideVirtualBottomNavigationBar", "null == activity");
        } else {
            android.view.Window window = a17.getWindow();
            if (window == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiHideVirtualBottomNavigationBar", "null == window");
            } else {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility() | 512 | 2 | 4096 | 256;
                window.getDecorView().setSystemUiVisibility(systemUiVisibility);
                window.getDecorView().setOnSystemUiVisibilityChangeListener(new le1.e(this, window, systemUiVisibility));
            }
        }
        lVar.a(i17, o("ok"));
    }
}

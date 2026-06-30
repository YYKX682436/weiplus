package dy4;

/* loaded from: classes15.dex */
public final class h0 implements ye1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326196a;

    public h0(dy4.f1 f1Var) {
        this.f326196a = f1Var;
    }

    public final void a(java.lang.String str) {
        dy4.w wVar = this.f326196a.U;
        if (wVar != null) {
            java.lang.String str2 = wVar.f326248a;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[TRACE_ADAPTIVE] onVideoDownStreamChange selectIndex = ".concat(str == null ? "null" : str));
                org.json.JSONObject c17 = wVar.c();
                if (str == null) {
                    str = "";
                }
                c17.put("selectIndex", str);
                wVar.a("onVideoDownStreamChange", c17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "onVideoDownStreamChange fail", e17);
            }
        }
    }
}

package k23;

/* loaded from: classes12.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.c f385050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k23.c cVar) {
        super(0);
        this.f385050d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        boolean z17 = true;
        java.lang.String j17 = j62.e.g().j("clicfg_fts_search_whole_page_hint_wording_android", "", true, true);
        k23.c cVar = this.f385050d;
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(cVar.f385066a);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            str = pv4.a.d(jSONObject, f17);
            if (str == null) {
                str = pv4.a.d(jSONObject, "en");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FTSFloatingRecognizingPanelHintHandler", e17, "parse expt failed", new java.lang.Object[0]);
            str = null;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = (java.lang.String) ((jz5.n) cVar.f385067b).mo141623x754a37bb();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSFloatingRecognizingPanelHintHandler", "getHint: " + str + " (expt: " + j17 + ", language: " + f17 + ')');
        return str;
    }
}

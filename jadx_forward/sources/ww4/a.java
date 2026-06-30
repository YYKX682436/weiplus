package ww4;

/* loaded from: classes8.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww4.b f531921d;

    public a(ww4.b bVar) {
        this.f531921d = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "user click search!");
        ww4.b bVar = this.f531921d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = bVar.f531922a;
        boolean j17 = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2.j();
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = bVar.f531923b;
        j2Var.f494476f = true;
        j2Var.f494473c = 0;
        j2Var.f494472b = j17 ? 135 : 137;
        j2Var.A = true;
        j2Var.f494478h = true;
        j2Var.f494481k = true;
        j2Var.I = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("url", viewOnCreateContextMenuListenerC19337x37f3384d.x7());
        jSONArray.put(jSONObject2);
        jSONObject.put("doc_list", jSONArray);
        j2Var.f494470J = jSONObject.toString();
        java.lang.String encode = java.net.URLEncoder.encode(viewOnCreateContextMenuListenerC19337x37f3384d.x7(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u5.b(encode, 10, viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082().toString(), viewOnCreateContextMenuListenerC19337x37f3384d.f265351g);
        str = "";
        if (j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd w76 = viewOnCreateContextMenuListenerC19337x37f3384d.w7();
            java.util.Map extParams = j2Var.f494477g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams, "extParams");
            java.lang.String str2 = w76 != null ? w76.f266404a : null;
            if (str2 == null) {
                str2 = "";
            }
            extParams.put("userName", str2);
            cl0.g gVar = new cl0.g();
            java.lang.String str3 = w76 != null ? w76.f266404a : null;
            if (str3 == null) {
                str3 = "";
            }
            gVar.h("bizUserName", str3);
            java.lang.String str4 = w76 != null ? w76.f266405b : null;
            if (str4 == null) {
                str4 = "";
            }
            gVar.h("bizNickName", str4);
            gVar.h("pageUrl", encode);
            java.lang.CharSequence m78518x4c0ad082 = viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082();
            if (m78518x4c0ad082 == null) {
                m78518x4c0ad082 = "";
            }
            gVar.h("page_title", m78518x4c0ad082);
            j2Var.K = gVar.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Mp, userName = ");
            java.lang.String str5 = w76 != null ? w76.f266404a : null;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(", bizUserName = ");
            java.lang.String str6 = w76 != null ? w76.f266404a : null;
            if (str6 == null) {
                str6 = "";
            }
            sb6.append(str6);
            sb6.append(", bizNickName = ");
            java.lang.String str7 = w76 != null ? w76.f266405b : null;
            sb6.append(str7 != null ? str7 : "");
            sb6.append(", pageUrl = ");
            sb6.append(encode);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", sb6.toString());
        } else {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("pageUrl", encode);
            java.lang.CharSequence m78518x4c0ad0822 = viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082();
            java.lang.CharSequence charSequence = str;
            if (m78518x4c0ad0822 != null) {
                charSequence = m78518x4c0ad0822;
            }
            gVar2.h("page_title", charSequence);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "not Mp, pageTitle = " + ((java.lang.Object) viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082()) + ", pageUrl = " + encode);
            j2Var.K = gVar2.toString();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        return false;
    }
}

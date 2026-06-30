package pu4;

/* loaded from: classes12.dex */
public class k extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pu4.l f439979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pu4.l lVar) {
        super(lVar);
        this.f439979b = lVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        pu4.j jVar = (pu4.j) eVar;
        pu4.l lVar = (pu4.l) gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(jVar.f439978d, this.f439979b.f505294d);
        jVar.f439975a.setTextSize(2, 17.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(lVar.f439981r, jVar.f439975a);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.c(lVar.f439983t, jVar.f439977c, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9) * i65.a.m(context));
        jVar.f439976b.setTextSize(2, 14.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(lVar.f439982s, jVar.f439976b);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570647ef5, viewGroup, false);
        pu4.j jVar = this.f439979b.f439987x;
        jVar.f439975a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        jVar.f439976b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        jVar.f439977c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        jVar.f439978d = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        inflate.setTag(jVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        java.lang.String str;
        java.lang.String str2;
        pu4.l lVar = (pu4.l) gVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        p13.y yVar = lVar.f439980q;
        objArr2[0] = yVar != null ? yVar.f432720e : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAIHistoryChatDataItem", "onItemClick: chatId=%s", objArr2);
        try {
            p13.y yVar2 = lVar.f439980q;
            java.lang.String str3 = "";
            if (yVar2 == null || (str = yVar2.f432723h) == null) {
                str = "";
            }
            if (yVar2 != null && (str2 = yVar2.f432720e) != null) {
                str3 = str2;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("localSearchSid", str3);
            jSONObject.put("titleHighlightKeywords", new org.json.JSONArray((java.util.Collection) lVar.f439984u));
            jSONObject.put("detailHighlightKeywords", new org.json.JSONArray((java.util.Collection) lVar.f439985v));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("ftsSearchId", o13.p.f423784d);
            jSONObject2.put("pageType", lVar.f505296f);
            jSONObject2.put("boxIndex", lVar.f505299i);
            jSONObject2.put("docIndex", lVar.f505300j);
            jSONObject.put("parentSidExtInfo", jSONObject2);
            su4.j2 j2Var = new su4.j2();
            j2Var.f494471a = context;
            j2Var.f494472b = 4825;
            j2Var.f494474d = str;
            j2Var.f494487q = str;
            j2Var.f494475e = java.lang.String.valueOf(o13.p.f423783c);
            j2Var.f494476f = true;
            j2Var.f494478h = true;
            j2Var.f494479i = true;
            j2Var.f494480j = true;
            j2Var.f494477g.put("chatbotExtParams", jSONObject.toString());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSAIHistoryChatDataItem", e17, "onItemClick jump failed", new java.lang.Object[0]);
        }
        return true;
    }
}

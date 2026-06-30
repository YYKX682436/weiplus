package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* loaded from: classes8.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nw4.k kVar, nw4.y2 y2Var, java.lang.String str) {
        super(1);
        this.f268523d = kVar;
        this.f268524e = y2Var;
        this.f268525f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177 finderFeedInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19481x7e1b7177) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderFeedInfo, "finderFeedInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo callback result: %s", finderFeedInfo);
        boolean z17 = finderFeedInfo.f268509d.length() == 0;
        nw4.k kVar = this.f268523d;
        nw4.y2 y2Var = this.f268524e;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        } else {
            nw4.g gVar = kVar.f422396d;
            java.lang.String str = y2Var.f422546c;
            java.lang.String str2 = y2Var.f422552i + ":ok";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("localFeedId", this.f268525f);
            hashMap.put("isLike", java.lang.Boolean.valueOf(finderFeedInfo.f268510e));
            hashMap.put("likeCount", java.lang.Integer.valueOf(finderFeedInfo.f268512g));
            hashMap.put("isFav", java.lang.Boolean.valueOf(finderFeedInfo.f268511f));
            hashMap.put("favCount", java.lang.Integer.valueOf(finderFeedInfo.f268513h));
            gVar.e(str, str2, hashMap);
        }
        return jz5.f0.f384359a;
    }
}

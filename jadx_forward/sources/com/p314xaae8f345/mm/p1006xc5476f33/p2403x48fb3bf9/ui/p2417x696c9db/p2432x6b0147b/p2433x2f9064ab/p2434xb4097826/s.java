package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f268530d = kVar;
        this.f268531e = y2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.os.Bundle result = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String u17 = pm0.v.u(result.getLong("localFeedId"));
        java.lang.String u18 = pm0.v.u(result.getLong("mediaType"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo callback localFeedId: ".concat(u17));
        nw4.g gVar = this.f268530d.f422396d;
        nw4.y2 y2Var = this.f268531e;
        java.lang.String str = y2Var.f422546c;
        java.lang.String str2 = y2Var.f422552i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("localFeedId", u17);
        hashMap.put("mediaType", u18);
        gVar.e(str, str2, hashMap);
        return jz5.f0.f384359a;
    }
}

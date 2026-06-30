package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268155f;

    public a(nw4.k kVar, java.lang.String str, nw4.y2 y2Var) {
        this.f268153d = kVar;
        this.f268154e = str;
        this.f268155f = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        nw4.n g07;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19477x154d53db c19477x154d53db = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19477x154d53db) obj;
        nw4.k kVar = this.f268153d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = kVar.f422397e;
        if (!((c22633x83752a59 == null || c22633x83752a59.f292909y) ? false : true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.c.e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.c.f268157d, kVar, this.f268154e);
            return;
        }
        java.lang.String str = c19477x154d53db != null ? c19477x154d53db.f268152d : null;
        nw4.g gVar = kVar.f422396d;
        nw4.y2 y2Var = this.f268155f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "callback sessionId is null");
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "callback sessionId: ".concat(str));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str);
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        zg0.q2 a17 = kVar.a();
        if (a17 == null || (g07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).g0()) == null) {
            return;
        }
        g07.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q0.f34645x24728b, hashMap);
    }
}

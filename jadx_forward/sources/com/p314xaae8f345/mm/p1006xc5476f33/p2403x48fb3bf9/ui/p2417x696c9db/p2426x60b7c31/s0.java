package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes7.dex */
public final class s0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f266921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.k f266922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q6 f266924e;

    public s0(java.lang.String str, int i17, nw4.k kVar, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q6 q6Var) {
        this.f266920a = str;
        this.f266921b = i17;
        this.f266922c = kVar;
        this.f266923d = y2Var;
        this.f266924e = q6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6 r6Var) {
        boolean z17 = r6Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Success_AllPkgDownloaded || r6Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Success_AllPkgDownloadedPrevious || r6Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Success_NoNeedGetCode;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreDownloadMiniProgramPackage", "triggerPreDownloadForRequest done. appId:" + this.f266920a + " scene:" + this.f266921b + " result:" + r6Var + " isSuccess:" + z17);
        nw4.y2 y2Var = this.f266923d;
        nw4.k kVar = this.f266922c;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, "predownloadMiniProgramPackage:ok", null);
        } else {
            kVar.f422396d.e(y2Var.f422546c, "predownloadMiniProgramPackage:fail", kz5.b1.e(new jz5.l("errorType", java.lang.Integer.valueOf(r6Var.ordinal()))));
        }
        this.f266924e.f170289f = null;
    }
}

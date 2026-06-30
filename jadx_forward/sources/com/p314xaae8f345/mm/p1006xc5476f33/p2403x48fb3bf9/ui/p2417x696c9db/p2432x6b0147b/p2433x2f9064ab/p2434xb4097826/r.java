package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f268529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, yz5.l lVar) {
        super(1);
        this.f268528d = str;
        this.f268529e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212 result = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderPlayInfo callback localFeedId: ");
        sb6.append(this.f268528d);
        sb6.append(", finderVideoInfo.mediaId: ");
        r45.n23 n23Var = result.f268516d;
        sb6.append(n23Var != null ? n23Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", sb6.toString());
        r45.n23 n23Var2 = result.f268516d;
        yz5.l lVar = this.f268529e;
        if (n23Var2 == null) {
            lVar.mo146xb9724478(null);
        } else {
            lVar.mo146xb9724478(n23Var2);
        }
        return jz5.f0.f384359a;
    }
}

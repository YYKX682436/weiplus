package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes8.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1 f266748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.g14 f266750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.r f266751g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1 h1Var, int i17, r45.g14 g14Var) {
        this.f266751g = rVar;
        this.f266748d = h1Var;
        this.f266749e = i17;
        this.f266750f = g14Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click ok");
        this.f266751g.a(this.f266748d, this.f266749e, this.f266750f);
    }
}

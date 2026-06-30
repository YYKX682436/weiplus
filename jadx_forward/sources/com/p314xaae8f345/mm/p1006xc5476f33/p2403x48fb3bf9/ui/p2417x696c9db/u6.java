package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class u6 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f268460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f268461b;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, android.content.Intent intent) {
        this.f268461b = c6Var;
        this.f268460a = intent;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "OpenLiteApp fail");
        j45.l.j(this.f268461b.c(), "webview", ".ui.tools.WebViewUI", this.f268460a, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "OpenLiteApp success");
    }
}

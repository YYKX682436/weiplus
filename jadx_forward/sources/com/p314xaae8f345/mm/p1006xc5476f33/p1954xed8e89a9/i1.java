package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class i1 implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f235025c;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, java.lang.String str, java.lang.String str2) {
        this.f235025c = e0Var;
        this.f235023a = str;
        this.f235024b = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_scene", 58);
        java.lang.String str = this.f235023a;
        intent.putExtra("geta8key_username", str);
        intent.putExtra("msgUsername", str);
        intent.putExtra("rawUrl", this.f235024b);
        j45.l.j(this.f235025c.f234953d, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}

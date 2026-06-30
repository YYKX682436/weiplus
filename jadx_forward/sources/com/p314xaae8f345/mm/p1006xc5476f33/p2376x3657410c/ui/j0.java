package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.k0 f262711d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.k0 k0Var) {
        this.f262711d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.k0 k0Var = this.f262711d;
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) k0Var.f262713a.f262653f).get("closeWebView"));
        k0Var.f262713a.setResult(-1, intent);
        k0Var.f262713a.finish();
    }
}

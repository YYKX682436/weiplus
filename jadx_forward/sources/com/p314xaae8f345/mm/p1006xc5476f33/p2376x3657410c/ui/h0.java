package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.i0 f262708d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.i0 i0Var) {
        this.f262708d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.i0 i0Var = this.f262708d;
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) i0Var.f262710a.f262653f).get("closeWebView"));
        i0Var.f262710a.setResult(-1, intent);
        i0Var.f262710a.finish();
    }
}

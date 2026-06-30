package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19171xb0aad1a f262720d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19171xb0aad1a activityC19171xb0aad1a, boolean z17) {
        this.f262720d = activityC19171xb0aad1a;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19171xb0aad1a activityC19171xb0aad1a = this.f262720d;
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) activityC19171xb0aad1a.f262653f).get("closeWebView"));
        activityC19171xb0aad1a.setResult(-1, intent);
        activityC19171xb0aad1a.finish();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f265066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265067e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e, android.content.Intent intent) {
        this.f265067e = serviceC19302xd3c5b06e;
        this.f265066d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265067e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f265066d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(serviceC19302xd3c5b06e, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceC19302xd3c5b06e.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(serviceC19302xd3c5b06e, "com/tencent/mm/plugin/webview/stub/WebViewStubService$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s f265108f;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s sVar, android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.f265108f = sVar;
        this.f265106d = bundle;
        this.f265107e = bundle2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.putExtras(this.f265106d);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("_stat_obj", this.f265107e);
        ((com.p314xaae8f345.mm.app.y7) dw4.a.f325830a).t(intent, this.f265108f.f265099d);
    }
}

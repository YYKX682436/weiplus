package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f268889h;

    public j6(nw4.n nVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f268885d = nVar;
        this.f268886e = str;
        this.f268887f = str2;
        this.f268888g = bundle;
        this.f268889h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            nw4.n nVar = this.f268885d;
            if (nVar != null) {
                nVar.O(this.f268886e, this.f268887f, nw4.a.a(this.f268888g), this.f268889h);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadWebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
    }
}

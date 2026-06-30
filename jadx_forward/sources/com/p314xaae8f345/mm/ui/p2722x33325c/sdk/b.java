package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f290724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.c f290726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f290727h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.d f290728i;

    public b(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.d dVar, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.c cVar, java.lang.Object obj) {
        this.f290728i = dVar;
        this.f290723d = str;
        this.f290724e = bundle;
        this.f290725f = str2;
        this.f290726g = cVar;
        this.f290727h = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.c cVar = this.f290726g;
        try {
            ((v61.o0) cVar).a(this.f290728i.f290729a.f(this.f290723d, this.f290724e, this.f290725f), this.f290727h);
        } catch (java.io.FileNotFoundException e17) {
            v61.o0 o0Var = (v61.o0) cVar;
            o0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RefreshTokenRunner", "onFileNotFoundException");
            v61.q0.a(o0Var.f515000a, 2, e17.getMessage());
        } catch (java.net.MalformedURLException e18) {
            v61.o0 o0Var2 = (v61.o0) cVar;
            o0Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RefreshTokenRunner", "onMalformedURLException");
            v61.q0.a(o0Var2.f515000a, 2, e18.getMessage());
        } catch (java.io.IOException e19) {
            v61.o0 o0Var3 = (v61.o0) cVar;
            o0Var3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RefreshTokenRunner", "onIOException");
            v61.q0.a(o0Var3.f515000a, 2, e19.getMessage());
        }
    }
}

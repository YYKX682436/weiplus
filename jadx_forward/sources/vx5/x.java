package vx5;

/* loaded from: classes13.dex */
public class x implements tx5.i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f522929a = false;

    public x(vx5.v vVar) {
    }

    @Override // tx5.i
    public tx5.g a() {
        return vx5.c.f522864a.f301873d;
    }

    @Override // tx5.i
    public tx5.f b(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        if (!h()) {
            return null;
        }
        by5.c4.f("PinusWebFactory", "createWebView, PinusWebView is available");
        return new vx5.i0(c27816xac2547f9);
    }

    @Override // tx5.i
    public boolean c(android.content.Context context, com.p314xaae8f345.p3210x3857dc.e1 e1Var) {
        by5.c4.f("PinusWebFactory", "initWebviewCore");
        boolean h17 = h();
        if (e1Var != null) {
            if (h17) {
                e1Var.a();
            } else {
                e1Var.b();
            }
        }
        return h17;
    }

    @Override // tx5.i
    public boolean d() {
        return this.f522929a;
    }

    @Override // tx5.i
    public tx5.e e() {
        if (!com.p314xaae8f345.p3210x3857dc.o2.c() || !org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.t()) {
            return new vx5.m();
        }
        by5.c4.f("PinusWebFactory", "getWebviewStorage, profileName:" + com.p314xaae8f345.p3210x3857dc.o2.f301901c);
        tx5.c mo120236x125d89b4 = com.p314xaae8f345.p3210x3857dc.c0.a().mo120236x125d89b4(com.p314xaae8f345.p3210x3857dc.o2.f301901c);
        if (mo120236x125d89b4 != null) {
            return mo120236x125d89b4.mo120508xb280207d();
        }
        by5.c4.c("PinusWebFactory", "getWebviewStorage error, profile is null");
        xx5.l.a(6, 1, com.p314xaae8f345.p3210x3857dc.o2.c());
        return null;
    }

    @Override // tx5.i
    public void f(android.content.Context context, boolean z17) {
        tx5.e e17;
        tx5.b mo120517x5ad7a0f3;
        if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
            by5.c4.g("PinusWebFactory", "clearAllWebViewCache, not pinus");
            return;
        }
        try {
            if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d() <= 0) {
                by5.c4.g("PinusWebFactory", "clearAllWebViewCache, no available version");
                return;
            }
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9 = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9(new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27841xa2f288c7(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d()));
            c27847xac2547f9.mo120385x7af55728("searchBoxJavaBridge_");
            c27847xac2547f9.mo120385x7af55728("accessibility");
            c27847xac2547f9.mo120385x7af55728("accessibilityTraversal");
            c27847xac2547f9.mo120326xd2bef135(true);
            if (z17 && (mo120517x5ad7a0f3 = mo120517x5ad7a0f3()) != null) {
                mo120517x5ad7a0f3.e();
            }
            if (!com.p314xaae8f345.p3210x3857dc.o2.c() || (e17 = e()) == null) {
                return;
            }
            e17.a();
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusWebFactory", "clearAllWebViewCache, error", th6);
        }
    }

    @Override // tx5.i
    public tx5.h g() {
        return com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
    }

    @Override // tx5.i
    /* renamed from: getCookieManager */
    public tx5.b mo120517x5ad7a0f3() {
        if (!com.p314xaae8f345.p3210x3857dc.o2.c() || !org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.t()) {
            return new vx5.e();
        }
        by5.c4.f("PinusWebFactory", "getCookieManager, profileName:" + com.p314xaae8f345.p3210x3857dc.o2.f301901c);
        tx5.c mo120236x125d89b4 = com.p314xaae8f345.p3210x3857dc.c0.a().mo120236x125d89b4(com.p314xaae8f345.p3210x3857dc.o2.f301901c);
        if (mo120236x125d89b4 != null) {
            return mo120236x125d89b4.mo120507x5ad7a0f3();
        }
        by5.c4.c("PinusWebFactory", "getCookieManager error, profile is null");
        xx5.l.a(5, 1, com.p314xaae8f345.p3210x3857dc.o2.c());
        return null;
    }

    @Override // tx5.i
    /* renamed from: getProfileStore */
    public tx5.d mo120518xa93cb32e() {
        by5.a1.a();
        return new vx5.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.x.h():boolean");
    }
}

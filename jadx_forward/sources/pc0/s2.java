package pc0;

@j95.b
/* loaded from: classes4.dex */
public final class s2 extends i95.w implements qc0.k1 {

    /* renamed from: d, reason: collision with root package name */
    public lt3.h f434838d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f434839e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final pc0.r2 f434840f = new pc0.r2();

    public final lt3.h Ai() {
        if (!gm0.j1.a()) {
            throw new java.lang.IllegalStateException("getVideoEditorDataStorage() was called when account is not ready.");
        }
        if (this.f434838d == null) {
            l75.k0 k0Var = gm0.j1.u().f354686f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var, "getDataDB(...)");
            this.f434838d = new lt3.h(k0Var);
        }
        lt3.h hVar = this.f434838d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
        return hVar;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        l75.k0 k0Var = gm0.j1.u().f354686f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var, "getDataDB(...)");
        this.f434838d = new lt3.h(k0Var);
        this.f434840f.m43071x58998cd();
        lt3.v.f402810a.b();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f434840f.m43072x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 provider, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        dw3.c0.f325715a.c(provider);
        if (z17) {
            java.lang.String str = provider.C;
            boolean z18 = true;
            if (!(str == null || str.length() == 0)) {
                java.lang.String thumbPath = provider.C;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath, "thumbPath");
                if (!r26.i0.n(thumbPath, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, false)) {
                    provider.C += com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                }
            }
            java.lang.String str2 = provider.B;
            if (str2 != null && str2.length() != 0) {
                z18 = false;
            }
            if (z18) {
                return;
            }
            java.lang.String outputVideoPath = provider.B;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outputVideoPath, "outputVideoPath");
            if (r26.i0.n(outputVideoPath, ".mp4", false)) {
                return;
            }
            provider.B += ".mp4";
        }
    }
}

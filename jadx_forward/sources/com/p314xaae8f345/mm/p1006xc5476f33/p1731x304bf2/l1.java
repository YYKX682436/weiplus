package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

@j95.b
/* loaded from: classes8.dex */
public final class l1 extends i95.w implements m33.q1 {

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f221003f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f221004g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f221001d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f221002e = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f221005h = true;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.t2 f221006i = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h1(this);

    public static final void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var) {
        java.lang.String str = l1Var.f221001d;
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "releaseStore, AppId: " + l1Var.f221001d);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(l1Var.f221001d);
        l1Var.f221001d = "";
        l1Var.f221002e = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(r13.f221001d) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean wi(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1.wi(com.tencent.mm.plugin.game.l1):boolean");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "onAccountInitialized");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f221006i);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "onAccountReleased");
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.j1(this), "GameLiteAppStoreService.SerialQueue");
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f221006i);
        super.mo836xb8969aab(context);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "onCreate");
        super.mo8845x3e5a77bb(context);
    }
}

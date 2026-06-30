package o03;

/* loaded from: classes8.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler, fe0.z3 {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f423427d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f423428e;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r8 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, int r9, java.util.Map r10, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.f423427d = r11
            java.lang.Class<fe0.v3> r0 = fe0.v3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.v3 r0 = (fe0.v3) r0
            if (r0 == 0) goto L1e
            fe0.a r3 = fe0.a.f342899f
            r1 = r0
            ee0.t3 r1 = (ee0.t3) r1
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r7
            android.view.View r8 = r1.wi(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L25
        L1e:
            android.view.View r8 = new android.view.View
            android.content.Context r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r8.<init>(r9)
        L25:
            r7.f423428e = r8
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r8.setLayoutParams(r9)
            if (r11 == 0) goto L35
            r11.m138441xdf757329(r7)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o03.a.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // fe0.z3
    public void a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformWebView", "the onPlatFormViewEvent is called, params is " + params);
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f423427d;
            if (c28688xe8dbe4c2 != null) {
                c28688xe8dbe4c2.m138438xd8c5c779("platformViewEvent", params);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PlatformWebView", "the onPlatFormViewEvent exception: " + th6.getMessage());
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformWebView", "the PlatformCommonWebView is dispose!!!");
        fe0.v3 v3Var = (fe0.v3) i95.n0.c(fe0.v3.class);
        if (v3Var != null) {
            ((ee0.t3) v3Var).Bi(this.f423428e, fe0.a.f342899f);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f423427d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f423428e;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
    }
}

package m03;

/* loaded from: classes8.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler, fe0.z3 {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f404083d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f404084e;

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
            r7.f404083d = r11
            java.lang.Class<fe0.v3> r0 = fe0.v3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.v3 r0 = (fe0.v3) r0
            if (r0 == 0) goto L1e
            fe0.a r3 = fe0.a.f342898e
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
            r7.f404084e = r8
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r8.setLayoutParams(r9)
            if (r11 == 0) goto L35
            r11.m138441xdf757329(r7)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m03.a.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // fe0.z3
    public void a(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformForm", "the onPlatFormViewEvent is called, params is " + params);
            java.util.HashMap hashMap = new java.util.HashMap(params);
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f404083d;
            if (c28688xe8dbe4c2 != null) {
                c28688xe8dbe4c2.m138438xd8c5c779("platformViewEvent", hashMap);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PlatformForm", "the onPlatFormViewEvent exception: " + th6.getMessage());
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformForm", "the PlatformFormWebView is dispose!!!");
        fe0.v3 v3Var = (fe0.v3) i95.n0.c(fe0.v3.class);
        if (v3Var != null) {
            ((ee0.t3) v3Var).Bi(this.f404084e, fe0.a.f342898e);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f404083d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f404084e;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String str = methodCall.f71610xbfc5d0e1;
        if (str == null) {
            str = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sendJSEvent", str)) {
            java.lang.Object obj = methodCall.f71609x86ac7956;
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map == null || map.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PlatformForm", "the methodCall params is null or empty!");
                return;
            }
            l03.a aVar = l03.a.f396379a;
            java.util.Map a17 = aVar.a(map);
            java.lang.Object obj2 = a17.get("event");
            if (!(obj2 instanceof java.lang.String)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PlatformForm", "the methodCall event is not string type!");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformForm", "the methodCall event is " + obj2);
            java.lang.Object obj3 = a17.get("params");
            java.util.Map a18 = aVar.a(obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null);
            fe0.v3 v3Var = (fe0.v3) i95.n0.c(fe0.v3.class);
            if (v3Var == null) {
                return;
            }
            ((ee0.t3) v3Var).Ai(this.f404084e, fe0.a.f342898e, (java.lang.String) obj2, a18, null);
        }
    }
}

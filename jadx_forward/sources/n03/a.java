package n03;

/* loaded from: classes8.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f415439d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f415440e;

    /* renamed from: f, reason: collision with root package name */
    public final fe0.v3 f415441f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r10 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r10, int r11, java.util.Map r12, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 r13) {
        /*
            r9 = this;
            r9.<init>()
            r9.f415439d = r13
            java.lang.Class<fe0.v3> r0 = fe0.v3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.v3 r0 = (fe0.v3) r0
            r9.f415441f = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "the PlatformPanoramaView is initing, "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SnsAd.PlatformPanoramaView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            if (r0 == 0) goto L34
            fe0.a r5 = fe0.a.f342897d
            r8 = 0
            r3 = r0
            ee0.t3 r3 = (ee0.t3) r3
            r4 = r10
            r6 = r11
            r7 = r12
            android.view.View r10 = r3.wi(r4, r5, r6, r7, r8)
            if (r10 != 0) goto L3b
        L34:
            android.view.View r10 = new android.view.View
            android.content.Context r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r10.<init>(r11)
        L3b:
            r9.f415440e = r10
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = -1
            r11.<init>(r12, r12)
            r10.setLayoutParams(r11)
            if (r13 == 0) goto L4b
            r13.m138441xdf757329(r9)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n03.a.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel):void");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformPanoramaView", "the PlatformPanoramaView dispose is called " + this);
        fe0.v3 v3Var = this.f415441f;
        if (v3Var != null) {
            ((ee0.t3) v3Var).Bi(this.f415440e, fe0.a.f342897d);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f415439d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f415440e;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PlatformPanoramaView", "the methodCall params is null or empty!");
                return;
            }
            java.lang.Object obj2 = map.get("event");
            if (!(obj2 instanceof java.lang.String)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PlatformPanoramaView", "the methodCall event is not string type!");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PlatformPanoramaView", "the methodCall event is " + obj2);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("startMonitoring", obj2);
            fe0.v3 v3Var = this.f415441f;
            if (b17) {
                if (v3Var != null) {
                    ((ee0.t3) v3Var).Ai(this.f415440e, fe0.a.f342897d, "startMonitoring", null, null);
                }
            } else {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("stopMonitoring", obj2) || v3Var == null) {
                    return;
                }
                ((ee0.t3) v3Var).Ai(this.f415440e, fe0.a.f342897d, "stopMonitoring", null, null);
            }
        }
    }
}

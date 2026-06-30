package yw4;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public zq1.j0 f548490b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f548491c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f548492d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f548493e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f548494f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f548496h;

    /* renamed from: i, reason: collision with root package name */
    public yw4.q f548497i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f548498j;

    /* renamed from: l, reason: collision with root package name */
    public long f548500l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f548502n;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f548495g = jz5.h.b(yw4.c.f548483d);

    /* renamed from: k, reason: collision with root package name */
    public final yw4.u f548499k = new yw4.u();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f548501m = jz5.h.b(new yw4.h(this));

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 f548503o = new yw4.f(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3 f548504p = new yw4.g(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public int a(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (!y(url)) {
            zq1.j0 j0Var = this.f548490b;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, j0Var != null ? j0Var.f556528a : null)) {
                return -1;
            }
        }
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 b() {
        return this.f548503o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 d() {
        return this.f548504p;
    }

    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, com.p314xaae8f345.p3210x3857dc.x0 request) {
        java.lang.String host;
        ?? r37;
        zq1.j0 j0Var;
        zq1.l0 l0Var;
        com.p314xaae8f345.p3210x3857dc.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (this.f548490b == null) {
            return null;
        }
        java.lang.String uri = request.mo120512xb5887639().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        boolean z17 = false;
        if (request.mo120514xa25f36b5()) {
            zq1.j0 j0Var2 = this.f548490b;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uri, j0Var2 != null ? j0Var2.f556528a : null)) {
                zq1.j0 j0Var3 = this.f548490b;
                if (j0Var3 != null && j0Var3.f556540m) {
                    z17 = true;
                }
                if (!z17) {
                    return null;
                }
            }
            zq1.j0 j0Var4 = this.f548490b;
            if (j0Var4 == null || (l0Var = j0Var4.f556534g) == null || (y0Var = l0Var.f556546a) == null) {
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = c();
            java.lang.String v17 = v();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "<get-prefetchId>(...)");
            hy4.k0 k0Var = c17.V;
            k0Var.getClass();
            k0Var.f367659h = v17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f548490b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return y0Var;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String Z = c().Z();
            if (Z != null && (host = android.net.Uri.parse(Z).getHost()) != null) {
                if (x() != null) {
                    zq1.j0 j0Var5 = this.f548490b;
                    r37 = 1;
                    j0Var = new ts1.o(uri, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.o(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(host), uri), nu4.b0.Q, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175981d, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(host), j0Var5 != null ? j0Var5.f556537j : null, null, null, false, j0Var5 != null ? j0Var5.f556539l : null, null, 1472, null).r();
                } else {
                    r37 = 1;
                    j0Var = null;
                }
                if (j0Var != null) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    yw4.u uVar = this.f548499k;
                    uVar.f548531e += currentTimeMillis2 - currentTimeMillis;
                    uVar.f548532f += r37;
                    zq1.l0 l0Var2 = j0Var.f556534g;
                    if (l0Var2 != null) {
                        com.p314xaae8f345.p3210x3857dc.y0 y0Var2 = l0Var2.f556546a;
                    }
                    java.lang.String str2 = j0Var.f556533f;
                    if (!this.f548498j) {
                        this.f548498j = r37;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a;
                        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                    java.lang.String str4 = "";
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "JS")) {
                        java.util.LinkedList linkedList = c().V.f367663l;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(request.mo120512xb5887639().toString());
                        sb6.append(';');
                        zq1.l0 l0Var3 = j0Var.f556534g;
                        java.lang.String str5 = l0Var3 != null ? l0Var3.f556547b : null;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        sb6.append(str4);
                        linkedList.add(sb6.toString());
                        jz5.g gVar = cx4.s.f306187a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1200L, 11L, 1L);
                        cx4.s.c(8L, 1L, ((yq1.x0) x()).c(w()));
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "CSS")) {
                        java.util.LinkedList linkedList2 = c().V.f367664m;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(request.mo120512xb5887639().toString());
                        sb7.append(';');
                        zq1.l0 l0Var4 = j0Var.f556534g;
                        java.lang.String str6 = l0Var4 != null ? l0Var4.f556547b : null;
                        if (str6 != null) {
                            str4 = str6;
                        }
                        sb7.append(str4);
                        linkedList2.add(sb7.toString());
                        jz5.g gVar2 = cx4.s.f306187a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1200L, 12L, 1L);
                        cx4.s.c(9L, 1L, ((yq1.x0) x()).c(w()));
                    }
                    zq1.l0 l0Var5 = j0Var.f556534g;
                    if (l0Var5 != null) {
                        return l0Var5.f556546a;
                    }
                }
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherInterceptor", e17, "interceptRequest getCurrentUrl host", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean k(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return !y(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(int r11, java.lang.String r12, r45.s83 r13) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WebPrefetcherInterceptor"
            java.lang.String r1 = "overrideProcessResultL, prefetchVersion: "
            java.lang.String r2 = "reqUrl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r2)
            java.lang.String r2 = "resp"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r2)
            int r2 = r13.f467080f
            r3 = 38
            r4 = 1
            r5 = 0
            if (r2 != r3) goto Lbf
            boolean r11 = r10.y(r12)
            if (r11 == 0) goto Lbe
            r45.cu5 r11 = r13.C
            r13 = 0
            if (r11 == 0) goto L28
            byte[] r11 = x51.j1.d(r11)
            goto L29
        L28:
            r11 = r13
        L29:
            r45.t83 r2 = new r45.t83     // Catch: java.io.IOException -> Lb6
            r2.<init>()     // Catch: java.io.IOException -> Lb6
            r2.mo11468x92b714fd(r11)     // Catch: java.io.IOException -> Lb6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb6
            r11.<init>(r1)     // Catch: java.io.IOException -> Lb6
            zq1.j0 r1 = r10.f548490b     // Catch: java.io.IOException -> Lb6
            r6 = 0
            if (r1 == 0) goto L3f
            long r8 = r1.f556532e     // Catch: java.io.IOException -> Lb6
            goto L40
        L3f:
            r8 = r6
        L40:
            r11.append(r8)     // Catch: java.io.IOException -> Lb6
            java.lang.String r1 = ", verifyInfo.Version: "
            r11.append(r1)     // Catch: java.io.IOException -> Lb6
            long r8 = r2.f467738e     // Catch: java.io.IOException -> Lb6
            r11.append(r8)     // Catch: java.io.IOException -> Lb6
            java.lang.String r1 = ", redirectUrl: "
            r11.append(r1)     // Catch: java.io.IOException -> Lb6
            java.lang.String r1 = r2.f467737d     // Catch: java.io.IOException -> Lb6
            r11.append(r1)     // Catch: java.io.IOException -> Lb6
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> Lb6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)     // Catch: java.io.IOException -> Lb6
            zq1.j0 r11 = r10.f548490b     // Catch: java.io.IOException -> Lb6
            if (r11 == 0) goto L64
            long r6 = r11.f556532e     // Catch: java.io.IOException -> Lb6
        L64:
            long r8 = r2.f467738e     // Catch: java.io.IOException -> Lb6
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto Lbe
            zq1.m0 r11 = r10.x()     // Catch: java.io.IOException -> Lb6
            if (r11 == 0) goto L8a
            zq1.j0 r1 = r10.f548490b     // Catch: java.io.IOException -> Lb6
            if (r1 == 0) goto L77
            java.lang.String r3 = r1.f556530c     // Catch: java.io.IOException -> Lb6
            goto L78
        L77:
            r3 = r13
        L78:
            java.lang.String r6 = ""
            if (r3 != 0) goto L7d
            r3 = r6
        L7d:
            if (r1 == 0) goto L81
            java.lang.String r13 = r1.f556529b     // Catch: java.io.IOException -> Lb6
        L81:
            if (r13 != 0) goto L84
            goto L85
        L84:
            r6 = r13
        L85:
            yq1.x0 r11 = (yq1.x0) r11     // Catch: java.io.IOException -> Lb6
            r11.a(r3, r6, r12)     // Catch: java.io.IOException -> Lb6
        L8a:
            java.lang.String r11 = r2.f467737d     // Catch: java.io.IOException -> Lb6
            r10.z()     // Catch: java.io.IOException -> Lb6
            com.tencent.mm.plugin.webview.core.r0 r13 = r10.c()     // Catch: java.io.IOException -> Lb6
            r13.f263454c0 = r4     // Catch: java.io.IOException -> Lb6
            com.tencent.mm.plugin.webview.core.r0 r13 = r10.c()     // Catch: java.io.IOException -> Lb6
            r13.M()     // Catch: java.io.IOException -> Lb6
            if (r11 == 0) goto La7
            int r13 = r11.length()     // Catch: java.io.IOException -> Lb6
            if (r13 != 0) goto La5
            goto La7
        La5:
            r13 = r5
            goto La8
        La7:
            r13 = r4
        La8:
            if (r13 == 0) goto Lab
            goto Lac
        Lab:
            r12 = r11
        Lac:
            com.tencent.mm.plugin.webview.core.r0 r11 = r10.c()     // Catch: java.io.IOException -> Lb6
            r13 = 8
            r11.V0(r12, r4, r13)     // Catch: java.io.IOException -> Lb6
            goto Lbe
        Lb6:
            r11 = move-exception
            java.lang.String r12 = "parse GetA8KeyRespVerifyPrefetchInfo"
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r11, r12, r13)
        Lbe:
            return r4
        Lbf:
            boolean r12 = r10.f548491c
            if (r12 == 0) goto Lcd
            r12 = 9
            if (r11 != r12) goto Lcd
            com.tencent.mm.plugin.webview.core.r0 r11 = r10.c()
            r11.f263454c0 = r4
        Lcd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.i.l(int, java.lang.String, r45.s83):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean m(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        zq1.j0 j0Var = this.f548490b;
        if ((!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, j0Var != null ? j0Var.f556528a : null) && !this.f548491c) || !c().M()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "overrideReload url: %s", url);
        z();
        c().f263454c0 = true;
        c().V0(url, true, 8);
        c().f263461g.f558439l = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean o(java.lang.String url) {
        java.lang.String str;
        java.lang.String host;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d;
        java.lang.String str2;
        java.lang.String Y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        boolean z17 = false;
        if (!y(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "not match " + url + ", rawUrl: " + c().i() + ", prefetchResp: " + this.f548490b);
            z();
            return false;
        }
        this.f548498j = false;
        zq1.j0 j0Var = this.f548490b;
        if ((j0Var != null ? j0Var.f556534g : null) != null) {
            zw4.n.f558467a.b(zw4.a.f558414f, c().f263461g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "url has been cached, bizScene:" + j0Var.f556531d + ", subBizScene:" + j0Var.f556535h + ", prefetchId: " + v() + ", resp.url: %s", j0Var.f556528a);
            yw4.r rVar = yw4.r.f548523b;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = j0Var.f556538k;
            yw4.q qVar = new yw4.q(rVar, new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(gVar != null ? gVar.f273689a : null), c().f263449a);
            this.f548497i = qVar;
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = qVar.f548512b;
            if ((c19775x58fd37b3 != null ? c19775x58fd37b3.f(434) : false) != false) {
                this.f548494f = true;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initPrefetcherJsApiHandler canInjectPrefetcherJsBridge: ");
            sb6.append(this.f548494f);
            sb6.append(", controlBytes size: ");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = j0Var.f556538k;
            sb6.append(gVar2 != null ? java.lang.Integer.valueOf(gVar2.f273689a.length) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", sb6.toString());
            if (this.f548494f) {
                yw4.q qVar2 = this.f548497i;
                if (qVar2 != null && qVar2.f548518h && !qVar2.f548520j) {
                    qVar2.f548520j = true;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = qVar2.f548513c;
                    java.lang.String m81403xce19f7b8 = c22633x83752a59 != null ? c22633x83752a59.m81403xce19f7b8() : null;
                    if ((m81403xce19f7b8 == null || m81403xce19f7b8.length() == 0) == true) {
                        Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(16);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Y, "getRandomString(...)");
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
                        Y = c22633x83752a59.m81403xce19f7b8();
                        if (Y == null) {
                            Y = "";
                        }
                    }
                    qVar2.f548521k = Y;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "setDigestVerify isDigestVerify: " + qVar2.f548520j + ", randomStr: " + qVar2.f548521k + ", hashCode: " + qVar2.hashCode());
                }
                yw4.q qVar3 = this.f548497i;
                if (qVar3 != null) {
                    qVar3.f548522l = true;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = c();
                int i17 = yw4.s.f548525a;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 wv6 = c17.f263449a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wv6, "wv");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsLoader", "injectWebPrefetcherJsBridge");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = qVar3.f548513c;
                    if (c22633x83752a592 != null) {
                        c22633x83752a592.mo120128x74041feb(qVar3, "__wxPrefetcher");
                    }
                    wv6.mo14660x738236e6("window.__wx_web_prefetcher_js_isLoaded = 'loaded';", null);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsLoader", e17, "injectWebPrefetcherJsBridge exception", new java.lang.Object[0]);
                }
                java.io.InputStream inputStream = j0Var.f556534g.f556546a.f302159f;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<script>");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsLoader", "getWebPrefetcherJs path: %s", "jsapi/WebPrefetcherWebView.js");
                try {
                    str2 = new java.lang.String(s46.d.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("jsapi/WebPrefetcherWebView.js")), r26.c.f450398a);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsLoader", e18, "getWebPrefetcherJs exception", new java.lang.Object[0]);
                    str2 = "";
                }
                sb7.append(str2);
                sb7.append("</script>");
                byte[] bytes = sb7.toString().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inputStream);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j5 j5Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j5(byteArrayInputStream, inputStream);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "updatePrefetchResp origin: %s, prefetch: %s, merged: %s", java.lang.Integer.valueOf(inputStream.available()), java.lang.Integer.valueOf(byteArrayInputStream.available()), java.lang.Integer.valueOf(j5Var.available()));
                j0Var.f556534g.f556546a.f302159f = j5Var;
                this.f548490b = j0Var;
            } else {
                this.f548490b = j0Var;
            }
            zq1.j0 j0Var2 = this.f548490b;
            java.lang.String str3 = j0Var2 != null ? j0Var2.f556537j : null;
            if ((str3 == null || r26.n0.N(str3)) == false) {
                c().f263449a.mo120128x74041feb(new yw4.d(str3, this), "wxPrefetcherClient");
            }
            zw4.i.a(zw4.h.f558458h, url, j0Var.f556528a, j0Var.f556536i, j0Var.f556531d, j0Var.f556535h);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c18 = c();
            java.lang.String str4 = j0Var.f556541n;
            str = str4 != null ? str4 : "";
            yw4.q qVar4 = this.f548497i;
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b32 = qVar4 != null ? qVar4.f548512b : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) c18;
            if ((str.length() > 0) != false && (ldVar = e3Var.W0) != null && (viewOnCreateContextMenuListenerC19337x37f3384d = ldVar.f267187e) != null && ldVar.f267188f != null && viewOnCreateContextMenuListenerC19337x37f3384d.f265403x2 != null && c19775x58fd37b32 != null) {
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("uiConfigs");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int length = optJSONArray.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                            if (optJSONObject != null) {
                                ldVar.b(optJSONObject.optString("func"), optJSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), c19775x58fd37b32);
                            }
                        }
                    }
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewUIStyleHelper", e19, "configWebPrefetchUIStyle exception", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c19 = c();
            java.lang.String url2 = j0Var.f556528a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url2, "url");
            java.util.Map map = j0Var.f556534g.f556546a.f302158e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c19.T(), "WebView-Trace loadCacheUrl#" + c19.U() + " baseUrl " + url2);
            c19.C = url2;
            c19.f263485s = true;
            c19.I(c19.f263470k0);
            c19.V.a("clientLoadUrl", java.lang.System.currentTimeMillis());
            c19.f263449a.mo32266x141096a9(url2, map);
            c19.P0(url2);
            c19.I(c19.f263468j0);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.d0(c19));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c27 = c();
            java.lang.String url3 = j0Var.f556528a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url3, "url");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0.W0(c27, url3, false, 10, 2, null);
            this.f548491c = true;
            c().V.f367658g = this.f548491c;
            c().V.f367665n.putAll(j0Var.f556534g.f556546a.f302158e);
            jz5.g gVar3 = cx4.s.f306187a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1200L, 10L, 1L);
            zq1.m0 x17 = x();
            cx4.s.c(7L, 1L, x17 != null ? ((yq1.x0) x17).c(w()) : 0);
            yw4.u uVar = this.f548499k;
            uVar.f548527a = true;
            uVar.getClass();
            uVar.f548528b = url;
            uVar.f548529c = j0Var;
            this.f548499k.f548530d = this.f548500l;
        } else {
            c().V.f367658g = false;
            zw4.n.f558467a.b(zw4.a.f558414f, c().f263461g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "async geta8key:".concat(url));
            ((yq1.x0) x()).getClass();
            r45.o97 a17 = ts1.p.a(url, null);
            java.lang.String str5 = a17 != null ? a17.f463592i : null;
            str = str5 != null ? str5 : "";
            if ((str.length() == 0) != false) {
                str = url;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "async geta8key respUrl:".concat(str));
            if (!nf.e.c(str, "http", true)) {
                str = "http://".concat(url);
            }
            zw4.i.a(zw4.h.f558459i, url, str, 0, 0, 0);
            c().f263449a.mo32265x141096a9(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0.W0(c(), str, false, 10, 2, null);
        }
        this.f548492d = true;
        if (x() != null && !r26.n0.N(url) && (host = android.net.Uri.parse(url).getHost()) != null) {
            z17 = yq1.z.f546031i.n(host, false);
        }
        this.f548493e = z17;
        c().V.f367656e = this.f548492d;
        c().V.f367657f = this.f548493e;
        c().V.f367663l.clear();
        c().V.f367664m.clear();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean p(java.lang.String url, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (r26.i0.y(url, "http", false)) {
            zw4.n nVar = zw4.n.f558467a;
            zw4.d controllerInfo = c().f263461g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controllerInfo, "controllerInfo");
            long j17 = controllerInfo.f558432e;
            boolean z17 = true;
            if (j17 - controllerInfo.f558431d > 50000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewPrefetchTestReportUtil", "checkValid WebViewUI create cost invalid, create: %d, start: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(controllerInfo.f558431d));
                jz5.g gVar = cx4.s.f306187a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1281L, 14L, 1L);
                controllerInfo.f558439l = true;
                z17 = false;
            }
            if (z17) {
                if (y(url)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    zq1.m0 x17 = x();
                    zq1.j0 b17 = x17 != null ? ((yq1.x0) x17).b(url, v()) : null;
                    this.f548500l = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if ((b17 != null ? b17.f556534g : null) != null) {
                        this.f548490b = b17;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = c();
                        zw4.b bVar = zw4.b.f558424h;
                        zw4.d dVar = c17.f263461g;
                        dVar.getClass();
                        dVar.f558441n = bVar;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c18 = c();
                        zw4.b bVar2 = zw4.b.f558423g;
                        zw4.d dVar2 = c18.f263461g;
                        dVar2.getClass();
                        dVar2.f558441n = bVar2;
                    }
                } else {
                    z();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c19 = c();
                    zw4.b bVar3 = zw4.b.f558422f;
                    zw4.d dVar3 = c19.f263461g;
                    dVar3.getClass();
                    dVar3.f558441n = bVar3;
                }
                nVar.b(zw4.a.f558413e, c().f263461g);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, com.p314xaae8f345.p3210x3857dc.x0 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = c();
        if (request.mo120514xa25f36b5() && request.mo120512xb5887639() != null && c17.M()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "shouldOverride url exitTmpl %s", request.mo120512xb5887639());
            z();
        }
        return super.q(webView, request);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        return !z17 && i17 == 10;
    }

    public final java.lang.String v() {
        return (java.lang.String) ((jz5.n) this.f548501m).mo141623x754a37bb();
    }

    public final java.lang.String w() {
        return c().i();
    }

    public final zq1.m0 x() {
        return (zq1.m0) ((jz5.n) this.f548495g).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.i.y(java.lang.String):boolean");
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "resetPrefetchInfo");
        this.f548490b = null;
        this.f548491c = false;
        this.f548492d = false;
        this.f548493e = false;
        this.f548494f = false;
        this.f548502n = null;
        yw4.q qVar = this.f548497i;
        if (qVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = qVar.f548514d;
            if (n3Var != null) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 3;
                obtain.obj = null;
                n3Var.mo50308x2936bf5f(obtain);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = qVar.f548513c;
            if (c22633x83752a59 != null) {
                c22633x83752a59.mo120173x7af55728("__wxPrefetcher");
            }
        }
        this.f548497i = null;
        yw4.u uVar = this.f548499k;
        uVar.f548530d = 0L;
        uVar.f548531e = 0L;
        uVar.f548532f = 0;
    }
}

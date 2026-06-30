package qx4;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f448992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f448994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448995h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, qx4.d0 d0Var, java.lang.String str2, int i17, java.lang.String str3) {
        super(0);
        this.f448991d = str;
        this.f448992e = d0Var;
        this.f448993f = str2;
        this.f448994g = i17;
        this.f448995h = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if ((!r26.n0.N(r1)) == true) goto L8;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = r7.f448991d
            if (r1 == 0) goto Le
            boolean r2 = r26.n0.N(r1)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 != r3) goto Le
            goto Lf
        Le:
            r3 = r0
        Lf:
            qx4.d0 r2 = r7.f448992e
            if (r3 == 0) goto L1d
            org.json.JSONObject r3 = r2.g()
            java.lang.String r4 = "json"
            r3.put(r4, r1)
            goto L21
        L1d:
            org.json.JSONObject r3 = r2.f()
        L21:
            java.lang.String r1 = "requestId"
            java.lang.String r4 = r7.f448993f
            r3.put(r1, r4)
            java.lang.String r1 = "retCode"
            int r4 = r7.f448994g
            r3.put(r1, r4)
            java.lang.String r1 = "errMsg"
            java.lang.String r4 = r7.f448995h
            r3.put(r1, r4)
            av4.j r1 = r2.f95859a
            if (r1 == 0) goto L7f
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView r1 = r1.mo9090x86b9ebe3()
            if (r1 == 0) goto L7f
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r3 = "MicroMsg.WebSearch.WebSearchJSApiNotifier"
            java.lang.String r4 = "onSearchWebQueryReady"
            java.lang.String r5 = "start notifyJsEvent %s %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r4, r2}     // Catch: java.lang.Exception -> L77
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5, r6)     // Catch: java.lang.Exception -> L77
            java.lang.String r5 = "javascript:window['%s'] && %s(%s)"
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r4, r2}     // Catch: java.lang.Exception -> L77
            r4 = 3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = java.lang.String.format(r5, r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r4 = "format(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)     // Catch: java.lang.Exception -> L77
            av4.t0 r4 = new av4.t0     // Catch: java.lang.Exception -> L77
            r4.<init>(r1, r2)     // Catch: java.lang.Exception -> L77
            pm0.v.X(r4)     // Catch: java.lang.Exception -> L77
            goto L7f
        L77:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "notifyJsEvent"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r2, r0)
        L7f:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.v.mo152xb9724478():java.lang.Object");
    }
}

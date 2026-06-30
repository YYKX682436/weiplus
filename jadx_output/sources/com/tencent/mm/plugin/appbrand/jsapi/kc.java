package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class kc implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lc f81355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81357c;

    public kc(com.tencent.mm.plugin.appbrand.jsapi.lc lcVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f81355a = lcVar;
        this.f81356b = d0Var;
        this.f81357c = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((r9 == -1) != false) goto L16;
     */
    @Override // nf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.JsApiRequestSnsPayment"
            java.lang.String r2 = "on Activity result: %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.plugin.appbrand.jsapi.lc r0 = r7.f81355a
            int r1 = r0.f81518g
            r2 = 0
            if (r8 == r1) goto L17
            return r2
        L17:
            r8 = 1
            r1 = 0
            if (r10 == 0) goto L2c
            java.lang.String r3 = "ret"
            java.lang.String r3 = r10.getStringExtra(r3)
            if (r3 == 0) goto L2c
            r4 = -1
            if (r9 != r4) goto L28
            r9 = r8
            goto L29
        L28:
            r9 = r2
        L29:
            if (r9 == 0) goto L2c
            goto L2d
        L2c:
            r3 = r1
        L2d:
            java.lang.String r9 = "transaction_id"
            if (r10 == 0) goto L37
            java.lang.String r4 = r10.getStringExtra(r9)
            goto L38
        L37:
            r4 = r1
        L38:
            if (r3 != 0) goto L3d
            java.lang.String r5 = "fail"
            goto L3e
        L3d:
            r5 = r3
        L3e:
            if (r3 == 0) goto L43
            jc1.d r3 = jc1.f.f298912a
            goto L45
        L43:
            jc1.d r3 = jc1.f.f298915d
        L45:
            jz5.l r6 = new jz5.l
            r6.<init>(r9, r4)
            jz5.l[] r9 = new jz5.l[]{r6}
            java.util.HashMap r9 = kz5.c1.i(r9)
            java.lang.String r9 = r0.q(r5, r3, r9)
            int r0 = r7.f81357c
            com.tencent.mm.plugin.appbrand.jsapi.d0 r3 = r7.f81356b
            r3.a(r0, r9)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r9 = r3.t3()
            if (r10 == 0) goto L6c
            java.lang.String r0 = "closeWindow"
            int r10 = r10.getIntExtra(r0, r2)
            if (r10 != r8) goto L6c
            r2 = r8
        L6c:
            if (r2 == 0) goto L6f
            r1 = r9
        L6f:
            if (r1 == 0) goto L74
            r1.S()
        L74:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.kc.a(int, int, android.content.Intent):boolean");
    }
}

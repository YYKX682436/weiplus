package wd1;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f526322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd1.a f526323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f526324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f526325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f526326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f526327i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f526328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f526329n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f526330o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f526331p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f526332q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ wd1.c f526333r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wd1.a aVar, int i17, int i18, int i19, int i27, int i28, int i29, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i37, wd1.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526323e = aVar;
        this.f526324f = i17;
        this.f526325g = i18;
        this.f526326h = i19;
        this.f526327i = i27;
        this.f526328m = i28;
        this.f526329n = i29;
        this.f526330o = j17;
        this.f526331p = yVar;
        this.f526332q = i37;
        this.f526333r = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wd1.b(this.f526323e, this.f526324f, this.f526325g, this.f526326h, this.f526327i, this.f526328m, this.f526329n, this.f526330o, this.f526331p, this.f526332q, this.f526333r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wd1.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f526322d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L38
        Le:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            wd1.a r15 = r14.f526323e
            if (r15 == 0) goto L3b
            int r5 = r14.f526324f
            int r6 = r14.f526325g
            int r7 = r14.f526326h
            int r8 = r14.f526327i
            int r9 = r14.f526328m
            int r10 = r14.f526329n
            long r11 = r14.f526330o
            r14.f526322d = r3
            r4 = r15
            wd1.k r4 = (wd1.k) r4
            r13 = r14
            java.lang.Object r15 = r4.b(r5, r6, r7, r8, r9, r10, r11, r13)
            if (r15 != r0) goto L38
            return r0
        L38:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            goto L3c
        L3b:
            r15 = r2
        L3c:
            jz5.f0 r0 = jz5.f0.f384359a
            wd1.c r1 = r14.f526333r
            int r3 = r14.f526332q
            com.tencent.mm.plugin.appbrand.y r4 = r14.f526331p
            java.lang.String r5 = "Luggage.JsApiOperateSnapshotWebView"
            if (r15 != 0) goto L7f
            java.lang.String r15 = "takeSnapshot fail, bitmap is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r15)
            r1.getClass()
            boolean r15 = android.text.TextUtils.isEmpty(r2)
            if (r15 == 0) goto L59
            java.lang.String r2 = "fail:internal error"
        L59:
            if (r2 != 0) goto L5d
            java.lang.String r2 = ""
        L5d:
            java.lang.String r15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r5 = "errno"
            r6 = 4
            r15.put(r5, r6)     // Catch: java.lang.Exception -> L6b
            goto L77
        L6b:
            r5 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "MicroMsg.AppBrandJsApi"
            java.lang.String r7 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r7, r5)
        L77:
            java.lang.String r15 = r1.u(r2, r15)
            r4.a(r3, r15)
            return r0
        L7f:
            int r2 = r15.getByteCount()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            r6 = 0
            r2.position(r6)
            r15.copyPixelsToBuffer(r2)
            r2.position(r6)
            gf.l0 r6 = gf.l0.f352648a
            r6.c(r15)
            int r6 = r15.getWidth()
            int r7 = r15.getHeight()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "takeSnapshot ok, bitmap is width: "
            r8.<init>(r9)
            int r9 = r15.getWidth()
            r8.append(r9)
            java.lang.String r9 = ", height:"
            r8.append(r9)
            int r15 = r15.getHeight()
            r8.append(r15)
            java.lang.String r15 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r15)
            jc1.d r15 = jc1.f.f380445a
            jz5.l r5 = new jz5.l
            java.lang.String r8 = "data"
            r5.<init>(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            jz5.l r6 = new jz5.l
            java.lang.String r8 = "width"
            r6.<init>(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            jz5.l r7 = new jz5.l
            java.lang.String r8 = "height"
            r7.<init>(r8, r2)
            jz5.l[] r2 = new jz5.l[]{r5, r6, r7}
            java.util.Map r2 = kz5.c1.k(r2)
            java.lang.String r15 = r1.x(r4, r15, r2)
            r4.a(r3, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wd1.b.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

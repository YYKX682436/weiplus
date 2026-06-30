package b54;

/* loaded from: classes4.dex */
public final class c implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb4.k f18096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab4.n0 f18098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s34.y f18099d;

    public c(eb4.k kVar, java.lang.String str, ab4.n0 n0Var, s34.y yVar) {
        this.f18096a = kVar;
        this.f18097b = str;
        this.f18098c = n0Var;
        this.f18099d = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x001c, B:5:0x002f, B:8:0x0036, B:13:0x0042, B:16:0x0049, B:19:0x0064, B:22:0x0076), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x001c, B:5:0x002f, B:8:0x0036, B:13:0x0042, B:16:0x0049, B:19:0x0064, B:22:0x0076), top: B:2:0x001c }] */
    @Override // com.tencent.mm.plugin.sns.model.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "OpFinderJsapiHandler"
            ab4.n0 r3 = r1.f18098c
            java.lang.String r4 = "follow failed"
            java.lang.String r5 = r1.f18097b
            eb4.k r6 = r1.f18096a
            b54.e r7 = b54.e.f18102a
            java.lang.String r8 = "opFinderFollow, ret="
            java.lang.String r9 = "onCallback"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opFinderFollow$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r11 = -1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L85
            r12.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Throwable -> L85
            com.tencent.mars.xlog.Log.i(r2, r8)     // Catch: java.lang.Throwable -> L85
            boolean r8 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L32
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            goto L33
        L32:
            r0 = 0
        L33:
            r8 = 0
            if (r0 == 0) goto L3f
            int r12 = r0.length()     // Catch: java.lang.Throwable -> L85
            if (r12 != 0) goto L3d
            goto L3f
        L3d:
            r12 = r8
            goto L40
        L3f:
            r12 = 1
        L40:
            if (r12 == 0) goto L49
            b54.e.a(r7, r6, r5, r11, r4)     // Catch: java.lang.Throwable -> L85
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)     // Catch: java.lang.Throwable -> L85
            return
        L49:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L85
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r13 = r3.j()     // Catch: java.lang.Throwable -> L85
            java.lang.String r14 = r3.o()     // Catch: java.lang.Throwable -> L85
            java.lang.String r15 = r3.a()     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "followRet"
            boolean r0 = r12.optBoolean(r0)     // Catch: java.lang.Throwable -> L85
            s34.y r3 = r1.f18099d
            if (r0 == 0) goto L76
            java.lang.String r0 = r3.f402829a     // Catch: java.lang.Throwable -> L85
            r17 = 0
            r18 = 3
            r16 = r0
            n74.s.b(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "ok"
            b54.e.a(r7, r6, r5, r8, r0)     // Catch: java.lang.Throwable -> L85
            goto L9b
        L76:
            java.lang.String r0 = r3.f402829a     // Catch: java.lang.Throwable -> L85
            r17 = 1
            r18 = 3
            r16 = r0
            n74.s.b(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L85
            b54.e.a(r7, r6, r5, r11, r4)     // Catch: java.lang.Throwable -> L85
            goto L9b
        L85:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "opFinderFollow, exp="
            r3.<init>(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.e(r2, r0)
            b54.e.a(r7, r6, r5, r11, r4)
        L9b:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b54.c.a(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opFinderFollow$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opFinderFollow$1");
    }
}

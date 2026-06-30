package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class d4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f160967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 f160968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff f160969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 f160970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o f160971h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 j4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f160968e = j4Var;
        this.f160969f = ffVar;
        this.f160970g = o0Var;
        this.f160971h = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d4(this.f160968e, this.f160969f, this.f160970g, this.f160971h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f160967d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r1 = r6
            goto L3a
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            com.tencent.mm.plugin.appbrand.jsapi.auth.t3 r7 = new com.tencent.mm.plugin.appbrand.jsapi.auth.t3
            com.tencent.mm.plugin.appbrand.jsapi.auth.h4 r1 = new com.tencent.mm.plugin.appbrand.jsapi.auth.h4
            com.tencent.mm.plugin.appbrand.jsapi.ff r3 = r6.f160969f
            com.tencent.mm.plugin.appbrand.jsapi.auth.o0 r4 = r6.f160970g
            com.tencent.mm.plugin.appbrand.jsapi.auth.j4 r5 = r6.f160968e
            r1.<init>(r5, r3, r4)
            r7.<init>(r1)
            r1 = r6
        L2a:
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData2.InvokeAction"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r3)
            com.tencent.mm.plugin.appbrand.jsapi.auth.f4 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f4) r7
            r1.f160967d = r2
            java.lang.Object r7 = r7.a(r1)
            if (r7 != r0) goto L3a
            return r0
        L3a:
            com.tencent.mm.plugin.appbrand.jsapi.auth.g4 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g4) r7
            com.tencent.mm.plugin.appbrand.jsapi.auth.e4 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.e4.f160982d
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r3)
            if (r3 == 0) goto L2a
            com.tencent.mm.plugin.appbrand.jsapi.auth.o r7 = r1.f160971h
            if (r7 == 0) goto L4b
            r7.a()
        L4b:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

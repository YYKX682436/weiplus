package qe;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f443446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f443447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.f f443448f;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, qe.f fVar) {
        this.f443446d = tVar;
        this.f443447e = d0Var;
        this.f443448f = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            com.tencent.mm.plugin.appbrand.jsruntime.t r1 = r0.f443446d
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.l0> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class
            com.tencent.mm.plugin.appbrand.jsruntime.u r1 = r1.h0(r2)
            java.lang.String r2 = "getAddon(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            com.tencent.mm.plugin.appbrand.jsruntime.l0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) r1
            com.tencent.mm.plugin.appbrand.jsapi.d0 r2 = r0.f443447e
            java.lang.Class<uh1.a> r3 = uh1.a.class
            com.tencent.mm.plugin.appbrand.jsapi.g0 r2 = r2.b(r3)
            uh1.a r2 = (uh1.a) r2
            qe.f r3 = r0.f443448f
            r3.f443476b = r2
            qe.f r3 = r0.f443448f
            com.tencent.mm.plugin.appbrand.jsapi.d0 r4 = r0.f443447e
            boolean r5 = r4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
            if (r5 == 0) goto L28
            goto L29
        L28:
            r4 = 0
        L29:
            r3.f443475a = r4
            boolean r3 = r2.H
            r4 = 1
            java.lang.String r5 = "selfSignedCertificates"
            if (r3 != 0) goto L42
            java.util.ArrayList r3 = r2.f509290x
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L3f
            goto L42
        L3f:
            r3 = 0
            r8 = r3
            goto L43
        L42:
            r8 = r4
        L43:
            boolean r3 = r2.H
            if (r3 == 0) goto L4c
            rc.e r3 = rc.e.f475443a
            r3.b()
        L4c:
            java.util.ArrayList r3 = r2.f509290x
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L73
            java.util.ArrayList r3 = r2.f509290x
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r3.next()
            byte[] r5 = (byte[]) r5
            rc.e r6 = rc.e.f475443a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            r6.a(r5)
            goto L5e
        L73:
            int r3 = r2.f509291y
            long r5 = (long) r3
            r9 = 1024(0x400, double:5.06E-321)
            long r5 = r5 * r9
            long r17 = r5 * r9
            int r3 = r2.f509292z
            long r5 = (long) r3
            long r5 = r5 * r9
            long r19 = r5 * r9
            qe.f r3 = r0.f443448f
            qe.f.a(r3)
            java.lang.String r3 = r2.B
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            boolean r6 = r2.f509273d
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            int r7 = r2.f509291y
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r9 = r2.f509292z
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5, r6, r7, r9}
            java.lang.String r5 = "MicroMsg.CronetHttpNativeInstallHelper"
            java.lang.String r6 = "createHttpBinding: ua=%s verifyUserCA=%b skipDomainCheck=%b maxDownloadMB=%d userVisibleMaxDownloadMB=%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r3)
            qe.f r3 = r0.f443448f
            jz5.g r3 = r3.f443477c
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            r6 = r3
            qe.c r6 = (qe.c) r6
            java.lang.String r7 = r2.B
            java.lang.String r3 = "userAgentString"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r3)
            long r9 = r1.z()
            boolean r3 = r2.f509273d
            r11 = r3 ^ 1
            java.lang.String r12 = r2.D
            java.lang.String r2 = "referer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r12, r2)
            long r13 = r1.L()
            long r15 = r1.G()
            r6.m83260xaf65a0fc(r7, r8, r9, r11, r12, r13, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.a.run():void");
    }
}

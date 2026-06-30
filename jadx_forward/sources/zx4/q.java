package zx4;

/* loaded from: classes8.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f558706d;

    /* renamed from: e, reason: collision with root package name */
    public int f558707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f558708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f558710h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f558711i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, zx4.l0 l0Var, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558708f = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f558709g = l0Var;
        this.f558710h = z17;
        this.f558711i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zx4.q(this.f558708f, this.f558709g, this.f558710h, this.f558711i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx4.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f558707e
            r2 = 3
            r3 = 2
            boolean r4 = r8.f558710h
            zx4.l0 r5 = r8.f558709g
            r6 = 1
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L89
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7a
        L24:
            java.lang.Object r1 = r8.f558706d
            com.tencent.mm.ui.widget.MMWebView r1 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5d
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = r8.f558708f
            com.tencent.mm.ui.widget.MMWebView r1 = r9.f265348f
            j62.e r9 = j62.e.g()
            com.tencent.mm.repairer.config.webview.RepairerConfigWebViewScreenshotUseXWeb r7 = new com.tencent.mm.repairer.config.webview.RepairerConfigWebViewScreenshotUseXWeb
            r7.<init>()
            int r9 = r9.c(r7)
            if (r9 != r6) goto L44
            r9 = r6
            goto L45
        L44:
            r9 = 0
        L45:
            if (r9 == 0) goto L7d
            r9 = 2022(0x7e6, float:2.833E-42)
            boolean r9 = com.p314xaae8f345.p3210x3857dc.a3.k(r9)
            if (r9 == 0) goto L7d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r8.f558706d = r1
            r8.f558707e = r6
            java.lang.Object r9 = zx4.l0.b(r5, r1, r4, r8)
            if (r9 != r0) goto L5d
            return r0
        L5d:
            zx4.o r9 = (zx4.o) r9
            boolean r2 = r9 instanceof zx4.n
            if (r2 == 0) goto L64
            goto L8b
        L64:
            java.lang.String r9 = "WebviewScreenShotHelper"
            java.lang.String r2 = "genLongScreenShotByXWeb failed, fallback to genLongScreenShot"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r2)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r9 = 0
            r8.f558706d = r9
            r8.f558707e = r3
            java.lang.Object r9 = zx4.l0.a(r5, r1, r4, r8)
            if (r9 != r0) goto L7a
            return r0
        L7a:
            zx4.o r9 = (zx4.o) r9
            goto L8b
        L7d:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r8.f558707e = r2
            java.lang.Object r9 = zx4.l0.a(r5, r1, r4, r8)
            if (r9 != r0) goto L89
            return r0
        L89:
            zx4.o r9 = (zx4.o) r9
        L8b:
            yz5.l r0 = r8.f558711i
            r0.mo146xb9724478(r9)
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zx4.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

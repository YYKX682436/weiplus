package gy4;

/* loaded from: classes5.dex */
public final class u extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f359158d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f359159e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f359160f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f359161g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f359162h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.r f359163i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.r f359164m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.r f359165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f359158d = jz5.h.b(gy4.l.f359145d);
        this.f359159e = jz5.h.b(new gy4.t(this));
        this.f359160f = jz5.h.b(new gy4.k(this));
        this.f359161g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f359162h = new java.util.concurrent.ConcurrentHashMap();
        this.f359163i = new gy4.o(this);
        this.f359164m = new gy4.p(this);
        this.f359165n = new gy4.q(this);
    }

    public final ct.q2 T6() {
        return (ct.q2) ((jz5.n) this.f359158d).mo141623x754a37bb();
    }

    public final gy4.d U6() {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return null;
        }
        return (gy4.d) m67437x4bd5310.mo140437x75286adb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d V6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) m158354x19263085;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d V6 = V6();
        boolean z17 = false;
        if ((V6 == null || (c22633x83752a59 = V6.f265348f) == null || !c22633x83752a59.mo120129xed1a21df()) ? false : true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d V62 = V6();
            if (V62 != null && V62.K) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d V63 = V6();
                if (V63 != null) {
                    V63.o8();
                }
                return true;
            }
        }
        return super.mo2274xbdc3c5dc();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r2.f359126h == true) goto L8;
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r2) {
        /*
            r1 = this;
            gy4.d r2 = r1.U6()
            if (r2 == 0) goto Lc
            boolean r2 = r2.f359126h
            r0 = 1
            if (r2 != r0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L27
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r1.V6()
            if (r2 == 0) goto L3e
            com.tencent.mm.plugin.webview.core.e3 r2 = r2.L1
            if (r2 == 0) goto L3e
            jz5.g r0 = r1.f359159e
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            mw4.p r0 = (mw4.p) r0
            r2.E(r0)
            goto L3e
        L27:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r1.V6()
            if (r2 == 0) goto L3e
            com.tencent.mm.plugin.webview.core.e3 r2 = r2.L1
            if (r2 == 0) goto L3e
            jz5.g r0 = r1.f359160f
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            mw4.p r0 = (mw4.p) r0
            r2.E(r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gy4.u.mo450x3e5a77bb(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0010, B:5:0x0016, B:9:0x001f, B:11:0x0025, B:13:0x0029, B:18:0x0037, B:20:0x003d, B:22:0x0041), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0010, B:5:0x0016, B:9:0x001f, B:11:0x0025, B:13:0x0029, B:18:0x0037, B:20:0x003d, B:22:0x0041), top: B:2:0x0010 }] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo451xac79a11b() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.WebViewChatRecordsUIC"
            java.lang.String r1 = "[onDestroy] cleaning up resources"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            ct.q2 r1 = r4.T6()
            qg5.l0 r1 = (qg5.l0) r1
            r1.ij()
            gy4.d r1 = r4.U6()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L1c
            boolean r1 = r1.f359126h     // Catch: java.lang.Exception -> L4f
            r2 = 1
            if (r1 != r2) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L37
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r4.V6()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            com.tencent.mm.plugin.webview.core.e3 r1 = r1.L1     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            jz5.g r2 = r4.f359159e     // Catch: java.lang.Exception -> L4f
            jz5.n r2 = (jz5.n) r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r2 = r2.mo141623x754a37bb()     // Catch: java.lang.Exception -> L4f
            mw4.p r2 = (mw4.p) r2     // Catch: java.lang.Exception -> L4f
            r1.M0(r2)     // Catch: java.lang.Exception -> L4f
            goto L61
        L37:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r4.V6()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            com.tencent.mm.plugin.webview.core.e3 r1 = r1.L1     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            jz5.g r2 = r4.f359160f     // Catch: java.lang.Exception -> L4f
            jz5.n r2 = (jz5.n) r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r2 = r2.mo141623x754a37bb()     // Catch: java.lang.Exception -> L4f
            mw4.p r2 = (mw4.p) r2     // Catch: java.lang.Exception -> L4f
            r1.M0(r2)     // Catch: java.lang.Exception -> L4f
            goto L61
        L4f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[onDestroy] error during cleanup: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gy4.u.mo451xac79a11b():void");
    }
}

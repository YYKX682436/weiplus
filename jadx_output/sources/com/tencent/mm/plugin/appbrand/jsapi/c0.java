package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class c0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f80144d = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f80145e = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f80146f = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f80147g = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f80148h = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f80149i = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f80150m = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f80151n = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: o, reason: collision with root package name */
    public boolean f80152o = true;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f80153p = new java.util.concurrent.atomic.AtomicBoolean(false);

    public void A(com.tencent.mm.plugin.appbrand.jsapi.y yVar) {
        this.f80150m.remove(yVar);
    }

    public void C(com.tencent.mm.plugin.appbrand.jsapi.y yVar) {
        this.f80150m.add(yVar);
    }

    public void D() {
        java.util.Iterator it = this.f80147g.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.w) it.next()).onDestroy();
        }
    }

    public void E(com.tencent.mm.plugin.appbrand.jsapi.u uVar) {
        this.f80148h.add(uVar);
    }

    public void F(com.tencent.mm.plugin.appbrand.jsapi.u uVar) {
        this.f80148h.remove(uVar);
    }

    public void G(com.tencent.mm.plugin.appbrand.jsapi.a0 a0Var) {
        this.f80144d.remove(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H() {
        /*
            r8 = this;
            java.util.Set r0 = r8.f80148h
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.appbrand.jsapi.u r3 = (com.tencent.mm.plugin.appbrand.jsapi.u) r3
            com.tencent.mm.plugin.appbrand.jsapi.webview.u$$a r3 = (com.tencent.mm.plugin.appbrand.jsapi.webview.u$$a) r3
            com.tencent.mm.plugin.appbrand.jsapi.webview.o r3 = r3.f83893a
            of1.w1 r3 = (of1.w1) r3
            boolean r4 = r3.f345036g
            r5 = 1
            if (r4 == 0) goto L20
            goto L41
        L20:
            com.tencent.mm.ui.widget.MMWebView r4 = r3.f345045s
            boolean r6 = r4.canGoBack()
            com.tencent.mm.plugin.appbrand.page.n7 r7 = r3.f345034e
            if (r6 == 0) goto L3a
            com.tencent.mm.plugin.appbrand.report.model.r0 r6 = r3.getExitReporter()
            r6.a(r7, r5)
            r4.goBack()
            of1.g1 r3 = r3.D
            r3.f344919a = r5
            r3 = r5
            goto L42
        L3a:
            com.tencent.mm.plugin.appbrand.report.model.r0 r3 = r3.getExitReporter()
            r3.a(r7, r1)
        L41:
            r3 = r1
        L42:
            if (r3 == 0) goto L8
            r2 = r5
            goto L8
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.c0.H():boolean");
    }

    public void I(com.tencent.mm.plugin.appbrand.jsapi.x xVar) {
        this.f80146f.remove(xVar);
    }

    public void J(com.tencent.mm.plugin.appbrand.jsapi.z zVar) {
        this.f80151n.add(zVar);
    }

    public void K(com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
        this.f80147g.remove(wVar);
    }

    public void N(com.tencent.mm.plugin.appbrand.jsapi.b0 b0Var) {
        if (b0Var != null) {
            this.f80149i.add(b0Var);
        }
    }

    public void O(com.tencent.mm.plugin.appbrand.jsapi.v vVar) {
        this.f80145e.remove(vVar);
    }

    public void P(com.tencent.mm.plugin.appbrand.jsapi.a0 a0Var) {
        if (a0Var == null) {
            return;
        }
        if (this.f80153p.get()) {
            a0Var.onReady();
        } else {
            this.f80144d.add(a0Var);
        }
    }

    public void Q(boolean z17) {
        boolean z18 = this.f80152o;
        if (z18 && !z17) {
            java.util.Iterator it = this.f80151n.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
        } else if (!z18 && z17) {
            java.util.Iterator it6 = this.f80150m.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.jsapi.y) it6.next()).a();
            }
        }
        this.f80152o = z17;
    }

    public void R(com.tencent.mm.plugin.appbrand.jsapi.v vVar) {
        this.f80145e.add(vVar);
    }

    public void T(com.tencent.mm.plugin.appbrand.jsapi.z zVar) {
        this.f80151n.remove(zVar);
    }

    public void U(com.tencent.mm.plugin.appbrand.jsapi.x xVar) {
        this.f80146f.add(xVar);
    }

    public void V() {
        java.util.Iterator it = this.f80145e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.v) it.next()).c();
        }
        Q(false);
    }

    public void W(com.tencent.mm.plugin.appbrand.jsapi.b0 b0Var) {
        if (b0Var != null) {
            this.f80149i.remove(b0Var);
        }
    }

    public void X() {
        this.f80144d.clear();
        this.f80147g.clear();
        this.f80145e.clear();
        this.f80146f.clear();
        this.f80148h.clear();
        this.f80149i.clear();
        this.f80151n.clear();
        this.f80150m.clear();
    }

    public void Y() {
        java.util.Iterator it = this.f80146f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.x) it.next()).b();
        }
        Q(true);
    }

    public void Z() {
        this.f80153p.set(true);
        java.util.Iterator it = this.f80144d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.a0) it.next()).onReady();
        }
    }

    public void w(com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
        this.f80147g.add(wVar);
    }

    public void z() {
        java.util.Iterator it = this.f80149i.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }
}

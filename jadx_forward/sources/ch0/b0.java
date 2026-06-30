package ch0;

/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ch0.m f122727a = new ch0.m();

    /* renamed from: b, reason: collision with root package name */
    public final ch0.l f122728b = new ch0.l();

    public final void a(tg0.c1 result, qx4.d0 jsApi) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApi, "jsApi");
        java.lang.String str = result.f500569h;
        if (e(str)) {
            return;
        }
        ch0.m mVar = this.f122727a;
        mVar.getClass();
        if (!r26.n0.N(str)) {
            mVar.f122774c = str;
        }
        java.lang.String c17 = tg0.m1.c(result);
        qx4.b l17 = jsApi.l();
        if (l17 == null || (mo9090x86b9ebe3 = l17.mo9090x86b9ebe3()) == null) {
            return;
        }
        av4.y0.f95883a.b(mo9090x86b9ebe3, "onFlutterResultReady", c17);
    }

    public final void b(tg0.c1 result, qx4.d0 jsApi) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApi, "jsApi");
        jsApi.f448930f = true;
        tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Ri, "null cannot be cast to non-null type com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene");
        tg0.f2 f2Var = tg0.g2.f500606e;
        java.lang.String b17 = tg0.m1.b(((ch0.z) Ri).b(2, result));
        qx4.b l17 = jsApi.l();
        if (l17 == null || (mo9090x86b9ebe3 = l17.mo9090x86b9ebe3()) == null) {
            return;
        }
        av4.y0.f95883a.b(mo9090x86b9ebe3, "onUiInit", b17);
    }

    public final void c(tg0.c1 result, qx4.d0 jsApi) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApi, "jsApi");
        if (e(result.f500569h)) {
            return;
        }
        ch0.m mVar = this.f122727a;
        mVar.getClass();
        jsApi.f448930f = true;
        java.lang.String str = result.f500569h;
        if (!r26.n0.N(str)) {
            mVar.f122774c = str;
        }
        tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Ri, "null cannot be cast to non-null type com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene");
        tg0.f2 f2Var = tg0.g2.f500606e;
        java.lang.String b17 = tg0.m1.b(((ch0.z) Ri).b(1, result));
        qx4.b l17 = jsApi.l();
        if (l17 == null || (mo9090x86b9ebe3 = l17.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String content = "callFlutterResultReady: consume time: " + (java.lang.System.currentTimeMillis() - result.f500578q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        av4.y0.f95883a.b(mo9090x86b9ebe3, "onUiInit", b17);
    }

    public final void d() {
        synchronized (this.f122727a) {
            ch0.m mVar = this.f122727a;
            mVar.getClass();
            mVar.f122772a = "";
            this.f122727a.f122773b = null;
        }
        ch0.m mVar2 = this.f122727a;
        mVar2.getClass();
        mVar2.f122774c = "";
    }

    public final boolean e(java.lang.String requestId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        if (r26.n0.N(requestId)) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122727a.f122774c, requestId)) {
            return false;
        }
        java.lang.String content = "h5PageCreateDataHasUsed: " + requestId + ", has used";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", content);
        return true;
    }

    public final void f(java.lang.String requestId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        synchronized (this.f122727a) {
            java.lang.String content = "setNewRequestId: ".concat(requestId);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
            ch0.m mVar = this.f122727a;
            mVar.getClass();
            mVar.f122772a = requestId;
        }
    }
}

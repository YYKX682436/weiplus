package lu4;

/* loaded from: classes7.dex */
public final class q extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lu4.r context) {
        super("wxJsEngineClient", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    public final void cgi(int i17, java.lang.String cgiUrl, java.lang.String reqProtoBuf, java.lang.String callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiUrl, "cgiUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqProtoBuf, "reqProtoBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (((lu4.r) this.f402963b).y(i17, cgiUrl)) {
            java.lang.String str = this.f402964c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do cgi cmdId=" + i17 + ", cgiUrl=" + cgiUrl);
            try {
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                byte[] bytes = reqProtoBuf.getBytes(forName);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                lVar.f152197a = new r45.fe(android.util.Base64.decode(bytes, 2));
                lVar.f152198b = new r45.ge();
                lVar.f152199c = cgiUrl;
                lVar.f152200d = i17;
                com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new lu4.o(this, i17, callback), false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "do cgi", new java.lang.Object[0]);
            }
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: commonCgi */
    public final void m146362xa770129a(java.lang.String request, java.lang.String callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402964c, "[TRACE_VIDEO_PRELOAD] jsapi cgi");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.b97();
        lVar.f152198b = new r45.c97();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/appmsg/web_comm_prefetch";
        lVar.f152200d = 4924;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WebCommPrefetchReq");
        ((r45.b97) fVar).f452175d = request;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new lu4.p(this, callback), false);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getBasePkgVersion */
    public final int m146363x8b80c413() {
        int F = ((lu4.r) this.f402963b).F();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402964c, "getBasePkgVersion = " + F);
        return F;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getBizPkgVersion */
    public final int m146364xbbb6bf29() {
        int S = ((lu4.r) this.f402963b).S();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402964c, "getBizPkgVersion = " + S);
        return S;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getLocalData */
    public final java.lang.String m146365xb79006ff(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return ((lu4.r) this.f402963b).mo54387xb79006ff(key);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: invoke */
    public final void m146366xb9724478(java.lang.String func, java.lang.String message, java.lang.String callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        lu4.b bVar = this.f402963b;
        ((lu4.r) bVar).s().c(nw4.z2.c(func, message, callback), new lu4.n(this, callback));
        ((lu4.r) bVar).I(func, message);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setLocalData */
    public final void m146367x13e3c773(java.lang.String key, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ((lu4.r) this.f402963b).mo54388x13e3c773(key, data);
    }
}

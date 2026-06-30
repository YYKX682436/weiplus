package gy4;

/* loaded from: classes5.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f359151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gy4.u uVar) {
        super(4);
        this.f359151d = uVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean z17;
        java.lang.String urlPath = (java.lang.String) obj;
        java.util.Map lowercaseHeaders = (java.util.Map) obj2;
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj3;
        com.p314xaae8f345.p3210x3857dc.x0 request = (com.p314xaae8f345.p3210x3857dc.x0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlPath, "urlPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowercaseHeaders, "lowercaseHeaders");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] start, urlPath: ".concat(urlPath));
        java.lang.String lowerCase = "File-ID-List".toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String str = (java.lang.String) lowercaseHeaders.get(lowerCase);
        java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null) : kz5.p0.f395529d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] fileIds: " + f07);
        boolean isEmpty = f07.isEmpty();
        gy4.u uVar = this.f359151d;
        if (!isEmpty) {
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                if (uVar.f359162h.containsKey((java.lang.String) it.next())) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] some fileIds already requested, return null");
            return null;
        }
        java.util.Iterator it6 = f07.iterator();
        while (it6.hasNext()) {
            uVar.f359162h.put((java.lang.String) it6.next(), java.lang.Boolean.TRUE);
        }
        uVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s0(new java.util.LinkedList((java.util.List) p3325xe03a0797.p3326xc267989b.l.f(null, new gy4.j(f07, uVar, null), 1, null)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileCdnInfos] return response with " + s0Var.m74306x746c60c1().size() + " cdn info entries");
        java.lang.String jSONObject = s0Var.mo12245xcc313de3().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return new com.p314xaae8f345.p3210x3857dc.y0("application/json", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, new java.io.ByteArrayInputStream(bytes));
    }
}

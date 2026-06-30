package mw4;

/* loaded from: classes5.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final yz5.q f413320b;

    public p(yz5.q qVar, mw4.o oVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f413320b = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, com.p314xaae8f345.p3210x3857dc.x0 request) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        yz5.q qVar = this.f413320b;
        if (qVar == null) {
            return null;
        }
        java.util.Map mo120511xaf5cb2ed = request.mo120511xaf5cb2ed();
        if (mo120511xaf5cb2ed != null) {
            map = new java.util.LinkedHashMap(kz5.b1.d(mo120511xaf5cb2ed.size()));
            for (java.util.Map.Entry entry : mo120511xaf5cb2ed.entrySet()) {
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                java.lang.String lowerCase = ((java.lang.String) key).toLowerCase(java.util.Locale.ROOT);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                map.put(lowerCase, entry.getValue());
            }
        } else {
            map = kz5.q0.f395534d;
        }
        return (com.p314xaae8f345.p3210x3857dc.y0) qVar.mo147xb9724478(webview, request, map);
    }
}

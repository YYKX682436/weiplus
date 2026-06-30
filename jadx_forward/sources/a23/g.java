package a23;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f82403a;

    public g(int i17) {
        this.f82403a = i17;
    }

    public final void a(java.lang.String word, boolean z17, int i17, int i18, java.lang.String requestId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        d(word);
        java.lang.String c17 = c(word);
        a23.e eVar = new a23.e(c17);
        eVar.f82386e = java.lang.System.currentTimeMillis() / 1000;
        eVar.f82388g = i17;
        eVar.f82389h = i18;
        java.lang.String Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(10);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Y, "getRandomString(...)");
        eVar.f82385d = Y;
        eVar.f82387f = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        java.util.List b17 = b();
        b17.add(0, eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBizClickFlow", "addSearchClickHistory: word=" + c17 + ", isLocal=" + z17 + ", scene=" + i17 + ", businesstype=" + i18 + ", requestId=" + requestId + ", historyItems=" + b17.size());
        a23.d.f82381a.a(this.f82403a, b17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final java.util.List b() {
        int i17 = 0;
        try {
            jz5.g gVar = aw4.l.f96428d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) aw4.l.f96428d).mo141623x754a37bb();
            int i18 = this.f82403a;
            java.lang.String u17 = o4Var.u(i18 != 51 ? i18 != 52 ? "websearch:history0" : "websearch:history52" : "websearch:history51", "");
            if (u17 != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(u17);
                i17 = q26.h0.z(q26.h0.w(q26.h0.v(q26.h0.p(kz5.n0.J(e06.p.m(0, jSONArray.length())), new a23.a(jSONArray)), new a23.b()), 20));
            } else {
                i17 = new java.util.ArrayList();
            }
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSBizClickFlow", e17, "Error loading history", new java.lang.Object[i17]);
            return new java.util.ArrayList();
        }
    }

    public final java.lang.String c(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        return r26.n0.u0(r26.i0.t(r26.i0.t(r26.i0.t(text, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, "", false), "\n", "", false), "\r", "", false)).toString();
    }

    public final void d(java.lang.String word) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        java.lang.String c17 = c(word);
        java.util.List b17 = b();
        int size = b17.size();
        kz5.h0.B(b17, new a23.f(c17));
        if (size != b17.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBizClickFlow", "removeSearchClickHistoryByWord: word=" + c17);
        }
        a23.d.f82381a.a(this.f82403a, b17);
    }
}

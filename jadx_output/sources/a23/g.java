package a23;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f870a;

    public g(int i17) {
        this.f870a = i17;
    }

    public final void a(java.lang.String word, boolean z17, int i17, int i18, java.lang.String requestId) {
        kotlin.jvm.internal.o.g(word, "word");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        d(word);
        java.lang.String c17 = c(word);
        a23.e eVar = new a23.e(c17);
        eVar.f853e = java.lang.System.currentTimeMillis() / 1000;
        eVar.f855g = i17;
        eVar.f856h = i18;
        java.lang.String Y = com.tencent.mm.sdk.platformtools.t8.Y(10);
        kotlin.jvm.internal.o.f(Y, "getRandomString(...)");
        eVar.f852d = Y;
        eVar.f854f = com.tencent.mm.sdk.platformtools.z.f193112h;
        java.util.List b17 = b();
        b17.add(0, eVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBizClickFlow", "addSearchClickHistory: word=" + c17 + ", isLocal=" + z17 + ", scene=" + i17 + ", businesstype=" + i18 + ", requestId=" + requestId + ", historyItems=" + b17.size());
        a23.d.f848a.a(this.f870a, b17);
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
            jz5.g gVar = aw4.l.f14895d;
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) aw4.l.f14895d).getValue();
            int i18 = this.f870a;
            java.lang.String u17 = o4Var.u(i18 != 51 ? i18 != 52 ? "websearch:history0" : "websearch:history52" : "websearch:history51", "");
            if (u17 != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(u17);
                i17 = q26.h0.z(q26.h0.w(q26.h0.v(q26.h0.p(kz5.n0.J(e06.p.m(0, jSONArray.length())), new a23.a(jSONArray)), new a23.b()), 20));
            } else {
                i17 = new java.util.ArrayList();
            }
            return i17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSBizClickFlow", e17, "Error loading history", new java.lang.Object[i17]);
            return new java.util.ArrayList();
        }
    }

    public final java.lang.String c(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        return r26.n0.u0(r26.i0.t(r26.i0.t(r26.i0.t(text, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, "", false), "\n", "", false), "\r", "", false)).toString();
    }

    public final void d(java.lang.String word) {
        kotlin.jvm.internal.o.g(word, "word");
        java.lang.String c17 = c(word);
        java.util.List b17 = b();
        int size = b17.size();
        kz5.h0.B(b17, new a23.f(c17));
        if (size != b17.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBizClickFlow", "removeSearchClickHistoryByWord: word=" + c17);
        }
        a23.d.f848a.a(this.f870a, b17);
    }
}

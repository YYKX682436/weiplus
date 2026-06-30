package a23;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, java.util.List history) {
        kotlin.jvm.internal.o.g(history, "history");
        try {
            if (history.size() > 20) {
                history.size();
            }
            java.util.List K0 = kz5.n0.K0(history, 20);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K0, 10));
            java.util.Iterator it = K0.iterator();
            while (it.hasNext()) {
                arrayList.add(((a23.e) it.next()).b());
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
            jz5.g gVar = aw4.l.f14895d;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) aw4.l.f14895d).getValue()).D(i17 != 51 ? i17 != 52 ? "websearch:history0" : "websearch:history52" : "websearch:history51", jSONArray.toString());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSBizClickFlow", e17, "", new java.lang.Object[0]);
        }
    }
}

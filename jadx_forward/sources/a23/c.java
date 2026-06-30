package a23;

/* loaded from: classes8.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(int i17, java.util.List history) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(history, "history");
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
            jz5.g gVar = aw4.l.f96428d;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) aw4.l.f96428d).mo141623x754a37bb()).D(i17 != 51 ? i17 != 52 ? "websearch:history0" : "websearch:history52" : "websearch:history51", jSONArray.toString());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSBizClickFlow", e17, "", new java.lang.Object[0]);
        }
    }
}

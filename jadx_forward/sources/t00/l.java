package t00;

/* loaded from: classes8.dex */
public final class l implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.A;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean Vi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Vi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteEcsSectionDataActionHandler", "handleAction: " + data + ",switchOn:" + Vi);
        if (!Vi) {
            callback.a();
            return;
        }
        x02.h Bi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Bi();
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeleteEcsSectionDataActionHandler", "orderAndCardCgiMgr is null");
            callback.a();
            return;
        }
        org.json.JSONArray optJSONArray = data.optJSONArray("sectionList");
        if (optJSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeleteEcsSectionDataActionHandler", "invalid keys");
            callback.a();
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            linkedList.add(java.lang.Integer.valueOf(optJSONArray.optInt(i18)));
        }
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeleteEcsSectionDataActionHandler", "section list isEmpty");
            callback.a();
            return;
        }
        int[] R0 = kz5.n0.R0(linkedList);
        t00.k kVar = new t00.k(linkedList, callback);
        x02.d dVar = new x02.d();
        dVar.f532512f = kVar;
        p3380x6a61f93.p3384xf5161200.C30567x21b1f1a0.m169972x21b0d4d3(((x02.i) Bi).m105978x2737f10(), R0, dVar);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}

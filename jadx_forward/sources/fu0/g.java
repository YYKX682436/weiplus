package fu0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final fu0.g f348311a = new fu0.g();

    public static final java.lang.Object a(fu0.g gVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gVar.getClass();
        if (list.isEmpty()) {
            return kz5.p0.f395529d;
        }
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new iu0.f(list, new java.io.File(az0.i5.f97098i, "MJPublisher/ComposingCreation"), "default_effect_", null), interfaceC29045xdcb5ca57);
    }

    public static final java.util.List b(fu0.g gVar, java.util.List list) {
        java.lang.String str;
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            try {
                i95.m c17 = i95.n0.c(q80.g0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                str = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) c17)).zj("wxalite94c410838e79a4cecb3dcd66bc6054a3", 0L, str2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.DefaultMusic", "resolveLocalIdToPath: failed, error=" + e17.getMessage());
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                arrayList.add(str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.DefaultMusic", "resolveAssetInfos: file not exists");
            }
        }
        return arrayList;
    }

    public static final void c(fu0.g gVar, yz5.l lVar, int i17, java.lang.String str) {
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.DefaultMusic", "sendError: errCode=" + i17 + ", errMsg=" + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("errMsg", str);
        lVar.mo146xb9724478(jSONObject);
    }
}

package ud3;

/* loaded from: classes7.dex */
public final class a {
    public final lc3.z a(lc3.a0 data, java.lang.String metaInstanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String optString = data.optString("instanceName", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiClearLocalDataSync", "instanceName:" + optString);
        try {
            jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString != null ? r26.n0.s0(optString, "-", optString) : null);
            if (wi6 == null) {
                return lc3.y.f399472a;
            }
            ((ue3.f) wi6).a();
            return lc3.x.f399467a;
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBGetLocalDataImpl", "clear local data oom, reason:" + e17.getMessage());
            return lc3.y.f399476e;
        }
    }
}

package ud3;

/* loaded from: classes7.dex */
public final class r {
    public final lc3.z a(lc3.a0 data, java.lang.String metaInstanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String optString = data.optString("key");
        java.lang.String optString2 = data.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String optString3 = data.optString("instanceName", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSetLocalDataSync", "key:" + optString + ",instanceName:" + optString3);
        try {
            jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString3 != null ? r26.n0.s0(optString3, "-", optString3) : null);
            if (wi6 == null) {
                return lc3.y.f399472a;
            }
            lc3.z g17 = ((ue3.f) wi6).g(optString, optString2, "String");
            lc3.z zVar = lc3.x.f399467a;
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g17, zVar) ? zVar : g17;
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBGetLocalDataImpl", "set local data oom, reason:" + e17.getMessage());
            return lc3.y.f399476e;
        }
    }
}

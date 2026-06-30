package ud3;

/* loaded from: classes7.dex */
public final class b {
    public final java.util.HashMap a(lc3.a0 data, java.lang.String metaInstanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInstanceName, "metaInstanceName");
        java.util.ArrayList arrayList = null;
        java.lang.String optString = data.optString("instanceName", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBGetLocalDataAllKeysImpl", "instanceName:" + optString);
        try {
            jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString != null ? r26.n0.s0(optString, "-", optString) : null);
            if (wi6 == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", lc3.y.f399472a);
                return hashMap;
            }
            java.lang.Object[] e17 = ((ue3.f) wi6).e();
            java.lang.Object obj = e17[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
            lc3.z zVar = (lc3.z) obj;
            lc3.z zVar2 = lc3.x.f399467a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2)) {
                java.lang.Object obj2 = e17[1];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                arrayList = (java.util.ArrayList) obj2;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2)) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("error", zVar);
                return hashMap2;
            }
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("error", zVar2);
            hashMap3.put("keys", arrayList);
            return hashMap3;
        } catch (java.lang.OutOfMemoryError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBGetLocalDataAllKeysImpl", "get local data all keys oom, reason:" + e18.getMessage());
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("error", lc3.y.f399476e);
            return hashMap4;
        }
    }
}

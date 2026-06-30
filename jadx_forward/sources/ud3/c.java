package ud3;

/* loaded from: classes7.dex */
public final class c {
    public final java.util.HashMap a(lc3.a0 data, java.lang.String metaInstanceName) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String optString = data.optString("key");
        java.lang.String str3 = null;
        java.lang.String optString2 = data.optString("instanceName", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBGetLocalDataImpl", "key:" + optString + ",instanceName:" + optString2);
        try {
            jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString2 != null ? r26.n0.s0(optString2, "-", optString2) : null);
            if (wi6 == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", lc3.y.f399472a);
                return hashMap;
            }
            java.lang.Object[] b17 = ((ue3.f) wi6).b(optString);
            java.lang.Object obj = b17[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
            lc3.z zVar = (lc3.z) obj;
            lc3.z zVar2 = lc3.x.f399467a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2)) {
                java.lang.Object obj2 = b17[1];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (java.lang.String) obj2;
            } else {
                str = null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2)) {
                java.lang.Object obj3 = b17[2];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                str2 = (java.lang.String) obj3;
            } else {
                str2 = null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2)) {
                java.lang.Object obj4 = b17[3];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                str3 = (java.lang.String) obj4;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2) && str != null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("error", zVar2);
                hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
                hashMap2.put("type", str2);
                hashMap2.put("size", str3);
                return hashMap2;
            }
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("error", zVar);
            return hashMap3;
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBGetLocalDataImpl", "get local data oom, reason:" + e17.getMessage());
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("error", lc3.y.f399476e);
            return hashMap4;
        }
    }
}

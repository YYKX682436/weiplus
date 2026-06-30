package ud3;

/* loaded from: classes7.dex */
public final class d {
    public final java.util.HashMap a(lc3.a0 data, java.lang.String metaInstanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String s07 = r26.n0.s0(metaInstanceName, "-", metaInstanceName);
        try {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            jc3.t c57 = jc3.e0.c5((jc3.e0) c17, s07, null, 2, null);
            int d17 = c57 != null ? ((ue3.f) c57).d() : 0;
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            jc3.t c58 = jc3.e0.c5((jc3.e0) c18, s07, null, 2, null);
            long c19 = c58 != null ? ((ue3.f) c58).c() : 0L;
            if (d17 < 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", lc3.y.f399472a);
                return hashMap;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("error", lc3.x.f399467a);
            hashMap2.put("size", java.lang.Integer.valueOf(d17));
            hashMap2.put("quota", java.lang.Long.valueOf(c19));
            return hashMap2;
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBGetLocalDataSizeImpl", "get local data size oom, reason:" + e17.getMessage());
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("error", lc3.y.f399476e);
            return hashMap3;
        }
    }
}

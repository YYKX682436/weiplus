package fk5;

/* loaded from: classes12.dex */
public final class y extends f65.c {

    /* renamed from: d, reason: collision with root package name */
    public static final fk5.y f345216d = new fk5.y();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f345217e = true;

    public final int c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String j17 = f9Var.j();
        if (j17 != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            ot0.q v17 = ot0.q.v(j17);
            java.lang.Integer valueOf = v17 != null ? java.lang.Integer.valueOf(v17.f430199i) : null;
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return -1;
    }

    public final void d(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(talker, j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5563x74e6cdd7 c5563x74e6cdd7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5563x74e6cdd7();
        am.ce ceVar = c5563x74e6cdd7.f135882g;
        ceVar.getClass();
        fk5.y yVar = f345216d;
        ceVar.f87881a = yVar.c(n17);
        c5563x74e6cdd7.e();
        am.de deVar = c5563x74e6cdd7.f135883h;
        java.util.Map map = deVar.f87978a;
        if (map == null || map.isEmpty()) {
            return;
        }
        java.util.Map customParams = deVar.f87978a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(customParams, "customParams");
        synchronized (yVar.f341403b) {
            if (yVar.f341403b.containsKey(java.lang.Long.valueOf(j17))) {
                java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) yVar.f341403b).get(java.lang.Long.valueOf(j17));
                if (map2 != null) {
                    map2.putAll(customParams);
                }
            } else {
                java.util.Map map3 = yVar.f341403b;
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.putAll(customParams);
                map3.put(valueOf, linkedHashMap);
            }
        }
    }

    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.util.Map params, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.util.Map b17 = b(msgInfo.m124847x74d37ac6());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5562xa7f980be c5562xa7f980be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5562xa7f980be();
        int mo78013xfb85f7b0 = msgInfo.mo78013xfb85f7b0();
        am.be beVar = c5562xa7f980be.f135881g;
        beVar.f87774a = mo78013xfb85f7b0;
        beVar.f87775b = f345216d.c(msgInfo);
        beVar.f87777d = b17;
        beVar.f87778e = params;
        beVar.f87776c = msgInfo.m124847x74d37ac6();
        beVar.f87779f = z17;
        beVar.f87780g = msgInfo.Q0();
        c5562xa7f980be.e();
        if (b17 == null || b17.isEmpty()) {
            return;
        }
        params.putAll(b17);
    }
}

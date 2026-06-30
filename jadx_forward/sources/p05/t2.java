package p05;

/* loaded from: classes5.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.t2 f432225a = new p05.t2();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        rh0.z zVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.t87 t87Var = (r45.t87) fVar.f152151d;
        java.lang.String str = p05.v2.f432238e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "CgiWeVisGetEffectConfig: " + i17 + ", " + i18);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resp: runScore: ");
            sb6.append(t87Var.f467742e);
            sb6.append(", size:");
            java.util.LinkedList<r45.r87> linkedList = t87Var.f467741d;
            sb6.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            for (r45.r87 r87Var : linkedList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p05.v2.f432238e, "resp: key:" + r87Var.f466177d + ", value:" + r87Var.f466179f + ", name:" + r87Var.f466178e + ", scene:" + r87Var.f466180g + ", device:" + r87Var.f466181h);
            }
            p05.v2 v2Var = p05.v2.f432237d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = v2Var.Bi();
            p05.p3 p3Var = p05.p3.f432172a;
            Bi.H("effect_config", pm0.v.D(t87Var));
            v2Var.Ni(t87Var, true);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p05.v2.f432242i;
            java.util.Set entrySet = concurrentHashMap.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                p05.n2 n2Var = p05.n2.f432159a;
                if (hasNext) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.Object key = entry.getKey();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                    java.lang.String str2 = (java.lang.String) key;
                    p05.v2.f432237d.getClass();
                    switch (str2.hashCode()) {
                        case -284840886:
                            if (str2.equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
                                zVar = rh0.z.f477152p;
                                break;
                            }
                            break;
                        case 3625376:
                            if (str2.equals("voip")) {
                                zVar = rh0.z.f477144e;
                                break;
                            }
                            break;
                        case 3745285:
                            if (str2.equals("zpbq")) {
                                zVar = rh0.z.f477145f;
                                break;
                            }
                            break;
                        case 1418699258:
                            if (str2.equals("livevlog")) {
                                zVar = rh0.z.f477146g;
                                break;
                            }
                            break;
                        case 1702014259:
                            if (str2.equals("livepusher")) {
                                zVar = rh0.z.f477150n;
                                break;
                            }
                            break;
                        case 2091275664:
                            if (str2.equals("sightcameracap")) {
                                zVar = rh0.z.f477149m;
                                break;
                            }
                            break;
                    }
                    zVar = null;
                    java.util.Set entrySet2 = ((java.util.concurrent.ConcurrentHashMap) entry.getValue()).entrySet();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet2, "<get-entries>(...)");
                    java.lang.String g07 = kz5.n0.g0(entrySet2, ";", null, null, 0, null, p05.u2.f432231d, 30, null);
                    if (zVar != null) {
                        n2Var.a(zVar.ordinal(), g07);
                    }
                } else if (concurrentHashMap.isEmpty()) {
                    n2Var.a(-1, "");
                }
            }
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7142x175d408b c7142x175d408b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7142x175d408b();
            if (tq5.i.f502802a == 0) {
                tq5.i.f502802a = 2014500;
            }
            c7142x175d408b.f144512d = tq5.i.f502802a;
            c7142x175d408b.f144514f = 10;
            c7142x175d408b.k();
        }
        return jz5.f0.f384359a;
    }
}

package f93;

/* loaded from: classes11.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 f341918d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12) {
        this.f341918d = activityC16168xac76ee12;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = this.f341918d;
        java.util.ArrayList P1 = wi6.P1(activityC16168xac76ee12.f224755f);
        if (P1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelEditUI", "result is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = b93.r.wi().f276538g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getNewLabelCache() called size:%s", java.lang.Integer.valueOf(hashMap.size()));
        if (hashMap.containsKey(activityC16168xac76ee12.f224755f)) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) d75.b.c(P1, 100)).iterator();
            while (it.hasNext()) {
                java.util.List list = (java.util.List) it.next();
                p75.n0 n0Var = dm.e2.N1;
                p75.d dVar = dm.e2.P1;
                p75.i0 g17 = n0Var.g(kz5.c0.i(dVar, dm.e2.X1));
                g17.f434190d = dVar.l(list);
                java.util.Iterator it6 = ((java.util.ArrayList) g17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class)).iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it6.next();
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    hashMap2.put(d17, z3Var);
                }
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap2.get((java.lang.String) it7.next());
                    if (z3Var2 != null) {
                        arrayList2.add(z3Var2);
                    }
                }
            }
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it8.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var3.D0()) && z3Var3.D0().contains(activityC16168xac76ee12.f224755f)) {
                    arrayList.add(z3Var3.d1());
                }
            }
        } else {
            arrayList.addAll(P1);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6380x9b776c73 c6380x9b776c73 = activityC16168xac76ee12.G;
        c6380x9b776c73.f137272g = c6380x9b776c73.b("CurrentLabelUinList", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";"), true);
        activityC16168xac76ee12.f224770x = arrayList;
        java.util.ArrayList arrayList3 = activityC16168xac76ee12.f224771y;
        if (arrayList3 == null) {
            activityC16168xac76ee12.f224771y = new java.util.ArrayList();
        } else {
            arrayList3.clear();
        }
        activityC16168xac76ee12.f224771y.addAll(arrayList);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16168xac76ee12.H;
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4);
        }
    }

    /* renamed from: toString */
    public java.lang.String m129218x9616526c() {
        return super.toString() + "|initView";
    }
}

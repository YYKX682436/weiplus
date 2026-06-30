package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class dq extends wu5.b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gq f242491e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Collection f242492f;

    /* renamed from: g, reason: collision with root package name */
    public int f242493g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f242494h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f242495i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f242496m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f242497n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 f242498o;

    public dq(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7, java.util.Collection collection, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gq gqVar) {
        this.f242498o = activityC17486x3b418ac7;
        this.f242492f = collection;
        this.f242491e = gqVar;
    }

    @Override // wu5.b
    public boolean b() {
        super.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gq gqVar = this.f242491e;
        if (gqVar != null) {
            this.f242498o.f242313u.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mp mpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mp) gqVar;
            mpVar.getClass();
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = mpVar.f242872a;
            activityC17486x3b418ac7.V6(false);
            activityC17486x3b418ac7.f242303h.setText(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2o) + "(" + activityC17486x3b418ac7.f242312t.size() + ")");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = activityC17486x3b418ac7.f242309q;
            if (xpVar != null) {
                xpVar.m8146xced61ae5();
            }
        }
        return false;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "delete_contact_task";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        e21.i iVar;
        r45.j25 j25Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (m1Var.mo808xfb85f7b0() != 681 || !(m1Var instanceof e21.j)) {
            return;
        }
        e21.j jVar = (e21.j) m1Var;
        e21.g gVar = jVar.f328070e;
        if (gVar == null || (iVar = gVar.f328054b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] rr is null!");
            return;
        }
        r45.i25 i25Var = iVar.f328061a;
        int i19 = i25Var.f458220d;
        if (i19 != 0 || (j25Var = i25Var.f458221e) == null || (linkedList = j25Var.f459051e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactUI", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i19));
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) jVar.f328071f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] list size:%s, result:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(linkedList.size()));
        int i27 = 0;
        while (true) {
            int size = arrayList.size();
            linkedList2 = this.f242496m;
            if (i27 >= size) {
                break;
            }
            xg3.q0 q0Var = (xg3.q0) arrayList.get(i27);
            if (q0Var.b() != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UnfamiliarContactUI", "cmdId:%s operation:%s", java.lang.Integer.valueOf(q0Var.b()), q0Var.toString());
            } else {
                this.f242493g--;
                r45.xb0 xb0Var = (r45.xb0) q0Var.f535964j;
                if (((java.lang.Integer) linkedList.get(i27)).intValue() == 0) {
                    this.f242494h++;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x51.j1.g(xb0Var.f471474d), true);
                    if (n17 != null) {
                        n17.s3();
                        c01.w9.h(n17.d1(), null);
                        de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
                        java.lang.String d17 = n17.d1();
                        ((ce0.e) jVar2).getClass();
                        com.p314xaae8f345.mm.p957x53236a1b.g1.I(d17, 15);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(n17.d1());
                        linkedList2.add(n17.d1());
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactUI", "delete contact fail! ret:%s", linkedList.get(i27), x51.j1.g(xb0Var.f471474d));
                }
            }
            i27++;
        }
        if (this.f242493g > 0) {
            return;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f242498o;
            if (!hasNext) {
                activityC17486x3b418ac7.U6(activityC17486x3b418ac7.f242312t);
                activityC17486x3b418ac7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cq(this));
                return;
            } else {
                java.lang.String str2 = (java.lang.String) it.next();
                java.util.Iterator it6 = activityC17486x3b418ac7.f242312t.iterator();
                while (it6.hasNext()) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp) it6.next()).f243333c.d1().equals(str2)) {
                        it6.remove();
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Collection collection = this.f242492f;
        this.f242493g = collection.size();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            this.f242495i++;
            int size = collection.size();
            int i17 = this.f242495i;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = this.f242498o.f242309q;
            if (xpVar != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = xpVar.x(intValue).f243333c;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
                    ((np.h) ((vg3.e4) i95.n0.c(vg3.e4.class))).wi(z3Var.d1());
                } else {
                    r45.xb0 xb0Var = new r45.xb0();
                    r45.du5 du5Var = new r45.du5();
                    java.lang.String d17 = z3Var.d1();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (d17 == null) {
                        d17 = "";
                    }
                    du5Var.f454289d = d17;
                    du5Var.f454290e = true;
                    xb0Var.f471474d = du5Var;
                    java.util.LinkedList linkedList = this.f242497n;
                    linkedList.add(new xg3.p0(4, xb0Var));
                    if (linkedList.size() % 20 == 0 || i17 == size) {
                        gm0.j1.i();
                        gm0.j1.n().f354821b.g(new e21.j(linkedList));
                        linkedList.clear();
                    }
                }
            }
        }
    }
}

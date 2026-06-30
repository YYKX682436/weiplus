package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class dd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.kd f145652d;

    public dd(com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar) {
        this.f145652d = kdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean equals;
        this.f145652d.f145823m = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145652d;
        java.util.List Z6 = kdVar.f145825o.Z6();
        if (Z6 == null) {
            kdVar.getClass();
        } else {
            kdVar.f145822i.clear();
            for (int i17 = 0; i17 < Z6.size(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) Z6.get(i17), true);
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = kdVar.f145825o;
                activityC10372xd653ffea.getClass();
                if (((activityC10372xd653ffea instanceof com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10363x24719672) || !c01.z1.J(n17.d1())) && ((!(equals = n17.d1().equals(kdVar.f145820g)) || activityC10372xd653ffea.f145516s) && !activityC10372xd653ffea.U6().contains(n17.d1()))) {
                    if (equals && activityC10372xd653ffea.f145516s) {
                        kdVar.f145822i.add(0, new com.p314xaae8f345.mm.p648x55baa833.ui.bd(activityC10372xd653ffea, 1, n17));
                    } else {
                        kdVar.f145822i.add(new com.p314xaae8f345.mm.p648x55baa833.ui.bd(activityC10372xd653ffea, 1, n17));
                    }
                }
            }
            java.util.Collections.sort(kdVar.f145822i, new com.p314xaae8f345.mm.p648x55baa833.ui.jd(kdVar));
            kdVar.f145821h = kdVar.f145822i;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar2 = this.f145652d;
        java.util.List list = kdVar2.f145822i;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            int i18 = 0;
            java.lang.String str = null;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((com.p314xaae8f345.mm.p648x55baa833.ui.bd) it.next()).f145592a;
                if (z3Var != null) {
                    java.lang.String a17 = x51.k.a(kdVar2.a(z3Var));
                    java.lang.String substring = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? "" : a17.startsWith(kdVar2.f145817d) ? "#" : a17.toUpperCase().substring(0, 1);
                    java.util.HashMap hashMap = kdVar2.f145824n;
                    if (i18 == 0) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    } else if (str != null && !substring.equals(str)) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    }
                    str = substring;
                } else {
                    str = null;
                }
                i18++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectMemberAdapter", "[load data] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p648x55baa833.ui.cd(this));
    }
}

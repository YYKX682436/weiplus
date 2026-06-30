package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.wd f146048d;

    public sd(com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar) {
        this.f146048d = wdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f146048d.f146164i = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar = this.f146048d;
        java.util.List list = wdVar.f146166n.f145530p;
        ((java.util.ArrayList) list).clear();
        android.database.Cursor L0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.z9) ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi()).L0(null);
        if (L0 != null) {
            try {
                try {
                    L0.moveToFirst();
                    while (!L0.isAfterLast()) {
                        com.p314xaae8f345.mm.p648x55baa833.ui.xd xdVar = new com.p314xaae8f345.mm.p648x55baa833.ui.xd(null);
                        xdVar.f146207c = L0.getString(0);
                        xdVar.f146206b = L0.getString(1);
                        xdVar.f146208d = L0.getInt(2);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xdVar.f146207c)) {
                            if (xdVar.f146206b.endsWith("@app")) {
                                k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(xdVar.f146206b);
                                if (Bi != null) {
                                    xdVar.f146207c = Bi.f68913x21f9b213;
                                }
                            } else {
                                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String str = xdVar.f146206b;
                                ((sg3.a) v0Var).getClass();
                                xdVar.f146207c = c01.a2.e(str);
                            }
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(xdVar.f146206b);
                        z3Var.M1(xdVar.f146207c);
                        xdVar.f146205a = z3Var;
                        ((java.util.ArrayList) list).add(xdVar);
                        L0.moveToNext();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelectServiceNotifySenderUI", e17, "", new java.lang.Object[0]);
                }
            } finally {
                L0.close();
            }
        }
        if (list == null) {
            wdVar.getClass();
        } else {
            wdVar.f146163h.clear();
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i17 >= arrayList.size()) {
                    break;
                }
                com.p314xaae8f345.mm.p648x55baa833.ui.xd xdVar2 = (com.p314xaae8f345.mm.p648x55baa833.ui.xd) arrayList.get(i17);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = xdVar2.f146205a;
                com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b = wdVar.f146166n;
                activityC10374x1787784b.getClass();
                if (!c01.z1.J(z3Var2.d1()) && ((!z3Var2.d1().equals(null) || activityC10374x1787784b.f145527m) && !new java.util.HashSet().contains(z3Var2.d1()))) {
                    wdVar.f146163h.add(xdVar2);
                }
                i17++;
            }
            java.util.Collections.sort(wdVar.f146163h, new com.p314xaae8f345.mm.p648x55baa833.ui.vd(wdVar));
            wdVar.f146162g = wdVar.f146163h;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.wd wdVar2 = this.f146048d;
        java.util.List list2 = wdVar2.f146163h;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            java.lang.String str2 = null;
            int i18 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = ((com.p314xaae8f345.mm.p648x55baa833.ui.xd) it.next()).f146205a;
                if (z3Var3 != null) {
                    java.lang.String a17 = x51.k.a(z3Var3.f2());
                    java.lang.String substring = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? "" : a17.startsWith(wdVar2.f146159d) ? "#" : a17.toUpperCase().substring(0, 1);
                    java.util.HashMap hashMap = wdVar2.f146165m;
                    if (i18 == 0) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    } else if (str2 != null && !substring.equals(str2)) {
                        hashMap.put(substring, java.lang.Integer.valueOf(i18));
                    }
                    str2 = substring;
                } else {
                    str2 = null;
                }
                i18++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifyAdapter", "[load data] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p648x55baa833.ui.rd(this));
    }
}

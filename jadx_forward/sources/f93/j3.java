package f93;

/* loaded from: classes11.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f341897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341898e;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384, boolean z17) {
        this.f341898e = viewOnCreateContextMenuListenerC16171x51fc9384;
        this.f341897d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        java.util.ArrayList f17 = b93.r.wi().f1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341898e;
        viewOnCreateContextMenuListenerC16171x51fc9384.f224805J = f17;
        if (f17 == null) {
            viewOnCreateContextMenuListenerC16171x51fc9384.f224805J = new java.util.ArrayList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData allContactLabel size:%d", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.size()));
        if (viewOnCreateContextMenuListenerC16171x51fc9384.G) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet = new java.util.HashSet(viewOnCreateContextMenuListenerC16171x51fc9384.F);
            java.util.Iterator it = viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) it.next();
                if (hashSet.contains(d4Var.f66585x70ce48ca + "")) {
                    arrayList.add(d4Var);
                }
            }
            viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.clear();
            viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.addAll(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData: filterCustomLabel size:%d", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.size()));
        }
        boolean z17 = viewOnCreateContextMenuListenerC16171x51fc9384.f224828z;
        if (z17 && viewOnCreateContextMenuListenerC16171x51fc9384.D) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i17 = 0; i17 < viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.size(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.get(i17);
                int i18 = d4Var2.f66585x70ce48ca;
                java.util.ArrayList P1 = b93.r.wi().P1(i18 + "");
                if (P1 == null || P1.size() <= 0) {
                    arrayList2.add(d4Var2);
                }
            }
            if (arrayList2.size() > 0) {
                viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.removeAll(arrayList2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData: filterContactLabel size:%d", java.lang.Integer.valueOf(arrayList2.size()));
        }
        java.util.HashSet hashSet2 = viewOnCreateContextMenuListenerC16171x51fc9384.Q;
        hashSet2.clear();
        java.util.ArrayList arrayList3 = viewOnCreateContextMenuListenerC16171x51fc9384.f224805J;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "cpan[updateData] Empty");
            if (viewOnCreateContextMenuListenerC16171x51fc9384.S) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11346, 1, 0);
                viewOnCreateContextMenuListenerC16171x51fc9384.S = false;
            }
            if (!z17) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (hashSet2 != null && hashSet2.size() > 0) {
                    java.util.Iterator it6 = hashSet2.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add((java.lang.String) it6.next());
                    }
                }
                k93.r y17 = k93.j.y(arrayList4, 10);
                int i19 = y17.f387460a;
                if (i19 > 0) {
                    k93.q qVar = new k93.q();
                    qVar.f66586x7661fe9a = viewOnCreateContextMenuListenerC16171x51fc9384.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9c);
                    qVar.f66585x70ce48ca = -1000000;
                    qVar.f66584x284d1882 = true;
                    qVar.G = i19;
                    qVar.F = y17.f387461b;
                    viewOnCreateContextMenuListenerC16171x51fc9384.E.f387432n = qVar;
                } else {
                    viewOnCreateContextMenuListenerC16171x51fc9384.E.f387432n = null;
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f93.h3(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "cpan[updateData] Normal");
        if (viewOnCreateContextMenuListenerC16171x51fc9384.S) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11346, 1, 1);
            viewOnCreateContextMenuListenerC16171x51fc9384.S = false;
        }
        java.util.ArrayList arrayList5 = viewOnCreateContextMenuListenerC16171x51fc9384.f224805J;
        if (arrayList5 != null && arrayList5.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData run: mAllContactLabel size:%d", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.size()));
            int size = viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.size();
            b93.r.wi().D0();
            java.util.HashMap hashMap2 = viewOnCreateContextMenuListenerC16171x51fc9384.N;
            hashMap2.clear();
            java.util.HashMap hashMap3 = viewOnCreateContextMenuListenerC16171x51fc9384.P;
            hashMap3.clear();
            int i27 = 0;
            while (true) {
                hashMap = viewOnCreateContextMenuListenerC16171x51fc9384.M;
                if (i27 >= size) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) viewOnCreateContextMenuListenerC16171x51fc9384.f224805J.get(i27);
                int i28 = d4Var3.f66585x70ce48ca;
                java.lang.String str = d4Var3.f66586x7661fe9a;
                java.lang.String str2 = i28 + "";
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.ContactLabelSelectUI", "updateData label error, id:%s, name:%s", str2, str);
                } else {
                    hashMap2.put(str2, str);
                    hashMap3.put(str, str2);
                }
                java.util.ArrayList P12 = b93.r.wi().P1(i28 + "");
                if (P12 == null || P12.size() <= 0) {
                    hashMap.put(java.lang.Integer.valueOf(i28), 0);
                } else {
                    hashSet2.addAll(P12);
                    hashMap.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(P12.size()));
                }
                i27++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData run finish, size of LabelCountMap:%d, LabelIdNameMap:%d, LabelNameIdMap:%d", java.lang.Integer.valueOf(hashMap.size()), java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap3.size()));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f93.i3(this));
    }

    /* renamed from: toString */
    public java.lang.String m129216x9616526c() {
        return super.toString() + "|updateData";
    }
}

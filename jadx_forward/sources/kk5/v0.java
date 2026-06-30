package kk5;

/* loaded from: classes.dex */
public final class v0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f390226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashMap f390227e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f390226d = jz5.h.b(new kk5.u0(this));
        this.f390227e = new java.util.LinkedHashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        j75.f Q6;
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectMassSendContactUIC", "onActivityResult resultCode:" + i18 + ", data:" + intent + ", requestCode:" + i17);
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List f07 = stringExtra != null ? r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null) : null;
        java.util.List<java.lang.String> list = f07 != null && (f07.isEmpty() ^ true) ? f07 : null;
        java.util.LinkedHashMap linkedHashMap = this.f390227e;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : list) {
                if (!(str == null || str.length() == 0)) {
                    if (c01.v1.B(str)) {
                        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                        java.util.List<java.lang.String> n17 = c01.v1.n(str);
                        if (n17 != null) {
                            for (java.lang.String str2 : n17) {
                                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str2) && !str2.equals(c01.z1.r()) && !r26.n0.B(str2, "openim", false)) {
                                    arrayList2.add(str2);
                                    if (!linkedHashMap.containsKey(str2)) {
                                        linkedHashMap.put(str2, 1);
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList2.add(str);
                        if (!linkedHashMap.containsKey(str)) {
                            linkedHashMap.put(str, 1);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (stringArrayListExtra != null) {
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j((java.lang.String) it.next());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
                for (java.lang.String str3 : j17) {
                    if (!linkedHashMap.containsKey(str3)) {
                        linkedHashMap.put(str3, 3);
                    }
                    if (!arrayList.contains(str3)) {
                        arrayList.add(str3);
                    }
                }
            }
        }
        if (i17 == 1) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new wi5.j0(kz5.n0.S0(arrayList), i17));
            }
        } else if (i17 == 7) {
            j75.f Q63 = Q6();
            if (Q63 != null) {
                Q63.B3(new wi5.r(kz5.n0.S0(arrayList), i17));
            }
        } else if (i17 == 8 && (Q6 = Q6()) != null) {
            Q6.B3(new wi5.j0(kz5.n0.S0(arrayList), i17));
        }
        if (i17 == 3) {
            if (stringExtra2 == null || r26.n0.N(stringExtra2)) {
                return;
            }
            for (java.lang.String str4 : r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null)) {
                if (!linkedHashMap.containsKey(str4)) {
                    linkedHashMap.put(str4, 3);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.z3(m158354x19263085(), kk5.r0.f390213d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new kk5.t0(this));
    }
}

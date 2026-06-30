package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class ma extends com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b<com.p314xaae8f345.mm.p2621x8fb0427b.oa> {
    public ma(n75.b bVar) {
        super(bVar);
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.na.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.na.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.na naVar = (com.p314xaae8f345.mm.p2621x8fb0427b.na) a17;
        naVar.getClass();
        naVar.O6(gm0.j1.u().h() + "ServiceNotifyDB-1.db");
    }

    public int X6() {
        int i17 = 0;
        try {
            l75.k0 Q4 = this.f274680g.Q4();
            if (Q4 != null) {
                i17 = Q4.mo70514xb06685ab("ServiceNotifyAggregationMsg", null, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ServiceNotifyAggregationMsgStorage", "clearData failed: " + e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "clearData delete count: " + i17);
        return i17;
    }

    public int Y6() {
        p75.n0 n0Var = dm.da.f317956n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.da.f317957o.h());
        p75.i0 g17 = dm.da.f317956n.g(linkedList);
        g17.f434190d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return g17.a().m(this.f274680g.Q4());
    }

    public int Z6() {
        p75.n0 n0Var = dm.da.f317956n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.da.f317957o.h());
        p75.m g17 = dm.da.f317959q.g(1, 1);
        p75.i0 g18 = dm.da.f317956n.g(linkedList);
        g18.f434190d = g17;
        g18.d(linkedList2);
        g18.b(linkedList3);
        return g18.a().m(this.f274680g.Q4());
    }

    public final java.lang.String a7(java.lang.String str, java.lang.String str2) {
        int indexOf;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "getDeleteItemNewClusterNote: weappMsgId " + str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || (indexOf = str.indexOf(str2)) <= -1) {
            return str;
        }
        int length = str2.length() + indexOf + 1;
        boolean z17 = length >= str.length();
        if (indexOf > 1) {
            if (z17) {
                indexOf--;
            }
            str3 = str.substring(0, indexOf);
        } else {
            str3 = "";
        }
        if (!z17) {
            str3 = str3 + str.substring(length);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "getDeleteItemNewClusterNote: " + str3);
        return str3;
    }

    public java.util.List b7(int i17, int i18) {
        p75.n0 n0Var = dm.da.f317956n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.j0 j0Var = new p75.j0(i17, i18);
        linkedList2.add(dm.da.f317957o.u());
        p75.i0 g17 = dm.da.f317956n.g(linkedList);
        g17.f434190d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(j0Var.f434200a, j0Var.f434201b);
        return g17.a().k(this.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.oa.class);
    }
}

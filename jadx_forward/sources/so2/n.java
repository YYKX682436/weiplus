package so2;

/* loaded from: classes2.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final so2.o a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        so2.o oVar = new so2.o();
        if (arrayList == null && arrayList2 == null) {
            return oVar;
        }
        if (arrayList == null && arrayList2 != null) {
            oVar.f492045a = arrayList2;
            oVar.f492047c = b(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "[updateLiveList]increment list:" + arrayList2);
            return oVar;
        }
        if (arrayList != null && arrayList2 == null) {
            oVar.f492046b = arrayList;
            oVar.f492048d = b(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "[updateLiveList]remove list:" + arrayList);
            return oVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList2);
        arrayList3.retainAll(arrayList5);
        arrayList4.removeAll(arrayList3);
        arrayList5.removeAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "[updateLiveList]mix list:" + arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "[updateLiveList]remove list:" + arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "[updateLiveList]increment list:" + arrayList5);
        oVar.f492046b = arrayList4;
        oVar.f492045a = arrayList5;
        oVar.f492048d = b(arrayList4);
        oVar.f492047c = b(arrayList5);
        return oVar;
    }

    public final java.lang.String b(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            so2.j1 j1Var = (so2.j1) it.next();
            if (j1Var instanceof so2.j1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = j1Var.f491972d.m76760x76845fea();
                jSONArray.put(m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }
}

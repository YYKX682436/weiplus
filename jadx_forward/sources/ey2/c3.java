package ey2;

/* loaded from: classes2.dex */
public final class c3 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338866e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338867f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338868g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f338869h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f338870i = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();

    public c3() {
        jz5.h.b(ey2.b3.f338860d);
    }

    public static void S6(ey2.c3 c3Var, int i17, int i18, int i19, java.util.ArrayList lastDataList, java.util.ArrayList lastSectionDataList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, int i27, r45.ha2 ha2Var, int i28, java.lang.Object obj) {
        if ((i28 & 16) != 0) {
            lastSectionDataList = new java.util.ArrayList();
        }
        if ((i28 & 32) != 0) {
            gVar = null;
        }
        if ((i28 & 64) != 0) {
            z17 = false;
        }
        if ((i28 & 128) != 0) {
            i27 = 0;
        }
        if ((i28 & 256) != 0) {
            ha2Var = null;
        }
        c3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastDataList, "lastDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastSectionDataList, "lastSectionDataList");
        c3Var.f338870i = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
        java.util.Iterator it = lastDataList.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).T0();
            }
        }
        ey2.x2 O6 = c3Var.O6(i17);
        O6.f339103c = i18;
        O6.f339104d = i19;
        O6.f339102b = lastDataList;
        O6.f339106f = (lastDataList.isEmpty() && lastSectionDataList.isEmpty()) ? ey2.z2.f339132e : ey2.z2.f339131d;
        O6.f339107g = gVar;
        O6.f339108h = z17;
        O6.f339109i = i27;
        O6.f339110j = ha2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePreloadCacheVM", "[store] tabType=" + i17 + " lastExitPosition=" + i18 + " lastExitFromTopPx=" + i19 + " refreshState=" + O6.f339106f + " subTabId:" + i27 + "asyncLoadInfoConfig: " + ha2Var + " current=" + k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, O6.f339105e / 1000));
    }

    public final java.lang.String N6(r45.dd2 dd2Var, r45.dd2 dd2Var2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : "");
        sb6.append('_');
        sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.m75939xb282bd08(0)) : "");
        return sb6.toString();
    }

    public final ey2.x2 O6(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338866e;
        if (concurrentHashMap.get(valueOf) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new ey2.x2(i17));
        }
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (ey2.x2) obj;
    }

    public final ey2.y2 P6(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338867f;
        if (concurrentHashMap.get(java.lang.Integer.valueOf(i17)) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new ey2.y2(i17));
        }
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (ey2.y2) obj;
    }

    public final boolean Q6(int i17) {
        ey2.x2 O6 = O6(i17);
        ey2.z2 z2Var = O6.f339106f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePreloadCacheVM", "isAutoRefresh " + z2Var + " tabType: " + i17);
        if (z2Var == ey2.z2.f339132e) {
            return true;
        }
        if (z2Var == ey2.z2.f339131d || z2Var == ey2.z2.f339134g) {
            if (java.lang.System.currentTimeMillis() - O6.f339105e > this.f338870i) {
                O6.f339106f = ey2.z2.f339133f;
                return true;
            }
        } else if (z2Var == ey2.z2.f339133f) {
            return true;
        }
        O6.f339106f = ey2.z2.f339134g;
        return false;
    }

    public final void R6(int i17) {
        ey2.x2 O6 = O6(i17);
        O6.f339106f = ey2.z2.f339131d;
        O6.f339105e = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePreloadCacheVM", "[markUnFocusTabType] tabType=" + i17);
    }
}

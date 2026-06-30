package vz4;

/* loaded from: classes8.dex */
public class t implements com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz4.x f523280a;

    public t(vz4.x xVar) {
        this.f523280a = xVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19534xa57d6e76 c19534xa57d6e76;
        java.lang.String str;
        boolean z17;
        java.lang.String a17;
        java.lang.String[] strArr;
        boolean z18 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd;
        vz4.x xVar = this.f523280a;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd c19535x1bd057dd = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd) obj;
            if (c19535x1bd057dd == null || (strArr = c19535x1bd057dd.f269862d) == null || strArr.length <= 0) {
                return;
            }
            for (java.lang.String str2 : strArr) {
                if (str2.equals(vz4.b.c()) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar.f523288c) && str2.equals(xVar.f523288c))) {
                    xVar.a();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    xVar.f523300o = currentTimeMillis;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "forceUpdatePageSrc, pkgId: %s, time: %d", str2, java.lang.Long.valueOf(currentTimeMillis));
                    ((java.util.HashSet) xVar.f523299n).add(str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d dVar = xVar.f523297l;
                    if (dVar != null && xVar.f523289d && !xVar.f523298m) {
                        xVar.f523298m = true;
                        dVar.a(str2);
                    }
                    if (vz4.b.c().equals(str2)) {
                        vz4.b.f523252b = true;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19534xa57d6e76) || (c19534xa57d6e76 = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19534xa57d6e76) obj) == null || (str = c19534xa57d6e76.f269858d) == null) {
            return;
        }
        if (str.equals(vz4.b.c()) || str.equals(xVar.f523288c)) {
            java.lang.String str3 = c19534xa57d6e76.f269858d;
            xVar.getClass();
            boolean z19 = c19534xa57d6e76.f269859e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "downloadPkgCpl, pkgId: %s, success: %b", str3, java.lang.Boolean.valueOf(z19));
            if (z19 && c19534xa57d6e76.f269860f && str3.equalsIgnoreCase(xVar.f523288c)) {
                xVar.a();
            }
            java.util.HashSet hashSet = (java.util.HashSet) xVar.f523299n;
            if (hashSet.contains(str3)) {
                int i17 = z19 ? 1 : 2;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - xVar.f523300o;
                java.lang.String str4 = xVar.f523286a;
                java.lang.String str5 = xVar.f523288c;
                if (str5 == null || !str5.equals(str3)) {
                    if (vz4.b.c().equals(str3)) {
                        a17 = vz4.b.a();
                        long j17 = i17;
                        z17 = z19;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("forceUpdateTime", str4, str3, a17, j17, currentTimeMillis2, null);
                        hashSet.remove(str3);
                        ((java.util.HashMap) vz4.s.f523277a).remove(str3);
                    }
                    a17 = "";
                    long j172 = i17;
                    z17 = z19;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("forceUpdateTime", str4, str3, a17, j172, currentTimeMillis2, null);
                    hashSet.remove(str3);
                    ((java.util.HashMap) vz4.s.f523277a).remove(str3);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = xVar.f523291f;
                    if (c19543x781c5eda != null) {
                        a17 = c19543x781c5eda.f269909f;
                        long j1722 = i17;
                        z17 = z19;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("forceUpdateTime", str4, str3, a17, j1722, currentTimeMillis2, null);
                        hashSet.remove(str3);
                        ((java.util.HashMap) vz4.s.f523277a).remove(str3);
                    }
                    a17 = "";
                    long j17222 = i17;
                    z17 = z19;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("forceUpdateTime", str4, str3, a17, j17222, currentTimeMillis2, null);
                    hashSet.remove(str3);
                    ((java.util.HashMap) vz4.s.f523277a).remove(str3);
                }
            } else {
                z17 = z19;
            }
            if (vz4.b.c().equals(str3) && (vz4.b.f523252b || vz4.s.f523279c == 0)) {
                vz4.b.f523252b = false;
                if (z17) {
                    vz4.b.b();
                }
            }
            if (xVar.f523297l != null && xVar.f523289d && hashSet.isEmpty()) {
                xVar.f523297l.b(z17);
            }
        }
    }
}

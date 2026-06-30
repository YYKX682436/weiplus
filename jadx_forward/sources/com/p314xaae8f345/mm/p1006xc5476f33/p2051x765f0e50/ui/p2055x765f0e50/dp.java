package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class dp implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 f242490d;

    public dp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617) {
        this.f242490d = activityC17477x76962617;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = this.f242490d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
            activityC17477x76962617.f7();
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
        activityC17477x76962617.getClass();
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k()), new java.util.AbstractMap.SimpleEntry("login_ui_version", 1)};
        java.util.HashMap hashMap = new java.util.HashMap(2);
        for (int i27 = 0; i27 < 2; i27++) {
            java.util.Map.Entry entry = entryArr[i27];
            java.lang.Object key = entry.getKey();
            java.util.Objects.requireNonNull(key);
            java.lang.Object value = entry.getValue();
            java.util.Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("logout_ack_btn", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (c01.z1.r().startsWith("wxid") && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !c01.z1.x() && ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            activityC17477x76962617.j7();
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            activityC17477x76962617.i7();
        } else {
            activityC17477x76962617.h7();
        }
    }
}

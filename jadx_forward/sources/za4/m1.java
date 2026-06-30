package za4;

/* loaded from: classes4.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f552683a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f552684b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f552685c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedHashMap f552686d;

    public m1(java.util.List list, android.content.Context context, int i17, android.view.ViewGroup viewGroup) {
        this.f552683a = list;
        this.f552684b = context;
        this.f552685c = viewGroup;
    }

    public java.util.Collection a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        java.util.LinkedHashMap linkedHashMap = this.f552686d;
        java.util.Collection values = linkedHashMap == null ? java.util.Collections.EMPTY_LIST : linkedHashMap.values();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        return values;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        java.util.List list = this.f552683a;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
            return;
        }
        if (this.f552686d == null) {
            this.f552686d = new java.util.LinkedHashMap();
        }
        for (int i17 = 0; i17 < this.f552683a.size(); i17++) {
            ab4.d0 d0Var = (ab4.d0) this.f552683a.get(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) this.f552686d.get(d0Var.f84350d);
            android.view.ViewGroup viewGroup = this.f552685c;
            if (a2Var != null) {
                a2Var.H(d0Var);
            } else {
                a2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ta.a(this.f552684b, d0Var, viewGroup, 0);
                this.f552686d.put(d0Var.f84350d, a2Var);
            }
            try {
                if (viewGroup != a2Var.x().getParent()) {
                    if (viewGroup.getChildCount() > i17) {
                        viewGroup.addView(a2Var.x(), i17);
                        a2Var.g();
                    } else {
                        viewGroup.addView(a2Var.x());
                        a2Var.g();
                    }
                }
            } catch (java.lang.Exception e17) {
                java.lang.String str = d0Var.f84350d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CompRenderer", "component may have same id %s,%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }

    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notify", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        if (list != null && !list.equals(this.f552683a)) {
            this.f552683a = list;
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notify", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        try {
            this.f552686d.remove(a2Var.z());
            this.f552685c.removeView(a2Var.q());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CompRenderer", "removeView, exp" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f264102a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f264103b = new java.util.HashMap();

    public y() {
        d();
        e();
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a aVar) {
        this.f264103b.put(java.lang.Integer.valueOf(aVar.f264092a), aVar);
    }

    public void b(int i17, java.lang.String str, boolean z17) {
        this.f264102a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z(i17, str, z17, false));
    }

    public void c(int i17, java.lang.String str, boolean z17) {
        this.f264102a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z(i17, str, z17, true));
    }

    public void d() {
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.q());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.v());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.x());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.r());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.o());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.k());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.i());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.l());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.p());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.s());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.t());
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.h());
    }

    public void e() {
        this.f264102a.clear();
        c(35, "menuItem:minimize", true);
        b(1, "menuItem:share:appMessage", false);
        b(2, "menuItem:share:timeline", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19259x34e16419 c19259x34e16419 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19259x34e16419();
        c19259x34e16419.f263649f = 3;
        c19259x34e16419.s();
        if (c19259x34e16419.f263655o) {
            b(3, "menuItem:favorite", false);
            c(12, "menuItem:editTag", false);
            c(9, "menuItem:favorite", false);
        }
        c(31, "menuItem:search", true);
        c(6, "menuItem:copyUrl", false);
        b(7, "menuItem:openWithSafari", false);
        b(27, "menuItem:finish", true);
        c(28, "menuItem:refresh", true);
        c(29, "menuItem:addShortcut", false);
    }
}

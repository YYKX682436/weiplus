package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264170a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y f264171b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f264172c;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y yVar) {
        this.f264170a = e0Var;
        this.f264171b = yVar;
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(e0Var.f488143d, i17, false);
        this.f264172c = k0Var;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.l2(this);
        k0Var.f293407o = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.m2(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.n2(this);
        k0Var.f293417v = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.o2(this);
        k0Var.D = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q2(this);
        java.util.Iterator it = yVar.f264102a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z) it.next();
            if (zVar.f264105b.equals("menuItem:share:appMessage") && !zVar.f264106c) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            uw4.u.a(e0Var.f488143d, this.f264172c, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.s2(this));
        }
        this.f264172c.v();
    }

    public void a(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z zVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264170a;
        android.content.Context context = e0Var.f488143d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y yVar = this.f264171b;
        yVar.getClass();
        if (menuItem == null) {
            return;
        }
        int itemId = menuItem.getItemId();
        java.util.Iterator it = yVar.f264102a.iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z) it.next();
            if (zVar != null && zVar.f264104a == itemId) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a) ((java.util.HashMap) yVar.f264103b).get(java.lang.Integer.valueOf(zVar.f264104a));
        if (aVar == null) {
            return;
        }
        aVar.b(context, e0Var, zVar);
    }
}

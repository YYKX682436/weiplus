package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ak implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f284904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f284905i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bk f284906m;

    public ak(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bk bkVar, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map, java.lang.String str, boolean z17, boolean z18) {
        this.f284906m = bkVar;
        this.f284900d = view;
        this.f284901e = f9Var;
        this.f284902f = map;
        this.f284903g = str;
        this.f284904h = z17;
        this.f284905i = z18;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar2;
        menuItem.getItemId();
        int itemId = menuItem.getItemId();
        boolean z17 = this.f284904h;
        java.lang.String str = this.f284903g;
        java.util.Map map = this.f284902f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bk bkVar = this.f284906m;
        if (itemId == 0) {
            if (!z17 || (asVar = bkVar.f285027d) == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.m0(bkVar.f285028e, this.f284902f, true, this.f284905i, asVar, this.f284903g, false);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.a(bkVar.f285028e, 8, map, str);
            return;
        }
        if (itemId == 1) {
            if (!z17 || (asVar2 = bkVar.f285027d) == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.m0(bkVar.f285028e, this.f284902f, false, this.f284905i, asVar2, this.f284903g, false);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.a(bkVar.f285028e, 9, map, str);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.k0(bkVar.f285028e, new java.lang.ref.WeakReference(bkVar.f285027d), this.f284900d, this.f284901e, this.f284902f, this.f284903g);
            return;
        }
        if (itemId == 8 || itemId == 9) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = bkVar.f285028e;
            java.lang.String str2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
            if (c21908xb66fd105.v0(map)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd1052 = bkVar.f285028e;
                e31.j jVar = c21908xb66fd1052.G;
                if (jVar.f328609b) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.o0(c21908xb66fd1052, map, jVar, str, 8 == menuItem.getItemId());
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.n0(c21908xb66fd1052, false, str, bkVar.f285027d);
                }
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s f202871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f202873f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f202871d = sVar;
        this.f202872e = abstractC14490x69736cb5;
        this.f202873f = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        boolean z17 = true;
        in5.s0 s0Var = this.f202873f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f202872e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar = this.f202871d;
        switch (itemId) {
            case 1:
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = sVar.f202877d;
                java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqn);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = sVar.f202877d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.l(sVar, s0Var, abstractC14490x69736cb5);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf, 1, true);
                k0Var.r(string, 17, i65.a.b(abstractActivityC21394xb3d2c0cf, 14), null);
                k0Var.f293405n = new ko2.a(1, abstractActivityC21394xb3d2c0cf, string2);
                k0Var.f293414s = new ko2.b(1, lVar);
                k0Var.v();
                return;
            case 2:
                bd2.b bVar = bd2.b.f100777a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = sVar.f202877d;
                long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
                int i18 = sVar.f202879f.f189047f;
                if (i18 != 5 && i18 != 6 && i18 != 7) {
                    z17 = false;
                }
                bVar.d(abstractActivityC21394xb3d2c0cf2, m59251x5db1b11, (r22 & 4) != 0 ? 0L : 0L, z17 ? 10001 : 91, (r22 & 16) != 0 ? false : false, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null);
                return;
            case 3:
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = sVar.f202877d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8.class)).P6(sVar.f202877d, abstractC14490x69736cb5, null, s0Var);
                return;
            case 4:
                ho2.h hVar = new ho2.h(5, xy2.c.e(sVar.f202877d), sVar.f202878e, abstractC14490x69736cb5.getFeedObject(), "FinderLocal_" + java.lang.System.nanoTime());
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = sVar.f202877d;
                hVar.t(abstractActivityC21394xb3d2c0cf3, abstractActivityC21394xb3d2c0cf3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L);
                pm0.v.T(hVar.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.n(sVar, abstractC14490x69736cb5));
                return;
            case 5:
                ho2.h hVar2 = new ho2.h(105, xy2.c.e(sVar.f202877d), sVar.f202878e, abstractC14490x69736cb5.getFeedObject(), "FinderLocal_" + java.lang.System.nanoTime());
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = sVar.f202877d;
                hVar2.t(abstractActivityC21394xb3d2c0cf4, abstractActivityC21394xb3d2c0cf4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L);
                pm0.v.T(hVar2.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.m(sVar, abstractC14490x69736cb5));
                return;
            case 6:
                ko2.e eVar = ko2.e.f391459a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf5 = sVar.f202877d;
                java.lang.String str = sVar.f202878e;
                long m59251x5db1b112 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
                ya2.b2 contact = abstractC14490x69736cb5.getContact();
                eVar.a(abstractActivityC21394xb3d2c0cf5, str, m59251x5db1b112, contact != null ? contact.D0() : "");
                return;
            default:
                return;
        }
    }
}

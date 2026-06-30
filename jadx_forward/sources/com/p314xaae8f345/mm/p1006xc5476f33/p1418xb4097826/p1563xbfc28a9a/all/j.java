package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all;

/* loaded from: classes2.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m f202617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f202618f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m mVar, in5.s0 s0Var) {
        this.f202616d = abstractC14490x69736cb5;
        this.f202617e = mVar;
        this.f202618f = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        in5.s0 s0Var = this.f202618f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m mVar = this.f202617e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f202616d;
        if (itemId == 1) {
            int i18 = abstractC14490x69736cb5.getFeedObject().m59338xecb5e178() ? 104 : 0;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = mVar.f202621d;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = mVar.f202621d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.i(mVar, s0Var, abstractC14490x69736cb5, i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 1, true);
            k0Var.r(string, 17, i65.a.b(context, 14), null);
            k0Var.f293405n = new ko2.a(1, context, string2);
            k0Var.f293414s = new ko2.b(1, iVar);
            k0Var.v();
            return;
        }
        if (itemId == 2) {
            bd2.b.f100777a.d(mVar.f202621d, abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), (r22 & 4) != 0 ? 0L : 0L, abstractC14490x69736cb5.getFeedObject().m59338xecb5e178() ? 10001 : 58, (r22 & 16) != 0 ? false : false, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null);
            return;
        }
        if (itemId == 3) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = mVar.f202621d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8.class)).P6(mVar.f202621d, abstractC14490x69736cb5, null, s0Var);
        } else {
            if (itemId != 4) {
                return;
            }
            ko2.e eVar = ko2.e.f391459a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mVar.f202621d;
            java.lang.String str = mVar.f202622e;
            long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            ya2.b2 contact = abstractC14490x69736cb5.getContact();
            eVar.a(abstractActivityC21394xb3d2c0cf, str, m59251x5db1b11, contact != null ? contact.D0() : "");
        }
    }
}

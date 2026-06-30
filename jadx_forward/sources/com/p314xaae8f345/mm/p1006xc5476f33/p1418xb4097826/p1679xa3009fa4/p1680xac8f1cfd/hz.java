package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class hz implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f216213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz f216214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f216215f;

    public hz(so2.j0 j0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar, android.content.Context context) {
        this.f216213d = j0Var;
        this.f216214e = izVar;
        this.f216215f = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar = this.f216214e;
        android.content.Context context = this.f216215f;
        so2.j0 j0Var = this.f216213d;
        if (itemId == 1) {
            r45.vx0 vx0Var = (r45.vx0) j0Var.f491971d.m75936x14adae67(0);
            if (vx0Var != null) {
                long m75942xfb822ef2 = vx0Var.m75942xfb822ef2(0);
                pq5.g l17 = new db2.b0(m75942xfb822ef2).l();
                l17.I(izVar.m158354x19263085());
                pm0.v.T(l17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fz(context, m75942xfb822ef2));
                return;
            }
            return;
        }
        if (itemId != 2) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        r45.vx0 vx0Var2 = (r45.vx0) j0Var.f491971d.m75936x14adae67(0);
        long m75942xfb822ef22 = vx0Var2 != null ? vx0Var2.m75942xfb822ef2(0) : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gz gzVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gz(izVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.q(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o17), 17);
        k0Var.f293405n = new ya2.n(1, context);
        k0Var.f293414s = new ya2.o(1, gzVar, context);
        k0Var.f293387d = new ya2.p(gzVar);
        k0Var.f293425z = new ya2.q(1, context, m75942xfb822ef22);
        k0Var.v();
    }
}

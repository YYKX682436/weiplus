package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class b10 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f215356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 f215358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f215359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f215360h;

    public b10(boolean z17, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f215356d = z17;
        this.f215357e = s0Var;
        this.f215358f = t10Var;
        this.f215359g = abstractActivityC21394xb3d2c0cf;
        this.f215360h = abstractC14490x69736cb5;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f215359g;
        boolean z17 = this.f215356d;
        if (m75939xb282bd08 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "modifyFeedBullet: isClose = " + z17 + ", resultCode = " + ret.m75939xb282bd08(1));
            db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572894cv2 : com.p314xaae8f345.mm.R.C30867xcad56011.cwd));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "modifyFeedBullet: isClose = " + z17 + ", success");
        in5.s0 s0Var = this.f215357e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
        lVarArr[1] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f215358f.f217492e;
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        lVarArr[4] = new jz5.l("playpercent", java.lang.Integer.valueOf(c15196x85976f5f != null ? c15196x85976f5f.m61479x8efd753b() : 0));
        lVarArr[5] = new jz5.l("login_mode", 1);
        lVarArr[6] = new jz5.l("screen_type", 2);
        lVarArr[7] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Integer.valueOf(!z17 ? 1 : 0));
        ((cy1.a) rVar).yj("finder_barrage_comments_switch", null, kz5.c1.k(lVarArr), 1, false);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a10(this.f215356d, this.f215360h, this.f215358f, this.f215357e, this.f215359g));
        db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572895cv3 : com.p314xaae8f345.mm.R.C30867xcad56011.cwe));
    }
}

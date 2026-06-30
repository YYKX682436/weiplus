package zl2;

/* loaded from: classes2.dex */
public final class a2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555177h;

    public a2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f555173d = context;
        this.f555174e = abstractC14490x69736cb5;
        this.f555175f = str;
        this.f555176g = h0Var;
        this.f555177h = h0Var2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        android.content.Context context = this.f555173d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555174e;
        if (valueOf != null && valueOf.intValue() == 103) {
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c61.ub.I2((c61.ub) c17, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, this.f555174e, null, 0, 0, 28, null);
            vs5.a aVar = vs5.a.f521457a;
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            aVar.a(java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null), java.lang.String.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()), abstractC14490x69736cb5.getFeedObject().getFeedObject().m76836x6c03c64c(), this.f555175f, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.t1 t1Var = ml2.t1.f409497m;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((b92.d1) zbVar).rj(t1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6());
        } else if (valueOf != null && valueOf.intValue() == 102) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(abstractC14490x69736cb5.getFeedObject().getFeedObject(), 16384);
            a17.m59422xb121f1ef(abstractC14490x69736cb5.getFeedObject().getShareScene());
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            a17.m59367x7b6790db(c1Var != null ? c1Var.f410319c3 : null);
            android.os.Bundle bundle = new android.os.Bundle();
            o25.y1 y1Var = (o25.y1) this.f555177h.f391656d;
            bundle.putInt("quick_share_item_count", y1Var != null ? ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).f270255e : 0);
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.t1 t1Var2 = ml2.t1.f409487i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((b92.d1) zbVar2).rj(t1Var2, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6());
            i95.m c18 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            c61.ub.ah((c61.ub) c18, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, a17, bundle, 0, new zl2.z1(abstractC14490x69736cb5, this.f555175f), 8, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f555176g.f391656d;
        if (k0Var != null) {
            k0Var.u();
        }
    }
}

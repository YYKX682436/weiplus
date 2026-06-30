package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ac extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc f215300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f215301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        super(0);
        this.f215300d = ncVar;
        this.f215301e = c14994x9b99c079;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ay2.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc ncVar = this.f215300d;
        if (ncVar.f216836t == null) {
            ncVar.f216836t = new ay2.v(ncVar.m80379x76847179(), pm0.v.u(this.f215301e.getFeedObject().m76784x5db1b11()));
        }
        ay2.v vVar2 = ncVar.f216836t;
        if (((vVar2 == null || vVar2.isShowing()) ? false : true) && (vVar = ncVar.f216836t) != null) {
            android.app.Activity activity = vVar.f96807d;
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, vVar.f96807d, "eye_care_reminder", "view_exp", false, kz5.b1.e(new jz5.l("feed_id", vVar.f96808e)), 8, null);
                vVar.f96813m = ay2.r.f96799e;
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                vVar.f96812i.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2n, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209159bg).mo141623x754a37bb()).r()).intValue())));
                vVar.show();
            }
        }
        return jz5.f0.f384359a;
    }
}

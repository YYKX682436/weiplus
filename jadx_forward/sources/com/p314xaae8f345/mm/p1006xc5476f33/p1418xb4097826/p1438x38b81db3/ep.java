package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class ep implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f184810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fp f184811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.n3 f184813g;

    public ep(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fp fpVar, in5.s0 s0Var, so2.n3 n3Var) {
        this.f184810d = c22699x3dcdb352;
        this.f184811e = fpVar;
        this.f184812f = s0Var;
        this.f184813g = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f184810d;
        java.lang.Object tag = c22699x3dcdb352.getTag(com.p314xaae8f345.mm.R.id.qco);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z17 = !(bool != null ? bool.booleanValue() : false);
        in5.s0 s0Var = this.f184812f;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fp fpVar = this.f184811e;
        fpVar.getClass();
        so2.n3 n3Var = this.f184813g;
        dm.pd pdVar = n3Var.f491944d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgBulletConvert", "[onLikeBullet] isLike=" + z17 + " id=" + pdVar.f66076x418206d5);
        pf5.z zVar = pf5.z.f435481a;
        boolean z18 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
        yj0Var.u0().m76109x2a50d98(pdVar.f66076x418206d5);
        nv2.x1 x1Var = z17 ? nv2.x1.f422164i : nv2.x1.f422165m;
        long j17 = pdVar.f66108x2327e25f;
        java.lang.String field_objectNonceId = pdVar.f66109x2812d6a6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_objectNonceId, "field_objectNonceId");
        int i17 = fpVar.f184937h.f185384a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp fpVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a(activityC0065xcd7aa112).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class);
        java.lang.String j18 = c14727x5e078d.j(fpVar2 != null ? fpVar2.f215950w == 1 ? 3 : 2 : 0);
        if (!hz2.d.f367846a.a("like")) {
            nv2.n1.f422084h.d(j17, null, field_objectNonceId, yj0Var, x1Var, i17, null, V6, false, null, 0, j18);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ok(z17, pdVar.f66076x418206d5);
        c22699x3dcdb352.setTag(com.p314xaae8f345.mm.R.id.qco, java.lang.Boolean.valueOf(z17));
        android.content.Context context2 = s0Var.f374654e;
        dm.pd pdVar2 = n3Var.f491944d;
        if (z17) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79758xc84e73d5);
            c22699x3dcdb352.m82040x7541828(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            int i18 = pdVar2.f66082x26b1b2e8;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            pdVar2.f66082x26b1b2e8 = i18 | 128;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            hc2.f1.d(view);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
            c22699x3dcdb352.m82040x7541828(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            int i19 = pdVar2.f66082x26b1b2e8;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            pdVar2.f66082x26b1b2e8 = i19 & (-129);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

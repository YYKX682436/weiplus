package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSeeLaterDetailUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSeeLaterDetailUI */
/* loaded from: classes2.dex */
public final class ActivityC14084xd75edc24 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int W6() {
        return nd1.f2.f72925x366c91de;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{co2.k.class, w03.n.class});
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        co2.k kVar = (co2.k) pf5.z.f435481a.a(this).a(co2.k.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = kVar.m158354x19263085();
        android.content.Intent intent = new android.content.Intent();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        vn2.u0 u0Var = vn2.u0.f519920a;
        java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime);
        java.util.ArrayList m56388xcaeb60d0 = kVar.O6().m56388xcaeb60d0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m56388xcaeb60d0.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof bo2.c) {
                arrayList.add(next);
            }
        }
        vn2.u0.f519926g = new jz5.l(valueOf, arrayList);
        intent.putExtra("key_see_later_data_key", elapsedRealtime);
        m158354x19263085.setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(stringExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ak akVar = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.O7).mo141623x754a37bb()).r()).intValue() == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ak.f191213d : null;
        pf5.z zVar = pf5.z.f435481a;
        ((w03.n) zVar.a(this).a(w03.n.class)).P6("WatchLaterList", hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            nyVar.k7(nd1.f2.f72925x366c91de, 2, akVar);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(this).c(zy2.ra.class))).f216915p = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSeeLaterDetailUI", "oldContextId=".concat(stringExtra));
        super.onCreate(bundle);
        mo54450xbf7c1df6(getIntent().hasExtra("") ? getIntent().getStringExtra("") : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqi));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zj(this));
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderWatchLaterUI);
        aVar.dk(this, "FinderWatchLaterUI");
        aVar.Tj(this, 12, 1, false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        jz5.l lVar = new jz5.l("finder_context_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        aVar.gk(this, kz5.c1.k(lVar, new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n)), new jz5.l("wl_enter_type", 1)));
    }
}

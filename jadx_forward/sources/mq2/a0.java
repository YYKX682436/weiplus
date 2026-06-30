package mq2;

/* loaded from: classes15.dex */
public final class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 f412250d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60) {
        this.f412250d = c14558x6dc32d60;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60 = this.f412250d;
        if (itemId == 1) {
            c14558x6dc32d60.f203633r = 4;
            c14558x6dc32d60.f203632q = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(c14558x6dc32d60.f203633r));
            c14558x6dc32d60.X6();
        } else if (itemId == 2) {
            c14558x6dc32d60.f203633r = 3;
            c14558x6dc32d60.f203632q = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(c14558x6dc32d60.f203633r));
            c14558x6dc32d60.X6();
        } else if (itemId == 3) {
            c14558x6dc32d60.f203633r = 1;
            c14558x6dc32d60.f203632q = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(c14558x6dc32d60.f203633r));
            c14558x6dc32d60.X6();
        } else if (itemId == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(c14558x6dc32d60.m158354x19263085(), "com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI");
            intent.putExtra("k_say_hi_type", 2);
            c14558x6dc32d60.m158354x19263085().startActivityForResult(intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14558x6dc32d60.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            gaVar.o(2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NearbyPeopleBubble");
        } else if (itemId == 5) {
            ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
            c14558x6dc32d60.f412256e = new an3.f(2, 0.0f, 0.0f, 0, 0, "", "");
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            java.lang.Object obj = c14558x6dc32d60.f412256e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.g((com.p314xaae8f345.mm.p944x882e457a.m1) obj);
            c14558x6dc32d60.f203628m = db5.e1.Q(c14558x6dc32d60.m158354x19263085(), c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.h5z), true, true, new mq2.w(c14558x6dc32d60));
        }
        rq2.u.f480422a.a(menuItem.getItemId());
    }
}

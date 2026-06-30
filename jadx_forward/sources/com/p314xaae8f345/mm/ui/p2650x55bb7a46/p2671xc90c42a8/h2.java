package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class h2 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 f283780a;

    public h2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var) {
        this.f283780a = l2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void a(android.view.View v17, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 inputItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputItem, "inputItem");
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var = this.f283780a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(l2Var.f284075e, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2) inputItem).f279944d);
        l2Var.getClass();
        de5.a.f310929a.k(5, 9, 10);
        o15.b bVar = new o15.b();
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        bVar.m126728xdc93280d(j17);
        o15.a j18 = bVar.j();
        if (j18 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", j18.u());
            intent.putExtra("kwebmap_lng", j18.w());
            intent.putExtra("kPoiid", j18.r());
            intent.putExtra("kPoiName", j18.s());
            intent.putExtra("Kwebmap_locaion", j18.l());
            intent.putExtra("kShowshare", false);
            intent.putExtra("key_is_forward_preview", true);
            j45.l.j(v17.getContext(), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var = this.f283780a;
        l2Var.getClass();
        de5.a.f310929a.k(14, 9, 10);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(view.getContext()).a(view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.f2.f283743d, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g2(l2Var, item), null);
    }
}

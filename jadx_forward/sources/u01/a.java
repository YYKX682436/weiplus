package u01;

/* loaded from: classes9.dex */
public final class a implements m31.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 f504980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f504981b;

    public a(com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f504980a = c11117x314d89f3;
        this.f504981b = abstractActivityC21394xb3d2c0cf;
    }

    @Override // m31.d
    public void a(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 item, int i17) {
        bw.j jVar;
        e31.k kVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3 = this.f504980a;
        c11117x314d89f3.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f504981b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        activity.m78545xde66c1f2(new u01.b(c11117x314d89f3, i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_data", item);
        boolean z17 = false;
        intent.putExtra("key_status_subscribed", item.f153340m == 1);
        intent.putExtra("key_from_biz", true);
        intent.putExtra("key_biz_username", c11117x314d89f3.f152394g);
        intent.putExtra("key_template_id", item.f153336f);
        intent.putExtra("key_report_info", c11117x314d89f3.f152395h);
        if (item.B && (jVar = (bw.j) i95.n0.c(bw.j.class)) != null && (kVar = c11117x314d89f3.f152390c) != null) {
            zv.o0 o0Var = (zv.o0) jVar;
            if (zv.q.f557612a.g() && ((g31.l) kVar).f349627g && o0Var.Ri(c11117x314d89f3.f152394g) && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c11117x314d89f3.f152394g, true)) != null) {
                z17 = !c01.e2.P(n17);
            }
        }
        intent.putExtra("key_should_hide_accept", z17);
        j45.l.v(activity, "com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI", intent, 1);
    }

    @Override // m31.d
    public boolean b(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f504980a.getClass();
        return item.f153340m == 1;
    }
}

package co2;

/* loaded from: classes2.dex */
public final class a implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co2.k f125314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f125315e;

    public a(co2.k kVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        this.f125314d = kVar;
        this.f125315e = c22849x81a93d25;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        boolean z17 = j5Var instanceof bo2.c;
        co2.k kVar = this.f125314d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f125325d, "click position=" + i17 + " feed:" + j5Var);
            return;
        }
        bo2.c cVar = (bo2.c) j5Var;
        long j17 = vn2.u0.f519920a.j(cVar.getFeedObject());
        if (j17 <= 0) {
            r45.no2 m76812x1c39ba23 = cVar.getFeedObject().getFeedObject().m76812x1c39ba23();
            j17 = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
        }
        long j18 = j17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f125325d, "click position=" + i17 + ",finderContextId=" + b17 + ",SeeLaterDetailFeed:" + j5Var + ", playProgress=" + j18);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = kVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((w03.n) pf5.z.f435481a.a(activity).a(w03.n.class)).f523422d = true;
        wn2.f fVar = (wn2.f) i95.n0.c(wn2.f.class);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f125315e;
        android.content.Context context = c22849x81a93d25.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fVar.Ai(context, new android.content.Intent());
        android.content.Context context2 = c22849x81a93d25.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = cVar.getFeedObject();
        int i18 = qg3.g1.f444353d;
        c03.k.b(context2, b17, feedObject, j18, false, p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, kz5.c1.k(new jz5.l("view_id", "watch_later_card"), new jz5.l("finder_context_id", b17), new jz5.l("comment_scene", java.lang.Integer.valueOf(((r45.qt2) ((jz5.n) kVar.f125326e).mo141623x754a37bb()).m75939xb282bd08(5))), new jz5.l("feed_id", pm0.v.u(j5Var.mo2128x1ed62e84())), new jz5.l("session_buffer", ((bo2.c) j5Var).getFeedObject().getFeedObject().m76829x97edf6c0())), 1, true);
        kVar.f125331m = true;
    }
}

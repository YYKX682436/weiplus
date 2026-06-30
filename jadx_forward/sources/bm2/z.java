package bm2;

/* loaded from: classes3.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a0 f104001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.x f104002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f104003f;

    public z(bm2.a0 a0Var, bm2.x xVar, dk2.vg vgVar) {
        this.f104001d = a0Var;
        this.f104002e = xVar;
        this.f104003f = vgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.a0 a0Var = this.f104001d;
        dk2.p Z6 = ((mm2.c1) a0Var.f103281e.m56788xbba4bfc0(mm2.c1.class)).Z6();
        boolean z17 = Z6.f315409e.size() < Z6.f315405a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "songId size:" + Z6.f315409e.size() + ", musicList id size:" + Z6.f315410f.size() + ", canAddMusic :" + z17);
        bm2.x xVar = this.f104002e;
        if (!z17) {
            db5.t7.m123883x26a183b(xVar.f3639x46306858.getContext(), xVar.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4x), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dk2.vg vgVar = this.f104003f;
        if (vgVar.f315789c == 51) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        vgVar.f315789c = 51;
        sf2.e0 e0Var = a0Var.f103281e;
        r45.d22 d22Var = new r45.d22();
        r45.d22 d22Var2 = vgVar.f315787a;
        java.lang.String m75945x2fec8307 = d22Var2.m75945x2fec8307(1);
        java.lang.Integer num = null;
        d22Var.set(1, m75945x2fec8307 != null ? bm2.a0.x(a0Var, m75945x2fec8307) : null);
        java.lang.String m75945x2fec83072 = d22Var2.m75945x2fec8307(2);
        d22Var.set(2, m75945x2fec83072 != null ? bm2.a0.x(a0Var, m75945x2fec83072) : null);
        d22Var.set(12, java.lang.Integer.valueOf(d22Var2.m75939xb282bd08(12)));
        d22Var.set(10, java.lang.Integer.valueOf(d22Var2.m75939xb282bd08(10)));
        d22Var.set(0, java.lang.Integer.valueOf(d22Var2.m75939xb282bd08(0)));
        d22Var.set(3, d22Var2.m75945x2fec8307(3));
        d22Var.set(4, d22Var2.m75945x2fec8307(4));
        d22Var.set(5, d22Var2.m75945x2fec8307(5));
        d22Var.set(11, java.lang.Boolean.valueOf(d22Var2.m75933x41a8a7f2(11)));
        d22Var.set(9, d22Var2.m75945x2fec8307(9));
        d22Var.set(6, java.lang.Boolean.valueOf(d22Var2.m75933x41a8a7f2(6)));
        d22Var.set(8, d22Var2.m75945x2fec8307(8));
        d22Var.set(7, d22Var2.m75945x2fec8307(7));
        dk2.vg vgVar2 = new dk2.vg(d22Var, vgVar.f315788b, vgVar.f315789c, vgVar.f315790d, vgVar.f315791e, 0L, 32, null);
        e0Var.getClass();
        ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().a(vgVar2, false);
        qo0.b bVar = qo0.b.K2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.d22 d22Var3 = vgVar2.f315787a;
        bundle.putString("PARAM_FINDER_LIVE_MUSIC_ID", dk2.q.e(d22Var3));
        e0Var.X6(bVar, bundle);
        long m75942xfb822ef2 = ((mm2.e1) e0Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        byte[] bArr = ((mm2.e1) e0Var.m56788xbba4bfc0(mm2.e1.class)).f410518o;
        java.lang.String e17 = xy2.c.e(e0Var.O6());
        long j17 = ((mm2.e1) e0Var.m56788xbba4bfc0(mm2.e1.class)).f410516m;
        r45.xl1 f17 = ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f();
        new ek2.p1(m75942xfb822ef2, bArr, e17, j17, f17, 3, new xl2.a(m75942xfb822ef2, bArr, e17, j17, f17)).l();
        df2.od odVar = (df2.od) e0Var.m56789x25fe639c(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_SetBackGroundMusic);
        }
        te2.d4 d4Var = te2.d4.f499481a;
        boolean a86 = ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).a8();
        ml2.u2[] u2VarArr = ml2.u2.f409642d;
        d4Var.a(a86, 2, dk2.q.e(d22Var3), e0Var.f488648q);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var = e0Var.f488644m;
        if (i8Var != null) {
            if (i8Var.W) {
                i17 = 4;
            } else {
                int i18 = i8Var.T;
                i17 = (i18 < 0 || i18 >= i8Var.X.size()) ? 0 : ((te2.u1) i8Var.X.get(i8Var.T)).m166331xfb85f7b0().f471622d;
            }
            num = java.lang.Integer.valueOf(i17);
        }
        jSONObject.put("tab_type", num);
        jSONObject.put("base_listenid", d22Var3.m75945x2fec8307(9));
        java.lang.String str = e0Var.f488648q;
        if (!(str == null || str.length() == 0)) {
            jSONObject.put("ai_msg_id", e0Var.f488648q);
        }
        if (dk2.ef.f314905a.x()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 48L, jSONObject.toString(), null, 4, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = xVar.f103956g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "<get-musicFavTips>(...)");
        a0Var.y(c22699x3dcdb352, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$bindMusicItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

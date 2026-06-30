package dl2;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f316770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14280x3e20d3e4 f316771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.aw1 f316772f;

    public l0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14280x3e20d3e4 c14280x3e20d3e4, r45.aw1 aw1Var) {
        this.f316770d = h0Var;
        this.f316771e = c14280x3e20d3e4;
        this.f316772f = aw1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.aw1 aw1Var = (r45.aw1) this.f316770d.f391656d;
        id2.v1.N = aw1Var != null ? aw1Var.m75939xb282bd08(0) : 0;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        id2.v1.P = e1Var != null ? e1Var.f410518o : null;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = 0;
        id2.v1.Q = e1Var2 != null ? e1Var2.f410516m : 0L;
        mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var3 != null && (nw1Var = e1Var3.f410521r) != null) {
            j17 = nw1Var.m75942xfb822ef2(0);
        }
        id2.v1.R = j17;
        gk2.e eVar = dk2.ef.I;
        id2.v1.S = eVar != null ? zl2.r4.f555483a.b0(eVar) : 2;
        mm2.e1 e1Var4 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var4 == null || (str = e1Var4.f410525v) == null) {
            str = "";
        }
        id2.v1.T = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14280x3e20d3e4 c14280x3e20d3e4 = this.f316771e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14280x3e20d3e4.f196296d, "FinderLiveGiftPkgUIC.currentLevel = " + id2.v1.N);
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.P5).mo141623x754a37bb()).r()).booleanValue()) {
            android.app.Activity activity = (android.app.Activity) com.p314xaae8f345.mm.app.w.INSTANCE.i().get();
            if (activity != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).pj(activity, null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str2 = c14280x3e20d3e4.f196296d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url: ");
        r45.aw1 aw1Var2 = this.f316772f;
        sb6.append(aw1Var2.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        java.lang.String u07 = zl2.r4.f555483a.u0(aw1Var2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", u07);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(c14280x3e20d3e4.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1016);
        mm2.s2 s2Var = (mm2.s2) efVar.i(mm2.s2.class);
        if (s2Var != null && (c14227x4262fb44 = s2Var.f410937f) != null) {
            c14227x4262fb44.mo7808x76db6cb1(new mm2.q2(false, 0, 2, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

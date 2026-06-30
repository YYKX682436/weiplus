package bg2;

/* loaded from: classes2.dex */
public final class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f102116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c f102117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102118f;

    public v7(bg2.l8 l8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c c14214xfa60143c, int i17) {
        this.f102116d = l8Var;
        this.f102117e = c14214xfa60143c;
        this.f102118f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveSatisfactionQuestController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.l8 l8Var = this.f102116d;
        bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
        boolean z17 = false;
        if (a5Var != null && !a5Var.a7(this.f102117e)) {
            z17 = true;
        }
        int i17 = this.f102118f;
        if (z17) {
            tc2.g gVar = l8Var.f498674d;
            in5.s0 s0Var = gVar.f498682i;
            android.content.Context context = s0Var != null ? s0Var.f374654e : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l8Var.f101807e, "[showSatisfactionReasons], context:" + context + ", satisfactionType:" + i17);
            if (context != null && (y0Var = gVar.f498680g) != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new bg2.k8(l8Var, context, i17, null), 2, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l8Var.f101807e, "toast already runing dismiss anim, can not open bottom sheet");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.M2, kz5.c1.l(new jz5.l("liveId", bg2.l8.Z6(l8Var)), new jz5.l("feedId", bg2.l8.Y6(l8Var)), new jz5.l("panel_sence", "1"), new jz5.l("survey_select", java.lang.String.valueOf(i17))), null, null, null, null, false, 124, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveSatisfactionQuestController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

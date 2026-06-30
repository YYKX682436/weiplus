package bg2;

/* loaded from: classes2.dex */
public final class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView f20584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20585f;

    public v7(bg2.l8 l8Var, com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView finderLiveFeedToastView, int i17) {
        this.f20583d = l8Var;
        this.f20584e = finderLiveFeedToastView;
        this.f20585f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kotlinx.coroutines.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveSatisfactionQuestController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.l8 l8Var = this.f20583d;
        bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
        boolean z17 = false;
        if (a5Var != null && !a5Var.a7(this.f20584e)) {
            z17 = true;
        }
        int i17 = this.f20585f;
        if (z17) {
            tc2.g gVar = l8Var.f417141d;
            in5.s0 s0Var = gVar.f417149i;
            android.content.Context context = s0Var != null ? s0Var.f293121e : null;
            com.tencent.mars.xlog.Log.i(l8Var.f20274e, "[showSatisfactionReasons], context:" + context + ", satisfactionType:" + i17);
            if (context != null && (y0Var = gVar.f417147g) != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new bg2.k8(l8Var, context, i17, null), 2, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i(l8Var.f20274e, "toast already runing dismiss anim, can not open bottom sheet");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.M2, kz5.c1.l(new jz5.l("liveId", bg2.l8.Z6(l8Var)), new jz5.l("feedId", bg2.l8.Y6(l8Var)), new jz5.l("panel_sence", "1"), new jz5.l("survey_select", java.lang.String.valueOf(i17))), null, null, null, null, false, 124, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveSatisfactionQuestController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

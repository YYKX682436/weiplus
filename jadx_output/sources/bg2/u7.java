package bg2;

/* loaded from: classes2.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lu5 f20557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20558f;

    public u7(bg2.l8 l8Var, r45.lu5 lu5Var, android.content.Context context) {
        this.f20556d = l8Var;
        this.f20557e = lu5Var;
        this.f20558f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView finderLiveFeedToastView;
        android.content.Context context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveSatisfactionQuestController$genSatisfactionView$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.L2;
        bg2.l8 l8Var = this.f20556d;
        jz5.l lVar = new jz5.l("liveId", bg2.l8.Z6(l8Var));
        jz5.l lVar2 = new jz5.l("feedId", bg2.l8.Y6(l8Var));
        jz5.l lVar3 = new jz5.l("panel_sence", "1");
        r45.lu5 lu5Var = this.f20557e;
        zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVar, lVar2, lVar3, new jz5.l("survey_select", java.lang.String.valueOf(lu5Var.getInteger(0)))), null, null, null, null, false, 124, null);
        int integer = lu5Var.getInteger(0);
        in5.s0 s0Var = l8Var.f417141d.f417149i;
        if (s0Var == null || (context = s0Var.f293121e) == null) {
            finderLiveFeedToastView = null;
        } else {
            finderLiveFeedToastView = new com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView(context);
            finderLiveFeedToastView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
            java.lang.String string = context.getString(com.tencent.mm.R.string.loi);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            finderLiveFeedToastView.setTitle(string);
            if (integer != 1) {
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.loh);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                finderLiveFeedToastView.setDesc(string2);
                finderLiveFeedToastView.setDescClickListener(new bg2.v7(l8Var, finderLiveFeedToastView, integer));
            }
        }
        com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView finderLiveFeedToastView2 = finderLiveFeedToastView;
        if (finderLiveFeedToastView2 != null) {
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, ((java.lang.Number) ((jz5.n) l8Var.f20280n).getValue()).intValue(), 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            android.view.animation.AnimationSet animationSet2 = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(300L);
            animationSet2.addAnimation(alphaAnimation2);
            bg2.r4 r4Var = new bg2.r4(finderLiveFeedToastView2, animationSet, animationSet2, l8Var.f20283q, new bg2.t7(l8Var, lu5Var, this.f20558f));
            bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
            if (a5Var != null) {
                a5Var.e7(r4Var);
            }
            l8Var.f20288v = true;
            l8Var.f20289w = java.lang.Integer.valueOf(lu5Var.getInteger(0));
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.I2, kz5.c1.l(new jz5.l("liveId", bg2.l8.Z6(l8Var)), new jz5.l("feedId", bg2.l8.Y6(l8Var)), new jz5.l("panel_sence", "1"), new jz5.l("survey_select", java.lang.String.valueOf(lu5Var.getInteger(0)))), null, null, null, null, false, 124, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveSatisfactionQuestController$genSatisfactionView$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

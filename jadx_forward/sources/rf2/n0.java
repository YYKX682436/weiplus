package rf2;

/* loaded from: classes10.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476359e;

    public n0(android.view.View view, rf2.v0 v0Var) {
        this.f476358d = view;
        this.f476359e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f476358d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rf2.v0 v0Var = this.f476359e;
        v0Var.f476450d = null;
        df2.un unVar = v0Var.f476448b;
        java.lang.String str = unVar.f313072m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "backToMainPage");
        r45.g02 g02Var = (r45.g02) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.v4) unVar.m56788xbba4bfc0(mm2.v4.class)).f411010g).mo144003x754a37bb();
        if (g02Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "backToMainPage but metaInfo null");
            unVar.Z6();
        } else {
            android.view.View view3 = unVar.f313073n;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "backToMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "backToMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rf2.o1 o1Var = unVar.f313074o;
            if (o1Var != null) {
                o1Var.b(g02Var, false, true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

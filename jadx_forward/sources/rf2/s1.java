package rf2;

/* loaded from: classes10.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476422f;

    public s1(android.view.View view, rf2.c2 c2Var, java.lang.String str) {
        this.f476420d = view;
        this.f476421e = c2Var;
        this.f476422f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f476420d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rf2.c2 c2Var = this.f476421e;
        c2Var.f476220i = null;
        df2.un unVar = c2Var.f476213b;
        java.lang.String str = this.f476422f;
        if (str == null) {
            str = "";
        }
        unVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(unVar.f313072m, "backToLottery ".concat(str));
        android.view.View view3 = unVar.f313073n;
        if (view3 != null) {
            if (unVar.f313075p == null) {
                unVar.f313075p = new rf2.v0(view3, unVar);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = unVar.f313077r;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new df2.mn(unVar, str, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

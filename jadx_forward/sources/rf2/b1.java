package rf2;

/* loaded from: classes10.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f476194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.w0 f476196f;

    public b1(r45.dm4 dm4Var, rf2.o1 o1Var, rf2.w0 w0Var) {
        this.f476194d = dm4Var;
        this.f476195e = o1Var;
        this.f476196f = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        r45.dm4 dm4Var = this.f476194d;
        if (dm4Var == null || (str = dm4Var.f454108m) == null) {
            str = "";
        }
        tVar.e(str, 25, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.o1 o1Var = this.f476195e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f476371c, "lotteryBtn clicked");
        if (!rf2.o1.a(o1Var)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f476196f.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new rf2.a1(o1Var, dm4Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

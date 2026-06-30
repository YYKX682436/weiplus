package rf2;

/* loaded from: classes10.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f476225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.w0 f476226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476227f;

    public d1(r45.dm4 dm4Var, rf2.w0 w0Var, rf2.o1 o1Var) {
        this.f476225d = dm4Var;
        this.f476226e = w0Var;
        this.f476227f = o1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        r45.dm4 dm4Var = this.f476225d;
        tVar.e((dm4Var == null || (str2 = dm4Var.f454108m) == null) ? "" : str2, 23, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : (dm4Var == null || (str = dm4Var.f454106h) == null) ? "" : str, (r13 & 16) != 0 ? null : null);
        rf2.w0 w0Var = this.f476226e;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = w0Var.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new rf2.c1(this.f476227f, dm4Var, w0Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

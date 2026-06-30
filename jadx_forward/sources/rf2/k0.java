package rf2;

/* loaded from: classes10.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476320f;

    public k0(r45.f02 f02Var, rf2.v0 v0Var, android.view.View view) {
        this.f476318d = f02Var;
        this.f476319e = v0Var;
        this.f476320f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        r45.f02 f02Var = this.f476318d;
        java.lang.String str = f02Var.f455411d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 2, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.v0 v0Var = this.f476319e;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = v0Var.f476448b.f313077r;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new rf2.j0(v0Var, f02Var, this.f476320f, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

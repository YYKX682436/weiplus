package rf2;

/* loaded from: classes10.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f476293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.pl4 f476294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476295h;

    public h0(r45.f02 f02Var, rf2.v0 v0Var, boolean z17, r45.pl4 pl4Var, android.view.View view) {
        this.f476291d = f02Var;
        this.f476292e = v0Var;
        this.f476293f = z17;
        this.f476294g = pl4Var;
        this.f476295h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        java.lang.String str = this.f476291d.f455411d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 27, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.v0 v0Var = this.f476292e;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = v0Var.f476448b.f313077r;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new rf2.g0(this.f476293f, v0Var, this.f476294g, this.f476291d, this.f476295h, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

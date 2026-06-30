package rf2;

/* loaded from: classes10.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476264e;

    public f0(r45.f02 f02Var, rf2.v0 v0Var) {
        this.f476263d = f02Var;
        this.f476264e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        r45.f02 f02Var = this.f476263d;
        java.lang.String str = f02Var.f455411d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 2, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        this.f476264e.f476448b.b7(f02Var.f455411d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

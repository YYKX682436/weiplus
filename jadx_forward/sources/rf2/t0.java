package rf2;

/* loaded from: classes10.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pl4 f476425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476426f;

    public t0(rf2.v0 v0Var, r45.pl4 pl4Var, r45.f02 f02Var) {
        this.f476424d = v0Var;
        this.f476425e = pl4Var;
        this.f476426f = f02Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.v0.c(this.f476424d, this.f476425e);
        rf2.t tVar = rf2.t.f476423a;
        java.lang.String str = this.f476426f.f455411d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 29, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

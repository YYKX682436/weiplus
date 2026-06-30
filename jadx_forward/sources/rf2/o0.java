package rf2;

/* loaded from: classes10.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fm4 f476367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476368e;

    public o0(r45.fm4 fm4Var, rf2.v0 v0Var) {
        this.f476367d = fm4Var;
        this.f476368e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        ml2.f4 f4Var = ml2.f4.f408964e;
        r45.fm4 fm4Var = this.f476367d;
        r45.dd5 dd5Var = fm4Var.f455982h;
        java.lang.String str3 = "";
        if (dd5Var == null || (str = dd5Var.f453860e) == null) {
            str = "";
        }
        if (dd5Var != null && (str2 = dd5Var.f453859d) != null) {
            str3 = str2;
        }
        tVar.g(1024, str, str3);
        rf2.v0.d(this.f476368e, fm4Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

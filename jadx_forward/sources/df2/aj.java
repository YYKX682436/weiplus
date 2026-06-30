package df2;

/* loaded from: classes3.dex */
public final class aj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f311259d;

    public aj(df2.oj ojVar) {
        this.f311259d = ojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$bubble$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.oj ojVar = this.f311259d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "bubble click");
        ojVar.k7(r45.r84.ClickController, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$bubble$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

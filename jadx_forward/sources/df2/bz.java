package df2;

/* loaded from: classes3.dex */
public final class bz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.aq4 f311367e;

    public bz(df2.lz lzVar, r45.aq4 aq4Var) {
        this.f311366d = lzVar;
        this.f311367e = aq4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ShareDiscountBubbleController$onMoneyOffInfoUpdated$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f311366d.d7(this.f311367e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ShareDiscountBubbleController$onMoneyOffInfoUpdated$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

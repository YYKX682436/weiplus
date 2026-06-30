package zu2;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.o f557249d;

    public k(zu2.o oVar) {
        this.f557249d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu2.o oVar = this.f557249d;
        zu2.o.b(oVar);
        oVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

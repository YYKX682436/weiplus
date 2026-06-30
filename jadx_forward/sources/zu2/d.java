package zu2;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.o f557242d;

    public d(zu2.o oVar) {
        this.f557242d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu2.o oVar = this.f557242d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f557257e, "doUninterest");
        oVar.f557256d.b(oVar.f557261i);
        android.app.Activity activity = oVar.f557253a;
        db5.t7.h(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ck6));
        oVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

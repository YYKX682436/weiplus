package m31;

/* loaded from: classes8.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.c0 f404774d;

    public z(m31.c0 c0Var) {
        this.f404774d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgForceNotifyGuideBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f404774d.dismiss();
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgForceNotifyGuideBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

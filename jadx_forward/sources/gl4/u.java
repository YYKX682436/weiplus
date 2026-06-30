package gl4;

/* loaded from: classes.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f354416d;

    public u(android.view.View.OnClickListener onClickListener) {
        this.f354416d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTipsDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "showTipsDialog clickSubBtn");
        android.view.View.OnClickListener onClickListener = this.f354416d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTipsDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

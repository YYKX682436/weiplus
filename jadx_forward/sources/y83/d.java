package y83;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb f541515d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb) {
        this.f541515d = c16155xa1f2bfdb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KidsWatchHeadComponent", "click help icon");
        a93.a aVar = a93.a.f83962a;
        android.content.Context context = this.f541515d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        aVar.b(context, "wxaaff6b96fc2cd3c6", "pages/help/help.html", bb1.d.f4183x366c91de, "1");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent$prepareViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package k13;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.x f384801e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6, k13.x xVar) {
        this.f384800d = activityC15562xa7b84ac6;
        this.f384801e = xVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384800d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15562xa7b84ac6.f218868d, "OnLongClick!");
        rl5.r rVar = new rl5.r(activityC15562xa7b84ac6.mo55332x76847179());
        k13.x xVar = this.f384801e;
        int[] iArr = activityC15562xa7b84ac6.f218874m;
        rVar.g(view, 0, 0L, xVar, xVar, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

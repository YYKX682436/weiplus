package k13;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.x f384808e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6, k13.x xVar) {
        this.f384807d = activityC15562xa7b84ac6;
        this.f384808e = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f384807d.f218868d;
        k13.x xVar = this.f384808e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resetView onClick! username:%s", xVar.f384814h);
        ((h13.l0) i95.n0.c(h13.l0.class)).fj(xVar.f384814h);
        xVar.f384813g.animate().rotation(360.0f).setDuration(300L).withEndAction(new k13.v(xVar)).start();
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

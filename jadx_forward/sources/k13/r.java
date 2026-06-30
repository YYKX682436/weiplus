package k13;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 f384794d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057) {
        this.f384794d = activityC15561x6c397057;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057 = this.f384794d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15561x6c397057.f218865d, "Cancel!");
        activityC15561x6c397057.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

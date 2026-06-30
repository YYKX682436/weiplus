package mo1;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 f411872d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 activityC12851x5f788c81) {
        this.f411872d = activityC12851x5f788c81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.f174245o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop task, pkgId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 activityC12851x5f788c81 = this.f411872d;
        sb6.append(activityC12851x5f788c81.f174246d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", sb6.toString());
        qo1.j1.f447056a.i(activityC12851x5f788c81.f174246d);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

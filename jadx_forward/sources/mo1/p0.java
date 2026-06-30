package mo1;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 f411853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f411854e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 activityC12851x5f788c81, qo1.f0 f0Var) {
        this.f411853d = activityC12851x5f788c81;
        this.f411854e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateErrorState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.f174245o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "restart task, pkgId=" + this.f411853d.f174246d);
        this.f411854e.mo160577x68ac462();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateErrorState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

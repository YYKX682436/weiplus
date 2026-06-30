package k13;

/* loaded from: classes10.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.c f384759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 f384760e;

    public j0(i13.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965) {
        this.f384759d = cVar;
        this.f384760e = activityC15563xb39a5965;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i13.c cVar = this.f384759d;
        if (cVar instanceof i13.p) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            long j17 = 1000;
            sb6.append(((i13.p) cVar).f368849n / j17);
            sb6.append(((i13.p) cVar).f368846h);
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ai(cVar.f368808d, sb6.toString(), 2, c01.id.c() / j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965 = this.f384760e;
        activityC15563xb39a5965.finish();
        activityC15563xb39a5965.f218883p = false;
        activityC15563xb39a5965.f218884q = false;
        activityC15563xb39a5965.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

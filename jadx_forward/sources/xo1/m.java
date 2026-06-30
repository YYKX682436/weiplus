package xo1;

/* loaded from: classes.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d f537294d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d) {
        this.f537294d = activityC12862xdeb2e81d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f537294d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

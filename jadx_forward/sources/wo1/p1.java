package wo1;

/* loaded from: classes5.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec f529543d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec c12860xe75b74ec) {
        this.f529543d = c12860xe75b74ec;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.b4 b4Var;
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/TaskStatusCardView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec c12860xe75b74ec = this.f529543d;
        if (!c12860xe75b74ec.f174294z && (b4Var = c12860xe75b74ec.f174291w) != null && (frameLayout = b4Var.f556088d) != null) {
            frameLayout.callOnClick();
        }
        android.view.View.OnClickListener onClickListener = c12860xe75b74ec.f174290v;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/TaskStatusCardView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

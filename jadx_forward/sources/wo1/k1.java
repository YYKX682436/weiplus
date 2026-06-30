package wo1;

/* loaded from: classes5.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f529511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f529512e;

    public k1(android.view.WindowManager windowManager, android.view.View view) {
        this.f529511d = windowManager;
        this.f529512e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamFloatWindowHelper", "On button clicked, remove current float window");
        this.f529511d.removeView(this.f529512e);
        wo1.l1.f529520b = null;
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

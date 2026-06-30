package uo1;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f511128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f511129f;

    public v(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, po1.d dVar, qo1.f0 f0Var) {
        this.f511127d = y1Var;
        this.f511128e = dVar;
        this.f511129f = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        po1.d dVar = this.f511128e;
        qo1.f0 f0Var = this.f511129f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f511127d;
        y1Var.h(new uo1.u(dVar, f0Var, y1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showConnectionSwitchBottomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

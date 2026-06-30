package wo1;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f529418f;

    public a0(wo1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, po1.d dVar) {
        this.f529416d = a1Var;
        this.f529417e = gVar;
        this.f529418f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f529416d.a(this.f529417e, this.f529418f, true);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

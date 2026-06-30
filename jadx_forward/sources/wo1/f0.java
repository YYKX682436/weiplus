package wo1;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f529466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f529467g;

    public f0(wo1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, qo1.f0 f0Var, po1.d dVar) {
        this.f529464d = a1Var;
        this.f529465e = gVar;
        this.f529466f = f0Var;
        this.f529467g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f529464d.p(this.f529465e, this.f529466f, this.f529467g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

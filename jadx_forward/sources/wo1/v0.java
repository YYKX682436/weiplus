package wo1;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f529572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f529573g;

    public v0(wo1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, qo1.j0 j0Var, po1.d dVar) {
        this.f529570d = a1Var;
        this.f529571e = gVar;
        this.f529572f = j0Var;
        this.f529573g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRunningState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f529570d.p(this.f529571e, (qo1.f0) this.f529572f, this.f529573g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRunningState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

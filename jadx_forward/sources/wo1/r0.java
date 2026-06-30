package wo1;

/* loaded from: classes5.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f529552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f529553g;

    public r0(wo1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, qo1.j0 j0Var, po1.d dVar) {
        this.f529550d = a1Var;
        this.f529551e = gVar;
        this.f529552f = j0Var;
        this.f529553g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onPreparingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qo1.j0 j0Var = this.f529552f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.BaseRoamTask");
        po1.d dVar = this.f529553g;
        this.f529550d.p(this.f529551e, (qo1.f0) j0Var, dVar);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onPreparingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package wo1;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f529558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f529559g;

    public s0(wo1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, po1.d dVar, qo1.f0 f0Var) {
        this.f529556d = a1Var;
        this.f529557e = gVar;
        this.f529558f = dVar;
        this.f529559g = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRestError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f529556d.a(this.f529557e, this.f529558f, !(this.f529559g instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRestError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

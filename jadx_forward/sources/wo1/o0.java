package wo1;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f529532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f529533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529534g;

    public o0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, qo1.j0 j0Var, po1.d dVar, wo1.a1 a1Var) {
        this.f529531d = gVar;
        this.f529532e = j0Var;
        this.f529533f = dVar;
        this.f529534g = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.F, this.f529531d, this.f529532e, this.f529533f, null, null, 48, null);
        this.f529534g.a(this.f529531d, this.f529533f, !(this.f529532e instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package rh4;

/* loaded from: classes8.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.a f477265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl1.n0 f477266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rh4.i0 f477267f;

    public h0(rh4.i0 i0Var, cl1.a aVar, cl1.n0 n0Var) {
        this.f477267f = i0Var;
        this.f477265d = aVar;
        this.f477266e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rh4.i0 i0Var = this.f477267f;
        if (i0Var.f477274d.f254248j2 != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomeAppbrandDrawer.k(view.getContext(), null)) {
                yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (i0Var.f477274d.t1()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = i0Var.f477274d;
                cl1.n0 n0Var = this.f477266e;
                cl1.a aVar = this.f477265d;
                c18566x5b11ed80.n1(aVar, view, n0Var, aVar.m8183xf806b362());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

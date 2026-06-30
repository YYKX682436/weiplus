package mi5;

/* loaded from: classes9.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe5.b f408333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f408335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v05.b f408336g;

    public b1(oe5.b bVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bw5.o50 o50Var, v05.b bVar2) {
        this.f408333d = bVar;
        this.f408334e = f9Var;
        this.f408335f = o50Var;
        this.f408336g = bVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        bw5.o50 o50Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oe5.b bVar = this.f408333d;
        if (bVar.m75933x41a8a7f2(bVar.f125235d + 6)) {
            yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f408334e;
        if (f9Var != null && (o50Var = this.f408335f) != null) {
            if (bVar.m75933x41a8a7f2(bVar.f125235d + 6)) {
                yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6 o6Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6.f283598a;
                v05.b bVar2 = this.f408336g;
                o6Var.b(f9Var, o50Var, bVar2.m75945x2fec8307(bVar2.f449898d + 0));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

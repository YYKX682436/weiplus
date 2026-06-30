package e45;

/* loaded from: classes8.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.r f330947d;

    public o(e45.r rVar) {
        this.f330947d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        e45.i iVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e45.r rVar = this.f330947d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = rVar.f330951e;
        boolean z17 = false;
        if (c22661xa3a2b3c0 != null && c22661xa3a2b3c0.isEnabled()) {
            z17 = true;
        }
        if (z17 && (iVar = rVar.f330958o) != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o1 o1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f.I;
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x2) iVar).f273510a.W6();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

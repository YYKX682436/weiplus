package qd2;

/* loaded from: classes10.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443381d;

    public w0(qd2.g1 g1Var) {
        this.f443381d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initOriginType$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd2.g1 g1Var = this.f443381d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(g1Var.f443280a, g1Var.f443291l);
        int i17 = g1Var.f443290k;
        if (i17 < 0) {
            i17 = 0;
        }
        c0Var.i(i17);
        c0Var.f293792t = new qd2.f1(c0Var, g1Var);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initOriginType$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

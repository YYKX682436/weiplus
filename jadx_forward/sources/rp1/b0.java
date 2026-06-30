package rp1;

/* loaded from: classes14.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f f479891d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f) {
        this.f479891d = c12919x6cd8224f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatBackgroundView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f479891d.f174972d).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.l) ((mp1.a) it.next())).f174841a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
            if (c12917x19ac03e7 != null) {
                c12917x19ac03e7.h();
            }
            nVar.n();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBackgroundView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

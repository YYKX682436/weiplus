package wl4;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e f528622d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e c18727x606014e) {
        this.f528622d = c18727x606014e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/playapp/custom/TingCustomFlotBallView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f528622d.f256253e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/playapp/custom/TingCustomFlotBallView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

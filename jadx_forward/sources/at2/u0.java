package at2;

/* loaded from: classes3.dex */
public final class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h {

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f95290p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95291q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f95292r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.ViewGroup mustVisibleRoot, qo0.c statusMonitor) {
        super(mustVisibleRoot, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mustVisibleRoot, "mustVisibleRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95292r = jz5.h.b(new at2.t0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(int i17, int i18, boolean z17) {
        if (!z17) {
            android.view.View view = this.f95290p;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "onSeekTime", "(IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "onSeekTime", "(IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ws2.n1 n1Var = ws2.n1.f530638a;
        java.lang.String b17 = n1Var.b(i17);
        java.lang.String b18 = n1Var.b(i18);
        android.view.View view2 = this.f95290p;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565538co4) : null;
        if (textView != null) {
            textView.setText(b17);
        }
        android.view.View view3 = this.f95290p;
        android.widget.TextView textView2 = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.ohr) : null;
        if (textView2 != null) {
            textView2.setText(b18);
        }
        android.view.View view4 = this.f95290p;
        if (view4 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "onSeekTime", "(IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin", "onSeekTime", "(IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

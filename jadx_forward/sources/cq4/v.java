package cq4;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d f303019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f303021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f303022g;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d, long j17, long j18, boolean z17) {
        this.f303019d = c18833x82cf22d;
        this.f303020e = j17;
        this.f303021f = j18;
        this.f303022g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303019d;
        int width = c18833x82cf22d.getWidth();
        int height = (c18833x82cf22d.getRecyclerView().getHeight() - c18833x82cf22d.getRecyclerView().getPaddingTop()) - c18833x82cf22d.getRecyclerView().getPaddingBottom();
        if (width <= 0 || height <= 0) {
            c18833x82cf22d.getRecyclerView().post(c18833x82cf22d.f257677r);
            return;
        }
        float f17 = (height * 1.0f) / c18833x82cf22d.f257665J;
        float f18 = width / (c18833x82cf22d.K * f17);
        long j17 = this.f303020e;
        float f19 = ((float) j17) / 1000.0f < f18 ? ((float) j17) / f18 : 1000.0f;
        c18833x82cf22d.f257670h = 0;
        for (kp4.a aVar : c18833x82cf22d.C) {
            if (aVar.f392610g.isEmpty() && (aVar instanceof kp4.c1)) {
                aVar.f392609f = (((float) (aVar.f392608e - aVar.f392607d)) / f19) / ((kp4.c1) aVar).f392630n.f257160l.f479039h;
                aVar.f();
            }
            c18833x82cf22d.f257670h += (int) (aVar.f392609f * aVar.f392604a * f17);
        }
        c18833x82cf22d.f257676q = (c18833x82cf22d.f257670h * 1.0f) / ((float) (c18833x82cf22d.f257672m - c18833x82cf22d.f257671i));
        kp4.c1 c1Var = c18833x82cf22d.f257678s;
        int i17 = width / 2;
        android.view.ViewGroup.LayoutParams layoutParams = c18833x82cf22d.getRecyclerView().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        c1Var.f392606c = i17 - ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
        c18833x82cf22d.f257679t.f392606c = i17;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.a0(c18833x82cf22d.C, 0), c18833x82cf22d.f257678s)) {
            c18833x82cf22d.C.add(0, c18833x82cf22d.f257678s);
            c18833x82cf22d.C.add(c18833x82cf22d.f257679t);
        }
        c18833x82cf22d.f257669g.z(c18833x82cf22d.C);
        c18833x82cf22d.f257669g.m8146xced61ae5();
        c18833x82cf22d.getRecyclerView().measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        c18833x82cf22d.B = true;
        long j18 = this.f303021f;
        if (j18 != -1) {
            int i18 = (int) (((float) (j18 - c18833x82cf22d.f257671i)) * c18833x82cf22d.f257676q);
            c18833x82cf22d.f257675p = i18;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c18833x82cf22d.f257668f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(-i18));
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        if (this.f303022g) {
            int i19 = c18833x82cf22d.f257674o;
            c18833x82cf22d.f257675p = i19;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c18833x82cf22d.f257668f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(-i19));
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1162x665295de2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de2.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}

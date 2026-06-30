package vd2;

/* loaded from: classes3.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.s1 f517364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f517365e;

    public o1(vd2.s1 s1Var, int i17) {
        this.f517364d = s1Var;
        this.f517365e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vd2.s1 s1Var = this.f517364d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = s1Var.f517436f;
        int i17 = this.f517365e;
        if (c14167x40aca97c != null && (c14343x44b0b6f6 = c14167x40aca97c.f193025q) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c14343x44b0b6f6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$2", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c14343x44b0b6f6.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c14343x44b0b6f6, "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$2", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c2 = s1Var.f517436f;
        if (c14167x40aca97c2 != null) {
            c14167x40aca97c2.t();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c3 = s1Var.f517436f;
        if (c14167x40aca97c3 != null) {
            c14167x40aca97c3.x(true, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c4 = s1Var.f517436f;
        if (c14167x40aca97c4 != null) {
            c14167x40aca97c4.u(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

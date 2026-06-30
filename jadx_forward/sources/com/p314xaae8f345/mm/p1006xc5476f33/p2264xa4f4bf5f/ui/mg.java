package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class mg extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f255640d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f255641e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f255642f;

    /* renamed from: g, reason: collision with root package name */
    public int f255643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f255640d = new java.util.HashMap();
    }

    public static void P6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg mgVar, int i17, int i18, java.lang.Object obj) {
        java.lang.Integer num = mgVar.f255642f;
        if (num != null) {
            int intValue = num.intValue();
            try {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = mgVar.f255641e;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7951xfd37656d() : null;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d : null;
                if (c1162x665295de != null) {
                    int i19 = mgVar.f255643g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    arrayList.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final void O6(int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i19) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7951xfd37656d() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) mo7951xfd37656d : null;
        if (c1161x57298f5d != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1161x57298f5d, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(IILandroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
            c1161x57298f5d.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1161x57298f5d, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(IILandroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
        this.f255642f = java.lang.Integer.valueOf(i17);
        int i27 = -((i18 / 2) + 1);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f255641e;
        int measuredHeight = (i27 * (c1163xf1deaba42 != null ? c1163xf1deaba42.getMeasuredHeight() : 0)) / 3;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f255641e;
        this.f255643g = measuredHeight + (((c1163xf1deaba43 != null ? c1163xf1deaba43.getMeasuredHeight() : 0) * 2) / 3);
        P6(this, 0, 1, null);
        java.util.Objects.toString(c1163xf1deaba4);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f255641e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7951xfd37656d() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d : null;
        if (c1162x665295de != null) {
            int w17 = c1162x665295de.w();
            android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
            int top = mo7935xa188593e != null ? mo7935xa188593e.getTop() : 0;
            this.f255642f = java.lang.Integer.valueOf(w17);
            this.f255643g = top;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }
}

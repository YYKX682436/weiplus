package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class z4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f205943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f205944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f205946h;

    public z4(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce, int i18) {
        this.f205942d = view;
        this.f205943e = c1163xf1deaba4;
        this.f205944f = i17;
        this.f205945g = c14889x51ce1ce;
        this.f205946h = i18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m58672x4905e9fa;
        this.f205942d.getViewTreeObserver().removeOnPreDrawListener(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f205943e;
        m58672x4905e9fa = this.f205945g.m58672x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m58672x4905e9fa.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        int i17 = this.f205944f + ((c1161x57298f5d != null ? c1161x57298f5d.f93394w : 0) * 2);
        int i18 = this.f205946h;
        if (i17 > i18) {
            i17 = i18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$1$2$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$1$2$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }
}

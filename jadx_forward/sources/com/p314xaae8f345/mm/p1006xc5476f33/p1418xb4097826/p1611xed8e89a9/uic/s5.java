package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class s5 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205738a;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce) {
        this.f205738a = c14889x51ce1ce;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b47;
        m58666xf0438b47 = this.f205738a.m58666xf0438b47();
        m58666xf0438b47.m56267xdf844710();
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66 c15425x2593fa66;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b47;
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205738a;
        c15425x2593fa66 = c14889x51ce1ce.B;
        if (c15425x2593fa66 != null && (findViewById = c15425x2593fa66.findViewById(com.p314xaae8f345.mm.R.id.ilh)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "onLoadMoreStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "onLoadMoreStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m58666xf0438b47 = c14889x51ce1ce.m58666xf0438b47();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(m58666xf0438b47, false, 1, null);
    }
}

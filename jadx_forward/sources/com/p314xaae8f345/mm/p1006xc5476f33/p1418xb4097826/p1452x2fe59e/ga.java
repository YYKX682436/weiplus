package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class ga implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 f188364d;

    public ga(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1) {
        this.f188364d = c1164x587b7ff1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = this.f188364d;
        if (c1164x587b7ff1 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}

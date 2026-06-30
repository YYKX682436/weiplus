package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205058d;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var) {
        this.f205058d = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var = this.f205058d;
        int dimension = (int) f4Var.Z6().getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = f4Var.Z6().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        if (c1161x57298f5d != null) {
            int i17 = f4Var.f205227r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(dimension));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1161x57298f5d, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1161x57298f5d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1161x57298f5d, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = f4Var.Z6().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager2 : null;
        if (c1164x587b7ff1 != null) {
            int i18 = f4Var.f205227r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(dimension));
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1164x587b7ff1, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1164x587b7ff1.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$setJustWatchedClick$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}

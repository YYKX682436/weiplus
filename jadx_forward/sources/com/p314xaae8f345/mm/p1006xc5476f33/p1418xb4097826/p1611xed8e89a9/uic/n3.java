package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f205531e;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var, int i17) {
        this.f205530d = f4Var;
        this.f205531e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var = this.f205530d;
        yz5.l lVar = f4Var.f205235z;
        int intValue = lVar != null ? ((java.lang.Number) lVar.mo146xb9724478(java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) f4Var.f205229t).mo141623x754a37bb()).longValue()))).intValue() : f4Var.f205227r;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = f4Var.Z6().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        int i17 = this.f205531e;
        if (c1161x57298f5d != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d2 = c1161x57298f5d;
            yj0.a.d(c1161x57298f5d2, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1161x57298f5d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1161x57298f5d2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = f4Var.Z6().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager2 : null;
        if (c1164x587b7ff1 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1164x587b7ff1, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1164x587b7ff1.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatchedFeed$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}

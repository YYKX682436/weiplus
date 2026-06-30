package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class kj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f210976d;

    public kj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        this.f210976d = activityC15076x7a6c76b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int y17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f210976d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = activityC15076x7a6c76b6.E;
        if (w8Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        if (!(w8Var.m56068x4905e9fa().getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) || ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r1).y() - 1 < 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var2 = activityC15076x7a6c76b6.E;
        if (w8Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = w8Var2.m56068x4905e9fa();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(y17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m56068x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$7$3$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        m56068x4905e9fa.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m56068x4905e9fa, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$7$3$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}

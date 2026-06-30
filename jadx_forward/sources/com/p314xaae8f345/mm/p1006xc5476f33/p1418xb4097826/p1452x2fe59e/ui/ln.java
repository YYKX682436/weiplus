package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class ln implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe f191816d;

    public ln(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe activityC14104x32508bfe) {
        this.f191816d = activityC14104x32508bfe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int y17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe activityC14104x32508bfe = this.f191816d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 v20Var = activityC14104x32508bfe.E;
        if (v20Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        if (!(v20Var.m56068x4905e9fa().getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) || ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r1).y() - 1 < 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 v20Var2 = activityC14104x32508bfe.E;
        if (v20Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = v20Var2.m56068x4905e9fa();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(y17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m56068x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$5$2$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        m56068x4905e9fa.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m56068x4905e9fa, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$5$2$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}

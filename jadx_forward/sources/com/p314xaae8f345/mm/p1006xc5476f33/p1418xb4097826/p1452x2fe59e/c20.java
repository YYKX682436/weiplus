package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class c20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea f187982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f187983e;

    public c20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        this.f187982d = c13728x20aad6ea;
        this.f187983e = c1162x665295de;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = this.f187982d;
        int w17 = this.f187983e.w();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(w17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c13728x20aad6ea, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Presenter$interceptTouchEventListener$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c13728x20aad6ea.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c13728x20aad6ea, "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Presenter$interceptTouchEventListener$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}

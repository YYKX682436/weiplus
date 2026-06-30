package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes2.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254163d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3) {
        this.f254163d = c18557xc00aa3f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254163d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c18557xc00aa3f3, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarView$15", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        c18557xc00aa3f3.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c18557xc00aa3f3, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$15", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f254163d.setTranslationY(0.0f);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c f192926a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c c14149x7d40ca9c) {
        this.f192926a = c14149x7d40ca9c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c c14149x7d40ca9c = this.f192926a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0 v0Var = c14149x7d40ca9c.f192864x;
        if (v0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = v0Var.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.v0 v0Var2 = c14149x7d40ca9c.f192864x;
            if (v0Var2 != null) {
                v0Var2.m56022x4905e9fa().setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
        }
    }
}

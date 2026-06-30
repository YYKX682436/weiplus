package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class ed extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 f255381a;

    public ed(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004) {
        this.f255381a = c18652x18778004;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004 = this.f255381a;
        boolean isEmpty = c18652x18778004.f255179q.isEmpty();
        jz5.g gVar = c18652x18778004.f255183u;
        if (isEmpty) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.content.Context mo7438x76847179 = c18652x18778004.mo7438x76847179();
            abstractActivityC21394xb3d2c0cf = mo7438x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7438x76847179 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.m78501x43e00957(false);
                return;
            }
            return;
        }
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context mo7438x768471792 = c18652x18778004.mo7438x76847179();
        abstractActivityC21394xb3d2c0cf = mo7438x768471792 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7438x768471792 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78501x43e00957(true);
        }
    }
}

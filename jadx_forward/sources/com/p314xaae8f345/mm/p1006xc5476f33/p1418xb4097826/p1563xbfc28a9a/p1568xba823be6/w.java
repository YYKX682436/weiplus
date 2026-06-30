package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class w implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f202903d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s f202904e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f202905f;

    /* renamed from: g, reason: collision with root package name */
    public final int f202906g;

    /* renamed from: h, reason: collision with root package name */
    public final int f202907h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f202908i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f202909m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f202910n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f202911o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f202912p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f202913q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f202914r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f202915s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c f202916t;

    public w(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View rootView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s presenter, java.lang.String finderAuthorUsername, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f202903d = rootView;
        this.f202904e = presenter;
        this.f202905f = finderAuthorUsername;
        this.f202906g = i17;
        this.f202907h = i18;
        this.f202908i = activity;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f202913q;
        if (c15343x638a173f != null) {
            return c15343x638a173f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
        throw null;
    }

    public final void g() {
        android.view.View view = this.f202909m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f202912p;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f202911o;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryTip");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f202910n;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progress");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f202908i;
    }

    public final void j(boolean z17, boolean z18) {
        if (z17) {
            if (this.f202906g == 5) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f202908i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                go2.c0 c0Var = (go2.c0) pf5.z.f435481a.a(activity).e(go2.c0.class);
                if (c0Var != null) {
                    pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e80(c0Var, 1, false));
                }
            }
            android.view.View view = this.f202909m;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f202912p;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f202911o;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryTip");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f202910n;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progress");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = this.f202909m;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z18) {
                android.view.View view6 = this.f202915s;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footer");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            a().A(true);
        }
        android.view.View view7 = this.f202909m;
        if (view7 != null) {
            view7.setOnClickListener(null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
            throw null;
        }
    }
}

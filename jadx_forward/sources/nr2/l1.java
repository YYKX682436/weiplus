package nr2;

/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f420793a;

    /* renamed from: b, reason: collision with root package name */
    public final nr2.i1 f420794b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f420795c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f420796d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f420797e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f420798f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f420799g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f420800h;

    public l1(android.app.Activity context, nr2.i1 presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f420793a = context;
        this.f420794b = presenter;
    }

    public final android.widget.FrameLayout a() {
        android.widget.FrameLayout frameLayout = this.f420797e;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f420796d;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    public final android.view.View c() {
        android.view.View view = this.f420800h;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f420795c;
        if (c15343x638a173f != null) {
            return c15343x638a173f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void e() {
        a().setVisibility(8);
        c().setOnClickListener(null);
    }

    public final void f() {
        a().setVisibility(0);
        android.view.View view = this.f420798f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f420799g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

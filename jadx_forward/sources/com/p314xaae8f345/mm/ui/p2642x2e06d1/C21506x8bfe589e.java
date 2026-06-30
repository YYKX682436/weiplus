package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMLoadMoreListView */
/* loaded from: classes8.dex */
public class C21506x8bfe589e extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f279026d;

    /* renamed from: e, reason: collision with root package name */
    public db5.f4 f279027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279028f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f279029g;

    public C21506x8bfe589e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279026d = null;
        this.f279027e = null;
        this.f279028f = false;
        d();
    }

    public void b() {
        if (this.f279026d != null) {
            this.f279029g.setVisibility(8);
            android.view.View view = this.f279026d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", "dismissFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "dismissFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c() {
        if (this.f279026d.getParent() == null) {
            if (this.f279026d == null) {
                f();
            }
            try {
                removeFooterView(this.f279026d);
                addFooterView(this.f279026d);
            } catch (java.lang.Exception unused) {
            }
        }
        this.f279029g.setVisibility(0);
        android.view.View view = this.f279026d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", "displayFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "displayFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d() {
        if (this.f279026d == null) {
            f();
            addFooterView(this.f279026d);
            android.view.View view = this.f279026d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void f() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.byg, null);
        this.f279026d = inflate;
        this.f279029g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gc7);
        android.view.View view = this.f279026d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMLoadMoreListView", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void g() {
        setOnScrollListener(new db5.e4(this));
    }

    /* renamed from: getScroll2Top */
    public boolean m79052xf2247406() {
        return getFirstVisiblePosition() == 0 && getChildAt(0) != null && getChildAt(0).getTop() == getPaddingTop();
    }

    /* renamed from: setFooterTips */
    public void m79053x71113d75(java.lang.String str) {
        this.f279029g.setText(str);
    }

    /* renamed from: setOnFootrClickListener */
    public void m79054x4c9d2eb9(android.view.View.OnClickListener onClickListener) {
        this.f279029g.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnLoadMoreListener */
    public void m79055xb7d2c730(db5.f4 f4Var) {
        this.f279027e = f4Var;
    }

    public C21506x8bfe589e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279026d = null;
        this.f279027e = null;
        this.f279028f = false;
        d();
    }
}

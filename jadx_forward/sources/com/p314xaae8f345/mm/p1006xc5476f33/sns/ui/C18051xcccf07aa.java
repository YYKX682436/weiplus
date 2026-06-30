package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter;", "Landroid/widget/FrameLayout;", "Lon5/c;", "Landroid/view/View;", "f", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "g", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Lkotlin/Function0;", "Ljz5/f0;", "h", "Lyz5/a;", "getOnRefreshStateNone", "()Lyz5/a;", "setOnRefreshStateNone", "(Lyz5/a;)V", "onRefreshStateNone", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter */
/* loaded from: classes15.dex */
public final class C18051xcccf07aa extends android.widget.FrameLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f248666d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f248667e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final android.view.View view;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final sn5.c spinnerStyle;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.a onRefreshStateNone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18051xcccf07aa(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.view = this;
        this.spinnerStyle = sn5.c.f491707b;
        sn5.b bVar = sn5.b.f491687m;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571045ep4, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ilg);
        this.f248666d = findViewById;
        if (findViewById != null) {
            findViewById.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        }
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561184bp);
            findViewById.setLayoutParams(layoutParams);
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ilh);
        this.f248667e = findViewById2;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInitialized", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kernel, "kernel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInitialized", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        java.lang.Integer num;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNoMoreData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        android.view.View view = this.f248667e;
        android.view.View view2 = this.f248666d;
        if (z17) {
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                i18 = 0;
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                i18 = 0;
            }
            if (view != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(i18)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList4.get(i18)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (view2 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                i17 = 0;
                yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Integer.valueOf(intValue3));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                num = 0;
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                num = 0;
                i17 = 0;
            }
            if (view != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList7.add(num);
                java.util.Collections.reverse(arrayList7);
                int i19 = i17;
                yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue4 = ((java.lang.Integer) arrayList7.get(i19)).intValue();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(java.lang.Integer.valueOf(intValue4));
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList8.get(i19)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentImageLoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNoMoreData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        return true;
    }

    @Override // on5.g
    public void c(on5.f refreshLayout, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReleased", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReleased", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }

    @Override // on5.g
    public void d(float f17, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHorizontalDrag", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHorizontalDrag", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartAnimator", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartAnimator", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        yz5.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (oldState != newState && newState == sn5.b.f491690p && (aVar = this.onRefreshStateNone) != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }

    /* renamed from: getOnRefreshStateNone */
    public final yz5.a m70735x55fe0c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnRefreshStateNone", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        yz5.a aVar = this.onRefreshStateNone;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnRefreshStateNone", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        return aVar;
    }

    @Override // on5.g
    public sn5.c getSpinnerStyle() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpinnerStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpinnerStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        return this.spinnerStyle;
    }

    @Override // on5.g
    public android.view.View getView() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        android.view.View view = this.view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        return view;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        return 0;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMoving", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMoving", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }

    /* renamed from: setOnRefreshStateNone */
    public final void m70736x9c8b62cf(yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnRefreshStateNone", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
        this.onRefreshStateNone = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnRefreshStateNone", "com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter");
    }
}

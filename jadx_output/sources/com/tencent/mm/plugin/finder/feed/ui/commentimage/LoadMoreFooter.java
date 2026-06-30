package com.tencent.mm.plugin.finder.feed.ui.commentimage;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter;", "Landroid/widget/FrameLayout;", "Lon5/c;", "Landroid/view/View;", "f", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "g", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Lkotlin/Function0;", "Ljz5/f0;", "h", "Lyz5/a;", "getOnRefreshStateNone", "()Lyz5/a;", "setOnRefreshStateNone", "(Lyz5/a;)V", "onRefreshStateNone", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class LoadMoreFooter extends android.widget.FrameLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f109788d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f109789e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final android.view.View view;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final sn5.c spinnerStyle;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.a onRefreshStateNone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(context, "context");
        this.view = this;
        this.spinnerStyle = sn5.c.f410174b;
        sn5.b bVar = sn5.b.f410154m;
        android.view.View.inflate(context, com.tencent.mm.R.layout.eiz, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ilg);
        this.f109788d = findViewById;
        if (findViewById != null) {
            findViewById.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        }
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479651bp);
            findViewById.setLayoutParams(layoutParams);
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ilh);
        this.f109789e = findViewById2;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        kotlin.jvm.internal.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        java.lang.Integer num;
        int i17;
        int i18;
        android.view.View view = this.f109789e;
        android.view.View view2 = this.f109788d;
        if (z17) {
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                i18 = 0;
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                i18 = 0;
            }
            if (view == null) {
                return true;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(i18)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(i18)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        if (view2 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            i17 = 0;
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(intValue3));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            num = 0;
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            num = 0;
            i17 = 0;
        }
        if (view == null) {
            return true;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList7.add(num);
        java.util.Collections.reverse(arrayList7);
        int i19 = i17;
        yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue4 = ((java.lang.Integer) arrayList7.get(i19)).intValue();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Integer.valueOf(intValue4));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList8.get(i19)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/LoadMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // on5.g
    public void c(on5.f refreshLayout, int i17, int i18) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
    }

    @Override // on5.g
    public void d(float f17, int i17, int i18) {
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        if (oldState == newState || newState != sn5.b.f410157p || (aVar = this.onRefreshStateNone) == null) {
            return;
        }
        aVar.invoke();
    }

    public final yz5.a getOnRefreshStateNone() {
        return this.onRefreshStateNone;
    }

    @Override // on5.g
    public sn5.c getSpinnerStyle() {
        return this.spinnerStyle;
    }

    @Override // on5.g
    public android.view.View getView() {
        return this.view;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        kotlin.jvm.internal.o.g(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    public final void setOnRefreshStateNone(yz5.a aVar) {
        this.onRefreshStateNone = aVar;
    }
}

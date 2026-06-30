package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5458x17ab858b f192674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5458x17ab858b c5458x17ab858b) {
        super(0);
        this.f192673d = a7Var;
        this.f192674e = c5458x17ab858b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f192673d;
        yw2.a0 a0Var = a7Var.f187749o;
        if (a0Var != null) {
            view = a0Var.f548157w;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerErrTip");
                throw null;
            }
        } else {
            view = null;
        }
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yw2.a0 a0Var2 = a7Var.f187749o;
        if (a0Var2 != null) {
            textView = a0Var2.f548158x;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerErrTv");
                throw null;
            }
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(this.f192674e.f135797g.f89602b);
        }
        yw2.a0 a0Var3 = a7Var.f187749o;
        if (a0Var3 != null) {
            android.view.View view2 = a0Var3.f548157w;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerErrTip");
                throw null;
            }
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x2(a7Var));
        }
        return jz5.f0.f384359a;
    }
}

package ah1;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f4857d;

    public y(ah1.c0 c0Var) {
        this.f4857d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ah1.c0 c0Var = this.f4857d;
        java.lang.String appId = c0Var.f4814w.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        android.content.Context context = c0Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        c0Var.K = new vi1.l0(appId, context, c0Var.getPhoneItems());
        androidx.recyclerview.widget.RecyclerView recyclerView = c0Var.G;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        vi1.l0 l0Var = c0Var.K;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("mItemAdapter");
            throw null;
        }
        recyclerView.setAdapter(l0Var);
        android.widget.LinearLayout linearLayout = c0Var.F;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mContentLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        if (c0Var.getPhoneItems().size() == 0) {
            android.view.View view = c0Var.I;
            if (view == null) {
                kotlin.jvm.internal.o.o("mLoadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            androidx.recyclerview.widget.RecyclerView recyclerView2 = c0Var.G;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            recyclerView2.setVisibility(8);
            android.widget.TextView textView = c0Var.H;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mFuncTv");
                throw null;
            }
        }
        if (c0Var.getPhoneItems().size() == 1) {
            android.view.View view2 = c0Var.I;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mLoadingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            androidx.recyclerview.widget.RecyclerView recyclerView3 = c0Var.G;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            recyclerView3.setVisibility(0);
            androidx.recyclerview.widget.RecyclerView recyclerView4 = c0Var.G;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView4.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            android.widget.TextView textView2 = c0Var.H;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mFuncTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = c0Var.H;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("mFuncTv");
                throw null;
            }
            textView3.setText(c0Var.getContext().getString(com.tencent.mm.R.string.a3s));
            android.widget.TextView textView4 = c0Var.H;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("mFuncTv");
                throw null;
            }
            textView4.setOnClickListener(new ah1.w(c0Var));
            if (vi1.l1.f437399a.a().r8()) {
                return;
            }
            android.widget.TextView textView5 = c0Var.H;
            if (textView5 != null) {
                textView5.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mFuncTv");
                throw null;
            }
        }
        android.view.View view3 = c0Var.I;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("mLoadingView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView5 = c0Var.G;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        recyclerView5.setVisibility(0);
        android.widget.TextView textView6 = c0Var.H;
        if (textView6 == null) {
            kotlin.jvm.internal.o.o("mFuncTv");
            throw null;
        }
        textView6.setVisibility(0);
        androidx.recyclerview.widget.RecyclerView recyclerView6 = c0Var.G;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter2 = recyclerView6.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        android.widget.TextView textView7 = c0Var.H;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("mFuncTv");
            throw null;
        }
        textView7.setText(c0Var.getContext().getString(com.tencent.mm.R.string.a3r));
        android.widget.TextView textView8 = c0Var.H;
        if (textView8 == null) {
            kotlin.jvm.internal.o.o("mFuncTv");
            throw null;
        }
        textView8.setOnClickListener(new ah1.x(c0Var));
        if (vi1.l1.f437399a.a().r8()) {
            return;
        }
        android.widget.TextView textView9 = c0Var.H;
        if (textView9 != null) {
            textView9.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("mFuncTv");
            throw null;
        }
    }
}

package ah1;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f86390d;

    public y(ah1.c0 c0Var) {
        this.f86390d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ah1.c0 c0Var = this.f86390d;
        java.lang.String mo48798x74292566 = c0Var.f86347w.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        android.content.Context context = c0Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c0Var.K = new vi1.l0(mo48798x74292566, context, c0Var.m2000x8053a6e8());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c0Var.G;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        vi1.l0 l0Var = c0Var.K;
        if (l0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mItemAdapter");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(l0Var);
        android.widget.LinearLayout linearLayout = c0Var.F;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        if (c0Var.m2000x8053a6e8().size() == 0) {
            android.view.View view = c0Var.I;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLoadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c0Var.G;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            c1163xf1deaba42.setVisibility(8);
            android.widget.TextView textView = c0Var.H;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
                throw null;
            }
        }
        if (c0Var.m2000x8053a6e8().size() == 1) {
            android.view.View view2 = c0Var.I;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLoadingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = c0Var.G;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            c1163xf1deaba43.setVisibility(0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = c0Var.G;
            if (c1163xf1deaba44 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba44.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            android.widget.TextView textView2 = c0Var.H;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = c0Var.H;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
                throw null;
            }
            textView3.setText(c0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3s));
            android.widget.TextView textView4 = c0Var.H;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
                throw null;
            }
            textView4.setOnClickListener(new ah1.w(c0Var));
            if (vi1.l1.f518932a.a().r8()) {
                return;
            }
            android.widget.TextView textView5 = c0Var.H;
            if (textView5 != null) {
                textView5.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
                throw null;
            }
        }
        android.view.View view3 = c0Var.I;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLoadingView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = c0Var.G;
        if (c1163xf1deaba45 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c1163xf1deaba45.setVisibility(0);
        android.widget.TextView textView6 = c0Var.H;
        if (textView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
            throw null;
        }
        textView6.setVisibility(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = c0Var.G;
        if (c1163xf1deaba46 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba46.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
        android.widget.TextView textView7 = c0Var.H;
        if (textView7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
            throw null;
        }
        textView7.setText(c0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3r));
        android.widget.TextView textView8 = c0Var.H;
        if (textView8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
            throw null;
        }
        textView8.setOnClickListener(new ah1.x(c0Var));
        if (vi1.l1.f518932a.a().r8()) {
            return;
        }
        android.widget.TextView textView9 = c0Var.H;
        if (textView9 != null) {
            textView9.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFuncTv");
            throw null;
        }
    }
}

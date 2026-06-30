package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f282991a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f282992b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f282993c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f282994d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s f282995e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f282996f;

    public u(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f282991a = rootView;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s sVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s.f282879d;
        this.f282995e = sVar;
        this.f282996f = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t.f282910d);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.u39);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f282992b = findViewById;
        android.view.View findViewById2 = rootView.findViewById(rj.s.f76505xf3101a5d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f282993c = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(rj.s.f76504x1993dd2a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f282994d = (android.widget.ProgressBar) findViewById3;
        android.widget.TextView textView = this.f282993c;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.b(textView);
        a(sVar);
    }

    public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (!((java.lang.Boolean) this.f282996f.mo141623x754a37bb()).booleanValue() || this.f282995e == state) {
            return;
        }
        this.f282995e = state;
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            android.view.View view = this.f282992b;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ProgressBar progressBar = this.f282994d;
            if (progressBar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingProcess");
                throw null;
            }
            progressBar.setVisibility(8);
            android.widget.TextView textView = this.f282993c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressText");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.view.View view2 = this.f282992b;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ProgressBar progressBar2 = this.f282994d;
            if (progressBar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingProcess");
                throw null;
            }
            progressBar2.setVisibility(0);
            android.widget.TextView textView2 = this.f282993c;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressText");
                throw null;
            }
        }
        if (ordinal != 2) {
            return;
        }
        android.view.View view3 = this.f282992b;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconContainer");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ProgressBar progressBar3 = this.f282994d;
        if (progressBar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingProcess");
            throw null;
        }
        progressBar3.setVisibility(8);
        android.widget.TextView textView3 = this.f282993c;
        if (textView3 != null) {
            textView3.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressText");
            throw null;
        }
    }

    public final void b(int i17) {
        android.widget.TextView textView = this.f282993c;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressText");
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('%');
        textView.setText(sb6.toString());
    }
}

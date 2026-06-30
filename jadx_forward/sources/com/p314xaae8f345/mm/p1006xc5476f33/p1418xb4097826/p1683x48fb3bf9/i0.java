package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 f218406a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 l0Var) {
        this.f218406a = l0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onError");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 l0Var = this.f218406a;
        l0Var.f218422i = true;
        oy2.a0 a0Var = l0Var.f218424k;
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DialogScrollViewHelper", "showRetry");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = a0Var.f431471c;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.setVisibility(4);
        android.view.View view = a0Var.f431474f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = a0Var.f431473e;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.e();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = a0Var.f431473e;
        if (c22627xa933f8e42 != null) {
            c22627xa933f8e42.setVisibility(8);
        }
        a0Var.f431480l.m63421xb79d55e9(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void b(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onCreateBoxWebViewEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onInitWebViewStart");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onInitWebViewEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onCreateBoxWebViewStart");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void f(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onExecuteActionCode : actionCode:" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 l0Var = this.f218406a;
        if (l0Var.f218418e || l0Var.f218422i) {
            return;
        }
        boolean z17 = true;
        l0Var.f218418e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onWebViewReady showAfterWebViewReady: %b, pendingShow: %b", java.lang.Boolean.valueOf(l0Var.f218420g), java.lang.Boolean.valueOf(l0Var.f218419f));
        if (!l0Var.f218420g) {
            oy2.a0 a0Var = l0Var.f218424k;
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DialogScrollViewHelper", "showWebView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = a0Var.f431471c;
            if (c15494xd57adead == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
                throw null;
            }
            c15494xd57adead.setVisibility(0);
            android.view.View view = a0Var.f431474f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = a0Var.f431473e;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.e();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = a0Var.f431473e;
            if (c22627xa933f8e42 != null) {
                c22627xa933f8e42.setVisibility(8);
            }
            a0Var.f431480l.m63421xb79d55e9(false);
        } else if (l0Var.f218419f) {
            l0Var.f218419f = false;
            l0Var.c();
        }
        java.lang.String str = l0Var.f218416c.f431528d;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        android.content.Context context = l0Var.f218414a;
        oy2.p pVar = l0Var.f218416c;
        db5.e1.y(context, pVar.f431528d, pVar.f431529e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cix), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.h0.f218404d);
    }
}

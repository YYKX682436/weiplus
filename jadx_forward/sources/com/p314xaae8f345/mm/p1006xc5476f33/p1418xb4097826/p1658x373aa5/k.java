package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m f214004a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar) {
        this.f214004a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onError");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar = this.f214004a;
        mVar.f214153e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar = mVar.f214155g;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogHelper", "showRetry");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = hVar.f213725b;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.setVisibility(4);
        android.view.View view = hVar.f213728e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = hVar.f213727d;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.e();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = hVar.f213727d;
        if (c22627xa933f8e42 == null) {
            return;
        }
        c22627xa933f8e42.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void b(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onCreateBoxWebViewEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onInitWebViewStart");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onInitWebViewEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onCreateBoxWebViewStart");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void f(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onExecuteActionCode : actionCode:" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.o0
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar = this.f214004a;
        if (mVar.f214151c || mVar.f214153e) {
            return;
        }
        mVar.f214151c = true;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onWebViewReady showAfterWebViewReady: %b, pendingShow: %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(mVar.f214152d));
        mVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar = mVar.f214155g;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogHelper", "showWebView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = hVar.f213725b;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.setVisibility(0);
        android.view.View view = hVar.f213728e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showWebView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = hVar.f213727d;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.e();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = hVar.f213727d;
        if (c22627xa933f8e42 == null) {
            return;
        }
        c22627xa933f8e42.setVisibility(8);
    }
}

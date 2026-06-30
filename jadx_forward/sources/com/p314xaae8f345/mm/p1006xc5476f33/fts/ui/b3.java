package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes8.dex */
public final class b3 {
    public b3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View feedbackView, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedbackView, "feedbackView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.view.View inflate = android.view.View.inflate(feedbackView.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.en6, null);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.View rootView = feedbackView.getRootView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "getRootView(...)");
        ym5.v6.b(rootView, inflate);
        rl5.r rVar = new rl5.r(feedbackView.getContext(), feedbackView);
        rVar.E = true;
        rVar.S = false;
        rVar.f478868J = feedbackView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogh);
        rVar.f478886w = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z2(feedbackView, query);
        rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a3(inflate);
        rVar.m();
    }
}

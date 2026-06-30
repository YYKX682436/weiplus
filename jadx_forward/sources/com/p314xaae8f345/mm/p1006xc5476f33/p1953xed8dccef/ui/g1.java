package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes9.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h1 f234823d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h1 h1Var) {
        this.f234823d = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ScrollView scrollView = (android.widget.ScrollView) this.f234823d.f234829a.findViewById(com.p314xaae8f345.mm.R.id.jaq);
        if (scrollView != null) {
            scrollView.pageScroll(33);
        }
    }
}

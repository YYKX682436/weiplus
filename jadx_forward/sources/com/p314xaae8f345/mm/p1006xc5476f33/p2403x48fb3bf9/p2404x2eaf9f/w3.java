package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class w3 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f263539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f263540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f263541c;

    public w3(android.widget.ScrollView scrollView, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, float f17) {
        this.f263539a = scrollView;
        this.f263540b = c22633x83752a59;
        this.f263541c = f17;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        android.widget.ScrollView scrollView = this.f263539a;
        int scrollX = scrollView.getScrollX();
        int scrollY = scrollView.getScrollY() + 2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f263540b;
        if (c22633x83752a59.m120171x1f05d274()) {
            c22633x83752a59.mo14660x738236e6(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("window.document.scrollingElement.scrollTop = %d;", java.lang.Integer.valueOf((int) (scrollY / this.f263541c))), null);
        } else {
            c22633x83752a59.mo120158xfb86a31b().scrollTo(scrollX, scrollY);
        }
    }
}

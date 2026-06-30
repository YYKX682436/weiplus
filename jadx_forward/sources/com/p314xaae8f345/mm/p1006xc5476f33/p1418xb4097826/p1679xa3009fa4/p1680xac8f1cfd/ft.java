package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ft implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f215960d;

    public ft(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar) {
        this.f215960d = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f215960d.f217143h;
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
    }
}

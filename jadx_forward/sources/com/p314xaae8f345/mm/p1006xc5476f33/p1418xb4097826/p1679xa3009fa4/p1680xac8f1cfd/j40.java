package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j40 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f216343d;

    public j40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var) {
        this.f216343d = f50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f216343d.f215874g;
        if (view != null) {
            view.performClick();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderPosBtn");
            throw null;
        }
    }
}

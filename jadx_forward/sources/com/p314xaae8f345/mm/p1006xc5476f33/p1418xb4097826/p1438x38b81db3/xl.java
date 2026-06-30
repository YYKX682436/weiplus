package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class xl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yl f186493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186494f;

    public xl(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yl ylVar, int i17) {
        this.f186492d = h0Var;
        this.f186493e = ylVar;
        this.f186494f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f186492d;
        ((android.view.View) h0Var.f391656d).animate().alpha(0.0f).setDuration(1000L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wl(h0Var, this.f186493e, this.f186494f)).start();
    }
}

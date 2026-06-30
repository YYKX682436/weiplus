package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f196367p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f196368q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f196369r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ProgressBar f196370s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f196371t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f196372u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f196373v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196367p = rootView;
        this.f196368q = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.eiw);
        this.f196369r = rootView.findViewById(com.p314xaae8f345.mm.R.id.eiy);
        this.f196370s = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.eix);
        this.f196372u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s0(this));
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r0.f195600a[status.ordinal()] == 1) {
            ((mm2.w) P0(mm2.w.class)).f411032h.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f196371t = 0;
        this.f196372u.mo50303x856b99f0(1);
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoTimerPlugin", "showProgressTimerTv");
        this.f196368q.setVisibility(0);
        android.view.View view = this.f196369r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "showProgressTimerTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "showProgressTimerTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        K0(0);
    }
}

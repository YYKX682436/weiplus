package sp2;

/* loaded from: classes2.dex */
public final class k1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f492595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492597f;

    public k1(long j17, int i17, sp2.o2 o2Var) {
        this.f492595d = j17;
        this.f492596e = i17;
        this.f492597f = o2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recyclerView onPreDraw rendering completed cost: ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f492595d);
        sb6.append(" pullType: ");
        int i17 = this.f492596e;
        sb6.append(i17);
        sb6.append(" currentLoadingTime: ");
        sp2.o2 o2Var = this.f492597f;
        sb6.append(o2Var.O);
        sb6.append(" startAutoLoadingTime: ");
        sb6.append(o2Var.K);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        rq2.d.f480349a.h(i17, 10000);
        if (i17 == 0 || i17 == 21 || i17 == 26) {
            if (o2Var.O == 0) {
                o2Var.O = java.lang.System.currentTimeMillis() - o2Var.K;
            }
            if (o2Var.M == 0 && i17 == 0) {
                o2Var.M = android.os.SystemClock.elapsedRealtime() - o2Var.L;
            }
        }
        sp2.o2.e(o2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
        if (c14595xffb7e034 != null) {
            c14595xffb7e034.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }
}

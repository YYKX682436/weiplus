package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class s0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 f195736d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var) {
        this.f195736d = w0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 1) {
            this.f195736d.f196371t = it.arg1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var = this.f195736d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoTimerPlugin", "startLoop: " + w0Var.f196371t);
            w0Var.f196372u.mo50311x7ab51103(w0Var.f196372u.mo50290x733c63a2(1, 0, 0), 500L);
        }
        return true;
    }
}

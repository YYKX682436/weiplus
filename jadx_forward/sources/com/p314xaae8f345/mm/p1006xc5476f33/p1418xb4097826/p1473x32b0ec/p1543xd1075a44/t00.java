package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class t00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f201389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201390e;

    public t00(r45.fr1 fr1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f201389d = fr1Var;
        this.f201390e = m10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        r45.fr1 fr1Var = this.f201389d;
        if (!android.text.TextUtils.isEmpty(fr1Var != null ? fr1Var.m75945x2fec8307(6) : null)) {
            bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", fr1Var != null ? fr1Var.m75945x2fec8307(6) : null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[input-auto-wording]  text = ");
            sb6.append(fr1Var != null ? fr1Var.m75945x2fec8307(6) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_NEED_NOTIFY_SEND_MSG_RESULT", true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201390e;
        m10Var.f200555x = currentTimeMillis;
        bundle.putLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", m10Var.f200555x);
        m10Var.f200533b.mo46557x60d69242(qo0.b.W, bundle);
    }
}

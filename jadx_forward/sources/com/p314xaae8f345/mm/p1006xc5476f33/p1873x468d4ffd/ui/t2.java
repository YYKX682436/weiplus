package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u2 f230956e;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u2 u2Var, java.lang.String str) {
        this.f230956e = u2Var;
        this.f230955d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f230955d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "DEBUG showDebugInfo %s", str);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            android.widget.TextView textView = (android.widget.TextView) this.f230956e.f230964d.findViewById(com.p314xaae8f345.mm.R.id.oyh);
            textView.setVisibility(0);
            textView.setText(str);
        }
    }
}

package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes11.dex */
public class w0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f296425b;

    public w0(int i17) {
        this.f296425b = i17;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "onEnterBackground, try force kill child process in " + this.f296425b + "ms");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p2829xfa87f9de.v0 v0Var = new com.p314xaae8f345.mm.p2829xfa87f9de.v0(this);
        long j17 = (long) this.f296425b;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(v0Var, j17, null);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "onExitBackground");
    }
}

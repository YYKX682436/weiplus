package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n2 f177483e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n2 n2Var, int i17) {
        this.f177483e = n2Var;
        this.f177482d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "mJoinFailed->join fail, reset session");
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n2 n2Var = this.f177483e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = n2Var.f177501b;
        p0Var.f177548d.c(p0Var.f177561q);
        n2Var.f177501b.h();
        n2Var.f177501b.d(n2Var.f177500a, -10086, -5, "join room callback failed: " + this.f177482d);
    }
}

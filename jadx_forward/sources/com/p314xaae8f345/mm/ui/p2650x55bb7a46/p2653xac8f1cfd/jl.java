package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class jl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f280844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml f280845g;

    public jl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar, int i17, int i18, sb5.z zVar) {
        this.f280845g = mlVar;
        this.f280842d = i17;
        this.f280843e = i18;
        this.f280844f = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar = this.f280845g;
        mlVar.f280113d.U(this.f280842d, this.f280843e, false, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 111 %s %s %s", java.lang.Integer.valueOf(mlVar.f280113d.j()), java.lang.Integer.valueOf(mlVar.f280113d.o()), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f280844f).mo8143x7444f759()));
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class kl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f280907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml f280908g;

    public kl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar, int i17, int i18, sb5.z zVar) {
        this.f280908g = mlVar;
        this.f280905d = i17;
        this.f280906e = i18;
        this.f280907f = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar = this.f280908g;
        mlVar.f280113d.U(this.f280905d, this.f280906e, false, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 222 %s %s %s", java.lang.Integer.valueOf(mlVar.f280113d.j()), java.lang.Integer.valueOf(mlVar.f280113d.o()), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f280907f).mo8143x7444f759()));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f267634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f267635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.app.Activity activity, float f17, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267634d = activity;
        this.f267635e = f17;
        this.f267636f = kVar;
        this.f267637g = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f267634d.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f17 = this.f267635e;
        to.a.c(audioManager, 3, (int) (streamMaxVolume * f17), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleDeviceInfo", "setVolume, maxVolume=" + streamMaxVolume + ", volume=" + f17);
        nw4.g gVar = this.f267636f.f422396d;
        nw4.y2 y2Var = this.f267637g;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return jz5.f0.f384359a;
    }
}

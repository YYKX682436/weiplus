package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f267532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267534f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267532d = activity;
        this.f267533e = kVar;
        this.f267534f = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f267532d.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, java.lang.Float.valueOf(streamVolume / streamMaxVolume));
        nw4.g gVar = this.f267533e.f422396d;
        nw4.y2 y2Var = this.f267534f;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleDeviceInfo", "getVolume, maxVolume=" + streamMaxVolume + ", volume=" + streamVolume);
        return jz5.f0.f384359a;
    }
}

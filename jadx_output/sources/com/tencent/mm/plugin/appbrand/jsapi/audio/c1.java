package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer f79169d;

    public c1(com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer) {
        this.f79169d = jsApiOperateMusicPlayer$OperateMusicPlayer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "stop ok");
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer = this.f79169d;
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79047r = -1;
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79045p = false;
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79048s = "";
        jsApiOperateMusicPlayer$OperateMusicPlayer.c();
    }
}

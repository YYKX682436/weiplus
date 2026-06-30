package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79306i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer f79308n;

    public y0(com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f79308n = jsApiOperateMusicPlayer$OperateMusicPlayer;
        this.f79301d = str;
        this.f79302e = str2;
        this.f79303f = str3;
        this.f79304g = str4;
        this.f79305h = str5;
        this.f79306i = str6;
        this.f79307m = str7;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer = this.f79308n;
        sb7.append(jsApiOperateMusicPlayer$OperateMusicPlayer.f79044o);
        java.lang.String str = this.f79301d;
        sb7.append(str);
        java.lang.String str2 = this.f79302e;
        sb7.append(str2);
        sb6.append(sb7.toString().hashCode());
        java.lang.String sb8 = sb6.toString();
        lp0.b.D();
        java.lang.String str3 = g83.a.a() + str2.hashCode();
        b21.r rVar = new b21.r();
        rVar.f17345d = 7;
        rVar.f17351m = str2;
        rVar.f17362x = str2;
        rVar.f17348g = this.f79303f;
        rVar.f17349h = this.f79304g;
        rVar.f17354p = this.f79305h;
        rVar.f17353o = this.f79306i;
        rVar.f17352n = str;
        rVar.f17358t = "";
        rVar.f17356r = str3;
        rVar.f17346e = sb8;
        rVar.f17347f = 0.0f;
        rVar.f17350i = this.f79307m;
        rVar.f17355q = null;
        rVar.f17361w = sb8;
        rVar.B = true;
        b21.m.i(rVar);
        com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
        hVar.a(jsApiOperateMusicPlayer$OperateMusicPlayer.f79049t, jsApiOperateMusicPlayer$OperateMusicPlayer.f79044o);
        hVar.f85761a = jsApiOperateMusicPlayer$OperateMusicPlayer.f79044o;
        hVar.f85762b = rVar.f17346e;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "startPlayMusic");
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79047r = -1;
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79048s = "";
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79045p = false;
        jsApiOperateMusicPlayer$OperateMusicPlayer.c();
    }
}

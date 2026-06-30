package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.d3 f79310e;

    public y2(com.tencent.mm.plugin.appbrand.jsapi.audio.d3 d3Var, boolean z17) {
        this.f79310e = d3Var;
        this.f79309d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f79310e.D(this.f79309d);
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.k1 f79195e;

    public g1(com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var, boolean z17) {
        this.f79195e = k1Var;
        this.f79194d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.audio.k1.C(this.f79195e, this.f79194d);
    }
}

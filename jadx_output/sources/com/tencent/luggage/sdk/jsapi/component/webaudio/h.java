package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f47575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.i f47576e;

    public h(com.tencent.luggage.sdk.jsapi.component.webaudio.i iVar, java.lang.String str, long j17) {
        this.f47576e = iVar;
        this.f47575d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f47576e.f47579c.wxAudioNative.update(this.f47575d);
    }
}

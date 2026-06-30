package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.webrtc.k0 f83847a = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.k0();

    public final com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0 a(org.json.JSONObject jSONObject, org.webrtc.VideoSink videoSink, com.tencent.mm.plugin.appbrand.jsapi.l appBrandComponent, com.tencent.mm.plugin.appbrand.jsapi.webrtc.j0 opCode) {
        com.tencent.mm.libmmwebrtc.MMWebRTCBinding mMWebRTCBinding;
        kotlin.jvm.internal.o.g(videoSink, "videoSink");
        kotlin.jvm.internal.o.g(appBrandComponent, "appBrandComponent");
        kotlin.jvm.internal.o.g(opCode, "opCode");
        if (jSONObject == null) {
            return com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83837g;
        }
        int optInt = jSONObject.optInt("mediaStreamTrackId");
        if (appBrandComponent instanceof com.tencent.luggage.sdk.jsapi.component.service.y) {
            com.tencent.luggage.sdk.jsapi.component.service.a0 y17 = ((com.tencent.luggage.sdk.jsapi.component.service.y) appBrandComponent).y1();
            synchronized (y17) {
                mMWebRTCBinding = y17.f47364h;
            }
        } else if (appBrandComponent instanceof com.tencent.luggage.sdk.jsapi.component.b) {
            com.tencent.luggage.sdk.jsapi.component.service.a0 y18 = ((com.tencent.luggage.sdk.jsapi.component.b) appBrandComponent).v3().y1();
            synchronized (y18) {
                mMWebRTCBinding = y18.f47364h;
            }
        } else {
            mMWebRTCBinding = null;
        }
        if (mMWebRTCBinding == null) {
            return com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83835e;
        }
        if (!mMWebRTCBinding.isRunning()) {
            return com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83836f;
        }
        int ordinal = opCode.ordinal();
        if (ordinal == 0) {
            return mMWebRTCBinding.addOrUpdateStreamToVideoSink(videoSink, optInt) ? com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83834d : com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83838h;
        }
        if (ordinal == 1) {
            return mMWebRTCBinding.removeStreamFromVideoSink(videoSink, optInt) ? com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83834d : com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0.f83838h;
        }
        throw new jz5.j();
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class c extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.jsapi.webrtc.b {

    /* renamed from: d, reason: collision with root package name */
    public org.webrtc.VideoSink f83799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.appbrand.jsapi.webrtc.i iVar, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final org.webrtc.VideoSink getVideoSink() {
        return this.f83799d;
    }

    public final void setVideoSink(org.webrtc.VideoSink videoSink) {
        this.f83799d = videoSink;
    }
}

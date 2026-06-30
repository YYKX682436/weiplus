package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes10.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.m implements yz5.a {
    public m(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.plugin.appbrand.av_device_usage.o.class, "checkIsLivePusherInUse", "checkIsLivePusherInUse()Z", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((com.tencent.mm.plugin.appbrand.av_device_usage.o) this.receiver).getClass();
        iq.b.u(com.tencent.mm.sdk.platformtools.x2.f193071a, false);
        com.tencent.mm.autogen.events.LiveStateActionEvent liveStateActionEvent = new com.tencent.mm.autogen.events.LiveStateActionEvent();
        liveStateActionEvent.e();
        liveStateActionEvent.f54477g.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkLiveStatePlayingAsVisitorMic, isAnchor: %b, isAudioMicing: %b, isVideoMicing: %b", bool, bool, bool);
        return java.lang.Boolean.valueOf(iq.b.m(com.tencent.mm.sdk.platformtools.x2.f193071a, false, null) || iq.b.o(com.tencent.mm.sdk.platformtools.x2.f193071a, false));
    }
}

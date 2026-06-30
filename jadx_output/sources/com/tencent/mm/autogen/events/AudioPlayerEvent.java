package com.tencent.mm.autogen.events;

/* loaded from: classes13.dex */
public final class AudioPlayerEvent extends com.tencent.mm.sdk.event.IEvent {

    /* renamed from: g, reason: collision with root package name */
    public final am.g0 f53990g = new am.g0();

    public AudioPlayerEvent() {
        this.f192365e = false;
        this.f192364d = null;
    }

    public static java.lang.String f(int i17) {
        return (i17 == 0 || i17 == 1) ? com.tencent.tav.core.AssetExtension.SCENE_PLAY : i17 == 2 ? "pause" : i17 == 3 ? "stop" : i17 == 4 ? "error" : i17 == 5 ? "ended" : i17 == 6 ? "seeked" : i17 == 7 ? "canplay" : i17 == 9 ? "waiting" : i17 == 10 ? "seeking" : i17 == 11 ? "real_play" : i17 == 12 ? "mix_play_ready" : i17 == 13 ? "preload_end" : "";
    }
}

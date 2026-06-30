package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.IPlayer */
/* loaded from: classes10.dex */
public interface InterfaceC25834xa44a6c8a {

    /* renamed from: com.tencent.tav.player.IPlayer$PlayerListener */
    /* loaded from: classes10.dex */
    public interface PlayerListener {
        /* renamed from: onPositionChanged */
        void mo98051x5c3ac16c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

        /* renamed from: onStatusChanged */
        void mo98052xed0a9ac3(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus);
    }

    /* renamed from: com.tencent.tav.player.IPlayer$PlayerStatus */
    /* loaded from: classes10.dex */
    public enum PlayerStatus {
        IDLE,
        READY,
        PLAYING,
        STOPPED,
        PAUSED,
        FINISHED,
        ERROR,
        REPLAY
    }

    /* renamed from: currentStatus */
    com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus mo98030x85aebacb();

    /* renamed from: duration */
    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98031x89444d94();

    /* renamed from: isPlaying */
    boolean mo98032xc00617a4();

    /* renamed from: pause */
    void mo98033x65825f6();

    /* renamed from: play */
    void mo98034x348b34();

    /* renamed from: position */
    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98035x2c929929();

    /* renamed from: release */
    void mo98036x41012807();

    /* renamed from: release */
    void mo98037x41012807(java.lang.Runnable runnable);

    /* renamed from: seekToTime */
    void mo98038xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465);

    /* renamed from: setLoop */
    void mo98039x764cf626(boolean z17);

    /* renamed from: setOnCompositionUpdateListener */
    void mo98040x3cbb0606(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 interfaceC25835x83ed6fa8);

    /* renamed from: setPlayRange */
    void mo98041xeb18d027(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26);

    /* renamed from: setPlayerListener */
    void mo98042x2ccf87b7(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener playerListener);

    /* renamed from: setVolume */
    void mo98043x27f73e1c(float f17);

    /* renamed from: stop */
    void mo98044x360802();

    /* renamed from: update */
    void mo98045xce0038c9(com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57);

    /* renamed from: updateAudioClipsProperties */
    void mo98046xc57a4469();

    /* renamed from: updateAudioVolumeProperties */
    void mo98047x1ebeca9a();

    /* renamed from: videoHeight */
    int mo98048x2a8d0982();

    /* renamed from: videoWidth */
    int mo98049x9f1bbe0b();

    /* renamed from: waitForRelease */
    void mo98050xf97cce53(long j17);
}

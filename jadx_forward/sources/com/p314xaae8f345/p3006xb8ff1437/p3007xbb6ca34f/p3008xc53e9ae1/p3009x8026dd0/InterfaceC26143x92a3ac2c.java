package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0;

/* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle */
/* loaded from: classes16.dex */
public interface InterfaceC26143x92a3ac2c {

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle$IOnSubTitleListener */
    /* loaded from: classes16.dex */
    public interface IOnSubTitleListener {
        /* renamed from: onEventInfo */
        void mo100575x4ab49();

        /* renamed from: onSubtitleFrameData */
        void mo100576xba654960(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26327x7e714b19 c26327x7e714b19);

        /* renamed from: onSubtitleInfo */
        void mo100577xfb60e465(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.SubtitleData subtitleData);

        /* renamed from: onSubtitleNote */
        void mo100578xfb632fa9(java.lang.String str);
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle$IOnSubtitleErrorListener */
    /* loaded from: classes16.dex */
    public interface IOnSubtitleErrorListener {
        /* renamed from: onSubtitleError */
        void mo100579x70854931(int i17, int i18);
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle$IOnTrackSelectListener */
    /* loaded from: classes16.dex */
    public interface IOnTrackSelectListener {
        /* renamed from: onTrackSelectFailure */
        void mo100580xf3b1e1a2(int i17, long j17);

        /* renamed from: onTrackSelectSuccess */
        void mo100581xc52af01b(long j17);
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle$IPlayPositionListener */
    /* loaded from: classes16.dex */
    public interface IPlayPositionListener {
        /* renamed from: getCurrentPosition */
        long mo100582x9746038c();
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle$SubtitleData */
    /* loaded from: classes16.dex */
    public static class SubtitleData {

        /* renamed from: text */
        java.lang.String f50039x36452d;

        public SubtitleData(java.lang.String str) {
            this.f50039x36452d = str;
        }
    }

    /* renamed from: pauseAsync */
    void mo100561xfb893626();

    /* renamed from: prepare */
    void mo100562xed060d07();

    /* renamed from: release */
    void mo100563x41012807();

    /* renamed from: reset */
    void mo100564x6761d4f();

    /* renamed from: setDataSource */
    void mo100565x683d6267(java.lang.String str, long j17);

    /* renamed from: setDataSource */
    void mo100566x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, long j17);

    /* renamed from: setOnSubTitleListener */
    void mo100567xfdcea4cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener iOnSubTitleListener);

    /* renamed from: setPlayerPositionListener */
    void mo100568x7be39900(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IPlayPositionListener iPlayPositionListener);

    /* renamed from: setSubtitleErrorListener */
    void mo100569xca424262(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubtitleErrorListener iOnSubtitleErrorListener);

    /* renamed from: setSubtitleRenderModel */
    void mo100570xd50c5039(com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df c26195xfe0f07df);

    /* renamed from: setSubtitleType */
    void mo100571x1d5f10f4(int i17);

    /* renamed from: setTrackSelectListener */
    void mo100572x8615c39(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnTrackSelectListener iOnTrackSelectListener);

    /* renamed from: startAsync */
    void mo100573xa094bb3a();

    /* renamed from: stop */
    void mo100574x360802();
}

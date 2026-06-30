package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class MusicSegment extends com.tencent.maas.moviecomposing.segments.ClipSegment {
    public static java.lang.String A1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetLyricFontName = musicSegment.nativeGetLyricFontName(timeline, musicSegment.f48532a.value());
        return nativeGetLyricFontName == null ? "" : nativeGetLyricFontName;
    }

    public static java.lang.Boolean B1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeUpdateLyricColorStyle(timeline, musicSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean C1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeIsStartTimeConstraintEnabled(timeline, musicSegment.f48532a.value()));
    }

    public static java.lang.String D1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetLyricStyleID = musicSegment.nativeGetLyricStyleID(timeline, musicSegment.f48532a.value());
        return nativeGetLyricStyleID == null ? "" : nativeGetLyricStyleID;
    }

    public static java.lang.Boolean E1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeIsLyricsEnabled(timeline, musicSegment.f48532a.value()));
    }

    public static java.lang.Object F1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        musicSegment.nativeHideLyrics(timeline, musicSegment.f48532a.value());
        return null;
    }

    public static com.tencent.maas.model.MJMusicInfo G1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return musicSegment.nativeGetMusicInfo(timeline, musicSegment.f48532a.value());
    }

    public static java.lang.String H1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetLyricColorStyleID = musicSegment.nativeGetLyricColorStyleID(timeline, musicSegment.f48532a.value());
        return nativeGetLyricColorStyleID == null ? "" : nativeGetLyricColorStyleID;
    }

    public static java.lang.Boolean I1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeShowLyrics(timeline, musicSegment.f48532a.value()));
    }

    public static java.lang.Boolean J1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeUpdateLyricStyle(timeline, musicSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean K1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime, boolean z17, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeReplaceMusic(timeline, musicSegment.f48532a.value(), mJMusicInfo, str, str2, mJTime, z17));
    }

    public static java.lang.Boolean L1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(musicSegment.nativeUpdateLyricFontName(timeline, musicSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean M1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, boolean z17, com.tencent.maas.moviecomposing.Timeline timeline) {
        musicSegment.nativeSetIsStartTimeConstraintEnabled(timeline, musicSegment.f48532a.value(), z17);
        return java.lang.Boolean.TRUE;
    }

    private native java.lang.String nativeGetLyricColorStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetLyricFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetLyricFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetLyricStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMusicFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.MJMusicInfo nativeGetMusicInfo(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeHideLyrics(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsEndTimeConstraintEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsLyricsEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsStartTimeConstraintEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeReplaceMusic(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str2, java.lang.String str3, com.tencent.maas.model.time.MJTime mJTime, boolean z17);

    private native void nativeSetIsEndTimeConstraintEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, boolean z17);

    private native void nativeSetIsStartTimeConstraintEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, boolean z17);

    private native boolean nativeShowLyrics(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeUpdateLyricColorStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateLyricFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateLyricStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    public static java.lang.Boolean z1(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, boolean z17, com.tencent.maas.moviecomposing.Timeline timeline) {
        musicSegment.nativeSetIsEndTimeConstraintEnabled(timeline, musicSegment.f48532a.value(), z17);
        return java.lang.Boolean.TRUE;
    }

    public com.tencent.maas.model.MJMusicInfo N1() {
        return (com.tencent.maas.model.MJMusicInfo) u(null, new r.a() { // from class: ug.h$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MusicSegment.G1(com.tencent.maas.moviecomposing.segments.MusicSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }
}

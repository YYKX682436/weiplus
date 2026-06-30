package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class ClipSegment extends com.tencent.maas.moviecomposing.segments.ElementSegment implements ug.p {
    public static java.lang.Float A0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetVolume(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Float B0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetFilterIntensity(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Integer C0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Integer.valueOf(clipSegment.nativeGetClipType(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Boolean D0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, double d17, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(clipSegment.nativeUpdateSpeedRatio(timeline, clipSegment.f48532a.value(), d17));
    }

    public static java.lang.String E0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return clipSegment.nativeGetClipFilePath(timeline, clipSegment.f48532a.value());
    }

    public static java.lang.Object F0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetGain(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object G0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetFilterIntensity(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static com.tencent.maas.base.Rect2 H0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.base.Rect2 rect2, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.base.Rect2 nativeGetContentCropRegion = clipSegment.nativeGetContentCropRegion(timeline, clipSegment.f48532a.value());
        return nativeGetContentCropRegion != null ? nativeGetContentCropRegion : rect2;
    }

    public static java.lang.Object I0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, boolean z17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetIsAudioMuted(timeline, clipSegment.f48532a.value(), z17);
        return null;
    }

    public static java.lang.Float J0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetSharpness(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Boolean K0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(clipSegment.nativeHasAudio(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Object L0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeBeginSpeedAdjustmentSession(timeline, clipSegment.f48532a.value());
        return null;
    }

    public static com.tencent.maas.model.time.MJTime M0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetModificationTime = clipSegment.nativeGetModificationTime(timeline, clipSegment.f48532a.value());
        return nativeGetModificationTime == null ? com.tencent.maas.model.time.MJTime.InvalidTime : nativeGetModificationTime;
    }

    public static java.lang.Object N0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetSharpness(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object O0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetBrightness(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object P0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, sg.b bVar, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetContentRotationMode(timeline, clipSegment.f48532a.value(), bVar.f407658d);
        return null;
    }

    public static com.tencent.maas.model.time.MJTimeRange Q0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetTimeRangeInMedia = clipSegment.nativeGetTimeRangeInMedia(timeline, clipSegment.f48532a.value());
        return nativeGetTimeRangeInMedia == null ? com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange : nativeGetTimeRangeInMedia;
    }

    public static java.lang.Object R0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetContrast(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object S0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetSaturation(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static com.tencent.maas.model.time.MJTimeRange T0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetBoundingTimeRangeInMedia = clipSegment.nativeGetBoundingTimeRangeInMedia(timeline, clipSegment.f48532a.value());
        return nativeGetBoundingTimeRangeInMedia == null ? com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange : nativeGetBoundingTimeRangeInMedia;
    }

    public static com.tencent.maas.model.MJLocation U0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.base.Vec2 nativeGetLocation = clipSegment.nativeGetLocation(timeline, clipSegment.f48532a.value());
        if (nativeGetLocation == null) {
            return null;
        }
        return new com.tencent.maas.model.MJLocation(nativeGetLocation.f47799x, nativeGetLocation.f47800y);
    }

    public static java.lang.Boolean V0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(clipSegment.nativeHasVideo(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Float W0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetSaturation(timeline, clipSegment.f48532a.value()));
    }

    public static com.tencent.maas.moviecomposing.VideoClipWrapper X0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions composingDefines$ClipSkimOptions, com.tencent.maas.moviecomposing.Timeline timeline) {
        return clipSegment.nativeGetVideoClipWrapperForSkimming(timeline, clipSegment.f48532a.value(), composingDefines$ClipSkimOptions);
    }

    public static java.lang.Boolean Y0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.base.Rect2 rect2, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetContentCropRegion(timeline, clipSegment.f48532a.value(), rect2);
        return java.lang.Boolean.TRUE;
    }

    public static java.lang.Float Z0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetVignette(timeline, clipSegment.f48532a.value()));
    }

    public static sg.b a1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        int nativeGetContentRotationMode = clipSegment.nativeGetContentRotationMode(timeline, clipSegment.f48532a.value());
        for (sg.b bVar : sg.b.values()) {
            if (bVar.f407658d == nativeGetContentRotationMode) {
                return bVar;
            }
        }
        return sg.b.None;
    }

    public static com.tencent.maas.moviecomposing.AspectRatio b1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return clipSegment.nativeGetAspectRatio(timeline, clipSegment.f48532a.value());
    }

    public static java.lang.Float c1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetTemperature(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Boolean d1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(clipSegment.nativeGetIsAudioMuted(timeline, clipSegment.f48532a.value()));
    }

    public static com.tencent.maas.model.time.MJTime e1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.Timeline timeline) {
        return clipSegment.nativeMapToClipTimeFromMediaTime(timeline, clipSegment.f48532a.value(), mJTime);
    }

    public static java.lang.Float f1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetContrast(timeline, clipSegment.f48532a.value()));
    }

    public static com.tencent.maas.model.time.MJTime g1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetCreationTime = clipSegment.nativeGetCreationTime(timeline, clipSegment.f48532a.value());
        return nativeGetCreationTime == null ? com.tencent.maas.model.time.MJTime.InvalidTime : nativeGetCreationTime;
    }

    public static java.lang.Object h1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.d dVar, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetContentScaleMode(timeline, clipSegment.f48532a.value(), dVar.f48488d);
        return null;
    }

    public static java.lang.String i1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return clipSegment.nativeGetMediaFilePath(timeline, clipSegment.f48532a.value());
    }

    public static java.lang.Object j1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetTemperature(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object k1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetFilterID(timeline, clipSegment.f48532a.value(), str);
        return null;
    }

    public static java.lang.Object l1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetVignette(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object m1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetVolume(timeline, clipSegment.f48532a.value(), f17);
        return null;
    }

    public static java.lang.Object n1(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeEndSpeedAdjustmentSession(timeline, clipSegment.f48532a.value());
        return null;
    }

    private native void nativeBeginSpeedAdjustmentSession(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeClearSpeedAdjustment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeEndSpeedAdjustmentSession(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetAbsoluteTimeRange(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.moviecomposing.AspectRatio nativeGetAspectRatio(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetBlur(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetBoundingTimeRangeInMedia(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetBrightness(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeGetCanAdjustVolume(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetClipFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetClipType(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.base.Rect2 nativeGetContentCropRegion(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetContentFlipMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetContentRotationMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetContentScaleMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetContrast(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetCreationTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetExposure(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetFilterID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetFilterIntensity(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetFilterOptions(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetGain(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetHue(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeGetIsAudioMuted(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeGetIsDigiZoomEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeGetIsEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetLayerBlendingMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetLayerBlendingModeName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetLayerOpacity(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeGetLocation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMediaFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMediaFileURL(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetModificationTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native double nativeGetPhaseSecondInDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native double nativeGetPhaseSecondOutDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetSaturation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetSharpness(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native double nativeGetSpeedRatio(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetTemperature(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetTimeRangeInMedia(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetTint(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetVibrance(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.moviecomposing.VideoClipWrapper nativeGetVideoClipWrapperForSkimming(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions composingDefines$ClipSkimOptions);

    private native float nativeGetVignette(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetVolume(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeHasAudio(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeHasAudioWaveform(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeHasVideo(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsFilterEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsSynthType(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeMapToClipTimeFromMediaTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.time.MJTime mJTime);

    private native com.tencent.maas.model.time.MJTime nativeMapToMediaTimeFromClipTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeSetBlur(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetBrightness(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetContentCropRegion(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.base.Rect2 rect2);

    private native void nativeSetContentFlipMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17);

    private native void nativeSetContentRotationMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17);

    private native void nativeSetContentScaleMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17);

    private native void nativeSetContrast(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetExposure(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetFilterID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeSetFilterIntensity(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetFilterOptions(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeSetGain(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetHue(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetIsAudioMuted(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, boolean z17);

    private native void nativeSetIsDigiZoomEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, boolean z17);

    private native void nativeSetIsEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, boolean z17);

    private native void nativeSetIsFilterEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, boolean z17);

    private native void nativeSetLayerBlendingMode(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17);

    private native void nativeSetLayerOpacity(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetPhaseSecondInDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, double d17);

    private native void nativeSetPhaseSecondOutDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, double d17);

    private native void nativeSetSaturation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetSharpness(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetTemperature(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetTint(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetVibrance(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetVignette(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetVolume(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native boolean nativeUpdateSpeedRatio(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, double d17);

    public static java.lang.String v0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetFilterID = clipSegment.nativeGetFilterID(timeline, clipSegment.f48532a.value());
        return nativeGetFilterID == null ? "" : nativeGetFilterID;
    }

    public static com.tencent.maas.model.time.MJTimeRange w0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetAbsoluteTimeRange = clipSegment.nativeGetAbsoluteTimeRange(timeline, clipSegment.f48532a.value());
        return nativeGetAbsoluteTimeRange == null ? com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange : nativeGetAbsoluteTimeRange;
    }

    public static java.lang.Float x0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(clipSegment.nativeGetBrightness(timeline, clipSegment.f48532a.value()));
    }

    public static java.lang.Object y0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, boolean z17, com.tencent.maas.moviecomposing.Timeline timeline) {
        clipSegment.nativeSetIsDigiZoomEnabled(timeline, clipSegment.f48532a.value(), z17);
        return null;
    }

    public static java.lang.Double z0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Double.valueOf(clipSegment.nativeGetSpeedRatio(timeline, clipSegment.f48532a.value()));
    }

    public com.tencent.maas.moviecomposing.AspectRatio o1() {
        return (com.tencent.maas.moviecomposing.AspectRatio) u(null, new r.a() { // from class: ug.b$$g
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.b1(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public float p1() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.b$$h
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.x0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }

    public com.tencent.maas.base.Rect2 q1() {
        final com.tencent.maas.base.Rect2 rect2 = new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(0.0f, 0.0f), new com.tencent.maas.base.Vec2(0.0f, 0.0f));
        return (com.tencent.maas.base.Rect2) u(rect2, new r.a() { // from class: ug.b$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.H0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, rect2, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public float r1() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.b$$i
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.f1(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }

    public java.lang.String s1() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.b$$j
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.i1(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public float t1() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.b$$l
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.W0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }

    public float u1() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.b$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.J0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }

    @Override // com.tencent.maas.moviecomposing.segments.Segment
    public com.tencent.maas.model.time.MJTimeRange v() {
        return (com.tencent.maas.model.time.MJTimeRange) u(com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange, new r.a() { // from class: ug.b$$k
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.w0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public double v1() {
        return ((java.lang.Double) u(java.lang.Double.valueOf(1.0d), new r.a() { // from class: ug.b$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.z0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).doubleValue();
    }

    public float w1() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.b$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.c1(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }

    public com.tencent.maas.model.time.MJTimeRange x1() {
        return (com.tencent.maas.model.time.MJTimeRange) u(com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange, new r.a() { // from class: ug.b$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.Q0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public float y1() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.b$$f
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ClipSegment.Z0(com.tencent.maas.moviecomposing.segments.ClipSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }
}

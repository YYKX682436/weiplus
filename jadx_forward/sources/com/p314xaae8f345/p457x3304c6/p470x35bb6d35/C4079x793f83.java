package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMovieSession */
/* loaded from: classes5.dex */
public class C4079x793f83 {

    /* renamed from: INVALID_REQUEST_ID */
    public static final int f15974xb5754053 = 0;

    /* renamed from: MJDUMMY_TEMPLATE_ID */
    public static final java.lang.String f15975xa7f549cc = "MJDummyTemplate";

    /* renamed from: MJSEGMENT_OPTIONS_NOT_EDITABLE */
    public static final long f15976x4adee45a = 0;

    /* renamed from: MJSEGMENT_OPTIONS_POSITION_EDITABLE */
    public static final long f15977x389e3d10 = 1;

    /* renamed from: MJSEGMENT_OPTIONS_ROTATION_EDITABLE */
    public static final long f15978x24df165b = 2;

    /* renamed from: MJSEGMENT_OPTIONS_SCALE_EDITABLE */
    public static final long f15979x6eae0543 = 4;

    /* renamed from: MJSEGMENT_OPTIONS_TEXT_EDITABLE */
    public static final long f15980x8c25688c = 8;
    private static final java.lang.String TAG = "MJMovieSession";

    /* renamed from: dsViewProxy */
    private io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa f15981xff2f42fa;

    /* renamed from: mCallbackManager */
    private final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f15982xe8c0cf7b;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15983x39e86013;

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType */
        static final /* synthetic */ int[] f15984xe9bd3a0c;

        static {
            int[] iArr = new int[com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType.m33866xcee59d22().length];
            f15984xe9bd3a0c = iArr;
            try {
                iArr[com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f15984xe9bd3a0c[com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType.TemplateBuiltin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f15984xe9bd3a0c[com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType.Recommendation.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$ClipBundleInfo */
    /* loaded from: classes5.dex */
    public static class ClipBundleInfo {

        /* renamed from: clipbundleAbsPath */
        private final java.lang.String f15985xe56f3785;

        /* renamed from: clipbundleId */
        private final java.lang.String f15986x8d13748d;

        /* renamed from: clipbundleRelPath */
        private final java.lang.String f15987x6d750c2c;

        /* renamed from: coverPath */
        public final java.lang.String f15988x75fe787c;

        /* renamed from: sizeInDisk */
        public final long f15989x6ff47bc3;

        public ClipBundleInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
            this.f15986x8d13748d = str;
            this.f15985xe56f3785 = str2;
            this.f15987x6d750c2c = str3;
            this.f15988x75fe787c = str4;
            this.f15989x6ff47bc3 = j17;
        }

        /* renamed from: equals */
        public boolean m33468xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.ClipBundleInfo clipBundleInfo = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.ClipBundleInfo) obj;
            return this.f15989x6ff47bc3 == clipBundleInfo.f15989x6ff47bc3 && this.f15986x8d13748d.equals(clipBundleInfo.f15986x8d13748d) && this.f15988x75fe787c.equals(clipBundleInfo.f15988x75fe787c);
        }

        /* renamed from: getClipbundleId */
        public java.lang.String m33469xee060703() {
            return this.f15986x8d13748d;
        }

        /* renamed from: getClipbundlePath */
        public java.lang.String m33470x84a3840d() {
            return this.f15985xe56f3785;
        }

        /* renamed from: getCoverPath */
        public java.lang.String m33471x756be9c6() {
            return this.f15988x75fe787c;
        }

        /* renamed from: getSizeInDisk */
        public long m33472x5e3533b9() {
            return this.f15989x6ff47bc3;
        }

        /* renamed from: hashCode */
        public int m33473x8cdac1b() {
            return java.util.Objects.hash(this.f15986x8d13748d, this.f15988x75fe787c, java.lang.Long.valueOf(this.f15989x6ff47bc3));
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$MJMovieComposingMode */
    /* loaded from: classes5.dex */
    public enum MJMovieComposingMode {
        Clipping(0),
        Simple(1);


        /* renamed from: value */
        private final int f15993x6ac9171;

        MJMovieComposingMode(int i17) {
            this.f15993x6ac9171 = i17;
        }

        /* renamed from: fromInt */
        public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.MJMovieComposingMode m33475xdc92efe5(int i17) {
            for (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.MJMovieComposingMode mJMovieComposingMode : m33477xcee59d22()) {
                if (mJMovieComposingMode.m33478x754a37bb() == i17) {
                    return mJMovieComposingMode;
                }
            }
            return Clipping;
        }

        /* renamed from: getValue */
        public int m33478x754a37bb() {
            return this.f15993x6ac9171;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnComplete */
    /* loaded from: classes5.dex */
    public interface OnComplete {
        /* renamed from: onComplete */
        void mo9331x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnDidTapSegment */
    /* loaded from: classes5.dex */
    public interface OnDidTapSegment {
        /* renamed from: onDidTapSegment */
        void mo33479x50d81c50(java.lang.String str, long j17);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnExportClipBundle */
    /* loaded from: classes5.dex */
    public interface OnExportClipBundle {
        /* renamed from: onExportClipBundle */
        void m33480xa36e96c5(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnExportComplete */
    /* loaded from: classes5.dex */
    public interface OnExportComplete {
        /* renamed from: onExportComplete */
        void mo9328xdd715ccc(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnHandleBoxComplete */
    /* loaded from: classes5.dex */
    public interface OnHandleBoxComplete {
        /* renamed from: onHandleBoxComplete */
        void mo33481xf9e434bd(java.lang.String str);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnHandleBoxSettingsChanged */
    /* loaded from: classes5.dex */
    public interface OnHandleBoxSettingsChanged {
        /* renamed from: handleBoxSettingsChanged */
        void mo33482x2f975c0e(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4052x7dfcf7a9 c4052x7dfcf7a9);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnMediaTimeChange */
    /* loaded from: classes5.dex */
    public interface OnMediaTimeChange {
        /* renamed from: onMediaTimeChange */
        void mo33483x51a35402(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, long j17);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnMusicRecommendComplete */
    /* loaded from: classes5.dex */
    public interface OnMusicRecommendComplete {
        /* renamed from: onRecommendComplete */
        void mo9372x7c9af5f6(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356[] c4116xf4b2c356Arr, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnProgress */
    /* loaded from: classes5.dex */
    public interface OnProgress {
        /* renamed from: onProgress */
        void m33484x696ee52c(float f17);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnRecommendComplete */
    /* loaded from: classes5.dex */
    public interface OnRecommendComplete {
        /* renamed from: onRecommendComplete */
        void mo9346x7c9af5f6(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2 c4123xc221bdc2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnTaskProgress */
    /* loaded from: classes5.dex */
    public interface OnTaskProgress {
        /* renamed from: onTaskProgress */
        void mo9321xda309251(float f17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnTemplateBuildComplete */
    /* loaded from: classes5.dex */
    public interface OnTemplateBuildComplete {
        /* renamed from: onTemplateBuildComplete */
        void mo9364x50d7face(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$OnWillShowHandleBox */
    /* loaded from: classes5.dex */
    public interface OnWillShowHandleBox {
        /* renamed from: onWillShowHandleBox */
        void mo33485xd1776935(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2, float f17);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$SnapshotAndExportClipBundleCallback */
    /* loaded from: classes5.dex */
    public interface SnapshotAndExportClipBundleCallback {
        /* renamed from: onError */
        void mo33486xaf8aa769(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);

        /* renamed from: onSuccess */
        void mo33487xe05b4124(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.ClipBundleInfo clipBundleInfo);
    }

    public C4079x793f83(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f15982xe8c0cf7b = c4099x76754671;
        this.f15983x39e86013 = m33271xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m33271xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeAddStickerSegment */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33272x5bff16e0(java.lang.String str, boolean z17);

    /* renamed from: nativeAddTextSegment */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33273x368e0ddc(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 c4118xbb09bdf5, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367 c4124x9ef5b367, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d c4112xcdda485d, float f17, boolean z17);

    /* renamed from: nativeBeginClipping */
    private native void m33274x4f11db4(int i17);

    /* renamed from: nativeBuildBlankTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33275x6d82ce97(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, int i17, int i18);

    /* renamed from: nativeBuildTemplateWithMusic */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33276x4586b9ce(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18);

    /* renamed from: nativeBuildTemplateWithTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33277x581ff431(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18);

    /* renamed from: nativeCancelBuildTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33278xf8fe3b17(int i17);

    /* renamed from: nativeCancelExporting */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33279x193a693d(int i17);

    /* renamed from: nativeCancelMovieCreation */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33280xcc1743e(int i17);

    /* renamed from: nativeCancelMusicRecommend */
    private native void m33281x3a210be8(int i17);

    /* renamed from: nativeCancelRecreation */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33282xb5c6da63(int i17);

    /* renamed from: nativeCancelTemplateRecommend */
    private native void m33283x2658bff1(int i17);

    /* renamed from: nativeCommitChangesAndNotifyRenderUpdate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33284x384ce26a(boolean z17);

    /* renamed from: nativeCommitChangesAndNotifyRenderUpdateByPreviewTime */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33285x2c39df94(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17);

    /* renamed from: nativeConnectToView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33286x61149273(java.lang.Object obj);

    /* renamed from: nativeConvertCanvasPointToViewPoint */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33287xcdbf3434(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    /* renamed from: nativeConvertViewPointToCanvasPoint */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33288x9c736e2e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    /* renamed from: nativeDisconnectFromView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33289xa78516a2();

    /* renamed from: nativeEndClipping */
    private native void m33290xb4ab1226(int i17);

    /* renamed from: nativeEnterFocusMode */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33291x42b0ca9a(java.lang.String str);

    /* renamed from: nativeExportClipBundle */
    private native void m33292x111568fd(int i17);

    /* renamed from: nativeGetAssetInfo */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 m33293xa5a976bf(java.lang.String str);

    /* renamed from: nativeGetCurrentLyricInfos */
    private native java.lang.Object[] m33294xd73070c0();

    /* renamed from: nativeGetCurrentMovieOptions */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b m33295xe613ab28();

    /* renamed from: nativeGetCurrentMusicInfo */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33296x93afc8d9();

    /* renamed from: nativeGetCurrentMusicOptions */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6 m33297xb6d12e93();

    /* renamed from: nativeGetCurrentPlaybackTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33298xe2905962();

    /* renamed from: nativeGetCurrentState */
    private native int m33299xa85883f7();

    /* renamed from: nativeGetCurrentTemplateInfo */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 m33300x57941a22();

    /* renamed from: nativeGetCurrentTemplateMusicInfos */
    private native java.lang.Object[] m33301x566330d4();

    /* renamed from: nativeGetCurrentTemplateSettings */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4091xa068467a m33302x28e59797();

    /* renamed from: nativeGetPlaybackDuration */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33303x7cb45eae();

    /* renamed from: nativeGetRecommendedMusicInfos */
    private native java.lang.Object[] m33304x6b41589c();

    /* renamed from: nativeGetSegmentClipDuration */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33305xab846198(java.lang.String str);

    /* renamed from: nativeGetSegmentNormalizedCropRect */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae m33306xe2135e3f(java.lang.String str);

    /* renamed from: nativeGetSegmentRotationMode */
    private native int m33307xa7b52ad5(java.lang.String str);

    /* renamed from: nativeGetSegmentSpatialInfo */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 m33308x5ace14be(java.lang.String str);

    /* renamed from: nativeGetSegmentTimeRangeInClip */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33309x367d7b91(java.lang.String str);

    /* renamed from: nativeGetSegmentTimeRangeInTimeline */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33310xcaefa402(java.lang.String str);

    /* renamed from: nativeGetStickerSegmentById */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33311x94d62a47(java.lang.String str);

    /* renamed from: nativeGetStorylineClipSegments */
    private native java.lang.Object[] m33312xe5a9559a();

    /* renamed from: nativeGetTemplateAnalysisPbData */
    private native byte[] m33313x2e6ec71();

    /* renamed from: nativeGetTextSegmentById */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33314x82e9879(java.lang.String str);

    /* renamed from: nativeGetTextSegmentLayerStyle */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d m33315x7c91e647(java.lang.String str);

    /* renamed from: nativeGetTextSegmentText */
    private native java.lang.String m33316x83681d4(java.lang.String str);

    /* renamed from: nativeGetTextSegmentTextStyle */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367 m33317x393db03d(java.lang.String str);

    /* renamed from: nativeGetVideoAspectRatio */
    private native double m33318x5baaecf7();

    /* renamed from: nativeLeaveFocusMode */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33319xf66bed9b();

    /* renamed from: nativeOnTapRenderView */
    private native void m33320x34c1ca8(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    /* renamed from: nativeOnUpdateSegmentFlip */
    private native void m33321xa24c1001();

    /* renamed from: nativeOnUpdateSegmentPosition */
    private native void m33322x3c34bebd(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    /* renamed from: nativeOnUpdateSegmentRotation */
    private native void m33323xd3b3512(float f17);

    /* renamed from: nativeOnUpdateSegmentScale */
    private native void m33324xa7e8ec36(float f17);

    /* renamed from: nativeOnUpdateSegmentScaleDidFinish */
    private native void m33325x1dc4f25c();

    /* renamed from: nativeRecreateUsingBlankTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33326xcc9da090(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, int i17, int i18);

    /* renamed from: nativeRecreateWithMusic */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33327x9dce5979(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18);

    /* renamed from: nativeRecreateWithTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33328x8f0db0a6(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18);

    /* renamed from: nativeRemoveHandleBox */
    private native void m33329x722fd948();

    /* renamed from: nativeRemoveSegment */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33330x60725f38(java.lang.String str, boolean z17);

    /* renamed from: nativeRemoveSegmentByHandleBox */
    private native void m33331x34792194();

    /* renamed from: nativeRequestMusicRecommend */
    private native int m33332x6905b8af(java.lang.String str, long j17, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: nativeRequestTemplateRecommend */
    private native int m33333x2b7f09ca(java.lang.String str, boolean z17, java.util.List<java.lang.String> list, int i17);

    /* renamed from: nativeSetAssetsByAIModelType */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33334xbf34d476(java.lang.String str, java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list);

    /* renamed from: nativeSetHandleBoxSettingsChangeCallback */
    private native void m33335xe2efcb30(int i17, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeSetOnDidRemoveHandleBoxCallback */
    private native void m33336x2ee69bef(int i17);

    /* renamed from: nativeSetOnDidRemoveSegmentCallback */
    private native void m33337x8cecda5f(int i17);

    /* renamed from: nativeSetOnDidTapSegmentCallback */
    private native void m33338xbd420b6a(int i17);

    /* renamed from: nativeSetOnPlaybackMediaTimeDidChangeFunc */
    private native void m33339xd56ffdc7(int i17);

    /* renamed from: nativeSetOnWillShowHandleBoxCallback */
    private native void m33340xe21640cf(int i17);

    /* renamed from: nativeSetSegmentNormalizedCropRect */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33341x2bdfb6b3(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae, boolean z17);

    /* renamed from: nativeSetSegmentRotationMode */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33342xf5f9ea49(java.lang.String str, int i17, boolean z17);

    /* renamed from: nativeSetSegmentTimeRangeInClip */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33343x68c1179d(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553);

    /* renamed from: nativeSetTextResolver */
    private native void m33344x6367ccbe(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.InterfaceC4092xc70bc290 interfaceC4092xc70bc290);

    /* renamed from: nativeShowHandleBox */
    private native void m33345x8124552f(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f c4050x944e439f, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999> list);

    /* renamed from: nativeSkimTo */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33346x8ead100e(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18);

    /* renamed from: nativeSkimToSegment */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33347x9eae9b45(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18);

    /* renamed from: nativeStartExporting */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33348xd2024963(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, int i17, int i18);

    /* renamed from: nativeStartMovieCreationAutoRecommendTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33349xd12c6063(java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18);

    /* renamed from: nativeStartMovieCreationUsingBlankTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33350x53c2b44e(java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, int i17, int i18, int i19);

    /* renamed from: nativeStartMovieCreationUsingProject */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33351x70cf1979(java.lang.String str, boolean z17, int i17, int i18);

    /* renamed from: nativeStartMovieCreationUsingTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33352x95d5ca1a(java.lang.String str, java.lang.String str2, java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18, int i19);

    /* renamed from: nativeStartMovieCreationUsingTemplate */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33353x95d5ca1a(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, int i17, int i18, int i19);

    /* renamed from: nativeStartMovieCreationWithComposingDesc */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33354xcf91b8d6(java.nio.ByteBuffer byteBuffer, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, int i17, int i18, int i19);

    /* renamed from: nativeStartPlaying */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33355x326c8b23(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17, int i18);

    /* renamed from: nativeStopPlaying */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33356x6f8bed35(int i17);

    /* renamed from: nativeSwitchTemplateWithBuildResult */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33357x832e4900(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274, int i17);

    /* renamed from: nativeTakeSnapshotAndExportClipBundle */
    private native void m33358x59da823b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4089x37707008 c4089x37707008, int i17);

    /* renamed from: nativeTeardown */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33359xb4cc133b(int i17);

    /* renamed from: nativeUpdateMovieOptions */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33360xf5c6e52e(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, int i17);

    /* renamed from: nativeUpdateSegmentSpatialInfo */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33361x8da1027f(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 c4118xbb09bdf5, boolean z17);

    /* renamed from: nativeUpdateTextSegmentStyle */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33362xbd17dfeb(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367 c4124x9ef5b367, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d c4112xcdda485d, boolean z17);

    /* renamed from: nativeUpdateTextSegmentText */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33363xcc4b53b3(java.lang.String str, java.lang.String str2, boolean z17);

    /* renamed from: GetCurrentPlaybackTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33364x3475448b() {
        return m33298xe2905962();
    }

    /* renamed from: addStickerSegment */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.g m33365x8677d637(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33272x5bff16e0 = m33272x5bff16e0(str, z17);
        if (m33272x5bff16e0 == null) {
            return null;
        }
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.g(m33272x5bff16e0.f129698a, this);
    }

    /* renamed from: addTextSegment */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.h m33366x689a65e5(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 c4118xbb09bdf5, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367 c4124x9ef5b367, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d c4112xcdda485d, float f17, boolean z17) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33273x368e0ddc = m33273x368e0ddc(str, c4118xbb09bdf5, c4124x9ef5b367, c4112xcdda485d, f17, z17);
        if (m33273x368e0ddc == null) {
            return null;
        }
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.h(m33273x368e0ddc.f129698a, this);
    }

    /* renamed from: beginClipping */
    public void m33367x6165208b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        m33274x4f11db4(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: buildBlankTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33368x9221fa20(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete onTemplateBuildComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TemplateBuildCompleteCallback(this, onTemplateBuildComplete));
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        return m33275x6d82ce97(str, c4071x3faf438b, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: buildTemplateWithMusic */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33369x6822f8d7(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete onTemplateBuildComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TemplateBuildCompleteCallback(this, onTemplateBuildComplete));
        return m33276x4586b9ce(str, c4071x3faf438b, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: buildTemplateWithTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33370xfcab6c88(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete onTemplateBuildComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TemplateBuildCompleteCallback(this, onTemplateBuildComplete));
        return m33277x581ff431(str, android.text.TextUtils.isEmpty(str2) ? null : str2, c4071x3faf438b, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: cancelBuildTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33371x684480ae(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33278xf8fe3b17(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: cancelExporting */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33372x28b91254(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        try {
            return m33279x193a693d(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
        } catch (java.lang.Exception e17) {
            return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.InvalidState.m33752x130a215f(), e17.getMessage());
        }
    }

    /* renamed from: cancelMovieCreation */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33373x7c07b9d5(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33280xcc1743e(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: cancelMusicRecommend */
    public void m33374xb3a37931(int i17) {
        try {
            m33281x3a210be8(i17);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: cancelRecreation */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33375x961d542c(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33282xb5c6da63(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: cancelTemplateRecommend */
    public void m33376x57446208(int i17) {
        try {
            m33283x2658bff1(i17);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: commitChangesAndNotifyRenderUpdate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33377xf21ddbf3() {
        return m33284x384ce26a(false);
    }

    /* renamed from: convertCanvasPointToViewPoint */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33381xd498a90b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        return m33287xcdbf3434(c3974x289f3e, c3972x4b2f2ae);
    }

    /* renamed from: convertViewPointToCanvasPoint */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33382xa34ce305(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        return m33288x9c736e2e(c3974x289f3e, c3972x4b2f2ae);
    }

    /* renamed from: createMJHandleBoxTouchHelper */
    public mg.a m33384xa7907a83(android.content.Context context, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, og.a aVar, mg.d dVar) {
        return new mg.a(this, context, c3974x289f3e, aVar, dVar);
    }

    /* renamed from: endClipping */
    public void m33385xdb1fdebd(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        m33290xb4ab1226(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: enterFocusMode */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33386x74bd22a3(java.lang.String str) {
        return m33291x42b0ca9a(str);
    }

    /* renamed from: exportClipBundle */
    public void m33387xf16be2c6(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportClipBundle onExportClipBundle) {
        m33292x111568fd(onExportClipBundle != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.ExportClipBundleCallback(this, onExportClipBundle)) : -1);
    }

    /* renamed from: getAssetInfo */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 m33388x4dce3d08(java.lang.String str) {
        return m33293xa5a976bf(str);
    }

    /* renamed from: getCurrentLyricInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90> m33389x50b2de09() {
        java.lang.Object[] m33294xd73070c0 = m33294xd73070c0();
        if (m33294xd73070c0 == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(m33294xd73070c0.length);
        for (java.lang.Object obj : m33294xd73070c0) {
            arrayList.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90) obj);
        }
        return arrayList;
    }

    /* renamed from: getCurrentMovieOptions */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b m33390x8afea31() {
        return m33295xe613ab28();
    }

    /* renamed from: getCurrentMusicInfo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33391x2f60e70() {
        return m33296x93afc8d9();
    }

    /* renamed from: getCurrentMusicOptions */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6 m33392xd96d6d9c() {
        return m33297xb6d12e93();
    }

    /* renamed from: getCurrentState */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece m33393xb7d72d0e() {
        return com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.m33490xdc92efe5(m33299xa85883f7());
    }

    /* renamed from: getCurrentTemplateBuiltinMusicInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> m33394x7a15d986() {
        java.lang.Object[] m33301x566330d4 = m33301x566330d4();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m33301x566330d4 != null) {
            for (java.lang.Object obj : m33301x566330d4) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj);
            }
        }
        return arrayList;
    }

    /* renamed from: getCurrentTemplateInfo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 m33395x7a30592b() {
        return m33300x57941a22();
    }

    /* renamed from: getCurrentTemplateMusicInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> m33396x98ac451d() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6 m33392xd96d6d9c = m33392xd96d6d9c();
        if (m33392xd96d6d9c == null) {
            return m33394x7a15d986();
        }
        int i17 = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.AnonymousClass1.f15984xe9bd3a0c[m33392xd96d6d9c.m33863xac019deb().ordinal()];
        if (i17 == 1) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b m33390x8afea31 = m33390x8afea31();
            if (m33390x8afea31 != null) {
                arrayList = m33390x8afea31.m33216xef791d8e() ? new java.util.ArrayList(m33399x57c9f965()) : new java.util.ArrayList(m33394x7a15d986());
            }
            arrayList = null;
        } else if (i17 != 2) {
            if (i17 == 3) {
                arrayList = new java.util.ArrayList(m33399x57c9f965());
            }
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(m33394x7a15d986());
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33862x16a99dbd = m33392xd96d6d9c.m33862x16a99dbd();
        if (m33862x16a99dbd != null && !arrayList.contains(m33862x16a99dbd)) {
            arrayList.add(0, m33862x16a99dbd);
        }
        return arrayList;
    }

    /* renamed from: getCurrentTemplateSettings */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4091xa068467a m33397x15c92a20() {
        return m33302x28e59797();
    }

    /* renamed from: getPlaybackDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33398xebfaa445() {
        return m33303x7cb45eae();
    }

    /* renamed from: getRecommendedMusicInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> m33399x57c9f965() {
        java.lang.Object[] m33304x6b41589c = m33304x6b41589c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m33304x6b41589c != null) {
            for (java.lang.Object obj : m33304x6b41589c) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj);
            }
        }
        return arrayList;
    }

    /* renamed from: getSegmentClipDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33400xce20a0a1(java.lang.String str) {
        return m33305xab846198(str);
    }

    /* renamed from: getSegmentNormalizedCropRect */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae m33401x245c7288(java.lang.String str) {
        return m33306xe2135e3f(str);
    }

    /* renamed from: getSegmentRotationMode */
    public int m33402xca5169de(java.lang.String str) {
        return m33307xa7b52ad5(str);
    }

    /* renamed from: getSegmentSpatialInfo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 m33403x11995095(java.lang.String str) {
        return m33308x5ace14be(str);
    }

    /* renamed from: getSegmentTimeRangeInClip */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33404xdb08f3e8(java.lang.String str) {
        return m33309x367d7b91(str);
    }

    /* renamed from: getSegmentTimeRangeInTimeline */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33405xd1c918d9(java.lang.String str) {
        return m33310xcaefa402(str);
    }

    /* renamed from: getStickerSegmentById */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.g m33406x4ba1661e(java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33311x94d62a47 = m33311x94d62a47(str);
        if (m33311x94d62a47 == null) {
            return null;
        }
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.g(m33311x94d62a47.f129698a, this);
    }

    /* renamed from: getStorylineClipSegments */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a> m33407xd231f663() {
        java.lang.Object[] m33312xe5a9559a = m33312xe5a9559a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m33312xe5a9559a != null) {
            for (java.lang.Object obj : m33312xe5a9559a) {
                arrayList.add(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a((com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4098xa14e19b4) obj, this));
            }
        }
        return arrayList;
    }

    /* renamed from: getTemplateAnalysisPbData */
    public byte[] m33408xa77264c8() {
        return m33313x2e6ec71();
    }

    /* renamed from: getTextSegmentById */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.h m33409x2ccdc402(java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4088x788992d6 m33314x82e9879 = m33314x82e9879(str);
        if (m33314x82e9879 == null) {
            return null;
        }
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.h(m33314x82e9879.f129698a, this);
    }

    /* renamed from: getTextSegmentLayerStyle */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d m33410x691a8710(java.lang.String str) {
        return m33315x7c91e647(str);
    }

    /* renamed from: getTextSegmentText */
    public java.lang.String m33411x2cd5ad5d(java.lang.String str) {
        return m33316x83681d4(str);
    }

    /* renamed from: getTextSegmentTextStyle */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367 m33412x6a295254(java.lang.String str) {
        return m33317x393db03d(str);
    }

    /* renamed from: getVideoAspectRatio */
    public java.lang.Double m33413xcaf1328e() {
        return java.lang.Double.valueOf(m33318x5baaecf7());
    }

    /* renamed from: leaveFocusMode */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33414x287845a4() {
        return m33319xf66bed9b();
    }

    /* renamed from: notifySurfaceChanged */
    public void m33415xa36f50f0(int i17, int i18, int i19) {
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa abstractC28530xd96ac6fa = this.f15981xff2f42fa;
        if (abstractC28530xd96ac6fa == null || !(abstractC28530xd96ac6fa instanceof io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "current surface is not DSProxySurface");
            throw new java.lang.IllegalStateException("current surface is not DSProxySurface");
        }
        ((io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e) abstractC28530xd96ac6fa).mo136918xa36f50f0(i17, i18, i19);
    }

    /* renamed from: onTapRenderView */
    public void m33416x12cac5bf(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        m33320x34c1ca8(c3974x289f3e, c3972x4b2f2ae);
    }

    /* renamed from: onUpdateSegmentFlip */
    public void m33417x11925598() {
        m33321xa24c1001();
    }

    /* renamed from: onUpdateSegmentPosition */
    public void m33418x6d2060d4(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        m33322x3c34bebd(c3974x289f3e, c3972x4b2f2ae);
    }

    /* renamed from: onUpdateSegmentRotation */
    public void m33419x3e26d729(float f17) {
        m33323xd3b3512(f17);
    }

    /* renamed from: onUpdateSegmentScale */
    public void m33420x216b597f(float f17) {
        m33324xa7e8ec36(f17);
    }

    /* renamed from: onUpdateSegmentScaleDidFinish */
    public void m33421x249e6733() {
        m33325x1dc4f25c();
    }

    /* renamed from: recreateUsingBlankTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33422xb9813319(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        return m33326xcc9da090(str, c4071x3faf438b, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: recreateWithMusicID */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33423xd2e42deb(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        return m33327x9dce5979(str, c4071x3faf438b, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: recreateWithTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33424x8901def(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        return m33328x8f0db0a6(str, android.text.TextUtils.isEmpty(str2) ? null : str2, c4071x3faf438b, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: release */
    public void m33425x41012807() {
        this.f15983x39e86013.m16727xc85fe246();
    }

    /* renamed from: removeHandleBox */
    public void m33426x81ae825f() {
        m33329x722fd948();
    }

    /* renamed from: removeSegment */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33427xbce6620f(java.lang.String str, boolean z17) {
        return m33330x60725f38(str, z17);
    }

    /* renamed from: removeSegmentByHandleBox */
    public void m33428x2101c25d() {
        m33331x34792194();
    }

    /* renamed from: requestMusicRecommend */
    public int m33429x1fd0f486(java.lang.String str, long j17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMusicRecommendComplete onMusicRecommendComplete) {
        return m33332x6905b8af(str, j17, null, this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.RecommendMusicCompleteCallback(this, onMusicRecommendComplete)));
    }

    /* renamed from: requestTemplateRecommend */
    public int m33431x1807aa93(java.lang.String str, boolean z17, java.util.List<java.lang.String> list, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete onRecommendComplete) {
        return m33333x2b7f09ca(str, z17, list, this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.RecommendCompleteCallback(this, onRecommendComplete)));
    }

    /* renamed from: setAssetsByAIModelType */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33432xe1d1137f(java.lang.String str, java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list) {
        return m33334xbf34d476(str, list);
    }

    /* renamed from: setOnDidRemoveHandleBoxCallback */
    public void m33433xe5363706(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete onHandleBoxComplete) {
        m33336x2ee69bef(onHandleBoxComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.OnHanldeBoxCompleteCallback(this, false, onHandleBoxComplete)) : -1);
    }

    /* renamed from: setOnDidRemoveSegmentCallback */
    public void m33434x93c64f36(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete onHandleBoxComplete) {
        m33337x8cecda5f(onHandleBoxComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.OnHanldeBoxCompleteCallback(this, false, onHandleBoxComplete)) : -1);
    }

    /* renamed from: setOnDidTapSegmentCallback */
    public void m33435xaa259df3(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment onDidTapSegment) {
        m33338xbd420b6a(onDidTapSegment != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.OnDidTapSegmentCallback(this, false, onDidTapSegment)) : -1);
    }

    /* renamed from: setOnHandleBoxSettingsChangeCallback */
    public void m33436xa41edb5a(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        m33335xe2efcb30(onHandleBoxSettingsChanged != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.OnHandleBoxSettingsChangeCallback(this, false, onHandleBoxSettingsChanged)) : -1, c3974x289f3e);
    }

    /* renamed from: setOnPlaybackMediaTimeDidChange */
    public void m33437xd852eb7a(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMediaTimeChange onMediaTimeChange) {
        m33339xd56ffdc7(onMediaTimeChange != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.MediaTimeChangeCallback(this, onMediaTimeChange, false)) : -1);
    }

    /* renamed from: setOnWillShowHandleBoxCallback */
    public void m33438xb66b66d8(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox onWillShowHandleBox) {
        m33340xe21640cf(onWillShowHandleBox != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.OnWillShowHandleBoxCallback(this, false, onWillShowHandleBox)) : -1);
    }

    /* renamed from: setRenderView */
    public void m33439x63923b5d(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "renderView must be SDK DSRenderView");
            throw new java.security.InvalidParameterException("renderView must be SDK DSRenderView");
        }
        if (this.f15981xff2f42fa != null) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a view connected!");
            throw new java.lang.IllegalStateException("Already a view connected!");
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa m136921x4fd765e4 = ((io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) surfaceView).m136921x4fd765e4();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33286x61149273 = m33286x61149273(m136921x4fd765e4);
        if (m33286x61149273 == null) {
            this.f15981xff2f42fa = m136921x4fd765e4;
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Fail to connect to RenderView, " + m33286x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + m33286x61149273.f16057x38eb0007);
    }

    /* renamed from: setSegmentNormalizedCropRect */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33440x6e28cafc(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae, boolean z17) {
        return m33341x2bdfb6b3(str, c3972x4b2f2ae, z17);
    }

    /* renamed from: setSegmentRotationMode */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33441x18962952(java.lang.String str, int i17, boolean z17) {
        return m33342xf5f9ea49(str, i17, z17);
    }

    /* renamed from: setSegmentTimeRangeInClip */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33442xd4c8ff4(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        return m33343x68c1179d(str, c4129xdee64553);
    }

    /* renamed from: setSurface */
    public void m33443x42c875eb(android.view.Surface surface) {
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa abstractC28530xd96ac6fa = this.f15981xff2f42fa;
        if (abstractC28530xd96ac6fa != null && !(abstractC28530xd96ac6fa instanceof io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a non surface output connected");
            throw new java.lang.IllegalArgumentException("Already a non surface output connected");
        }
        if (surface == null && abstractC28530xd96ac6fa == null) {
            return;
        }
        if (abstractC28530xd96ac6fa != null) {
            io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e c28527x82dcc08e = (io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e) abstractC28530xd96ac6fa;
            if (surface == null) {
                c28527x82dcc08e.m136919x385f87a4(null);
                c28527x82dcc08e.m136941x26cc0ebf();
                io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "setSurface, surface destroyed");
                return;
            } else {
                if (c28527x82dcc08e.m136913xcf572877() != null) {
                    io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a surface connect, please setSurface(null) firstly");
                    throw new java.lang.IllegalStateException("Already a surface connect, please setSurface(null) firstly");
                }
                c28527x82dcc08e.m136919x385f87a4(surface);
                c28527x82dcc08e.m136940xb4b26d24(surface);
                io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "setSurface, surface changed: " + surface);
                return;
            }
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e c28527x82dcc08e2 = new io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e(surface);
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33286x61149273 = m33286x61149273(c28527x82dcc08e2);
        if (m33286x61149273 == null) {
            this.f15981xff2f42fa = c28527x82dcc08e2;
            c28527x82dcc08e2.m136940xb4b26d24(surface);
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "nativeConnectToView, new surface created: " + surface);
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Fail to connect to surface, " + m33286x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to surface, " + m33286x61149273.f16057x38eb0007);
    }

    /* renamed from: setSurfaceHolder */
    public void m33444x5660d377(android.view.SurfaceHolder surfaceHolder) {
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa abstractC28530xd96ac6fa = this.f15981xff2f42fa;
        if (abstractC28530xd96ac6fa != null) {
            if (abstractC28530xd96ac6fa instanceof io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28528x732d57da) {
                return;
            }
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a non SurfaceHolder connected");
            throw new java.lang.IllegalArgumentException("Already a non SurfaceHolder connected");
        }
        if (surfaceHolder == null) {
            return;
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28528x732d57da surfaceHolderCallbackC28528x732d57da = new io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28528x732d57da(surfaceHolder);
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33286x61149273 = m33286x61149273(surfaceHolderCallbackC28528x732d57da);
        if (m33286x61149273 == null) {
            this.f15981xff2f42fa = surfaceHolderCallbackC28528x732d57da;
            if (surfaceHolder.getSurface() != null) {
                this.f15981xff2f42fa.m136940xb4b26d24(surfaceHolder.getSurface());
                return;
            }
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Fail to connect to surface, " + m33286x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to surface, " + m33286x61149273.f16057x38eb0007);
    }

    /* renamed from: setTextResolver */
    public void m33445x72e675d5(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.InterfaceC4092xc70bc290 interfaceC4092xc70bc290) {
        m33344x6367ccbe(interfaceC4092xc70bc290);
    }

    /* renamed from: showHandleBox */
    public void m33446xdd985806(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f c4050x944e439f, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999> list) {
        m33345x8124552f(str, c3972x4b2f2ae, c4111x4a556090, c4050x944e439f, list);
    }

    /* renamed from: skimTo */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33447xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18) {
        return m33346x8ead100e(c4128x879fba0a, j17, z17, z18);
    }

    /* renamed from: skimToSegment */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33448xfb229e1c(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m33347x9eae9b45(str, c4128x879fba0a, 0L, false, false);
    }

    /* renamed from: snapshotAndExportClipbundle */
    public void m33449x6f231a39(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
        m33450x6f231a39(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4089x37707008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.f()), snapshotAndExportClipBundleCallback);
    }

    /* renamed from: startExporting */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33451x40ea16c(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete onExportComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.ExportCompleteCallback(this, onExportComplete));
        return m33348xd2024963(str, c4129xdee64553, c4069xbe747ef4, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: startMovieCreationAutoRecommendTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33452x89d6f47a(java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete onRecommendComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.RecommendCompleteCallback(this, onRecommendComplete));
        return m33349xd12c6063(list, c4071x3faf438b, c4083x57f375ff, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: startMovieCreationUsingBlankTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33453xdd3b6f97(java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete2) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        return m33350x53c2b44e(list, android.text.TextUtils.isEmpty(str) ? null : str, c4071x3faf438b, c4083x57f375ff, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1], onComplete2 != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete2)) : -1);
    }

    /* renamed from: startMovieCreationUsingProject */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33454x45243f82(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33455x45243f82(str, false, onTaskProgress, onComplete);
    }

    /* renamed from: startMovieCreationUsingTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33456x4c256531(java.lang.String str, java.lang.String str2, java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete2) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        return m33352x95d5ca1a(str, str2, list, c4071x3faf438b, c4083x57f375ff, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1], onComplete2 != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete2)) : -1);
    }

    /* renamed from: startMovieCreationWithComposingDesc */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33458x4fdff06d(kg.a aVar, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete2) {
        this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        if (onComplete2 != null) {
            this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete2));
        }
        try {
            kg.x.m143297x3136c9db();
            throw null;
        } catch (java.lang.IllegalArgumentException e17) {
            return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.InvalidArgument.m33752x130a215f(), e17.getMessage()), -1L, "");
        } catch (java.lang.Exception e18) {
            return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.GeneralError.m33752x130a215f(), e18.getMessage()), -1L, "");
        }
    }

    /* renamed from: startPlaying */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33459xda91516c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33355x326c8b23(c4129xdee64553, c4128x879fba0a, i17, z17, onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: stopPlaying */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33460x9600b9cc(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33356x6f8bed35(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: switchTemplateWithBuildResult */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33461x8a07bdd7(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33357x832e4900(c4119x51ad3274, onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: tearDown */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33462x9ccada24(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        if (this.f15981xff2f42fa != null) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "nativeDisconnectFromView");
            m33289xa78516a2();
            this.f15981xff2f42fa = null;
        }
        return m33359xb4cc133b(onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: updateMovieOptions */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33463x1a6610b7(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        return m33360xf5c6e52e(c4071x3faf438b, onComplete != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: updateSegmentSpatialInfo */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33464x7a29a348(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 c4118xbb09bdf5, boolean z17) {
        return m33361x8da1027f(str, c4118xbb09bdf5, z17);
    }

    /* renamed from: updateTextSegmentStyle */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33465xdfb41ef4(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367 c4124x9ef5b367, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d c4112xcdda485d, boolean z17) {
        return m33362xbd17dfeb(str, c4124x9ef5b367, c4112xcdda485d, z17);
    }

    /* renamed from: updateTextSegmentText */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33466x83168f8a(java.lang.String str, java.lang.String str2, boolean z17) {
        return m33363xcc4b53b3(str, str2, z17);
    }

    /* renamed from: commitChangesAndNotifyRenderUpdate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33380xf21ddbf3(boolean z17) {
        return m33284x384ce26a(z17);
    }

    /* renamed from: createMJHandleBoxTouchHelper */
    public mg.a m33383xa7907a83(android.content.Context context, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, og.a aVar) {
        return new mg.a(this, context, c3974x289f3e, aVar, null);
    }

    /* renamed from: startMovieCreationUsingProject */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33455x45243f82(java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        return m33351x70cf1979(str, z17, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: commitChangesAndNotifyRenderUpdate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33378xf21ddbf3(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m33285x2c39df94(c4128x879fba0a, false);
    }

    /* renamed from: requestMusicRecommend */
    public int m33430x1fd0f486(java.lang.String str, long j17, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnMusicRecommendComplete onMusicRecommendComplete) {
        return m33332x6905b8af(str, j17, byteBuffer, this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.RecommendMusicCompleteCallback(this, onMusicRecommendComplete)));
    }

    /* renamed from: commitChangesAndNotifyRenderUpdate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33379xf21ddbf3(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17) {
        return m33285x2c39df94(c4128x879fba0a, z17);
    }

    /* renamed from: snapshotAndExportClipbundle */
    public void m33450x6f231a39(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4089x37707008 c4089x37707008, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback snapshotAndExportClipBundleCallback) {
        m33358x59da823b(c4089x37707008, snapshotAndExportClipBundleCallback != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.ExportClipBundleCallbackExt(this, snapshotAndExportClipBundleCallback)) : -1);
    }

    /* renamed from: startMovieCreationUsingTemplate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33457x4c256531(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4071x3faf438b c4071x3faf438b, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4083x57f375ff c4083x57f375ff, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4072x279d3306 c4072x279d3306, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete2) {
        int[] m33786xf8cd0e2f = this.f15982xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete));
        return m33353x95d5ca1a(str, list, list2, c4071x3faf438b, c4083x57f375ff, c4072x279d3306, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1], onComplete2 != null ? this.f15982xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4080x276590e8.CompleteCallback(this, onComplete2)) : -1);
    }
}

package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class Timeline {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.Storyline f48414a = new com.tencent.maas.moviecomposing.Storyline(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48415b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48416c;
    private final com.facebook.jni.HybridData mHybridData;

    private Timeline(com.facebook.jni.HybridData hybridData, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        this.mHybridData = hybridData;
        this.f48415b = mJTime;
        this.f48416c = mJTime2;
    }

    private native java.lang.String[] nativeAddPhotoVideoSegments(java.util.List<java.lang.String> list, boolean z17);

    private native com.tencent.maas.model.time.MJTime nativeAlignTimeToVideoFrameBoundary(com.tencent.maas.model.time.MJTime mJTime, boolean z17);

    private native java.lang.String nativeAnchorContentDescSegment(java.lang.String str, java.lang.String str2, boolean z17);

    private native java.lang.String nativeAnchorEmoticonSegment(java.lang.String str, int i17, int i18, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2);

    private native java.lang.String nativeAnchorFancyTextSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17, boolean z18);

    private native java.lang.String nativeAnchorMovieTitleSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17);

    private native java.lang.String nativeAnchorMusicSegment(com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17);

    private native java.lang.String nativeAnchorNarrationSegment(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.maas.moviecomposing.segments.CaptionItem> list, java.lang.String str3, com.tencent.maas.model.time.MJTime mJTime);

    private native java.lang.String nativeAnchorWhenWhereSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17);

    private native com.tencent.maas.base.Vec2 nativeCalcPixelSize(int i17);

    private native java.lang.String nativeFetchAIGCMetadata();

    private native com.tencent.maas.moviecomposing.AspectRatio nativeGetAspectRatioDesc();

    private native com.tencent.maas.model.time.MJTime nativeGetDuration();

    private native double nativeGetFrameRateValue();

    private native com.tencent.maas.base.Vec2 nativeGetPointSize();

    private native int nativeGetSegmentType(java.lang.String str);

    private native com.tencent.maas.moviecomposing.TimelineMutation nativeGetTimelineMutation();

    private native com.tencent.maas.moviecomposing.SynthSpecWrapper nativeGetUpdatedSynthSpecForCommit(boolean z17);

    private native com.tencent.maas.moviecomposing.SynthSpecWrapper nativeGetUpdatedSynthSpecForOpen(com.tencent.maas.model.time.MJTime mJTime);

    private native java.lang.String nativeGetUserInfo(java.lang.String str);

    private native double nativeGetVideoAspectRatio();

    private native com.tencent.maas.model.time.MJTime nativeGetVideoFrameDuration();

    private native boolean nativeHasAnyMutation();

    private native java.lang.String[] nativeInsertPhotoVideoSegments(java.util.List<java.lang.String> list, com.tencent.maas.model.time.MJTime mJTime, boolean z17);

    private native boolean nativeIsOSTenabled();

    private native boolean nativeIsTimeAlignedToVideoFrameBoundary(com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeMoveAnchoredSegment(java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeMoveStorySegment(java.lang.String str, java.lang.String str2);

    private native void nativeRemoveSegment(java.lang.String str);

    private native void nativeRemoveUserInfo(java.lang.String str);

    private native void nativeSetIsOSTEnabled(boolean z17);

    private native void nativeSetUserInfo(java.lang.String str, java.lang.String str2);

    private native java.lang.String[] nativeSplitSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, boolean z17);

    private native java.nio.ByteBuffer nativeToBinaryBuffer();

    private native java.lang.String nativeToJSONString();

    private native void nativeUpdateAspectRatio(com.tencent.maas.moviecomposing.AspectRatio aspectRatio);

    public java.nio.ByteBuffer A() {
        return nativeToBinaryBuffer();
    }

    public java.lang.String B() {
        return nativeToJSONString();
    }

    public void C(com.tencent.maas.moviecomposing.AspectRatio aspectRatio) {
        nativeUpdateAspectRatio(aspectRatio);
    }

    public com.tencent.maas.model.time.MJTime a(com.tencent.maas.model.time.MJTime mJTime) {
        return nativeAlignTimeToVideoFrameBoundary(mJTime, false);
    }

    public com.tencent.maas.model.time.MJTime b(com.tencent.maas.model.time.MJTime mJTime) {
        return nativeAlignTimeToVideoFrameBoundary(mJTime, true);
    }

    public com.tencent.maas.base.MJID c(java.lang.String str, com.tencent.maas.base.MJID mjid, boolean z17) {
        return com.tencent.maas.base.MJID.of(nativeAnchorContentDescSegment(str, mjid.value(), z17));
    }

    public com.tencent.maas.base.MJID d(java.lang.String str, com.tencent.maas.moviecomposing.b bVar, sg.c cVar, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2) {
        return com.tencent.maas.base.MJID.of(nativeAnchorEmoticonSegment(str, bVar.f48463d, cVar.f407662d, mJTime, mJTime2));
    }

    public com.tencent.maas.base.MJID e(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17, boolean z18) {
        return com.tencent.maas.base.MJID.of(nativeAnchorFancyTextSegment(str, mJTime, mJTime2, z17, z18));
    }

    public com.tencent.maas.base.MJID f(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17) {
        return com.tencent.maas.base.MJID.of(nativeAnchorMovieTitleSegment(str, mJTime, mJTime2, z17));
    }

    public com.tencent.maas.base.MJID g(com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17) {
        if (mJMusicInfo == null || str == null) {
            return null;
        }
        return com.tencent.maas.base.MJID.of(nativeAnchorMusicSegment(mJMusicInfo, str, str2, mJTime, mJTime2, z17));
    }

    public com.tencent.maas.base.MJID h(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, com.tencent.maas.model.time.MJTime mJTime) {
        if (str == null) {
            return null;
        }
        return com.tencent.maas.base.MJID.of(nativeAnchorNarrationSegment(str, str2, list, str3, mJTime));
    }

    public com.tencent.maas.base.MJID i(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17) {
        return com.tencent.maas.base.MJID.of(nativeAnchorWhenWhereSegment(str, mJTime, mJTime2, z17));
    }

    public java.lang.String j() {
        return nativeFetchAIGCMetadata();
    }

    public com.tencent.maas.moviecomposing.AspectRatio k() {
        return nativeGetAspectRatioDesc();
    }

    public com.tencent.maas.model.time.MJTime l() {
        return nativeGetDuration();
    }

    public com.tencent.maas.moviecomposing.segments.Segment m(com.tencent.maas.base.MJID mjid) {
        ug.m mVar;
        if (mjid == null) {
            return null;
        }
        int nativeGetSegmentType = nativeGetSegmentType(mjid.value());
        ug.m[] values = ug.m.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                mVar = ug.m.None;
                break;
            }
            mVar = values[i17];
            if (mVar.f427446d == nativeGetSegmentType) {
                break;
            }
            i17++;
        }
        return ug.k.a(mVar, mjid.value(), this);
    }

    public com.tencent.maas.moviecomposing.SynthSpecWrapper n(boolean z17) {
        return nativeGetUpdatedSynthSpecForCommit(z17);
    }

    public native java.lang.String nativeAnchorCaptionSegment(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17);

    public com.tencent.maas.moviecomposing.SynthSpecWrapper o(com.tencent.maas.model.time.MJTime mJTime) {
        return nativeGetUpdatedSynthSpecForOpen(mJTime);
    }

    public java.lang.String p(java.lang.String str) {
        return nativeGetUserInfo(str);
    }

    public double q() {
        return nativeGetVideoAspectRatio();
    }

    public boolean r() {
        return nativeHasAnyMutation();
    }

    public com.tencent.maas.base.MJID[] s(java.util.List list, com.tencent.maas.model.time.MJTime mJTime, boolean z17) {
        java.lang.String[] nativeInsertPhotoVideoSegments = nativeInsertPhotoVideoSegments(list, mJTime, z17);
        if (nativeInsertPhotoVideoSegments == null) {
            return new com.tencent.maas.base.MJID[0];
        }
        com.tencent.maas.base.MJID[] mjidArr = new com.tencent.maas.base.MJID[nativeInsertPhotoVideoSegments.length];
        for (int i17 = 0; i17 < nativeInsertPhotoVideoSegments.length; i17++) {
            mjidArr[i17] = com.tencent.maas.base.MJID.of(nativeInsertPhotoVideoSegments[i17]);
        }
        return mjidArr;
    }

    public boolean t(com.tencent.maas.model.time.MJTime mJTime) {
        return nativeIsTimeAlignedToVideoFrameBoundary(mJTime);
    }

    public void u(com.tencent.maas.base.MJID mjid, com.tencent.maas.base.MJID mjid2, com.tencent.maas.model.time.MJTime mJTime) {
        if (mjid2 == null) {
            nativeMoveAnchoredSegment(mjid.value(), null, mJTime);
        } else {
            nativeMoveAnchoredSegment(mjid.value(), mjid2.value(), mJTime);
        }
    }

    public void v(com.tencent.maas.base.MJID mjid, com.tencent.maas.base.MJID mjid2) {
        if (mjid2 == null) {
            nativeMoveStorySegment(mjid.value(), null);
        } else {
            nativeMoveStorySegment(mjid.value(), mjid2.value());
        }
    }

    public void w(com.tencent.maas.base.MJID mjid) {
        nativeRemoveSegment(mjid.value());
    }

    public com.tencent.maas.moviecomposing.TimelineMutation x() {
        if (nativeHasAnyMutation()) {
            return nativeGetTimelineMutation();
        }
        return null;
    }

    public void y(java.lang.String str, java.lang.String str2) {
        nativeSetUserInfo(str, str2);
    }

    public com.tencent.maas.base.MJID[] z(com.tencent.maas.base.MJID mjid, com.tencent.maas.model.time.MJTime mJTime, boolean z17) {
        java.lang.String[] nativeSplitSegment = nativeSplitSegment(mjid.value(), mJTime, z17);
        if (nativeSplitSegment == null) {
            return new com.tencent.maas.base.MJID[0];
        }
        com.tencent.maas.base.MJID[] mjidArr = new com.tencent.maas.base.MJID[nativeSplitSegment.length];
        for (int i17 = 0; i17 < nativeSplitSegment.length; i17++) {
            mjidArr[i17] = com.tencent.maas.base.MJID.of(nativeSplitSegment[i17]);
        }
        return mjidArr;
    }
}

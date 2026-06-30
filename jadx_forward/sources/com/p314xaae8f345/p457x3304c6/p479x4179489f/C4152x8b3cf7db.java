package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.PlaybackSession */
/* loaded from: classes5.dex */
public class C4152x8b3cf7db {

    /* renamed from: mCallbackManager */
    private final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f16130xe8c0cf7b;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16131x39e86013;

    /* renamed from: com.tencent.maas.moviecomposing.PlaybackSession$SegmentIDAndFrame */
    /* loaded from: classes5.dex */
    public static class SegmentIDAndFrame {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f129930a;

        public SegmentIDAndFrame(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
            this.f129930a = str;
        }
    }

    public C4152x8b3cf7db(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(android.os.Looper.getMainLooper());
        this.f16130xe8c0cf7b = c4099x76754671;
        this.f16131x39e86013 = m34079xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34079xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeAddDecorationBoxes */
    private native void m34080xdae0267f(java.util.List<com.p314xaae8f345.p457x3304c6.p479x4179489f.C4140x124a1dfd> list);

    /* renamed from: nativeBeginClipSkimming */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34081x644cfb33(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, java.lang.String str, int i17);

    /* renamed from: nativeBeginClipSkimmingWrapper */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34082xa960b1e0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 c4170x5817ebc8, int i17);

    /* renamed from: nativeBeginTrackingSafeArea */
    private native void m34083xb5636083(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae, int i17);

    /* renamed from: nativeBindRenderView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34084x4e42756f(java.lang.Object obj);

    /* renamed from: nativeCalcPoint */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34085x97d811e4(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeCalcRenderCoord */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34086xdf38c453(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeCalcViewPoint */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34087x2c437c3f(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeClipSkimToTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34088xf55227eb(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17);

    /* renamed from: nativeClose */
    private native void m34089x66d21421(int i17);

    /* renamed from: nativeCommitUpdate */
    private native void m34090x30338297(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, boolean z18, int i17);

    /* renamed from: nativeCommitUpdateSynthSpec */
    private native void m34091x6e4f4040(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, int i17);

    /* renamed from: nativeEndClipSkimming */
    private native void m34092x43366a5(int i17);

    /* renamed from: nativeEndTrackingSafeArea */
    private native void m34093xdc62c2f5();

    /* renamed from: nativeFetchRenderAreaPosition */
    private native void m34094x6bf97bcf(int i17);

    /* renamed from: nativeFetchRenderAreaRotation */
    private native void m34095x3cfff224(int i17);

    /* renamed from: nativeFetchRenderAreaScale */
    private native void m34096x36699864(int i17);

    /* renamed from: nativeFindHandleBoxRectCorner */
    private native int m34097x897393ac(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    /* renamed from: nativeGetCurrentPlaybackTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34098xe2905962();

    /* renamed from: nativeGetPlaybackTimeRange */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34099x7c01c096();

    /* renamed from: nativeGetRenderFrame */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae m34100x4565f438(java.lang.String str);

    /* renamed from: nativeGetRenderNodeModelSize */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34101xb329f6b3(java.lang.String str);

    /* renamed from: nativeGetSegmentID */
    private native java.lang.String m34102xf642528f(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeGetSegmentIDAndFrame */
    private native com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db.SegmentIDAndFrame m34103x1bd88585(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090);

    /* renamed from: nativeIsHandleBoxEnabled */
    private native boolean m34104x63c6e4ff();

    /* renamed from: nativeIsHandleBoxHitted */
    private native boolean m34105x5aad9622(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    /* renamed from: nativeOpen */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34106xb9040701(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c, int i17);

    /* renamed from: nativeOpenWithTimeline */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34107xfb08a4c8(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17);

    /* renamed from: nativeRemoveAllDecorationBoxes */
    private native void m34108x36efabe3();

    /* renamed from: nativeRemoveAllHandleBoxButtons */
    private native void m34109xa15c3c4();

    /* renamed from: nativeRemoveAllHandleBoxTitles */
    private native void m34110x817a1078();

    /* renamed from: nativeRemoveHandleBox */
    private native void m34111x722fd948();

    /* renamed from: nativeSetOnHandleBoxSettingsChangeCallback */
    private native void m34112x1aa62011(int i17);

    /* renamed from: nativeSetOnMediaTimeDidChangeCallback */
    private native void m34113x2049554d(int i17);

    /* renamed from: nativeSetOnPlaybackDidFinishCallback */
    private native void m34114xeeeb8a92(int i17);

    /* renamed from: nativeSetOnPlaybackFailCallback */
    private native void m34115x24936e68(int i17);

    /* renamed from: nativeShowHandleBox */
    private native void m34116x8124552f(java.lang.String str, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999> list, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4053x47710492> list2, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f c4050x944e439f);

    /* renamed from: nativeSkimTo */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34117x8ead100e(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18);

    /* renamed from: nativeSkipRefreshNextVideoFrame */
    private native void m34118xfd35382a();

    /* renamed from: nativeSnapshotAtTime */
    private native void m34119x4075887b(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17);

    /* renamed from: nativeStartPlaying */
    private native void m34120x326c8b23(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17, int i18);

    /* renamed from: nativeStopPlaying */
    private native void m34121x6f8bed35(int i17);

    /* renamed from: nativeUnbindRenderView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34122x53ea6288();

    /* renamed from: nativeUpdateHandleBoxEnabled */
    private native void m34123xd594df1e(boolean z17);

    /* renamed from: nativeUpdatePlaybackOptions */
    private native void m34124x89b7bc23(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, int i17, boolean z17);

    /* renamed from: nativeUpdateRenderAreaPosition */
    private native void m34125x45e2e96c(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeUpdateRenderAreaRotation */
    private native void m34126x16e95fc1(float f17);

    /* renamed from: nativeUpdateRenderAreaScale */
    private native void m34127x196f57e7(float f17);

    /* renamed from: updateHandleBoxEnabled */
    private void m34128xf8311e27(boolean z17) {
        m34123xd594df1e(z17);
    }

    /* renamed from: addDecorationBoxes */
    public void m34129xff7f5208(java.util.List<com.p314xaae8f345.p457x3304c6.p479x4179489f.C4140x124a1dfd> list) {
        m34080xdae0267f(list);
    }

    /* renamed from: beginClipSkimming */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34131x8ec5ba8a(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        return m34081x644cfb33(c4181x2248e1a3.D(), c4181x2248e1a3.f130065a.m32425x6ac9171(), uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: beginTrackingSafeArea */
    public void m34132x6c2e9c5a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae, com.p314xaae8f345.p457x3304c6.p479x4179489f.y yVar) {
        m34083xb5636083(c3971x241f78.m32425x6ac9171(), c3972x4b2f2ae, yVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.j0(this, false, yVar)) : -1);
    }

    /* renamed from: bindRenderView */
    public void m34133x804ecd78(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a)) {
            throw new java.lang.IllegalArgumentException("renderView must be SDK DSRenderView");
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34084x4e42756f = m34084x4e42756f(((io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) surfaceView).m136921x4fd765e4());
        if (m34084x4e42756f == null) {
            return;
        }
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + m34084x4e42756f.f16057x38eb0007);
    }

    /* renamed from: calcPoint */
    public android.graphics.PointF m34134xb175183b(android.graphics.PointF pointF) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34085x97d811e4 = m34085x97d811e4(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y));
        return new android.graphics.PointF(m34085x97d811e4.f129332x, m34085x97d811e4.f129333y);
    }

    /* renamed from: calcRenderCoord */
    public android.graphics.PointF m34135xeeb76d6a(android.graphics.PointF pointF) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34086xdf38c453 = m34086xdf38c453(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y));
        return new android.graphics.PointF(m34086xdf38c453.f129332x, m34086xdf38c453.f129333y);
    }

    /* renamed from: calcRenderSpaceRotationAngle */
    public float m34136x649443a(float f17) {
        return -f17;
    }

    /* renamed from: calcViewPoint */
    public android.graphics.PointF m34137x88b77f16(android.graphics.PointF pointF) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34087x2c437c3f = m34087x2c437c3f(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y));
        return new android.graphics.PointF(m34087x2c437c3f.f129332x, m34087x2c437c3f.f129333y);
    }

    /* renamed from: calcViewSpaceRotationAngle */
    public float m34138xbf4410c9(float f17) {
        return -f17;
    }

    /* renamed from: clipSkimToTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34139x275e7ff4(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17) {
        return m34088xf55227eb(c4128x879fba0a, z17);
    }

    /* renamed from: close */
    public void m34140x5a5ddf8(com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        m34089x66d21421(uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: commitUpdate */
    public void m34142xd85848e0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, boolean z18, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        m34090x30338297(c4167x88133861, c4128x879fba0a, z17, z18, uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: disableHandleBox */
    public void m34143x6cfac87b() {
        m34128xf8311e27(false);
    }

    /* renamed from: enableHandleBox */
    public void m34144x7f3d8440() {
        m34128xf8311e27(true);
    }

    /* renamed from: endClipSkimming */
    public void m34145x13b20fbc(com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        m34092x43366a5(uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: endTrackingSafeArea */
    public void m34146x4ba9088c() {
        m34093xdc62c2f5();
    }

    /* renamed from: fetchRenderAreaPosition */
    public void m34147x9ce51de6(com.p314xaae8f345.p457x3304c6.p479x4179489f.w wVar) {
        m34094x6bf97bcf(wVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.f0(this, true, wVar)) : -1);
    }

    /* renamed from: fetchRenderAreaRotation */
    public void m34148x6deb943b(com.p314xaae8f345.p457x3304c6.p479x4179489f.v vVar) {
        m34096x36699864(vVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.e0(this, true, vVar)) : -1);
    }

    /* renamed from: fetchRenderAreaScale */
    public void m34149xafec05ad(com.p314xaae8f345.p457x3304c6.p479x4179489f.v vVar) {
        m34096x36699864(vVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.e0(this, true, vVar)) : -1);
    }

    /* renamed from: findHandleBoxRectCorner */
    public com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner m34150xba5f35c3(android.graphics.PointF pointF, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        return com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.m32991xdc92efe5(m34097x897393ac(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y), c3972x4b2f2ae));
    }

    /* renamed from: getCurrentPlaybackTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34151x52c986b() {
        return m34098xe2905962();
    }

    /* renamed from: getPlaybackTimeRange */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34152xf5842ddf() {
        return m34099x7c01c096();
    }

    /* renamed from: getRenderFrame */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae m34153x77724c41(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        return c3971x241f78 == null ? new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f)) : m34100x4565f438(c3971x241f78.m32425x6ac9171());
    }

    @java.lang.Deprecated
    /* renamed from: getRenderNodeModelSize */
    public android.graphics.PointF m34154xd5c635bc(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m34101xb329f6b3 = m34101xb329f6b3(c3971x241f78.m32425x6ac9171());
        return new android.graphics.PointF(m34101xb329f6b3.f129332x, m34101xb329f6b3.f129333y);
    }

    @java.lang.Deprecated
    /* renamed from: getSegmentID */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m34155x9e6718d8(android.graphics.PointF pointF) {
        return com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.of(m34102xf642528f(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y)));
    }

    /* renamed from: getSegmentIDAndFrame */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db.SegmentIDAndFrame m34156x955af2ce(android.graphics.PointF pointF) {
        return m34157x955af2ce(pointF, new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /* renamed from: isHandleBoxEnabled */
    public boolean m34158x88661088() {
        return m34104x63c6e4ff();
    }

    /* renamed from: isHandleBoxHitted */
    public boolean m34159x85265579(android.graphics.PointF pointF, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        return m34105x5aad9622(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y), c3972x4b2f2ae);
    }

    /* renamed from: open */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34160x34264a(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        return m34106xb9040701(c4165x6f849f9c, uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: openWithTimeline */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34161xdb5f1e91(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        return m34107xfb08a4c8(c4167x88133861, c4128x879fba0a, uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: release */
    public void m34162x41012807() {
        this.f16130xe8c0cf7b.m33787x78c5c1e2();
        this.f16130xe8c0cf7b.m33788xcb04b739();
        this.f16131x39e86013.m16727xc85fe246();
    }

    /* renamed from: removeAllDecorationBoxes */
    public void m34163x23784cac() {
        m34108x36efabe3();
    }

    /* renamed from: removeAllHandleBoxButtons */
    public void m34164xaea13c1b() {
        m34109xa15c3c4();
    }

    /* renamed from: removeAllHandleBoxTitles */
    public void m34165x6e02b141() {
        m34110x817a1078();
    }

    /* renamed from: removeHandleBox */
    public void m34166x81ae825f() {
        m34111x722fd948();
    }

    /* renamed from: setMediaTimeChangeListener */
    public void m34167x827608f3(com.p314xaae8f345.p457x3304c6.p479x4179489f.t tVar) {
        m34113x2049554d(tVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.d0(this, tVar, false)) : -1);
    }

    /* renamed from: setOnHandleBoxSettingsChangeCallback */
    public void m34168xa41edb5a(com.p314xaae8f345.p457x3304c6.p479x4179489f.x xVar) {
        m34112x1aa62011(xVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.g0(this, false, xVar)) : -1);
    }

    /* renamed from: setPlaybackFailListener */
    public void m34169xe631c72f(com.p314xaae8f345.p457x3304c6.p479x4179489f.a0 a0Var) {
        m34115x24936e68(a0Var != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.i0(this, a0Var, false)) : -1);
    }

    /* renamed from: setPlaybackFinishListener */
    public void m34170x9eb0dc64(com.p314xaae8f345.p457x3304c6.p479x4179489f.b0 b0Var) {
        m34114xeeeb8a92(b0Var != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.h0(this, b0Var, false)) : -1);
    }

    /* renamed from: showHandleBox */
    public void m34171xdd985806(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999> list, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f c4050x944e439f) {
        m34116x8124552f(c3971x241f78.m32425x6ac9171(), list, new java.util.ArrayList(), c4111x4a556090, c4050x944e439f);
    }

    /* renamed from: skimTo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34174xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18) {
        return m34117x8ead100e(c4128x879fba0a, j17, z17, z18);
    }

    /* renamed from: skipRefreshNextVideoFrame */
    public void m34177xa1c0b081() {
        m34118xfd35382a();
    }

    /* renamed from: snapshotAtTime */
    public void m34178x7281e084(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p479x4179489f.z zVar) {
        m34119x4075887b(c4128x879fba0a, zVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.k0(this, zVar)) : -1);
    }

    /* renamed from: startPlaying */
    public void m34179xda91516c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        m34120x326c8b23(c4129xdee64553, c4128x879fba0a, i17, z17, uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: stopPlaying */
    public void m34180x9600b9cc(com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        m34121x6f8bed35(uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: unbindRenderView */
    public void m34181x3440dc51() {
        m34122x53ea6288();
    }

    /* renamed from: updatePlaybackOptions */
    public void m34182x4082f7fa(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, int i17, boolean z17) {
        m34124x89b7bc23(c4129xdee64553, i17, z17);
    }

    /* renamed from: updateRenderAreaPosition */
    public void m34183x326b8a35(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        m34125x45e2e96c(c3974x289f3e);
    }

    /* renamed from: updateRenderAreaRotation */
    public void m34184x372008a(float f17) {
        m34126x16e95fc1(f17);
    }

    /* renamed from: updateRenderAreaScale */
    public void m34185xd03a93be(float f17) {
        m34127x196f57e7(f17);
    }

    /* renamed from: getSegmentIDAndFrame */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db.SegmentIDAndFrame m34157x955af2ce(android.graphics.PointF pointF, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090) {
        return m34103x1bd88585(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y), c4111x4a556090);
    }

    /* renamed from: showHandleBox */
    public void m34172xdd985806(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999> list, java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4053x47710492> list2, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 c4111x4a556090, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f c4050x944e439f) {
        m34116x8124552f(c3971x241f78.m32425x6ac9171(), list, list2, c4111x4a556090, c4050x944e439f);
    }

    /* renamed from: skimTo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34173xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17) {
        return m34174xca528117(c4128x879fba0a, j17, z17, false);
    }

    /* renamed from: beginClipSkimming */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34130x8ec5ba8a(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 c4170x5817ebc8, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        return m34082xa960b1e0(c4170x5817ebc8, uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: commitUpdate */
    public void m34141xd85848e0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c c4165x6f849f9c, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.u uVar) {
        m34091x6e4f4040(c4165x6f849f9c, c4128x879fba0a, z17, uVar != null ? this.f16130xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p479x4179489f.c0(this, uVar)) : -1);
    }

    /* renamed from: skimTo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34176xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, boolean z18) {
        return m34117x8ead100e(c4128x879fba0a, 0L, z17, z18);
    }

    /* renamed from: skimTo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34175xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17) {
        return m34174xca528117(c4128x879fba0a, 0L, z17, false);
    }
}

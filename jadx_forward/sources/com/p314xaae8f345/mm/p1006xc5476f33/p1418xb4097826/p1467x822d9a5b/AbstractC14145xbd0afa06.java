package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniPlayerProxy;", "Lkd2/s1;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniPlayerProxy */
/* loaded from: classes10.dex */
public abstract class AbstractC14145xbd0afa06 extends android.widget.FrameLayout implements kd2.s1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC14145xbd0afa06(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // cw2.da
    /* renamed from: getBitmap */
    public abstract /* synthetic */ android.graphics.Bitmap mo56680x12501425();

    /* renamed from: getContentContainer */
    public abstract /* synthetic */ android.view.ViewGroup mo56681xda5977e();

    /* renamed from: getContentContainerSize */
    public abstract /* synthetic */ android.util.Size mo56682xa18fc9f();

    @Override // cw2.da
    /* renamed from: getContextTag */
    public abstract /* synthetic */ int getF206440z();

    @Override // cw2.da
    /* renamed from: getCoverImage */
    public /* bridge */ /* synthetic */ android.widget.ImageView mo56684x37b3d7da() {
        return null;
    }

    @Override // zy2.g5
    /* renamed from: getCurrentPlayMs */
    public abstract /* synthetic */ long mo56685x3d7f3f1d();

    @Override // zy2.g5
    /* renamed from: getCurrentPlaySecond */
    public abstract /* synthetic */ int mo56686xe906e26b();

    @Override // zy2.g5
    /* renamed from: getCurrentStartPlayMs */
    public abstract /* synthetic */ long mo56687x6ff74db9();

    @Override // cw2.da
    /* renamed from: getEventDetector */
    public /* bridge */ /* synthetic */ ls5.m mo56688x8a1470ca() {
        return null;
    }

    @Override // cw2.da
    /* renamed from: getIsNeverStart */
    public abstract /* synthetic */ boolean mo56689xe0dc5076();

    @Override // cw2.da
    public abstract /* synthetic */ boolean getIsShouldPlayResume();

    @Override // cw2.da
    /* renamed from: getParentView */
    public abstract /* synthetic */ android.view.ViewParent mo56691xdfac0a65();

    @Override // cw2.da
    /* renamed from: getPlayer */
    public abstract /* synthetic */ java.lang.Object mo56692x2a55bdd7();

    @Override // cw2.da
    /* renamed from: getVideoAdapter */
    public abstract /* synthetic */ cw2.y9 mo56693x1399c8ca();

    @Override // zy2.g5
    /* renamed from: getVideoDuration */
    public abstract /* synthetic */ int mo56694x36bbd779();

    @Override // zy2.g5
    /* renamed from: getVideoDurationMs */
    public abstract /* synthetic */ long mo56695x7723e6ff();

    @Override // cw2.da
    /* renamed from: getVideoMediaId */
    public abstract /* synthetic */ java.lang.String mo56696x9040359a();

    @Override // cw2.da
    /* renamed from: getVideoMediaInfo */
    public abstract /* synthetic */ cw2.wa getF206430p();

    @Override // zy2.g5
    /* renamed from: getVideoView */
    public abstract /* synthetic */ android.view.View mo56698x4ee17f0a();

    @Override // zy2.g5
    /* renamed from: getVideoViewFocused */
    public abstract /* synthetic */ boolean getIsViewFocused();

    @Override // cw2.da
    /* renamed from: setContextTag */
    public abstract /* synthetic */ void mo56700x2cb6856d(int i17);

    @Override // zy2.g5
    /* renamed from: setCustomSurface */
    public /* bridge */ /* synthetic */ void mo56701x1e648aba(android.view.Surface surface) {
    }

    @Override // zy2.g5
    /* renamed from: setCustomSurfaceTexture */
    public abstract /* synthetic */ void mo56702x939d3d01(android.graphics.SurfaceTexture surfaceTexture);

    @Override // cw2.da
    /* renamed from: setFinderVideoPlayTrace */
    public abstract /* synthetic */ void mo56703x2f6c317e(kz2.a aVar);

    @Override // zy2.g5
    /* renamed from: setIMMVideoViewCallback */
    public abstract /* synthetic */ void mo56704x526554de(zy2.ub ubVar);

    @Override // cw2.da
    /* renamed from: setInterceptDetach */
    public abstract /* synthetic */ void mo56705x49dc7633(boolean z17);

    @Override // cw2.da
    /* renamed from: setIsShouldPlayResume */
    public abstract /* synthetic */ void mo56706x561757e0(boolean z17);

    @Override // cw2.da
    /* renamed from: setIsShowBasicControls */
    public abstract /* synthetic */ void mo56707xc2e9d13b(boolean z17);

    @Override // zy2.g5
    /* renamed from: setLoop */
    public abstract /* synthetic */ void mo56708x764cf626(boolean z17);

    @Override // zy2.g5
    /* renamed from: setMute */
    public abstract /* synthetic */ void mo56709x764d819b(boolean z17);

    /* renamed from: setPlayCallback */
    public abstract /* synthetic */ void mo56710x6332291b(kd2.r1 r1Var);

    @Override // cw2.da
    /* renamed from: setPreloadedView */
    public abstract /* synthetic */ void mo56711xe5cb79eb(boolean z17);

    @Override // cw2.da
    /* renamed from: setPreview */
    public abstract /* synthetic */ void mo56712x9e476d06(boolean z17);

    @Override // cw2.da
    /* renamed from: setScaleType */
    public abstract /* synthetic */ void mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var);

    @Override // cw2.da
    /* renamed from: setVideoMuteListener */
    public abstract /* synthetic */ void mo56714x64436dc6(cw2.xa xaVar);

    @Override // cw2.da
    /* renamed from: setVideoPlayLifecycle */
    public abstract /* synthetic */ void mo56715xe9d735dd(cw2.fb fbVar);

    @Override // zy2.g5
    /* renamed from: setVideoViewFocused */
    public abstract /* synthetic */ void mo56716x4121a19(boolean z17);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC14145xbd0afa06(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC14145xbd0afa06(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}

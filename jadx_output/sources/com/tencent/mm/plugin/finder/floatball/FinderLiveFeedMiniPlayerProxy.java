package com.tencent.mm.plugin.finder.floatball;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniPlayerProxy;", "Lkd2/s1;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class FinderLiveFeedMiniPlayerProxy extends android.widget.FrameLayout implements kd2.s1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedMiniPlayerProxy(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // cw2.da
    public abstract /* synthetic */ android.graphics.Bitmap getBitmap();

    public abstract /* synthetic */ android.view.ViewGroup getContentContainer();

    public abstract /* synthetic */ android.util.Size getContentContainerSize();

    @Override // cw2.da
    /* renamed from: getContextTag */
    public abstract /* synthetic */ int getF124907z();

    @Override // cw2.da
    public /* bridge */ /* synthetic */ android.widget.ImageView getCoverImage() {
        return null;
    }

    @Override // zy2.g5
    public abstract /* synthetic */ long getCurrentPlayMs();

    @Override // zy2.g5
    public abstract /* synthetic */ int getCurrentPlaySecond();

    @Override // zy2.g5
    public abstract /* synthetic */ long getCurrentStartPlayMs();

    @Override // cw2.da
    public /* bridge */ /* synthetic */ ls5.m getEventDetector() {
        return null;
    }

    @Override // cw2.da
    public abstract /* synthetic */ boolean getIsNeverStart();

    @Override // cw2.da
    public abstract /* synthetic */ boolean getIsShouldPlayResume();

    @Override // cw2.da
    public abstract /* synthetic */ android.view.ViewParent getParentView();

    @Override // cw2.da
    public abstract /* synthetic */ java.lang.Object getPlayer();

    @Override // cw2.da
    public abstract /* synthetic */ cw2.y9 getVideoAdapter();

    @Override // zy2.g5
    public abstract /* synthetic */ int getVideoDuration();

    @Override // zy2.g5
    public abstract /* synthetic */ long getVideoDurationMs();

    @Override // cw2.da
    public abstract /* synthetic */ java.lang.String getVideoMediaId();

    @Override // cw2.da
    /* renamed from: getVideoMediaInfo */
    public abstract /* synthetic */ cw2.wa getF124897p();

    @Override // zy2.g5
    public abstract /* synthetic */ android.view.View getVideoView();

    @Override // zy2.g5
    /* renamed from: getVideoViewFocused */
    public abstract /* synthetic */ boolean getIsViewFocused();

    @Override // cw2.da
    public abstract /* synthetic */ void setContextTag(int i17);

    @Override // zy2.g5
    public /* bridge */ /* synthetic */ void setCustomSurface(android.view.Surface surface) {
    }

    @Override // zy2.g5
    public abstract /* synthetic */ void setCustomSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture);

    @Override // cw2.da
    public abstract /* synthetic */ void setFinderVideoPlayTrace(kz2.a aVar);

    @Override // zy2.g5
    public abstract /* synthetic */ void setIMMVideoViewCallback(zy2.ub ubVar);

    @Override // cw2.da
    public abstract /* synthetic */ void setInterceptDetach(boolean z17);

    @Override // cw2.da
    public abstract /* synthetic */ void setIsShouldPlayResume(boolean z17);

    @Override // cw2.da
    public abstract /* synthetic */ void setIsShowBasicControls(boolean z17);

    @Override // zy2.g5
    public abstract /* synthetic */ void setLoop(boolean z17);

    @Override // zy2.g5
    public abstract /* synthetic */ void setMute(boolean z17);

    public abstract /* synthetic */ void setPlayCallback(kd2.r1 r1Var);

    @Override // cw2.da
    public abstract /* synthetic */ void setPreloadedView(boolean z17);

    @Override // cw2.da
    public abstract /* synthetic */ void setPreview(boolean z17);

    @Override // cw2.da
    public abstract /* synthetic */ void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var);

    @Override // cw2.da
    public abstract /* synthetic */ void setVideoMuteListener(cw2.xa xaVar);

    @Override // cw2.da
    public abstract /* synthetic */ void setVideoPlayLifecycle(cw2.fb fbVar);

    @Override // zy2.g5
    public abstract /* synthetic */ void setVideoViewFocused(boolean z17);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedMiniPlayerProxy(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedMiniPlayerProxy(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

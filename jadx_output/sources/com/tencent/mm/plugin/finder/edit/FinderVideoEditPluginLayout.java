package com.tencent.mm.plugin.finder.edit;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderVideoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderVideoEditPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew {
    public android.graphics.Matrix D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoEditPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout
    public android.view.View getPlayerView() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setBackgroundColor(-16777216);
        dc2.n nVar = new dc2.n(getContext());
        setPreviewPlugin(new yt3.o1(nVar, this, (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyh)));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(nVar, layoutParams);
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        android.view.ViewParent parent;
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        android.os.Bundle bundle = configProvider.M;
        if (bundle != null) {
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = getPreviewPlugin().f465559d;
            android.view.ViewParent parent2 = (videoPlayerTextureView == null || (parent = videoPlayerTextureView.getParent()) == null) ? null : parent.getParent();
            kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.widget.RelativeLayout");
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout = new com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout(context);
            android.graphics.RectF visibilityRect = wxCropOperationLayout.getVisibilityRect();
            android.os.Parcelable parcelable = bundle.getParcelable("cropRect");
            kotlin.jvm.internal.o.d(parcelable);
            visibilityRect.set((android.graphics.Rect) parcelable);
            ((android.widget.RelativeLayout) parent2).addView(wxCropOperationLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
            wxCropOperationLayout.setStyle(ru3.o.f399765f);
            wxCropOperationLayout.bringToFront();
            float[] floatArray = bundle.getFloatArray("matrix");
            float[] floatArray2 = bundle.getFloatArray("offset");
            if (floatArray2 == null) {
                floatArray2 = new float[2];
            }
            float f17 = floatArray2[0];
            float f18 = floatArray2[1];
            if (floatArray != null) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setValues(floatArray);
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView2 = getPreviewPlugin().f465559d;
                if (videoPlayerTextureView2 != null) {
                    float f19 = floatArray[0];
                    double d17 = f19 * f19;
                    double d18 = floatArray[3];
                    videoPlayerTextureView2.setScaleX((float) java.lang.Math.sqrt(d17 + (d18 * d18)));
                }
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView3 = getPreviewPlugin().f465559d;
                if (videoPlayerTextureView3 != null) {
                    float f27 = floatArray[0];
                    double d19 = floatArray[3];
                    videoPlayerTextureView3.setScaleY((float) java.lang.Math.sqrt((f27 * f27) + (d19 * d19)));
                }
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView4 = getPreviewPlugin().f465559d;
                if (videoPlayerTextureView4 != null) {
                    videoPlayerTextureView4.setTranslationX(f17);
                }
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView5 = getPreviewPlugin().f465559d;
                if (videoPlayerTextureView5 != null) {
                    videoPlayerTextureView5.setTranslationY(f18);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("translationX=");
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView6 = getPreviewPlugin().f465559d;
                sb6.append(videoPlayerTextureView6 != null ? java.lang.Float.valueOf(videoPlayerTextureView6.getTranslationX()) : null);
                sb6.append(" translationY=");
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView7 = getPreviewPlugin().f465559d;
                sb6.append(videoPlayerTextureView7 != null ? java.lang.Float.valueOf(videoPlayerTextureView7.getTranslationY()) : null);
                sb6.append(" scaleX=");
                com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView8 = getPreviewPlugin().f465559d;
                sb6.append(videoPlayerTextureView8 != null ? java.lang.Float.valueOf(videoPlayerTextureView8.getScaleX()) : null);
                sb6.append(" offsetX=");
                sb6.append(f17);
                sb6.append(" offsetY=");
                sb6.append(f18);
                sb6.append(" matrix=");
                sb6.append(matrix);
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", sb6.toString());
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                this.D = matrix2;
                matrix.invert(matrix2);
            }
        }
        getCropVideoPlugin().f14123s = true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        int i17;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 63 && ordinal != 65) {
            if (status != ju3.c0.f301885l1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorVideoPluginLayoutNew", "unknown status " + status);
            }
            super.w(status, bundle);
            return;
        }
        java.lang.String b17 = getBgPlugin().b();
        getPreviewPlugin().release();
        getItemContainerPlugin().onPause();
        getAddMusicPlugin().onPause();
        if (getMoreMenuPlugin().f465432m) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            i17 = 1;
        } else {
            i17 = 0;
        }
        ut3.f fVar = ut3.f.f431176c;
        fVar.f431178b.putInt("key_extra_feature_flag", i17);
        int i18 = getMoreMenuPlugin().f465433n;
        android.os.Bundle bundle2 = fVar.f431178b;
        if (i18 == 2) {
            bundle2.putString("key_group_list", getMoreMenuPlugin().a());
        } else if (getMoreMenuPlugin().f465433n == 3) {
            bundle2.putString("key_black_list", getMoreMenuPlugin().a());
        }
        st3.s sVar = new st3.s(getAddMusicPlugin().c(), getAddMusicPlugin().f294998n, getItemContainerPlugin().d(this.D), getItemContainerPlugin().c(), getItemContainerPlugin().b(), getPreviewPlugin().f465567o, getPreviewPlugin().f465568p, new java.util.ArrayList(), b17, getItemContainerPlugin().b());
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "edit config: " + sVar);
        getReMuxPlugin().m(sVar);
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().e()));
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().f()));
        iVar.n("KEY_SELECT_MUSIC_INT", java.lang.Integer.valueOf(getAddMusicPlugin().f294998n == null ? 0 : 1));
        iVar.n("KEY_SELECT_ORIGIN_INT", java.lang.Integer.valueOf(!getAddMusicPlugin().c() ? 1 : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        iVar.h();
        iVar.d(13);
        nu3.i.f340221d.f60874i = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        iVar.g(configProvider != null ? configProvider.F : 0);
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            vVar.e();
        }
    }
}

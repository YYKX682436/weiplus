package com.tencent.mm.plugin.finder.edit;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderPhotoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderPhotoEditPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout {

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout f105306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPhotoEditPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout = new com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout(context);
        this.f105306w = wxCropOperationLayout;
        wxCropOperationLayout.setStyle(ru3.o.f399765f);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.kva)).addView(wxCropOperationLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        android.os.Bundle bundle = configProvider.M;
        if (bundle == null || (rect = (android.graphics.Rect) bundle.getParcelable("cropRect")) == null) {
            return;
        }
        this.f105306w.getVisibilityRect().set(rect);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        super.r(bVar);
        l45.q qVar = getEditPhotoWrapper().f465587o;
        if (qVar != null) {
            ((l45.n) qVar).f316467h = false;
        }
        this.f105306w.bringToFront();
    }
}

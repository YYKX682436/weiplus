package aa4;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview f2675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v94.g f2676e;

    public o(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview, v94.g gVar) {
        this.f2675d = snsImageBackPreview;
        this.f2676e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1$1");
        com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview = this.f2675d;
        android.widget.ImageView access$getCoverFoldImageView = com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getCoverFoldImageView(snsImageBackPreview);
        kotlin.jvm.internal.o.f(access$getCoverFoldImageView, "access$getCoverFoldImageView(...)");
        android.graphics.RectF access$getImageDisplayRect = com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getImageDisplayRect(snsImageBackPreview, access$getCoverFoldImageView);
        if (access$getImageDisplayRect != null) {
            float height = access$getImageDisplayRect.height();
            com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) this.f2676e;
            x1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverOffset", "com.tencent.mm.plugin.sns.storage.SnsCover");
            int i17 = x1Var.field_snsCoverOffset;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverOffset", "com.tencent.mm.plugin.sns.storage.SnsCover");
            com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview.access$getCoverFoldImageView(snsImageBackPreview).setTranslationY(height * (i17 / 10000.0f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1$1");
    }
}

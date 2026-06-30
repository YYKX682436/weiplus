package aa4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final aa4.a f2635a = new aa4.a();

    public final com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview a(android.content.Context context, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
        kotlin.jvm.internal.o.g(context, "context");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView snsCoverDefaultView = new com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsCoverDefaultView;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview = new com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview(context, i18, i19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsImageBackPreview;
        }
        if (i17 == 5) {
            com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView snsInvalidView = new com.tencent.mm.plugin.sns.cover.preview.SnsInvalidView(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsInvalidView;
        }
        if (i17 == 6) {
            com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview snsWeComImageBackPreview = new com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsWeComImageBackPreview;
        }
        if (!w94.a.f444075a.b()) {
            com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview2 = new com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview(context, 0, 0, 6, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsImageBackPreview2;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview = new com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsVideoBackPreview;
        }
        if (i17 == 3) {
            ((j40.r) ((v94.l) i95.n0.c(v94.l.class))).getClass();
            com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = new com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return snsFinderVideoBackPreview;
        }
        if (i17 != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
            return null;
        }
        ((j40.r) ((v94.l) i95.n0.c(v94.l.class))).getClass();
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView = new com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
        return snsFinderImageBackView;
    }
}

package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class q implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f72773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72774b;

    public q(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI, com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView) {
        this.f72774b = aAImagPreviewUI;
        this.f72773a = multiTouchImageView;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "onLoadImageEnd() url:%s path:%s", str, str2);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.p(this, bitmap));
    }
}

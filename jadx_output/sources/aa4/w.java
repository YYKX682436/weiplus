package aa4;

/* loaded from: classes15.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview f2685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview) {
        super(1);
        this.f2685d = snsVideoBackPreview;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
        com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview = this.f2685d;
        com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getThumbView(snsVideoBackPreview).setVisibility(0);
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout access$getPlayView$p = com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getPlayView$p(snsVideoBackPreview);
        if (access$getPlayView$p != null) {
            access$getPlayView$p.setOnFirstFrameAvailable(new aa4.v(snsVideoBackPreview));
        }
        com.tencent.mars.xlog.Log.i("Finder.SnsVideoBackPreview", "onSurfaceDestroyListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
        return f0Var;
    }
}

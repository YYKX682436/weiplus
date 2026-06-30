package aa4;

/* loaded from: classes15.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview f2687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk4.a f2688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview, dk4.a aVar) {
        super(0);
        this.f2687d = snsVideoBackPreview;
        this.f2688e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
        com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview = this.f2687d;
        android.content.Context context = snsVideoBackPreview.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        if (!((android.app.Activity) context).isFinishing()) {
            android.content.Context context2 = snsVideoBackPreview.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            if (!((android.app.Activity) context2).isDestroyed()) {
                com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$createFinderPlayView(snsVideoBackPreview, this.f2688e);
                if (com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$canPlay(snsVideoBackPreview)) {
                    snsVideoBackPreview.play();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
                return f0Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
        return f0Var2;
    }
}

package aa4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview f2638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.x1 f2639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout f2640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview, com.tencent.mm.plugin.sns.storage.x1 x1Var, com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2638d = absSnsBackPreview;
        this.f2639e = x1Var;
        this.f2640f = snsCoverContainerLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        aa4.c cVar = new aa4.c(this.f2638d, this.f2639e, this.f2640f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        aa4.c cVar = (aa4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.storage.x1 x1Var = this.f2639e;
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f2638d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.loadCover(x1Var);
        }
        if (x1Var != null) {
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = this.f2640f;
            ba4.a coverReporter = snsCoverContainerLayout.getCoverReporter();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsCoverStatus$p", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsCoverStatus$p", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            coverReporter.i(x1Var, !snsCoverContainerLayout.f164002h.f434168b);
            ba4.a coverReporter2 = snsCoverContainerLayout.getCoverReporter();
            java.lang.String x1Var2 = x1Var.toString();
            kotlin.jvm.internal.o.f(x1Var2, "toString(...)");
            coverReporter2.a(x1Var2);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
        return f0Var;
    }
}

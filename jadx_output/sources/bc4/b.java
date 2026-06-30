package bc4;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f19162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f19166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, int i17, int i18, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19163e = str;
        this.f19164f = i17;
        this.f19165g = i18;
        this.f19166h = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        bc4.b bVar = new bc4.b(this.f19163e, this.f19164f, this.f19165g, this.f19166h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        java.lang.Object invokeSuspend = ((bc4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f19162d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f19163e;
            int i18 = this.f19164f;
            int i19 = this.f19165g;
            android.graphics.Bitmap L = com.tencent.mm.sdk.platformtools.x.L(str, i18, i19);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("targetViewWidth: ");
            sb6.append(i18);
            sb6.append(" targetViewHeight: ");
            sb6.append(i19);
            sb6.append(",bitmapWidth: ");
            sb6.append(L != null ? new java.lang.Integer(L.getWidth()) : null);
            sb6.append(" bitmapHeight: ");
            sb6.append(L != null ? new java.lang.Integer(L.getHeight()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtFooterImageLoader", sb6.toString());
            if (L != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                bc4.a aVar2 = new bc4.a(this.f19166h, L, null);
                this.f19162d = 1;
                if (kotlinx.coroutines.l.g(g3Var, aVar2, this) == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        return f0Var;
    }
}

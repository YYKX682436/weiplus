package ac4;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, int i17) {
        super(0);
        this.f3079d = z17;
        this.f3080e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "customSnsUploadCallback >> result: " + this.f3079d + " localId: " + this.f3080e);
        com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
        int i17 = this.f3080e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$Companion");
        java.lang.String str = "sns_cmt_local_" + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$Companion");
        synchronized (xj6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyCommentWhenImageUploaded", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            xj6.f(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyCommentWhenImageUploaded", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        return f0Var;
    }
}

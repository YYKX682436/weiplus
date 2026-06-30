package ac4;

/* loaded from: classes4.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f84612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, int i17) {
        super(0);
        this.f84612d = z17;
        this.f84613e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "customSnsUploadCallback >> result: " + this.f84612d + " localId: " + this.f84613e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
        int i17 = this.f84613e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$Companion");
        java.lang.String str = "sns_cmt_local_" + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$Companion");
        synchronized (xj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyCommentWhenImageUploaded", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            xj6.f(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyCommentWhenImageUploaded", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1$1");
        return f0Var;
    }
}

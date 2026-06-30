package aa4;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview f2689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview) {
        super(2);
        this.f2689d = snsVideoBackPreview;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("media id:");
        sb6.append(str);
        sb6.append(" localid:");
        com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview snsVideoBackPreview = this.f2689d;
        sb6.append(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getLocalMediaId$p(snsVideoBackPreview));
        sb6.append(" objid:");
        v94.g access$getCoverInfo$p = com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getCoverInfo$p(snsVideoBackPreview);
        sb6.append(access$getCoverInfo$p != null ? ((com.tencent.mm.plugin.sns.storage.x1) access$getCoverInfo$p).u0() : null);
        sb6.append(" download finish ret:");
        sb6.append(intValue);
        com.tencent.mars.xlog.Log.i("Finder.SnsVideoBackPreview", sb6.toString());
        if (intValue == 0 && kotlin.jvm.internal.o.b(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getLocalMediaId$p(snsVideoBackPreview), str) && com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getLocalVideoPath$p(snsVideoBackPreview))) {
            com.tencent.mars.xlog.Log.i("Finder.SnsVideoBackPreview", "file local path:" + com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getLocalVideoPath$p(snsVideoBackPreview) + " length:" + com.tencent.mm.vfs.w6.k(com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getLocalVideoPath$p(snsVideoBackPreview)));
            com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
            v94.g access$getCoverInfo$p2 = com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getCoverInfo$p(snsVideoBackPreview);
            java.lang.String userName = access$getCoverInfo$p2 != null ? ((com.tencent.mm.plugin.sns.storage.x1) access$getCoverInfo$p2).getUserName() : null;
            v94.g access$getCoverInfo$p3 = com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getCoverInfo$p(snsVideoBackPreview);
            java.lang.Long u07 = access$getCoverInfo$p3 != null ? ((com.tencent.mm.plugin.sns.storage.x1) access$getCoverInfo$p3).u0() : null;
            java.lang.String access$getLocalVideoPath$p = com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview.access$getLocalVideoPath$p(snsVideoBackPreview);
            Bj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "downloadVideo user:" + userName + " id:" + u07 + " path:" + access$getLocalVideoPath$p + " size:" + com.tencent.mm.vfs.w6.k(access$getLocalVideoPath$p));
            if (userName == null || u07 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.tencent.mm.plugin.sns.storage.x1 L0 = Bj.L0(userName);
                if (kotlin.jvm.internal.o.b(L0.u0(), u07) && L0.field_success) {
                    L0.field_localVideo = access$getLocalVideoPath$p;
                    L0.field_size = com.tencent.mm.vfs.w6.k(access$getLocalVideoPath$p);
                    Bj.W0(L0, false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        return f0Var;
    }
}

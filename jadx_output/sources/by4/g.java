package by4;

/* loaded from: classes8.dex */
public final class g extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ by4.k f36388a;

    public g(by4.k kVar) {
        this.f36388a = kVar;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.e("WebViewThirdPartyDisclaimHelper", "%s udr check fail. resource name: %s, version: %d, errNo: %d, errCode: %d", projectId, name, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_aea21419", "WebViewHostShowRuleJson");
        by4.k kVar = this.f36388a;
        kVar.getClass();
        if (Ui == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new by4.i(Ui, kVar));
    }
}

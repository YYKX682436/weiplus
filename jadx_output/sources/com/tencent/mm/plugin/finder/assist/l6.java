package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class l6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f102358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102359e;

    public l6(ya2.b2 b2Var, int i17) {
        this.f102358d = b2Var;
        this.f102359e = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share namecard ");
            ya2.b2 b2Var = this.f102358d;
            sb6.append(b2Var.w0());
            sb6.append('(');
            sb6.append(b2Var.D0());
            sb6.append(") to ");
            sb6.append(stringArrayListExtra);
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
            if (!stringArrayListExtra.isEmpty()) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                java.lang.String D0 = b2Var.D0();
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra, ",");
                kotlin.jvm.internal.o.f(c17, "listToString(...)");
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b2Var.field_authInfo;
                int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
                o3Var.getClass();
                java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + D0 + ',' + c17 + ",0," + authIconType + ',' + this.f102359e;
                com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18949 " + str);
                jx3.f.INSTANCE.kvStat(18949, str);
            }
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(stringArrayListExtra);
        }
    }
}

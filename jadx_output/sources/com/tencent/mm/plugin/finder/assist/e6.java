package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class e6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.f f102123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102124e;

    public e6(zy2.f fVar, r45.qt2 qt2Var) {
        this.f102123d = fVar;
        this.f102124e = qt2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        zy2.f fVar = this.f102123d;
        if (i18 != -1) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Oj(pm0.v.Z(fVar.f477382b.getString(0)), 3, 2L, "", 0L, this.f102124e);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra, ";");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long Z = pm0.v.Z(fVar.f477382b.getString(0));
        kotlin.jvm.internal.o.d(c17);
        o3Var.Oj(Z, 3, 1L, c17, stringArrayListExtra.size(), this.f102124e);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "[shareAlbumToChat] " + fVar.f477382b.getString(1) + " to " + stringArrayListExtra);
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(stringArrayListExtra);
    }
}

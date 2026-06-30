package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class he implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.PreCheckAffiliateAccountUI f73912d;

    public he(com.tencent.mm.plugin.account.ui.PreCheckAffiliateAccountUI preCheckAffiliateAccountUI) {
        this.f73912d = preCheckAffiliateAccountUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrecheckAffiliatedAcctResponse");
            intent.putExtra("rawUrl", ((r45.ub5) fVar).f387204d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.n(this.f73912d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 702);
        }
        return 0;
    }
}

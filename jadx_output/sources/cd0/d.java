package cd0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC f40529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f40530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f40529d = revokeChattingLandingPageUIC;
        this.f40530e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = this.f40529d;
        java.lang.String str = (java.lang.String) ((jz5.n) revokeChattingLandingPageUIC.f67794g).getValue();
        if (!(str == null || r26.n0.N(str))) {
            android.content.Intent intent = new android.content.Intent();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f40530e;
            android.content.Intent putExtra = intent.setClassName(appCompatActivity, str).addFlags(67108864).addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING).addFlags(268435456).putExtra("KEY_START_FROM_LANDING_UIC", true);
            kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
            putExtra.getFlags();
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = this.f40530e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(appCompatActivity2, arrayList.toArray(), "com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$goToChattingHomePage$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appCompatActivity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(appCompatActivity2, "com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$goToChattingHomePage$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appCompatActivity.overridePendingTransition(0, 0);
            try {
                com.tencent.mm.storage.f9 n17 = revokeChattingLandingPageUIC.U6() != 0 ? pt0.f0.f358209b1.n((java.lang.String) ((jz5.n) revokeChattingLandingPageUIC.f67792e).getValue(), revokeChattingLandingPageUIC.U6()) : null;
                if (n17 != null) {
                    long j17 = ot0.q.v(n17.U1()) != null ? r1.f348666i : 0L;
                    int c17 = com.tencent.mm.pluginsdk.model.app.k0.c(n17.getType());
                    com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                    errorMsgInfoStruct.f56113e = 30L;
                    errorMsgInfoStruct.f56112d = j17;
                    errorMsgInfoStruct.f56115g = c17;
                    errorMsgInfoStruct.k();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MRevokeChat.LandingPageUIC", th6, "report err", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}

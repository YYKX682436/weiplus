package cd0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC f40531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
        super(0);
        this.f40531d = revokeChattingLandingPageUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            return this.f40531d.getIntent().getStringExtra("KEY_HOME_PAGE_CLS");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MRevokeChat.LandingPageUIC", th6, "parse homePageCls err", new java.lang.Object[0]);
            return null;
        }
    }
}

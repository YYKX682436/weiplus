package cd0;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 f122064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755) {
        super(0);
        this.f122064d = c10677xd5472755;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            return this.f122064d.m158359x1e885992().getStringExtra("KEY_HOME_PAGE_CLS");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MRevokeChat.LandingPageUIC", th6, "parse homePageCls err", new java.lang.Object[0]);
            return null;
        }
    }
}

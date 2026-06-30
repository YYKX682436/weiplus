package cd0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC f40534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
        super(0);
        this.f40534d = revokeChattingLandingPageUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.util.List keyList = com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC.f67789q;
        com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = this.f40534d;
        revokeChattingLandingPageUIC.getClass();
        kotlin.jvm.internal.o.g(keyList, "keyList");
        java.lang.String stringExtra = revokeChattingLandingPageUIC.getIntent().getStringExtra("KEY_CLICK_MSG_TALKER");
        if (!(stringExtra == null || r26.n0.N(stringExtra))) {
            return stringExtra;
        }
        java.util.Iterator it = keyList.iterator();
        do {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            android.os.Bundle extras = revokeChattingLandingPageUIC.getIntent().getExtras();
            java.lang.Object obj = extras != null ? extras.get(str2) : null;
            if ((obj instanceof java.lang.String) && !r26.n0.N((java.lang.CharSequence) obj)) {
                str = (java.lang.String) obj;
            }
        } while (!(!r26.n0.N(str)));
        return str;
    }
}

package ca4;

/* loaded from: classes4.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String str) {
        super(2);
        this.f121376d = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        android.content.Context context = (android.content.Context) obj;
        java.lang.String username = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        dx1.f fVar = dx1.g.f326022a;
        bx1.u uVar = bx1.u.f117843e;
        java.lang.String sessionId = this.f121376d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(1, "value");
        fVar.p("MomentsTogetherTailActionFeed", sessionId, "ClickCount", 1, uVar, "#");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", 0);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 61);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        return f0Var;
    }
}

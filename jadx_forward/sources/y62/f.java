package y62;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98 f541169b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98 c13508xbccd9e98, java.lang.String str) {
        this.f541169b = c13508xbccd9e98;
        this.f541168a = str;
    }

    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98.f181452z;
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98 c13508xbccd9e98 = this.f541169b;
        c13508xbccd9e98.getClass();
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        java.lang.String str = this.f541168a;
        boolean j17 = r01.z.j(str);
        android.content.Context context = c13508xbccd9e98.f181455q;
        if (j17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterprise_biz_name", str);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            intent.putExtra("enterprise_biz_display_name", c01.a2.e(str));
            j45.l.u(context, ".ui.conversation.EnterpriseConversationUI", intent, null);
            return;
        }
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        if (r01.z.g(str)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.addFlags(67108864);
            intent2.putExtra("biz_chat_from_scene", 7);
            j45.l.u(context, ".ui.bizchat.BizChatConversationUI", intent2, null);
            return;
        }
        if (!r01.z.l(str)) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Chat_User", str);
            intent3.addFlags(268435456);
            intent3.addFlags(32768);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent3, context);
            return;
        }
        qk.o b17 = r01.z.b(str);
        java.lang.String z07 = b17 == null ? null : b17.z0();
        if (z07 == null) {
            z07 = "";
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("rawUrl", z07);
        intent4.putExtra("useJs", true);
        intent4.putExtra("srcUsername", str);
        intent4.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
        intent4.addFlags(67108864);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent4, null);
    }
}

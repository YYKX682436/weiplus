package qg5;

/* loaded from: classes8.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f444721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(qg5.z2 z2Var, android.content.Context context, yz5.a aVar) {
        super(0);
        this.f444721d = z2Var;
        this.f444722e = context;
        this.f444723f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[onChatRecordsAnalyzeClick] User continued with chat log analysis");
        qg5.z2 z2Var = this.f444721d;
        z2Var.getClass();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        java.lang.String encode = java.net.URLEncoder.encode(uuid, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20076xf413eb8e());
        if (f17 == null) {
            f17 = "https://yuanbao.tencent.com/chat/naQivTmsDa?from=WeixinMessage&tridChannel=wxltjlzj.lqybh5xzrk.app&login=1";
        }
        try {
            str = new java.net.URL(f17).getHost();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoChatRecordsFeatureService", "invalid yuanbao analyze chat records base url: ".concat(f17), e17);
            str = null;
        }
        if (str != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f17);
            sb6.append("&sessionId=");
            sb6.append(encode);
            sb6.append("&scene=analyze_chat_records");
            jz5.g gVar = z2Var.f444806o;
            java.lang.String encode2 = java.net.URLEncoder.encode(((qg5.e3) ((ct.k3) ((jz5.n) gVar).mo141623x754a37bb())).hj("journey_analyze"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode2, "encode(...)");
            java.lang.String str3 = r26.n0.N(encode2) ^ true ? encode2 : null;
            if (str3 == null || (str2 = "&reportSessionId=".concat(str3)) == null) {
                str2 = "";
            }
            sb6.append(str2);
            java.lang.String sb7 = sb6.toString();
            ((qg5.e3) ((ct.k3) ((jz5.n) gVar).mo141623x754a37bb())).sj("journey_analyze", kz5.c1.k(new jz5.l("yuanbao_session_id", uuid), new jz5.l("page_state", 2)));
            android.content.Context context = this.f444722e;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pdd);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[showInterceptedYuanBaoWebView] yuanbao url: " + sb7);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", sb7);
            intent.putExtra("useJs", true);
            intent.putExtra("key_menu_hide_expose", true);
            intent.putExtra("key_yuanbao_webview_host", str);
            intent.putExtra("key_yuanbao_webview_session_id", uuid);
            intent.putExtra("key_yuanbao_webview_scene", "analyze_chat_records");
            intent.putExtra("key_yuanbao_webview_old_protocol", false);
            if (string != null) {
                intent.putExtra("key_yuanbao_webview_initial_title", string);
                pf5.j0.a(intent, gy4.c.class);
            }
            pf5.j0.a(intent, gy4.v.class);
            pf5.j0.a(intent, gy4.u.class);
            pf5.j0.a(intent, kk5.w0.class);
            java.lang.String name = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.class.getName();
            intent.putExtra("KFixKeyBoardLayoutApplyWindow", true);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            bh5.d dVar = cVar.f102455a;
            dVar.f102457a = context;
            cVar.b(com.p314xaae8f345.mm.ui.C21443x66712e04.class);
            cVar.a(name);
            cVar.c(false);
            dVar.f102460d.w(1);
            cVar.f(false);
            cVar.g();
        }
        this.f444723f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}

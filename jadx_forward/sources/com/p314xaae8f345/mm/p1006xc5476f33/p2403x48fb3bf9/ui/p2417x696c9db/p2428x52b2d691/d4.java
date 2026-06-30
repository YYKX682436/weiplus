package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class d4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f267563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267566h;

    public d4(int i17, nw4.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, int i19) {
        this.f267562d = kVar;
        this.f267563e = h0Var;
        this.f267564f = str;
        this.f267565g = str2;
        this.f267566h = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var4;
        int itemId = menuItem.getItemId();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f267563e;
        java.lang.String str = this.f267564f;
        java.lang.String str2 = this.f267565g;
        nw4.k kVar = this.f267562d;
        if (itemId == 2147483646) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToFriend onClick");
            android.content.Context context = kVar.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            intent.putExtra("Retr_Msg_content", str);
            intent.putExtra("Retr_Compress_Type", 1);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("img_source_url", ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).wi(str2));
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".ui.transmit.MsgRetransmitUI", intent, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267838e, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.b4(str2, kVar));
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267844n || (d7Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7) h0Var.f391656d) == null) {
                return;
            }
            d7Var4.c();
            return;
        }
        if (itemId != 2147483645) {
            if (itemId != 2147483644) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "else value");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, menuItem.getTitle());
                hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(menuItem.getItemId()));
                nw4.g gVar = kVar.f422396d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((nw4.n) gVar).o("onShareCustomMenuItemClick", hashMap);
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267844n || (d7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7) h0Var.f391656d) == null) {
                    return;
                }
                d7Var.c();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToBiz onClick");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            boolean Di = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Di();
            r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
            hashMap2.put("biz", Di ? l1Var.f449681m.f449686a : l1Var.f449680i.f449686a);
            nw4.g gVar2 = kVar.f422396d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar2).o("menu:publish", hashMap2);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267844n || (d7Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7) h0Var.f391656d) == null) {
                return;
            }
            d7Var2.c();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToSns onClick");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        java.lang.String str3 = "biz_excerpt" + c01.z1.r() + '_' + str;
        java.lang.String a17 = c01.n2.a(str3);
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", str3);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("reportSessionId", a17);
        intent2.putExtra("Ksnsupload_type", 36);
        intent2.putExtra("sns_kemdia_path", str);
        intent2.putExtra("sns_exceprt_url", str2);
        intent2.putExtra("KBlockAdd", true);
        intent2.putExtra("need_result", true);
        intent2.putExtra("need_ban_back_tips", true);
        intent2.putExtra("need_ban_pic_touch", true);
        intent2.putExtra("k_need_delete", false);
        intent2.putExtra("need_result", false);
        intent2.putExtra("sns_upload_is_show_dialog", true);
        j45.l.w(this.f267566h, ".plugin.sns.ui.SnsUploadUI", intent2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267838e, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.c4(str2, c17, kVar));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267844n || (d7Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7) h0Var.f391656d) == null) {
            return;
        }
        d7Var3.c();
    }
}

package hn;

/* loaded from: classes4.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f363901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363904h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p944x882e457a.o oVar, int i17, int i18, android.content.Context context) {
        super(0);
        this.f363900d = h0Var;
        this.f363901e = oVar;
        this.f363902f = i17;
        this.f363903g = i18;
        this.f363904h = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.j8 j8Var;
        r45.j8 j8Var2;
        r45.j8 j8Var3;
        r45.j8 j8Var4;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f363900d.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String str = null;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f363901e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.qz qzVar = fVar instanceof r45.qz ? (r45.qz) fVar : null;
        int i17 = this.f363902f;
        android.content.Context context = this.f363904h;
        boolean z17 = true;
        if (i17 == 0 && this.f363903g == 0 && qzVar != null) {
            java.lang.String str2 = qzVar.f465892d;
            if (!(str2 == null || str2.length() == 0)) {
                java.lang.String element = qzVar.f465892d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                if (!nf.e.c(element, "http", true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOpenService", "join chat room url is not http:".concat(element));
                    element = "http://".concat(element);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", element);
                intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292739s, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOpenService", "join room url:" + element);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                return jz5.f0.f384359a;
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(context, "com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI");
        java.lang.String str3 = (qzVar == null || (j8Var4 = qzVar.f465893e) == null) ? null : j8Var4.f459166d;
        java.lang.String string = str3 == null || str3.length() == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ay6) : (qzVar == null || (j8Var = qzVar.f465893e) == null) ? null : j8Var.f459166d;
        java.lang.String str4 = (qzVar == null || (j8Var3 = qzVar.f465893e) == null) ? null : j8Var3.f459167e;
        if (str4 != null && str4.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = string;
        } else if (qzVar != null && (j8Var2 = qzVar.f465893e) != null) {
            str = j8Var2.f459167e;
        }
        intent2.putExtra("key_error_title", string);
        intent2.putExtra("key_error_content", str);
        android.content.Context context2 = this.f363904h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppJoinChatRoom$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppJoinChatRoom$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}

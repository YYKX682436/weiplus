package com.tencent.mm.feature.emoji;

/* loaded from: classes9.dex */
public final class y3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj0 f66556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66558g;

    public y3(com.tencent.mm.feature.emoji.c4 c4Var, r45.qj0 qj0Var, java.lang.String str, android.content.Context context) {
        this.f66555d = c4Var;
        this.f66556e = qj0Var;
        this.f66557f = str;
        this.f66558g = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f66558g;
        java.lang.String str2 = this.f66557f;
        r45.qj0 qj0Var = this.f66556e;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            java.lang.String str3 = qj0Var.f384034f + context.getString(com.tencent.mm.R.string.bzq);
            android.content.Context context2 = this.f66558g;
            java.lang.String str4 = qj0Var.f384035g;
            java.lang.String str5 = qj0Var.f384033e;
            java.lang.String str6 = qj0Var.C;
            int i18 = com.tencent.mm.plugin.emoji.model.EmojiLogic.f97533a;
            if (android.text.TextUtils.isEmpty(str2)) {
                str = null;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<xml>");
                sb6.append("<productid>" + str2 + "</productid>");
                sb6.append("</xml>");
                str = sb6.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", str);
            }
            y12.k.a(context2, str3, str4, str5, str6, str, 4);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 0, 1, this.f66557f, "", "", java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(qj0Var.f384031J)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(qj0Var.f384031J)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(qj0Var.f384031J));
            return;
        }
        se5.a aVar = new se5.a();
        java.lang.String str7 = this.f66555d.f66207d;
        java.lang.String str8 = qj0Var.f384034f;
        java.lang.String str9 = qj0Var.f384035g;
        java.lang.String str10 = qj0Var.f384033e;
        java.lang.String str11 = qj0Var.C;
        int i19 = qj0Var.f384039n;
        v05.b bVar = new v05.b();
        int i27 = bVar.f368365d;
        bVar.set(i27 + 6, 15);
        if (str8 == null) {
            str8 = "";
        }
        bVar.set(i27 + 2, str8);
        if (str9 == null) {
            str9 = "";
        }
        bVar.set(i27 + 3, str9);
        if (str10 == null) {
            str10 = "";
        }
        int i28 = bVar.f432315e;
        bVar.set(i28 + 14, str10);
        if (str11 == null) {
            str11 = "";
        }
        bVar.set(i27 + 9, str11);
        r05.e eVar = new r05.e();
        if (str2 == null) {
            str2 = "";
        }
        eVar.l(str2);
        eVar.k(i19);
        bVar.set(i28 + 19, eVar);
        l15.c cVar = new l15.c();
        cVar.q(bVar);
        aVar.l(cVar);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = 5;
        ((dk5.b0) b0Var).Bi(context, aVar, rVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 0, 2, this.f66557f, "", "", java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.l(qj0Var.f384031J)), java.lang.Integer.valueOf(com.tencent.mm.plugin.emoji.model.EmojiLogic.n(qj0Var.f384031J)), com.tencent.mm.plugin.emoji.model.EmojiLogic.m(qj0Var.f384031J));
    }
}

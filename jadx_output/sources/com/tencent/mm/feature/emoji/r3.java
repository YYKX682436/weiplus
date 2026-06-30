package com.tencent.mm.feature.emoji;

/* loaded from: classes9.dex */
public final class r3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f66457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66460g;

    public r3(int i17, r45.v75 v75Var, android.content.Context context, int i18, java.lang.String str, java.lang.String str2) {
        this.f66457d = v75Var;
        this.f66458e = context;
        this.f66459f = str;
        this.f66460g = str2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f66458e;
        r45.v75 v75Var = this.f66457d;
        if (itemId == 1001) {
            se5.a aVar = new se5.a();
            java.lang.String str2 = v75Var.f387965e;
            java.lang.String str3 = v75Var.f387968h;
            int i18 = v75Var.f387964d;
            java.lang.String str4 = v75Var.f387966f;
            v05.b bVar = new v05.b();
            int i19 = bVar.f368365d;
            bVar.set(i19 + 6, 25);
            bVar.set(i19 + 2, str2 == null ? "" : str2);
            if (str3 == null) {
                str3 = "";
            }
            bVar.set(i19 + 3, str3);
            if (str4 == null) {
                str4 = "";
            }
            int i27 = bVar.f432315e;
            bVar.set(i27 + 14, str4);
            bVar.set(i19 + 9, "");
            r05.b bVar2 = new r05.b();
            bVar2.p(i18);
            if (str2 == null) {
                str2 = "";
            }
            bVar2.n(str2);
            bVar2.o("");
            bVar.set(i27 + 20, bVar2);
            l15.c cVar = new l15.c();
            cVar.q(bVar);
            aVar.l(cVar);
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 5;
            ((dk5.b0) b0Var).Bi(context, aVar, rVar);
            return;
        }
        if (itemId == 1000) {
            java.lang.String str5 = v75Var.f387965e + context.getString(com.tencent.mm.R.string.bzo);
            android.content.Context context2 = this.f66458e;
            java.lang.String str6 = this.f66459f;
            java.lang.String str7 = v75Var.f387966f;
            java.lang.String str8 = this.f66460g;
            int i28 = v75Var.f387964d;
            java.lang.String str9 = v75Var.f387965e;
            int i29 = com.tencent.mm.plugin.emoji.model.EmojiLogic.f97533a;
            if (i28 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<xml>");
                sb6.append("<designeruin>" + i28 + "</designeruin>");
                sb6.append("<designername>" + str9 + "</designername>");
                sb6.append("<designerrediretcturl>" + u46.k.c(str8) + "</designerrediretcturl>");
                sb6.append("</xml>");
                str = sb6.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", str);
            } else {
                str = null;
            }
            y12.k.a(context2, str5, str6, str7, str8, str, 10);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13224, 3, 1, "", java.lang.Integer.valueOf(v75Var.f387964d));
        }
    }
}

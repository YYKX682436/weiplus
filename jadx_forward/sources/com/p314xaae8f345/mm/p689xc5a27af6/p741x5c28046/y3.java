package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes9.dex */
public final class y3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f148088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj0 f148089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148091g;

    public y3(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var, r45.qj0 qj0Var, java.lang.String str, android.content.Context context) {
        this.f148088d = c4Var;
        this.f148089e = qj0Var;
        this.f148090f = str;
        this.f148091g = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f148091g;
        java.lang.String str2 = this.f148090f;
        r45.qj0 qj0Var = this.f148089e;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            java.lang.String str3 = qj0Var.f465567f + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzq);
            android.content.Context context2 = this.f148091g;
            java.lang.String str4 = qj0Var.f465568g;
            java.lang.String str5 = qj0Var.f465566e;
            java.lang.String str6 = qj0Var.C;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
            if (android.text.TextUtils.isEmpty(str2)) {
                str = null;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<xml>");
                sb6.append("<productid>" + str2 + "</productid>");
                sb6.append("</xml>");
                str = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", str);
            }
            y12.k.a(context2, str3, str4, str5, str6, str, 4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13224, 0, 1, this.f148090f, "", "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(qj0Var.f465564J)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(qj0Var.f465564J)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(qj0Var.f465564J));
            return;
        }
        se5.a aVar = new se5.a();
        java.lang.String str7 = this.f148088d.f147740d;
        java.lang.String str8 = qj0Var.f465567f;
        java.lang.String str9 = qj0Var.f465568g;
        java.lang.String str10 = qj0Var.f465566e;
        java.lang.String str11 = qj0Var.C;
        int i19 = qj0Var.f465572n;
        v05.b bVar = new v05.b();
        int i27 = bVar.f449898d;
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
        int i28 = bVar.f513848e;
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
        rVar.f415650a = true;
        rVar.f415653d.f415672a = 5;
        ((dk5.b0) b0Var).Bi(context, aVar, rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13224, 0, 2, this.f148090f, "", "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(qj0Var.f465564J)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(qj0Var.f465564J)), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(qj0Var.f465564J));
    }
}

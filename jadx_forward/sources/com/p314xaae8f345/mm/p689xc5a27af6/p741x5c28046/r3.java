package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes9.dex */
public final class r3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f147990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147993g;

    public r3(int i17, r45.v75 v75Var, android.content.Context context, int i18, java.lang.String str, java.lang.String str2) {
        this.f147990d = v75Var;
        this.f147991e = context;
        this.f147992f = str;
        this.f147993g = str2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f147991e;
        r45.v75 v75Var = this.f147990d;
        if (itemId == 1001) {
            se5.a aVar = new se5.a();
            java.lang.String str2 = v75Var.f469498e;
            java.lang.String str3 = v75Var.f469501h;
            int i18 = v75Var.f469497d;
            java.lang.String str4 = v75Var.f469499f;
            v05.b bVar = new v05.b();
            int i19 = bVar.f449898d;
            bVar.set(i19 + 6, 25);
            bVar.set(i19 + 2, str2 == null ? "" : str2);
            if (str3 == null) {
                str3 = "";
            }
            bVar.set(i19 + 3, str3);
            if (str4 == null) {
                str4 = "";
            }
            int i27 = bVar.f513848e;
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
            rVar.f415650a = true;
            rVar.f415653d.f415672a = 5;
            ((dk5.b0) b0Var).Bi(context, aVar, rVar);
            return;
        }
        if (itemId == 1000) {
            java.lang.String str5 = v75Var.f469498e + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzo);
            android.content.Context context2 = this.f147991e;
            java.lang.String str6 = this.f147992f;
            java.lang.String str7 = v75Var.f469499f;
            java.lang.String str8 = this.f147993g;
            int i28 = v75Var.f469497d;
            java.lang.String str9 = v75Var.f469498e;
            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
            if (i28 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<xml>");
                sb6.append("<designeruin>" + i28 + "</designeruin>");
                sb6.append("<designername>" + str9 + "</designername>");
                sb6.append("<designerrediretcturl>" + u46.k.c(str8) + "</designerrediretcturl>");
                sb6.append("</xml>");
                str = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", str);
            } else {
                str = null;
            }
            y12.k.a(context2, str5, str6, str7, str8, str, 10);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13224, 3, 1, "", java.lang.Integer.valueOf(v75Var.f469497d));
        }
    }
}

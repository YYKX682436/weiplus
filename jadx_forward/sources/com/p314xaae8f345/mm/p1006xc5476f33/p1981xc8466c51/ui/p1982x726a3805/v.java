package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes5.dex */
public class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f237105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.x f237106e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.x xVar, android.widget.TextView textView) {
        this.f237106e = xVar;
        this.f237105d = textView;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.widget.TextView textView = this.f237105d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.x xVar = this.f237106e;
        if (itemId == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(textView.getText());
            android.content.Context context = xVar.f237114i.f237115a;
            db5.e1.W(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
            return;
        }
        if (itemId == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(textView.getContext(), null)) {
                xVar.f237109d.f(xVar.f237113h, !xVar.f237110e);
                return;
            }
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = xVar.f237109d;
            bt3.f3 a17 = l2Var.a(xVar.f237113h);
            if (a17.f105798e == 2) {
                a17.f105798e = 0;
                l2Var.f236976b.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (itemId == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var2 = xVar.f237109d;
            int i18 = xVar.f237113h;
            if (i18 >= l2Var2.f236977c.f236875a.size()) {
                return;
            }
            android.content.Context context2 = l2Var2.f236975a;
            db5.t7.m(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6d));
            bt3.f3 a18 = l2Var2.a(i18);
            java.lang.String str = ((r45.gp0) l2Var2.f236977c.f236875a.get(i18)).f456941f;
            java.lang.String str2 = a18.f105799f;
            r45.aq6 aq6Var = new r45.aq6();
            aq6Var.f451740d = str;
            aq6Var.f451742f = str2;
            aq6Var.f451742f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(l2Var2.f236975a);
            aq6Var.b().l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.i2(l2Var2));
            return;
        }
        if (itemId != 4) {
            if (itemId != 101) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.y yVar = xVar.f237114i;
            te5.x0.b(yVar.f237115a, xVar.f237112g.f338123a.f456941f, yVar.f237118d.Q0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(xVar.f237114i.f237118d.V1(), xVar.f237114i.f237118d.Q0()), xVar.f237114i.f237118d.I0(), 2, true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var3 = xVar.f237109d;
        int i19 = xVar.f237113h;
        l2Var3.getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
        c10687xa533b04c.f149354d = wd0.k2.CHAT_RECORD_DEFAULT;
        c10687xa533b04c.f149355e = "TranslateHelper.SettingsRequestSessionId_" + i19;
        c10687xa533b04c.b("TranslateHelper.SettingsRequestExtKey.MsgPosition", java.lang.String.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateHelper", "changeTranslateLanguage, msgPosition: " + i19);
        l2Var3.f236979e = c10687xa533b04c.m45295x5a5dd5d();
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(l2Var3.f236975a, c10687xa533b04c);
    }
}

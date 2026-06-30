package f22;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f22.e f340499a = new f22.e();

    public final void a(android.content.Context context, f22.a pageContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageContext, "pageContext");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StoreEmoticonDesignerProfileJumpLogic", "view context is null");
        } else {
            b(context, pageContext, true, false, new f22.b(context, pageContext));
        }
    }

    public final void b(android.content.Context context, f22.a pageContext, boolean z17, boolean z18, yz5.l callback) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageContext, "pageContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).Vi(pageContext.f445560g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = null;
        if (!(pageContext.f445562i.length() == 0)) {
            pageContext.f445560g = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.d(pageContext.f445562i);
            java.lang.String str2 = pageContext.f445562i;
            r45.v75 v75Var = new r45.v75();
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "xml", null);
            try {
                v75Var.f469498e = (java.lang.String) d17.get(".xml.designername");
                v75Var.f469497d = kk.v.b((java.lang.String) d17.get(".xml.designeruin"));
                v75Var.f469500g = (java.lang.String) d17.get(".xml.finderusername");
                v75Var.f469502i = (java.lang.String) d17.get(".xml.finderheadimgurl");
                v75Var.f469503m = (java.lang.String) d17.get(".xml.findernickname");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getDesignerBySnsObjData exception. %s", e17.toString());
            }
            try {
                str = (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(pageContext.f445562i, "xml", null).get(".xml.designerrediretcturl");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getDesignerRediretctUrlBySnsObjData exception. %s", e18.toString());
                str = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDesignerRediretctUrlBySnsObjData(...)");
            pageContext.f445569p = str;
            java.lang.String str3 = pageContext.f445562i;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            try {
                if (((java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str3, "xml", null).get(".xml.finderusername")) != null) {
                    bool = java.lang.Boolean.TRUE;
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "isFinderNameExistInDesignerSnsObjData exception. %s", e19.toString());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "isFinderNameExistInDesignerSnsObjData(...)");
            if (bool.booleanValue()) {
                pageContext.f445568o = true;
            }
        }
        if (pageContext.f445568o) {
            r45.v75 v75Var2 = new r45.v75();
            v75Var2.f469497d = pageContext.f445560g;
            v75Var2.f469498e = pageContext.f445563j;
            v75Var2.f469500g = pageContext.f445565l;
            v75Var2.f469503m = pageContext.f445566m;
            v75Var2.f469502i = pageContext.f445567n;
            y12.p.f540410a.e(v75Var2, pageContext.f445561h);
            callback.mo146xb9724478(v75Var2);
            return;
        }
        if (!(pageContext.f445561h.length() > 0)) {
            if (pageContext.f445560g != 0) {
                if (z17) {
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.f293313g = 2;
                    f4Var2 = e4Var.c();
                }
                y12.p.f540410a.b(pageContext.f445560g, z18, new f22.d(f4Var2, callback));
                return;
            }
            return;
        }
        if (z17) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293313g = 2;
            e4Var2.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga);
            f4Var = e4Var2.c();
        } else {
            f4Var = null;
        }
        y12.p pVar = y12.p.f540410a;
        java.lang.String designerId = pageContext.f445561h;
        f22.c cVar = new f22.c(f4Var, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(designerId, "designerId");
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) y12.p.f540411b).get(designerId);
        if (num != null) {
            pVar.b(num.intValue(), z18, cVar);
        } else if (z18) {
            cVar.mo146xb9724478(null);
        } else {
            new z12.b0(designerId, 0).a(new y12.n(cVar));
        }
    }
}

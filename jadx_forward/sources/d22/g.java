package d22;

/* loaded from: classes12.dex */
public final class g implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        java.lang.String str = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            d22.f fVar = (d22.f) context;
            r45.v75 v75Var = fVar.f307370p;
            if (v75Var != null) {
                r45.v75 v75Var2 = new r45.v75();
                if (v75Var != null) {
                    v75Var2.f469497d = v75Var.f469497d;
                    v75Var2.f469498e = v75Var.f469498e;
                    v75Var2.f469499f = v75Var.f469499f;
                    v75Var2.f469500g = v75Var.f469500g;
                    v75Var2.f469501h = v75Var.f469501h;
                    v75Var2.f469502i = v75Var.f469502i;
                    v75Var2.f469503m = v75Var.f469503m;
                }
                str = android.util.Base64.encodeToString(v75Var2.mo14344x5f01b1f6(), 2);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("designerID", fVar.f445585g);
            linkedHashMap.put("designerUin", v75Var != null ? new jz5.u(v75Var.f469497d) : null);
            linkedHashMap.put("needLeftNavReturn", java.lang.Boolean.valueOf(fVar.f445592n));
            linkedHashMap.put("extranceScene", java.lang.Integer.valueOf(fVar.f445688a));
            linkedHashMap.put("oldRedirectUrl", fVar.f445591m);
            linkedHashMap.put("needJmp2SingleEmoji", java.lang.Boolean.valueOf(fVar.f445593o));
            linkedHashMap.put("enterTime", java.lang.Long.valueOf(fVar.f445691d));
            linkedHashMap.put("requestID", fVar.f445690c);
            linkedHashMap.put("personalDesigner", str);
            java.lang.String gVar = new cl0.g(linkedHashMap).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            return gVar;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.MMEmoticonDesignerProfileCreator", th6, "unable to cast DesignerProfileContext", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/profile/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s i(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxaliteb6acd493f7e02b17d6b805ccf970be5b";
    }

    @Override // d22.p
    public void k(android.content.Context viewContext, d22.v liteAppContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewContext, "viewContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public boolean l() {
        return false;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return true;
    }
}

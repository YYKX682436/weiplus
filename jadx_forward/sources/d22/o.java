package d22;

/* loaded from: classes9.dex */
public final class o implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            d22.n nVar = (d22.n) context;
            r45.vd0 vd0Var = nVar.f307399j;
            if (vd0Var == null) {
                return "";
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String str = vd0Var.f469669f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getTitle(...)");
            linkedHashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str);
            java.lang.String str2 = vd0Var.f469670g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getDesc(...)");
            linkedHashMap.put("desc", str2);
            java.lang.String str3 = vd0Var.f469668e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getIconUrl(...)");
            linkedHashMap.put("iconUrl", str3);
            linkedHashMap.put("extranceScene", java.lang.Integer.valueOf(nVar.f445688a));
            java.lang.String str4 = vd0Var.f469667d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getKey(...)");
            linkedHashMap.put("setKey", str4);
            linkedHashMap.put("setType", 97);
            linkedHashMap.put("enterTime", java.lang.Long.valueOf(nVar.f445691d));
            d22.n nVar2 = (d22.n) context;
            linkedHashMap.put("designerUin", java.lang.Integer.valueOf(nVar2.f445664g));
            linkedHashMap.put("sessionID", nVar2.f445665h);
            linkedHashMap.put("pageScene", java.lang.Integer.valueOf(nVar.f445666i));
            java.lang.String gVar = new cl0.g(linkedHashMap).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            return gVar;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.MMEmoticonIPPageCreator", th6, "unable to cast IPPageContext", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/ip/entry";
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

package d22;

/* loaded from: classes12.dex */
public final class x implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean Ai = ((com.p314xaae8f345.mm.p2621x8fb0427b.h5) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c6.class))).Ai();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("privacySettingPage", Ai ? 1 : 0);
        jSONObject.put("customEmoticonPage", Ai ? 1 : 0);
        jSONObject.put("selfieEmoticonPage", Ai ? 1 : 0);
        jSONObject.put("productEmoticonPage", 1);
        if (context instanceof d22.w) {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, ((d22.w) context).f307410j);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/setting";
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
        return "wxalite3781e0acb99de51167d8cc934ce9f490";
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

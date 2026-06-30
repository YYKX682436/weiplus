package d22;

/* loaded from: classes12.dex */
public final class c0 implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(context instanceof d22.b0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmoticonRewardPageCreator", "unable to cast reward page context");
            return "";
        }
        d22.b0 b0Var = (d22.b0) context;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("pid", b0Var.f307362h);
        linkedHashMap.put("rewardScene", java.lang.Integer.valueOf(b0Var.f445723g));
        linkedHashMap.put("extranceScene", java.lang.Integer.valueOf(b0Var.f445688a));
        linkedHashMap.put("enterTime", java.lang.Long.valueOf(b0Var.f445691d));
        java.lang.String gVar = new cl0.g(linkedHashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/album/reward/entry";
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

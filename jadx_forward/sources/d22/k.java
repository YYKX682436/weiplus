package d22;

/* loaded from: classes12.dex */
public final class k implements d22.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f307384d;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f307384d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.liteapp.MMEmoticonEmojiSearchCreator$Companion$liteAppLifeCycleListener$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(riVar.f89352c) || !riVar.f89352c.equals("wxalite279f07556d0da57154990988e8cfcecb") || riVar.f89350a != 3) {
                    return false;
                }
                y75.d dVar = y75.a.f541319a;
                if (dVar != null) {
                    dVar.f402101d = null;
                }
                y75.a.f541319a = null;
                mo48814x2efc64();
                return false;
            }
        };
    }

    @Override // d22.p
    public boolean a() {
        return true;
    }

    @Override // d22.p
    public java.lang.String d(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(context instanceof d22.j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmoticonEmojiSearchCreator", "unable to cast emojiSearch page context");
            return "";
        }
        d22.j jVar = (d22.j) context;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, jVar.f445625j);
        linkedHashMap.put("defaultTag", java.lang.Integer.valueOf(jVar.f445622g));
        linkedHashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(jVar.f445624i));
        linkedHashMap.put("enterTime", java.lang.Long.valueOf(jVar.f445691d));
        linkedHashMap.put("searchScene", java.lang.Long.valueOf(jVar.f445623h));
        linkedHashMap.put("toSendText", jVar.f445626k);
        linkedHashMap.put("isNativeContainer", java.lang.Boolean.valueOf(jVar.f445692e));
        java.lang.String gVar = new cl0.g(linkedHashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.MMEmoticonEmojiSearchCreator", "get query: ".concat(gVar));
        return gVar;
    }

    @Override // d22.p
    public java.lang.String e() {
        return j62.e.g().i("clicfg_android_emoticon_search_native_container", 0, false, true) == 1 ? "pages/emonative/entry" : "pages/emosearch/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
        f307384d.mo48813x58998cd();
    }

    @Override // d22.p
    public boolean h() {
        return true;
    }

    @Override // d22.p
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s i(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxalite279f07556d0da57154990988e8cfcecb";
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
    public java.lang.String m() {
        return j62.e.g().i("clicfg_android_emoticon_search_native_container", 0, false, true) == 1 ? "modal" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return true;
    }
}

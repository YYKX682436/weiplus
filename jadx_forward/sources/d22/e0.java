package d22;

/* loaded from: classes12.dex */
public final class e0 implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(context instanceof d22.d0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmoticonStoreDetailPageCreator", "unable to cast store detail page context");
            return "";
        }
        d22.d0 d0Var = (d22.d0) context;
        r45.qj0 qj0Var = d0Var.f307368q;
        if (qj0Var == null) {
            j12.i iVar = d0Var.f307369r;
            qj0Var = iVar != null ? iVar.a(true) : null;
        }
        java.lang.String encodeToString = qj0Var != null ? android.util.Base64.encodeToString(qj0Var.mo14344x5f01b1f6(), 2) : "";
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("pid", d0Var.f307367p);
        linkedHashMap.put("emotionDetail", encodeToString);
        linkedHashMap.put("needScrollToBottom", java.lang.Boolean.TRUE);
        linkedHashMap.put("fastManagement", java.lang.Boolean.valueOf(d0Var.f445738n));
        linkedHashMap.put("precedingScene", java.lang.Integer.valueOf(d0Var.f445731g));
        linkedHashMap.put("extranceScene", java.lang.Integer.valueOf(d0Var.f445688a));
        linkedHashMap.put("customBackText", null);
        linkedHashMap.put("fromDesigner", java.lang.Boolean.valueOf(d0Var.f445733i));
        linkedHashMap.put("requestID", d0Var.c());
        linkedHashMap.put("enterTime", java.lang.Long.valueOf(d0Var.f445691d));
        java.lang.String gVar = new cl0.g(linkedHashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/album/detail/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s i(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        if (!(context instanceof d22.d0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmoticonStoreDetailPageCreator", "unable to cast storeDetailContext");
            return sVar;
        }
        d22.d0 d0Var = (d22.d0) context;
        d22.l0 l0Var = new d22.l0(sVar, d0Var.f307367p);
        l0Var.f307397h = d0Var.f445688a;
        sVar.f225700d = l0Var;
        return sVar;
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

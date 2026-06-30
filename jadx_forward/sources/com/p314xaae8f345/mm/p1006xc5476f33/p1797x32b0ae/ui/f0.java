package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class f0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 f225935a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39) {
        this.f225935a = c16238x79483a39;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteAppDragHalfScreenUI", "onWholeScreen!");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void b(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a type) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            str = "onHide";
        } else if (ordinal == 1) {
            str = "onFullScreen";
        } else if (ordinal == 2) {
            str = "onShow";
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Uj(this.f225935a.mo28563xe7b2546(), 0L, "app.halfScreen.animationEnd", jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a type) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            str = "onHide";
        } else if (ordinal == 1) {
            str = "onFullScreen";
        } else if (ordinal == 2) {
            str = "onShow";
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Uj(this.f225935a.mo28563xe7b2546(), 0L, "app.halfScreen.animationStart", jSONObject);
    }
}

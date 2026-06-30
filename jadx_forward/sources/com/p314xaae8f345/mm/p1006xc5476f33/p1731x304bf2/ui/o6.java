package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public final class o6 implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f223233a;

    public o6(yz5.a pageIdProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageIdProvider, "pageIdProvider");
        this.f223233a = pageIdProvider;
    }

    @Override // qj5.q
    public java.lang.String a() {
        return null;
    }

    @Override // qj5.q
    public org.json.JSONObject f() {
        long longValue = ((java.lang.Number) this.f223233a.mo152xb9724478()).longValue();
        if (longValue < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GameTabScreenshotShareProvider", "getGameCenterExtraData: invalid pageId=" + longValue);
            return null;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q a17 = x93.c.a(longValue);
        if (a17 != null) {
            return a17.f224980d;
        }
        return null;
    }

    @Override // qj5.q
    public qj5.p h() {
        long longValue = ((java.lang.Number) this.f223233a.mo152xb9724478()).longValue();
        if (longValue < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GameTabScreenshotShareProvider", "bizConfig: invalid pageId=" + longValue);
            return new qj5.p();
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q a17 = x93.c.a(longValue);
        if (a17 == null) {
            return new qj5.p();
        }
        qj5.p pVar = new qj5.p();
        pVar.f445528a = a17.f224977a;
        pVar.f445529b = a17.f224978b;
        pVar.f445530c = a17.f224979c;
        return pVar;
    }

    @Override // qj5.q
    public int i() {
        return 8;
    }
}

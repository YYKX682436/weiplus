package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.s f162758d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.s();

    public s() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String optString;
        java.lang.String optString2;
        boolean z17;
        s40.b1 service = (s40.b1) obj;
        java.lang.String widgetData = (java.lang.String) obj2;
        yz5.l callback = (yz5.l) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetData, "widgetData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6 t6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) service;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(widgetData);
            optString = jSONObject.optString("productId");
            optString2 = jSONObject.optString("finder_username");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(t6Var.f148477d, "checkProductRecordPlayWidgetDisplayable failed", e17);
            callback.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        if (!(optString.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (optString2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(widgetData), com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.h.class, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c6(callback), null);
                return jz5.f0.f384359a;
            }
        }
        callback.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}

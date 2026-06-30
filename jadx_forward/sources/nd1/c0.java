package nd1;

/* loaded from: classes7.dex */
public final class c0 extends nd1.r {

    /* renamed from: g, reason: collision with root package name */
    public static final nd1.s f417806g = new nd1.s(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f417807h = kz5.z.D0(new java.lang.String[]{"halfEnable", "height", "enableFullScreenGesture", "autoFullScreenWhenTap", "usePushAnimation", "forbidSlidingUpGesture", "forbidGestureWhenFullScreen", "forceLightMode", "showBgMask", "shapeConfig"});

    public static final void D(nd1.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, boolean z17) {
        c0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = o6Var.f156329e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = hcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) hcVar : null;
        if (c11529x5d7a34bb != null) {
            c11529x5d7a34bb.b0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = o6Var.H2.f172731d;
        if (f0Var != null) {
            f0Var.Y();
        }
        if (z17) {
            boolean R = o6Var.R();
            o6Var.f156350x1 = false;
            o6Var.S();
            o6Var.f156350x1 = R;
        } else {
            o6Var.S();
        }
        if (c11529x5d7a34bb != null) {
            c11529x5d7a34bb.i0();
        }
    }

    @Override // nd1.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y service, org.json.JSONObject data, int i17) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (service.t3() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            java.lang.String optString = data.optString("url");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = null;
            try {
                jSONObject = data.getJSONObject("singlePageUiParams");
            } catch (org.json.JSONException unused) {
                jSONObject = null;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.e(service.t3()) && jSONObject != null) {
                java.util.Set set = f417807h;
                boolean z17 = false;
                if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                    java.util.Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (jSONObject.has((java.lang.String) it.next())) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = service.t3();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(t37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37;
                    android.app.Activity r07 = o6Var.r0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08 = o6Var.u0();
                    if (u08 != null && (c12559xbdae8559 = u08.f128802b2) != null && c12559xbdae8559.f169323f == 1038) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToWC", "use getLastStatObjectIgnoreFromOtherWeAppBack");
                        c12559xbdae8559 = o6Var.f553280g2;
                    }
                    o6Var.N.a(new nd1.w(o6Var, new nd1.b0(r07, this, jSONObject, optString, u07, c12559xbdae8559, service, i17)));
                    o6Var.m(new nd1.y(o6Var, this));
                    return;
                }
            }
        }
        super.A(service, data, i17);
    }

    public final android.os.Bundle E(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String valueOf = java.lang.String.valueOf(keys.next());
            java.lang.Object opt = jSONObject.opt(valueOf);
            if (opt instanceof java.lang.Integer) {
                bundle.putInt(valueOf, ((java.lang.Number) opt).intValue());
            } else if (opt instanceof java.lang.String) {
                bundle.putString(valueOf, (java.lang.String) opt);
            } else if (opt instanceof java.lang.Long) {
                bundle.putLong(valueOf, ((java.lang.Number) opt).longValue());
            } else if (opt instanceof java.lang.Boolean) {
                bundle.putBoolean(valueOf, ((java.lang.Boolean) opt).booleanValue());
            } else if (opt instanceof org.json.JSONObject) {
                bundle.putBundle(valueOf, E((org.json.JSONObject) opt));
            }
        }
        return bundle;
    }
}

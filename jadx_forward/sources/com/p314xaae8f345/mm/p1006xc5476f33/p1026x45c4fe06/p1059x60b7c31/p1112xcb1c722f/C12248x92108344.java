package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetScreenBrightness2;", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "<init>", "()V", "Companion", "luggage-commons-jsapi-default-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2 */
/* loaded from: classes7.dex */
public final class C12248x92108344 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34877x366c91de = 229;

    /* renamed from: NAME */
    public static final java.lang.String f34878x24728b = "setScreenBrightness";

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion f164972i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public float f164973g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.x f164974h;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetScreenBrightness2$Companion;", "", "", "CTRL_INDEX", "I", "", "MAGIC_OVERRIDE_NONE", "F", "", "NAME", "Ljava/lang/String;", "TAG", "<init>", "()V", "luggage-commons-jsapi-default-impl_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion companion, android.app.Activity activity, float f17) {
            android.view.WindowManager.LayoutParams attributes;
            companion.getClass();
            android.view.Window window = activity.getWindow();
            if (window == null || (attributes = window.getAttributes()) == null) {
                return;
            }
            if (java.lang.Float.compare(-1.0f, f17) == 0) {
                attributes.screenBrightness = -1.0f;
            } else {
                attributes.screenBrightness = java.lang.Float.max(f17, 0.01f);
            }
            activity.getWindow().setAttributes(attributes);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, final org.json.JSONObject data, final int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12250x71a5ed1e c12250x71a5ed1e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12250x71a5ed1e(env, i17);
        env.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$1
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data:");
                org.json.JSONObject jSONObject = data;
                sb6.append(jSONObject);
                sb6.append(", appState:");
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = env;
                sb6.append(lVar.mo48799xc0ccc466());
                java.lang.String sb7 = sb6.toString();
                final yz5.l lVar2 = yz5.l.this;
                lVar2.mo146xb9724478(sb7);
                float optDouble = (float) jSONObject.optDouble("value", Double.NaN);
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344 c12248x92108344 = this;
                c12248x92108344.f164973g = optDouble;
                boolean isNaN = java.lang.Float.isNaN(optDouble);
                int i18 = i17;
                if (!isNaN) {
                    float f17 = c12248x92108344.f164973g;
                    if (f17 <= 1.0f && (f17 >= 0.0f || java.lang.Float.compare(-1.0f, f17) == 0)) {
                        if (u81.b.FOREGROUND == lVar.mo48799xc0ccc466()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion companion = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.f164972i;
                            companion.getClass();
                            android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
                            if (a17 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion.a(companion, a17, c12248x92108344.f164973g);
                            }
                        }
                        if (c12248x92108344.f164974h == null && lVar.mo50358x95c7fa5f() != null) {
                            p012xc85e97e9.p093xedfae76a.x xVar = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$1.1
                                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
                                /* renamed from: onPaused */
                                public final void m51308x53a16fed() {
                                    yz5.l.this.mo146xb9724478("onPaused, restore to BRIGHTNESS_OVERRIDE_NONE");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion companion2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.f164972i;
                                    companion2.getClass();
                                    android.app.Activity a18 = q75.a.a(lVar.mo50352x76847179());
                                    if (a18 != null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion.a(companion2, a18, -1.0f);
                                    }
                                }

                                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                                /* renamed from: onResumed */
                                public final void m51309x91113ef8() {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344 c12248x921083442 = c12248x92108344;
                                    if (java.lang.Float.isNaN(c12248x921083442.f164973g)) {
                                        return;
                                    }
                                    yz5.l.this.mo146xb9724478("onResumed, restore to " + c12248x921083442.f164973g);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion companion2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.f164972i;
                                    companion2.getClass();
                                    android.app.Activity a18 = q75.a.a(lVar.mo50352x76847179());
                                    if (a18 != null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1112xcb1c722f.C12248x92108344.Companion.a(companion2, a18, c12248x921083442.f164973g);
                                    }
                                }
                            };
                            p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = lVar.mo50358x95c7fa5f();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50358x95c7fa5f);
                            mo50358x95c7fa5f.mo273xed6858b4().a(xVar);
                            c12248x92108344.f164974h = xVar;
                        }
                        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 0);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                        }
                        lVar.a(i18, c12248x92108344.u(str, jSONObject2));
                        return;
                    }
                }
                lVar.a(i18, c12248x92108344.o("fail: value invalid"));
            }
        });
    }
}

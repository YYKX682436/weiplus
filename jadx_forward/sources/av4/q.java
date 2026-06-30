package av4;

/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public av4.j f95859a;

    /* renamed from: b, reason: collision with root package name */
    public av4.q f95860b;

    public q(av4.j jVar) {
        this.f95859a = jVar;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe32;
        r45.e64 i17;
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).getClass();
        org.json.JSONObject jSONObject = null;
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308701s) && (i17 = su4.r2.i()) != null) {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", java.lang.Float.valueOf(i17.f454580e));
            jSONObject.put("longitude", java.lang.Float.valueOf(i17.f454579d));
            jSONObject.put("precision", i17.f454581f);
            jSONObject.put("macAddr", i17.f454582g);
            jSONObject.put("cellId", i17.f454583h);
            jSONObject.put("gpsSource", i17.f454584i);
            jSONObject.put("address", i17.f454585m);
        }
        if (jSONObject == null) {
            av4.j jVar = this.f95859a;
            if (jVar != null && (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject2 = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onCurrentLocationReady", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onCurrentLocationReady", "onCurrentLocationReady", jSONObject2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            java.lang.String jSONObject3 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        }
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("json", jSONObject.toString());
        jSONObject4.put("ret", 0);
        av4.j jVar2 = this.f95859a;
        if (jVar2 != null && (mo9090x86b9ebe32 = jVar2.mo9090x86b9ebe3()) != null) {
            java.lang.String jSONObject5 = jSONObject4.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onCurrentLocationReady", jSONObject5);
                java.lang.String format2 = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onCurrentLocationReady", "onCurrentLocationReady", jSONObject5}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                pm0.v.X(new av4.t0(mo9090x86b9ebe32, format2));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        java.lang.String jSONObject6 = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
        return jSONObject6;
    }

    public boolean b(int i17, java.lang.String feature, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feature, "feature");
        return false;
    }

    public java.lang.String c(java.lang.String str) {
        java.lang.String jSONObject = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public abstract boolean d();

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e, int i17) {
        if (abstractC19224x1fe3df6e != null) {
            org.json.JSONObject g17 = g();
            g17.put("height", i17);
            java.lang.String jSONObject = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onGetKeyboardHeight", jSONObject);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onGetKeyboardHeight", "onGetKeyboardHeight", jSONObject}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(abstractC19224x1fe3df6e, format));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
    }

    public final org.json.JSONObject f() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret", -1);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public final org.json.JSONObject g() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret", 0);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getCurrentLocation */
    public java.lang.String m9098xdc030a18(java.lang.String str) {
        try {
            boolean z17 = true;
            if (new org.json.JSONObject(str).optInt("needUpdate", 0) != 1) {
                z17 = false;
            }
            if (!z17) {
                return a();
            }
            su4.e1 e1Var = (su4.e1) i95.n0.c(su4.e1.class);
            av4.p pVar = new av4.p(this);
            ((sg0.a3) e1Var).getClass();
            sg0.z2 z2Var = new sg0.z2(pVar);
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(z2Var, false);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getExpConfig */
    public final java.lang.String m9099xcd58a109(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("key", "");
            java.lang.String j17 = j62.e.g().j(optString, jSONObject.optString("defValue", ""), jSONObject.optInt("skipReport", -1) <= 0, true);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
            if (optString != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getExptInfo, ret: " + j62.e.g().b(optString, c19767x257d7f, c19767x257d7f2));
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("ret", "0");
            jSONObject2.putOpt("configResult", j17);
            jSONObject2.putOpt("exptId", c19767x257d7f);
            jSONObject2.putOpt("groupId", c19767x257d7f2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getExpConfig, key:" + optString + ", returnJsonObj: " + jSONObject2);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject4 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getKeyboardHeight */
    public final java.lang.String m9100x9918f4e4(java.lang.String str) {
        org.json.JSONObject g17 = g();
        av4.j jVar = this.f95859a;
        g17.put("height", jVar != null ? jVar.z2() : 0);
        java.lang.String jSONObject = g17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getPermanentData */
    public final java.lang.String m9101xe2a26dc2(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe32;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getPermanentData " + str);
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("key", "");
            java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u(optString, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", 0);
            jSONObject.put("key", optString);
            jSONObject.put("value", u17);
            av4.j jVar = this.f95859a;
            if (jVar != null && (mo9090x86b9ebe32 = jVar.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onPermanentDataReady", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onPermanentDataReady", "onPermanentDataReady", jSONObject2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe32, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            java.lang.String jSONObject3 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            av4.j jVar2 = this.f95859a;
            if (jVar2 != null && (mo9090x86b9ebe3 = jVar2.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject4 = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onPermanentDataReady", jSONObject4);
                    java.lang.String format2 = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onPermanentDataReady", "onPermanentDataReady", jSONObject4}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format2));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            java.lang.String jSONObject5 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: isActivityResume */
    public final java.lang.String m9102x152567e6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        android.content.Context context;
        av4.j jVar = this.f95859a;
        if (jVar != null && (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) != null && (context = mo9090x86b9ebe3.getContext()) != null && (context instanceof android.content.MutableContextWrapper)) {
            android.content.Context baseContext = ((android.content.MutableContextWrapper) context).getBaseContext();
            if ((baseContext instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) && ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) baseContext).mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.RESUMED) {
                java.lang.String jSONObject = g().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
        }
        java.lang.String jSONObject2 = f().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: isAppForeground */
    public final java.lang.String m9103x4fc5a13a(java.lang.String str) {
        return g().put("isAppForeground", d() ? 1 : 0).toString();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: isSupportFeature */
    public final java.lang.String m9104xce2a83f1(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            java.lang.String optString = jSONObject.optString("feature", "");
            int optInt2 = jSONObject.optInt("version", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.lang.String jSONObject2 = b(optInt, optString, optInt2) ? g().toString() : f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject3 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject3);
            return jSONObject3;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: removePermanentData */
    public final java.lang.String m9105x2685df54(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "removePermanentData " + str);
        try {
            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().remove(new org.json.JSONObject(str).optString("key", ""));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: savePermanentData */
    public final java.lang.String m9106x911932fb(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("key", "");
            java.lang.String optString2 = jSONObject.optString("value", "");
            boolean D = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D(optString, optString2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "savePermanentData key:" + optString + " value:" + optString2 + " result:" + D);
            return D ? g().toString() : f().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }
}

package x44;

/* loaded from: classes4.dex */
public final class k0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("weAppUserName");
        java.lang.String str4 = optString == null ? "" : optString;
        java.lang.String optString2 = data.optString("weAppPath");
        java.lang.String str5 = optString2 == null ? "" : optString2;
        int optInt = data.optInt("version");
        data.optInt("miniProgramType");
        java.lang.String optString3 = data.optString("componentId");
        if (optString3 == null) {
            optString3 = "";
        }
        boolean optBoolean = data.optBoolean("openInHalfScreen", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.JumpApp", "it is going to jump to weapp ".concat(str4));
        if (str4.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.JumpApp", "the we app user name is empty!! ");
            b(g("the we app user name is empty!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
            return;
        }
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.JumpApp", "the activity is null");
            b(g("the activity is null"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
            return;
        }
        if (env.b().d() == 2) {
            m54.l b17 = env.b();
            b17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSessionId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSessionId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            str2 = b17.M;
            if (str2 == null) {
                str2 = "";
            }
            m54.l b18 = env.b();
            b18.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdBuffer", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdBuffer", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            str = b18.L;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
            str2 = str;
        }
        if (data.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            i17 = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, Integer.MAX_VALUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.JumpApp", "h5 scene=" + i17);
            if (i17 != Integer.MAX_VALUE) {
                str3 = "";
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2056, 4);
            } else {
                str3 = "";
            }
        } else {
            str3 = "";
            i17 = Integer.MAX_VALUE;
        }
        java.lang.String optString4 = data.optString("sceneNote");
        if (optString4 == null) {
            optString4 = str3;
        }
        if (optString4.length() == 0) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            z17 = false;
            objArr[0] = str2;
            objArr[1] = str;
            objArr[2] = optString3;
            objArr[3] = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
            objArr[4] = java.lang.Integer.valueOf(env.b().d());
            objArr[5] = a54.h.a(env.b());
            java.lang.String k17 = env.b().k();
            if (k17 == null) {
                k17 = str3;
            }
            objArr[6] = k17;
            objArr[7] = java.lang.Integer.valueOf(env.b().l());
            optString4 = java.lang.String.format("%s:%s:%s:%s:%d:%s:%s:%d", java.util.Arrays.copyOf(objArr, 8));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "format(...)");
        } else {
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.JumpApp", "h5 sceneNote=".concat(optString4));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2056, 5);
        }
        java.lang.String str6 = optString4;
        java.lang.String c17 = env.b().c();
        java.lang.String D = (c17 == null || c17.length() == 0) ? true : z17 ? ca4.m0.D(a54.h.a(env.b())) : env.b().c();
        java.lang.String m17 = env.b().m();
        if (m17 == null || m17.length() == 0) {
            z17 = true;
        }
        java.lang.String P = z17 ? ca4.m0.P(a54.h.a(env.b())) : env.b().m();
        if (optBoolean && env.b().s()) {
            ca4.z0.p0(env.a(), str4, str5, java.lang.String.valueOf(optInt), D, P, str6, a54.h.a(env.b()), i17 == Integer.MAX_VALUE ? 1200 : i17);
        } else {
            ca4.z0.q0(env.a(), str4, str5, java.lang.String.valueOf(optInt), D, P, str6, a54.h.a(env.b()), i17 == Integer.MAX_VALUE ? 1084 : i17);
        }
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.JumpWeApp");
    }
}

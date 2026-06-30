package uw4;

/* loaded from: classes.dex */
public abstract class u {
    public static final void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, uw4.o forwardClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardClick, "forwardClick");
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Di(context, bottomSheet, 4, null, new uw4.q(forwardClick));
    }

    public static final boolean b(android.content.Context context, java.lang.String sourceUserName, java.lang.String clickUrl, org.json.JSONObject data, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 callback, uw4.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceUserName, "sourceUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickUrl, "clickUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sourceUserName)) {
            callback.a("fail", null);
            return false;
        }
        java.lang.String optString = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = data.optString("img_url");
        java.lang.String optString3 = data.optString("appid");
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(string);
        stringBuffer.append(optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer.toString(), "toString(...)");
        uw4.t tVar = new uw4.t(optString2, context, optString3, sourceUserName, data, pVar, callback);
        uw4.r rVar = new uw4.r(clickUrl, context);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String optString4 = data.optString("img_url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
        hashMap.put("img_url", optString4);
        java.lang.String optString5 = data.optString("desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
        hashMap.put("desc", optString5);
        java.lang.String optString6 = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, optString6);
        java.lang.String optString7 = data.optString("shareUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString7, "optString(...)");
        hashMap.put("url", optString7);
        java.lang.String optString8 = data.optString("src_username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString8, "optString(...)");
        hashMap.put("srcUserName", optString8);
        java.lang.String optString9 = data.optString("src_displayname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
        hashMap.put("srcDisplayname", optString9);
        java.lang.String optString10 = data.optString("appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString10, "optString(...)");
        hashMap.put("appId", optString10);
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f415673a.e(hashMap));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(sourceUserName);
        n13.t tVar2 = new n13.t();
        tVar2.f415666a = tVar;
        tVar2.f415668c = rVar;
        tVar2.f415671f.f415672a = 3;
        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).Ai(context, aVar, arrayList, tVar2);
        return true;
    }
}

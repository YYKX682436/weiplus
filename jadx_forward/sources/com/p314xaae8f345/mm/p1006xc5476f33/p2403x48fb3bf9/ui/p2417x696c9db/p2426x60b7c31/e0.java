package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class e0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e0 f266595d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f266596e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f266597f;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e0();
        f266595d = e0Var;
        cf.b.a(e0Var);
        f266596e = com.p314xaae8f345.mm.vfs.q7.c("luckymoney") + '/';
        f266597f = "23000/wxpaylibpag.wasm";
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        byte[] N;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPackagesResource", "handled, params: " + msg.f422323a);
        java.lang.Object obj = msg.f422323a.get("fromLocale");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        java.lang.Object obj3 = msg.f422323a.get("subtype");
        java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
        java.lang.Object obj5 = msg.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17);
        java.lang.String obj6 = obj5 != null ? obj5.toString() : null;
        boolean z17 = obj2 == null || obj2.length() == 0;
        java.lang.String str2 = f266596e;
        nw4.g gVar = env.f422396d;
        if (z17 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("true", obj2)) {
            if (!(obj4 == null || obj4.length() == 0)) {
                if (!(obj6 == null || obj6.length() == 0)) {
                    str = str2 + obj4 + '/' + obj6;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPackagesResource", "fail：subtype.isNullOrEmpty() || filename.isNullOrEmpty()");
            gVar.e(msg.f422546c, "getPackagesResource:fail invalid subtype or filename", null);
            return true;
        }
        str = str2 + f266597f;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPackagesResource", "getPagFromFile，path：" + str + " fileLength： " + k17);
        if (k17 <= 0 || k17 >= 4194304 || (N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPackagesResource", "fail：no file");
            gVar.e(msg.f422546c, "getPackagesResource:fail no file", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String encodeToString = android.util.Base64.encodeToString(N, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        hashMap.put("file", encodeToString);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPackagesResource", "success：get file");
        gVar.e(msg.f422546c, "getPackagesResource:ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60871x50a06163;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getPackagesResource";
    }
}

package nw4;

/* loaded from: classes.dex */
public final class c3 implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final nw4.c3 f422345b = new nw4.c3();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.Map f422346c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final nw4.m f422347d = new nw4.m();

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!f422346c.containsKey(msg.f422552i)) {
            return false;
        }
        java.lang.Object obj = f422346c.get(msg.f422552i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        qw4.a aVar = (qw4.a) obj;
        int b17 = aVar.b();
        nw4.m mVar = f422347d;
        boolean a17 = mVar.a(b17);
        nw4.g gVar = env.f422396d;
        if (a17) {
            gVar.e(msg.f422546c, "system:too_frequent", null);
            java.lang.Object obj2 = env.f422393a;
            if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) {
                mVar.b(aVar.b(), aVar.c(), ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) obj2)).x7());
            }
            return true;
        }
        int b18 = aVar.b();
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = env.f422394b;
        boolean f17 = c19775x58fd37b3 != null ? c19775x58fd37b3.f(b18) : false;
        if (f17) {
            z17 = aVar.a(env, msg);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJsApiPool", "handleMsg access denied func: " + msg.f422552i);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422552i, "log")) {
                gVar.e(msg.f422546c, "system:access_denied", null);
            }
            z17 = false;
        }
        if (!z17 && aVar.d() && f17) {
            return false;
        }
        java.lang.Object obj3 = env.f422393a;
        if (obj3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) obj3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) w0Var;
            java.lang.String F7 = viewOnCreateContextMenuListenerC19337x37f3384d.F7();
            java.lang.String x76 = viewOnCreateContextMenuListenerC19337x37f3384d.x7();
            java.lang.String stringExtra = w0Var.m74175x1e885992().getStringExtra("srcUsername");
            nw4.e3.f422364b = F7;
            nw4.e3.f422365c = x76;
            nw4.e3.f422366d = stringExtra;
        } else {
            zg0.q2 a18 = env.a();
            if (a18 == null || (str = a18.i()) == null) {
                str = "";
            }
            zg0.q2 a19 = env.a();
            if (a19 == null || (str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a19).Z()) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                str2 = str;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b19 = env.b();
            java.lang.String za6 = b19 != null ? b19.za() : null;
            if (za6 == null) {
                za6 = "";
            }
            nw4.e3.f422364b = str;
            nw4.e3.f422365c = str2;
            nw4.e3.f422366d = za6;
        }
        int d17 = c19775x58fd37b3 != null ? c19775x58fd37b3.d(aVar.b()) : 0;
        java.lang.String str4 = msg.f422552i;
        java.util.Map map = msg.f422551h;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("key_webview_init_url");
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.Object obj5 = ((java.util.HashMap) msg.f422323a).get("key_wxapp_id");
        java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.Object obj6 = ((java.util.HashMap) msg.f422323a).get("key_wxapp_path");
        java.lang.String str7 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        java.lang.String str8 = str7 != null ? str7 : "";
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("isSuccess", java.lang.Boolean.valueOf(z17));
            hashMap.put("report_initUrl", str5);
            hashMap.put("containerEnv", str6);
            hashMap.put("miniProgramPath", str8);
            hashMap.put("permissionValue", java.lang.Integer.valueOf(d17));
        }
        nw4.e3.b(str4, map);
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return f422346c.containsKey(msg.f422552i);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String function) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        if (f422346c.containsKey(function)) {
            return (qw4.a) f422346c.get(function);
        }
        return null;
    }
}

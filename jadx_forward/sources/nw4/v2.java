package nw4;

/* loaded from: classes8.dex */
public class v2 {

    /* renamed from: f, reason: collision with root package name */
    public static int f422520f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f422521g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f422522h = lp0.b.e() + "/jscache/";

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f422523a;

    /* renamed from: b, reason: collision with root package name */
    public nw4.n f422524b;

    /* renamed from: c, reason: collision with root package name */
    public nw4.u2 f422525c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f422526d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f422527e = false;

    public v2(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, nw4.n nVar, nw4.u2 u2Var, boolean z17) {
        this.f422523a = c27816xac2547f9;
        this.f422524b = nVar;
        this.f422525c = u2Var;
        this.f422526d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "JsLoader <init>, jsapi: %d, this: %d", java.lang.Integer.valueOf(nVar.hashCode()), java.lang.Integer.valueOf(hashCode()));
    }

    public static boolean c(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a;
        if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263506b).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "local disableWXJSCodeCache");
            return false;
        }
        if (f422520f == -1) {
            f422520f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_xweb_code_cache, 0);
        }
        if ((f422520f & 1) != 0) {
            return c27816xac2547f9.u(2002);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "auth url: %s", str);
        if (this.f422523a == null || this.f422524b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsLoader", "auth, viewWV or jsapi is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("state", "authorized");
        if (str != null) {
            hashMap.put("fullUrl", str);
        }
        this.f422524b.A0(true);
        this.f422524b.i0("sys:auth", hashMap, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|(5:15|(1:17)|18|(7:20|(3:24|(1:26)|27)|28|29|30|(2:31|(1:33)(1:34))|35)|(2:40|(2:42|43)))|44|45|46|(1:48)|50|43) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0179, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017a, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsLoader", "tryInterceptBridgeScriptRequest, failed, ", r3);
        r6 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw4.v2.b():void");
    }

    public void d() {
        nw4.n nVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        nw4.u2 u2Var;
        if (this.f422523a == null || (nVar = this.f422524b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsLoader", "ready, viewWV or jsapi is null");
            return;
        }
        if (nVar.f422420a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandler", "jsapi init wv is null");
        } else {
            nVar.C0();
            nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("sys:init", null, nVar.f422436q, nVar.f422437r) + ")", new nw4.t0(nVar));
            nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("sys:bridged", null, nVar.f422436q, nVar.f422437r) + ")", new nw4.d1(nVar));
            nVar.A0(true);
            nVar.q();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.M) && (c22633x83752a59 = nVar.f422420a) != null) {
                c22633x83752a59.mo14660x738236e6(nVar.v(nVar.M, nVar.N), null);
                nVar.M = null;
                nVar.N = 0;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "jsapi init done");
        if (nw4.w2.a()) {
            try {
                java.lang.String str = new java.lang.String(s46.d.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("jsapi/vconsole.js")));
                com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f422523a;
                if (c27816xac2547f9 != null) {
                    c27816xac2547f9.mo14660x738236e6(str, null);
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsLoader", e17, "openVConsole", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "onTimerExpired, js loaded ret = %b", java.lang.Boolean.valueOf(this.f422527e));
        if (this.f422527e && (u2Var = this.f422525c) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u2) u2Var).f269080a;
            u3Var.Q(u3Var.f269087g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(156L, 1L, 1L, false);
        if (this.f422527e) {
            return;
        }
        g0Var.mo68477x336bdfd8(156L, 0L, 1L, false);
    }
}

package k03;

/* loaded from: classes10.dex */
public final class e implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f384649e = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f384650d;

    public e(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context != null ? context.getCacheDir() : null);
        sb6.append("/flutter/Pag/");
        java.lang.String sb7 = sb6.toString();
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(this);
        }
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context2);
        this.f384650d = c22789xd23e9a9b;
        c22789xd23e9a9b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (map != null && map.containsKey("pagPath")) {
            java.lang.Object obj = map.get("pagPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            h0Var.f391656d = (java.lang.String) obj;
        }
        if (r26.i0.A((java.lang.String) h0Var.f391656d, "http", false, 2, null)) {
            java.lang.Object obj2 = h0Var.f391656d;
            java.lang.String substring = ((java.lang.String) obj2).substring(r26.n0.O((java.lang.CharSequence) obj2, '/', 0, false, 6, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            java.lang.String str = sb7 + '/' + substring;
            h0Var3.f391656d = str;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.util.Map map2 = f384649e;
            if (!map2.containsKey(h0Var.f391656d)) {
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
                    java.lang.String str3 = a18.f294812f;
                    if (str3 != null) {
                        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                        if (!a18.f294812f.equals(l18)) {
                            a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, null);
                    if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
                        com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a18, m18);
                        if (m19.a()) {
                            m19.f294799a.r(m19.f294800b);
                        }
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new k03.b(h0Var, h0Var3, c28688xe8dbe4c2, h0Var2, this));
                }
            }
            map2.put(h0Var.f391656d, h0Var3.f391656d);
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906((java.lang.String) ((java.util.LinkedHashMap) map2).get(h0Var.f391656d));
            h0Var2.f391656d = m77391x243906;
            c22789xd23e9a9b.mo82566x3e3ac3e8(m77391x243906);
            c22789xd23e9a9b.m82583xcde73672(-1);
            c22789xd23e9a9b.g();
        } else {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77390x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(context != null ? context.getAssets() : null, (java.lang.String) h0Var.f391656d);
            h0Var2.f391656d = m77390x243906;
            c22789xd23e9a9b.mo82566x3e3ac3e8(m77390x243906);
            c22789xd23e9a9b.m82583xcde73672(-1);
            c22789xd23e9a9b.g();
        }
        c22789xd23e9a9b.a(new k03.c(c28688xe8dbe4c2));
        ku5.u0 u0Var = ku5.t0.f394148d;
        k03.d dVar = new k03.d(this, c28688xe8dbe4c2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(dVar, 500L, false);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f384650d;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewAttached */
    public void mo65795x5e3a4146(android.view.View p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewDetached */
    public void mo65796x7c604f14() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onInputConnectionLocked */
    public void mo65797x6ba43ad3() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onInputConnectionUnlocked */
    public void mo65798x9518646c() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(methodCall.f71610xbfc5d0e1, "sendJSEvent") || (str = (java.lang.String) methodCall.m138433xa13f5ebd(ya.b.f77491x8758c4e1)) == null) {
            return;
        }
        int hashCode = str.hashCode();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f384650d;
        if (hashCode == -1443414873) {
            if (str.equals("pagSetRepeat")) {
                java.util.Map map = (java.util.Map) methodCall.m138433xa13f5ebd("params");
                java.lang.Object obj = map != null ? map.get("repeatCount") : null;
                if (c22789xd23e9a9b != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    c22789xd23e9a9b.m82583xcde73672(((java.lang.Integer) obj).intValue());
                    return;
                }
                return;
            }
            return;
        }
        if (hashCode == -804162326) {
            if (str.equals("pagPlay") && c22789xd23e9a9b != null) {
                c22789xd23e9a9b.g();
                return;
            }
            return;
        }
        if (hashCode == -804064840 && str.equals("pagStop") && c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
    }
}

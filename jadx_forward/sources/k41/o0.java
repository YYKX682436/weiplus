package k41;

/* loaded from: classes11.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k41.o0 f385564a = new k41.o0();

    /* renamed from: b, reason: collision with root package name */
    public static final k41.h0 f385565b;

    /* renamed from: c, reason: collision with root package name */
    public static final kk.j f385566c;

    /* renamed from: d, reason: collision with root package name */
    public static final kk.j f385567d;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f385565b = new k41.h0();
        f385566c = new jt0.j(20);
        f385567d = new jt0.j(20);
    }

    public static final k41.k0 b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuContactLogic", "kefuCard getCardContent content null");
            return null;
        }
        kk.j jVar = f385567d;
        k41.k0 k0Var = (k41.k0) ((lt0.f) jVar).get(java.lang.Integer.valueOf(str.hashCode()));
        if (k0Var != null) {
            return k0Var;
        }
        k41.k0 a17 = k41.k0.f385549h.a(str);
        if (a17 != null) {
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(str.hashCode()), a17);
        }
        return a17;
    }

    public static final k41.g0 c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        k41.h0 h0Var = f385565b;
        k41.g0 a17 = h0Var.a(str);
        if (a17 != null) {
            return a17;
        }
        k41.r0 Di = ((i41.l) i95.n0.c(i41.l.class)).Di();
        k41.g0 y07 = Di != null ? Di.y0(str) : null;
        if (y07 != null) {
            f385564a.h(y07.f68613xdec927b, y07);
        }
        return h0Var.a(str);
    }

    public static final k41.g0 d(java.lang.String str) {
        k41.g0 g0Var;
        boolean z17 = false;
        k41.g0 g0Var2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        k41.o0 o0Var = f385564a;
        java.lang.String g17 = o0Var.g(str);
        k41.h0 h0Var = f385565b;
        k41.g0 a17 = h0Var.a(g17);
        if (a17 != null) {
            return a17;
        }
        k41.r0 Di = ((i41.l) i95.n0.c(i41.l.class)).Di();
        if (Di != null) {
            android.database.Cursor f17 = Di.f385573d.f("SELECT *, rowid FROM OpenIMKefuContact WHERE kfUrl = " + d95.b0.O(g17), null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        z17 = true;
                    }
                } finally {
                }
            }
            if (z17) {
                g0Var = new k41.g0();
                g0Var.mo9015xbf5d97fd(f17);
                g0Var.f385530x1 = g0Var.f72763xa3c65b86;
                g0Var.f385529p1 = true;
            } else {
                g0Var = null;
            }
            vz5.b.a(f17, null);
            g0Var2 = g0Var;
        }
        if (g0Var2 != null) {
            o0Var.h(g17, g0Var2);
        }
        return h0Var.a(g17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (r7 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r2 > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(k41.g0 r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k41.o0.f(k41.g0):boolean");
    }

    public final k41.g0 a(java.lang.String str, r45.h05 h05Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (h05Var == null) {
            return null;
        }
        k41.g0 c17 = c(h05Var.f457247d);
        if (c17 == null) {
            c17 = new k41.g0();
        }
        c17.f68613xdec927b = h05Var.f457247d;
        c17.f68604x21f9b213 = h05Var.f457248e;
        c17.f68592x6b8eb508 = h05Var.f457249f;
        c17.f68609x68aa51e1 = h05Var.f457250g;
        c17.f68605x94d23eac = h05Var.f457251h;
        c17.f68606x311cbb68 = h05Var.f457252i;
        c17.f68607xd03b1ae9 = h05Var.f457253m;
        c17.f68608x1223b30f = h05Var.f457254n;
        c17.f68610x10639700 = h05Var.f457255o;
        c17.f68593xb26012f0 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        r45.b05 b05Var = h05Var.f457256p;
        if (b05Var == null || (str2 = b05Var.f451929e) == null) {
            str2 = "";
        }
        c17.f68594x6090d195 = str2;
        boolean z17 = false;
        c17.f68595xa82bb51d = b05Var != null ? b05Var.f451928d : 0;
        java.lang.String str4 = h05Var.f457257q;
        if (str4 == null) {
            str4 = "";
        }
        c17.f68611x11bb99f1 = str4;
        r45.m05 m05Var = h05Var.f457258r;
        c17.f68612x2262335f = m05Var != null ? m05Var.f461580d : 0L;
        java.lang.String str5 = h05Var.f457259s;
        c17.f68597x553a5901 = str5 != null ? str5 : "";
        java.lang.String str6 = h05Var.f457247d;
        c17.f385529p1 = !(str6 == null || str6.length() == 0);
        r45.m05 m05Var2 = h05Var.f457258r;
        long j17 = m05Var2.f461580d;
        c17.f68603x672cb5cf = (j17 & 8589934592L) == 8589934592L;
        c17.f68598xec0735e1 = (j17 & 4294967296L) == 4294967296L;
        r45.hd4 hd4Var = m05Var2.f461581e;
        if (hd4Var == null || (str3 = hd4Var.f457601e) == null) {
            str3 = "wgs84";
        }
        c17.f68602x8b26fb4 = str3;
        c17.f68600x1c5d3c28 = h05Var.f457260t;
        c17.f68599x8b8174fb = h05Var.f457261u;
        c17.f68596xef220f70 = h05Var.f457262v;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            c17.f68601x295c5e8f = f385564a.g(str);
        }
        return c17;
    }

    public final void e(k41.g0 g0Var) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        if (g0Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuContactLogic", "processGetContact openImKefuContact " + g0Var.t0());
        f(g0Var);
        java.lang.String str3 = g0Var.f68613xdec927b;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str3);
        if (n07 != null) {
            str = n07.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBigUrl(...)");
            str2 = n07.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getSmallUrl(...)");
        } else {
            str = "";
            str2 = "";
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        r0Var.f152070i = -1;
        r0Var.f152062a = str3;
        r0Var.f152065d = g0Var.f68609x68aa51e1;
        r0Var.f152066e = g0Var.f68592x6b8eb508;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuContactLogic", "dealWithAvatarFromGetContactResp contact %s b[%s] s[%s]", r0Var.e(), r0Var.c(), r0Var.d());
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0Var.c(), str);
        boolean z18 = true;
        if (b17) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str3, true);
            z17 = true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0Var.d(), str2)) {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str3, false);
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
            com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str3);
        }
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(g0Var.f68607xd03b1ae9, g0Var.f68608x1223b30f, 0);
        java.lang.String str4 = g0Var.f68613xdec927b;
        if (str4 != null && str4.length() != 0) {
            z18 = false;
        }
        if (z18) {
            return;
        }
        u41.g gVar = new u41.g();
        gVar.f68493x315f5dc9 = g0Var.f68613xdec927b;
        gVar.f68492xbb25cf8a = g0Var.f68597x553a5901;
        ((i41.l) i95.n0.c(i41.l.class)).Ni().mo11260x413cb2b4(gVar);
    }

    public final java.lang.String g(java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = parse.getScheme() + "://" + parse.getHost() + '/' + parse.getPath();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuContactLogic", "trimKfUrl %s", str2);
        return str2;
    }

    public final void h(java.lang.String key, k41.g0 contact) {
        if (key == null || key.length() == 0) {
            return;
        }
        k41.h0 h0Var = f385565b;
        h0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        ((lt0.f) h0Var.f385539a).j(key, contact);
        ((lt0.f) f385566c).j(key, contact.u0());
    }
}

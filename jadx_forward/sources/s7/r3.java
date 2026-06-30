package s7;

/* loaded from: classes16.dex */
public class r3 {

    /* renamed from: d, reason: collision with root package name */
    public int f485350d;

    /* renamed from: a, reason: collision with root package name */
    public s7.t2 f485347a = null;

    /* renamed from: b, reason: collision with root package name */
    public s7.w1 f485348b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f485349c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f485351e = false;

    /* renamed from: f, reason: collision with root package name */
    public s7.o3 f485352f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.StringBuilder f485353g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f485354h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.StringBuilder f485355i = null;

    public static s7.b2 A(java.lang.String str) {
        if (!str.startsWith("url(")) {
            return q(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new s7.y0(str.substring(4).trim(), null);
        }
        java.lang.String trim = str.substring(4, indexOf).trim();
        java.lang.String trim2 = str.substring(indexOf + 1).trim();
        return new s7.y0(trim, trim2.length() > 0 ? q(trim2) : null);
    }

    public static void B(s7.c2 c2Var, java.lang.String str) {
        s7.b0 b0Var;
        s7.p3 p3Var = new s7.p3(str);
        p3Var.q();
        java.lang.String l17 = p3Var.l();
        if ("defer".equals(l17)) {
            p3Var.q();
            l17 = p3Var.l();
        }
        s7.a0 a0Var = (s7.a0) ((java.util.HashMap) s7.i3.f485216a).get(l17);
        p3Var.q();
        if (p3Var.f()) {
            b0Var = null;
        } else {
            java.lang.String l18 = p3Var.l();
            l18.getClass();
            if (l18.equals("meet")) {
                b0Var = s7.b0.meet;
            } else {
                if (!l18.equals("slice")) {
                    throw new s7.g3("Invalid preserveAspectRatio definition: ".concat(str));
                }
                b0Var = s7.b0.slice;
            }
        }
        c2Var.f485150n = new s7.c0(a0Var, b0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void H(s7.r1 r1Var, java.lang.String str, java.lang.String str2) {
        char c17;
        java.lang.Boolean bool;
        char c18;
        s7.n1 n1Var;
        char c19;
        s7.o1 o1Var;
        s7.t0 t0Var;
        s7.t0 t0Var2;
        java.lang.String substring;
        char c27;
        s7.m1 m1Var;
        s7.t0[] t0VarArr;
        s7.t0 j17;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int ordinal = s7.n3.a(str).ordinal();
        if (ordinal == 1) {
            s7.g0 g0Var = null;
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                s7.p3 p3Var = new s7.p3(str2.substring(5));
                p3Var.q();
                s7.t0 y17 = y(p3Var);
                p3Var.p();
                s7.t0 y18 = y(p3Var);
                p3Var.p();
                s7.t0 y19 = y(p3Var);
                p3Var.p();
                s7.t0 y27 = y(p3Var);
                p3Var.q();
                if (p3Var.d(')') || p3Var.f()) {
                    g0Var = new s7.g0(y17, y18, y19, y27);
                }
            }
            s7.g0 g0Var2 = g0Var;
            r1Var.C = g0Var2;
            if (g0Var2 != null) {
                r1Var.f485322d |= 1048576;
                return;
            }
            return;
        }
        if (ordinal == 2) {
            r1Var.K = v(str2, str);
            r1Var.f485322d |= 268435456;
            return;
        }
        s7.i1 i1Var = s7.i1.EvenOdd;
        s7.i1 i1Var2 = s7.i1.NonZero;
        if (ordinal == 4) {
            r1Var.L = "nonzero".equals(str2) ? i1Var2 : "evenodd".equals(str2) ? i1Var : null;
            r1Var.f485322d |= 536870912;
            return;
        }
        try {
            if (ordinal == 5) {
                r1Var.f485335t = p(str2);
                r1Var.f485322d |= 4096;
                return;
            }
            if (ordinal == 8) {
                s7.p1 p1Var = !str2.equals("ltr") ? !str2.equals("rtl") ? null : s7.p1.RTL : s7.p1.LTR;
                r1Var.f485341z = p1Var;
                if (p1Var != null) {
                    r1Var.f485322d |= 68719476736L;
                    return;
                }
                return;
            }
            if (ordinal == 35) {
                r1Var.M = v(str2, str);
                r1Var.f485322d |= 1073741824;
                return;
            }
            if (ordinal == 40) {
                r1Var.f485334s = z(str2);
                r1Var.f485322d |= 2048;
                return;
            }
            if (ordinal == 42) {
                switch (str2.hashCode()) {
                    case -1217487446:
                        if (str2.equals("hidden")) {
                            c17 = 0;
                            break;
                        }
                        c17 = 65535;
                        break;
                    case -907680051:
                        if (str2.equals("scroll")) {
                            c17 = 1;
                            break;
                        }
                        c17 = 65535;
                        break;
                    case 3005871:
                        if (str2.equals("auto")) {
                            c17 = 2;
                            break;
                        }
                        c17 = 65535;
                        break;
                    case 466743410:
                        if (str2.equals("visible")) {
                            c17 = 3;
                            break;
                        }
                        c17 = 65535;
                        break;
                    default:
                        c17 = 65535;
                        break;
                }
                switch (c17) {
                    case 0:
                    case 1:
                        bool = java.lang.Boolean.FALSE;
                        break;
                    case 2:
                    case 3:
                        bool = java.lang.Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                r1Var.B = bool;
                if (bool != null) {
                    r1Var.f485322d |= 524288;
                    return;
                }
                return;
            }
            if (ordinal == 78) {
                s7.q1 q1Var = !str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc) ? !str2.equals("non-scaling-stroke") ? null : s7.q1.NonScalingStroke : s7.q1.None;
                r1Var.S = q1Var;
                if (q1Var != null) {
                    r1Var.f485322d |= 34359738368L;
                    return;
                }
                return;
            }
            s7.k0 k0Var = s7.k0.f485231d;
            if (ordinal == 58) {
                if (str2.equals("currentColor")) {
                    r1Var.N = k0Var;
                } else {
                    try {
                        r1Var.N = p(str2);
                    } catch (s7.g3 e17) {
                        e17.getMessage();
                        return;
                    }
                }
                r1Var.f485322d |= 2147483648L;
                return;
            }
            if (ordinal == 59) {
                r1Var.P = z(str2);
                r1Var.f485322d |= 4294967296L;
                return;
            }
            if (ordinal == 74) {
                switch (str2.hashCode()) {
                    case -1074341483:
                        if (str2.equals("middle")) {
                            c18 = 0;
                            break;
                        }
                        c18 = 65535;
                        break;
                    case 100571:
                        if (str2.equals("end")) {
                            c18 = 1;
                            break;
                        }
                        c18 = 65535;
                        break;
                    case 109757538:
                        if (str2.equals("start")) {
                            c18 = 2;
                            break;
                        }
                        c18 = 65535;
                        break;
                    default:
                        c18 = 65535;
                        break;
                }
                switch (c18) {
                    case 0:
                        n1Var = s7.n1.Middle;
                        break;
                    case 1:
                        n1Var = s7.n1.End;
                        break;
                    case 2:
                        n1Var = s7.n1.Start;
                        break;
                    default:
                        n1Var = null;
                        break;
                }
                r1Var.A = n1Var;
                if (n1Var != null) {
                    r1Var.f485322d |= 262144;
                    return;
                }
                return;
            }
            if (ordinal == 75) {
                switch (str2.hashCode()) {
                    case -1171789332:
                        if (str2.equals("line-through")) {
                            c19 = 0;
                            break;
                        }
                        c19 = 65535;
                        break;
                    case -1026963764:
                        if (str2.equals("underline")) {
                            c19 = 1;
                            break;
                        }
                        c19 = 65535;
                        break;
                    case 3387192:
                        if (str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
                            c19 = 2;
                            break;
                        }
                        c19 = 65535;
                        break;
                    case 93826908:
                        if (str2.equals("blink")) {
                            c19 = 3;
                            break;
                        }
                        c19 = 65535;
                        break;
                    case 529818312:
                        if (str2.equals("overline")) {
                            c19 = 4;
                            break;
                        }
                        c19 = 65535;
                        break;
                    default:
                        c19 = 65535;
                        break;
                }
                switch (c19) {
                    case 0:
                        o1Var = s7.o1.LineThrough;
                        break;
                    case 1:
                        o1Var = s7.o1.Underline;
                        break;
                    case 2:
                        o1Var = s7.o1.None;
                        break;
                    case 3:
                        o1Var = s7.o1.Blink;
                        break;
                    case 4:
                        o1Var = s7.o1.Overline;
                        break;
                    default:
                        o1Var = null;
                        break;
                }
                r1Var.f485340y = o1Var;
                if (o1Var != null) {
                    r1Var.f485322d |= 131072;
                    return;
                }
                return;
            }
            switch (ordinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            r1Var.G = java.lang.Boolean.valueOf(!str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc));
                            r1Var.f485322d |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 15:
                    s7.b2 A = A(str2);
                    r1Var.f485323e = A;
                    if (A != null) {
                        r1Var.f485322d |= 1;
                        return;
                    }
                    return;
                case 16:
                    s7.i1 i1Var3 = "nonzero".equals(str2) ? i1Var2 : "evenodd".equals(str2) ? i1Var : null;
                    r1Var.f485324f = i1Var3;
                    if (i1Var3 != null) {
                        r1Var.f485322d |= 2;
                        return;
                    }
                    return;
                case 17:
                    java.lang.Float z17 = z(str2);
                    r1Var.f485325g = z17;
                    if (z17 != null) {
                        r1Var.f485322d |= 4;
                        return;
                    }
                    return;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        s7.p3 p3Var2 = new s7.p3(str2);
                        java.lang.Integer num = null;
                        s7.j1 j1Var = null;
                        java.lang.String str3 = null;
                        while (true) {
                            java.lang.String m17 = p3Var2.m('/', false);
                            p3Var2.q();
                            if (m17 == null) {
                                return;
                            }
                            if (num == null || j1Var == null) {
                                if (!m17.equals("normal") && (num != null || (num = (java.lang.Integer) ((java.util.HashMap) s7.l3.f485247a).get(m17)) == null)) {
                                    if (j1Var != null || (j1Var = u(m17)) == null) {
                                        if (str3 == null && m17.equals("small-caps")) {
                                            str3 = m17;
                                        }
                                    }
                                }
                            }
                            try {
                                t0Var2 = (s7.t0) ((java.util.HashMap) s7.k3.f485236a).get(m17);
                                if (t0Var2 == null) {
                                    t0Var2 = w(m17);
                                }
                            } catch (s7.g3 unused) {
                                t0Var2 = null;
                            }
                            if (p3Var2.d('/')) {
                                p3Var2.q();
                                java.lang.String l17 = p3Var2.l();
                                if (l17 != null) {
                                    w(l17);
                                }
                                p3Var2.q();
                            }
                            if (p3Var2.f()) {
                                substring = null;
                            } else {
                                int i17 = p3Var2.f485304b;
                                p3Var2.f485304b = p3Var2.f485305c;
                                substring = p3Var2.f485303a.substring(i17);
                            }
                            r1Var.f485336u = t(substring);
                            r1Var.f485337v = t0Var2;
                            r1Var.f485338w = java.lang.Integer.valueOf(num == null ? 400 : num.intValue());
                            if (j1Var == null) {
                                j1Var = s7.j1.Normal;
                            }
                            r1Var.f485339x = j1Var;
                            r1Var.f485322d |= 122880;
                            return;
                        }
                    }
                    return;
                case 19:
                    java.util.List t17 = t(str2);
                    r1Var.f485336u = t17;
                    if (t17 != null) {
                        r1Var.f485322d |= 8192;
                        return;
                    }
                    return;
                case 20:
                    try {
                        s7.t0 t0Var3 = (s7.t0) ((java.util.HashMap) s7.k3.f485236a).get(str2);
                        if (t0Var3 == null) {
                            t0Var3 = w(str2);
                        }
                        t0Var = t0Var3;
                    } catch (s7.g3 unused2) {
                        t0Var = null;
                    }
                    r1Var.f485337v = t0Var;
                    if (t0Var != null) {
                        r1Var.f485322d |= 16384;
                        return;
                    }
                    return;
                case 21:
                    java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) s7.l3.f485247a).get(str2);
                    r1Var.f485338w = num2;
                    if (num2 != null) {
                        r1Var.f485322d |= 32768;
                        return;
                    }
                    return;
                case 22:
                    s7.j1 u17 = u(str2);
                    r1Var.f485339x = u17;
                    if (u17 != null) {
                        r1Var.f485322d |= 65536;
                        return;
                    }
                    return;
                default:
                    switch (ordinal) {
                        case 27:
                            switch (str2.hashCode()) {
                                case -933002398:
                                    if (str2.equals("optimizeQuality")) {
                                        c27 = 0;
                                        break;
                                    }
                                    c27 = 65535;
                                    break;
                                case 3005871:
                                    if (str2.equals("auto")) {
                                        c27 = 1;
                                        break;
                                    }
                                    c27 = 65535;
                                    break;
                                case 362741610:
                                    if (str2.equals("optimizeSpeed")) {
                                        c27 = 2;
                                        break;
                                    }
                                    c27 = 65535;
                                    break;
                                default:
                                    c27 = 65535;
                                    break;
                            }
                            switch (c27) {
                                case 0:
                                    m1Var = s7.m1.optimizeQuality;
                                    break;
                                case 1:
                                    m1Var = s7.m1.auto;
                                    break;
                                case 2:
                                    m1Var = s7.m1.optimizeSpeed;
                                    break;
                                default:
                                    m1Var = null;
                                    break;
                            }
                            r1Var.T = m1Var;
                            if (m1Var != null) {
                                r1Var.f485322d |= 137438953472L;
                                return;
                            }
                            return;
                        case 28:
                            java.lang.String v17 = v(str2, str);
                            r1Var.D = v17;
                            r1Var.E = v17;
                            r1Var.F = v17;
                            r1Var.f485322d |= 14680064;
                            return;
                        case 29:
                            r1Var.D = v(str2, str);
                            r1Var.f485322d |= 2097152;
                            return;
                        case 30:
                            r1Var.E = v(str2, str);
                            r1Var.f485322d |= 4194304;
                            return;
                        case 31:
                            r1Var.F = v(str2, str);
                            r1Var.f485322d |= 8388608;
                            return;
                        default:
                            switch (ordinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        r1Var.I = k0Var;
                                    } else {
                                        try {
                                            r1Var.I = p(str2);
                                        } catch (s7.g3 e18) {
                                            e18.getMessage();
                                            return;
                                        }
                                    }
                                    r1Var.f485322d |= 67108864;
                                    return;
                                case 63:
                                    r1Var.f485321J = z(str2);
                                    r1Var.f485322d |= 134217728;
                                    return;
                                case 64:
                                    s7.b2 A2 = A(str2);
                                    r1Var.f485326h = A2;
                                    if (A2 != null) {
                                        r1Var.f485322d |= 8;
                                        return;
                                    }
                                    return;
                                case 65:
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc.equals(str2)) {
                                        r1Var.f485332q = null;
                                        r1Var.f485322d |= 512;
                                        return;
                                    }
                                    s7.p3 p3Var3 = new s7.p3(str2);
                                    p3Var3.q();
                                    if (!p3Var3.f() && (j17 = p3Var3.j()) != null && !j17.f()) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(j17);
                                        float f17 = j17.f485367d;
                                        while (true) {
                                            if (!p3Var3.f()) {
                                                p3Var3.p();
                                                s7.t0 j18 = p3Var3.j();
                                                if (j18 != null && !j18.f()) {
                                                    arrayList.add(j18);
                                                    f17 += j18.f485367d;
                                                }
                                            } else if (f17 != 0.0f) {
                                                t0VarArr = (s7.t0[]) arrayList.toArray(new s7.t0[arrayList.size()]);
                                            }
                                        }
                                    }
                                    t0VarArr = null;
                                    r1Var.f485332q = t0VarArr;
                                    if (t0VarArr != null) {
                                        r1Var.f485322d |= 512;
                                        return;
                                    }
                                    return;
                                case 66:
                                    r1Var.f485333r = w(str2);
                                    r1Var.f485322d |= 1024;
                                    return;
                                case 67:
                                    s7.k1 k1Var = "butt".equals(str2) ? s7.k1.Butt : "round".equals(str2) ? s7.k1.Round : "square".equals(str2) ? s7.k1.Square : null;
                                    r1Var.f485329n = k1Var;
                                    if (k1Var != null) {
                                        r1Var.f485322d |= 64;
                                        return;
                                    }
                                    return;
                                case 68:
                                    s7.l1 l1Var = "miter".equals(str2) ? s7.l1.Miter : "round".equals(str2) ? s7.l1.Round : "bevel".equals(str2) ? s7.l1.Bevel : null;
                                    r1Var.f485330o = l1Var;
                                    if (l1Var != null) {
                                        r1Var.f485322d |= 128;
                                        return;
                                    }
                                    return;
                                case 69:
                                    r1Var.f485331p = java.lang.Float.valueOf(r(str2));
                                    r1Var.f485322d |= 256;
                                    return;
                                case 70:
                                    java.lang.Float z18 = z(str2);
                                    r1Var.f485327i = z18;
                                    if (z18 != null) {
                                        r1Var.f485322d |= 16;
                                        return;
                                    }
                                    return;
                                case 71:
                                    r1Var.f485328m = w(str2);
                                    r1Var.f485322d |= 32;
                                    return;
                                default:
                                    switch (ordinal) {
                                        case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                                            if (str2.equals("currentColor")) {
                                                r1Var.Q = k0Var;
                                            } else {
                                                try {
                                                    r1Var.Q = p(str2);
                                                } catch (s7.g3 e19) {
                                                    e19.getMessage();
                                                    return;
                                                }
                                            }
                                            r1Var.f485322d |= 8589934592L;
                                            return;
                                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                                            r1Var.R = z(str2);
                                            r1Var.f485322d |= 17179869184L;
                                            return;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    r1Var.H = java.lang.Boolean.valueOf(str2.equals("visible"));
                                                    r1Var.f485322d |= 33554432;
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        } catch (s7.g3 unused3) {
        }
    }

    public static int b(float f17) {
        if (f17 < 0.0f) {
            return 0;
        }
        if (f17 > 255.0f) {
            return 255;
        }
        return java.lang.Math.round(f17);
    }

    public static int d(float f17, float f18, float f19) {
        float f27 = f17 % 360.0f;
        if (f17 < 0.0f) {
            f27 += 360.0f;
        }
        float f28 = f27 / 60.0f;
        float f29 = f18 / 100.0f;
        float f37 = f19 / 100.0f;
        if (f29 < 0.0f) {
            f29 = 0.0f;
        } else if (f29 > 1.0f) {
            f29 = 1.0f;
        }
        float f38 = f37 >= 0.0f ? f37 > 1.0f ? 1.0f : f37 : 0.0f;
        float f39 = f38 <= 0.5f ? (f29 + 1.0f) * f38 : (f38 + f29) - (f29 * f38);
        float f47 = (f38 * 2.0f) - f39;
        return b(e(f47, f39, f28 - 2.0f) * 256.0f) | (b(e(f47, f39, f28 + 2.0f) * 256.0f) << 16) | (b(e(f47, f39, f28) * 256.0f) << 8);
    }

    public static float e(float f17, float f18, float f19) {
        float f27;
        if (f19 < 0.0f) {
            f19 += 6.0f;
        }
        if (f19 >= 6.0f) {
            f19 -= 6.0f;
        }
        if (f19 < 1.0f) {
            f27 = (f18 - f17) * f19;
        } else {
            if (f19 < 3.0f) {
                return f18;
            }
            if (f19 >= 4.0f) {
                return f17;
            }
            f27 = (f18 - f17) * (4.0f - f19);
        }
        return f27 + f17;
    }

    public static s7.j0 p(java.lang.String str) {
        long j17;
        int i17;
        long j18;
        long j19;
        if (str.charAt(0) == '#') {
            int length = str.length();
            s7.y yVar = null;
            if (1 < length) {
                long j27 = 0;
                int i18 = 1;
                while (i18 < length) {
                    char charAt = str.charAt(i18);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j17 = j27 * 16;
                            i17 = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j17 = j27 * 16;
                            i17 = charAt - 'a';
                        }
                        j18 = j17 + i17;
                        j19 = 10;
                    } else {
                        j18 = j27 * 16;
                        j19 = charAt - '0';
                    }
                    j27 = j18 + j19;
                    if (j27 > io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) {
                        break;
                    }
                    i18++;
                }
                if (i18 != 1) {
                    yVar = new s7.y(j27, i18);
                }
            }
            if (yVar == null) {
                throw new s7.g3("Bad hex colour value: ".concat(str));
            }
            long j28 = yVar.f485428b;
            int i19 = yVar.f485427a;
            if (i19 == 4) {
                int i27 = (int) j28;
                int i28 = i27 & 3840;
                int i29 = i27 & 240;
                int i37 = i27 & 15;
                return new s7.j0(i37 | (i28 << 8) | (-16777216) | (i28 << 12) | (i29 << 8) | (i29 << 4) | (i37 << 4));
            }
            if (i19 != 5) {
                if (i19 == 7) {
                    return new s7.j0(((int) j28) | (-16777216));
                }
                if (i19 == 9) {
                    return new s7.j0((((int) j28) << 24) | (((int) j28) >>> 8));
                }
                throw new s7.g3("Bad hex colour value: ".concat(str));
            }
            int i38 = (int) j28;
            int i39 = 61440 & i38;
            int i47 = i38 & 3840;
            int i48 = i38 & 240;
            int i49 = i38 & 15;
            return new s7.j0((i49 << 24) | (i49 << 28) | (i39 << 8) | (i39 << 4) | (i47 << 4) | i47 | i48 | (i48 >> 4));
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            s7.p3 p3Var = new s7.p3(str.substring(startsWith ? 5 : 4));
            p3Var.q();
            float i57 = p3Var.i();
            if (!java.lang.Float.isNaN(i57) && p3Var.d('%')) {
                i57 = (i57 * 256.0f) / 100.0f;
            }
            float c17 = p3Var.c(i57);
            if (!java.lang.Float.isNaN(c17) && p3Var.d('%')) {
                c17 = (c17 * 256.0f) / 100.0f;
            }
            float c18 = p3Var.c(c17);
            if (!java.lang.Float.isNaN(c18) && p3Var.d('%')) {
                c18 = (c18 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                p3Var.q();
                if (java.lang.Float.isNaN(c18) || !p3Var.d(')')) {
                    throw new s7.g3("Bad rgb() colour value: ".concat(str));
                }
                return new s7.j0((b(i57) << 16) | (-16777216) | (b(c17) << 8) | b(c18));
            }
            float c19 = p3Var.c(c18);
            p3Var.q();
            if (java.lang.Float.isNaN(c19) || !p3Var.d(')')) {
                throw new s7.g3("Bad rgba() colour value: ".concat(str));
            }
            return new s7.j0((b(c19 * 256.0f) << 24) | (b(i57) << 16) | (b(c17) << 8) | b(c18));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) s7.j3.f485230a).get(lowerCase);
            if (num != null) {
                return new s7.j0(num.intValue());
            }
            throw new s7.g3("Invalid colour keyword: ".concat(lowerCase));
        }
        s7.p3 p3Var2 = new s7.p3(str.substring(startsWith2 ? 5 : 4));
        p3Var2.q();
        float i58 = p3Var2.i();
        float c27 = p3Var2.c(i58);
        if (!java.lang.Float.isNaN(c27)) {
            p3Var2.d('%');
        }
        float c28 = p3Var2.c(c27);
        if (!java.lang.Float.isNaN(c28)) {
            p3Var2.d('%');
        }
        if (!startsWith2) {
            p3Var2.q();
            if (java.lang.Float.isNaN(c28) || !p3Var2.d(')')) {
                throw new s7.g3("Bad hsl() colour value: ".concat(str));
            }
            return new s7.j0(d(i58, c27, c28) | (-16777216));
        }
        float c29 = p3Var2.c(c28);
        p3Var2.q();
        if (java.lang.Float.isNaN(c29) || !p3Var2.d(')')) {
            throw new s7.g3("Bad hsla() colour value: ".concat(str));
        }
        return new s7.j0((b(c29 * 256.0f) << 24) | d(i58, c27, c28));
    }

    public static s7.b2 q(java.lang.String str) {
        str.getClass();
        if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
            return s7.j0.f485223f;
        }
        if (str.equals("currentColor")) {
            return s7.k0.f485231d;
        }
        try {
            return p(str);
        } catch (s7.g3 unused) {
            return null;
        }
    }

    public static float r(java.lang.String str) {
        int length = str.length();
        if (length != 0) {
            return s(str, 0, length);
        }
        throw new s7.g3("Invalid float value (empty string)");
    }

    public static float s(java.lang.String str, int i17, int i18) {
        float a17 = new s7.z().a(str, i17, i18);
        if (!java.lang.Float.isNaN(a17)) {
            return a17;
        }
        throw new s7.g3("Invalid float value: " + str);
    }

    public static java.util.List t(java.lang.String str) {
        s7.p3 p3Var = new s7.p3(str);
        java.util.ArrayList arrayList = null;
        do {
            java.lang.String k17 = p3Var.k();
            if (k17 == null) {
                k17 = p3Var.m(',', true);
            }
            if (k17 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(k17);
            p3Var.p();
        } while (!p3Var.f());
        return arrayList;
    }

    public static s7.j1 u(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1178781136:
                if (str.equals("italic")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return s7.j1.Oblique;
            case 1:
                return s7.j1.Italic;
            case 2:
                return s7.j1.Normal;
            default:
                return null;
        }
    }

    public static java.lang.String v(java.lang.String str, java.lang.String str2) {
        if (!str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static s7.t0 w(java.lang.String str) {
        if (str.length() == 0) {
            throw new s7.g3("Invalid length value (empty string)");
        }
        int length = str.length();
        s7.q2 q2Var = s7.q2.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            q2Var = s7.q2.percent;
        } else if (length > 2 && java.lang.Character.isLetter(charAt) && java.lang.Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                q2Var = s7.q2.m164022xdce0328(str.substring(length).toLowerCase(java.util.Locale.US));
            } catch (java.lang.IllegalArgumentException unused) {
                throw new s7.g3("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new s7.t0(s(str, 0, length), q2Var);
        } catch (java.lang.NumberFormatException e17) {
            throw new s7.g3("Invalid length value: ".concat(str), e17);
        }
    }

    public static java.util.List x(java.lang.String str) {
        java.lang.String str2;
        if (str.length() == 0) {
            throw new s7.g3("Invalid length list (empty string)");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        s7.p3 p3Var = new s7.p3(str);
        p3Var.q();
        while (!p3Var.f()) {
            float i17 = p3Var.i();
            if (java.lang.Float.isNaN(i17)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invalid length list value: ");
                int i18 = p3Var.f485304b;
                while (true) {
                    boolean f17 = p3Var.f();
                    str2 = p3Var.f485303a;
                    if (f17 || p3Var.g(str2.charAt(p3Var.f485304b))) {
                        break;
                    }
                    p3Var.f485304b++;
                }
                java.lang.String substring = str2.substring(i18, p3Var.f485304b);
                p3Var.f485304b = i18;
                sb6.append(substring);
                throw new s7.g3(sb6.toString());
            }
            s7.q2 n17 = p3Var.n();
            if (n17 == null) {
                n17 = s7.q2.px;
            }
            arrayList.add(new s7.t0(i17, n17));
            p3Var.p();
        }
        return arrayList;
    }

    public static s7.t0 y(s7.p3 p3Var) {
        return p3Var.e("auto") ? new s7.t0(0.0f) : p3Var.j();
    }

    public static java.lang.Float z(java.lang.String str) {
        try {
            float r17 = r(str);
            float f17 = 0.0f;
            if (r17 >= 0.0f) {
                f17 = 1.0f;
                if (r17 > 1.0f) {
                }
                return java.lang.Float.valueOf(r17);
            }
            r17 = f17;
            return java.lang.Float.valueOf(r17);
        } catch (s7.g3 unused) {
            return null;
        }
    }

    public final java.util.Map C(s7.p3 p3Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        p3Var.q();
        java.lang.String m17 = p3Var.m('=', false);
        while (m17 != null) {
            p3Var.d('=');
            hashMap.put(m17, p3Var.k());
            p3Var.q();
            m17 = p3Var.m('=', false);
        }
        return hashMap;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0064. Please report as an issue. */
    public final android.graphics.Matrix D(java.lang.String str) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        s7.p3 p3Var = new s7.p3(str);
        p3Var.q();
        while (!p3Var.f()) {
            java.lang.String str2 = null;
            if (!p3Var.f()) {
                int i17 = p3Var.f485304b;
                java.lang.String str3 = p3Var.f485303a;
                int charAt = str3.charAt(i17);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = p3Var.a();
                    }
                }
                int i18 = p3Var.f485304b;
                while (p3Var.g(charAt)) {
                    charAt = p3Var.a();
                }
                if (charAt == 40) {
                    p3Var.f485304b++;
                    str2 = str3.substring(i17, i18);
                } else {
                    p3Var.f485304b = i17;
                }
            }
            if (str2 == null) {
                throw new s7.g3("Bad transform function encountered in transform list: ".concat(str));
            }
            char c17 = 65535;
            switch (str2.hashCode()) {
                case -1081239615:
                    if (str2.equals("matrix")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -925180581:
                    if (str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2)) {
                        c17 = 1;
                        break;
                    }
                    break;
                case 109250890:
                    if (str2.equals("scale")) {
                        c17 = 2;
                        break;
                    }
                    break;
                case 109493390:
                    if (str2.equals("skewX")) {
                        c17 = 3;
                        break;
                    }
                    break;
                case 109493391:
                    if (str2.equals("skewY")) {
                        c17 = 4;
                        break;
                    }
                    break;
                case 1052832078:
                    if (str2.equals("translate")) {
                        c17 = 5;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    p3Var.q();
                    float i19 = p3Var.i();
                    p3Var.p();
                    float i27 = p3Var.i();
                    p3Var.p();
                    float i28 = p3Var.i();
                    p3Var.p();
                    float i29 = p3Var.i();
                    p3Var.p();
                    float i37 = p3Var.i();
                    p3Var.p();
                    float i38 = p3Var.i();
                    p3Var.q();
                    if (!java.lang.Float.isNaN(i38) && p3Var.d(')')) {
                        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                        matrix2.setValues(new float[]{i19, i28, i37, i27, i29, i38, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                case 1:
                    p3Var.q();
                    float i39 = p3Var.i();
                    float o17 = p3Var.o();
                    float o18 = p3Var.o();
                    p3Var.q();
                    if (java.lang.Float.isNaN(i39) || !p3Var.d(')')) {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                    if (java.lang.Float.isNaN(o17)) {
                        matrix.preRotate(i39);
                        break;
                    } else if (!java.lang.Float.isNaN(o18)) {
                        matrix.preRotate(i39, o17, o18);
                        break;
                    } else {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                    break;
                case 2:
                    p3Var.q();
                    float i47 = p3Var.i();
                    float o19 = p3Var.o();
                    p3Var.q();
                    if (!java.lang.Float.isNaN(i47) && p3Var.d(')')) {
                        if (!java.lang.Float.isNaN(o19)) {
                            matrix.preScale(i47, o19);
                            break;
                        } else {
                            matrix.preScale(i47, i47);
                            break;
                        }
                    } else {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                case 3:
                    p3Var.q();
                    float i48 = p3Var.i();
                    p3Var.q();
                    if (!java.lang.Float.isNaN(i48) && p3Var.d(')')) {
                        matrix.preSkew((float) java.lang.Math.tan(java.lang.Math.toRadians(i48)), 0.0f);
                        break;
                    } else {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                case 4:
                    p3Var.q();
                    float i49 = p3Var.i();
                    p3Var.q();
                    if (!java.lang.Float.isNaN(i49) && p3Var.d(')')) {
                        matrix.preSkew(0.0f, (float) java.lang.Math.tan(java.lang.Math.toRadians(i49)));
                        break;
                    } else {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                case 5:
                    p3Var.q();
                    float i57 = p3Var.i();
                    float o27 = p3Var.o();
                    p3Var.q();
                    if (!java.lang.Float.isNaN(i57) && p3Var.d(')')) {
                        if (!java.lang.Float.isNaN(o27)) {
                            matrix.preTranslate(i57, o27);
                            break;
                        } else {
                            matrix.preTranslate(i57, 0.0f);
                            break;
                        }
                    } else {
                        throw new s7.g3("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new s7.g3("Invalid transform list fn: " + str2 + ")");
            }
            if (p3Var.f()) {
                return matrix;
            }
            p3Var.p();
        }
        return matrix;
    }

    public final void E(java.io.InputStream inputStream) {
        try {
            javax.xml.parsers.SAXParserFactory newInstance = javax.xml.parsers.SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            org.xml.sax.XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            s7.m3 m3Var = new s7.m3(this, null);
            xMLReader.setContentHandler(m3Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", m3Var);
            xMLReader.parse(new org.xml.sax.InputSource(inputStream));
        } catch (java.io.IOException e17) {
            throw new s7.g3("Stream error", e17);
        } catch (javax.xml.parsers.ParserConfigurationException e18) {
            throw new s7.g3("XML parser problem", e18);
        } catch (org.xml.sax.SAXException e19) {
            throw new s7.g3("SVG parse error", e19);
        }
    }

    public final void F(java.io.InputStream inputStream) {
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
            s7.q3 q3Var = new s7.q3(this, newPullParser);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType == 0) {
                    this.f485347a = new s7.t2();
                } else if (eventType == 8) {
                    s7.p3 p3Var = new s7.p3(newPullParser.getText());
                    java.lang.String l17 = p3Var.l();
                    C(p3Var);
                    l17.equals("xml-stylesheet");
                } else if (eventType == 2) {
                    java.lang.String name = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name = newPullParser.getPrefix() + ':' + name;
                    }
                    J(newPullParser.getNamespace(), newPullParser.getName(), name, q3Var);
                } else if (eventType == 3) {
                    java.lang.String name2 = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name2 = newPullParser.getPrefix() + ':' + name2;
                    }
                    c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    M(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    L(newPullParser.getText());
                }
            }
        } catch (java.io.IOException e17) {
            throw new s7.g3("Stream error", e17);
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            throw new s7.g3("XML parser problem", e18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(org.xml.sax.Attributes r7) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.r3.G(org.xml.sax.Attributes):void");
    }

    public final void I(org.xml.sax.Attributes attributes) {
        s7.w1 w1Var = this.f485348b;
        if (w1Var == null) {
            throw new s7.g3("Invalid document. Root element must be <svg>");
        }
        s7.g1 g1Var = new s7.g1();
        g1Var.f485118a = this.f485347a;
        g1Var.f485119b = w1Var;
        i(g1Var, attributes);
        l(g1Var, attributes);
        this.f485348b.h(g1Var);
        this.f485348b = g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x0431, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0a02, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0cb9, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:328:0x05c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:453:0x0816. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.lang.String r25, java.lang.String r26, java.lang.String r27, org.xml.sax.Attributes r28) {
        /*
            Method dump skipped, instructions count: 3506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.r3.J(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void K(org.xml.sax.Attributes attributes) {
        if (this.f485348b == null) {
            throw new s7.g3("Invalid document. Root element must be <svg>");
        }
        boolean z17 = false;
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;
        boolean z18 = true;
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String trim = attributes.getValue(i17).trim();
            int ordinal = s7.n3.a(attributes.getLocalName(i17)).ordinal();
            if (ordinal == 38) {
                str = trim;
            } else if (ordinal == 77) {
                z18 = trim.equals("text/css");
            }
        }
        if (z18) {
            s7.h hVar = s7.h.screen;
            s7.f fVar = new s7.f(str);
            fVar.q();
            java.util.Iterator it = ((java.util.ArrayList) s7.x.c(fVar)).iterator();
            while (it.hasNext()) {
                s7.h hVar2 = (s7.h) it.next();
                if (hVar2 == s7.h.all || hVar2 == hVar) {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                this.f485354h = true;
                return;
            }
        }
        this.f485349c = true;
        this.f485350d = 1;
    }

    public final void L(java.lang.String str) {
        if (this.f485349c) {
            return;
        }
        if (this.f485351e) {
            if (this.f485353g == null) {
                this.f485353g = new java.lang.StringBuilder(str.length());
            }
            this.f485353g.append(str);
        } else if (this.f485354h) {
            if (this.f485355i == null) {
                this.f485355i = new java.lang.StringBuilder(str.length());
            }
            this.f485355i.append(str);
        } else if (this.f485348b instanceof s7.l2) {
            a(str);
        }
    }

    public final void M(char[] cArr, int i17, int i18) {
        if (this.f485349c) {
            return;
        }
        if (this.f485351e) {
            if (this.f485353g == null) {
                this.f485353g = new java.lang.StringBuilder(i18);
            }
            this.f485353g.append(cArr, i17, i18);
        } else if (this.f485354h) {
            if (this.f485355i == null) {
                this.f485355i = new java.lang.StringBuilder(i18);
            }
            this.f485355i.append(cArr, i17, i18);
        } else if (this.f485348b instanceof s7.l2) {
            a(new java.lang.String(cArr, i17, i18));
        }
    }

    public final void a(java.lang.String str) {
        s7.u1 u1Var = (s7.u1) this.f485348b;
        int size = u1Var.f485379i.size();
        s7.a2 a2Var = size == 0 ? null : (s7.a2) u1Var.f485379i.get(size - 1);
        if (!(a2Var instanceof s7.p2)) {
            this.f485348b.h(new s7.p2(str));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        s7.p2 p2Var = (s7.p2) a2Var;
        sb6.append(p2Var.f485302c);
        sb6.append(str);
        p2Var.f485302c = sb6.toString();
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.f485349c) {
            int i17 = this.f485350d - 1;
            this.f485350d = i17;
            if (i17 == 0) {
                this.f485349c = false;
                return;
            }
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            s7.o3 o3Var = (s7.o3) ((java.util.HashMap) s7.o3.f485296h).get(str2);
            if (o3Var == null) {
                o3Var = s7.o3.UNSUPPORTED;
            }
            switch (o3Var.ordinal()) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    java.lang.Object obj = this.f485348b;
                    if (obj == null) {
                        throw new s7.g3(java.lang.String.format("Unbalanced end element </%s> found", str2));
                    }
                    this.f485348b = ((s7.a2) obj).f485119b;
                    return;
                case 2:
                case 6:
                case 9:
                case 13:
                case 15:
                case 16:
                case 18:
                case 27:
                default:
                    return;
                case 5:
                case 26:
                    this.f485351e = false;
                    if (this.f485353g != null) {
                        s7.o3 o3Var2 = this.f485352f;
                        if (o3Var2 == s7.o3.title) {
                            this.f485347a.getClass();
                        } else if (o3Var2 == s7.o3.desc) {
                            this.f485347a.getClass();
                        }
                        this.f485353g.setLength(0);
                        return;
                    }
                    return;
                case 21:
                    java.lang.StringBuilder sb6 = this.f485355i;
                    if (sb6 != null) {
                        this.f485354h = false;
                        java.lang.String sb7 = sb6.toString();
                        s7.x xVar = new s7.x(s7.h.screen, s7.w.Document);
                        s7.t2 t2Var = this.f485347a;
                        s7.f fVar = new s7.f(sb7);
                        fVar.q();
                        t2Var.f485371c.b(xVar.e(fVar));
                        this.f485355i.setLength(0);
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(org.xml.sax.Attributes r8) {
        /*
            r7 = this;
            s7.w1 r0 = r7.f485348b
            if (r0 == 0) goto Lc2
            s7.w0 r0 = new s7.w0
            r0.<init>()
            s7.t2 r1 = r7.f485347a
            r0.f485118a = r1
            s7.w1 r1 = r7.f485348b
            r0.f485119b = r1
            r7.i(r0, r8)
            r7.l(r0, r8)
            r7.h(r0, r8)
            r1 = 0
        L1b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lba
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            s7.n3 r3 = s7.n3.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto La2
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L84
            r4 = 37
            if (r3 == r4) goto L66
            switch(r3) {
                case 81: goto L51;
                case 82: goto L4d;
                case 83: goto L49;
                default: goto L48;
            }
        L48:
            goto Lae
        L49:
            w(r2)
            goto Lae
        L4d:
            w(r2)
            goto Lae
        L51:
            s7.t0 r2 = w(r2)
            r0.f485413p = r2
            boolean r2 = r2.f()
            if (r2 != 0) goto L5e
            goto Lae
        L5e:
            s7.g3 r8 = new s7.g3
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L66:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L71
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f485411n = r2
            goto Lae
        L71:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L7c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f485411n = r2
            goto Lae
        L7c:
            s7.g3 r8 = new s7.g3
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L84:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L8f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f485412o = r2
            goto Lae
        L8f:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L9a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f485412o = r2
            goto Lae
        L9a:
            s7.g3 r8 = new s7.g3
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        La2:
            s7.t0 r2 = w(r2)
            r0.f485414q = r2
            boolean r2 = r2.f()
            if (r2 != 0) goto Lb2
        Lae:
            int r1 = r1 + 1
            goto L1b
        Lb2:
            s7.g3 r8 = new s7.g3
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        Lba:
            s7.w1 r8 = r7.f485348b
            r8.h(r0)
            r7.f485348b = r0
            return
        Lc2:
            s7.g3 r8 = new s7.g3
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.r3.f(org.xml.sax.Attributes):void");
    }

    public s7.t2 g(java.io.InputStream inputStream, boolean z17) {
        if (!inputStream.markSupported()) {
            inputStream = new java.io.BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(inputStream));
            }
        } catch (java.io.IOException unused) {
        }
        try {
            if (z17) {
                try {
                    inputStream.mark(4096);
                    byte[] bArr = new byte[4096];
                    java.lang.String str = new java.lang.String(bArr, 0, inputStream.read(bArr));
                    inputStream.reset();
                    if (str.indexOf("<!ENTITY ") >= 0) {
                        E(inputStream);
                        s7.t2 t2Var = this.f485347a;
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                        return t2Var;
                    }
                } catch (java.io.IOException unused3) {
                    F(inputStream);
                    s7.t2 t2Var2 = this.f485347a;
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                    return t2Var2;
                }
            }
            F(inputStream);
            s7.t2 t2Var3 = this.f485347a;
            try {
                inputStream.close();
            } catch (java.io.IOException unused5) {
            }
            return t2Var3;
        } catch (java.lang.Throwable th6) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused6) {
            }
            throw th6;
        }
    }

    public final void h(s7.t1 t1Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String trim = attributes.getValue(i17).trim();
            int ordinal = s7.n3.a(attributes.getLocalName(i17)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        s7.p3 p3Var = new s7.p3(trim);
                        java.util.HashSet hashSet = new java.util.HashSet();
                        while (!p3Var.f()) {
                            java.lang.String l17 = p3Var.l();
                            if (l17.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(l17.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            p3Var.q();
                        }
                        t1Var.i(hashSet);
                        break;
                    case 53:
                        t1Var.k(trim);
                        break;
                    case 54:
                        s7.p3 p3Var2 = new s7.p3(trim);
                        java.util.HashSet hashSet2 = new java.util.HashSet();
                        while (!p3Var2.f()) {
                            hashSet2.add(p3Var2.l());
                            p3Var2.q();
                        }
                        t1Var.j(hashSet2);
                        break;
                    case 55:
                        java.util.List t17 = t(trim);
                        t1Var.b(t17 != null ? new java.util.HashSet(t17) : new java.util.HashSet(0));
                        break;
                }
            } else {
                s7.p3 p3Var3 = new s7.p3(trim);
                java.util.HashSet hashSet3 = new java.util.HashSet();
                while (!p3Var3.f()) {
                    java.lang.String l18 = p3Var3.l();
                    int indexOf = l18.indexOf(45);
                    if (indexOf != -1) {
                        l18 = l18.substring(0, indexOf);
                    }
                    hashSet3.add(new java.util.Locale(l18, "", "").getLanguage());
                    p3Var3.q();
                }
                t1Var.e(hashSet3);
            }
        }
    }

    public final void i(s7.y1 y1Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String qName = attributes.getQName(i17);
            if (qName.equals(dm.i4.f66865x76d1ec5a) || qName.equals("xml:id")) {
                y1Var.f485431c = attributes.getValue(i17).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                java.lang.String trim = attributes.getValue(i17).trim();
                if ("default".equals(trim)) {
                    y1Var.f485432d = java.lang.Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new s7.g3("Invalid value for \"xml:space\" attribute: " + trim);
                    }
                    y1Var.f485432d = java.lang.Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public final void j(s7.n0 n0Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String trim = attributes.getValue(i17).trim();
            int ordinal = s7.n3.a(attributes.getLocalName(i17)).ordinal();
            if (ordinal == 23) {
                n0Var.f485264j = D(trim);
            } else if (ordinal != 24) {
                if (ordinal != 26) {
                    if (ordinal != 60) {
                        continue;
                    } else {
                        try {
                            n0Var.f485265k = s7.o0.m164004xdce0328(trim);
                        } catch (java.lang.IllegalArgumentException unused) {
                            throw new s7.g3("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                    }
                } else if ("".equals(attributes.getURI(i17)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i17))) {
                    n0Var.f485266l = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                n0Var.f485263i = java.lang.Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new s7.g3("Invalid value for attribute gradientUnits");
                }
                n0Var.f485263i = java.lang.Boolean.TRUE;
            }
        }
    }

    public final void k(s7.d1 d1Var, org.xml.sax.Attributes attributes, java.lang.String str) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            if (s7.n3.a(attributes.getLocalName(i17)) == s7.n3.points) {
                s7.p3 p3Var = new s7.p3(attributes.getValue(i17));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                p3Var.q();
                while (!p3Var.f()) {
                    float i18 = p3Var.i();
                    if (java.lang.Float.isNaN(i18)) {
                        throw new s7.g3("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    p3Var.p();
                    float i19 = p3Var.i();
                    if (java.lang.Float.isNaN(i19)) {
                        throw new s7.g3("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    p3Var.p();
                    arrayList.add(java.lang.Float.valueOf(i18));
                    arrayList.add(java.lang.Float.valueOf(i19));
                }
                d1Var.f485165o = new float[arrayList.size()];
                java.util.Iterator it = arrayList.iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    d1Var.f485165o[i27] = ((java.lang.Float) it.next()).floatValue();
                    i27++;
                }
            }
        }
    }

    public final void l(s7.y1 y1Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String trim = attributes.getValue(i17).trim();
            if (trim.length() != 0) {
                int ordinal = s7.n3.a(attributes.getLocalName(i17)).ordinal();
                if (ordinal == 0) {
                    s7.f fVar = new s7.f(trim);
                    java.util.ArrayList arrayList = null;
                    while (!fVar.f()) {
                        java.lang.String l17 = fVar.l();
                        if (l17 != null) {
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                            }
                            arrayList.add(l17);
                            fVar.q();
                        }
                    }
                    y1Var.f485435g = arrayList;
                } else if (ordinal != 72) {
                    if (y1Var.f485433e == null) {
                        y1Var.f485433e = new s7.r1();
                    }
                    H(y1Var.f485433e, attributes.getLocalName(i17), attributes.getValue(i17).trim());
                } else {
                    s7.f fVar2 = new s7.f(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (!fVar2.f()) {
                        fVar2.q();
                        java.lang.String t17 = fVar2.t();
                        fVar2.q();
                        if (!fVar2.d(';')) {
                            if (!fVar2.d(':')) {
                                break;
                            }
                            fVar2.q();
                            java.lang.String u17 = fVar2.u();
                            if (u17 != null) {
                                fVar2.q();
                                if (fVar2.f() || fVar2.d(';')) {
                                    if (y1Var.f485434f == null) {
                                        y1Var.f485434f = new s7.r1();
                                    }
                                    H(y1Var.f485434f, t17, u17);
                                    fVar2.q();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void m(s7.n2 n2Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String trim = attributes.getValue(i17).trim();
            int ordinal = s7.n3.a(attributes.getLocalName(i17)).ordinal();
            if (ordinal == 9) {
                n2Var.f485273p = x(trim);
            } else if (ordinal == 10) {
                n2Var.f485274q = x(trim);
            } else if (ordinal == 82) {
                n2Var.f485271n = x(trim);
            } else if (ordinal == 83) {
                n2Var.f485272o = x(trim);
            }
        }
    }

    public final void n(s7.r0 r0Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            if (s7.n3.a(attributes.getLocalName(i17)) == s7.n3.transform) {
                r0Var.l(D(attributes.getValue(i17)));
            }
        }
    }

    public final void o(s7.e2 e2Var, org.xml.sax.Attributes attributes) {
        for (int i17 = 0; i17 < attributes.getLength(); i17++) {
            java.lang.String trim = attributes.getValue(i17).trim();
            int ordinal = s7.n3.a(attributes.getLocalName(i17)).ordinal();
            if (ordinal == 48) {
                B(e2Var, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                s7.p3 p3Var = new s7.p3(trim);
                p3Var.q();
                float i18 = p3Var.i();
                p3Var.p();
                float i19 = p3Var.i();
                p3Var.p();
                float i27 = p3Var.i();
                p3Var.p();
                float i28 = p3Var.i();
                if (java.lang.Float.isNaN(i18) || java.lang.Float.isNaN(i19) || java.lang.Float.isNaN(i27) || java.lang.Float.isNaN(i28)) {
                    throw new s7.g3("Invalid viewBox definition - should have four numbers");
                }
                if (i27 < 0.0f) {
                    throw new s7.g3("Invalid viewBox. width cannot be negative");
                }
                if (i28 < 0.0f) {
                    throw new s7.g3("Invalid viewBox. height cannot be negative");
                }
                e2Var.f485173o = new s7.f0(i18, i19, i27, i28);
            }
        }
    }
}

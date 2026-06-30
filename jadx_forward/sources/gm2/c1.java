package gm2;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final gm2.c1 f354853a = new gm2.c1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f354854b = jz5.h.b(gm2.x0.f355057d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f354855c = jz5.h.b(gm2.y0.f355065d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f354856d = jz5.h.b(gm2.w0.f355054d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f354857e = jz5.h.b(gm2.u0.f355024d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f354858f = jz5.h.b(gm2.t0.f355013d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f354859g = jz5.h.b(gm2.y.f355064d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f354860h = jz5.h.b(gm2.z.f355066d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f354861i = jz5.h.b(gm2.b0.f354847d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f354862j = jz5.h.b(gm2.a0.f354844d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f354863k = jz5.h.b(gm2.k0.f354955d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f354864l;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f354865m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f354866n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f354867o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f354868p;

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f354869q;

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f354870r;

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f354871s;

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f354872t;

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f354873u;

    /* renamed from: v, reason: collision with root package name */
    public static final jz5.g f354874v;

    /* renamed from: w, reason: collision with root package name */
    public static final jz5.g f354875w;

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f354876x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f354877y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f354878z;

    static {
        jz5.h.b(gm2.j0.f354950d);
        jz5.h.b(gm2.l0.f354960d);
        jz5.h.b(gm2.m0.f354964d);
        f354864l = jz5.h.b(gm2.q0.f354996d);
        f354865m = jz5.h.b(gm2.r0.f355001d);
        f354866n = jz5.h.b(gm2.s0.f355002d);
        f354867o = jz5.h.b(gm2.c0.f354852d);
        f354868p = jz5.h.b(gm2.d0.f354887d);
        jz5.h.b(gm2.e0.f354890d);
        f354869q = jz5.h.b(gm2.f0.f354899d);
        f354870r = jz5.h.b(gm2.g0.f354900d);
        f354871s = jz5.h.b(gm2.h0.f354902d);
        f354872t = jz5.h.b(gm2.i0.f354943d);
        f354873u = jz5.h.b(gm2.o0.f354989d);
        f354874v = jz5.h.b(gm2.n0.f354967d);
        f354875w = jz5.h.b(gm2.p0.f354991d);
        f354876x = jz5.h.b(gm2.v0.f355034d);
        f354877y = "Finder.FinderLiveSpanUtil";
        f354878z = new int[]{1, 2, 4, 5, 8, 10, 11, 12, 13, 14, 17, 15, 16, 19, 20};
    }

    public static final int a(gm2.c1 c1Var, int i17) {
        c1Var.getClass();
        if (i17 == 17) {
            return 108;
        }
        if (i17 == 20) {
            return 89;
        }
        switch (i17) {
            case 1:
                return 100;
            case 2:
                return 90;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 110;
            case 6:
                return 70;
            default:
                switch (i17) {
                    case 12:
                        return 85;
                    case 13:
                        return 109;
                    case 14:
                        return 107;
                    case 15:
                        return 79;
                    default:
                        return 0;
                }
        }
    }

    public static android.graphics.drawable.Drawable c(gm2.c1 c1Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        c1Var.getClass();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setBounds(0, 0, i17, i18);
        return gradientDrawable;
    }

    public static jz5.l d(gm2.c1 c1Var, android.view.View view, android.content.Context context, java.lang.String msg, java.util.LinkedList linkedList, int[] filterSpan, gm2.c2 c2Var, gm2.e2 e2Var, int i17, java.lang.Integer num, java.util.Map map, int i18, java.lang.Object obj) {
        gm2.c2 spanMode = (i18 & 32) != 0 ? gm2.c2.f354881g : c2Var;
        gm2.e2 sizeType = (i18 & 64) != 0 ? gm2.e2.f354894g : e2Var;
        int i19 = (i18 & 128) != 0 ? -1 : i17;
        java.lang.Integer num2 = (i18 & 256) != 0 ? null : num;
        java.util.Map specialColorMode = (i18 & 512) != 0 ? new java.util.LinkedHashMap() : map;
        c1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterSpan, "filterSpan");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanMode, "spanMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeType, "sizeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specialColorMode, "specialColorMode");
        gm2.e2 e2Var2 = sizeType;
        gm2.c2 c2Var2 = spanMode;
        java.util.List r17 = r(c1Var, linkedList, filterSpan, spanMode, sizeType, i19, view, null, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, num2, specialColorMode, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, null);
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userlevelTest,badgeInfos size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(",spanList:");
        sb6.append(c1Var.s(linkedList));
        sb6.append(",validSpan:");
        sb6.append(((java.util.LinkedList) r17).size());
        sb6.append(",spanMode:");
        sb6.append(c2Var2);
        sb6.append(",sizeType:");
        sb6.append(e2Var2);
        r4Var.M2("getAllBadgeSpannableString", sb6.toString());
        return new jz5.l(c1Var.q(context, msg, r17, true), r17);
    }

    public static android.text.style.ImageSpan n(gm2.c1 c1Var, java.util.List list, gm2.d1 d1Var, int i17, java.lang.Object obj) {
        r45.eq1 eq1Var;
        java.lang.String str = null;
        if ((i17 & 2) != 0) {
            d1Var = null;
        }
        c1Var.getClass();
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.yl1 yl1Var = (r45.yl1) it.next();
            if (yl1Var.m75939xb282bd08(0) == 12 && yl1Var.m75939xb282bd08(2) > 0) {
                java.lang.String m75945x2fec8307 = yl1Var.m75945x2fec8307(4);
                if (!(true ^ (m75945x2fec8307 == null || m75945x2fec8307.length() == 0))) {
                    m75945x2fec8307 = null;
                }
                if (m75945x2fec8307 == null) {
                    mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
                    if (n2Var != null && (eq1Var = n2Var.f410812g) != null) {
                        str = eq1Var.m75945x2fec8307(0);
                    }
                } else {
                    str = m75945x2fec8307;
                }
                gm2.h hVar = gm2.j.f354947e;
                gm2.f fVar = new gm2.f();
                int m75939xb282bd08 = yl1Var.m75939xb282bd08(2);
                if (d1Var == null) {
                    d1Var = new gm2.d1(gm2.c2.f354881g, gm2.e2.f354894g);
                }
                fVar.b(m75939xb282bd08, d1Var);
                if (str == null) {
                    str = "";
                }
                gm2.i iVar = fVar.f354898a;
                iVar.getClass();
                iVar.f354926d = str;
                fVar.c(yl1Var.m75945x2fec8307(3));
                gm2.j a17 = fVar.a();
                yl1Var.m75939xb282bd08(0);
                return a17;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x02b4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.LinkedList] */
    public static java.util.List r(gm2.c1 c1Var, java.util.List list, int[] iArr, gm2.c2 c2Var, gm2.e2 e2Var, int i17, android.view.View view, java.util.Map map, int i18, int i19, java.lang.Integer num, java.util.Map map2, int i27, java.lang.Object obj) {
        java.lang.Integer num2;
        ?? r76;
        java.util.Iterator it;
        int[] iArr2;
        int i28;
        java.util.Map map3;
        java.util.Map map4;
        java.util.Map map5;
        gm2.z1 z1Var;
        int i29;
        int dimension;
        r45.eq1 eq1Var;
        int i37;
        int dimension2;
        java.util.Map map6;
        boolean z17;
        android.graphics.Bitmap n17;
        r45.eq1 eq1Var2;
        java.lang.Object obj2;
        int i38;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i39;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        int i47;
        int i48;
        java.lang.Object obj8;
        int[] spanFilter = (i27 & 2) != 0 ? f354878z : iArr;
        gm2.c2 spanColorMode = (i27 & 4) != 0 ? gm2.c2.f354881g : c2Var;
        gm2.e2 sizeType = (i27 & 8) != 0 ? gm2.e2.f354894g : e2Var;
        int i49 = (i27 & 16) != 0 ? -1 : i17;
        java.util.Map map7 = (i27 & 64) != 0 ? null : map;
        int i57 = (i27 & 128) != 0 ? 0 : i18;
        int k17 = (i27 & 256) != 0 ? c1Var.k() : i19;
        java.lang.Integer num3 = (i27 & 512) != 0 ? null : num;
        java.util.Map specialColorMode = (i27 & 1024) != 0 ? new java.util.LinkedHashMap() : map2;
        c1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanFilter, "spanFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanColorMode, "spanColorMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeType, "sizeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specialColorMode, "specialColorMode");
        java.util.LinkedList<android.text.style.UpdateLayout> linkedList = new java.util.LinkedList();
        if (list != null) {
            r76 = new java.util.LinkedList();
            r76.addAll(list);
            switch (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85005f0).mo141623x754a37bb()).r()).intValue()) {
                case 1:
                    num2 = num3;
                    int i58 = 0;
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj2 = it6.next();
                            java.util.Iterator it7 = it6;
                            if (!(((r45.yl1) obj2).m75939xb282bd08(i58) == 17)) {
                                it6 = it7;
                                i58 = 0;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null) {
                        r45.yl1 yl1Var = new r45.yl1();
                        yl1Var.set(0, 17);
                        yl1Var.set(4, "资深买家");
                        r76.add(yl1Var);
                        break;
                    }
                    break;
                case 2:
                    num2 = num3;
                    java.util.Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj3 = it8.next();
                            i38 = 14;
                            if (((r45.yl1) obj3).m75939xb282bd08(0) == 14) {
                            }
                        } else {
                            i38 = 14;
                            obj3 = null;
                        }
                    }
                    if (obj3 == null) {
                        r45.yl1 yl1Var2 = new r45.yl1();
                        yl1Var2.set(0, java.lang.Integer.valueOf(i38));
                        yl1Var2.set(4, "普通买家");
                        r76.add(yl1Var2);
                        break;
                    }
                    break;
                case 3:
                    num2 = num3;
                    java.util.Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj4 = it9.next();
                            if (((r45.yl1) obj4).m75939xb282bd08(0) == 15) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (obj4 == null) {
                        r45.yl1 yl1Var3 = new r45.yl1();
                        yl1Var3.set(0, 15);
                        yl1Var3.set(4, "粉丝");
                        r76.add(yl1Var3);
                        break;
                    }
                    break;
                case 4:
                    num2 = num3;
                    java.util.Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            obj5 = it10.next();
                            i39 = 16;
                            if (((r45.yl1) obj5).m75939xb282bd08(0) == 16) {
                            }
                        } else {
                            i39 = 16;
                            obj5 = null;
                        }
                    }
                    if (obj5 == null) {
                        r45.yl1 yl1Var4 = new r45.yl1();
                        yl1Var4.set(0, java.lang.Integer.valueOf(i39));
                        yl1Var4.set(4, "常看");
                        r76.add(yl1Var4);
                        break;
                    }
                    break;
                case 5:
                    num2 = num3;
                    java.util.Iterator it11 = list.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            obj6 = it11.next();
                            if (((r45.yl1) obj6).m75939xb282bd08(0) == 13) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    if (obj6 == null) {
                        r45.yl1 yl1Var5 = new r45.yl1();
                        yl1Var5.set(0, 13);
                        yl1Var5.set(4, "买过x单");
                        r76.add(yl1Var5);
                        break;
                    }
                    break;
                case 6:
                    java.util.Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            obj7 = it12.next();
                            num2 = num3;
                            if (!(((r45.yl1) obj7).m75939xb282bd08(0) == 17)) {
                                num3 = num2;
                            }
                        } else {
                            num2 = num3;
                            obj7 = null;
                        }
                    }
                    if (obj7 == null) {
                        r45.yl1 yl1Var6 = new r45.yl1();
                        i47 = 0;
                        yl1Var6.set(0, 17);
                        yl1Var6.set(4, "资深买家");
                        r76.add(yl1Var6);
                    } else {
                        i47 = 0;
                    }
                    java.util.Iterator it13 = list.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            obj8 = it13.next();
                            int m75939xb282bd08 = ((r45.yl1) obj8).m75939xb282bd08(i47);
                            i48 = 14;
                            if (!(m75939xb282bd08 == 14)) {
                                i47 = 0;
                            }
                        } else {
                            i48 = 14;
                            obj8 = null;
                        }
                    }
                    if (obj8 == null) {
                        r45.yl1 yl1Var7 = new r45.yl1();
                        yl1Var7.set(0, java.lang.Integer.valueOf(i48));
                        yl1Var7.set(4, "普通买家");
                        r76.add(yl1Var7);
                        break;
                    }
                    break;
                default:
                    num2 = num3;
                    break;
            }
        } else {
            num2 = num3;
            r76 = list;
        }
        if (r76 != 0) {
            r76 = kz5.n0.F0(r76, new gm2.b1());
        }
        if (r76 != 0) {
            java.util.Iterator it14 = r76.iterator();
            while (it14.hasNext()) {
                r45.yl1 yl1Var8 = (r45.yl1) it14.next();
                if (kz5.z.F(spanFilter, yl1Var8.m75939xb282bd08(0)) && (i49 == -1 || linkedList.size() < i49)) {
                    int m75939xb282bd082 = yl1Var8.m75939xb282bd08(0);
                    gm2.c1 c1Var2 = f354853a;
                    it = it14;
                    iArr2 = spanFilter;
                    i28 = i49;
                    switch (m75939xb282bd082) {
                        case 1:
                            map3 = specialColorMode;
                            map4 = map7;
                            int m75939xb282bd083 = yl1Var8.m75939xb282bd08(2);
                            if (m75939xb282bd083 > 0) {
                                int i59 = gm2.i1.f354944f;
                                gm2.e1 e1Var = new gm2.e1();
                                e1Var.b(m75939xb282bd083, new gm2.b());
                                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyp);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                                e1Var.e(string);
                                java.lang.String number = java.lang.String.valueOf(m75939xb282bd083);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(number, "number");
                                gm2.h1 h1Var = e1Var.f354891a;
                                h1Var.getClass();
                                h1Var.f354904b = number;
                                h1Var.f354908f = i57;
                                h1Var.f354911i = k17;
                                h1Var.f354914l = c1Var2.k();
                                e1Var.d(yl1Var8.m75945x2fec8307(3), true);
                                gm2.i1 a17 = e1Var.a();
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a17);
                                map7 = map4;
                                it14 = it;
                                spanFilter = iArr2;
                                i49 = i28;
                                specialColorMode = map3;
                            }
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 2:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (yl1Var8.m75939xb282bd08(2) > 0) {
                                if (map5 != null) {
                                    map4 = map5;
                                    z1Var = (gm2.z1) map4.get(2);
                                } else {
                                    map4 = map5;
                                    z1Var = null;
                                }
                                gm2.t1 t1Var = z1Var instanceof gm2.t1 ? (gm2.t1) z1Var : null;
                                linkedList.add(c1Var2.b(yl1Var8.m75939xb282bd08(2), view, t1Var == null ? new gm2.t1(spanColorMode, sizeType) : t1Var, i57, k17, yl1Var8.m75945x2fec8307(3)));
                                map7 = map4;
                                it14 = it;
                                spanFilter = iArr2;
                                i49 = i28;
                                specialColorMode = map3;
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 3:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String str = f354877y;
                            if (view != null) {
                                zl2.r4.f555483a.M2(str, "getIconDrawable viewRef:" + view.hashCode() + ", name:" + yl1Var8.m75945x2fec8307(4) + ", bgcolor:" + yl1Var8.m75945x2fec8307(3) + ", url:" + yl1Var8.m75945x2fec8307(1));
                                int m75939xb282bd084 = (int) (((float) 255) * (((float) yl1Var8.m75939xb282bd08(5)) / 100.0f));
                                r26.a.a(16);
                                java.lang.String num4 = java.lang.Integer.toString(m75939xb282bd084, 16);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num4, "toString(...)");
                                java.lang.String m75945x2fec8307 = yl1Var8.m75945x2fec8307(3);
                                if (m75945x2fec8307 == null) {
                                    m75945x2fec8307 = "#FFFFFF";
                                }
                                java.lang.String concat = num4.concat(r26.i0.t(m75945x2fec8307, "#", "", false));
                                gm2.j1 j1Var = new gm2.j1(view, sizeType, com.p314xaae8f345.mm.R.id.f569042ou0);
                                gm2.e2 e2Var2 = gm2.e2.f354894g;
                                int dimension3 = (int) (sizeType == e2Var2 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561955xh));
                                int dimension4 = (int) (sizeType == e2Var2 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561964xq));
                                if (sizeType == e2Var2) {
                                    dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561176bi);
                                    i29 = 2;
                                } else {
                                    i29 = 2;
                                    dimension = ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561955xh)) / 2;
                                }
                                gm2.p pVar = gm2.q.f354993e;
                                gm2.r rVar = new gm2.r();
                                int m75939xb282bd085 = yl1Var8.m75939xb282bd08(i29);
                                java.lang.String m75945x2fec83072 = yl1Var8.m75945x2fec8307(4);
                                rVar.b(m75939xb282bd085, m75945x2fec83072 == null ? "" : m75945x2fec83072, j1Var);
                                gm2.o oVar = rVar.f354998a;
                                oVar.f354969a = i57;
                                oVar.f354970b = k17;
                                oVar.f354971c = dimension3;
                                oVar.f354972d = dimension4;
                                oVar.f354973e = dimension;
                                rVar.c("#" + concat);
                                java.lang.String m75945x2fec83073 = yl1Var8.m75945x2fec8307(1);
                                if (m75945x2fec83073 == null) {
                                    m75945x2fec83073 = "";
                                }
                                rVar.f354998a.f354982n = new fx2.f(m75945x2fec83073, j1Var.f354952b, (android.view.View) j1Var.f354953c.get());
                                gm2.q a18 = rVar.a(view);
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a18);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "GameRank attachView null");
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 4:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (yl1Var8.m75939xb282bd08(2) > 0) {
                                java.lang.String m75945x2fec83074 = yl1Var8.m75945x2fec8307(4);
                                if (!(!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0))) {
                                    m75945x2fec83074 = null;
                                }
                                if (m75945x2fec83074 == null) {
                                    mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
                                    m75945x2fec83074 = (n2Var == null || (eq1Var = n2Var.f410812g) == null) ? null : eq1Var.m75945x2fec8307(0);
                                }
                                gm2.h hVar = gm2.j.f354947e;
                                gm2.f fVar = new gm2.f();
                                fVar.b(yl1Var8.m75939xb282bd08(2), new gm2.e(spanColorMode, sizeType));
                                java.lang.String str2 = m75945x2fec83074 == null ? "" : m75945x2fec83074;
                                gm2.i iVar = fVar.f354898a;
                                iVar.getClass();
                                iVar.f354926d = str2;
                                gm2.i iVar2 = fVar.f354898a;
                                iVar2.f354937o = i57;
                                iVar2.f354938p = k17;
                                fVar.c(yl1Var8.m75945x2fec8307(3));
                                gm2.j a19 = fVar.a();
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a19);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 5:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int i66 = gm2.i1.f354944f;
                            gm2.e1 e1Var2 = new gm2.e1();
                            e1Var2.b(0, new gm2.t(spanColorMode, null, 2, null));
                            e1Var2.f((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                            gm2.h1 h1Var2 = e1Var2.f354891a;
                            h1Var2.f354908f = i57;
                            h1Var2.f354911i = k17;
                            e1Var2.c((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                            java.lang.String m75945x2fec83075 = yl1Var8.m75945x2fec8307(4);
                            e1Var2.e(m75945x2fec83075 == null ? "" : m75945x2fec83075);
                            gm2.i1 a27 = e1Var2.a();
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a27);
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yl1Var8.m75945x2fec8307(4), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573002d60))) {
                                break;
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 6:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (view != null) {
                                r26.a.a(16);
                                java.lang.String num5 = java.lang.Integer.toString((int) (255 * (yl1Var8.m75939xb282bd08(5) / 100.0f)), 16);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num5, "toString(...)");
                                java.lang.String m75945x2fec83076 = yl1Var8.m75945x2fec8307(3);
                                if (m75945x2fec83076 == null) {
                                    m75945x2fec83076 = "#FFFFFF";
                                }
                                java.lang.String concat2 = num5.concat(r26.i0.t(m75945x2fec83076, "#", "", false));
                                gm2.j1 j1Var2 = new gm2.j1(view, sizeType, com.p314xaae8f345.mm.R.id.otz);
                                gm2.e2 e2Var3 = gm2.e2.f354894g;
                                int dimension5 = (int) (sizeType == e2Var3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561955xh));
                                int dimension6 = (int) (sizeType == e2Var3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561964xq));
                                if (sizeType == e2Var3) {
                                    dimension2 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561176bi);
                                    i37 = 2;
                                } else {
                                    i37 = 2;
                                    dimension2 = ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561955xh)) / 2;
                                }
                                gm2.p pVar2 = gm2.q.f354993e;
                                gm2.r rVar2 = new gm2.r();
                                int m75939xb282bd086 = yl1Var8.m75939xb282bd08(i37);
                                java.lang.String m75945x2fec83077 = yl1Var8.m75945x2fec8307(4);
                                rVar2.b(m75939xb282bd086, m75945x2fec83077 == null ? "" : m75945x2fec83077, j1Var2);
                                gm2.o oVar2 = rVar2.f354998a;
                                oVar2.f354969a = i57;
                                oVar2.f354970b = k17;
                                oVar2.f354971c = dimension5;
                                oVar2.f354972d = dimension6;
                                oVar2.f354973e = dimension2;
                                rVar2.c("#" + concat2);
                                java.lang.String m75945x2fec83078 = yl1Var8.m75945x2fec8307(1);
                                rVar2.f354998a.f354982n = new fx2.f(m75945x2fec83078 == null ? "" : m75945x2fec83078, j1Var2.f354952b, (android.view.View) j1Var2.f354953c.get());
                                gm2.q a28 = rVar2.a(view);
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a28);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 7:
                        default:
                            map3 = specialColorMode;
                            map4 = map7;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 8:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int i67 = gm2.i1.f354944f;
                            gm2.e1 e1Var3 = new gm2.e1();
                            e1Var3.b(0, new gm2.n(spanColorMode, null, 2, null));
                            e1Var3.f((int) context2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                            e1Var3.c((int) context2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                            java.lang.String m75945x2fec83079 = yl1Var8.m75945x2fec8307(4);
                            e1Var3.e(m75945x2fec83079 == null ? "" : m75945x2fec83079);
                            gm2.i1 a29 = e1Var3.a();
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a29);
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 9:
                            java.util.Map map8 = specialColorMode;
                            map6 = map7;
                            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int parseColor = map8.getOrDefault(9, gm2.z0.f355067d) == gm2.c2.f354882h ? android.graphics.Color.parseColor("#0D000000") : map8.getOrDefault(9, gm2.a1.f354845d) == gm2.c2.f354881g ? android.graphics.Color.parseColor("#804c4c4c") : com.p314xaae8f345.mm.ui.bk.C() ? android.graphics.Color.parseColor("#804c4c4c") : android.graphics.Color.parseColor("#0D000000");
                            int parseColor2 = android.graphics.Color.parseColor("#CFB177");
                            gm2.p pVar3 = gm2.q.f354993e;
                            gm2.r rVar3 = new gm2.r();
                            gm2.o oVar3 = rVar3.f354998a;
                            oVar3.f354969a = i57;
                            oVar3.f354970b = k17;
                            map3 = map8;
                            oVar3.f354982n = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f79974xe7dce251, 0.0f);
                            rVar3.f354998a.f354983o = c1Var2.f();
                            int f17 = c1Var2.f();
                            gm2.o oVar4 = rVar3.f354998a;
                            oVar4.f354984p = f17;
                            oVar4.f354985q = parseColor2;
                            oVar4.f354979k = parseColor2;
                            context3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1);
                            int e17 = c1Var2.e();
                            gm2.o oVar5 = rVar3.f354998a;
                            oVar5.f354980l = e17;
                            oVar5.f354974f = parseColor;
                            java.lang.String m75945x2fec830710 = yl1Var8.m75945x2fec8307(4);
                            java.lang.String str3 = m75945x2fec830710 == null ? "" : m75945x2fec830710;
                            gm2.o oVar6 = rVar3.f354998a;
                            oVar6.getClass();
                            oVar6.f354978j = str3;
                            gm2.q a37 = rVar3.a(view);
                            z17 = false;
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a37);
                            map4 = map6;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 10:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int i68 = gm2.i1.f354944f;
                            gm2.e1 e1Var4 = new gm2.e1();
                            e1Var4.b(0, new gm2.t(spanColorMode, null, 2, null));
                            e1Var4.f((int) context4.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                            gm2.h1 h1Var3 = e1Var4.f354891a;
                            h1Var3.f354908f = i57;
                            h1Var3.f354911i = k17;
                            e1Var4.c((int) context4.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                            java.lang.String m75945x2fec830711 = yl1Var8.m75945x2fec8307(4);
                            e1Var4.e(m75945x2fec830711 == null ? "" : m75945x2fec830711);
                            gm2.i1 a38 = e1Var4.a();
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a38);
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 11:
                            map3 = specialColorMode;
                            map6 = map7;
                            android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int m75939xb282bd087 = yl1Var8.m75939xb282bd08(2);
                            if (m75939xb282bd087 == 1) {
                                android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563453c81);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
                                n17 = pm0.v.n(drawable);
                            } else if (m75939xb282bd087 == 2) {
                                android.graphics.drawable.Drawable drawable2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563454c82);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable2, "getDrawable(...)");
                                n17 = pm0.v.n(drawable2);
                            } else if (m75939xb282bd087 != 3) {
                                n17 = null;
                            } else {
                                android.graphics.drawable.Drawable drawable3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563455c83);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable3, "getDrawable(...)");
                                n17 = pm0.v.n(drawable3);
                            }
                            int i69 = gm2.i1.f354944f;
                            gm2.e1 e1Var5 = new gm2.e1();
                            e1Var5.b(0, new gm2.n(spanColorMode, null, 2, null));
                            e1Var5.f((int) context5.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                            e1Var5.c((int) context5.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                            java.lang.String string2 = context5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkx, java.lang.Integer.valueOf(yl1Var8.m75939xb282bd08(2)));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            e1Var5.e(string2);
                            e1Var5.f354891a.f354918p = n17;
                            gm2.i1 a39 = e1Var5.a();
                            z17 = false;
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a39);
                            map4 = map6;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 12:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (yl1Var8.m75939xb282bd08(2) > 0) {
                                java.lang.String m75945x2fec830712 = yl1Var8.m75945x2fec8307(4);
                                if (!(!(m75945x2fec830712 == null || m75945x2fec830712.length() == 0))) {
                                    m75945x2fec830712 = null;
                                }
                                if (m75945x2fec830712 == null) {
                                    mm2.n2 n2Var2 = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
                                    m75945x2fec830712 = (n2Var2 == null || (eq1Var2 = n2Var2.f410812g) == null) ? null : eq1Var2.m75945x2fec8307(0);
                                }
                                gm2.h hVar2 = gm2.j.f354947e;
                                gm2.f fVar2 = new gm2.f();
                                fVar2.b(yl1Var8.m75939xb282bd08(2), new gm2.d1(spanColorMode, sizeType));
                                java.lang.String str4 = m75945x2fec830712 == null ? "" : m75945x2fec830712;
                                gm2.i iVar3 = fVar2.f354898a;
                                iVar3.getClass();
                                iVar3.f354926d = str4;
                                gm2.i iVar4 = fVar2.f354898a;
                                iVar4.f354937o = i57;
                                iVar4.f354938p = k17;
                                gm2.j a47 = fVar2.a();
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a47);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 13:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (dk2.ef.I != null) {
                                java.lang.String m75945x2fec830713 = yl1Var8.m75945x2fec8307(4);
                                if (!(m75945x2fec830713 == null || m75945x2fec830713.length() == 0)) {
                                    android.content.Context context6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    int i76 = gm2.i1.f354944f;
                                    gm2.e1 e1Var6 = new gm2.e1();
                                    e1Var6.b(0, new gm2.s(spanColorMode, null, 2, null));
                                    e1Var6.f((int) context6.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                                    gm2.h1 h1Var4 = e1Var6.f354891a;
                                    h1Var4.f354908f = i57;
                                    h1Var4.f354911i = k17;
                                    java.lang.String m75945x2fec830714 = yl1Var8.m75945x2fec8307(4);
                                    e1Var6.e(m75945x2fec830714 == null ? "" : m75945x2fec830714);
                                    e1Var6.f354891a.f354919q = new int[]{android.graphics.Color.parseColor("#ccc72205"), android.graphics.Color.parseColor("#ccff611e")};
                                    gm2.i1 a48 = e1Var6.a();
                                    yl1Var8.m75939xb282bd08(0);
                                    linkedList.add(a48);
                                }
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 14:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String m75945x2fec830715 = yl1Var8.m75945x2fec8307(4);
                            if (!(m75945x2fec830715 == null || m75945x2fec830715.length() == 0)) {
                                android.content.Context context7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                int i77 = gm2.i1.f354944f;
                                gm2.e1 e1Var7 = new gm2.e1();
                                e1Var7.b(0, new gm2.x(spanColorMode, null, 2, null));
                                e1Var7.f((int) context7.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                                gm2.h1 h1Var5 = e1Var7.f354891a;
                                h1Var5.f354908f = i57;
                                h1Var5.f354911i = k17;
                                java.lang.String m75945x2fec830716 = yl1Var8.m75945x2fec8307(4);
                                e1Var7.e(m75945x2fec830716 == null ? "" : m75945x2fec830716);
                                e1Var7.f354891a.f354919q = new int[]{android.graphics.Color.parseColor("#ccffb752"), android.graphics.Color.parseColor("#ccff8326")};
                                gm2.i1 a49 = e1Var7.a();
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a49);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 15:
                        case 16:
                        case 20:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String m75945x2fec830717 = yl1Var8.m75945x2fec8307(4);
                            if (!(m75945x2fec830717 == null || m75945x2fec830717.length() == 0)) {
                                android.content.Context context8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                int i78 = gm2.i1.f354944f;
                                gm2.e1 e1Var8 = new gm2.e1();
                                e1Var8.b(0, new gm2.x(spanColorMode, null, 2, null));
                                e1Var8.f((int) context8.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                                e1Var8.c((int) context8.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                                java.lang.String m75945x2fec830718 = yl1Var8.m75945x2fec8307(4);
                                e1Var8.e(m75945x2fec830718 == null ? "" : m75945x2fec830718);
                                e1Var8.f354891a.f354905c = spanColorMode == gm2.c2.f354883i ? com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833) : (spanColorMode == gm2.c2.f354881g || spanColorMode == gm2.c2.f354884m) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
                                e1Var8.d(yl1Var8.m75945x2fec8307(3), false);
                                gm2.i1 a57 = e1Var8.a();
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a57);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 17:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String m75945x2fec830719 = yl1Var8.m75945x2fec8307(4);
                            if (!(m75945x2fec830719 == null || m75945x2fec830719.length() == 0)) {
                                android.content.Context context9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                int i79 = gm2.i1.f354944f;
                                gm2.e1 e1Var9 = new gm2.e1();
                                e1Var9.b(0, new gm2.x(spanColorMode, null, 2, null));
                                e1Var9.f((int) context9.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                                e1Var9.c((int) context9.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                                java.lang.String m75945x2fec830720 = yl1Var8.m75945x2fec8307(4);
                                e1Var9.e(m75945x2fec830720 == null ? "" : m75945x2fec830720);
                                e1Var9.f354891a.f354919q = new int[]{android.graphics.Color.parseColor("#ccff7c30"), android.graphics.Color.parseColor("#ccf46a4d")};
                                gm2.i1 a58 = e1Var9.a();
                                yl1Var8.m75939xb282bd08(0);
                                linkedList.add(a58);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 18:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int i86 = gm2.i1.f354944f;
                            gm2.e1 e1Var10 = new gm2.e1();
                            e1Var10.b(0, new gm2.t(spanColorMode, null, 2, null));
                            e1Var10.f((int) context10.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                            gm2.h1 h1Var6 = e1Var10.f354891a;
                            h1Var6.f354908f = i57;
                            h1Var6.f354911i = k17;
                            e1Var10.c((int) context10.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                            java.lang.String m75945x2fec830721 = yl1Var8.m75945x2fec8307(4);
                            e1Var10.e(m75945x2fec830721 == null ? "" : m75945x2fec830721);
                            gm2.i1 a59 = e1Var10.a();
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a59);
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 19:
                            android.content.Context context11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            int color = spanColorMode == gm2.c2.f354883i ? com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d) : (spanColorMode == gm2.c2.f354881g || spanColorMode == gm2.c2.f354884m) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
                            int ordinal = spanColorMode.ordinal();
                            int color2 = ordinal != 1 ? ordinal != 2 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231) : com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
                            gm2.p pVar4 = gm2.q.f354993e;
                            gm2.r rVar4 = new gm2.r();
                            gm2.o oVar7 = rVar4.f354998a;
                            oVar7.f354969a = i57;
                            oVar7.f354970b = k17;
                            map6 = map7;
                            map3 = specialColorMode;
                            oVar7.f354982n = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f80371xc89ae77d, 0.0f);
                            oVar7.f354983o = c1Var2.e();
                            oVar7.f354984p = c1Var2.f();
                            oVar7.f354985q = color2;
                            oVar7.f354979k = color2;
                            context11.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1);
                            rVar4.f354998a.f354980l = c1Var2.e();
                            oVar7.f354974f = color;
                            java.lang.String m75945x2fec830722 = yl1Var8.m75945x2fec8307(4);
                            java.lang.String str5 = m75945x2fec830722 == null ? "" : m75945x2fec830722;
                            gm2.o oVar8 = rVar4.f354998a;
                            oVar8.getClass();
                            oVar8.f354978j = str5;
                            gm2.q a67 = rVar4.a(view);
                            z17 = false;
                            yl1Var8.m75939xb282bd08(0);
                            linkedList.add(a67);
                            map4 = map6;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                    }
                    return linkedList;
                }
                it = it14;
                map3 = specialColorMode;
                iArr2 = spanFilter;
                i28 = i49;
                map4 = map7;
                map7 = map4;
                it14 = it;
                spanFilter = iArr2;
                i49 = i28;
                specialColorMode = map3;
            }
        }
        if (num2 != null && num2.intValue() > 0) {
            int i87 = 0;
            for (android.text.style.UpdateLayout updateLayout : linkedList) {
                gm2.y1 y1Var = updateLayout instanceof gm2.y1 ? (gm2.y1) updateLayout : null;
                i87 += y1Var != null ? y1Var.a() : 0;
            }
            while (i87 >= num2.intValue()) {
                kz5.h0.E(linkedList);
                i87 = 0;
                for (android.text.style.UpdateLayout updateLayout2 : linkedList) {
                    gm2.y1 y1Var2 = updateLayout2 instanceof gm2.y1 ? (gm2.y1) updateLayout2 : null;
                    i87 += y1Var2 != null ? y1Var2.a() : 0;
                }
            }
        }
        return linkedList;
    }

    public final android.text.style.ImageSpan b(int i17, android.view.View view, gm2.t1 t1Var, int i18, int i19, java.lang.String str) {
        if (t1Var == null) {
            t1Var = new gm2.t1(gm2.c2.f354881g, gm2.e2.f354894g);
        }
        gm2.p pVar = gm2.q.f354993e;
        gm2.r rVar = new gm2.r();
        rVar.b(i17, java.lang.String.valueOf(i17), t1Var);
        gm2.o oVar = rVar.f354998a;
        oVar.f354969a = i18;
        oVar.f354970b = i19 + 1;
        zl2.r4 r4Var = zl2.r4.f555483a;
        rVar.f354998a.f354985q = r4Var.W0(i17);
        rVar.f354998a.f354979k = r4Var.W0(i17);
        rVar.c(str);
        return rVar.a(view);
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f354867o).mo141623x754a37bb()).intValue();
    }

    public final int f() {
        return ((java.lang.Number) ((jz5.n) f354870r).mo141623x754a37bb()).intValue();
    }

    public final int g() {
        return ((java.lang.Number) ((jz5.n) f354871s).mo141623x754a37bb()).intValue();
    }

    public final int h() {
        return ((java.lang.Number) ((jz5.n) f354874v).mo141623x754a37bb()).intValue();
    }

    public final int i() {
        return ((java.lang.Number) ((jz5.n) f354866n).mo141623x754a37bb()).intValue();
    }

    public final int j() {
        return ((java.lang.Number) ((jz5.n) f354858f).mo141623x754a37bb()).intValue();
    }

    public final int k() {
        return ((java.lang.Number) ((jz5.n) f354857e).mo141623x754a37bb()).intValue();
    }

    public final int l() {
        return ((java.lang.Number) ((jz5.n) f354854b).mo141623x754a37bb()).intValue();
    }

    public final android.text.style.ImageSpan m(int i17) {
        return i17 == k() ? (android.text.style.ImageSpan) ((jz5.n) f354876x).mo141623x754a37bb() : new android.text.style.ImageSpan(c(this, i17, 0, 2, null));
    }

    public final java.lang.String o(java.util.List spanList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanList, "spanList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = spanList.iterator();
        while (it.hasNext()) {
            sb6.append(" ");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final float p(java.lang.String text, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        return paint.measureText(text, 0, text.length());
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 q(android.content.Context context, java.lang.String msg, java.util.List spans, boolean z17) {
        int length;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spans, "spans");
        int size = spans.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append(" ");
        }
        if (z17) {
            sb6.append(msg);
            length = 0;
        } else {
            sb6.insert(0, msg);
            length = msg.length();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String valueOf = java.lang.String.valueOf(sb6);
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, valueOf));
        for (int i18 = 0; i18 < size; i18++) {
            int i19 = length + i18;
            f0Var.c(spans.get(i18), i19, i19 + 1, 33);
        }
        return f0Var;
    }

    public final java.lang.String s(java.util.LinkedList linkedList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (linkedList != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.yl1 yl1Var = (r45.yl1) obj;
                sb6.append("[" + i17 + "],type:" + yl1Var.m75939xb282bd08(0) + ",level:" + yl1Var.m75939xb282bd08(2) + ';');
                i17 = i18;
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}

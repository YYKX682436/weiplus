package cf5;

/* loaded from: classes11.dex */
public final class b implements e90.e {

    /* renamed from: c, reason: collision with root package name */
    public int f122466c;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f122469f;

    /* renamed from: g, reason: collision with root package name */
    public v11.s f122470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f122471h;

    /* renamed from: i, reason: collision with root package name */
    public int f122472i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f122474k;

    /* renamed from: m, reason: collision with root package name */
    public v11.s f122476m;

    /* renamed from: s, reason: collision with root package name */
    public boolean f122482s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f122483t;

    /* renamed from: w, reason: collision with root package name */
    public v11.s f122486w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f122487x;

    /* renamed from: z, reason: collision with root package name */
    public int f122489z;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f122464a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f122465b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f122467d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f122468e = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f122473j = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.StringBuilder f122475l = new java.lang.StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f122477n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f122478o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f122479p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f122480q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int f122481r = -1;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f122484u = "";

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.StringBuilder f122485v = new java.lang.StringBuilder();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f122488y = new java.util.ArrayList();

    public static /* synthetic */ java.util.List c(cf5.b bVar, java.util.List list, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        return bVar.b(list, i17);
    }

    public static final void d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.List list, cf5.b bVar) {
        java.util.List g17;
        if (((java.util.List) h0Var.f391656d).isEmpty()) {
            return;
        }
        java.util.List<xv5.h> list2 = (java.util.List) h0Var.f391656d;
        bVar.getClass();
        if (list2.isEmpty()) {
            g17 = kz5.p0.f395529d;
        } else {
            cf5.b bVar2 = new cf5.b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (xv5.h hVar : list2) {
                xv5.f b17 = hVar.b();
                xv5.e b18 = b17 != null ? b17.b() : null;
                if (b18 != null) {
                    b18.f538990d &= -14337;
                    boolean[] zArr = b18.f538996m;
                    zArr[1] = true;
                    b18.f538994h = 0;
                    zArr[5] = true;
                }
                arrayList.add(hVar);
            }
            bVar2.a(arrayList);
            g17 = bVar2.g();
        }
        list.addAll(g17);
        h0Var.f391656d = new java.util.ArrayList();
    }

    public static final void e(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, cf5.b bVar, int i17, java.util.List list) {
        if (((java.util.List) h0Var.f391656d).isEmpty()) {
            return;
        }
        java.util.List b17 = bVar.b((java.util.List) h0Var.f391656d, i17 + 1);
        if (!b17.isEmpty()) {
            list.add(new v11.j(b17, cf5.c.c((java.util.List) h0Var.f391656d)));
        }
        h0Var.f391656d = new java.util.ArrayList();
    }

    public java.util.List a(java.util.List wraps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wraps, "wraps");
        try {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.util.Iterator it = wraps.iterator();
            while (it.hasNext()) {
                r((xv5.h) it.next());
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MarkdownAssembler", th6, "", new java.lang.Object[0]);
        }
        return s();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.util.List r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9
            kz5.p0 r7 = kz5.p0.f395529d
            return r7
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f391656d = r2
            kotlin.jvm.internal.h0 r2 = new kotlin.jvm.internal.h0
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f391656d = r3
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r7.next()
            xv5.h r3 = (xv5.h) r3
            xv5.f r4 = r3.b()
            if (r4 == 0) goto L5c
            xv5.e r4 = r4.b()
            if (r4 == 0) goto L5c
            int r4 = r4.f538994h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r4.intValue()
            if (r5 <= 0) goto L50
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L54
            goto L55
        L54:
            r4 = 0
        L55:
            if (r4 == 0) goto L5c
            int r4 = r4.intValue()
            goto L5d
        L5c:
            r4 = r8
        L5d:
            if (r4 <= r8) goto L6a
            d(r1, r0, r6)
            java.lang.Object r4 = r2.f391656d
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
            goto L2a
        L6a:
            e(r2, r6, r8, r0)
            java.lang.Object r4 = r1.f391656d
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
            goto L2a
        L75:
            d(r1, r0, r6)
            e(r2, r6, r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cf5.b.b(java.util.List, int):java.util.List");
    }

    public final void f(int i17) {
        int i18 = this.f122489z;
        this.f122489z = 0;
        if (i18 <= 0) {
            return;
        }
        if (i18 >= 2) {
            j();
            return;
        }
        java.util.List list = this.f122467d;
        if (!list.isEmpty()) {
            ((java.util.ArrayList) list).add(new v11.a("\n", false, false, false, null, false, false, null));
        } else if (this.f122469f != null || (!this.f122473j.isEmpty()) || (!this.f122468e.isEmpty())) {
            m();
        } else if (!this.f122465b.isEmpty()) {
            k();
        } else {
            j();
        }
    }

    public java.util.List g() {
        f(0);
        k();
        o();
        m();
        l();
        p();
        i();
        n();
        h();
        return kz5.n0.S0(this.f122464a);
    }

    public final void h() {
        if (this.f122487x) {
            java.util.List list = this.f122488y;
            if (!list.isEmpty()) {
                java.util.List b17 = b(list, 1);
                if (true ^ b17.isEmpty()) {
                    ((java.util.ArrayList) this.f122464a).add(new v11.j(b17, cf5.c.c(list)));
                }
            }
            this.f122487x = false;
            ((java.util.ArrayList) list).clear();
        }
    }

    public final void i() {
        if (this.f122483t) {
            java.lang.StringBuilder sb6 = this.f122485v;
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            char[] cArr = {'\n'};
            int length = sb7.length() - 1;
            int i17 = 0;
            boolean z17 = false;
            while (i17 <= length) {
                boolean E = kz5.z.E(cArr, sb7.charAt(!z17 ? i17 : length));
                if (z17) {
                    if (!E) {
                        break;
                    } else {
                        length--;
                    }
                } else if (E) {
                    i17++;
                } else {
                    z17 = true;
                }
            }
            java.lang.String obj = sb7.subSequence(i17, length + 1).toString();
            if (obj.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownAssembler", "flushCodeBlock language=" + this.f122484u + ", contentLen=" + obj.length() + ", sourceRange=" + this.f122486w + ", snippet=" + r26.i0.t(r26.p0.E0(obj, 120), "\n", "\\n", false));
                ((java.util.ArrayList) this.f122464a).add(new v11.k(this.f122484u, obj, this.f122486w));
            }
            this.f122483t = false;
            this.f122484u = "";
            r26.e0.d(sb6);
            this.f122486w = null;
        }
    }

    public final void j() {
        k();
        o();
        m();
        l();
        p();
    }

    public final void k() {
        java.util.List list = this.f122465b;
        if (!list.isEmpty()) {
            ((java.util.ArrayList) this.f122464a).add(new v11.l(this.f122466c, kz5.n0.S0(list), cf5.c.b(list)));
            ((java.util.ArrayList) list).clear();
            this.f122466c = 0;
        }
    }

    public final void l() {
        m();
        java.util.List list = this.f122468e;
        if (!list.isEmpty()) {
            ((java.util.ArrayList) this.f122464a).add(new v11.n(kz5.n0.S0(list)));
            ((java.util.ArrayList) list).clear();
        }
    }

    public final void m() {
        if (this.f122469f != null) {
            java.util.List list = this.f122473j;
            if (!list.isEmpty()) {
                java.util.List list2 = this.f122468e;
                java.lang.String str = this.f122469f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                ((java.util.ArrayList) list2).add(new v11.i(str, this.f122471h, this.f122472i, kz5.n0.S0(list), cf5.c.d(this.f122470g, cf5.c.b(list))));
                ((java.util.ArrayList) list).clear();
                this.f122469f = null;
                this.f122470g = null;
                this.f122472i = 0;
            }
        }
    }

    public final void n() {
        if (this.f122474k) {
            java.lang.StringBuilder sb6 = this.f122475l;
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            java.lang.String v07 = r26.n0.v0(sb7, '\n');
            if (v07.length() > 0) {
                ((java.util.ArrayList) this.f122464a).add(new v11.o(v07, this.f122476m));
            }
            this.f122474k = false;
            r26.e0.d(sb6);
            this.f122476m = null;
        }
    }

    public final void o() {
        java.util.List list;
        while (true) {
            list = this.f122467d;
            if (!(!list.isEmpty())) {
                break;
            }
            java.lang.String str = ((v11.a) kz5.n0.i0(list)).f513851a;
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= str.length()) {
                    z17 = true;
                    break;
                } else {
                    if (!(str.charAt(i17) == '\n')) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (!z17) {
                break;
            } else {
                ((java.util.ArrayList) list).remove(kz5.c0.h(list));
            }
        }
        if (!list.isEmpty()) {
            ((java.util.ArrayList) this.f122464a).add(new v11.p(kz5.n0.S0(list)));
            ((java.util.ArrayList) list).clear();
        }
    }

    public final void p() {
        if (this.f122482s) {
            java.util.List list = this.f122479p;
            boolean z17 = !list.isEmpty();
            java.util.List list2 = this.f122478o;
            if (z17) {
                ((java.util.ArrayList) list2).add(kz5.n0.S0(list));
                ((java.util.ArrayList) list).clear();
            }
            java.util.List list3 = this.f122477n;
            boolean z18 = !list3.isEmpty();
            java.util.List list4 = this.f122480q;
            if (z18 || (!list2.isEmpty())) {
                ((java.util.ArrayList) this.f122464a).add(new v11.q(kz5.n0.S0(list3), kz5.n0.S0(list2), kz5.n0.S0(list4), null));
            }
            ((java.util.ArrayList) list3).clear();
            ((java.util.ArrayList) list2).clear();
            ((java.util.ArrayList) list4).clear();
            this.f122481r = -1;
            this.f122482s = false;
        }
    }

    public final void q(xv5.h hVar, int i17) {
        java.util.ArrayList arrayList;
        xv5.e b17;
        xv5.f b18 = hVar.b();
        xv5.j jVar = null;
        xv5.i iVar = (b18 == null || (b17 = b18.b()) == null) ? null : b17.f538996m[4] ? b17.f538993g : new xv5.i();
        int i18 = iVar != null ? iVar.f539021d : 0;
        int i19 = iVar != null ? iVar.f539022e : 0;
        boolean a17 = iVar != null ? iVar.f539023f : cf5.c.a(i17, 16);
        if (iVar != null) {
            jVar = iVar.f539025h[4] ? iVar.f539024g : xv5.j.CBTTableColumnAlignment_Left;
        }
        int i27 = -1;
        int i28 = jVar == null ? -1 : cf5.a.f122463a[jVar.ordinal()];
        v11.l0 l0Var = i28 != 1 ? i28 != 2 ? v11.l0.f513970d : v11.l0.f513972f : v11.l0.f513971e;
        v11.k0 k0Var = new v11.k0(i18, i19, a17, l0Var, kz5.b0.c(t(hVar)), cf5.c.e(hVar));
        while (true) {
            arrayList = (java.util.ArrayList) this.f122480q;
            if (arrayList.size() > i19) {
                break;
            } else {
                arrayList.add(v11.l0.f513970d);
            }
        }
        java.lang.Object obj = arrayList.get(i19);
        v11.l0 l0Var2 = v11.l0.f513970d;
        if (obj == l0Var2 || l0Var != l0Var2) {
            arrayList.set(i19, l0Var);
        }
        java.util.List list = this.f122479p;
        if (!a17) {
            int i29 = this.f122481r;
            if (i18 != i29 && i29 >= 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                if (!arrayList2.isEmpty()) {
                    ((java.util.ArrayList) this.f122478o).add(kz5.n0.S0(arrayList2));
                    arrayList2.clear();
                }
            }
            this.f122481r = i18;
        }
        boolean z17 = k0Var.f513963c;
        v11.s sVar = k0Var.f513966f;
        java.util.List list2 = k0Var.f513965e;
        int i37 = k0Var.f513962b;
        if (z17) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f122477n;
            java.util.Iterator it = arrayList3.iterator();
            int i38 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((v11.k0) it.next()).f513962b == i37) {
                    i27 = i38;
                    break;
                }
                i38++;
            }
            if (i27 < 0) {
                arrayList3.add(k0Var);
                return;
            } else {
                v11.k0 k0Var2 = (v11.k0) arrayList3.get(i27);
                arrayList3.set(i27, v11.k0.a(k0Var2, 0, 0, false, null, kz5.n0.t0(k0Var2.f513965e, list2), cf5.c.d(k0Var2.f513966f, sVar), 15, null));
                return;
            }
        }
        java.util.ArrayList arrayList4 = (java.util.ArrayList) list;
        java.util.Iterator it6 = arrayList4.iterator();
        int i39 = 0;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            if (((v11.k0) it6.next()).f513962b == i37) {
                i27 = i39;
                break;
            }
            i39++;
        }
        if (i27 < 0) {
            arrayList4.add(k0Var);
        } else {
            v11.k0 k0Var3 = (v11.k0) arrayList4.get(i27);
            arrayList4.set(i27, v11.k0.a(k0Var3, 0, 0, false, null, kz5.n0.t0(k0Var3.f513965e, list2), cf5.c.d(k0Var3.f513966f, sVar), 15, null));
        }
    }

    public final void r(xv5.h hVar) {
        xv5.i iVar;
        xv5.d dVar;
        xv5.d dVar2;
        boolean z17;
        java.lang.String str = hVar.m176056x6e095e9(1) ? hVar.f539015d : "";
        java.lang.String str2 = str != null ? str : "";
        xv5.f b17 = hVar.b();
        xv5.e b18 = b17 != null ? b17.b() : null;
        int i17 = b18 != null ? b18.f538990d : 0;
        xv5.g gVar = xv5.g.CBTStreamTextHeadingLevel_None;
        xv5.g gVar2 = b17 != null ? b17.f539004n[6] ? b17.f539002i : gVar : null;
        if (gVar2 == null) {
            gVar2 = gVar;
        }
        boolean z18 = this.f122483t;
        java.lang.StringBuilder sb6 = this.f122485v;
        if (z18) {
            if (cf5.c.a(i17, 256)) {
                this.f122486w = cf5.c.d(this.f122486w, cf5.c.e(hVar));
                i();
                return;
            } else if (cf5.c.a(i17, 512)) {
                this.f122486w = cf5.c.d(this.f122486w, cf5.c.e(hVar));
                sb6.append(str2);
                return;
            } else {
                this.f122486w = cf5.c.d(this.f122486w, cf5.c.e(hVar));
                sb6.append(str2);
                return;
            }
        }
        boolean z19 = this.f122474k;
        java.lang.StringBuilder sb7 = this.f122475l;
        if (z19) {
            if (cf5.c.a(i17, 65536)) {
                this.f122476m = cf5.c.d(this.f122476m, cf5.c.e(hVar));
                n();
                return;
            } else if (cf5.c.a(i17, 131072)) {
                this.f122476m = cf5.c.d(this.f122476m, cf5.c.e(hVar));
                sb7.append(str2);
                return;
            } else {
                this.f122476m = cf5.c.d(this.f122476m, cf5.c.e(hVar));
                sb7.append(str2);
                return;
            }
        }
        boolean z27 = this.f122487x;
        java.util.List list = this.f122488y;
        if (z27) {
            if (cf5.c.a(i17, 4096)) {
                h();
                return;
            } else if (cf5.c.a(i17, 8192)) {
                ((java.util.ArrayList) list).add(hVar);
                return;
            } else {
                ((java.util.ArrayList) list).add(hVar);
                return;
            }
        }
        if (str2.length() > 0) {
            int i18 = 0;
            while (true) {
                if (i18 >= str2.length()) {
                    z17 = true;
                    break;
                }
                if (!(str2.charAt(i18) == '\n')) {
                    z17 = false;
                    break;
                }
                i18++;
            }
            if (z17) {
                this.f122489z += str2.length();
                return;
            }
        }
        f(i17);
        if (cf5.c.a(i17, 128)) {
            j();
            this.f122483t = true;
            this.f122484u = r26.n0.u0(str2).toString();
            r26.e0.d(sb6);
            this.f122486w = cf5.c.e(hVar);
            return;
        }
        if (cf5.c.a(i17, 512)) {
            if (this.f122483t) {
                this.f122486w = cf5.c.d(this.f122486w, cf5.c.e(hVar));
            } else {
                j();
                this.f122483t = true;
                r26.e0.d(sb6);
                this.f122486w = cf5.c.e(hVar);
            }
            sb6.append(str2);
            return;
        }
        if (cf5.c.a(i17, 256)) {
            this.f122486w = cf5.c.d(this.f122486w, cf5.c.e(hVar));
            i();
            return;
        }
        boolean a17 = cf5.c.a(i17, 1024);
        java.util.List list2 = this.f122467d;
        java.util.List list3 = this.f122473j;
        if (a17 || cf5.c.a(i17, 16384)) {
            boolean z28 = cf5.c.a(i17, 8) || cf5.c.a(i17, 16);
            if (b18 != null) {
                iVar = b18.f538996m[4] ? b18.f538993g : new xv5.i();
            } else {
                iVar = null;
            }
            boolean z29 = iVar != null;
            if (this.f122469f != null || (!((java.util.ArrayList) list3).isEmpty())) {
                ((java.util.ArrayList) list3).add(t(hVar));
                return;
            }
            if (z28 && this.f122482s && z29) {
                q(hVar, i17);
                return;
            }
            if (!z28 || !this.f122482s) {
                p();
                k();
                ((java.util.ArrayList) list2).add(t(hVar));
                return;
            }
            v11.a t17 = t(hVar);
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f122479p;
            boolean z37 = !arrayList.isEmpty();
            v11.s sVar = t17.f513858h;
            if (z37) {
                v11.k0 k0Var = (v11.k0) kz5.n0.i0(arrayList);
                arrayList.set(kz5.c0.h(arrayList), v11.k0.a(k0Var, 0, 0, false, null, kz5.n0.u0(k0Var.f513965e, t17), cf5.c.d(k0Var.f513966f, sVar), 15, null));
                return;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f122477n;
            if (true ^ arrayList2.isEmpty()) {
                v11.k0 k0Var2 = (v11.k0) kz5.n0.i0(arrayList2);
                arrayList2.set(kz5.c0.h(arrayList2), v11.k0.a(k0Var2, 0, 0, false, null, kz5.n0.u0(k0Var2.f513965e, t17), cf5.c.d(k0Var2.f513966f, sVar), 15, null));
                return;
            }
            return;
        }
        if (cf5.c.a(i17, 32768)) {
            j();
            this.f122474k = true;
            r26.e0.d(sb7);
            this.f122476m = cf5.c.e(hVar);
            return;
        }
        if (cf5.c.a(i17, 131072)) {
            if (this.f122474k) {
                this.f122476m = cf5.c.d(this.f122476m, cf5.c.e(hVar));
            } else {
                j();
                this.f122474k = true;
                r26.e0.d(sb7);
                this.f122476m = cf5.c.e(hVar);
            }
            sb7.append(str2);
            return;
        }
        if (cf5.c.a(i17, 65536)) {
            this.f122476m = cf5.c.d(this.f122476m, cf5.c.e(hVar));
            n();
            return;
        }
        if (cf5.c.a(i17, 2048)) {
            j();
            this.f122487x = true;
            ((java.util.ArrayList) list).clear();
            return;
        }
        if (cf5.c.a(i17, 8192)) {
            if (!this.f122487x) {
                j();
                this.f122487x = true;
                ((java.util.ArrayList) list).clear();
            }
            ((java.util.ArrayList) list).add(hVar);
            return;
        }
        if (cf5.c.a(i17, 4096)) {
            ((java.util.ArrayList) list).add(hVar);
            h();
            return;
        }
        if (cf5.c.a(i17, 64)) {
            j();
            ((java.util.ArrayList) this.f122464a).add(new v11.m(cf5.c.e(hVar)));
            return;
        }
        if (cf5.c.a(i17, 1)) {
            k();
            o();
            p();
            m();
            if (b18 != null) {
                dVar2 = b18.f538996m[3] ? b18.f538992f : new xv5.d();
            } else {
                dVar2 = null;
            }
            int i19 = dVar2 != null ? dVar2.f538987d : 1;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(i19);
            sb8.append('.');
            this.f122469f = sb8.toString();
            this.f122470g = cf5.c.e(hVar);
            this.f122471h = true;
            this.f122472i = dVar2 != null ? dVar2.f538988e : 0;
            return;
        }
        if (cf5.c.a(i17, 2)) {
            k();
            o();
            p();
            m();
            if (b18 != null) {
                dVar = b18.f538996m[3] ? b18.f538992f : new xv5.d();
            } else {
                dVar = null;
            }
            this.f122469f = "•";
            this.f122470g = cf5.c.e(hVar);
            this.f122471h = false;
            this.f122472i = dVar != null ? dVar.f538988e : 0;
            return;
        }
        if (cf5.c.a(i17, 4)) {
            ((java.util.ArrayList) list3).add(t(hVar));
            return;
        }
        if (cf5.c.a(i17, 16) || cf5.c.a(i17, 8)) {
            k();
            o();
            m();
            l();
            this.f122482s = true;
            q(hVar, i17);
            return;
        }
        if (cf5.c.a(i17, 32)) {
            this.f122482s = true;
            return;
        }
        p();
        l();
        if (gVar2 != gVar) {
            o();
            this.f122466c = gVar2.f539013d;
            ((java.util.ArrayList) this.f122465b).add(t(hVar));
        } else {
            k();
            if (str2.length() > 0) {
                ((java.util.ArrayList) list2).add(t(hVar));
            }
        }
    }

    public java.util.List s() {
        java.util.List V0 = kz5.n0.V0(this.f122464a);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f122465b;
        if (!arrayList.isEmpty()) {
            ((java.util.ArrayList) V0).add(new v11.l(this.f122466c, kz5.n0.S0(arrayList), cf5.c.b(arrayList)));
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f122467d;
        if (!arrayList2.isEmpty()) {
            ((java.util.ArrayList) V0).add(new v11.p(kz5.n0.S0(arrayList2)));
        }
        java.util.List V02 = kz5.n0.V0(this.f122468e);
        if (this.f122469f != null) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f122473j;
            if (!arrayList3.isEmpty()) {
                java.lang.String str = this.f122469f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                ((java.util.ArrayList) V02).add(new v11.i(str, this.f122471h, this.f122472i, kz5.n0.S0(arrayList3), cf5.c.d(this.f122470g, cf5.c.b(arrayList3))));
            }
        }
        if (!((java.util.ArrayList) V02).isEmpty()) {
            ((java.util.ArrayList) V0).add(new v11.n(V02));
        }
        if (this.f122482s) {
            java.util.ArrayList arrayList4 = (java.util.ArrayList) this.f122477n;
            boolean z17 = !arrayList4.isEmpty();
            java.util.List list = this.f122478o;
            java.util.List list2 = this.f122479p;
            if (z17 || (!((java.util.ArrayList) list).isEmpty()) || (!((java.util.ArrayList) list2).isEmpty())) {
                java.util.List V03 = kz5.n0.V0(list);
                java.util.ArrayList arrayList5 = (java.util.ArrayList) list2;
                if (!arrayList5.isEmpty()) {
                    ((java.util.ArrayList) V03).add(kz5.n0.S0(arrayList5));
                }
                ((java.util.ArrayList) V0).add(new v11.q(kz5.n0.S0(arrayList4), V03, kz5.n0.S0(this.f122480q), null));
            }
        }
        if (this.f122483t) {
            java.lang.StringBuilder sb6 = this.f122485v;
            if (sb6.length() > 0) {
                java.lang.String str2 = this.f122484u;
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                ((java.util.ArrayList) V0).add(new v11.k(str2, sb7, this.f122486w));
            }
        }
        if (this.f122474k) {
            java.lang.StringBuilder sb8 = this.f122475l;
            if (sb8.length() > 0) {
                java.lang.String sb9 = sb8.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
                ((java.util.ArrayList) V0).add(new v11.o(sb9, this.f122476m));
            }
        }
        if (this.f122487x) {
            java.util.ArrayList arrayList6 = (java.util.ArrayList) this.f122488y;
            if (!arrayList6.isEmpty()) {
                java.util.List c17 = c(this, arrayList6, 0, 2, null);
                if (true ^ c17.isEmpty()) {
                    ((java.util.ArrayList) V0).add(new v11.j(c17, cf5.c.c(arrayList6)));
                }
            }
        }
        return V0;
    }

    public final v11.a t(xv5.h hVar) {
        java.lang.String str;
        xv5.e b17;
        xv5.e b18;
        java.lang.String str2 = hVar.m176056x6e095e9(1) ? hVar.f539015d : "";
        java.lang.String str3 = str2 == null ? "" : str2;
        xv5.f b19 = hVar.b();
        int i17 = 0;
        boolean z17 = b19 != null ? b19.f538998e : false;
        boolean z18 = b19 != null ? b19.f538999f : false;
        boolean z19 = b19 != null ? b19.f539000g : false;
        if ((b19 != null ? b19.f539001h : false) && b19 != null && (b18 = b19.b()) != null) {
            java.lang.String str4 = b18.f538996m[2] ? b18.f538991e : "";
            if (str4 != null) {
                if (str4.length() > 0) {
                    str = str4;
                    if (b19 != null && (b17 = b19.b()) != null) {
                        i17 = b17.f538990d;
                    }
                    return new v11.a(str3, z17, z18, z19, str, cf5.c.a(i17, 1024), cf5.c.a(i17, 16384), cf5.c.e(hVar));
                }
            }
        }
        str = null;
        if (b19 != null) {
            i17 = b17.f538990d;
        }
        return new v11.a(str3, z17, z18, z19, str, cf5.c.a(i17, 1024), cf5.c.a(i17, 16384), cf5.c.e(hVar));
    }
}

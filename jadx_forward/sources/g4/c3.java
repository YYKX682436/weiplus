package g4;

/* loaded from: classes5.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f349762a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f349763b;

    /* renamed from: c, reason: collision with root package name */
    public int f349764c;

    /* renamed from: d, reason: collision with root package name */
    public int f349765d;

    /* renamed from: e, reason: collision with root package name */
    public int f349766e;

    /* renamed from: f, reason: collision with root package name */
    public int f349767f;

    /* renamed from: g, reason: collision with root package name */
    public int f349768g;

    /* renamed from: h, reason: collision with root package name */
    public final u26.w f349769h;

    /* renamed from: i, reason: collision with root package name */
    public final u26.w f349770i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f349771j;

    /* renamed from: k, reason: collision with root package name */
    public g4.z0 f349772k;

    /* renamed from: l, reason: collision with root package name */
    public final g4.h3 f349773l;

    public c3(g4.h3 h3Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f349773l = h3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f349762a = arrayList;
        this.f349763b = arrayList;
        this.f349769h = u26.z.a(-1, null, null, 6, null);
        this.f349770i = u26.z.a(-1, null, null, 6, null);
        this.f349771j = new java.util.LinkedHashMap();
        this.f349772k = g4.z0.f350177d;
    }

    public final g4.c4 a(g4.z4 z4Var) {
        java.lang.Integer num;
        int i17;
        int size;
        java.util.List list = this.f349763b;
        java.util.List S0 = kz5.n0.S0(list);
        g4.h3 h3Var = this.f349773l;
        if (z4Var != null) {
            int d17 = d();
            int i18 = -this.f349764c;
            int h17 = kz5.c0.h(list) - this.f349764c;
            int i19 = i18;
            while (true) {
                i17 = z4Var.f350191e;
                if (i19 >= i17) {
                    break;
                }
                if (i19 > h17) {
                    size = h3Var.f349885a;
                } else {
                    size = ((g4.z3) ((java.util.ArrayList) list).get(this.f349764c + i19)).f350186a.size();
                }
                d17 += size;
                i19++;
            }
            int i27 = d17 + z4Var.f350192f;
            if (i17 < i18) {
                i27 -= h3Var.f349885a;
            }
            num = java.lang.Integer.valueOf(i27);
        } else {
            num = null;
        }
        return new g4.c4(S0, num, h3Var, d());
    }

    public final void b(g4.f1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int b17 = event.b();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f349763b;
        if (!(b17 <= arrayList.size())) {
            throw new java.lang.IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + event.b()).toString());
        }
        java.util.Map map = this.f349771j;
        g4.a1 a1Var = event.f349812a;
        map.remove(a1Var);
        this.f349772k = this.f349772k.c(a1Var, g4.x0.f350138c);
        int ordinal = a1Var.ordinal();
        java.util.List list = this.f349762a;
        int i17 = event.f349815d;
        if (ordinal == 1) {
            int b18 = event.b();
            for (int i18 = 0; i18 < b18; i18++) {
                ((java.util.ArrayList) list).remove(0);
            }
            this.f349764c -= event.b();
            this.f349765d = i17 != Integer.MIN_VALUE ? i17 : 0;
            int i19 = this.f349767f + 1;
            this.f349767f = i19;
            ((u26.o) this.f349769h).mo167482x64c1a5c(java.lang.Integer.valueOf(i19));
            return;
        }
        if (ordinal != 2) {
            throw new java.lang.IllegalArgumentException("cannot drop " + a1Var);
        }
        int b19 = event.b();
        for (int i27 = 0; i27 < b19; i27++) {
            ((java.util.ArrayList) list).remove(arrayList.size() - 1);
        }
        this.f349766e = i17 != Integer.MIN_VALUE ? i17 : 0;
        int i28 = this.f349768g + 1;
        this.f349768g = i28;
        ((u26.o) this.f349770i).mo167482x64c1a5c(java.lang.Integer.valueOf(i28));
    }

    public final g4.f1 c(g4.a1 loadType, g4.b5 hint) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hint, "hint");
        g4.h3 h3Var = this.f349773l;
        g4.f1 f1Var = null;
        if (h3Var.f349889e == Integer.MAX_VALUE) {
            return null;
        }
        java.util.List list = this.f349763b;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() <= 2) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 += ((g4.z3) it.next()).f350186a.size();
        }
        int i19 = h3Var.f349889e;
        if (i18 <= i19) {
            return null;
        }
        if (!(loadType != g4.a1.REFRESH)) {
            throw new java.lang.IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i27 = 0;
        int i28 = 0;
        while (i27 < arrayList.size()) {
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            int i29 = 0;
            while (it6.hasNext()) {
                i29 += ((g4.z3) it6.next()).f350186a.size();
            }
            if (i29 - i28 <= i19) {
                break;
            }
            int size = loadType.ordinal() != 1 ? ((g4.z3) ((java.util.ArrayList) list).get(kz5.c0.h(list) - i27)).f350186a.size() : ((g4.z3) arrayList.get(i27)).f350186a.size();
            if (((loadType.ordinal() != 1 ? hint.f349749b : hint.f349748a) - i28) - size < h3Var.f349886b) {
                break;
            }
            i28 += size;
            i27++;
        }
        if (i27 != 0) {
            int h17 = loadType.ordinal() != 1 ? (kz5.c0.h(list) - this.f349764c) - (i27 - 1) : -this.f349764c;
            int h18 = loadType.ordinal() != 1 ? kz5.c0.h(list) - this.f349764c : (i27 - 1) - this.f349764c;
            if (h3Var.f349887c) {
                if (loadType == g4.a1.PREPEND) {
                    i17 = d();
                } else {
                    i17 = h3Var.f349887c ? this.f349766e : 0;
                }
                r5 = i17 + i28;
            }
            f1Var = new g4.f1(loadType, h17, h18, r5);
        }
        return f1Var;
    }

    public final int d() {
        if (this.f349773l.f349887c) {
            return this.f349765d;
        }
        return 0;
    }

    public final boolean e(int i17, g4.a1 loadType, g4.z3 page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        int ordinal = loadType.ordinal();
        java.util.List list = this.f349762a;
        java.util.List list2 = this.f349763b;
        int i18 = page.f350189d;
        int i19 = page.f350190e;
        if (ordinal != 0) {
            java.util.Map map = this.f349771j;
            java.util.List list3 = page.f350186a;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!(!((java.util.ArrayList) list2).isEmpty())) {
                        throw new java.lang.IllegalStateException("should've received an init before append".toString());
                    }
                    if (i17 != this.f349768g) {
                        return false;
                    }
                    ((java.util.ArrayList) list).add(page);
                    if (i19 == Integer.MIN_VALUE) {
                        int size = (this.f349773l.f349887c ? this.f349766e : 0) - list3.size();
                        i19 = size < 0 ? 0 : size;
                    }
                    this.f349766e = i19 != Integer.MIN_VALUE ? i19 : 0;
                    map.remove(g4.a1.APPEND);
                }
            } else {
                if (!(!((java.util.ArrayList) list2).isEmpty())) {
                    throw new java.lang.IllegalStateException("should've received an init before prepend".toString());
                }
                if (i17 != this.f349767f) {
                    return false;
                }
                ((java.util.ArrayList) list).add(0, page);
                this.f349764c++;
                if (i18 == Integer.MIN_VALUE) {
                    int d17 = d() - list3.size();
                    i18 = d17 < 0 ? 0 : d17;
                }
                this.f349765d = i18 != Integer.MIN_VALUE ? i18 : 0;
                map.remove(g4.a1.PREPEND);
            }
        } else {
            if (!((java.util.ArrayList) list2).isEmpty()) {
                throw new java.lang.IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (!(i17 == 0)) {
                throw new java.lang.IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            ((java.util.ArrayList) list).add(page);
            this.f349764c = 0;
            if (i19 == Integer.MIN_VALUE) {
                i19 = 0;
            }
            this.f349766e = i19;
            this.f349765d = i18 != Integer.MIN_VALUE ? i18 : 0;
        }
        return true;
    }

    public final boolean f(g4.a1 type, g4.y0 newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349772k.b(type), newState)) {
            return false;
        }
        this.f349772k = this.f349772k.c(type, newState);
        return true;
    }

    public final g4.l1 g(g4.z3 toPageEvent, g4.a1 loadType) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toPageEvent, "$this$toPageEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            i17 = 0;
        } else if (ordinal == 1) {
            i17 = 0 - this.f349764c;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i17 = (((java.util.ArrayList) this.f349763b).size() - this.f349764c) - 1;
        }
        java.util.List c17 = kz5.b0.c(new g4.x4(i17, toPageEvent.f350186a));
        int ordinal2 = loadType.ordinal();
        g4.h3 h3Var = this.f349773l;
        if (ordinal2 == 0) {
            g4.g1 g1Var = g4.i1.f349901g;
            int d17 = d();
            int i18 = h3Var.f349887c ? this.f349766e : 0;
            g4.z0 z0Var = this.f349772k;
            return g1Var.a(c17, d17, i18, new g4.a0(z0Var.f350178a, z0Var.f350179b, z0Var.f350180c, z0Var, null));
        }
        if (ordinal2 == 1) {
            g4.i1 i1Var = g4.i1.f349900f;
            int d18 = d();
            g4.z0 z0Var2 = this.f349772k;
            return new g4.i1(g4.a1.PREPEND, c17, d18, -1, new g4.a0(z0Var2.f350178a, z0Var2.f350179b, z0Var2.f350180c, z0Var2, null));
        }
        if (ordinal2 != 2) {
            throw new jz5.j();
        }
        g4.i1 i1Var2 = g4.i1.f349900f;
        int i19 = h3Var.f349887c ? this.f349766e : 0;
        g4.z0 z0Var3 = this.f349772k;
        return new g4.i1(g4.a1.APPEND, c17, -1, i19, new g4.a0(z0Var3.f350178a, z0Var3.f350179b, z0Var3.f350180c, z0Var3, null));
    }
}

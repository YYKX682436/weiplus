package r16;

/* loaded from: classes16.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f450211c = kz5.n0.S0(java.util.ServiceLoader.load(r16.l.class, r16.l.class.getClassLoader()));

    /* renamed from: d, reason: collision with root package name */
    public static final r16.x f450212d;

    /* renamed from: e, reason: collision with root package name */
    public static final g26.f f450213e;

    /* renamed from: a, reason: collision with root package name */
    public final g26.l f450214a;

    /* renamed from: b, reason: collision with root package name */
    public final g26.f f450215b;

    static {
        r16.q qVar = new r16.q();
        f450213e = qVar;
        f450212d = new r16.x(qVar, g26.k.f349527a, g26.h.f349526a, null);
    }

    public x(g26.f fVar, g26.l lVar, g26.j jVar, yz5.p pVar) {
        if (fVar == null) {
            a(5);
            throw null;
        }
        if (lVar == null) {
            a(6);
            throw null;
        }
        if (jVar == null) {
            a(7);
            throw null;
        }
        this.f450215b = fVar;
        this.f450214a = lVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0265. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0268. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x026b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0277 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.x.a(int):void");
    }

    public static boolean b(f26.o0 o0Var, f26.o0 o0Var2, f26.b2 b2Var) {
        if (o0Var == null) {
            a(46);
            throw null;
        }
        if (o0Var2 == null) {
            a(47);
            throw null;
        }
        if (b2Var == null) {
            a(48);
            throw null;
        }
        if (f26.s0.a(o0Var) && f26.s0.a(o0Var2)) {
            return true;
        }
        return f26.g.f340695a.e(b2Var, o0Var.z0(), o0Var2.z0());
    }

    public static void c(o06.d dVar, java.util.Set set) {
        if (dVar == null) {
            a(17);
            throw null;
        }
        if (set == null) {
            a(18);
            throw null;
        }
        o06.c j17 = dVar.j();
        j17.getClass();
        if (j17 != o06.c.FAKE_OVERRIDE) {
            set.add(dVar);
            return;
        }
        if (dVar.i().isEmpty()) {
            throw new java.lang.IllegalStateException("No overridden descriptors found for (fake override) " + dVar);
        }
        java.util.Iterator it = dVar.i().iterator();
        while (it.hasNext()) {
            c((o06.d) it.next(), set);
        }
    }

    public static java.util.List d(o06.b bVar) {
        o06.r1 c07 = bVar.c0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c07 != null) {
            arrayList.add(((r06.g) c07).mo132802xfb85f7b0());
        }
        java.util.Iterator it = bVar.W().iterator();
        while (it.hasNext()) {
            arrayList.add(((r06.t1) ((o06.l2) it.next())).mo132802xfb85f7b0());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.Collection r15, o06.g r16, r16.p r17) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.x.e(java.util.Collection, o06.g, r16.p):void");
    }

    public static java.util.Collection g(java.lang.Object obj, java.util.Collection collection, yz5.l lVar, yz5.l lVar2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        if (collection == null) {
            a(100);
            throw null;
        }
        if (lVar == null) {
            a(101);
            throw null;
        }
        if (lVar2 == null) {
            a(102);
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(obj);
        o06.b bVar = (o06.b) lVar.mo146xb9724478(obj);
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            o06.b bVar2 = (o06.b) lVar.mo146xb9724478(next);
            if (obj == next) {
                it.remove();
            } else {
                r16.v j17 = j(bVar, bVar2);
                if (j17 == r16.v.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (j17 == r16.v.CONFLICT) {
                    lVar2.mo146xb9724478(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static r16.w i(o06.b bVar, o06.b bVar2) {
        boolean z17;
        if (bVar == null) {
            a(40);
            throw null;
        }
        if (bVar2 == null) {
            a(41);
            throw null;
        }
        boolean z18 = bVar instanceof o06.n0;
        if ((z18 && !(bVar2 instanceof o06.n0)) || (((z17 = bVar instanceof o06.o1)) && !(bVar2 instanceof o06.o1))) {
            return r16.w.d("Member kind mismatch");
        }
        if (!z18 && !z17) {
            throw new java.lang.IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.mo132800xfb82e301().m148891xb2c87fbf(bVar2.mo132800xfb82e301())) {
            return r16.w.d("Name mismatch");
        }
        r16.w d17 = (bVar.c0() == null) != (bVar2.c0() == null) ? r16.w.d("Receiver presence mismatch") : bVar.W().size() != bVar2.W().size() ? r16.w.d("Value parameter number mismatch") : null;
        if (d17 != null) {
            return d17;
        }
        return null;
    }

    public static r16.v j(o06.b bVar, o06.b bVar2) {
        r16.x xVar = f450212d;
        r16.v c17 = xVar.l(bVar2, bVar, null).c();
        r16.v c18 = xVar.l(bVar, bVar2, null).c();
        r16.v vVar = r16.v.OVERRIDABLE;
        if (c17 == vVar && c18 == vVar) {
            return vVar;
        }
        r16.v vVar2 = r16.v.CONFLICT;
        return (c17 == vVar2 || c18 == vVar2) ? vVar2 : r16.v.INCOMPATIBLE;
    }

    public static boolean k(o06.b bVar, o06.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 == null) {
            a(68);
            throw null;
        }
        f26.o0 mo132801x3df4e080 = bVar.mo132801x3df4e080();
        f26.o0 mo132801x3df4e0802 = bVar2.mo132801x3df4e080();
        if (!p(bVar, bVar2)) {
            return false;
        }
        f26.b2 f17 = f450212d.f(bVar.mo132803xb121b9ba(), bVar2.mo132803xb121b9ba());
        if (bVar instanceof o06.n0) {
            return o(bVar, mo132801x3df4e080, bVar2, mo132801x3df4e0802, f17);
        }
        if (!(bVar instanceof o06.o1)) {
            throw new java.lang.IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        o06.o1 o1Var = (o06.o1) bVar;
        o06.o1 o1Var2 = (o06.o1) bVar2;
        o06.q1 b17 = o1Var.b();
        o06.q1 b18 = o1Var2.b();
        if ((b17 == null || b18 == null) ? true : p(b17, b18)) {
            return (o1Var.v() && o1Var2.v()) ? f26.g.f340695a.e(f17, mo132801x3df4e080.z0(), mo132801x3df4e0802.z0()) : (o1Var.v() || !o1Var2.v()) && o(bVar, mo132801x3df4e080, bVar2, mo132801x3df4e0802, f17);
        }
        return false;
    }

    public static boolean o(o06.b bVar, f26.o0 o0Var, o06.b bVar2, f26.o0 o0Var2, f26.b2 b2Var) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (o0Var == null) {
            a(74);
            throw null;
        }
        if (bVar2 == null) {
            a(75);
            throw null;
        }
        if (o0Var2 == null) {
            a(76);
            throw null;
        }
        if (b2Var == null) {
            a(77);
            throw null;
        }
        f26.g gVar = f26.g.f340695a;
        f26.c3 subType = o0Var.z0();
        f26.c3 superType = o0Var2.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superType, "superType");
        return f26.g.i(gVar, b2Var, subType, superType, false, 8, null);
    }

    public static boolean p(o06.q qVar, o06.q qVar2) {
        if (qVar == null) {
            a(69);
            throw null;
        }
        if (qVar2 != null) {
            java.lang.Integer b17 = o06.f0.b(qVar.mo9617x61f71b08(), qVar2.mo9617x61f71b08());
            return b17 == null || b17.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(o06.b bVar, o06.b bVar2, boolean z17, boolean z18) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean equals = bVar.equals(bVar2);
        r16.f fVar = r16.f.f450189a;
        if (!equals && fVar.a(bVar.a(), bVar2.a(), z17, z18)) {
            return true;
        }
        o06.b a17 = bVar2.a();
        int i17 = r16.i.f450191a;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        r16.i.b(bVar.a(), linkedHashSet);
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (fVar.a(a17, (o06.b) it.next(), z17, z18)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(o06.d r6, yz5.l r7) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.x.r(o06.d, yz5.l):void");
    }

    public static java.lang.Object s(java.util.Collection collection, yz5.l lVar) {
        java.lang.Object obj;
        boolean z17;
        if (collection == null) {
            a(78);
            throw null;
        }
        if (lVar == null) {
            a(79);
            throw null;
        }
        if (collection.size() == 1) {
            java.lang.Object W = kz5.n0.W(collection);
            if (W != null) {
                return W;
            }
            a(80);
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        java.util.List l07 = kz5.n0.l0(collection, lVar);
        java.lang.Object W2 = kz5.n0.W(collection);
        o06.b bVar = (o06.b) lVar.mo146xb9724478(W2);
        for (java.lang.Object obj2 : collection) {
            o06.b bVar2 = (o06.b) lVar.mo146xb9724478(obj2);
            if (bVar2 == null) {
                a(71);
                throw null;
            }
            java.util.Iterator it = ((java.util.ArrayList) l07).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                }
                if (!k(bVar2, (o06.b) it.next())) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                arrayList.add(obj2);
            }
            if (k(bVar2, bVar) && !k(bVar, bVar2)) {
                W2 = obj2;
            }
        }
        if (arrayList.isEmpty()) {
            if (W2 != null) {
                return W2;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            java.lang.Object W3 = kz5.n0.W(arrayList);
            if (W3 != null) {
                return W3;
            }
            a(82);
            throw null;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (!f26.h0.b(((o06.b) lVar.mo146xb9724478(obj)).mo132801x3df4e080())) {
                break;
            }
        }
        if (obj != null) {
            return obj;
        }
        java.lang.Object W4 = kz5.n0.W(arrayList);
        if (W4 != null) {
            return W4;
        }
        a(84);
        throw null;
    }

    public final f26.b2 f(java.util.List list, java.util.List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean isEmpty = list.isEmpty();
        g26.h hVar = g26.h.f349526a;
        if (isEmpty) {
            r16.z zVar = new r16.z(null, this.f450215b, this.f450214a, hVar, null);
            if (zVar.f450221e != null) {
                return new r16.y(true, true, zVar, zVar.f450220d, zVar.f450219c);
            }
            g26.j kotlinTypePreparator = zVar.f450220d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypePreparator, "kotlinTypePreparator");
            g26.l kotlinTypeRefiner = zVar.f450219c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return new f26.b2(true, true, true, zVar, kotlinTypePreparator, kotlinTypeRefiner);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < list.size(); i17++) {
            hashMap.put(((o06.e2) list.get(i17)).g(), ((o06.e2) list2.get(i17)).g());
        }
        r16.z zVar2 = new r16.z(hashMap, this.f450215b, this.f450214a, hVar, null);
        if (zVar2.f450221e != null) {
            return new r16.y(true, true, zVar2, zVar2.f450220d, zVar2.f450219c);
        }
        g26.j kotlinTypePreparator2 = zVar2.f450220d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypePreparator2, "kotlinTypePreparator");
        g26.l kotlinTypeRefiner2 = zVar2.f450219c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner2, "kotlinTypeRefiner");
        return new f26.b2(true, true, true, zVar2, kotlinTypePreparator2, kotlinTypeRefiner2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(n16.g r18, java.util.Collection r19, java.util.Collection r20, o06.g r21, r16.p r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.x.h(n16.g, java.util.Collection, java.util.Collection, o06.g, r16.p):void");
    }

    public r16.w l(o06.b bVar, o06.b bVar2, o06.g gVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 == null) {
            a(20);
            throw null;
        }
        r16.w m17 = m(bVar, bVar2, gVar, false);
        if (m17 != null) {
            return m17;
        }
        a(21);
        throw null;
    }

    public r16.w m(o06.b bVar, o06.b bVar2, o06.g gVar, boolean z17) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        r16.w n17 = n(bVar, bVar2, z17);
        boolean z18 = n17.c() == r16.v.OVERRIDABLE;
        java.util.List<r16.l> list = f450211c;
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r16.j jVar = r16.j.CONFLICTS_ONLY;
            if (!hasNext) {
                if (!z18) {
                    return n17;
                }
                for (r16.l lVar : list) {
                    if (lVar.b() == jVar) {
                        int ordinal = lVar.a(bVar, bVar2, gVar).ordinal();
                        if (ordinal == 0) {
                            throw new java.lang.IllegalStateException("Contract violation in " + lVar.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (ordinal == 1) {
                            return r16.w.b("External condition failed");
                        }
                        if (ordinal == 2) {
                            return r16.w.d("External condition");
                        }
                    }
                }
                r16.w wVar = r16.w.f450209b;
                if (wVar != null) {
                    return wVar;
                }
                r16.w.a(0);
                throw null;
            }
            r16.l lVar2 = (r16.l) it.next();
            if (lVar2.b() != jVar && (!z18 || lVar2.b() != r16.j.SUCCESS_ONLY)) {
                int ordinal2 = lVar2.a(bVar, bVar2, gVar).ordinal();
                if (ordinal2 == 0) {
                    z18 = true;
                } else {
                    if (ordinal2 == 1) {
                        return r16.w.b("External condition failed");
                    }
                    if (ordinal2 == 2) {
                        return r16.w.d("External condition");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r15.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9 A[LOOP:1: B:22:0x0063->B:44:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r16.w n(o06.b r18, o06.b r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.x.n(o06.b, o06.b, boolean):r16.w");
    }
}

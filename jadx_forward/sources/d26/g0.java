package d26;

/* loaded from: classes16.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.i0 f307527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d26.i0 i0Var) {
        super(1);
        this.f307527d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        b26.t tVar;
        i16.l1 a17;
        i16.l1 a18;
        n16.g it = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        d26.i0 i0Var = this.f307527d;
        byte[] bArr = (byte[]) ((java.util.LinkedHashMap) i0Var.f307538c).get(it);
        if (bArr != null) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            d26.l0 l0Var = i0Var.f307544i;
            i16.o1 o1Var = (i16.o1) ((p16.d) i16.o1.f369204v).c(byteArrayInputStream, l0Var.f307554b.f99048a.f99031p);
            if (o1Var != null) {
                b26.s0 s0Var = l0Var.f307554b.f99056i;
                s0Var.getClass();
                java.util.List list = o1Var.f369214q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getAnnotationList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    boolean hasNext = it6.hasNext();
                    tVar = s0Var.f99046a;
                    if (!hasNext) {
                        break;
                    }
                    i16.k kVar = (i16.k) it6.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
                    arrayList.add(s0Var.f99047b.a(kVar, tVar.f99049b));
                }
                d26.p0 p0Var = new d26.p0(tVar.f99048a.f99016a, tVar.f99050c, arrayList.isEmpty() ? p06.i.f432298a : new p06.l(arrayList), b26.t0.b(tVar.f99049b, o1Var.f369208h), b26.b1.a(b26.z0.f99082a, (i16.h2) k16.f.f384969d.c(o1Var.f369207g)), o1Var, tVar.f99049b, tVar.f99051d, tVar.f99052e, tVar.f99054g);
                b26.t tVar2 = s0Var.f99046a;
                java.util.List list2 = o1Var.f369209i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getTypeParameterList(...)");
                b26.j1 j1Var = b26.t.b(tVar2, p0Var, list2, null, null, null, null, 60, null).f99055h;
                java.util.List b17 = j1Var.b();
                k16.k typeTable = tVar.f99051d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
                int i17 = o1Var.f369206f;
                if ((i17 & 4) == 4) {
                    a17 = o1Var.f369210m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getUnderlyingType(...)");
                } else {
                    if (!((i17 & 8) == 8)) {
                        throw new java.lang.IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
                    }
                    a17 = typeTable.a(o1Var.f369211n);
                }
                f26.z0 d17 = j1Var.d(a17, false);
                int i18 = o1Var.f369206f;
                if ((i18 & 16) == 16) {
                    a18 = o1Var.f369212o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getExpandedType(...)");
                } else {
                    if (!((i18 & 32) == 32)) {
                        throw new java.lang.IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
                    }
                    a18 = typeTable.a(o1Var.f369213p);
                }
                p0Var.w0(b17, d17, j1Var.d(a18, false));
                return p0Var;
            }
        }
        return null;
    }
}

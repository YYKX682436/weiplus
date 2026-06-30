package d26;

/* loaded from: classes16.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d26.x xVar) {
        super(0);
        this.f307585d = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        i26.j jVar;
        ?? r57;
        d26.x xVar = this.f307585d;
        if (!xVar.mo9618xe19a9463() && !xVar.k0()) {
            return null;
        }
        b26.t tVar = xVar.f307593r;
        k16.g nameResolver = tVar.f99049b;
        d26.q qVar = new d26.q(tVar.f99055h);
        d26.r rVar = new d26.r(xVar);
        i16.o oVar = xVar.f307586h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        k16.k typeTable = tVar.f99051d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        if (oVar.F.size() > 0) {
            java.util.List<java.lang.Integer> list = oVar.F;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getMultiFieldValueClassUnderlyingNameList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.lang.Integer num : list) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                arrayList.add(b26.t0.b(nameResolver, num.intValue()));
            }
            jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(oVar.I.size()), java.lang.Integer.valueOf(oVar.H.size()));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, new jz5.l(java.lang.Integer.valueOf(arrayList.size()), 0))) {
                java.util.List<java.lang.Integer> list2 = oVar.I;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                r57 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (java.lang.Integer num2 : list2) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                    r57.add(typeTable.a(num2.intValue()));
                }
            } else {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, new jz5.l(0, java.lang.Integer.valueOf(arrayList.size())))) {
                    throw new java.lang.IllegalStateException(("class " + b26.t0.b(nameResolver, oVar.f369176h) + " has illegal multi-field value class representation").toString());
                }
                r57 = oVar.H;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r57);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(r57, 10));
            java.util.Iterator it = r57.iterator();
            while (it.hasNext()) {
                arrayList2.add(qVar.mo146xb9724478(it.next()));
            }
            obj = new o06.w0(kz5.n0.a1(arrayList, arrayList2));
        } else if ((oVar.f369174f & 8) == 8) {
            n16.g b17 = b26.t0.b(nameResolver, oVar.C);
            int i17 = oVar.f369174f;
            i16.l1 a17 = (i17 & 16) == 16 ? oVar.D : (i17 & 32) == 32 ? typeTable.a(oVar.E) : null;
            if ((a17 == null || (jVar = (i26.j) qVar.mo146xb9724478(a17)) == null) && (jVar = (i26.j) rVar.mo146xb9724478(b17)) == null) {
                throw new java.lang.IllegalStateException(("cannot determine underlying type for value class " + b26.t0.b(nameResolver, oVar.f369176h) + " with property " + b17).toString());
            }
            obj = new o06.o0(b17, jVar);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        if (xVar.f307587i.a(1, 5, 1)) {
            return null;
        }
        o06.p s17 = xVar.s();
        if (s17 == null) {
            throw new java.lang.IllegalStateException(("Inline class has no primary constructor: " + xVar).toString());
        }
        java.util.List W = ((r06.j0) s17).W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
        n16.g mo132800xfb82e301 = ((r06.v) ((o06.l2) kz5.n0.X(W))).mo132800xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
        f26.z0 v07 = xVar.v0(mo132800xfb82e301);
        if (v07 != null) {
            return new o06.o0(mo132800xfb82e301, v07);
        }
        throw new java.lang.IllegalStateException(("Value class has no underlying property: " + xVar).toString());
    }
}

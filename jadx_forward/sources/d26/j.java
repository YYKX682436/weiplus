package d26;

/* loaded from: classes16.dex */
public final class j extends f26.b {

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f307545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d26.x xVar) {
        super(xVar.f307593r.f99048a.f99016a);
        this.f307546d = xVar;
        this.f307545c = ((e26.u) xVar.f307593r.f99048a.f99016a).b(new d26.i(xVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    @Override // f26.l
    public java.util.Collection c() {
        java.lang.String h17;
        n16.c b17;
        d26.x xVar = this.f307546d;
        i16.o oVar = xVar.f307586h;
        k16.k typeTable = xVar.f307593r.f99051d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        java.util.List list = oVar.f369179n;
        boolean z17 = !list.isEmpty();
        ?? r37 = list;
        if (!z17) {
            r37 = 0;
        }
        if (r37 == 0) {
            java.util.List<java.lang.Integer> list2 = oVar.f369180o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getSupertypeIdList(...)");
            r37 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (java.lang.Integer num : list2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                r37.add(typeTable.a(num.intValue()));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(r37, 10));
        java.util.Iterator it = r37.iterator();
        while (it.hasNext()) {
            arrayList.add(xVar.f307593r.f99055h.g((i16.l1) it.next()));
        }
        java.util.List t07 = kz5.n0.t0(arrayList, xVar.f307593r.f99048a.f99029n.e(xVar));
        java.util.ArrayList<o06.z0> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = t07.iterator();
        while (it6.hasNext()) {
            o06.j i17 = ((f26.o0) it6.next()).w0().i();
            o06.z0 z0Var = i17 instanceof o06.z0 ? (o06.z0) i17 : null;
            if (z0Var != null) {
                arrayList2.add(z0Var);
            }
        }
        if (!arrayList2.isEmpty()) {
            b26.c0 c0Var = xVar.f307593r.f99048a.f99023h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (o06.z0 z0Var2 : arrayList2) {
                n16.b f17 = v16.f.f(z0Var2);
                if (f17 == null || (b17 = f17.b()) == null || (h17 = b17.b()) == null) {
                    h17 = z0Var2.mo132800xfb82e301().h();
                }
                arrayList3.add(h17);
            }
            c0Var.b(xVar, arrayList3);
        }
        return kz5.n0.S0(t07);
    }

    @Override // f26.l
    public o06.c2 e() {
        return o06.b2.f423461a;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return (java.util.List) ((e26.o) this.f307545c).mo152xb9724478();
    }

    @Override // f26.b, f26.c2
    public o06.j i() {
        return this.f307546d;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    @Override // f26.b
    /* renamed from: l */
    public o06.g i() {
        return this.f307546d;
    }

    /* renamed from: toString */
    public java.lang.String m123392x9616526c() {
        java.lang.String str = this.f307546d.mo132800xfb82e301().f415702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        return str;
    }
}

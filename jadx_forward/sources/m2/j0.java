package m2;

/* loaded from: classes14.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f404458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f404459b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.o f404460c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.k f404461d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f404462e;

    public j0(java.lang.String fileName, int i17, p2.o bounds, o2.k kVar, java.util.List children) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(children, "children");
        this.f404458a = fileName;
        this.f404459b = i17;
        this.f404460c = bounds;
        this.f404461d = kVar;
        this.f404462e = children;
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f404462e;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((m2.j0) it.next()).a());
        }
        return kz5.n0.t0(list, arrayList);
    }

    /* renamed from: equals */
    public boolean m146678xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2.j0)) {
            return false;
        }
        m2.j0 j0Var = (m2.j0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404458a, j0Var.f404458a) && this.f404459b == j0Var.f404459b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404460c, j0Var.f404460c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404461d, j0Var.f404461d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404462e, j0Var.f404462e);
    }

    /* renamed from: hashCode */
    public int m146679x8cdac1b() {
        int hashCode = ((((this.f404458a.hashCode() * 31) + java.lang.Integer.hashCode(this.f404459b)) * 31) + this.f404460c.m157751x8cdac1b()) * 31;
        o2.k kVar = this.f404461d;
        return ((hashCode + (kVar == null ? 0 : kVar.m150447x8cdac1b())) * 31) + this.f404462e.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004d, code lost:
    
        if (r1 == null) goto L6;
     */
    /* renamed from: toString */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m146680x9616526c() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String r2 = r5.f404458a
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r5.f404459b
            r0.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r0.append(r2)
            p2.o r2 = r5.f404460c
            int r3 = r2.f432925b
            r0.append(r3)
            java.lang.String r3 = ", left="
            r0.append(r3)
            int r3 = r2.f432924a
            r0.append(r3)
            java.lang.String r3 = ",\n            |location="
            r0.append(r3)
            o2.k r3 = r5.f404461d
            if (r3 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            int r1 = r3.f423892b
            r4.append(r1)
            r1 = 76
            r4.append(r1)
            int r1 = r3.f423893c
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L51
        L4f:
            java.lang.String r1 = "<none>"
        L51:
            r0.append(r1)
            java.lang.String r1 = "\n            |bottom="
            r0.append(r1)
            int r1 = r2.f432927d
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.f432926c
            r0.append(r1)
            java.lang.String r1 = "),\n            |childrenCount="
            r0.append(r1)
            java.util.List r1 = r5.f404462e
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            r2 = 0
            java.lang.String r0 = r26.b0.c(r0, r2, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.j0.m146680x9616526c():java.lang.String");
    }
}

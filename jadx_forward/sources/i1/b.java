package i1;

/* loaded from: classes13.dex */
public final class b extends i1.d0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f368349b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f368350c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f368351d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f368352e;

    /* renamed from: f, reason: collision with root package name */
    public e1.p0 f368353f;

    /* renamed from: g, reason: collision with root package name */
    public i1.c0 f368354g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f368355h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f368356i;

    /* renamed from: j, reason: collision with root package name */
    public float f368357j;

    /* renamed from: k, reason: collision with root package name */
    public float f368358k;

    /* renamed from: l, reason: collision with root package name */
    public float f368359l;

    /* renamed from: m, reason: collision with root package name */
    public float f368360m;

    /* renamed from: n, reason: collision with root package name */
    public float f368361n;

    /* renamed from: o, reason: collision with root package name */
    public float f368362o;

    /* renamed from: p, reason: collision with root package name */
    public float f368363p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f368364q;

    public b() {
        super(null);
        this.f368350c = new java.util.ArrayList();
        int i17 = i1.p1.f368534a;
        this.f368351d = kz5.p0.f395529d;
        this.f368352e = true;
        this.f368356i = "";
        this.f368360m = 1.0f;
        this.f368361n = 1.0f;
        this.f368364q = true;
    }

    @Override // i1.d0
    public void a(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        if (this.f368364q) {
            float[] fArr = this.f368349b;
            if (fArr == null) {
                fArr = e1.j0.a(null, 1, null);
                this.f368349b = fArr;
            } else {
                e1.j0.d(fArr);
            }
            e1.j0.e(fArr, this.f368358k + this.f368362o, this.f368359l + this.f368363p, 0.0f, 4, null);
            double d17 = (this.f368357j * 3.141592653589793d) / 180.0d;
            float cos = (float) java.lang.Math.cos(d17);
            float sin = (float) java.lang.Math.sin(d17);
            float f17 = fArr[0];
            float f18 = fArr[4];
            float f19 = (cos * f17) + (sin * f18);
            float f27 = -sin;
            float f28 = (f17 * f27) + (f18 * cos);
            float f29 = fArr[1];
            float f37 = fArr[5];
            float f38 = (cos * f29) + (sin * f37);
            float f39 = (f29 * f27) + (f37 * cos);
            float f47 = fArr[2];
            float f48 = fArr[6];
            float f49 = (cos * f47) + (sin * f48);
            float f57 = (f47 * f27) + (f48 * cos);
            float f58 = fArr[3];
            float f59 = fArr[7];
            float f66 = (cos * f58) + (sin * f59);
            float f67 = (f27 * f58) + (cos * f59);
            fArr[0] = f19;
            fArr[1] = f38;
            fArr[2] = f49;
            fArr[3] = f66;
            fArr[4] = f28;
            fArr[5] = f39;
            fArr[6] = f57;
            fArr[7] = f67;
            float f68 = this.f368360m;
            float f69 = this.f368361n;
            fArr[0] = f19 * f68;
            fArr[1] = f38 * f68;
            fArr[2] = f49 * f68;
            fArr[3] = f66 * f68;
            fArr[4] = f28 * f69;
            fArr[5] = f39 * f69;
            fArr[6] = f57 * f69;
            fArr[7] = f67 * f69;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            e1.j0.e(fArr, -this.f368358k, -this.f368359l, 0.0f, 4, null);
            this.f368364q = false;
        }
        if (this.f368352e) {
            if (!this.f368351d.isEmpty()) {
                i1.c0 c0Var = this.f368354g;
                if (c0Var == null) {
                    c0Var = new i1.c0();
                    this.f368354g = c0Var;
                } else {
                    ((java.util.ArrayList) c0Var.f368379a).clear();
                }
                e1.p0 p0Var = this.f368353f;
                if (p0Var == null) {
                    p0Var = e1.k.a();
                    this.f368353f = p0Var;
                } else {
                    ((e1.i) p0Var).c();
                }
                java.util.List nodes = this.f368351d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodes, "nodes");
                ((java.util.ArrayList) c0Var.f368379a).addAll(nodes);
                c0Var.c(p0Var);
            }
            this.f368352e = false;
        }
        g1.b bVar = (g1.b) iVar.p();
        long b17 = bVar.b();
        bVar.a().c();
        g1.k kVar = bVar.f349037a;
        float[] fArr2 = this.f368349b;
        if (fArr2 != null) {
            g1.d dVar = (g1.d) kVar;
            dVar.getClass();
            ((g1.b) dVar.f349043a).a().p(fArr2);
        }
        e1.p0 p0Var2 = this.f368353f;
        if ((!this.f368351d.isEmpty()) && p0Var2 != null) {
            g1.d dVar2 = (g1.d) kVar;
            dVar2.getClass();
            ((g1.b) dVar2.f349043a).a().i(p0Var2, 1);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f368350c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((i1.d0) arrayList.get(i17)).a(iVar);
        }
        bVar.a().b();
        bVar.c(b17);
    }

    @Override // i1.d0
    public yz5.a b() {
        return this.f368355h;
    }

    @Override // i1.d0
    public void d(yz5.a aVar) {
        this.f368355h = aVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f368350c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((i1.d0) arrayList.get(i17)).d(aVar);
        }
    }

    public final void e(int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            java.util.List list = this.f368350c;
            if (i17 < ((java.util.ArrayList) list).size()) {
                ((i1.d0) ((java.util.ArrayList) list).get(i17)).d(null);
                ((java.util.ArrayList) list).remove(i17);
            }
        }
        c();
    }

    /* renamed from: toString */
    public java.lang.String m134425x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VGroup: ");
        sb6.append(this.f368356i);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f368350c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            i1.d0 d0Var = (i1.d0) arrayList.get(i17);
            sb6.append("\t");
            sb6.append(d0Var.toString());
            sb6.append("\n");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "sb.toString()");
        return sb7;
    }
}

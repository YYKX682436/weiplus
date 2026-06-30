package r45;

/* loaded from: classes14.dex */
public class z27 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473171d;

    /* renamed from: e, reason: collision with root package name */
    public int f473172e;

    /* renamed from: f, reason: collision with root package name */
    public int f473173f;

    /* renamed from: g, reason: collision with root package name */
    public int f473174g;

    /* renamed from: h, reason: collision with root package name */
    public int f473175h;

    /* renamed from: i, reason: collision with root package name */
    public int f473176i;

    /* renamed from: m, reason: collision with root package name */
    public int f473177m;

    /* renamed from: n, reason: collision with root package name */
    public int f473178n;

    /* renamed from: o, reason: collision with root package name */
    public int f473179o;

    /* renamed from: p, reason: collision with root package name */
    public int f473180p;

    /* renamed from: r, reason: collision with root package name */
    public int f473182r;

    /* renamed from: t, reason: collision with root package name */
    public int f473184t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f473186v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f473187w;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f473181q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f473183s = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f473185u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z27)) {
            return false;
        }
        r45.z27 z27Var = (r45.z27) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473171d), java.lang.Integer.valueOf(z27Var.f473171d)) && n51.f.a(java.lang.Integer.valueOf(this.f473172e), java.lang.Integer.valueOf(z27Var.f473172e)) && n51.f.a(java.lang.Integer.valueOf(this.f473173f), java.lang.Integer.valueOf(z27Var.f473173f)) && n51.f.a(java.lang.Integer.valueOf(this.f473174g), java.lang.Integer.valueOf(z27Var.f473174g)) && n51.f.a(java.lang.Integer.valueOf(this.f473175h), java.lang.Integer.valueOf(z27Var.f473175h)) && n51.f.a(java.lang.Integer.valueOf(this.f473176i), java.lang.Integer.valueOf(z27Var.f473176i)) && n51.f.a(java.lang.Integer.valueOf(this.f473177m), java.lang.Integer.valueOf(z27Var.f473177m)) && n51.f.a(java.lang.Integer.valueOf(this.f473178n), java.lang.Integer.valueOf(z27Var.f473178n)) && n51.f.a(java.lang.Integer.valueOf(this.f473179o), java.lang.Integer.valueOf(z27Var.f473179o)) && n51.f.a(java.lang.Integer.valueOf(this.f473180p), java.lang.Integer.valueOf(z27Var.f473180p)) && n51.f.a(this.f473181q, z27Var.f473181q) && n51.f.a(java.lang.Integer.valueOf(this.f473182r), java.lang.Integer.valueOf(z27Var.f473182r)) && n51.f.a(this.f473183s, z27Var.f473183s) && n51.f.a(java.lang.Integer.valueOf(this.f473184t), java.lang.Integer.valueOf(z27Var.f473184t)) && n51.f.a(this.f473185u, z27Var.f473185u) && n51.f.a(this.f473186v, z27Var.f473186v) && n51.f.a(this.f473187w, z27Var.f473187w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473185u;
        java.util.LinkedList linkedList2 = this.f473183s;
        java.util.LinkedList linkedList3 = this.f473181q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473171d);
            fVar.e(2, this.f473172e);
            fVar.e(3, this.f473173f);
            fVar.e(4, this.f473174g);
            fVar.e(5, this.f473175h);
            fVar.e(6, this.f473176i);
            fVar.e(7, this.f473177m);
            fVar.e(8, this.f473178n);
            fVar.e(9, this.f473179o);
            fVar.e(10, this.f473180p);
            fVar.g(11, 2, linkedList3);
            fVar.e(12, this.f473182r);
            fVar.g(13, 2, linkedList2);
            fVar.e(14, this.f473184t);
            fVar.g(15, 2, linkedList);
            java.lang.String str = this.f473186v;
            if (str != null) {
                fVar.j(16, str);
            }
            java.lang.String str2 = this.f473187w;
            if (str2 != null) {
                fVar.j(17, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473171d) + 0 + b36.f.e(2, this.f473172e) + b36.f.e(3, this.f473173f) + b36.f.e(4, this.f473174g) + b36.f.e(5, this.f473175h) + b36.f.e(6, this.f473176i) + b36.f.e(7, this.f473177m) + b36.f.e(8, this.f473178n) + b36.f.e(9, this.f473179o) + b36.f.e(10, this.f473180p) + b36.f.g(11, 2, linkedList3) + b36.f.e(12, this.f473182r) + b36.f.g(13, 2, linkedList2) + b36.f.e(14, this.f473184t) + b36.f.g(15, 2, linkedList);
            java.lang.String str3 = this.f473186v;
            if (str3 != null) {
                e17 += b36.f.j(16, str3);
            }
            java.lang.String str4 = this.f473187w;
            return str4 != null ? e17 + b36.f.j(17, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.z27 z27Var = (r45.z27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z27Var.f473171d = aVar2.g(intValue);
                return 0;
            case 2:
                z27Var.f473172e = aVar2.g(intValue);
                return 0;
            case 3:
                z27Var.f473173f = aVar2.g(intValue);
                return 0;
            case 4:
                z27Var.f473174g = aVar2.g(intValue);
                return 0;
            case 5:
                z27Var.f473175h = aVar2.g(intValue);
                return 0;
            case 6:
                z27Var.f473176i = aVar2.g(intValue);
                return 0;
            case 7:
                z27Var.f473177m = aVar2.g(intValue);
                return 0;
            case 8:
                z27Var.f473178n = aVar2.g(intValue);
                return 0;
            case 9:
                z27Var.f473179o = aVar2.g(intValue);
                return 0;
            case 10:
                z27Var.f473180p = aVar2.g(intValue);
                return 0;
            case 11:
                z27Var.f473181q.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 12:
                z27Var.f473182r = aVar2.g(intValue);
                return 0;
            case 13:
                z27Var.f473183s.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 14:
                z27Var.f473184t = aVar2.g(intValue);
                return 0;
            case 15:
                z27Var.f473185u.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 16:
                z27Var.f473186v = aVar2.k(intValue);
                return 0;
            case 17:
                z27Var.f473187w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

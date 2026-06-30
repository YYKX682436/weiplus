package r45;

/* loaded from: classes7.dex */
public class l47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460662d;

    /* renamed from: e, reason: collision with root package name */
    public int f460663e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460664f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460665g;

    /* renamed from: h, reason: collision with root package name */
    public int f460666h;

    /* renamed from: i, reason: collision with root package name */
    public int f460667i;

    /* renamed from: m, reason: collision with root package name */
    public int f460668m;

    /* renamed from: n, reason: collision with root package name */
    public int f460669n;

    /* renamed from: o, reason: collision with root package name */
    public int f460670o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l47)) {
            return false;
        }
        r45.l47 l47Var = (r45.l47) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460662d), java.lang.Integer.valueOf(l47Var.f460662d)) && n51.f.a(java.lang.Integer.valueOf(this.f460663e), java.lang.Integer.valueOf(l47Var.f460663e)) && n51.f.a(this.f460664f, l47Var.f460664f) && n51.f.a(this.f460665g, l47Var.f460665g) && n51.f.a(java.lang.Integer.valueOf(this.f460666h), java.lang.Integer.valueOf(l47Var.f460666h)) && n51.f.a(java.lang.Integer.valueOf(this.f460667i), java.lang.Integer.valueOf(l47Var.f460667i)) && n51.f.a(java.lang.Integer.valueOf(this.f460668m), java.lang.Integer.valueOf(l47Var.f460668m)) && n51.f.a(java.lang.Integer.valueOf(this.f460669n), java.lang.Integer.valueOf(l47Var.f460669n)) && n51.f.a(java.lang.Integer.valueOf(this.f460670o), java.lang.Integer.valueOf(l47Var.f460670o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460662d);
            fVar.e(2, this.f460663e);
            java.lang.String str = this.f460664f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f460665g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f460666h);
            fVar.e(6, this.f460667i);
            fVar.e(7, this.f460668m);
            fVar.e(8, this.f460669n);
            fVar.e(9, this.f460670o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460662d) + 0 + b36.f.e(2, this.f460663e);
            java.lang.String str2 = this.f460664f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f460665g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            return e17 + b36.f.e(5, this.f460666h) + b36.f.e(6, this.f460667i) + b36.f.e(7, this.f460668m) + b36.f.e(8, this.f460669n) + b36.f.e(9, this.f460670o);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.l47 l47Var = (r45.l47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l47Var.f460662d = aVar2.g(intValue);
                return 0;
            case 2:
                l47Var.f460663e = aVar2.g(intValue);
                return 0;
            case 3:
                l47Var.f460664f = aVar2.k(intValue);
                return 0;
            case 4:
                l47Var.f460665g = aVar2.d(intValue);
                return 0;
            case 5:
                l47Var.f460666h = aVar2.g(intValue);
                return 0;
            case 6:
                l47Var.f460667i = aVar2.g(intValue);
                return 0;
            case 7:
                l47Var.f460668m = aVar2.g(intValue);
                return 0;
            case 8:
                l47Var.f460669n = aVar2.g(intValue);
                return 0;
            case 9:
                l47Var.f460670o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

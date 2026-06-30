package r45;

/* loaded from: classes14.dex */
public class ue0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468815f;

    /* renamed from: g, reason: collision with root package name */
    public int f468816g;

    /* renamed from: h, reason: collision with root package name */
    public int f468817h;

    /* renamed from: i, reason: collision with root package name */
    public int f468818i;

    /* renamed from: m, reason: collision with root package name */
    public r45.c27 f468819m;

    /* renamed from: n, reason: collision with root package name */
    public int f468820n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f468821o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f468822p;

    /* renamed from: q, reason: collision with root package name */
    public int f468823q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue0)) {
            return false;
        }
        r45.ue0 ue0Var = (r45.ue0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468813d), java.lang.Integer.valueOf(ue0Var.f468813d)) && n51.f.a(this.f468814e, ue0Var.f468814e) && n51.f.a(this.f468815f, ue0Var.f468815f) && n51.f.a(java.lang.Integer.valueOf(this.f468816g), java.lang.Integer.valueOf(ue0Var.f468816g)) && n51.f.a(java.lang.Integer.valueOf(this.f468817h), java.lang.Integer.valueOf(ue0Var.f468817h)) && n51.f.a(java.lang.Integer.valueOf(this.f468818i), java.lang.Integer.valueOf(ue0Var.f468818i)) && n51.f.a(this.f468819m, ue0Var.f468819m) && n51.f.a(java.lang.Integer.valueOf(this.f468820n), java.lang.Integer.valueOf(ue0Var.f468820n)) && n51.f.a(this.f468821o, ue0Var.f468821o) && n51.f.a(java.lang.Integer.valueOf(this.f468822p), java.lang.Integer.valueOf(ue0Var.f468822p)) && n51.f.a(java.lang.Integer.valueOf(this.f468823q), java.lang.Integer.valueOf(ue0Var.f468823q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468813d);
            java.lang.String str = this.f468814e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468815f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f468816g);
            fVar.e(5, this.f468817h);
            fVar.e(6, this.f468818i);
            r45.c27 c27Var = this.f468819m;
            if (c27Var != null) {
                fVar.i(7, c27Var.mo75928xcd1e8d8());
                this.f468819m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f468820n);
            fVar.g(9, 8, this.f468821o);
            fVar.e(10, this.f468822p);
            fVar.e(11, this.f468823q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468813d) + 0;
            java.lang.String str3 = this.f468814e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f468815f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f468816g) + b36.f.e(5, this.f468817h) + b36.f.e(6, this.f468818i);
            r45.c27 c27Var2 = this.f468819m;
            if (c27Var2 != null) {
                e18 += b36.f.i(7, c27Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(8, this.f468820n) + b36.f.g(9, 8, this.f468821o) + b36.f.e(10, this.f468822p) + b36.f.e(11, this.f468823q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468821o.clear();
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
        r45.ue0 ue0Var = (r45.ue0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ue0Var.f468813d = aVar2.g(intValue);
                return 0;
            case 2:
                ue0Var.f468814e = aVar2.k(intValue);
                return 0;
            case 3:
                ue0Var.f468815f = aVar2.k(intValue);
                return 0;
            case 4:
                ue0Var.f468816g = aVar2.g(intValue);
                return 0;
            case 5:
                ue0Var.f468817h = aVar2.g(intValue);
                return 0;
            case 6:
                ue0Var.f468818i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.c27 c27Var3 = new r45.c27();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27Var3.mo11468x92b714fd(bArr2);
                    }
                    ue0Var.f468819m = c27Var3;
                }
                return 0;
            case 8:
                ue0Var.f468820n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.f37 f37Var = new r45.f37();
                    if (bArr3 != null && bArr3.length > 0) {
                        f37Var.mo11468x92b714fd(bArr3);
                    }
                    ue0Var.f468821o.add(f37Var);
                }
                return 0;
            case 10:
                ue0Var.f468822p = aVar2.g(intValue);
                return 0;
            case 11:
                ue0Var.f468823q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

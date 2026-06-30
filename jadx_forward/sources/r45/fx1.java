package r45;

/* loaded from: classes10.dex */
public class fx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f456207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456208e;

    /* renamed from: f, reason: collision with root package name */
    public long f456209f;

    /* renamed from: g, reason: collision with root package name */
    public long f456210g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456211h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456212i;

    /* renamed from: m, reason: collision with root package name */
    public int f456213m;

    /* renamed from: n, reason: collision with root package name */
    public int f456214n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f456215o;

    /* renamed from: p, reason: collision with root package name */
    public int f456216p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f456217q;

    /* renamed from: r, reason: collision with root package name */
    public long f456218r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx1)) {
            return false;
        }
        r45.fx1 fx1Var = (r45.fx1) fVar;
        return n51.f.a(this.f76494x2de60e5e, fx1Var.f76494x2de60e5e) && n51.f.a(this.f456207d, fx1Var.f456207d) && n51.f.a(this.f456208e, fx1Var.f456208e) && n51.f.a(java.lang.Long.valueOf(this.f456209f), java.lang.Long.valueOf(fx1Var.f456209f)) && n51.f.a(java.lang.Long.valueOf(this.f456210g), java.lang.Long.valueOf(fx1Var.f456210g)) && n51.f.a(this.f456211h, fx1Var.f456211h) && n51.f.a(this.f456212i, fx1Var.f456212i) && n51.f.a(java.lang.Integer.valueOf(this.f456213m), java.lang.Integer.valueOf(fx1Var.f456213m)) && n51.f.a(java.lang.Integer.valueOf(this.f456214n), java.lang.Integer.valueOf(fx1Var.f456214n)) && n51.f.a(java.lang.Boolean.valueOf(this.f456215o), java.lang.Boolean.valueOf(fx1Var.f456215o)) && n51.f.a(java.lang.Integer.valueOf(this.f456216p), java.lang.Integer.valueOf(fx1Var.f456216p)) && n51.f.a(java.lang.Boolean.valueOf(this.f456217q), java.lang.Boolean.valueOf(fx1Var.f456217q)) && n51.f.a(java.lang.Long.valueOf(this.f456218r), java.lang.Long.valueOf(fx1Var.f456218r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f456207d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f456207d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456208e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f456209f);
            fVar.h(5, this.f456210g);
            java.lang.String str2 = this.f456211h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456212i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f456213m);
            fVar.e(9, this.f456214n);
            fVar.a(10, this.f456215o);
            fVar.e(11, this.f456216p);
            fVar.a(12, this.f456217q);
            fVar.h(13, this.f456218r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f456207d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f456208e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f456209f) + b36.f.h(5, this.f456210g);
            java.lang.String str4 = this.f456211h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456212i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            return h17 + b36.f.e(8, this.f456213m) + b36.f.e(9, this.f456214n) + b36.f.a(10, this.f456215o) + b36.f.e(11, this.f456216p) + b36.f.a(12, this.f456217q) + b36.f.h(13, this.f456218r);
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
        r45.fx1 fx1Var = (r45.fx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    fx1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    fx1Var.f456207d = kv0Var3;
                }
                return 0;
            case 3:
                fx1Var.f456208e = aVar2.k(intValue);
                return 0;
            case 4:
                fx1Var.f456209f = aVar2.i(intValue);
                return 0;
            case 5:
                fx1Var.f456210g = aVar2.i(intValue);
                return 0;
            case 6:
                fx1Var.f456211h = aVar2.k(intValue);
                return 0;
            case 7:
                fx1Var.f456212i = aVar2.d(intValue);
                return 0;
            case 8:
                fx1Var.f456213m = aVar2.g(intValue);
                return 0;
            case 9:
                fx1Var.f456214n = aVar2.g(intValue);
                return 0;
            case 10:
                fx1Var.f456215o = aVar2.c(intValue);
                return 0;
            case 11:
                fx1Var.f456216p = aVar2.g(intValue);
                return 0;
            case 12:
                fx1Var.f456217q = aVar2.c(intValue);
                return 0;
            case 13:
                fx1Var.f456218r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

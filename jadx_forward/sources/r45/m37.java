package r45;

/* loaded from: classes8.dex */
public class m37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461659d;

    /* renamed from: e, reason: collision with root package name */
    public int f461660e;

    /* renamed from: f, reason: collision with root package name */
    public long f461661f;

    /* renamed from: g, reason: collision with root package name */
    public r45.s37 f461662g;

    /* renamed from: h, reason: collision with root package name */
    public long f461663h;

    /* renamed from: i, reason: collision with root package name */
    public int f461664i;

    /* renamed from: m, reason: collision with root package name */
    public int f461665m;

    /* renamed from: n, reason: collision with root package name */
    public int f461666n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m37)) {
            return false;
        }
        r45.m37 m37Var = (r45.m37) fVar;
        return n51.f.a(this.f76494x2de60e5e, m37Var.f76494x2de60e5e) && n51.f.a(this.f461659d, m37Var.f461659d) && n51.f.a(java.lang.Integer.valueOf(this.f461660e), java.lang.Integer.valueOf(m37Var.f461660e)) && n51.f.a(java.lang.Long.valueOf(this.f461661f), java.lang.Long.valueOf(m37Var.f461661f)) && n51.f.a(this.f461662g, m37Var.f461662g) && n51.f.a(java.lang.Long.valueOf(this.f461663h), java.lang.Long.valueOf(m37Var.f461663h)) && n51.f.a(java.lang.Integer.valueOf(this.f461664i), java.lang.Integer.valueOf(m37Var.f461664i)) && n51.f.a(java.lang.Integer.valueOf(this.f461665m), java.lang.Integer.valueOf(m37Var.f461665m)) && n51.f.a(java.lang.Integer.valueOf(this.f461666n), java.lang.Integer.valueOf(m37Var.f461666n));
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
            java.lang.String str = this.f461659d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f461660e);
            fVar.h(4, this.f461661f);
            r45.s37 s37Var = this.f461662g;
            if (s37Var != null) {
                fVar.i(5, s37Var.mo75928xcd1e8d8());
                this.f461662g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f461663h);
            fVar.e(7, this.f461664i);
            fVar.e(8, this.f461665m);
            fVar.e(9, this.f461666n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f461659d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f461660e) + b36.f.h(4, this.f461661f);
            r45.s37 s37Var2 = this.f461662g;
            if (s37Var2 != null) {
                e17 += b36.f.i(5, s37Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.h(6, this.f461663h) + b36.f.e(7, this.f461664i) + b36.f.e(8, this.f461665m) + b36.f.e(9, this.f461666n);
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
        r45.m37 m37Var = (r45.m37) objArr[1];
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
                    m37Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                m37Var.f461659d = aVar2.k(intValue);
                return 0;
            case 3:
                m37Var.f461660e = aVar2.g(intValue);
                return 0;
            case 4:
                m37Var.f461661f = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.s37 s37Var3 = new r45.s37();
                    if (bArr2 != null && bArr2.length > 0) {
                        s37Var3.mo11468x92b714fd(bArr2);
                    }
                    m37Var.f461662g = s37Var3;
                }
                return 0;
            case 6:
                m37Var.f461663h = aVar2.i(intValue);
                return 0;
            case 7:
                m37Var.f461664i = aVar2.g(intValue);
                return 0;
            case 8:
                m37Var.f461665m = aVar2.g(intValue);
                return 0;
            case 9:
                m37Var.f461666n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

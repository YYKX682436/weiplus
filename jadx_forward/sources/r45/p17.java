package r45;

/* loaded from: classes9.dex */
public class p17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464201d;

    /* renamed from: e, reason: collision with root package name */
    public int f464202e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464203f;

    /* renamed from: g, reason: collision with root package name */
    public int f464204g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f464205h;

    /* renamed from: i, reason: collision with root package name */
    public int f464206i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464207m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464208n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p17)) {
            return false;
        }
        r45.p17 p17Var = (r45.p17) fVar;
        return n51.f.a(this.f76494x2de60e5e, p17Var.f76494x2de60e5e) && n51.f.a(this.f464201d, p17Var.f464201d) && n51.f.a(java.lang.Integer.valueOf(this.f464202e), java.lang.Integer.valueOf(p17Var.f464202e)) && n51.f.a(this.f464203f, p17Var.f464203f) && n51.f.a(java.lang.Integer.valueOf(this.f464204g), java.lang.Integer.valueOf(p17Var.f464204g)) && n51.f.a(java.lang.Boolean.valueOf(this.f464205h), java.lang.Boolean.valueOf(p17Var.f464205h)) && n51.f.a(java.lang.Integer.valueOf(this.f464206i), java.lang.Integer.valueOf(p17Var.f464206i)) && n51.f.a(this.f464207m, p17Var.f464207m) && n51.f.a(this.f464208n, p17Var.f464208n);
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
            java.lang.String str = this.f464201d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f464202e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f464203f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f464204g);
            fVar.a(6, this.f464205h);
            fVar.e(7, this.f464206i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f464207m;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f464208n;
            if (gVar3 != null) {
                fVar.b(9, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f464201d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f464202e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f464203f;
            if (gVar4 != null) {
                e17 += b36.f.b(4, gVar4);
            }
            int e18 = e17 + b36.f.e(5, this.f464204g) + b36.f.a(6, this.f464205h) + b36.f.e(7, this.f464206i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f464207m;
            if (gVar5 != null) {
                e18 += b36.f.b(8, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f464208n;
            return gVar6 != null ? e18 + b36.f.b(9, gVar6) : e18;
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
        r45.p17 p17Var = (r45.p17) objArr[1];
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
                    p17Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                p17Var.f464201d = aVar2.k(intValue);
                return 0;
            case 3:
                p17Var.f464202e = aVar2.g(intValue);
                return 0;
            case 4:
                p17Var.f464203f = aVar2.d(intValue);
                return 0;
            case 5:
                p17Var.f464204g = aVar2.g(intValue);
                return 0;
            case 6:
                p17Var.f464205h = aVar2.c(intValue);
                return 0;
            case 7:
                p17Var.f464206i = aVar2.g(intValue);
                return 0;
            case 8:
                p17Var.f464207m = aVar2.d(intValue);
                return 0;
            case 9:
                p17Var.f464208n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

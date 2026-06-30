package r45;

/* loaded from: classes4.dex */
public class fq3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456078d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f456079e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f456080f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f456081g;

    /* renamed from: h, reason: collision with root package name */
    public int f456082h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fq3)) {
            return false;
        }
        r45.fq3 fq3Var = (r45.fq3) fVar;
        return n51.f.a(this.f76494x2de60e5e, fq3Var.f76494x2de60e5e) && n51.f.a(this.f456078d, fq3Var.f456078d) && n51.f.a(java.lang.Boolean.valueOf(this.f456079e), java.lang.Boolean.valueOf(fq3Var.f456079e)) && n51.f.a(this.f456080f, fq3Var.f456080f) && n51.f.a(java.lang.Integer.valueOf(this.f456081g), java.lang.Integer.valueOf(fq3Var.f456081g)) && n51.f.a(java.lang.Integer.valueOf(this.f456082h), java.lang.Integer.valueOf(fq3Var.f456082h));
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
            java.lang.String str = this.f456078d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f456079e);
            fVar.g(4, 1, this.f456080f);
            fVar.e(5, this.f456081g);
            fVar.e(6, this.f456082h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f456078d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.a(3, this.f456079e) + b36.f.g(4, 1, this.f456080f) + b36.f.e(5, this.f456081g) + b36.f.e(6, this.f456082h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456080f.clear();
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
        r45.fq3 fq3Var = (r45.fq3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    fq3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                fq3Var.f456078d = aVar2.k(intValue);
                return 0;
            case 3:
                fq3Var.f456079e = aVar2.c(intValue);
                return 0;
            case 4:
                fq3Var.f456080f.add(aVar2.k(intValue));
                return 0;
            case 5:
                fq3Var.f456081g = aVar2.g(intValue);
                return 0;
            case 6:
                fq3Var.f456082h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

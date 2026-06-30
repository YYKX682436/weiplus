package r45;

/* loaded from: classes4.dex */
public class pr5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464866d;

    /* renamed from: e, reason: collision with root package name */
    public int f464867e;

    /* renamed from: f, reason: collision with root package name */
    public int f464868f;

    /* renamed from: g, reason: collision with root package name */
    public long f464869g;

    /* renamed from: h, reason: collision with root package name */
    public int f464870h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464871i;

    /* renamed from: m, reason: collision with root package name */
    public int f464872m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr5)) {
            return false;
        }
        r45.pr5 pr5Var = (r45.pr5) fVar;
        return n51.f.a(this.f76494x2de60e5e, pr5Var.f76494x2de60e5e) && n51.f.a(this.f464866d, pr5Var.f464866d) && n51.f.a(java.lang.Integer.valueOf(this.f464867e), java.lang.Integer.valueOf(pr5Var.f464867e)) && n51.f.a(java.lang.Integer.valueOf(this.f464868f), java.lang.Integer.valueOf(pr5Var.f464868f)) && n51.f.a(java.lang.Long.valueOf(this.f464869g), java.lang.Long.valueOf(pr5Var.f464869g)) && n51.f.a(java.lang.Integer.valueOf(this.f464870h), java.lang.Integer.valueOf(pr5Var.f464870h)) && n51.f.a(this.f464871i, pr5Var.f464871i) && n51.f.a(java.lang.Integer.valueOf(this.f464872m), java.lang.Integer.valueOf(pr5Var.f464872m));
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
            java.lang.String str = this.f464866d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f464867e);
            fVar.e(4, this.f464868f);
            fVar.h(5, this.f464869g);
            fVar.e(6, this.f464870h);
            java.lang.String str2 = this.f464871i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f464872m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f464866d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f464867e) + b36.f.e(4, this.f464868f) + b36.f.h(5, this.f464869g) + b36.f.e(6, this.f464870h);
            java.lang.String str4 = this.f464871i;
            if (str4 != null) {
                e17 += b36.f.j(7, str4);
            }
            return e17 + b36.f.e(8, this.f464872m);
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
        r45.pr5 pr5Var = (r45.pr5) objArr[1];
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
                    pr5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pr5Var.f464866d = aVar2.k(intValue);
                return 0;
            case 3:
                pr5Var.f464867e = aVar2.g(intValue);
                return 0;
            case 4:
                pr5Var.f464868f = aVar2.g(intValue);
                return 0;
            case 5:
                pr5Var.f464869g = aVar2.i(intValue);
                return 0;
            case 6:
                pr5Var.f464870h = aVar2.g(intValue);
                return 0;
            case 7:
                pr5Var.f464871i = aVar2.k(intValue);
                return 0;
            case 8:
                pr5Var.f464872m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

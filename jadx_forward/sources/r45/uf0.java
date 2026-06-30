package r45;

/* loaded from: classes4.dex */
public class uf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468848d;

    /* renamed from: e, reason: collision with root package name */
    public int f468849e;

    /* renamed from: f, reason: collision with root package name */
    public int f468850f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f468851g;

    /* renamed from: h, reason: collision with root package name */
    public long f468852h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf0)) {
            return false;
        }
        r45.uf0 uf0Var = (r45.uf0) fVar;
        return n51.f.a(this.f76492x92037252, uf0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f468848d), java.lang.Integer.valueOf(uf0Var.f468848d)) && n51.f.a(java.lang.Integer.valueOf(this.f468849e), java.lang.Integer.valueOf(uf0Var.f468849e)) && n51.f.a(java.lang.Integer.valueOf(this.f468850f), java.lang.Integer.valueOf(uf0Var.f468850f)) && n51.f.a(this.f468851g, uf0Var.f468851g) && n51.f.a(java.lang.Long.valueOf(this.f468852h), java.lang.Long.valueOf(uf0Var.f468852h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468848d);
            fVar.e(3, this.f468849e);
            fVar.e(4, this.f468850f);
            r45.cu5 cu5Var = this.f468851g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f468851g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f468852h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468848d) + b36.f.e(3, this.f468849e) + b36.f.e(4, this.f468850f);
            r45.cu5 cu5Var2 = this.f468851g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.h(6, this.f468852h);
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
        r45.uf0 uf0Var = (r45.uf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    uf0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                uf0Var.f468848d = aVar2.g(intValue);
                return 0;
            case 3:
                uf0Var.f468849e = aVar2.g(intValue);
                return 0;
            case 4:
                uf0Var.f468850f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    uf0Var.f468851g = cu5Var3;
                }
                return 0;
            case 6:
                uf0Var.f468852h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

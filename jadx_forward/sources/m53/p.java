package m53;

/* loaded from: classes8.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405483d;

    /* renamed from: e, reason: collision with root package name */
    public int f405484e;

    /* renamed from: f, reason: collision with root package name */
    public m53.c f405485f;

    /* renamed from: g, reason: collision with root package name */
    public m53.f5 f405486g;

    /* renamed from: h, reason: collision with root package name */
    public int f405487h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405488i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p)) {
            return false;
        }
        m53.p pVar = (m53.p) fVar;
        return n51.f.a(this.f405483d, pVar.f405483d) && n51.f.a(java.lang.Integer.valueOf(this.f405484e), java.lang.Integer.valueOf(pVar.f405484e)) && n51.f.a(this.f405485f, pVar.f405485f) && n51.f.a(this.f405486g, pVar.f405486g) && n51.f.a(java.lang.Integer.valueOf(this.f405487h), java.lang.Integer.valueOf(pVar.f405487h)) && n51.f.a(this.f405488i, pVar.f405488i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405483d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f405484e);
            m53.c cVar = this.f405485f;
            if (cVar != null) {
                fVar.i(3, cVar.mo75928xcd1e8d8());
                this.f405485f.mo75956x3d5d1f78(fVar);
            }
            m53.f5 f5Var = this.f405486g;
            if (f5Var != null) {
                fVar.i(4, f5Var.mo75928xcd1e8d8());
                this.f405486g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f405487h);
            java.lang.String str2 = this.f405488i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f405483d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f405484e);
            m53.c cVar2 = this.f405485f;
            if (cVar2 != null) {
                j17 += b36.f.i(3, cVar2.mo75928xcd1e8d8());
            }
            m53.f5 f5Var2 = this.f405486g;
            if (f5Var2 != null) {
                j17 += b36.f.i(4, f5Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(5, this.f405487h);
            java.lang.String str4 = this.f405488i;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        m53.p pVar = (m53.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pVar.f405483d = aVar2.k(intValue);
                return 0;
            case 2:
                pVar.f405484e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.c cVar3 = new m53.c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.mo11468x92b714fd(bArr);
                    }
                    pVar.f405485f = cVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    m53.f5 f5Var3 = new m53.f5();
                    if (bArr2 != null && bArr2.length > 0) {
                        f5Var3.mo11468x92b714fd(bArr2);
                    }
                    pVar.f405486g = f5Var3;
                }
                return 0;
            case 5:
                pVar.f405487h = aVar2.g(intValue);
                return 0;
            case 6:
                pVar.f405488i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

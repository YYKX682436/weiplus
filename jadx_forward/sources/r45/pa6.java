package r45;

/* loaded from: classes4.dex */
public class pa6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464446d;

    /* renamed from: e, reason: collision with root package name */
    public long f464447e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464448f;

    /* renamed from: g, reason: collision with root package name */
    public int f464449g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f464450h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f464451i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pa6)) {
            return false;
        }
        r45.pa6 pa6Var = (r45.pa6) fVar;
        return n51.f.a(this.f76494x2de60e5e, pa6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f464446d), java.lang.Integer.valueOf(pa6Var.f464446d)) && n51.f.a(java.lang.Long.valueOf(this.f464447e), java.lang.Long.valueOf(pa6Var.f464447e)) && n51.f.a(this.f464448f, pa6Var.f464448f) && n51.f.a(java.lang.Integer.valueOf(this.f464449g), java.lang.Integer.valueOf(pa6Var.f464449g)) && n51.f.a(this.f464450h, pa6Var.f464450h) && n51.f.a(java.lang.Integer.valueOf(this.f464451i), java.lang.Integer.valueOf(pa6Var.f464451i));
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
            fVar.e(2, this.f464446d);
            fVar.h(3, this.f464447e);
            java.lang.String str = this.f464448f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f464449g);
            fVar.g(6, 8, this.f464450h);
            fVar.e(7, this.f464451i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464446d) + b36.f.h(3, this.f464447e);
            java.lang.String str2 = this.f464448f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f464449g) + b36.f.g(6, 8, this.f464450h) + b36.f.e(7, this.f464451i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f464450h.clear();
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
        r45.pa6 pa6Var = (r45.pa6) objArr[1];
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
                    pa6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pa6Var.f464446d = aVar2.g(intValue);
                return 0;
            case 3:
                pa6Var.f464447e = aVar2.i(intValue);
                return 0;
            case 4:
                pa6Var.f464448f = aVar2.k(intValue);
                return 0;
            case 5:
                pa6Var.f464449g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    pa6Var.f464450h.add(du5Var);
                }
                return 0;
            case 7:
                pa6Var.f464451i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

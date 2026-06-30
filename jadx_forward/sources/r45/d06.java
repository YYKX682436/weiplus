package r45;

/* loaded from: classes4.dex */
public class d06 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453513d;

    /* renamed from: e, reason: collision with root package name */
    public int f453514e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f453515f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f453516g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d06)) {
            return false;
        }
        r45.d06 d06Var = (r45.d06) fVar;
        return n51.f.a(this.f76494x2de60e5e, d06Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f453513d), java.lang.Integer.valueOf(d06Var.f453513d)) && n51.f.a(java.lang.Integer.valueOf(this.f453514e), java.lang.Integer.valueOf(d06Var.f453514e)) && n51.f.a(this.f453515f, d06Var.f453515f) && n51.f.a(java.lang.Integer.valueOf(this.f453516g), java.lang.Integer.valueOf(d06Var.f453516g));
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
            fVar.e(2, this.f453513d);
            fVar.e(3, this.f453514e);
            fVar.g(4, 8, this.f453515f);
            fVar.e(5, this.f453516g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453513d) + b36.f.e(3, this.f453514e) + b36.f.g(4, 8, this.f453515f) + b36.f.e(5, this.f453516g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453515f.clear();
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
        r45.d06 d06Var = (r45.d06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                d06Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            d06Var.f453513d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d06Var.f453514e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            d06Var.f453516g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.m57 m57Var = new r45.m57();
            if (bArr3 != null && bArr3.length > 0) {
                m57Var.mo11468x92b714fd(bArr3);
            }
            d06Var.f453515f.add(m57Var);
        }
        return 0;
    }
}

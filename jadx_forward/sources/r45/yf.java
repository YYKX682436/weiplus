package r45;

/* loaded from: classes8.dex */
public class yf extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472561d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f472562e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f472563f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yf)) {
            return false;
        }
        r45.yf yfVar = (r45.yf) fVar;
        return n51.f.a(this.f76494x2de60e5e, yfVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f472561d), java.lang.Integer.valueOf(yfVar.f472561d)) && n51.f.a(this.f472562e, yfVar.f472562e) && n51.f.a(java.lang.Integer.valueOf(this.f472563f), java.lang.Integer.valueOf(yfVar.f472563f));
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
            fVar.e(2, this.f472561d);
            fVar.g(3, 8, this.f472562e);
            fVar.e(4, this.f472563f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472561d) + b36.f.g(3, 8, this.f472562e) + b36.f.e(4, this.f472563f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472562e.clear();
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
        r45.yf yfVar = (r45.yf) objArr[1];
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
                yfVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yfVar.f472561d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            yfVar.f472563f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.zp3 zp3Var = new r45.zp3();
            if (bArr3 != null && bArr3.length > 0) {
                zp3Var.mo11468x92b714fd(bArr3);
            }
            yfVar.f472562e.add(zp3Var);
        }
        return 0;
    }
}

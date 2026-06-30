package r45;

/* loaded from: classes4.dex */
public class u0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f468433d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f468434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468436g;

    /* renamed from: h, reason: collision with root package name */
    public int f468437h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u0)) {
            return false;
        }
        r45.u0 u0Var = (r45.u0) fVar;
        return n51.f.a(this.f76494x2de60e5e, u0Var.f76494x2de60e5e) && n51.f.a(this.f468433d, u0Var.f468433d) && n51.f.a(java.lang.Integer.valueOf(this.f468434e), java.lang.Integer.valueOf(u0Var.f468434e)) && n51.f.a(this.f468435f, u0Var.f468435f) && n51.f.a(this.f468436g, u0Var.f468436g) && n51.f.a(java.lang.Integer.valueOf(this.f468437h), java.lang.Integer.valueOf(u0Var.f468437h));
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
            fVar.g(2, 8, this.f468433d);
            fVar.e(3, this.f468434e);
            java.lang.String str = this.f468435f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f468436g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f468437h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f468433d) + b36.f.e(3, this.f468434e);
            java.lang.String str3 = this.f468435f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f468436g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.e(6, this.f468437h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468433d.clear();
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
        r45.u0 u0Var = (r45.u0) objArr[1];
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
                    u0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hu huVar = new r45.hu();
                    if (bArr3 != null && bArr3.length > 0) {
                        huVar.mo11468x92b714fd(bArr3);
                    }
                    u0Var.f468433d.add(huVar);
                }
                return 0;
            case 3:
                u0Var.f468434e = aVar2.g(intValue);
                return 0;
            case 4:
                u0Var.f468435f = aVar2.k(intValue);
                return 0;
            case 5:
                u0Var.f468436g = aVar2.k(intValue);
                return 0;
            case 6:
                u0Var.f468437h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

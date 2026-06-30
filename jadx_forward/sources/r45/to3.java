package r45;

/* loaded from: classes4.dex */
public class to3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468160d;

    /* renamed from: e, reason: collision with root package name */
    public int f468161e;

    /* renamed from: f, reason: collision with root package name */
    public int f468162f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468163g;

    /* renamed from: h, reason: collision with root package name */
    public int f468164h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f468165i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.to3)) {
            return false;
        }
        r45.to3 to3Var = (r45.to3) fVar;
        return n51.f.a(this.f76494x2de60e5e, to3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f468160d), java.lang.Integer.valueOf(to3Var.f468160d)) && n51.f.a(java.lang.Integer.valueOf(this.f468161e), java.lang.Integer.valueOf(to3Var.f468161e)) && n51.f.a(java.lang.Integer.valueOf(this.f468162f), java.lang.Integer.valueOf(to3Var.f468162f)) && n51.f.a(this.f468163g, to3Var.f468163g) && n51.f.a(java.lang.Integer.valueOf(this.f468164h), java.lang.Integer.valueOf(to3Var.f468164h)) && n51.f.a(this.f468165i, to3Var.f468165i);
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
            fVar.e(2, this.f468160d);
            fVar.e(3, this.f468161e);
            fVar.e(4, this.f468162f);
            java.lang.String str = this.f468163g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f468164h);
            fVar.g(7, 8, this.f468165i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468160d) + b36.f.e(3, this.f468161e) + b36.f.e(4, this.f468162f);
            java.lang.String str2 = this.f468163g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f468164h) + b36.f.g(7, 8, this.f468165i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468165i.clear();
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
        r45.to3 to3Var = (r45.to3) objArr[1];
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
                    to3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                to3Var.f468160d = aVar2.g(intValue);
                return 0;
            case 3:
                to3Var.f468161e = aVar2.g(intValue);
                return 0;
            case 4:
                to3Var.f468162f = aVar2.g(intValue);
                return 0;
            case 5:
                to3Var.f468163g = aVar2.k(intValue);
                return 0;
            case 6:
                to3Var.f468164h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    to3Var.f468165i.add(du5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}

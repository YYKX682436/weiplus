package r45;

/* loaded from: classes4.dex */
public class b83 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452160d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452161e;

    /* renamed from: f, reason: collision with root package name */
    public int f452162f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f452163g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b83)) {
            return false;
        }
        r45.b83 b83Var = (r45.b83) fVar;
        return n51.f.a(this.f76494x2de60e5e, b83Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f452160d), java.lang.Integer.valueOf(b83Var.f452160d)) && n51.f.a(this.f452161e, b83Var.f452161e) && n51.f.a(java.lang.Integer.valueOf(this.f452162f), java.lang.Integer.valueOf(b83Var.f452162f)) && n51.f.a(this.f452163g, b83Var.f452163g);
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
            fVar.e(2, this.f452160d);
            java.lang.String str = this.f452161e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f452162f);
            fVar.g(5, 8, this.f452163g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452160d);
            java.lang.String str2 = this.f452161e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f452162f) + b36.f.g(5, 8, this.f452163g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452163g.clear();
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
        r45.b83 b83Var = (r45.b83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                b83Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            b83Var.f452160d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            b83Var.f452161e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            b83Var.f452162f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.d83 d83Var = new r45.d83();
            if (bArr3 != null && bArr3.length > 0) {
                d83Var.mo11468x92b714fd(bArr3);
            }
            b83Var.f452163g.add(d83Var);
        }
        return 0;
    }
}

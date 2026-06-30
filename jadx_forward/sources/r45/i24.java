package r45;

/* loaded from: classes7.dex */
public class i24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458213d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f458214e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f458215f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458216g;

    /* renamed from: h, reason: collision with root package name */
    public int f458217h;

    /* renamed from: i, reason: collision with root package name */
    public int f458218i;

    /* renamed from: m, reason: collision with root package name */
    public r45.nd7 f458219m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i24)) {
            return false;
        }
        r45.i24 i24Var = (r45.i24) fVar;
        return n51.f.a(this.f76494x2de60e5e, i24Var.f76494x2de60e5e) && n51.f.a(this.f458213d, i24Var.f458213d) && n51.f.a(this.f458214e, i24Var.f458214e) && n51.f.a(java.lang.Integer.valueOf(this.f458215f), java.lang.Integer.valueOf(i24Var.f458215f)) && n51.f.a(this.f458216g, i24Var.f458216g) && n51.f.a(java.lang.Integer.valueOf(this.f458217h), java.lang.Integer.valueOf(i24Var.f458217h)) && n51.f.a(java.lang.Integer.valueOf(this.f458218i), java.lang.Integer.valueOf(i24Var.f458218i)) && n51.f.a(this.f458219m, i24Var.f458219m);
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
            java.lang.String str = this.f458213d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f458214e);
            fVar.e(4, this.f458215f);
            java.lang.String str2 = this.f458216g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f458217h);
            fVar.e(8, this.f458218i);
            r45.nd7 nd7Var = this.f458219m;
            if (nd7Var != null) {
                fVar.i(9, nd7Var.mo75928xcd1e8d8());
                this.f458219m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f458213d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f458214e) + b36.f.e(4, this.f458215f);
            java.lang.String str4 = this.f458216g;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            int e17 = g17 + b36.f.e(7, this.f458217h) + b36.f.e(8, this.f458218i);
            r45.nd7 nd7Var2 = this.f458219m;
            return nd7Var2 != null ? e17 + b36.f.i(9, nd7Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458214e.clear();
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
        r45.i24 i24Var = (r45.i24) objArr[1];
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
                    i24Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                i24Var.f458213d = aVar2.k(intValue);
                return 0;
            case 3:
                i24Var.f458214e.add(aVar2.k(intValue));
                return 0;
            case 4:
                i24Var.f458215f = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                i24Var.f458216g = aVar2.k(intValue);
                return 0;
            case 7:
                i24Var.f458217h = aVar2.g(intValue);
                return 0;
            case 8:
                i24Var.f458218i = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        nd7Var3.mo11468x92b714fd(bArr3);
                    }
                    i24Var.f458219m = nd7Var3;
                }
                return 0;
        }
    }
}

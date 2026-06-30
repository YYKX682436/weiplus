package t45;

/* loaded from: classes10.dex */
public class b1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f497060d;

    /* renamed from: e, reason: collision with root package name */
    public t45.l0 f497061e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f497062f;

    /* renamed from: g, reason: collision with root package name */
    public int f497063g;

    /* renamed from: h, reason: collision with root package name */
    public int f497064h;

    /* renamed from: i, reason: collision with root package name */
    public int f497065i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f497066m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.b1)) {
            return false;
        }
        t45.b1 b1Var = (t45.b1) fVar;
        return n51.f.a(this.f76494x2de60e5e, b1Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f497060d), java.lang.Integer.valueOf(b1Var.f497060d)) && n51.f.a(this.f497061e, b1Var.f497061e) && n51.f.a(this.f497062f, b1Var.f497062f) && n51.f.a(java.lang.Integer.valueOf(this.f497063g), java.lang.Integer.valueOf(b1Var.f497063g)) && n51.f.a(java.lang.Integer.valueOf(this.f497064h), java.lang.Integer.valueOf(b1Var.f497064h)) && n51.f.a(java.lang.Integer.valueOf(this.f497065i), java.lang.Integer.valueOf(b1Var.f497065i)) && n51.f.a(this.f497066m, b1Var.f497066m);
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
            fVar.e(2, this.f497060d);
            t45.l0 l0Var = this.f497061e;
            if (l0Var != null) {
                fVar.i(3, l0Var.mo75928xcd1e8d8());
                this.f497061e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f497062f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f497063g);
            fVar.e(6, this.f497064h);
            fVar.e(7, this.f497065i);
            java.lang.String str2 = this.f497066m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f497060d);
            t45.l0 l0Var2 = this.f497061e;
            if (l0Var2 != null) {
                i18 += b36.f.i(3, l0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f497062f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f497063g) + b36.f.e(6, this.f497064h) + b36.f.e(7, this.f497065i);
            java.lang.String str4 = this.f497066m;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
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
        t45.b1 b1Var = (t45.b1) objArr[1];
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
                    b1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                b1Var.f497060d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    t45.l0 l0Var3 = new t45.l0();
                    if (bArr2 != null && bArr2.length > 0) {
                        l0Var3.mo11468x92b714fd(bArr2);
                    }
                    b1Var.f497061e = l0Var3;
                }
                return 0;
            case 4:
                b1Var.f497062f = aVar2.k(intValue);
                return 0;
            case 5:
                b1Var.f497063g = aVar2.g(intValue);
                return 0;
            case 6:
                b1Var.f497064h = aVar2.g(intValue);
                return 0;
            case 7:
                b1Var.f497065i = aVar2.g(intValue);
                return 0;
            case 8:
                b1Var.f497066m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

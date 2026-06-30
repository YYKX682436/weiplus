package r45;

/* loaded from: classes4.dex */
public class pp3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464819d;

    /* renamed from: e, reason: collision with root package name */
    public int f464820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464821f;

    /* renamed from: g, reason: collision with root package name */
    public int f464822g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464823h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464824i;

    /* renamed from: m, reason: collision with root package name */
    public int f464825m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pp3)) {
            return false;
        }
        r45.pp3 pp3Var = (r45.pp3) fVar;
        return n51.f.a(this.f76494x2de60e5e, pp3Var.f76494x2de60e5e) && n51.f.a(this.f464819d, pp3Var.f464819d) && n51.f.a(java.lang.Integer.valueOf(this.f464820e), java.lang.Integer.valueOf(pp3Var.f464820e)) && n51.f.a(this.f464821f, pp3Var.f464821f) && n51.f.a(java.lang.Integer.valueOf(this.f464822g), java.lang.Integer.valueOf(pp3Var.f464822g)) && n51.f.a(this.f464823h, pp3Var.f464823h) && n51.f.a(this.f464824i, pp3Var.f464824i) && n51.f.a(java.lang.Integer.valueOf(this.f464825m), java.lang.Integer.valueOf(pp3Var.f464825m));
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
            java.lang.String str = this.f464819d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f464820e);
            java.lang.String str2 = this.f464821f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f464822g);
            java.lang.String str3 = this.f464823h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f464824i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f464825m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f464819d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f464820e);
            java.lang.String str6 = this.f464821f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f464822g);
            java.lang.String str7 = this.f464823h;
            if (str7 != null) {
                e18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f464824i;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            return e18 + b36.f.e(8, this.f464825m);
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
        r45.pp3 pp3Var = (r45.pp3) objArr[1];
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
                    pp3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pp3Var.f464819d = aVar2.k(intValue);
                return 0;
            case 3:
                pp3Var.f464820e = aVar2.g(intValue);
                return 0;
            case 4:
                pp3Var.f464821f = aVar2.k(intValue);
                return 0;
            case 5:
                pp3Var.f464822g = aVar2.g(intValue);
                return 0;
            case 6:
                pp3Var.f464823h = aVar2.k(intValue);
                return 0;
            case 7:
                pp3Var.f464824i = aVar2.k(intValue);
                return 0;
            case 8:
                pp3Var.f464825m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

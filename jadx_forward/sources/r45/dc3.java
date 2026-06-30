package r45;

/* loaded from: classes14.dex */
public class dc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453832d;

    /* renamed from: e, reason: collision with root package name */
    public int f453833e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453834f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453835g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453836h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453837i;

    /* renamed from: m, reason: collision with root package name */
    public int f453838m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453839n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pd6 f453840o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dc3)) {
            return false;
        }
        r45.dc3 dc3Var = (r45.dc3) fVar;
        return n51.f.a(this.f76494x2de60e5e, dc3Var.f76494x2de60e5e) && n51.f.a(this.f453832d, dc3Var.f453832d) && n51.f.a(java.lang.Integer.valueOf(this.f453833e), java.lang.Integer.valueOf(dc3Var.f453833e)) && n51.f.a(this.f453834f, dc3Var.f453834f) && n51.f.a(this.f453835g, dc3Var.f453835g) && n51.f.a(this.f453836h, dc3Var.f453836h) && n51.f.a(this.f453837i, dc3Var.f453837i) && n51.f.a(java.lang.Integer.valueOf(this.f453838m), java.lang.Integer.valueOf(dc3Var.f453838m)) && n51.f.a(this.f453839n, dc3Var.f453839n) && n51.f.a(this.f453840o, dc3Var.f453840o);
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
            java.lang.String str = this.f453832d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f453833e);
            java.lang.String str2 = this.f453834f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453835g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f453836h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f453837i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f453838m);
            java.lang.String str6 = this.f453839n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            r45.pd6 pd6Var = this.f453840o;
            if (pd6Var != null) {
                fVar.i(10, pd6Var.mo75928xcd1e8d8());
                this.f453840o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f453832d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f453833e);
            java.lang.String str8 = this.f453834f;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f453835g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f453836h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f453837i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f453838m);
            java.lang.String str12 = this.f453839n;
            if (str12 != null) {
                e18 += b36.f.j(9, str12);
            }
            r45.pd6 pd6Var2 = this.f453840o;
            return pd6Var2 != null ? e18 + b36.f.i(10, pd6Var2.mo75928xcd1e8d8()) : e18;
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
        r45.dc3 dc3Var = (r45.dc3) objArr[1];
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
                    dc3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                dc3Var.f453832d = aVar2.k(intValue);
                return 0;
            case 3:
                dc3Var.f453833e = aVar2.g(intValue);
                return 0;
            case 4:
                dc3Var.f453834f = aVar2.k(intValue);
                return 0;
            case 5:
                dc3Var.f453835g = aVar2.k(intValue);
                return 0;
            case 6:
                dc3Var.f453836h = aVar2.k(intValue);
                return 0;
            case 7:
                dc3Var.f453837i = aVar2.k(intValue);
                return 0;
            case 8:
                dc3Var.f453838m = aVar2.g(intValue);
                return 0;
            case 9:
                dc3Var.f453839n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.pd6 pd6Var3 = new r45.pd6();
                    if (bArr2 != null && bArr2.length > 0) {
                        pd6Var3.mo11468x92b714fd(bArr2);
                    }
                    dc3Var.f453840o = pd6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

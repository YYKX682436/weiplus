package r45;

/* loaded from: classes9.dex */
public class xi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471670d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471671e;

    /* renamed from: f, reason: collision with root package name */
    public int f471672f;

    /* renamed from: g, reason: collision with root package name */
    public int f471673g;

    /* renamed from: h, reason: collision with root package name */
    public r45.i45 f471674h;

    /* renamed from: i, reason: collision with root package name */
    public r45.j45 f471675i;

    /* renamed from: m, reason: collision with root package name */
    public r45.j45 f471676m;

    /* renamed from: n, reason: collision with root package name */
    public r45.k45 f471677n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi3)) {
            return false;
        }
        r45.xi3 xi3Var = (r45.xi3) fVar;
        return n51.f.a(this.f76492x92037252, xi3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f471670d), java.lang.Integer.valueOf(xi3Var.f471670d)) && n51.f.a(this.f471671e, xi3Var.f471671e) && n51.f.a(java.lang.Integer.valueOf(this.f471672f), java.lang.Integer.valueOf(xi3Var.f471672f)) && n51.f.a(java.lang.Integer.valueOf(this.f471673g), java.lang.Integer.valueOf(xi3Var.f471673g)) && n51.f.a(this.f471674h, xi3Var.f471674h) && n51.f.a(this.f471675i, xi3Var.f471675i) && n51.f.a(this.f471676m, xi3Var.f471676m) && n51.f.a(this.f471677n, xi3Var.f471677n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f471670d);
            java.lang.String str = this.f471671e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f471672f);
            fVar.e(5, this.f471673g);
            r45.i45 i45Var = this.f471674h;
            if (i45Var != null) {
                fVar.i(6, i45Var.mo75928xcd1e8d8());
                this.f471674h.mo75956x3d5d1f78(fVar);
            }
            r45.j45 j45Var = this.f471675i;
            if (j45Var != null) {
                fVar.i(7, j45Var.mo75928xcd1e8d8());
                this.f471675i.mo75956x3d5d1f78(fVar);
            }
            r45.j45 j45Var2 = this.f471676m;
            if (j45Var2 != null) {
                fVar.i(8, j45Var2.mo75928xcd1e8d8());
                this.f471676m.mo75956x3d5d1f78(fVar);
            }
            r45.k45 k45Var = this.f471677n;
            if (k45Var != null) {
                fVar.i(9, k45Var.mo75928xcd1e8d8());
                this.f471677n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471670d);
            java.lang.String str2 = this.f471671e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f471672f) + b36.f.e(5, this.f471673g);
            r45.i45 i45Var2 = this.f471674h;
            if (i45Var2 != null) {
                e17 += b36.f.i(6, i45Var2.mo75928xcd1e8d8());
            }
            r45.j45 j45Var3 = this.f471675i;
            if (j45Var3 != null) {
                e17 += b36.f.i(7, j45Var3.mo75928xcd1e8d8());
            }
            r45.j45 j45Var4 = this.f471676m;
            if (j45Var4 != null) {
                e17 += b36.f.i(8, j45Var4.mo75928xcd1e8d8());
            }
            r45.k45 k45Var2 = this.f471677n;
            return k45Var2 != null ? e17 + b36.f.i(9, k45Var2.mo75928xcd1e8d8()) : e17;
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
        r45.xi3 xi3Var = (r45.xi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    xi3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xi3Var.f471670d = aVar2.g(intValue);
                return 0;
            case 3:
                xi3Var.f471671e = aVar2.k(intValue);
                return 0;
            case 4:
                xi3Var.f471672f = aVar2.g(intValue);
                return 0;
            case 5:
                xi3Var.f471673g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.i45 i45Var3 = new r45.i45();
                    if (bArr2 != null && bArr2.length > 0) {
                        i45Var3.mo11468x92b714fd(bArr2);
                    }
                    xi3Var.f471674h = i45Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.j45 j45Var5 = new r45.j45();
                    if (bArr3 != null && bArr3.length > 0) {
                        j45Var5.mo11468x92b714fd(bArr3);
                    }
                    xi3Var.f471675i = j45Var5;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.j45 j45Var6 = new r45.j45();
                    if (bArr4 != null && bArr4.length > 0) {
                        j45Var6.mo11468x92b714fd(bArr4);
                    }
                    xi3Var.f471676m = j45Var6;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.k45 k45Var3 = new r45.k45();
                    if (bArr5 != null && bArr5.length > 0) {
                        k45Var3.mo11468x92b714fd(bArr5);
                    }
                    xi3Var.f471677n = k45Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

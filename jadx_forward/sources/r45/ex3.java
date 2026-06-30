package r45;

/* loaded from: classes9.dex */
public class ex3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f455314d;

    /* renamed from: e, reason: collision with root package name */
    public int f455315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455316f;

    /* renamed from: g, reason: collision with root package name */
    public int f455317g;

    /* renamed from: h, reason: collision with root package name */
    public int f455318h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455319i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex3)) {
            return false;
        }
        r45.ex3 ex3Var = (r45.ex3) fVar;
        return n51.f.a(this.f76492x92037252, ex3Var.f76492x92037252) && n51.f.a(this.f455314d, ex3Var.f455314d) && n51.f.a(java.lang.Integer.valueOf(this.f455315e), java.lang.Integer.valueOf(ex3Var.f455315e)) && n51.f.a(this.f455316f, ex3Var.f455316f) && n51.f.a(java.lang.Integer.valueOf(this.f455317g), java.lang.Integer.valueOf(ex3Var.f455317g)) && n51.f.a(java.lang.Integer.valueOf(this.f455318h), java.lang.Integer.valueOf(ex3Var.f455318h)) && n51.f.a(this.f455319i, ex3Var.f455319i);
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
            r45.cu5 cu5Var = this.f455314d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f455314d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f455315e);
            java.lang.String str = this.f455316f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f455317g);
            fVar.e(6, this.f455318h);
            java.lang.String str2 = this.f455319i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f455314d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f455315e);
            java.lang.String str3 = this.f455316f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f455317g) + b36.f.e(6, this.f455318h);
            java.lang.String str4 = this.f455319i;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.ex3 ex3Var = (r45.ex3) objArr[1];
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
                    ex3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ex3Var.f455314d = cu5Var3;
                }
                return 0;
            case 3:
                ex3Var.f455315e = aVar2.g(intValue);
                return 0;
            case 4:
                ex3Var.f455316f = aVar2.k(intValue);
                return 0;
            case 5:
                ex3Var.f455317g = aVar2.g(intValue);
                return 0;
            case 6:
                ex3Var.f455318h = aVar2.g(intValue);
                return 0;
            case 7:
                ex3Var.f455319i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

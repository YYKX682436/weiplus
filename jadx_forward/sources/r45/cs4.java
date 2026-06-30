package r45;

/* loaded from: classes8.dex */
public class cs4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453341d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453342e;

    /* renamed from: f, reason: collision with root package name */
    public r45.as4 f453343f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453344g;

    /* renamed from: h, reason: collision with root package name */
    public int f453345h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f453346i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453347m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cs4)) {
            return false;
        }
        r45.cs4 cs4Var = (r45.cs4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453341d), java.lang.Integer.valueOf(cs4Var.f453341d)) && n51.f.a(this.f453342e, cs4Var.f453342e) && n51.f.a(this.f453343f, cs4Var.f453343f) && n51.f.a(this.f453344g, cs4Var.f453344g) && n51.f.a(java.lang.Integer.valueOf(this.f453345h), java.lang.Integer.valueOf(cs4Var.f453345h)) && n51.f.a(java.lang.Boolean.valueOf(this.f453346i), java.lang.Boolean.valueOf(cs4Var.f453346i)) && n51.f.a(this.f453347m, cs4Var.f453347m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453341d);
            java.lang.String str = this.f453342e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.as4 as4Var = this.f453343f;
            if (as4Var != null) {
                fVar.i(3, as4Var.mo75928xcd1e8d8());
                this.f453343f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f453344g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f453345h);
            fVar.a(6, this.f453346i);
            java.lang.String str3 = this.f453347m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453341d) + 0;
            java.lang.String str4 = this.f453342e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            r45.as4 as4Var2 = this.f453343f;
            if (as4Var2 != null) {
                e17 += b36.f.i(3, as4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f453344g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            int e18 = e17 + b36.f.e(5, this.f453345h) + b36.f.a(6, this.f453346i);
            java.lang.String str6 = this.f453347m;
            return str6 != null ? e18 + b36.f.j(7, str6) : e18;
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
        r45.cs4 cs4Var = (r45.cs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cs4Var.f453341d = aVar2.g(intValue);
                return 0;
            case 2:
                cs4Var.f453342e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.as4 as4Var3 = new r45.as4();
                    if (bArr != null && bArr.length > 0) {
                        as4Var3.mo11468x92b714fd(bArr);
                    }
                    cs4Var.f453343f = as4Var3;
                }
                return 0;
            case 4:
                cs4Var.f453344g = aVar2.k(intValue);
                return 0;
            case 5:
                cs4Var.f453345h = aVar2.g(intValue);
                return 0;
            case 6:
                cs4Var.f453346i = aVar2.c(intValue);
                return 0;
            case 7:
                cs4Var.f453347m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes4.dex */
public class j24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f459042d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459043e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459044f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459045g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459046h;

    /* renamed from: i, reason: collision with root package name */
    public int f459047i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459048m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459049n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j24)) {
            return false;
        }
        r45.j24 j24Var = (r45.j24) fVar;
        return n51.f.a(this.f76492x92037252, j24Var.f76492x92037252) && n51.f.a(this.f459042d, j24Var.f459042d) && n51.f.a(this.f459043e, j24Var.f459043e) && n51.f.a(this.f459044f, j24Var.f459044f) && n51.f.a(this.f459045g, j24Var.f459045g) && n51.f.a(this.f459046h, j24Var.f459046h) && n51.f.a(java.lang.Integer.valueOf(this.f459047i), java.lang.Integer.valueOf(j24Var.f459047i)) && n51.f.a(this.f459048m, j24Var.f459048m) && n51.f.a(this.f459049n, j24Var.f459049n);
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
            r45.j14 j14Var = this.f459042d;
            if (j14Var != null) {
                fVar.i(2, j14Var.mo75928xcd1e8d8());
                this.f459042d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f459043e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f459044f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f459045g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f459046h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f459047i);
            java.lang.String str5 = this.f459048m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f459049n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j14 j14Var2 = this.f459042d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f459043e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f459044f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f459045g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f459046h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int e17 = i18 + b36.f.e(7, this.f459047i);
            java.lang.String str11 = this.f459048m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f459049n;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.j24 j24Var = (r45.j24) objArr[1];
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
                    j24Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr2 != null && bArr2.length > 0) {
                        j14Var3.mo11468x92b714fd(bArr2);
                    }
                    j24Var.f459042d = j14Var3;
                }
                return 0;
            case 3:
                j24Var.f459043e = aVar2.k(intValue);
                return 0;
            case 4:
                j24Var.f459044f = aVar2.k(intValue);
                return 0;
            case 5:
                j24Var.f459045g = aVar2.k(intValue);
                return 0;
            case 6:
                j24Var.f459046h = aVar2.k(intValue);
                return 0;
            case 7:
                j24Var.f459047i = aVar2.g(intValue);
                return 0;
            case 8:
                j24Var.f459048m = aVar2.k(intValue);
                return 0;
            case 9:
                j24Var.f459049n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

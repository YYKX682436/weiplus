package r45;

/* loaded from: classes7.dex */
public class n24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f462548d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462549e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jv5 f462550f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462551g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462552h;

    /* renamed from: i, reason: collision with root package name */
    public r45.eb0 f462553i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f462554m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462555n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462556o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462557p;

    /* renamed from: q, reason: collision with root package name */
    public r45.sv6 f462558q;

    /* renamed from: r, reason: collision with root package name */
    public r45.i7 f462559r;

    /* renamed from: s, reason: collision with root package name */
    public r45.pw6 f462560s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n24)) {
            return false;
        }
        r45.n24 n24Var = (r45.n24) fVar;
        return n51.f.a(this.f76492x92037252, n24Var.f76492x92037252) && n51.f.a(this.f462548d, n24Var.f462548d) && n51.f.a(this.f462549e, n24Var.f462549e) && n51.f.a(this.f462550f, n24Var.f462550f) && n51.f.a(this.f462551g, n24Var.f462551g) && n51.f.a(this.f462552h, n24Var.f462552h) && n51.f.a(this.f462553i, n24Var.f462553i) && n51.f.a(java.lang.Boolean.valueOf(this.f462554m), java.lang.Boolean.valueOf(n24Var.f462554m)) && n51.f.a(this.f462555n, n24Var.f462555n) && n51.f.a(this.f462556o, n24Var.f462556o) && n51.f.a(this.f462557p, n24Var.f462557p) && n51.f.a(this.f462558q, n24Var.f462558q) && n51.f.a(this.f462559r, n24Var.f462559r) && n51.f.a(this.f462560s, n24Var.f462560s);
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
            r45.j14 j14Var = this.f462548d;
            if (j14Var != null) {
                fVar.i(2, j14Var.mo75928xcd1e8d8());
                this.f462548d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f462549e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.jv5 jv5Var = this.f462550f;
            if (jv5Var != null) {
                fVar.i(4, jv5Var.mo75928xcd1e8d8());
                this.f462550f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f462551g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f462552h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.eb0 eb0Var = this.f462553i;
            if (eb0Var != null) {
                fVar.i(7, eb0Var.mo75928xcd1e8d8());
                this.f462553i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f462554m);
            java.lang.String str3 = this.f462555n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f462556o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f462557p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            r45.sv6 sv6Var = this.f462558q;
            if (sv6Var != null) {
                fVar.i(12, sv6Var.mo75928xcd1e8d8());
                this.f462558q.mo75956x3d5d1f78(fVar);
            }
            r45.i7 i7Var = this.f462559r;
            if (i7Var != null) {
                fVar.i(13, i7Var.mo75928xcd1e8d8());
                this.f462559r.mo75956x3d5d1f78(fVar);
            }
            r45.pw6 pw6Var = this.f462560s;
            if (pw6Var != null) {
                fVar.i(15, pw6Var.mo75928xcd1e8d8());
                this.f462560s.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.j14 j14Var2 = this.f462548d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f462549e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.jv5 jv5Var2 = this.f462550f;
            if (jv5Var2 != null) {
                i18 += b36.f.i(4, jv5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f462551g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f462552h;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            r45.eb0 eb0Var2 = this.f462553i;
            if (eb0Var2 != null) {
                i18 += b36.f.i(7, eb0Var2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(8, this.f462554m);
            java.lang.String str8 = this.f462555n;
            if (str8 != null) {
                a17 += b36.f.j(9, str8);
            }
            java.lang.String str9 = this.f462556o;
            if (str9 != null) {
                a17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f462557p;
            if (str10 != null) {
                a17 += b36.f.j(11, str10);
            }
            r45.sv6 sv6Var2 = this.f462558q;
            if (sv6Var2 != null) {
                a17 += b36.f.i(12, sv6Var2.mo75928xcd1e8d8());
            }
            r45.i7 i7Var2 = this.f462559r;
            if (i7Var2 != null) {
                a17 += b36.f.i(13, i7Var2.mo75928xcd1e8d8());
            }
            r45.pw6 pw6Var2 = this.f462560s;
            return pw6Var2 != null ? a17 + b36.f.i(15, pw6Var2.mo75928xcd1e8d8()) : a17;
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
        r45.n24 n24Var = (r45.n24) objArr[1];
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
                    n24Var.f76492x92037252 = ieVar3;
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
                    n24Var.f462548d = j14Var3;
                }
                return 0;
            case 3:
                n24Var.f462549e = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.jv5 jv5Var3 = new r45.jv5();
                    if (bArr3 != null && bArr3.length > 0) {
                        jv5Var3.mo11468x92b714fd(bArr3);
                    }
                    n24Var.f462550f = jv5Var3;
                }
                return 0;
            case 5:
                n24Var.f462551g = aVar2.k(intValue);
                return 0;
            case 6:
                n24Var.f462552h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.eb0 eb0Var3 = new r45.eb0();
                    if (bArr4 != null && bArr4.length > 0) {
                        eb0Var3.mo11468x92b714fd(bArr4);
                    }
                    n24Var.f462553i = eb0Var3;
                }
                return 0;
            case 8:
                n24Var.f462554m = aVar2.c(intValue);
                return 0;
            case 9:
                n24Var.f462555n = aVar2.k(intValue);
                return 0;
            case 10:
                n24Var.f462556o = aVar2.k(intValue);
                return 0;
            case 11:
                n24Var.f462557p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.sv6 sv6Var3 = new r45.sv6();
                    if (bArr5 != null && bArr5.length > 0) {
                        sv6Var3.mo11468x92b714fd(bArr5);
                    }
                    n24Var.f462558q = sv6Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.i7 i7Var3 = new r45.i7();
                    if (bArr6 != null && bArr6.length > 0) {
                        i7Var3.mo11468x92b714fd(bArr6);
                    }
                    n24Var.f462559r = i7Var3;
                }
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.pw6 pw6Var3 = new r45.pw6();
                    if (bArr7 != null && bArr7.length > 0) {
                        pw6Var3.mo11468x92b714fd(bArr7);
                    }
                    n24Var.f462560s = pw6Var3;
                }
                return 0;
        }
    }
}

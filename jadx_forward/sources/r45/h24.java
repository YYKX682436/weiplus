package r45;

/* loaded from: classes7.dex */
public class h24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f457306d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457307e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457308f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457309g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457310h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457311i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457312m;

    /* renamed from: n, reason: collision with root package name */
    public r45.i7 f457313n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457314o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f457315p;

    /* renamed from: q, reason: collision with root package name */
    public r45.pw6 f457316q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h24)) {
            return false;
        }
        r45.h24 h24Var = (r45.h24) fVar;
        return n51.f.a(this.f76492x92037252, h24Var.f76492x92037252) && n51.f.a(this.f457306d, h24Var.f457306d) && n51.f.a(this.f457307e, h24Var.f457307e) && n51.f.a(this.f457308f, h24Var.f457308f) && n51.f.a(this.f457309g, h24Var.f457309g) && n51.f.a(this.f457310h, h24Var.f457310h) && n51.f.a(this.f457311i, h24Var.f457311i) && n51.f.a(this.f457312m, h24Var.f457312m) && n51.f.a(this.f457313n, h24Var.f457313n) && n51.f.a(this.f457314o, h24Var.f457314o) && n51.f.a(this.f457315p, h24Var.f457315p) && n51.f.a(this.f457316q, h24Var.f457316q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457307e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.j14 j14Var = this.f457306d;
            if (j14Var != null) {
                fVar.i(2, j14Var.mo75928xcd1e8d8());
                this.f457306d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f457308f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f457309g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f457310h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f457311i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f457312m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            r45.i7 i7Var = this.f457313n;
            if (i7Var != null) {
                fVar.i(9, i7Var.mo75928xcd1e8d8());
                this.f457313n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457314o;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            java.lang.String str6 = this.f457315p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.pw6 pw6Var = this.f457316q;
            if (pw6Var == null) {
                return 0;
            }
            fVar.i(12, pw6Var.mo75928xcd1e8d8());
            this.f457316q.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j14 j14Var2 = this.f457306d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f457308f;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f457309g;
            if (str8 != null) {
                g17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f457310h;
            if (str9 != null) {
                g17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f457311i;
            if (str10 != null) {
                g17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f457312m;
            if (str11 != null) {
                g17 += b36.f.j(8, str11);
            }
            r45.i7 i7Var2 = this.f457313n;
            if (i7Var2 != null) {
                g17 += b36.f.i(9, i7Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457314o;
            if (gVar2 != null) {
                g17 += b36.f.b(10, gVar2);
            }
            java.lang.String str12 = this.f457315p;
            if (str12 != null) {
                g17 += b36.f.j(11, str12);
            }
            r45.pw6 pw6Var2 = this.f457316q;
            return pw6Var2 != null ? g17 + b36.f.i(12, pw6Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.h24 h24Var = (r45.h24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    h24Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.mo11468x92b714fd(bArr3);
                    }
                    h24Var.f457306d = j14Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.jv5 jv5Var = new r45.jv5();
                    if (bArr4 != null && bArr4.length > 0) {
                        jv5Var.mo11468x92b714fd(bArr4);
                    }
                    h24Var.f457307e.add(jv5Var);
                }
                return 0;
            case 4:
                h24Var.f457308f = aVar2.k(intValue);
                return 0;
            case 5:
                h24Var.f457309g = aVar2.k(intValue);
                return 0;
            case 6:
                h24Var.f457310h = aVar2.k(intValue);
                return 0;
            case 7:
                h24Var.f457311i = aVar2.k(intValue);
                return 0;
            case 8:
                h24Var.f457312m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.i7 i7Var3 = new r45.i7();
                    if (bArr5 != null && bArr5.length > 0) {
                        i7Var3.mo11468x92b714fd(bArr5);
                    }
                    h24Var.f457313n = i7Var3;
                }
                return 0;
            case 10:
                h24Var.f457314o = aVar2.d(intValue);
                return 0;
            case 11:
                h24Var.f457315p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.pw6 pw6Var3 = new r45.pw6();
                    if (bArr6 != null && bArr6.length > 0) {
                        pw6Var3.mo11468x92b714fd(bArr6);
                    }
                    h24Var.f457316q = pw6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

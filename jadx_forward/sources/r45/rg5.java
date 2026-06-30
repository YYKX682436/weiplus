package r45;

/* loaded from: classes9.dex */
public class rg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466376e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bx3 f466377f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f466378g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f466379h;

    /* renamed from: i, reason: collision with root package name */
    public long f466380i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ft5 f466381m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bs f466382n;

    /* renamed from: o, reason: collision with root package name */
    public r45.an6 f466383o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fq4 f466384p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f466385q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f466386r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f466387s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f466388t;

    /* renamed from: u, reason: collision with root package name */
    public r45.kp4 f466389u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rg5)) {
            return false;
        }
        r45.rg5 rg5Var = (r45.rg5) fVar;
        return n51.f.a(this.f76492x92037252, rg5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466375d), java.lang.Integer.valueOf(rg5Var.f466375d)) && n51.f.a(this.f466376e, rg5Var.f466376e) && n51.f.a(this.f466377f, rg5Var.f466377f) && n51.f.a(this.f466378g, rg5Var.f466378g) && n51.f.a(java.lang.Long.valueOf(this.f466379h), java.lang.Long.valueOf(rg5Var.f466379h)) && n51.f.a(java.lang.Long.valueOf(this.f466380i), java.lang.Long.valueOf(rg5Var.f466380i)) && n51.f.a(this.f466381m, rg5Var.f466381m) && n51.f.a(this.f466382n, rg5Var.f466382n) && n51.f.a(this.f466383o, rg5Var.f466383o) && n51.f.a(this.f466384p, rg5Var.f466384p) && n51.f.a(this.f466385q, rg5Var.f466385q) && n51.f.a(this.f466386r, rg5Var.f466386r) && n51.f.a(this.f466387s, rg5Var.f466387s) && n51.f.a(this.f466388t, rg5Var.f466388t) && n51.f.a(this.f466389u, rg5Var.f466389u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466378g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466375d);
            java.lang.String str = this.f466376e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.bx3 bx3Var = this.f466377f;
            if (bx3Var != null) {
                fVar.i(4, bx3Var.mo75928xcd1e8d8());
                this.f466377f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList);
            fVar.h(6, this.f466379h);
            fVar.h(7, this.f466380i);
            r45.ft5 ft5Var = this.f466381m;
            if (ft5Var != null) {
                fVar.i(8, ft5Var.mo75928xcd1e8d8());
                this.f466381m.mo75956x3d5d1f78(fVar);
            }
            r45.bs bsVar = this.f466382n;
            if (bsVar != null) {
                fVar.i(9, bsVar.mo75928xcd1e8d8());
                this.f466382n.mo75956x3d5d1f78(fVar);
            }
            r45.an6 an6Var = this.f466383o;
            if (an6Var != null) {
                fVar.i(10, an6Var.mo75928xcd1e8d8());
                this.f466383o.mo75956x3d5d1f78(fVar);
            }
            r45.fq4 fq4Var = this.f466384p;
            if (fq4Var != null) {
                fVar.i(11, fq4Var.mo75928xcd1e8d8());
                this.f466384p.mo75956x3d5d1f78(fVar);
            }
            r45.tw4 tw4Var = this.f466385q;
            if (tw4Var != null) {
                fVar.i(12, tw4Var.mo75928xcd1e8d8());
                this.f466385q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f466386r;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f466387s;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            java.lang.String str4 = this.f466388t;
            if (str4 != null) {
                fVar.j(15, str4);
            }
            r45.kp4 kp4Var = this.f466389u;
            if (kp4Var != null) {
                fVar.i(16, kp4Var.mo75928xcd1e8d8());
                this.f466389u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f466375d);
            java.lang.String str5 = this.f466376e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            r45.bx3 bx3Var2 = this.f466377f;
            if (bx3Var2 != null) {
                i18 += b36.f.i(4, bx3Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList) + b36.f.h(6, this.f466379h) + b36.f.h(7, this.f466380i);
            r45.ft5 ft5Var2 = this.f466381m;
            if (ft5Var2 != null) {
                g17 += b36.f.i(8, ft5Var2.mo75928xcd1e8d8());
            }
            r45.bs bsVar2 = this.f466382n;
            if (bsVar2 != null) {
                g17 += b36.f.i(9, bsVar2.mo75928xcd1e8d8());
            }
            r45.an6 an6Var2 = this.f466383o;
            if (an6Var2 != null) {
                g17 += b36.f.i(10, an6Var2.mo75928xcd1e8d8());
            }
            r45.fq4 fq4Var2 = this.f466384p;
            if (fq4Var2 != null) {
                g17 += b36.f.i(11, fq4Var2.mo75928xcd1e8d8());
            }
            r45.tw4 tw4Var2 = this.f466385q;
            if (tw4Var2 != null) {
                g17 += b36.f.i(12, tw4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f466386r;
            if (str6 != null) {
                g17 += b36.f.j(13, str6);
            }
            java.lang.String str7 = this.f466387s;
            if (str7 != null) {
                g17 += b36.f.j(14, str7);
            }
            java.lang.String str8 = this.f466388t;
            if (str8 != null) {
                g17 += b36.f.j(15, str8);
            }
            r45.kp4 kp4Var2 = this.f466389u;
            return kp4Var2 != null ? g17 + b36.f.i(16, kp4Var2.mo75928xcd1e8d8()) : g17;
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
        r45.rg5 rg5Var = (r45.rg5) objArr[1];
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
                    rg5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                rg5Var.f466375d = aVar2.g(intValue);
                return 0;
            case 3:
                rg5Var.f466376e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bx3 bx3Var3 = new r45.bx3();
                    if (bArr3 != null && bArr3.length > 0) {
                        bx3Var3.mo11468x92b714fd(bArr3);
                    }
                    rg5Var.f466377f = bx3Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.v55 v55Var = new r45.v55();
                    if (bArr4 != null && bArr4.length > 0) {
                        v55Var.mo11468x92b714fd(bArr4);
                    }
                    rg5Var.f466378g.add(v55Var);
                }
                return 0;
            case 6:
                rg5Var.f466379h = aVar2.i(intValue);
                return 0;
            case 7:
                rg5Var.f466380i = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ft5 ft5Var3 = new r45.ft5();
                    if (bArr5 != null && bArr5.length > 0) {
                        ft5Var3.mo11468x92b714fd(bArr5);
                    }
                    rg5Var.f466381m = ft5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.bs bsVar3 = new r45.bs();
                    if (bArr6 != null && bArr6.length > 0) {
                        bsVar3.mo11468x92b714fd(bArr6);
                    }
                    rg5Var.f466382n = bsVar3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr7 != null && bArr7.length > 0) {
                        an6Var3.mo11468x92b714fd(bArr7);
                    }
                    rg5Var.f466383o = an6Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.fq4 fq4Var3 = new r45.fq4();
                    if (bArr8 != null && bArr8.length > 0) {
                        fq4Var3.mo11468x92b714fd(bArr8);
                    }
                    rg5Var.f466384p = fq4Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr9 != null && bArr9.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr9);
                    }
                    rg5Var.f466385q = tw4Var3;
                }
                return 0;
            case 13:
                rg5Var.f466386r = aVar2.k(intValue);
                return 0;
            case 14:
                rg5Var.f466387s = aVar2.k(intValue);
                return 0;
            case 15:
                rg5Var.f466388t = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.kp4 kp4Var3 = new r45.kp4();
                    if (bArr10 != null && bArr10.length > 0) {
                        kp4Var3.mo11468x92b714fd(bArr10);
                    }
                    rg5Var.f466389u = kp4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

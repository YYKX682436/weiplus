package bw5;

/* loaded from: classes2.dex */
public class cm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107677d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.am f107678e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f107679f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.am f107680g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f107681h;

    /* renamed from: i, reason: collision with root package name */
    public float f107682i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107683m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f107684n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107685o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107686p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f107687q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f107688r;

    /* renamed from: s, reason: collision with root package name */
    public int f107689s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.am f107690t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.am f107691u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.am f107692v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.am f107693w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.am f107694x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f107695y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f107696z = new boolean[20];

    static {
        new bw5.cm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cm mo11468x92b714fd(byte[] bArr) {
        return (bw5.cm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cm)) {
            return false;
        }
        bw5.cm cmVar = (bw5.cm) fVar;
        return n51.f.a(this.f107677d, cmVar.f107677d) && n51.f.a(this.f107678e, cmVar.f107678e) && n51.f.a(this.f107679f, cmVar.f107679f) && n51.f.a(this.f107680g, cmVar.f107680g) && n51.f.a(this.f107681h, cmVar.f107681h) && n51.f.a(java.lang.Float.valueOf(this.f107682i), java.lang.Float.valueOf(cmVar.f107682i)) && n51.f.a(this.f107683m, cmVar.f107683m) && n51.f.a(java.lang.Boolean.valueOf(this.f107684n), java.lang.Boolean.valueOf(cmVar.f107684n)) && n51.f.a(java.lang.Boolean.valueOf(this.f107685o), java.lang.Boolean.valueOf(cmVar.f107685o)) && n51.f.a(this.f107686p, cmVar.f107686p) && n51.f.a(this.f107687q, cmVar.f107687q) && n51.f.a(this.f107688r, cmVar.f107688r) && n51.f.a(java.lang.Integer.valueOf(this.f107689s), java.lang.Integer.valueOf(cmVar.f107689s)) && n51.f.a(this.f107690t, cmVar.f107690t) && n51.f.a(this.f107691u, cmVar.f107691u) && n51.f.a(this.f107692v, cmVar.f107692v) && n51.f.a(this.f107693w, cmVar.f107693w) && n51.f.a(this.f107694x, cmVar.f107694x) && n51.f.a(this.f107695y, cmVar.f107695y);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107696z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107677d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.am amVar = this.f107678e;
            if (amVar != null && zArr[2]) {
                fVar.i(2, amVar.mo75928xcd1e8d8());
                this.f107678e.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar2 = this.f107679f;
            if (amVar2 != null && zArr[3]) {
                fVar.i(3, amVar2.mo75928xcd1e8d8());
                this.f107679f.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar3 = this.f107680g;
            if (amVar3 != null && zArr[4]) {
                fVar.i(4, amVar3.mo75928xcd1e8d8());
                this.f107680g.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar4 = this.f107681h;
            if (amVar4 != null && zArr[5]) {
                fVar.i(5, amVar4.mo75928xcd1e8d8());
                this.f107681h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.d(6, this.f107682i);
            }
            java.lang.String str2 = this.f107683m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            if (zArr[8]) {
                fVar.a(8, this.f107684n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f107685o);
            }
            java.lang.String str3 = this.f107686p;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f107687q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f107688r;
            if (str5 != null && zArr[12]) {
                fVar.j(12, str5);
            }
            if (zArr[13]) {
                fVar.e(13, this.f107689s);
            }
            bw5.am amVar5 = this.f107690t;
            if (amVar5 != null && zArr[14]) {
                fVar.i(14, amVar5.mo75928xcd1e8d8());
                this.f107690t.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar6 = this.f107691u;
            if (amVar6 != null && zArr[15]) {
                fVar.i(15, amVar6.mo75928xcd1e8d8());
                this.f107691u.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar7 = this.f107692v;
            if (amVar7 != null && zArr[16]) {
                fVar.i(16, amVar7.mo75928xcd1e8d8());
                this.f107692v.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar8 = this.f107693w;
            if (amVar8 != null && zArr[17]) {
                fVar.i(17, amVar8.mo75928xcd1e8d8());
                this.f107693w.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar9 = this.f107694x;
            if (amVar9 != null && zArr[18]) {
                fVar.i(18, amVar9.mo75928xcd1e8d8());
                this.f107694x.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f107695y;
            if (str6 != null && zArr[19]) {
                fVar.j(19, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f107677d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            bw5.am amVar10 = this.f107678e;
            if (amVar10 != null && zArr[2]) {
                i18 += b36.f.i(2, amVar10.mo75928xcd1e8d8());
            }
            bw5.am amVar11 = this.f107679f;
            if (amVar11 != null && zArr[3]) {
                i18 += b36.f.i(3, amVar11.mo75928xcd1e8d8());
            }
            bw5.am amVar12 = this.f107680g;
            if (amVar12 != null && zArr[4]) {
                i18 += b36.f.i(4, amVar12.mo75928xcd1e8d8());
            }
            bw5.am amVar13 = this.f107681h;
            if (amVar13 != null && zArr[5]) {
                i18 += b36.f.i(5, amVar13.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f107682i);
            }
            java.lang.String str8 = this.f107683m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            if (zArr[8]) {
                i18 += b36.f.a(8, this.f107684n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f107685o);
            }
            java.lang.String str9 = this.f107686p;
            if (str9 != null && zArr[10]) {
                i18 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f107687q;
            if (str10 != null && zArr[11]) {
                i18 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f107688r;
            if (str11 != null && zArr[12]) {
                i18 += b36.f.j(12, str11);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f107689s);
            }
            bw5.am amVar14 = this.f107690t;
            if (amVar14 != null && zArr[14]) {
                i18 += b36.f.i(14, amVar14.mo75928xcd1e8d8());
            }
            bw5.am amVar15 = this.f107691u;
            if (amVar15 != null && zArr[15]) {
                i18 += b36.f.i(15, amVar15.mo75928xcd1e8d8());
            }
            bw5.am amVar16 = this.f107692v;
            if (amVar16 != null && zArr[16]) {
                i18 += b36.f.i(16, amVar16.mo75928xcd1e8d8());
            }
            bw5.am amVar17 = this.f107693w;
            if (amVar17 != null && zArr[17]) {
                i18 += b36.f.i(17, amVar17.mo75928xcd1e8d8());
            }
            bw5.am amVar18 = this.f107694x;
            if (amVar18 != null && zArr[18]) {
                i18 += b36.f.i(18, amVar18.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f107695y;
            return (str12 == null || !zArr[19]) ? i18 : i18 + b36.f.j(19, str12);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f107677d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.am amVar19 = new bw5.am();
                    if (bArr != null && bArr.length > 0) {
                        amVar19.mo11468x92b714fd(bArr);
                    }
                    this.f107678e = amVar19;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.am amVar20 = new bw5.am();
                    if (bArr2 != null && bArr2.length > 0) {
                        amVar20.mo11468x92b714fd(bArr2);
                    }
                    this.f107679f = amVar20;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.am amVar21 = new bw5.am();
                    if (bArr3 != null && bArr3.length > 0) {
                        amVar21.mo11468x92b714fd(bArr3);
                    }
                    this.f107680g = amVar21;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.am amVar22 = new bw5.am();
                    if (bArr4 != null && bArr4.length > 0) {
                        amVar22.mo11468x92b714fd(bArr4);
                    }
                    this.f107681h = amVar22;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f107682i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107683m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107684n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107685o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107686p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107687q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107688r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107689s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.am amVar23 = new bw5.am();
                    if (bArr5 != null && bArr5.length > 0) {
                        amVar23.mo11468x92b714fd(bArr5);
                    }
                    this.f107690t = amVar23;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.am amVar24 = new bw5.am();
                    if (bArr6 != null && bArr6.length > 0) {
                        amVar24.mo11468x92b714fd(bArr6);
                    }
                    this.f107691u = amVar24;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.am amVar25 = new bw5.am();
                    if (bArr7 != null && bArr7.length > 0) {
                        amVar25.mo11468x92b714fd(bArr7);
                    }
                    this.f107692v = amVar25;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.am amVar26 = new bw5.am();
                    if (bArr8 != null && bArr8.length > 0) {
                        amVar26.mo11468x92b714fd(bArr8);
                    }
                    this.f107693w = amVar26;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.am amVar27 = new bw5.am();
                    if (bArr9 != null && bArr9.length > 0) {
                        amVar27.mo11468x92b714fd(bArr9);
                    }
                    this.f107694x = amVar27;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f107695y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}

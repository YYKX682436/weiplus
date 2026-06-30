package bw5;

/* loaded from: classes2.dex */
public class hw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.iw A;
    public java.lang.String B;
    public bw5.iw C;
    public bw5.iw D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public long f109893d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109894e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109895f;

    /* renamed from: g, reason: collision with root package name */
    public int f109896g;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109899m;

    /* renamed from: n, reason: collision with root package name */
    public int f109900n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f109901o;

    /* renamed from: p, reason: collision with root package name */
    public int f109902p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f109903q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109904r;

    /* renamed from: s, reason: collision with root package name */
    public int f109905s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f109906t;

    /* renamed from: u, reason: collision with root package name */
    public long f109907u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f109908v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.yw f109909w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.iw f109910x;

    /* renamed from: z, reason: collision with root package name */
    public bw5.iw f109912z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f109897h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f109898i = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f109911y = new java.util.LinkedList();
    public final boolean[] F = new boolean[26];

    static {
        new bw5.hw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hw mo11468x92b714fd(byte[] bArr) {
        return (bw5.hw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hw)) {
            return false;
        }
        bw5.hw hwVar = (bw5.hw) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f109893d), java.lang.Long.valueOf(hwVar.f109893d)) && n51.f.a(this.f109894e, hwVar.f109894e) && n51.f.a(this.f109895f, hwVar.f109895f) && n51.f.a(java.lang.Integer.valueOf(this.f109896g), java.lang.Integer.valueOf(hwVar.f109896g)) && n51.f.a(this.f109897h, hwVar.f109897h) && n51.f.a(this.f109898i, hwVar.f109898i) && n51.f.a(this.f109899m, hwVar.f109899m) && n51.f.a(java.lang.Integer.valueOf(this.f109900n), java.lang.Integer.valueOf(hwVar.f109900n)) && n51.f.a(java.lang.Boolean.valueOf(this.f109901o), java.lang.Boolean.valueOf(hwVar.f109901o)) && n51.f.a(java.lang.Integer.valueOf(this.f109902p), java.lang.Integer.valueOf(hwVar.f109902p)) && n51.f.a(java.lang.Boolean.valueOf(this.f109903q), java.lang.Boolean.valueOf(hwVar.f109903q)) && n51.f.a(this.f109904r, hwVar.f109904r) && n51.f.a(java.lang.Integer.valueOf(this.f109905s), java.lang.Integer.valueOf(hwVar.f109905s)) && n51.f.a(this.f109906t, hwVar.f109906t) && n51.f.a(java.lang.Long.valueOf(this.f109907u), java.lang.Long.valueOf(hwVar.f109907u)) && n51.f.a(this.f109908v, hwVar.f109908v) && n51.f.a(this.f109909w, hwVar.f109909w) && n51.f.a(this.f109910x, hwVar.f109910x) && n51.f.a(this.f109911y, hwVar.f109911y) && n51.f.a(this.f109912z, hwVar.f109912z) && n51.f.a(this.A, hwVar.A) && n51.f.a(this.B, hwVar.B) && n51.f.a(this.C, hwVar.C) && n51.f.a(this.D, hwVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(hwVar.E));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f109893d);
            }
            java.lang.String str = this.f109894e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f109895f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109896g);
            }
            fVar.g(5, 8, this.f109897h);
            fVar.g(6, 2, this.f109898i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109899m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f109900n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f109901o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109902p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f109903q);
            }
            java.lang.String str3 = this.f109904r;
            if (str3 != null && zArr[12]) {
                fVar.j(12, str3);
            }
            if (zArr[13]) {
                fVar.e(13, this.f109905s);
            }
            java.lang.String str4 = this.f109906t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.h(15, this.f109907u);
            }
            java.lang.String str5 = this.f109908v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            bw5.yw ywVar = this.f109909w;
            if (ywVar != null && zArr[17]) {
                fVar.i(17, ywVar.mo75928xcd1e8d8());
                this.f109909w.mo75956x3d5d1f78(fVar);
            }
            bw5.iw iwVar = this.f109910x;
            if (iwVar != null && zArr[18]) {
                fVar.i(18, iwVar.mo75928xcd1e8d8());
                this.f109910x.mo75956x3d5d1f78(fVar);
            }
            fVar.g(19, 8, this.f109911y);
            bw5.iw iwVar2 = this.f109912z;
            if (iwVar2 != null && zArr[20]) {
                fVar.i(20, iwVar2.mo75928xcd1e8d8());
                this.f109912z.mo75956x3d5d1f78(fVar);
            }
            bw5.iw iwVar3 = this.A;
            if (iwVar3 != null && zArr[21]) {
                fVar.i(21, iwVar3.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.B;
            if (str6 != null && zArr[22]) {
                fVar.j(22, str6);
            }
            bw5.iw iwVar4 = this.C;
            if (iwVar4 != null && zArr[23]) {
                fVar.i(23, iwVar4.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.iw iwVar5 = this.D;
            if (iwVar5 != null && zArr[24]) {
                fVar.i(24, iwVar5.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            if (zArr[25]) {
                fVar.e(25, this.E);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f109893d) + 0 : 0;
            java.lang.String str7 = this.f109894e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f109895f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f109896g);
            }
            int g17 = h17 + b36.f.g(5, 8, this.f109897h) + b36.f.g(6, 2, this.f109898i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109899m;
            if (gVar2 != null && zArr[7]) {
                g17 += b36.f.b(7, gVar2);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f109900n);
            }
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f109901o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f109902p);
            }
            if (zArr[11]) {
                g17 += b36.f.a(11, this.f109903q);
            }
            java.lang.String str9 = this.f109904r;
            if (str9 != null && zArr[12]) {
                g17 += b36.f.j(12, str9);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f109905s);
            }
            java.lang.String str10 = this.f109906t;
            if (str10 != null && zArr[14]) {
                g17 += b36.f.j(14, str10);
            }
            if (zArr[15]) {
                g17 += b36.f.h(15, this.f109907u);
            }
            java.lang.String str11 = this.f109908v;
            if (str11 != null && zArr[16]) {
                g17 += b36.f.j(16, str11);
            }
            bw5.yw ywVar2 = this.f109909w;
            if (ywVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, ywVar2.mo75928xcd1e8d8());
            }
            bw5.iw iwVar6 = this.f109910x;
            if (iwVar6 != null && zArr[18]) {
                g17 += b36.f.i(18, iwVar6.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(19, 8, this.f109911y);
            bw5.iw iwVar7 = this.f109912z;
            if (iwVar7 != null && zArr[20]) {
                g18 += b36.f.i(20, iwVar7.mo75928xcd1e8d8());
            }
            bw5.iw iwVar8 = this.A;
            if (iwVar8 != null && zArr[21]) {
                g18 += b36.f.i(21, iwVar8.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.B;
            if (str12 != null && zArr[22]) {
                g18 += b36.f.j(22, str12);
            }
            bw5.iw iwVar9 = this.C;
            if (iwVar9 != null && zArr[23]) {
                g18 += b36.f.i(23, iwVar9.mo75928xcd1e8d8());
            }
            bw5.iw iwVar10 = this.D;
            if (iwVar10 != null && zArr[24]) {
                g18 += b36.f.i(24, iwVar10.mo75928xcd1e8d8());
            }
            return zArr[25] ? g18 + b36.f.e(25, this.E) : g18;
        }
        if (i17 == 2) {
            this.f109897h.clear();
            this.f109898i.clear();
            this.f109911y.clear();
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
                this.f109893d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109894e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109895f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109896g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar.mo11468x92b714fd(bArr);
                    }
                    this.f109897h.add(yrVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f109898i.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[6] = true;
                return 0;
            case 7:
                this.f109899m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109900n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109901o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109902p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109903q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109904r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109905s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109906t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f109907u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f109908v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.yw ywVar3 = new bw5.yw();
                    if (bArr2 != null && bArr2.length > 0) {
                        ywVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f109909w = ywVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.iw iwVar11 = new bw5.iw();
                    if (bArr3 != null && bArr3.length > 0) {
                        iwVar11.mo11468x92b714fd(bArr3);
                    }
                    this.f109910x = iwVar11;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.iw iwVar12 = new bw5.iw();
                    if (bArr4 != null && bArr4.length > 0) {
                        iwVar12.mo11468x92b714fd(bArr4);
                    }
                    this.f109911y.add(iwVar12);
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.iw iwVar13 = new bw5.iw();
                    if (bArr5 != null && bArr5.length > 0) {
                        iwVar13.mo11468x92b714fd(bArr5);
                    }
                    this.f109912z = iwVar13;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.iw iwVar14 = new bw5.iw();
                    if (bArr6 != null && bArr6.length > 0) {
                        iwVar14.mo11468x92b714fd(bArr6);
                    }
                    this.A = iwVar14;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.iw iwVar15 = new bw5.iw();
                    if (bArr7 != null && bArr7.length > 0) {
                        iwVar15.mo11468x92b714fd(bArr7);
                    }
                    this.C = iwVar15;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.iw iwVar16 = new bw5.iw();
                    if (bArr8 != null && bArr8.length > 0) {
                        iwVar16.mo11468x92b714fd(bArr8);
                    }
                    this.D = iwVar16;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
            default:
                return -1;
        }
    }
}

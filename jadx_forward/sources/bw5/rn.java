package bw5;

/* loaded from: classes2.dex */
public class rn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String C;
    public java.lang.String D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public int f114120d;

    /* renamed from: e, reason: collision with root package name */
    public int f114121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114122f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114123g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114124h;

    /* renamed from: i, reason: collision with root package name */
    public int f114125i;

    /* renamed from: m, reason: collision with root package name */
    public int f114126m;

    /* renamed from: n, reason: collision with root package name */
    public int f114127n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f114128o;

    /* renamed from: p, reason: collision with root package name */
    public int f114129p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.pn f114130q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f114132s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.mn f114133t;

    /* renamed from: u, reason: collision with root package name */
    public int f114134u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f114135v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.qn f114136w;

    /* renamed from: x, reason: collision with root package name */
    public int f114137x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.on f114138y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f114139z;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f114131r = new java.util.LinkedList();
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final boolean[] F = new boolean[28];

    static {
        new bw5.rn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rn mo11468x92b714fd(byte[] bArr) {
        return (bw5.rn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rn)) {
            return false;
        }
        bw5.rn rnVar = (bw5.rn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114120d), java.lang.Integer.valueOf(rnVar.f114120d)) && n51.f.a(java.lang.Integer.valueOf(this.f114121e), java.lang.Integer.valueOf(rnVar.f114121e)) && n51.f.a(this.f114122f, rnVar.f114122f) && n51.f.a(this.f114123g, rnVar.f114123g) && n51.f.a(this.f114124h, rnVar.f114124h) && n51.f.a(java.lang.Integer.valueOf(this.f114125i), java.lang.Integer.valueOf(rnVar.f114125i)) && n51.f.a(java.lang.Integer.valueOf(this.f114126m), java.lang.Integer.valueOf(rnVar.f114126m)) && n51.f.a(java.lang.Integer.valueOf(this.f114127n), java.lang.Integer.valueOf(rnVar.f114127n)) && n51.f.a(this.f114128o, rnVar.f114128o) && n51.f.a(java.lang.Integer.valueOf(this.f114129p), java.lang.Integer.valueOf(rnVar.f114129p)) && n51.f.a(this.f114130q, rnVar.f114130q) && n51.f.a(this.f114131r, rnVar.f114131r) && n51.f.a(this.f114132s, rnVar.f114132s) && n51.f.a(this.f114133t, rnVar.f114133t) && n51.f.a(java.lang.Integer.valueOf(this.f114134u), java.lang.Integer.valueOf(rnVar.f114134u)) && n51.f.a(java.lang.Boolean.valueOf(this.f114135v), java.lang.Boolean.valueOf(rnVar.f114135v)) && n51.f.a(this.f114136w, rnVar.f114136w) && n51.f.a(java.lang.Integer.valueOf(this.f114137x), java.lang.Integer.valueOf(rnVar.f114137x)) && n51.f.a(this.f114138y, rnVar.f114138y) && n51.f.a(java.lang.Boolean.valueOf(this.f114139z), java.lang.Boolean.valueOf(rnVar.f114139z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(rnVar.A)) && n51.f.a(this.B, rnVar.B) && n51.f.a(this.C, rnVar.C) && n51.f.a(this.D, rnVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(rnVar.E));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114120d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114121e);
            }
            java.lang.String str = this.f114122f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f114123g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f114124h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114125i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114126m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f114127n);
            }
            java.lang.String str4 = this.f114128o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            if (zArr[10]) {
                fVar.e(10, this.f114129p);
            }
            bw5.pn pnVar = this.f114130q;
            if (pnVar != null && zArr[11]) {
                fVar.i(11, pnVar.mo75928xcd1e8d8());
                this.f114130q.mo75956x3d5d1f78(fVar);
            }
            fVar.g(12, 8, this.f114131r);
            java.lang.String str5 = this.f114132s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            bw5.mn mnVar = this.f114133t;
            if (mnVar != null && zArr[14]) {
                fVar.i(14, mnVar.mo75928xcd1e8d8());
                this.f114133t.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f114134u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f114135v);
            }
            bw5.qn qnVar = this.f114136w;
            if (qnVar != null && zArr[17]) {
                fVar.i(17, qnVar.mo75928xcd1e8d8());
                this.f114136w.mo75956x3d5d1f78(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f114137x);
            }
            bw5.on onVar = this.f114138y;
            if (onVar != null && zArr[20]) {
                fVar.i(20, onVar.mo75928xcd1e8d8());
                this.f114138y.mo75956x3d5d1f78(fVar);
            }
            if (zArr[23]) {
                fVar.a(23, this.f114139z);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            fVar.g(22, 1, this.B);
            java.lang.String str6 = this.C;
            if (str6 != null && zArr[24]) {
                fVar.j(24, str6);
            }
            java.lang.String str7 = this.D;
            if (str7 != null && zArr[26]) {
                fVar.j(26, str7);
            }
            if (zArr[27]) {
                fVar.e(27, this.E);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f114120d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f114121e);
            }
            java.lang.String str8 = this.f114122f;
            if (str8 != null && zArr[3]) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f114123g;
            if (str9 != null && zArr[4]) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f114124h;
            if (str10 != null && zArr[5]) {
                e17 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f114125i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f114126m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f114127n);
            }
            java.lang.String str11 = this.f114128o;
            if (str11 != null && zArr[9]) {
                e17 += b36.f.j(9, str11);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f114129p);
            }
            bw5.pn pnVar2 = this.f114130q;
            if (pnVar2 != null && zArr[11]) {
                e17 += b36.f.i(11, pnVar2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(12, 8, this.f114131r);
            java.lang.String str12 = this.f114132s;
            if (str12 != null && zArr[13]) {
                g17 += b36.f.j(13, str12);
            }
            bw5.mn mnVar2 = this.f114133t;
            if (mnVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, mnVar2.mo75928xcd1e8d8());
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f114134u);
            }
            if (zArr[16]) {
                g17 += b36.f.a(16, this.f114135v);
            }
            bw5.qn qnVar2 = this.f114136w;
            if (qnVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, qnVar2.mo75928xcd1e8d8());
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f114137x);
            }
            bw5.on onVar2 = this.f114138y;
            if (onVar2 != null && zArr[20]) {
                g17 += b36.f.i(20, onVar2.mo75928xcd1e8d8());
            }
            if (zArr[23]) {
                g17 += b36.f.a(23, this.f114139z);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            int g18 = g17 + b36.f.g(22, 1, this.B);
            java.lang.String str13 = this.C;
            if (str13 != null && zArr[24]) {
                g18 += b36.f.j(24, str13);
            }
            java.lang.String str14 = this.D;
            if (str14 != null && zArr[26]) {
                g18 += b36.f.j(26, str14);
            }
            return zArr[27] ? g18 + b36.f.e(27, this.E) : g18;
        }
        if (i17 == 2) {
            this.f114131r.clear();
            this.B.clear();
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
                this.f114120d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114121e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114122f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114123g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114124h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114125i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114126m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114127n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114128o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114129p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.pn pnVar3 = new bw5.pn();
                    if (bArr != null && bArr.length > 0) {
                        pnVar3.mo11468x92b714fd(bArr);
                    }
                    this.f114130q = pnVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.nn nnVar = new bw5.nn();
                    if (bArr2 != null && bArr2.length > 0) {
                        nnVar.mo11468x92b714fd(bArr2);
                    }
                    this.f114131r.add(nnVar);
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f114132s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.mn mnVar3 = new bw5.mn();
                    if (bArr3 != null && bArr3.length > 0) {
                        mnVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f114133t = mnVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f114134u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f114135v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qn qnVar3 = new bw5.qn();
                    if (bArr4 != null && bArr4.length > 0) {
                        qnVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f114136w = qnVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
            case 25:
            default:
                return -1;
            case 19:
                this.f114137x = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.on onVar3 = new bw5.on();
                    if (bArr5 != null && bArr5.length > 0) {
                        onVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f114138y = onVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B.add(aVar2.k(intValue));
                zArr[22] = true;
                return 0;
            case 23:
                this.f114139z = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 26:
                this.D = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.E = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
        }
    }
}

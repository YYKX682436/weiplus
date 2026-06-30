package bw5;

/* loaded from: classes2.dex */
public class kr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f111028d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111029e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fr f111031g;

    /* renamed from: h, reason: collision with root package name */
    public int f111032h;

    /* renamed from: i, reason: collision with root package name */
    public int f111033i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.mr f111034m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111035n;

    /* renamed from: o, reason: collision with root package name */
    public int f111036o;

    /* renamed from: p, reason: collision with root package name */
    public int f111037p;

    /* renamed from: q, reason: collision with root package name */
    public int f111038q;

    /* renamed from: r, reason: collision with root package name */
    public int f111039r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f111040s;

    /* renamed from: t, reason: collision with root package name */
    public long f111041t;

    /* renamed from: u, reason: collision with root package name */
    public int f111042u;

    /* renamed from: v, reason: collision with root package name */
    public int f111043v;

    /* renamed from: w, reason: collision with root package name */
    public int f111044w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f111045x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.rf0 f111046y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.pj f111047z;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111030f = new java.util.LinkedList();
    public final boolean[] A = new boolean[21];

    static {
        new bw5.kr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kr mo11468x92b714fd(byte[] bArr) {
        return (bw5.kr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kr)) {
            return false;
        }
        bw5.kr krVar = (bw5.kr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f111028d), java.lang.Long.valueOf(krVar.f111028d)) && n51.f.a(this.f111029e, krVar.f111029e) && n51.f.a(this.f111030f, krVar.f111030f) && n51.f.a(this.f111031g, krVar.f111031g) && n51.f.a(java.lang.Integer.valueOf(this.f111032h), java.lang.Integer.valueOf(krVar.f111032h)) && n51.f.a(java.lang.Integer.valueOf(this.f111033i), java.lang.Integer.valueOf(krVar.f111033i)) && n51.f.a(this.f111034m, krVar.f111034m) && n51.f.a(this.f111035n, krVar.f111035n) && n51.f.a(java.lang.Integer.valueOf(this.f111036o), java.lang.Integer.valueOf(krVar.f111036o)) && n51.f.a(java.lang.Integer.valueOf(this.f111037p), java.lang.Integer.valueOf(krVar.f111037p)) && n51.f.a(java.lang.Integer.valueOf(this.f111038q), java.lang.Integer.valueOf(krVar.f111038q)) && n51.f.a(java.lang.Integer.valueOf(this.f111039r), java.lang.Integer.valueOf(krVar.f111039r)) && n51.f.a(this.f111040s, krVar.f111040s) && n51.f.a(java.lang.Long.valueOf(this.f111041t), java.lang.Long.valueOf(krVar.f111041t)) && n51.f.a(java.lang.Integer.valueOf(this.f111042u), java.lang.Integer.valueOf(krVar.f111042u)) && n51.f.a(java.lang.Integer.valueOf(this.f111043v), java.lang.Integer.valueOf(krVar.f111043v)) && n51.f.a(java.lang.Integer.valueOf(this.f111044w), java.lang.Integer.valueOf(krVar.f111044w)) && n51.f.a(this.f111045x, krVar.f111045x) && n51.f.a(this.f111046y, krVar.f111046y) && n51.f.a(this.f111047z, krVar.f111047z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f111028d);
            }
            java.lang.String str = this.f111029e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f111030f);
            bw5.fr frVar = this.f111031g;
            if (frVar != null && zArr[4]) {
                fVar.i(4, frVar.mo75928xcd1e8d8());
                this.f111031g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111032h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111033i);
            }
            bw5.mr mrVar = this.f111034m;
            if (mrVar != null && zArr[7]) {
                fVar.i(7, mrVar.mo75928xcd1e8d8());
                this.f111034m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f111035n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.e(9, this.f111036o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f111037p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f111038q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f111039r);
            }
            java.lang.String str3 = this.f111040s;
            if (str3 != null && zArr[13]) {
                fVar.j(13, str3);
            }
            if (zArr[14]) {
                fVar.h(14, this.f111041t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f111042u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f111043v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f111044w);
            }
            java.lang.String str4 = this.f111045x;
            if (str4 != null && zArr[18]) {
                fVar.j(18, str4);
            }
            bw5.rf0 rf0Var = this.f111046y;
            if (rf0Var != null && zArr[19]) {
                fVar.i(19, rf0Var.mo75928xcd1e8d8());
                this.f111046y.mo75956x3d5d1f78(fVar);
            }
            bw5.pj pjVar = this.f111047z;
            if (pjVar != null && zArr[20]) {
                fVar.i(20, pjVar.mo75928xcd1e8d8());
                this.f111047z.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f111028d) + 0 : 0;
            java.lang.String str5 = this.f111029e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            int g17 = h17 + b36.f.g(3, 8, this.f111030f);
            bw5.fr frVar2 = this.f111031g;
            if (frVar2 != null && zArr[4]) {
                g17 += b36.f.i(4, frVar2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f111032h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f111033i);
            }
            bw5.mr mrVar2 = this.f111034m;
            if (mrVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, mrVar2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f111035n;
            if (str6 != null && zArr[8]) {
                g17 += b36.f.j(8, str6);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f111036o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f111037p);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f111038q);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f111039r);
            }
            java.lang.String str7 = this.f111040s;
            if (str7 != null && zArr[13]) {
                g17 += b36.f.j(13, str7);
            }
            if (zArr[14]) {
                g17 += b36.f.h(14, this.f111041t);
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f111042u);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f111043v);
            }
            if (zArr[17]) {
                g17 += b36.f.e(17, this.f111044w);
            }
            java.lang.String str8 = this.f111045x;
            if (str8 != null && zArr[18]) {
                g17 += b36.f.j(18, str8);
            }
            bw5.rf0 rf0Var2 = this.f111046y;
            if (rf0Var2 != null && zArr[19]) {
                g17 += b36.f.i(19, rf0Var2.mo75928xcd1e8d8());
            }
            bw5.pj pjVar2 = this.f111047z;
            return (pjVar2 == null || !zArr[20]) ? g17 : g17 + b36.f.i(20, pjVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f111030f.clear();
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
                this.f111028d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111029e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dw dwVar = new bw5.dw();
                    if (bArr != null && bArr.length > 0) {
                        dwVar.mo11468x92b714fd(bArr);
                    }
                    this.f111030f.add(dwVar);
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.fr frVar3 = new bw5.fr();
                    if (bArr2 != null && bArr2.length > 0) {
                        frVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f111031g = frVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f111032h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111033i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.mr mrVar3 = new bw5.mr();
                    if (bArr3 != null && bArr3.length > 0) {
                        mrVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f111034m = mrVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111035n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111036o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111037p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111038q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f111039r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f111040s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f111041t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f111042u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f111043v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f111044w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f111045x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.rf0 rf0Var3 = new bw5.rf0();
                    if (bArr4 != null && bArr4.length > 0) {
                        rf0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f111046y = rf0Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr5 != null && bArr5.length > 0) {
                        pjVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f111047z = pjVar3;
                }
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}

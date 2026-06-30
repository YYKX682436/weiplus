package bw5;

/* loaded from: classes2.dex */
public class gq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109484d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109485e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109486f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109487g;

    /* renamed from: h, reason: collision with root package name */
    public int f109488h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f109489i;

    /* renamed from: m, reason: collision with root package name */
    public int f109490m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109491n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.dc0 f109492o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f109493p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109494q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f109495r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f109496s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f109497t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f109498u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f109499v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f109500w = new boolean[17];

    static {
        new bw5.gq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gq0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.gq0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gq0)) {
            return false;
        }
        bw5.gq0 gq0Var = (bw5.gq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109484d), java.lang.Integer.valueOf(gq0Var.f109484d)) && n51.f.a(this.f109485e, gq0Var.f109485e) && n51.f.a(this.f109486f, gq0Var.f109486f) && n51.f.a(java.lang.Boolean.valueOf(this.f109487g), java.lang.Boolean.valueOf(gq0Var.f109487g)) && n51.f.a(java.lang.Integer.valueOf(this.f109488h), java.lang.Integer.valueOf(gq0Var.f109488h)) && n51.f.a(java.lang.Boolean.valueOf(this.f109489i), java.lang.Boolean.valueOf(gq0Var.f109489i)) && n51.f.a(java.lang.Integer.valueOf(this.f109490m), java.lang.Integer.valueOf(gq0Var.f109490m)) && n51.f.a(this.f109491n, gq0Var.f109491n) && n51.f.a(this.f109492o, gq0Var.f109492o) && n51.f.a(java.lang.Boolean.valueOf(this.f109493p), java.lang.Boolean.valueOf(gq0Var.f109493p)) && n51.f.a(this.f109494q, gq0Var.f109494q) && n51.f.a(java.lang.Boolean.valueOf(this.f109495r), java.lang.Boolean.valueOf(gq0Var.f109495r)) && n51.f.a(java.lang.Boolean.valueOf(this.f109496s), java.lang.Boolean.valueOf(gq0Var.f109496s)) && n51.f.a(this.f109497t, gq0Var.f109497t) && n51.f.a(java.lang.Boolean.valueOf(this.f109498u), java.lang.Boolean.valueOf(gq0Var.f109498u)) && n51.f.a(java.lang.Boolean.valueOf(this.f109499v), java.lang.Boolean.valueOf(gq0Var.f109499v));
    }

    /* renamed from: getUrl */
    public java.lang.String m12014xb5887639() {
        return this.f109500w[2] ? this.f109485e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109500w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109484d);
            }
            java.lang.String str = this.f109485e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109486f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f109487g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109488h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f109489i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109490m);
            }
            java.lang.String str2 = this.f109491n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.dc0 dc0Var = this.f109492o;
            if (dc0Var != null && zArr[9]) {
                fVar.i(9, dc0Var.mo75928xcd1e8d8());
                this.f109492o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f109493p);
            }
            java.lang.String str3 = this.f109494q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.a(12, this.f109495r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f109496s);
            }
            java.lang.String str4 = this.f109497t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.a(15, this.f109498u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f109499v);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f109484d) + 0 : 0;
            java.lang.String str5 = this.f109485e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109486f;
            if (gVar2 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f109487g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f109488h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f109489i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f109490m);
            }
            java.lang.String str6 = this.f109491n;
            if (str6 != null && zArr[8]) {
                e17 += b36.f.j(8, str6);
            }
            bw5.dc0 dc0Var2 = this.f109492o;
            if (dc0Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, dc0Var2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f109493p);
            }
            java.lang.String str7 = this.f109494q;
            if (str7 != null && zArr[11]) {
                e17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                e17 += b36.f.a(12, this.f109495r);
            }
            if (zArr[13]) {
                e17 += b36.f.a(13, this.f109496s);
            }
            java.lang.String str8 = this.f109497t;
            if (str8 != null && zArr[14]) {
                e17 += b36.f.j(14, str8);
            }
            if (zArr[15]) {
                e17 += b36.f.a(15, this.f109498u);
            }
            return zArr[16] ? e17 + b36.f.a(16, this.f109499v) : e17;
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
                this.f109484d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109485e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109486f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109487g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109488h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109489i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109490m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109491n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dc0 dc0Var3 = new bw5.dc0();
                    if (bArr != null && bArr.length > 0) {
                        dc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109492o = dc0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f109493p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109494q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109495r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109496s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109497t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f109498u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f109499v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}

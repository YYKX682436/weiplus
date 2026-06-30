package bw5;

/* loaded from: classes2.dex */
public class bh extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public final boolean[] A = new boolean[21];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107183d;

    /* renamed from: e, reason: collision with root package name */
    public int f107184e;

    /* renamed from: f, reason: collision with root package name */
    public int f107185f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107186g;

    /* renamed from: h, reason: collision with root package name */
    public int f107187h;

    /* renamed from: i, reason: collision with root package name */
    public float f107188i;

    /* renamed from: m, reason: collision with root package name */
    public int f107189m;

    /* renamed from: n, reason: collision with root package name */
    public int f107190n;

    /* renamed from: o, reason: collision with root package name */
    public int f107191o;

    /* renamed from: p, reason: collision with root package name */
    public int f107192p;

    /* renamed from: q, reason: collision with root package name */
    public int f107193q;

    /* renamed from: r, reason: collision with root package name */
    public int f107194r;

    /* renamed from: s, reason: collision with root package name */
    public int f107195s;

    /* renamed from: t, reason: collision with root package name */
    public int f107196t;

    /* renamed from: u, reason: collision with root package name */
    public int f107197u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f107198v;

    /* renamed from: w, reason: collision with root package name */
    public int f107199w;

    /* renamed from: x, reason: collision with root package name */
    public int f107200x;

    /* renamed from: y, reason: collision with root package name */
    public int f107201y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f107202z;

    static {
        new bw5.bh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bh mo11468x92b714fd(byte[] bArr) {
        return (bw5.bh) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bh)) {
            return false;
        }
        bw5.bh bhVar = (bw5.bh) fVar;
        return n51.f.a(this.f107183d, bhVar.f107183d) && n51.f.a(java.lang.Integer.valueOf(this.f107184e), java.lang.Integer.valueOf(bhVar.f107184e)) && n51.f.a(java.lang.Integer.valueOf(this.f107185f), java.lang.Integer.valueOf(bhVar.f107185f)) && n51.f.a(this.f107186g, bhVar.f107186g) && n51.f.a(java.lang.Integer.valueOf(this.f107187h), java.lang.Integer.valueOf(bhVar.f107187h)) && n51.f.a(java.lang.Float.valueOf(this.f107188i), java.lang.Float.valueOf(bhVar.f107188i)) && n51.f.a(java.lang.Integer.valueOf(this.f107189m), java.lang.Integer.valueOf(bhVar.f107189m)) && n51.f.a(java.lang.Integer.valueOf(this.f107190n), java.lang.Integer.valueOf(bhVar.f107190n)) && n51.f.a(java.lang.Integer.valueOf(this.f107191o), java.lang.Integer.valueOf(bhVar.f107191o)) && n51.f.a(java.lang.Integer.valueOf(this.f107192p), java.lang.Integer.valueOf(bhVar.f107192p)) && n51.f.a(java.lang.Integer.valueOf(this.f107193q), java.lang.Integer.valueOf(bhVar.f107193q)) && n51.f.a(java.lang.Integer.valueOf(this.f107194r), java.lang.Integer.valueOf(bhVar.f107194r)) && n51.f.a(java.lang.Integer.valueOf(this.f107195s), java.lang.Integer.valueOf(bhVar.f107195s)) && n51.f.a(java.lang.Integer.valueOf(this.f107196t), java.lang.Integer.valueOf(bhVar.f107196t)) && n51.f.a(java.lang.Integer.valueOf(this.f107197u), java.lang.Integer.valueOf(bhVar.f107197u)) && n51.f.a(this.f107198v, bhVar.f107198v) && n51.f.a(java.lang.Integer.valueOf(this.f107199w), java.lang.Integer.valueOf(bhVar.f107199w)) && n51.f.a(java.lang.Integer.valueOf(this.f107200x), java.lang.Integer.valueOf(bhVar.f107200x)) && n51.f.a(java.lang.Integer.valueOf(this.f107201y), java.lang.Integer.valueOf(bhVar.f107201y)) && n51.f.a(this.f107202z, bhVar.f107202z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107183d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107184e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107185f);
            }
            java.lang.String str2 = this.f107186g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107187h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f107188i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107189m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107190n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f107191o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f107192p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f107193q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f107194r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f107195s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f107196t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f107197u);
            }
            java.lang.String str3 = this.f107198v;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            if (zArr[17]) {
                fVar.e(17, this.f107199w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f107200x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f107201y);
            }
            java.lang.String str4 = this.f107202z;
            if (str4 != null && zArr[20]) {
                fVar.j(20, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f107183d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f107184e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f107185f);
            }
            java.lang.String str6 = this.f107186g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107187h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f107188i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f107189m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f107190n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f107191o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f107192p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f107193q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f107194r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f107195s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f107196t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f107197u);
            }
            java.lang.String str7 = this.f107198v;
            if (str7 != null && zArr[16]) {
                i18 += b36.f.j(16, str7);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f107199w);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f107200x);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f107201y);
            }
            java.lang.String str8 = this.f107202z;
            return (str8 == null || !zArr[20]) ? i18 : i18 + b36.f.j(20, str8);
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
                this.f107183d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107184e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107185f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107186g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107187h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107188i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107189m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107190n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107191o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107192p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107193q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107194r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107195s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f107196t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f107197u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f107198v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f107199w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f107200x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f107201y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f107202z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}

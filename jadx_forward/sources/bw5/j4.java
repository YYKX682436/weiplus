package bw5;

/* loaded from: classes11.dex */
public class j4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f110319d;

    /* renamed from: e, reason: collision with root package name */
    public long f110320e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110321f;

    /* renamed from: g, reason: collision with root package name */
    public long f110322g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110323h;

    /* renamed from: i, reason: collision with root package name */
    public long f110324i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa f110325m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.xa f110326n;

    /* renamed from: o, reason: collision with root package name */
    public long f110327o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.dj0 f110328p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f110329q;

    /* renamed from: r, reason: collision with root package name */
    public long f110330r;

    /* renamed from: s, reason: collision with root package name */
    public int f110331s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f110332t;

    /* renamed from: u, reason: collision with root package name */
    public int f110333u;

    /* renamed from: v, reason: collision with root package name */
    public int f110334v;

    /* renamed from: w, reason: collision with root package name */
    public int f110335w;

    /* renamed from: x, reason: collision with root package name */
    public int f110336x;

    /* renamed from: y, reason: collision with root package name */
    public int f110337y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f110338z = new boolean[20];

    static {
        new bw5.j4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.j4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j4)) {
            return false;
        }
        bw5.j4 j4Var = (bw5.j4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f110319d), java.lang.Long.valueOf(j4Var.f110319d)) && n51.f.a(java.lang.Long.valueOf(this.f110320e), java.lang.Long.valueOf(j4Var.f110320e)) && n51.f.a(this.f110321f, j4Var.f110321f) && n51.f.a(java.lang.Long.valueOf(this.f110322g), java.lang.Long.valueOf(j4Var.f110322g)) && n51.f.a(this.f110323h, j4Var.f110323h) && n51.f.a(java.lang.Long.valueOf(this.f110324i), java.lang.Long.valueOf(j4Var.f110324i)) && n51.f.a(this.f110325m, j4Var.f110325m) && n51.f.a(this.f110326n, j4Var.f110326n) && n51.f.a(java.lang.Long.valueOf(this.f110327o), java.lang.Long.valueOf(j4Var.f110327o)) && n51.f.a(this.f110328p, j4Var.f110328p) && n51.f.a(this.f110329q, j4Var.f110329q) && n51.f.a(java.lang.Long.valueOf(this.f110330r), java.lang.Long.valueOf(j4Var.f110330r)) && n51.f.a(java.lang.Integer.valueOf(this.f110331s), java.lang.Integer.valueOf(j4Var.f110331s)) && n51.f.a(this.f110332t, j4Var.f110332t) && n51.f.a(java.lang.Integer.valueOf(this.f110333u), java.lang.Integer.valueOf(j4Var.f110333u)) && n51.f.a(java.lang.Integer.valueOf(this.f110334v), java.lang.Integer.valueOf(j4Var.f110334v)) && n51.f.a(java.lang.Integer.valueOf(this.f110335w), java.lang.Integer.valueOf(j4Var.f110335w)) && n51.f.a(java.lang.Integer.valueOf(this.f110336x), java.lang.Integer.valueOf(j4Var.f110336x)) && n51.f.a(java.lang.Integer.valueOf(this.f110337y), java.lang.Integer.valueOf(j4Var.f110337y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110338z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f110319d);
            }
            if (zArr[12]) {
                fVar.h(12, this.f110320e);
            }
            java.lang.String str = this.f110321f;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110322g);
            }
            java.lang.String str2 = this.f110323h;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f110324i);
            }
            bw5.xa xaVar = this.f110325m;
            if (xaVar != null && zArr[6]) {
                fVar.i(6, xaVar.mo75928xcd1e8d8());
                this.f110325m.mo75956x3d5d1f78(fVar);
            }
            bw5.xa xaVar2 = this.f110326n;
            if (xaVar2 != null && zArr[7]) {
                fVar.i(7, xaVar2.mo75928xcd1e8d8());
                this.f110326n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f110327o);
            }
            bw5.dj0 dj0Var = this.f110328p;
            if (dj0Var != null && zArr[9]) {
                fVar.i(9, dj0Var.mo75928xcd1e8d8());
                this.f110328p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f110329q;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            if (zArr[11]) {
                fVar.h(11, this.f110330r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f110331s);
            }
            java.lang.String str4 = this.f110332t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.e(15, this.f110333u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f110334v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f110335w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f110336x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f110337y);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f110319d) + 0 : 0;
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f110320e);
            }
            java.lang.String str5 = this.f110321f;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f110322g);
            }
            java.lang.String str6 = this.f110323h;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f110324i);
            }
            bw5.xa xaVar3 = this.f110325m;
            if (xaVar3 != null && zArr[6]) {
                h17 += b36.f.i(6, xaVar3.mo75928xcd1e8d8());
            }
            bw5.xa xaVar4 = this.f110326n;
            if (xaVar4 != null && zArr[7]) {
                h17 += b36.f.i(7, xaVar4.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f110327o);
            }
            bw5.dj0 dj0Var2 = this.f110328p;
            if (dj0Var2 != null && zArr[9]) {
                h17 += b36.f.i(9, dj0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f110329q;
            if (str7 != null && zArr[10]) {
                h17 += b36.f.j(10, str7);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f110330r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f110331s);
            }
            java.lang.String str8 = this.f110332t;
            if (str8 != null && zArr[14]) {
                h17 += b36.f.j(14, str8);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f110333u);
            }
            if (zArr[16]) {
                h17 += b36.f.e(16, this.f110334v);
            }
            if (zArr[17]) {
                h17 += b36.f.e(17, this.f110335w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f110336x);
            }
            return zArr[19] ? h17 + b36.f.e(19, this.f110337y) : h17;
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
                this.f110319d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110321f = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110322g = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110323h = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110324i = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xa xaVar5 = new bw5.xa();
                    if (bArr != null && bArr.length > 0) {
                        xaVar5.mo11468x92b714fd(bArr);
                    }
                    this.f110325m = xaVar5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xa xaVar6 = new bw5.xa();
                    if (bArr2 != null && bArr2.length > 0) {
                        xaVar6.mo11468x92b714fd(bArr2);
                    }
                    this.f110326n = xaVar6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f110327o = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.dj0 dj0Var3 = new bw5.dj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dj0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f110328p = dj0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f110329q = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110330r = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110320e = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f110331s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f110332t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f110333u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f110334v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f110335w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f110336x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f110337y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}

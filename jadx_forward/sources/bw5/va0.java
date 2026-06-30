package bw5;

/* loaded from: classes2.dex */
public class va0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f115793d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115794e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115795f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115796g;

    /* renamed from: h, reason: collision with root package name */
    public long f115797h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mc0 f115798i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115799m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f115800n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115801o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f115802p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f115803q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f115804r = new boolean[12];

    static {
        new bw5.va0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.va0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.va0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.va0)) {
            return false;
        }
        bw5.va0 va0Var = (bw5.va0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f115793d), java.lang.Long.valueOf(va0Var.f115793d)) && n51.f.a(this.f115794e, va0Var.f115794e) && n51.f.a(this.f115795f, va0Var.f115795f) && n51.f.a(this.f115796g, va0Var.f115796g) && n51.f.a(java.lang.Long.valueOf(this.f115797h), java.lang.Long.valueOf(va0Var.f115797h)) && n51.f.a(this.f115798i, va0Var.f115798i) && n51.f.a(java.lang.Boolean.valueOf(this.f115799m), java.lang.Boolean.valueOf(va0Var.f115799m)) && n51.f.a(this.f115800n, va0Var.f115800n) && n51.f.a(this.f115801o, va0Var.f115801o) && n51.f.a(java.lang.Boolean.valueOf(this.f115802p), java.lang.Boolean.valueOf(va0Var.f115802p)) && n51.f.a(this.f115803q, va0Var.f115803q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.va0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115804r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f115793d);
            }
            java.lang.String str = this.f115794e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f115795f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f115796g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f115797h);
            }
            bw5.mc0 mc0Var = this.f115798i;
            if (mc0Var != null && zArr[6]) {
                fVar.i(6, mc0Var.mo75928xcd1e8d8());
                this.f115798i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f115799m);
            }
            java.lang.String str4 = this.f115800n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f115801o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            if (zArr[10]) {
                fVar.a(10, this.f115802p);
            }
            java.lang.String str6 = this.f115803q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f115793d) : 0;
            java.lang.String str7 = this.f115794e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f115795f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f115796g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f115797h);
            }
            bw5.mc0 mc0Var2 = this.f115798i;
            if (mc0Var2 != null && zArr[6]) {
                h17 += b36.f.i(6, mc0Var2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f115799m);
            }
            java.lang.String str10 = this.f115800n;
            if (str10 != null && zArr[8]) {
                h17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f115801o;
            if (str11 != null && zArr[9]) {
                h17 += b36.f.j(9, str11);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f115802p);
            }
            java.lang.String str12 = this.f115803q;
            return (str12 == null || !zArr[11]) ? h17 : h17 + b36.f.j(11, str12);
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
                this.f115793d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115794e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115795f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115796g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115797h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f115798i = mc0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f115799m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115800n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115801o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115802p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115803q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

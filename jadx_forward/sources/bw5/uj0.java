package bw5;

/* loaded from: classes2.dex */
public class uj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: q, reason: collision with root package name */
    public static final bw5.uj0 f115470q = new bw5.uj0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115471d;

    /* renamed from: e, reason: collision with root package name */
    public long f115472e;

    /* renamed from: f, reason: collision with root package name */
    public int f115473f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.tc0 f115474g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.tv f115475h;

    /* renamed from: i, reason: collision with root package name */
    public long f115476i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115477m;

    /* renamed from: n, reason: collision with root package name */
    public int f115478n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115479o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115480p = new boolean[10];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.uj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uj0)) {
            return false;
        }
        bw5.uj0 uj0Var = (bw5.uj0) fVar;
        return n51.f.a(this.f115471d, uj0Var.f115471d) && n51.f.a(java.lang.Long.valueOf(this.f115472e), java.lang.Long.valueOf(uj0Var.f115472e)) && n51.f.a(java.lang.Integer.valueOf(this.f115473f), java.lang.Integer.valueOf(uj0Var.f115473f)) && n51.f.a(this.f115474g, uj0Var.f115474g) && n51.f.a(this.f115475h, uj0Var.f115475h) && n51.f.a(java.lang.Long.valueOf(this.f115476i), java.lang.Long.valueOf(uj0Var.f115476i)) && n51.f.a(java.lang.Boolean.valueOf(this.f115477m), java.lang.Boolean.valueOf(uj0Var.f115477m)) && n51.f.a(java.lang.Integer.valueOf(this.f115478n), java.lang.Integer.valueOf(uj0Var.f115478n)) && n51.f.a(this.f115479o, uj0Var.f115479o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.uj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115480p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115471d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f115472e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115473f);
            }
            bw5.tc0 tc0Var = this.f115474g;
            if (tc0Var != null && zArr[4]) {
                fVar.i(4, tc0Var.mo75928xcd1e8d8());
                this.f115474g.mo75956x3d5d1f78(fVar);
            }
            bw5.tv tvVar = this.f115475h;
            if (tvVar != null && zArr[5]) {
                fVar.i(5, tvVar.mo75928xcd1e8d8());
                this.f115475h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f115476i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f115477m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115478n);
            }
            java.lang.String str2 = this.f115479o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f115471d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f115472e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f115473f);
            }
            bw5.tc0 tc0Var2 = this.f115474g;
            if (tc0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, tc0Var2.mo75928xcd1e8d8());
            }
            bw5.tv tvVar2 = this.f115475h;
            if (tvVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, tvVar2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f115476i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f115477m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f115478n);
            }
            java.lang.String str4 = this.f115479o;
            return (str4 == null || !zArr[9]) ? i18 : i18 + b36.f.j(9, str4);
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
                this.f115471d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115472e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115473f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tc0 tc0Var3 = new bw5.tc0();
                    if (bArr != null && bArr.length > 0) {
                        tc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f115474g = tc0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.tv tvVar3 = new bw5.tv();
                    if (bArr2 != null && bArr2.length > 0) {
                        tvVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f115475h = tvVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f115476i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115477m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115478n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115479o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

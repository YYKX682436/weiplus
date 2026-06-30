package bw5;

/* loaded from: classes2.dex */
public class ag0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f106720d;

    /* renamed from: e, reason: collision with root package name */
    public long f106721e;

    /* renamed from: f, reason: collision with root package name */
    public long f106722f;

    /* renamed from: g, reason: collision with root package name */
    public int f106723g;

    /* renamed from: h, reason: collision with root package name */
    public int f106724h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f106725i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f106726m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f106727n = new boolean[8];

    static {
        new bw5.ag0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ag0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ag0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ag0)) {
            return false;
        }
        bw5.ag0 ag0Var = (bw5.ag0) fVar;
        return n51.f.a(this.f106720d, ag0Var.f106720d) && n51.f.a(java.lang.Long.valueOf(this.f106721e), java.lang.Long.valueOf(ag0Var.f106721e)) && n51.f.a(java.lang.Long.valueOf(this.f106722f), java.lang.Long.valueOf(ag0Var.f106722f)) && n51.f.a(java.lang.Integer.valueOf(this.f106723g), java.lang.Integer.valueOf(ag0Var.f106723g)) && n51.f.a(java.lang.Integer.valueOf(this.f106724h), java.lang.Integer.valueOf(ag0Var.f106724h)) && n51.f.a(this.f106725i, ag0Var.f106725i) && n51.f.a(this.f106726m, ag0Var.f106726m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ag0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106727n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f106720d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f106721e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f106722f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f106723g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f106724h);
            }
            java.lang.String str2 = this.f106725i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f106726m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f106720d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f106721e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f106722f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f106723g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f106724h);
            }
            java.lang.String str5 = this.f106725i;
            if (str5 != null && zArr[6]) {
                i18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f106726m;
            return (str6 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str6);
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
                this.f106720d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f106721e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106722f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106723g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106724h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106725i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f106726m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

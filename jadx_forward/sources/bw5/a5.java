package bw5;

/* loaded from: classes4.dex */
public class a5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f106545d;

    /* renamed from: e, reason: collision with root package name */
    public long f106546e;

    /* renamed from: f, reason: collision with root package name */
    public long f106547f;

    /* renamed from: g, reason: collision with root package name */
    public long f106548g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.z4 f106549h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f106550i;

    /* renamed from: m, reason: collision with root package name */
    public int f106551m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f106552n;

    /* renamed from: o, reason: collision with root package name */
    public long f106553o;

    /* renamed from: p, reason: collision with root package name */
    public long f106554p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f106555q = new boolean[11];

    static {
        new bw5.a5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a5)) {
            return false;
        }
        bw5.a5 a5Var = (bw5.a5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f106545d), java.lang.Long.valueOf(a5Var.f106545d)) && n51.f.a(java.lang.Long.valueOf(this.f106546e), java.lang.Long.valueOf(a5Var.f106546e)) && n51.f.a(java.lang.Long.valueOf(this.f106547f), java.lang.Long.valueOf(a5Var.f106547f)) && n51.f.a(java.lang.Long.valueOf(this.f106548g), java.lang.Long.valueOf(a5Var.f106548g)) && n51.f.a(this.f106549h, a5Var.f106549h) && n51.f.a(this.f106550i, a5Var.f106550i) && n51.f.a(java.lang.Integer.valueOf(this.f106551m), java.lang.Integer.valueOf(a5Var.f106551m)) && n51.f.a(this.f106552n, a5Var.f106552n) && n51.f.a(java.lang.Long.valueOf(this.f106553o), java.lang.Long.valueOf(a5Var.f106553o)) && n51.f.a(java.lang.Long.valueOf(this.f106554p), java.lang.Long.valueOf(a5Var.f106554p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106555q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f106545d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f106546e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f106547f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f106548g);
            }
            bw5.z4 z4Var = this.f106549h;
            if (z4Var != null && zArr[5]) {
                fVar.e(5, z4Var.f117346d);
            }
            java.lang.String str = this.f106550i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f106551m);
            }
            java.lang.String str2 = this.f106552n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.h(9, this.f106553o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f106554p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f106545d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f106546e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f106547f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f106548g);
            }
            bw5.z4 z4Var2 = this.f106549h;
            if (z4Var2 != null && zArr[5]) {
                h17 += b36.f.e(5, z4Var2.f117346d);
            }
            java.lang.String str3 = this.f106550i;
            if (str3 != null && zArr[6]) {
                h17 += b36.f.j(6, str3);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f106551m);
            }
            java.lang.String str4 = this.f106552n;
            if (str4 != null && zArr[8]) {
                h17 += b36.f.j(8, str4);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f106553o);
            }
            return zArr[10] ? h17 + b36.f.h(10, this.f106554p) : h17;
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
                this.f106545d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f106546e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106547f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106548g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106549h = bw5.z4.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f106550i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f106551m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f106552n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f106553o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f106554p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}

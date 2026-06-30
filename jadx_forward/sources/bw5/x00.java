package bw5;

/* loaded from: classes2.dex */
public class x00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116423d;

    /* renamed from: e, reason: collision with root package name */
    public long f116424e;

    /* renamed from: f, reason: collision with root package name */
    public int f116425f;

    /* renamed from: g, reason: collision with root package name */
    public int f116426g;

    /* renamed from: h, reason: collision with root package name */
    public long f116427h;

    /* renamed from: i, reason: collision with root package name */
    public int f116428i;

    /* renamed from: m, reason: collision with root package name */
    public int f116429m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116430n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f116431o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116432p = new boolean[10];

    static {
        new bw5.x00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.x00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x00)) {
            return false;
        }
        bw5.x00 x00Var = (bw5.x00) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116423d), java.lang.Long.valueOf(x00Var.f116423d)) && n51.f.a(java.lang.Long.valueOf(this.f116424e), java.lang.Long.valueOf(x00Var.f116424e)) && n51.f.a(java.lang.Integer.valueOf(this.f116425f), java.lang.Integer.valueOf(x00Var.f116425f)) && n51.f.a(java.lang.Integer.valueOf(this.f116426g), java.lang.Integer.valueOf(x00Var.f116426g)) && n51.f.a(java.lang.Long.valueOf(this.f116427h), java.lang.Long.valueOf(x00Var.f116427h)) && n51.f.a(java.lang.Integer.valueOf(this.f116428i), java.lang.Integer.valueOf(x00Var.f116428i)) && n51.f.a(java.lang.Integer.valueOf(this.f116429m), java.lang.Integer.valueOf(x00Var.f116429m)) && n51.f.a(this.f116430n, x00Var.f116430n) && n51.f.a(this.f116431o, x00Var.f116431o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116432p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116423d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f116424e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116425f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116426g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116427h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116428i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f116429m);
            }
            java.lang.String str = this.f116430n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f116431o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116423d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f116424e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f116425f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f116426g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f116427h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f116428i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f116429m);
            }
            java.lang.String str3 = this.f116430n;
            if (str3 != null && zArr[8]) {
                h17 += b36.f.j(8, str3);
            }
            java.lang.String str4 = this.f116431o;
            return (str4 == null || !zArr[9]) ? h17 : h17 + b36.f.j(9, str4);
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
                this.f116423d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116424e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116425f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116426g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116427h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116428i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116429m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116430n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116431o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

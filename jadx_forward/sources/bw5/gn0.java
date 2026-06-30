package bw5;

/* loaded from: classes11.dex */
public class gn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109455d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109456e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109457f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109458g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109459h;

    /* renamed from: i, reason: collision with root package name */
    public int f109460i;

    /* renamed from: m, reason: collision with root package name */
    public int f109461m;

    /* renamed from: n, reason: collision with root package name */
    public long f109462n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f109463o = new boolean[9];

    static {
        new bw5.gn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gn0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.gn0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gn0)) {
            return false;
        }
        bw5.gn0 gn0Var = (bw5.gn0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109455d), java.lang.Integer.valueOf(gn0Var.f109455d)) && n51.f.a(this.f109456e, gn0Var.f109456e) && n51.f.a(this.f109457f, gn0Var.f109457f) && n51.f.a(this.f109458g, gn0Var.f109458g) && n51.f.a(this.f109459h, gn0Var.f109459h) && n51.f.a(java.lang.Integer.valueOf(this.f109460i), java.lang.Integer.valueOf(gn0Var.f109460i)) && n51.f.a(java.lang.Integer.valueOf(this.f109461m), java.lang.Integer.valueOf(gn0Var.f109461m)) && n51.f.a(java.lang.Long.valueOf(this.f109462n), java.lang.Long.valueOf(gn0Var.f109462n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109463o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109455d);
            }
            java.lang.String str = this.f109456e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f109457f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f109458g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f109459h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109460i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109461m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f109462n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109455d) : 0;
            java.lang.String str5 = this.f109456e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f109457f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f109458g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f109459h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f109460i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f109461m);
            }
            return zArr[8] ? e17 + b36.f.h(8, this.f109462n) : e17;
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
                this.f109455d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109456e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109457f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109458g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109459h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109460i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109461m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109462n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

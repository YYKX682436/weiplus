package dw5;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f325832d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f325833e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f325834f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f325835g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f325836h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f325837i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f325838m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f325839n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f325840o;

    /* renamed from: p, reason: collision with root package name */
    public int f325841p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f325842q = new boolean[11];

    static {
        new dw5.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.a)) {
            return false;
        }
        dw5.a aVar = (dw5.a) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f325832d), java.lang.Boolean.valueOf(aVar.f325832d)) && n51.f.a(java.lang.Boolean.valueOf(this.f325833e), java.lang.Boolean.valueOf(aVar.f325833e)) && n51.f.a(java.lang.Boolean.valueOf(this.f325834f), java.lang.Boolean.valueOf(aVar.f325834f)) && n51.f.a(java.lang.Boolean.valueOf(this.f325835g), java.lang.Boolean.valueOf(aVar.f325835g)) && n51.f.a(java.lang.Boolean.valueOf(this.f325836h), java.lang.Boolean.valueOf(aVar.f325836h)) && n51.f.a(java.lang.Boolean.valueOf(this.f325837i), java.lang.Boolean.valueOf(aVar.f325837i)) && n51.f.a(java.lang.Boolean.valueOf(this.f325838m), java.lang.Boolean.valueOf(aVar.f325838m)) && n51.f.a(java.lang.Boolean.valueOf(this.f325839n), java.lang.Boolean.valueOf(aVar.f325839n)) && n51.f.a(java.lang.Boolean.valueOf(this.f325840o), java.lang.Boolean.valueOf(aVar.f325840o)) && n51.f.a(java.lang.Integer.valueOf(this.f325841p), java.lang.Integer.valueOf(aVar.f325841p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f325842q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f325832d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f325833e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f325834f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f325835g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f325836h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f325837i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f325838m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f325839n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f325840o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f325841p);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f325832d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f325833e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f325834f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f325835g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f325836h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f325837i);
            }
            if (zArr[7]) {
                a17 += b36.f.a(7, this.f325838m);
            }
            if (zArr[8]) {
                a17 += b36.f.a(8, this.f325839n);
            }
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f325840o);
            }
            return zArr[10] ? a17 + b36.f.e(10, this.f325841p) : a17;
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
                this.f325832d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f325833e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f325834f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f325835g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f325836h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f325837i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f325838m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f325839n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f325840o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f325841p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (dw5.a) super.mo11468x92b714fd(bArr);
    }
}

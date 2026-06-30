package bw5;

/* loaded from: classes14.dex */
public class b2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.y1 f107017d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107019f;

    /* renamed from: g, reason: collision with root package name */
    public int f107020g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f107021h;

    /* renamed from: i, reason: collision with root package name */
    public int f107022i;

    /* renamed from: m, reason: collision with root package name */
    public int f107023m;

    /* renamed from: n, reason: collision with root package name */
    public int f107024n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107025o;

    /* renamed from: p, reason: collision with root package name */
    public float f107026p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f107027q = new boolean[11];

    static {
        new bw5.b2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b2)) {
            return false;
        }
        bw5.b2 b2Var = (bw5.b2) fVar;
        return n51.f.a(this.f107017d, b2Var.f107017d) && n51.f.a(java.lang.Boolean.valueOf(this.f107018e), java.lang.Boolean.valueOf(b2Var.f107018e)) && n51.f.a(java.lang.Boolean.valueOf(this.f107019f), java.lang.Boolean.valueOf(b2Var.f107019f)) && n51.f.a(java.lang.Integer.valueOf(this.f107020g), java.lang.Integer.valueOf(b2Var.f107020g)) && n51.f.a(java.lang.Boolean.valueOf(this.f107021h), java.lang.Boolean.valueOf(b2Var.f107021h)) && n51.f.a(java.lang.Integer.valueOf(this.f107022i), java.lang.Integer.valueOf(b2Var.f107022i)) && n51.f.a(java.lang.Integer.valueOf(this.f107023m), java.lang.Integer.valueOf(b2Var.f107023m)) && n51.f.a(java.lang.Integer.valueOf(this.f107024n), java.lang.Integer.valueOf(b2Var.f107024n)) && n51.f.a(java.lang.Boolean.valueOf(this.f107025o), java.lang.Boolean.valueOf(b2Var.f107025o)) && n51.f.a(java.lang.Float.valueOf(this.f107026p), java.lang.Float.valueOf(b2Var.f107026p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107027q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.y1 y1Var = this.f107017d;
            if (y1Var != null && zArr[1]) {
                fVar.i(1, y1Var.mo75928xcd1e8d8());
                this.f107017d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f107018e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f107019f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107020g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f107021h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107022i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107023m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107024n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f107025o);
            }
            if (zArr[10]) {
                fVar.d(10, this.f107026p);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.y1 y1Var2 = this.f107017d;
            if (y1Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, y1Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f107018e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f107019f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107020g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f107021h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107022i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f107023m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f107024n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f107025o);
            }
            return zArr[10] ? i18 + b36.f.d(10, this.f107026p) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.y1 y1Var3 = new bw5.y1();
                    if (bArr != null && bArr.length > 0) {
                        y1Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107017d = y1Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f107018e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107019f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107020g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107021h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107022i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107023m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107024n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107025o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107026p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.b2) super.mo11468x92b714fd(bArr);
    }
}

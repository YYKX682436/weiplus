package cw5;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f305890d;

    /* renamed from: e, reason: collision with root package name */
    public int f305891e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f305892f;

    /* renamed from: g, reason: collision with root package name */
    public long f305893g;

    /* renamed from: h, reason: collision with root package name */
    public int f305894h;

    /* renamed from: i, reason: collision with root package name */
    public int f305895i;

    /* renamed from: m, reason: collision with root package name */
    public int f305896m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f305897n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f305898o = new boolean[9];

    static {
        new cw5.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.g)) {
            return false;
        }
        cw5.g gVar = (cw5.g) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f305890d), java.lang.Integer.valueOf(gVar.f305890d)) && n51.f.a(java.lang.Integer.valueOf(this.f305891e), java.lang.Integer.valueOf(gVar.f305891e)) && n51.f.a(this.f305892f, gVar.f305892f) && n51.f.a(java.lang.Long.valueOf(this.f305893g), java.lang.Long.valueOf(gVar.f305893g)) && n51.f.a(java.lang.Integer.valueOf(this.f305894h), java.lang.Integer.valueOf(gVar.f305894h)) && n51.f.a(java.lang.Integer.valueOf(this.f305895i), java.lang.Integer.valueOf(gVar.f305895i)) && n51.f.a(java.lang.Integer.valueOf(this.f305896m), java.lang.Integer.valueOf(gVar.f305896m)) && n51.f.a(java.lang.Boolean.valueOf(this.f305897n), java.lang.Boolean.valueOf(gVar.f305897n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new cw5.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f305898o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f305890d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f305891e);
            }
            java.lang.String str = this.f305892f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f305893g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f305894h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f305895i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f305896m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f305897n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f305890d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f305891e);
            }
            java.lang.String str2 = this.f305892f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f305893g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f305894h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f305895i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f305896m);
            }
            return zArr[8] ? e17 + b36.f.a(8, this.f305897n) : e17;
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
                this.f305890d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f305891e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f305892f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f305893g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f305894h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f305895i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f305896m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f305897n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (cw5.g) super.mo11468x92b714fd(bArr);
    }
}

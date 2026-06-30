package cw5;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f305844d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f305845e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f305846f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305847g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f305848h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f305849i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f305850m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f305851n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f305852o;

    /* renamed from: p, reason: collision with root package name */
    public int f305853p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f305854q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f305855r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f305856s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f305857t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f305858u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f305859v = new boolean[35];

    static {
        new cw5.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.a)) {
            return false;
        }
        cw5.a aVar = (cw5.a) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f305844d), java.lang.Boolean.valueOf(aVar.f305844d)) && n51.f.a(java.lang.Boolean.valueOf(this.f305845e), java.lang.Boolean.valueOf(aVar.f305845e)) && n51.f.a(java.lang.Boolean.valueOf(this.f305846f), java.lang.Boolean.valueOf(aVar.f305846f)) && n51.f.a(java.lang.Boolean.valueOf(this.f305847g), java.lang.Boolean.valueOf(aVar.f305847g)) && n51.f.a(java.lang.Boolean.valueOf(this.f305848h), java.lang.Boolean.valueOf(aVar.f305848h)) && n51.f.a(java.lang.Boolean.valueOf(this.f305849i), java.lang.Boolean.valueOf(aVar.f305849i)) && n51.f.a(java.lang.Boolean.valueOf(this.f305850m), java.lang.Boolean.valueOf(aVar.f305850m)) && n51.f.a(java.lang.Boolean.valueOf(this.f305851n), java.lang.Boolean.valueOf(aVar.f305851n)) && n51.f.a(java.lang.Boolean.valueOf(this.f305852o), java.lang.Boolean.valueOf(aVar.f305852o)) && n51.f.a(java.lang.Integer.valueOf(this.f305853p), java.lang.Integer.valueOf(aVar.f305853p)) && n51.f.a(java.lang.Boolean.valueOf(this.f305854q), java.lang.Boolean.valueOf(aVar.f305854q)) && n51.f.a(this.f305855r, aVar.f305855r) && n51.f.a(java.lang.Boolean.valueOf(this.f305856s), java.lang.Boolean.valueOf(aVar.f305856s)) && n51.f.a(java.lang.Boolean.valueOf(this.f305857t), java.lang.Boolean.valueOf(aVar.f305857t)) && n51.f.a(this.f305858u, aVar.f305858u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new cw5.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f305859v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f305844d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f305845e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f305846f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f305847g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f305848h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f305849i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f305850m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f305851n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f305852o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f305853p);
            }
            if (zArr[30]) {
                fVar.a(30, this.f305854q);
            }
            java.lang.String str = this.f305855r;
            if (str != null && zArr[31]) {
                fVar.j(31, str);
            }
            if (zArr[32]) {
                fVar.a(32, this.f305856s);
            }
            if (zArr[33]) {
                fVar.a(33, this.f305857t);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f305858u;
            if (gVar != null && zArr[34]) {
                fVar.b(34, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? b36.f.a(1, this.f305844d) + 0 : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f305845e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f305846f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f305847g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f305848h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f305849i);
            }
            if (zArr[7]) {
                a17 += b36.f.a(7, this.f305850m);
            }
            if (zArr[8]) {
                a17 += b36.f.a(8, this.f305851n);
            }
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f305852o);
            }
            if (zArr[10]) {
                a17 += b36.f.e(10, this.f305853p);
            }
            if (zArr[30]) {
                a17 += b36.f.a(30, this.f305854q);
            }
            java.lang.String str2 = this.f305855r;
            if (str2 != null && zArr[31]) {
                a17 += b36.f.j(31, str2);
            }
            if (zArr[32]) {
                a17 += b36.f.a(32, this.f305856s);
            }
            if (zArr[33]) {
                a17 += b36.f.a(33, this.f305857t);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f305858u;
            return (gVar2 == null || !zArr[34]) ? a17 : a17 + b36.f.b(34, gVar2);
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
                this.f305844d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f305845e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f305846f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f305847g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f305848h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f305849i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f305850m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f305851n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f305852o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f305853p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                switch (intValue) {
                    case 30:
                        this.f305854q = aVar2.c(intValue);
                        zArr[30] = true;
                        return 0;
                    case 31:
                        this.f305855r = aVar2.k(intValue);
                        zArr[31] = true;
                        return 0;
                    case 32:
                        this.f305856s = aVar2.c(intValue);
                        zArr[32] = true;
                        return 0;
                    case 33:
                        this.f305857t = aVar2.c(intValue);
                        zArr[33] = true;
                        return 0;
                    case 34:
                        this.f305858u = aVar2.d(intValue);
                        zArr[34] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (cw5.a) super.mo11468x92b714fd(bArr);
    }
}

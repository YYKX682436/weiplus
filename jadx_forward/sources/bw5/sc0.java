package bw5;

/* loaded from: classes2.dex */
public class sc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f114434d;

    /* renamed from: e, reason: collision with root package name */
    public int f114435e;

    /* renamed from: f, reason: collision with root package name */
    public int f114436f;

    /* renamed from: g, reason: collision with root package name */
    public int f114437g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114438h;

    /* renamed from: i, reason: collision with root package name */
    public int f114439i;

    /* renamed from: m, reason: collision with root package name */
    public int f114440m;

    /* renamed from: n, reason: collision with root package name */
    public int f114441n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f114442o;

    /* renamed from: p, reason: collision with root package name */
    public long f114443p;

    /* renamed from: q, reason: collision with root package name */
    public int f114444q;

    /* renamed from: r, reason: collision with root package name */
    public int f114445r;

    /* renamed from: s, reason: collision with root package name */
    public int f114446s;

    /* renamed from: t, reason: collision with root package name */
    public long f114447t;

    /* renamed from: u, reason: collision with root package name */
    public long f114448u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f114449v = new boolean[16];

    static {
        new bw5.sc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.sc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sc0)) {
            return false;
        }
        bw5.sc0 sc0Var = (bw5.sc0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f114434d), java.lang.Long.valueOf(sc0Var.f114434d)) && n51.f.a(java.lang.Integer.valueOf(this.f114435e), java.lang.Integer.valueOf(sc0Var.f114435e)) && n51.f.a(java.lang.Integer.valueOf(this.f114436f), java.lang.Integer.valueOf(sc0Var.f114436f)) && n51.f.a(java.lang.Integer.valueOf(this.f114437g), java.lang.Integer.valueOf(sc0Var.f114437g)) && n51.f.a(this.f114438h, sc0Var.f114438h) && n51.f.a(java.lang.Integer.valueOf(this.f114439i), java.lang.Integer.valueOf(sc0Var.f114439i)) && n51.f.a(java.lang.Integer.valueOf(this.f114440m), java.lang.Integer.valueOf(sc0Var.f114440m)) && n51.f.a(java.lang.Integer.valueOf(this.f114441n), java.lang.Integer.valueOf(sc0Var.f114441n)) && n51.f.a(java.lang.Boolean.valueOf(this.f114442o), java.lang.Boolean.valueOf(sc0Var.f114442o)) && n51.f.a(java.lang.Long.valueOf(this.f114443p), java.lang.Long.valueOf(sc0Var.f114443p)) && n51.f.a(java.lang.Integer.valueOf(this.f114444q), java.lang.Integer.valueOf(sc0Var.f114444q)) && n51.f.a(java.lang.Integer.valueOf(this.f114445r), java.lang.Integer.valueOf(sc0Var.f114445r)) && n51.f.a(java.lang.Integer.valueOf(this.f114446s), java.lang.Integer.valueOf(sc0Var.f114446s)) && n51.f.a(java.lang.Long.valueOf(this.f114447t), java.lang.Long.valueOf(sc0Var.f114447t)) && n51.f.a(java.lang.Long.valueOf(this.f114448u), java.lang.Long.valueOf(sc0Var.f114448u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114449v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f114434d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114435e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f114436f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f114437g);
            }
            java.lang.String str = this.f114438h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114439i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114440m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f114441n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f114442o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f114443p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114444q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114445r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f114446s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f114447t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f114448u);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f114434d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f114435e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f114436f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f114437g);
            }
            java.lang.String str2 = this.f114438h;
            if (str2 != null && zArr[5]) {
                h17 += b36.f.j(5, str2);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f114439i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f114440m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f114441n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f114442o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f114443p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f114444q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f114445r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f114446s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f114447t);
            }
            return zArr[15] ? h17 + b36.f.h(15, this.f114448u) : h17;
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
                this.f114434d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114435e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114436f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114437g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114438h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114439i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114440m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114441n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114442o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114443p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114444q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114445r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114446s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114447t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114448u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}

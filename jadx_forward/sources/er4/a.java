package er4;

/* loaded from: classes14.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: y, reason: collision with root package name */
    public static final er4.a f337568y = new er4.a();

    /* renamed from: d, reason: collision with root package name */
    public int f337569d;

    /* renamed from: e, reason: collision with root package name */
    public int f337570e;

    /* renamed from: f, reason: collision with root package name */
    public int f337571f;

    /* renamed from: g, reason: collision with root package name */
    public int f337572g;

    /* renamed from: h, reason: collision with root package name */
    public int f337573h;

    /* renamed from: i, reason: collision with root package name */
    public int f337574i;

    /* renamed from: m, reason: collision with root package name */
    public int f337575m;

    /* renamed from: n, reason: collision with root package name */
    public int f337576n;

    /* renamed from: o, reason: collision with root package name */
    public int f337577o;

    /* renamed from: p, reason: collision with root package name */
    public int f337578p;

    /* renamed from: q, reason: collision with root package name */
    public int f337579q;

    /* renamed from: r, reason: collision with root package name */
    public int f337580r;

    /* renamed from: s, reason: collision with root package name */
    public int f337581s;

    /* renamed from: t, reason: collision with root package name */
    public long f337582t;

    /* renamed from: u, reason: collision with root package name */
    public long f337583u;

    /* renamed from: v, reason: collision with root package name */
    public int f337584v;

    /* renamed from: w, reason: collision with root package name */
    public int f337585w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f337586x = new boolean[18];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.a)) {
            return false;
        }
        er4.a aVar = (er4.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f337569d), java.lang.Integer.valueOf(aVar.f337569d)) && n51.f.a(java.lang.Integer.valueOf(this.f337570e), java.lang.Integer.valueOf(aVar.f337570e)) && n51.f.a(java.lang.Integer.valueOf(this.f337571f), java.lang.Integer.valueOf(aVar.f337571f)) && n51.f.a(java.lang.Integer.valueOf(this.f337572g), java.lang.Integer.valueOf(aVar.f337572g)) && n51.f.a(java.lang.Integer.valueOf(this.f337573h), java.lang.Integer.valueOf(aVar.f337573h)) && n51.f.a(java.lang.Integer.valueOf(this.f337574i), java.lang.Integer.valueOf(aVar.f337574i)) && n51.f.a(java.lang.Integer.valueOf(this.f337575m), java.lang.Integer.valueOf(aVar.f337575m)) && n51.f.a(java.lang.Integer.valueOf(this.f337576n), java.lang.Integer.valueOf(aVar.f337576n)) && n51.f.a(java.lang.Integer.valueOf(this.f337577o), java.lang.Integer.valueOf(aVar.f337577o)) && n51.f.a(java.lang.Integer.valueOf(this.f337578p), java.lang.Integer.valueOf(aVar.f337578p)) && n51.f.a(java.lang.Integer.valueOf(this.f337579q), java.lang.Integer.valueOf(aVar.f337579q)) && n51.f.a(java.lang.Integer.valueOf(this.f337580r), java.lang.Integer.valueOf(aVar.f337580r)) && n51.f.a(java.lang.Integer.valueOf(this.f337581s), java.lang.Integer.valueOf(aVar.f337581s)) && n51.f.a(java.lang.Long.valueOf(this.f337582t), java.lang.Long.valueOf(aVar.f337582t)) && n51.f.a(java.lang.Long.valueOf(this.f337583u), java.lang.Long.valueOf(aVar.f337583u)) && n51.f.a(java.lang.Integer.valueOf(this.f337584v), java.lang.Integer.valueOf(aVar.f337584v)) && n51.f.a(java.lang.Integer.valueOf(this.f337585w), java.lang.Integer.valueOf(aVar.f337585w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f337586x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f337569d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f337570e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f337571f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f337572g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f337573h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f337574i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f337575m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f337576n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f337577o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f337578p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f337579q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f337580r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f337581s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f337582t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f337583u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f337584v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f337585w);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f337569d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f337570e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f337571f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f337572g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f337573h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f337574i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f337575m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f337576n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f337577o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f337578p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f337579q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f337580r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f337581s);
            }
            if (zArr[14]) {
                e17 += b36.f.h(14, this.f337582t);
            }
            if (zArr[15]) {
                e17 += b36.f.h(15, this.f337583u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f337584v);
            }
            return zArr[17] ? e17 + b36.f.e(17, this.f337585w) : e17;
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
                this.f337569d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f337570e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f337571f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f337572g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f337573h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f337574i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f337575m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f337576n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f337577o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f337578p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f337579q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f337580r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f337581s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f337582t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f337583u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f337584v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f337585w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.a) super.mo11468x92b714fd(bArr);
    }
}

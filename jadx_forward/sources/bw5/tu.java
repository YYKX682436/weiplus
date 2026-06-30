package bw5;

/* loaded from: classes2.dex */
public class tu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115136d;

    /* renamed from: e, reason: collision with root package name */
    public float f115137e;

    /* renamed from: f, reason: collision with root package name */
    public int f115138f;

    /* renamed from: g, reason: collision with root package name */
    public int f115139g;

    /* renamed from: h, reason: collision with root package name */
    public int f115140h;

    /* renamed from: i, reason: collision with root package name */
    public int f115141i;

    /* renamed from: n, reason: collision with root package name */
    public float f115143n;

    /* renamed from: p, reason: collision with root package name */
    public int f115145p;

    /* renamed from: q, reason: collision with root package name */
    public int f115146q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f115142m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f115144o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f115147r = new boolean[12];

    static {
        new bw5.tu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tu mo11468x92b714fd(byte[] bArr) {
        return (bw5.tu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tu)) {
            return false;
        }
        bw5.tu tuVar = (bw5.tu) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115136d), java.lang.Integer.valueOf(tuVar.f115136d)) && n51.f.a(java.lang.Float.valueOf(this.f115137e), java.lang.Float.valueOf(tuVar.f115137e)) && n51.f.a(java.lang.Integer.valueOf(this.f115138f), java.lang.Integer.valueOf(tuVar.f115138f)) && n51.f.a(java.lang.Integer.valueOf(this.f115139g), java.lang.Integer.valueOf(tuVar.f115139g)) && n51.f.a(java.lang.Integer.valueOf(this.f115140h), java.lang.Integer.valueOf(tuVar.f115140h)) && n51.f.a(java.lang.Integer.valueOf(this.f115141i), java.lang.Integer.valueOf(tuVar.f115141i)) && n51.f.a(this.f115142m, tuVar.f115142m) && n51.f.a(java.lang.Float.valueOf(this.f115143n), java.lang.Float.valueOf(tuVar.f115143n)) && n51.f.a(this.f115144o, tuVar.f115144o) && n51.f.a(java.lang.Integer.valueOf(this.f115145p), java.lang.Integer.valueOf(tuVar.f115145p)) && n51.f.a(java.lang.Integer.valueOf(this.f115146q), java.lang.Integer.valueOf(tuVar.f115146q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115144o;
        java.util.LinkedList linkedList2 = this.f115142m;
        boolean[] zArr = this.f115147r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115136d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f115137e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115138f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115139g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115140h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115141i);
            }
            fVar.g(7, 1, linkedList2);
            if (zArr[8]) {
                fVar.d(8, this.f115143n);
            }
            fVar.g(9, 8, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f115145p);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.e(11, this.f115146q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115136d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f115137e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f115138f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f115139g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f115140h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f115141i);
            }
            int g17 = e17 + b36.f.g(7, 1, linkedList2);
            if (zArr[8]) {
                g17 += b36.f.d(8, this.f115143n);
            }
            int g18 = g17 + b36.f.g(9, 8, linkedList);
            if (zArr[10]) {
                g18 += b36.f.e(10, this.f115145p);
            }
            return zArr[11] ? g18 + b36.f.e(11, this.f115146q) : g18;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                this.f115136d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115137e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115138f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115139g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115140h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115141i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                this.f115143n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.uu uuVar = new bw5.uu();
                    if (bArr != null && bArr.length > 0) {
                        uuVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(uuVar);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f115145p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115146q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

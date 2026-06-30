package bw5;

/* loaded from: classes2.dex */
public class fq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f108969d;

    /* renamed from: e, reason: collision with root package name */
    public int f108970e;

    /* renamed from: f, reason: collision with root package name */
    public long f108971f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108972g;

    /* renamed from: h, reason: collision with root package name */
    public long f108973h;

    /* renamed from: i, reason: collision with root package name */
    public int f108974i;

    /* renamed from: m, reason: collision with root package name */
    public int f108975m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.aq f108976n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ae f108977o;

    /* renamed from: p, reason: collision with root package name */
    public float f108978p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f108979q;

    /* renamed from: s, reason: collision with root package name */
    public int f108981s;

    /* renamed from: t, reason: collision with root package name */
    public int f108982t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.gq f108983u;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f108980r = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f108984v = new boolean[16];

    static {
        new bw5.fq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fq mo11468x92b714fd(byte[] bArr) {
        return (bw5.fq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fq)) {
            return false;
        }
        bw5.fq fqVar = (bw5.fq) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108969d), java.lang.Long.valueOf(fqVar.f108969d)) && n51.f.a(java.lang.Integer.valueOf(this.f108970e), java.lang.Integer.valueOf(fqVar.f108970e)) && n51.f.a(java.lang.Long.valueOf(this.f108971f), java.lang.Long.valueOf(fqVar.f108971f)) && n51.f.a(this.f108972g, fqVar.f108972g) && n51.f.a(java.lang.Long.valueOf(this.f108973h), java.lang.Long.valueOf(fqVar.f108973h)) && n51.f.a(java.lang.Integer.valueOf(this.f108974i), java.lang.Integer.valueOf(fqVar.f108974i)) && n51.f.a(java.lang.Integer.valueOf(this.f108975m), java.lang.Integer.valueOf(fqVar.f108975m)) && n51.f.a(this.f108976n, fqVar.f108976n) && n51.f.a(this.f108977o, fqVar.f108977o) && n51.f.a(java.lang.Float.valueOf(this.f108978p), java.lang.Float.valueOf(fqVar.f108978p)) && n51.f.a(this.f108979q, fqVar.f108979q) && n51.f.a(this.f108980r, fqVar.f108980r) && n51.f.a(java.lang.Integer.valueOf(this.f108981s), java.lang.Integer.valueOf(fqVar.f108981s)) && n51.f.a(java.lang.Integer.valueOf(this.f108982t), java.lang.Integer.valueOf(fqVar.f108982t)) && n51.f.a(this.f108983u, fqVar.f108983u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108980r;
        boolean[] zArr = this.f108984v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f108969d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108970e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f108971f);
            }
            java.lang.String str = this.f108972g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.h(5, this.f108973h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108974i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f108975m);
            }
            bw5.aq aqVar = this.f108976n;
            if (aqVar != null && zArr[8]) {
                fVar.i(8, aqVar.mo75928xcd1e8d8());
                this.f108976n.mo75956x3d5d1f78(fVar);
            }
            bw5.ae aeVar = this.f108977o;
            if (aeVar != null && zArr[9]) {
                fVar.i(9, aeVar.mo75928xcd1e8d8());
                this.f108977o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.d(10, this.f108978p);
            }
            java.lang.String str2 = this.f108979q;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            fVar.g(12, 2, linkedList);
            if (zArr[13]) {
                fVar.e(13, this.f108981s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f108982t);
            }
            bw5.gq gqVar = this.f108983u;
            if (gqVar != null && zArr[15]) {
                fVar.i(15, gqVar.mo75928xcd1e8d8());
                this.f108983u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f108969d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f108970e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f108971f);
            }
            java.lang.String str3 = this.f108972g;
            if (str3 != null && zArr[4]) {
                h17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f108973h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f108974i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f108975m);
            }
            bw5.aq aqVar2 = this.f108976n;
            if (aqVar2 != null && zArr[8]) {
                h17 += b36.f.i(8, aqVar2.mo75928xcd1e8d8());
            }
            bw5.ae aeVar2 = this.f108977o;
            if (aeVar2 != null && zArr[9]) {
                h17 += b36.f.i(9, aeVar2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                h17 += b36.f.d(10, this.f108978p);
            }
            java.lang.String str4 = this.f108979q;
            if (str4 != null && zArr[11]) {
                h17 += b36.f.j(11, str4);
            }
            int g17 = h17 + b36.f.g(12, 2, linkedList);
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f108981s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f108982t);
            }
            bw5.gq gqVar2 = this.f108983u;
            return (gqVar2 == null || !zArr[15]) ? g17 : g17 + b36.f.i(15, gqVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
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
                this.f108969d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108970e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108971f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108972g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108973h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108974i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108975m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.aq aqVar3 = new bw5.aq();
                    if (bArr != null && bArr.length > 0) {
                        aqVar3.mo11468x92b714fd(bArr);
                    }
                    this.f108976n = aqVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f108977o = aeVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f108978p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108979q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[12] = true;
                return 0;
            case 13:
                this.f108981s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108982t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.gq gqVar3 = new bw5.gq();
                    if (bArr3 != null && bArr3.length > 0) {
                        gqVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f108983u = gqVar3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}

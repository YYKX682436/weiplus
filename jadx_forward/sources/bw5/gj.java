package bw5;

/* loaded from: classes2.dex */
public class gj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109402d;

    /* renamed from: e, reason: collision with root package name */
    public int f109403e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109404f;

    /* renamed from: g, reason: collision with root package name */
    public long f109405g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109406h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109407i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f109408m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f109409n = new boolean[8];

    static {
        new bw5.gj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gj mo11468x92b714fd(byte[] bArr) {
        return (bw5.gj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gj)) {
            return false;
        }
        bw5.gj gjVar = (bw5.gj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109402d), java.lang.Integer.valueOf(gjVar.f109402d)) && n51.f.a(java.lang.Integer.valueOf(this.f109403e), java.lang.Integer.valueOf(gjVar.f109403e)) && n51.f.a(this.f109404f, gjVar.f109404f) && n51.f.a(java.lang.Long.valueOf(this.f109405g), java.lang.Long.valueOf(gjVar.f109405g)) && n51.f.a(this.f109406h, gjVar.f109406h) && n51.f.a(this.f109407i, gjVar.f109407i) && n51.f.a(this.f109408m, gjVar.f109408m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109408m;
        boolean[] zArr = this.f109409n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109402d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109403e);
            }
            java.lang.String str = this.f109404f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109405g);
            }
            java.lang.String str2 = this.f109406h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f109407i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109402d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109403e);
            }
            java.lang.String str4 = this.f109404f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f109405g);
            }
            java.lang.String str5 = this.f109406h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f109407i;
            if (str6 != null && zArr[6]) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.g(7, 8, linkedList);
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
                this.f109402d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109403e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109404f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109405g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109406h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109407i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.hj hjVar = new bw5.hj();
                    if (bArr != null && bArr.length > 0) {
                        hjVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(hjVar);
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package wn1;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f528952d;

    /* renamed from: e, reason: collision with root package name */
    public wn1.k f528953e;

    /* renamed from: f, reason: collision with root package name */
    public int f528954f;

    /* renamed from: g, reason: collision with root package name */
    public int f528955g;

    /* renamed from: h, reason: collision with root package name */
    public int f528956h;

    /* renamed from: i, reason: collision with root package name */
    public int f528957i;

    /* renamed from: m, reason: collision with root package name */
    public int f528958m;

    /* renamed from: n, reason: collision with root package name */
    public int f528959n;

    /* renamed from: o, reason: collision with root package name */
    public int f528960o;

    /* renamed from: p, reason: collision with root package name */
    public int f528961p;

    /* renamed from: q, reason: collision with root package name */
    public int f528962q;

    /* renamed from: r, reason: collision with root package name */
    public wn1.a f528963r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.g)) {
            return false;
        }
        wn1.g gVar = (wn1.g) fVar;
        return n51.f.a(this.f528952d, gVar.f528952d) && n51.f.a(this.f528953e, gVar.f528953e) && n51.f.a(java.lang.Integer.valueOf(this.f528954f), java.lang.Integer.valueOf(gVar.f528954f)) && n51.f.a(java.lang.Integer.valueOf(this.f528955g), java.lang.Integer.valueOf(gVar.f528955g)) && n51.f.a(java.lang.Integer.valueOf(this.f528956h), java.lang.Integer.valueOf(gVar.f528956h)) && n51.f.a(java.lang.Integer.valueOf(this.f528957i), java.lang.Integer.valueOf(gVar.f528957i)) && n51.f.a(java.lang.Integer.valueOf(this.f528958m), java.lang.Integer.valueOf(gVar.f528958m)) && n51.f.a(java.lang.Integer.valueOf(this.f528959n), java.lang.Integer.valueOf(gVar.f528959n)) && n51.f.a(java.lang.Integer.valueOf(this.f528960o), java.lang.Integer.valueOf(gVar.f528960o)) && n51.f.a(java.lang.Integer.valueOf(this.f528961p), java.lang.Integer.valueOf(gVar.f528961p)) && n51.f.a(java.lang.Integer.valueOf(this.f528962q), java.lang.Integer.valueOf(gVar.f528962q)) && n51.f.a(this.f528963r, gVar.f528963r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f528952d;
            if (str != null) {
                fVar.j(1, str);
            }
            wn1.k kVar = this.f528953e;
            if (kVar != null) {
                fVar.i(2, kVar.mo75928xcd1e8d8());
                this.f528953e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f528954f);
            fVar.e(4, this.f528955g);
            fVar.e(5, this.f528956h);
            fVar.e(6, this.f528957i);
            fVar.e(7, this.f528958m);
            fVar.e(8, this.f528959n);
            fVar.e(9, this.f528960o);
            fVar.e(10, this.f528961p);
            fVar.e(11, this.f528962q);
            wn1.a aVar = this.f528963r;
            if (aVar != null) {
                fVar.i(12, aVar.mo75928xcd1e8d8());
                this.f528963r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f528952d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            wn1.k kVar2 = this.f528953e;
            if (kVar2 != null) {
                j17 += b36.f.i(2, kVar2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(3, this.f528954f) + b36.f.e(4, this.f528955g) + b36.f.e(5, this.f528956h) + b36.f.e(6, this.f528957i) + b36.f.e(7, this.f528958m) + b36.f.e(8, this.f528959n) + b36.f.e(9, this.f528960o) + b36.f.e(10, this.f528961p) + b36.f.e(11, this.f528962q);
            wn1.a aVar2 = this.f528963r;
            return aVar2 != null ? e17 + b36.f.i(12, aVar2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        wn1.g gVar = (wn1.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gVar.f528952d = aVar4.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    wn1.k kVar3 = new wn1.k();
                    if (bArr != null && bArr.length > 0) {
                        kVar3.mo11468x92b714fd(bArr);
                    }
                    gVar.f528953e = kVar3;
                }
                return 0;
            case 3:
                gVar.f528954f = aVar4.g(intValue);
                return 0;
            case 4:
                gVar.f528955g = aVar4.g(intValue);
                return 0;
            case 5:
                gVar.f528956h = aVar4.g(intValue);
                return 0;
            case 6:
                gVar.f528957i = aVar4.g(intValue);
                return 0;
            case 7:
                gVar.f528958m = aVar4.g(intValue);
                return 0;
            case 8:
                gVar.f528959n = aVar4.g(intValue);
                return 0;
            case 9:
                gVar.f528960o = aVar4.g(intValue);
                return 0;
            case 10:
                gVar.f528961p = aVar4.g(intValue);
                return 0;
            case 11:
                gVar.f528962q = aVar4.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    wn1.a aVar5 = new wn1.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.mo11468x92b714fd(bArr2);
                    }
                    gVar.f528963r = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}

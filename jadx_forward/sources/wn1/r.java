package wn1;

/* loaded from: classes12.dex */
public class r extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f528994d;

    /* renamed from: e, reason: collision with root package name */
    public long f528995e;

    /* renamed from: f, reason: collision with root package name */
    public long f528996f;

    /* renamed from: g, reason: collision with root package name */
    public int f528997g;

    /* renamed from: h, reason: collision with root package name */
    public int f528998h;

    /* renamed from: i, reason: collision with root package name */
    public long f528999i;

    /* renamed from: m, reason: collision with root package name */
    public wn1.p f529000m;

    /* renamed from: n, reason: collision with root package name */
    public int f529001n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.r)) {
            return false;
        }
        wn1.r rVar = (wn1.r) fVar;
        return n51.f.a(this.f528994d, rVar.f528994d) && n51.f.a(java.lang.Long.valueOf(this.f528995e), java.lang.Long.valueOf(rVar.f528995e)) && n51.f.a(java.lang.Long.valueOf(this.f528996f), java.lang.Long.valueOf(rVar.f528996f)) && n51.f.a(java.lang.Integer.valueOf(this.f528997g), java.lang.Integer.valueOf(rVar.f528997g)) && n51.f.a(java.lang.Integer.valueOf(this.f528998h), java.lang.Integer.valueOf(rVar.f528998h)) && n51.f.a(java.lang.Long.valueOf(this.f528999i), java.lang.Long.valueOf(rVar.f528999i)) && n51.f.a(this.f529000m, rVar.f529000m) && n51.f.a(java.lang.Integer.valueOf(this.f529001n), java.lang.Integer.valueOf(rVar.f529001n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f528994d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f528995e);
            fVar.h(3, this.f528996f);
            fVar.e(4, this.f528997g);
            fVar.e(5, this.f528998h);
            fVar.h(6, this.f528999i);
            wn1.p pVar = this.f529000m;
            if (pVar != null) {
                fVar.i(7, pVar.mo75928xcd1e8d8());
                this.f529000m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f529001n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f528994d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f528995e) + b36.f.h(3, this.f528996f) + b36.f.e(4, this.f528997g) + b36.f.e(5, this.f528998h) + b36.f.h(6, this.f528999i);
            wn1.p pVar2 = this.f529000m;
            if (pVar2 != null) {
                j17 += b36.f.i(7, pVar2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(8, this.f529001n);
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
        wn1.r rVar = (wn1.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rVar.f528994d = aVar2.k(intValue);
                return 0;
            case 2:
                rVar.f528995e = aVar2.i(intValue);
                return 0;
            case 3:
                rVar.f528996f = aVar2.i(intValue);
                return 0;
            case 4:
                rVar.f528997g = aVar2.g(intValue);
                return 0;
            case 5:
                rVar.f528998h = aVar2.g(intValue);
                return 0;
            case 6:
                rVar.f528999i = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    wn1.p pVar3 = new wn1.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar3.mo11468x92b714fd(bArr);
                    }
                    rVar.f529000m = pVar3;
                }
                return 0;
            case 8:
                rVar.f529001n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

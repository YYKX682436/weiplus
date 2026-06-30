package wn1;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f529002d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f529003e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529004f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f529005g;

    /* renamed from: h, reason: collision with root package name */
    public int f529006h;

    /* renamed from: i, reason: collision with root package name */
    public int f529007i;

    /* renamed from: m, reason: collision with root package name */
    public long f529008m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.s)) {
            return false;
        }
        wn1.s sVar = (wn1.s) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f529002d), java.lang.Integer.valueOf(sVar.f529002d)) && n51.f.a(this.f529003e, sVar.f529003e) && n51.f.a(this.f529004f, sVar.f529004f) && n51.f.a(this.f529005g, sVar.f529005g) && n51.f.a(java.lang.Integer.valueOf(this.f529006h), java.lang.Integer.valueOf(sVar.f529006h)) && n51.f.a(java.lang.Integer.valueOf(this.f529007i), java.lang.Integer.valueOf(sVar.f529007i)) && n51.f.a(java.lang.Long.valueOf(this.f529008m), java.lang.Long.valueOf(sVar.f529008m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f529002d);
            java.lang.String str = this.f529003e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f529004f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f529005g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f529006h);
            fVar.e(6, this.f529007i);
            fVar.h(7, this.f529008m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f529002d) + 0;
            java.lang.String str4 = this.f529003e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f529004f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f529005g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f529006h) + b36.f.e(6, this.f529007i) + b36.f.h(7, this.f529008m);
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
        wn1.s sVar = (wn1.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sVar.f529002d = aVar2.g(intValue);
                return 0;
            case 2:
                sVar.f529003e = aVar2.k(intValue);
                return 0;
            case 3:
                sVar.f529004f = aVar2.k(intValue);
                return 0;
            case 4:
                sVar.f529005g = aVar2.k(intValue);
                return 0;
            case 5:
                sVar.f529006h = aVar2.g(intValue);
                return 0;
            case 6:
                sVar.f529007i = aVar2.g(intValue);
                return 0;
            case 7:
                sVar.f529008m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

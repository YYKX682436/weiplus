package n33;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416045d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f416046e;

    /* renamed from: f, reason: collision with root package name */
    public int f416047f;

    /* renamed from: g, reason: collision with root package name */
    public int f416048g;

    /* renamed from: h, reason: collision with root package name */
    public int f416049h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f416050i;

    /* renamed from: m, reason: collision with root package name */
    public long f416051m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n33.g)) {
            return false;
        }
        n33.g gVar = (n33.g) fVar;
        return n51.f.a(this.f416045d, gVar.f416045d) && n51.f.a(this.f416046e, gVar.f416046e) && n51.f.a(java.lang.Integer.valueOf(this.f416047f), java.lang.Integer.valueOf(gVar.f416047f)) && n51.f.a(java.lang.Integer.valueOf(this.f416048g), java.lang.Integer.valueOf(gVar.f416048g)) && n51.f.a(java.lang.Integer.valueOf(this.f416049h), java.lang.Integer.valueOf(gVar.f416049h)) && n51.f.a(this.f416050i, gVar.f416050i) && n51.f.a(java.lang.Long.valueOf(this.f416051m), java.lang.Long.valueOf(gVar.f416051m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f416045d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f416046e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f416047f);
            fVar.e(4, this.f416048g);
            fVar.e(5, this.f416049h);
            java.lang.String str3 = this.f416050i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f416051m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f416045d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f416046e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f416047f) + b36.f.e(4, this.f416048g) + b36.f.e(5, this.f416049h);
            java.lang.String str6 = this.f416050i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.h(7, this.f416051m);
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
        n33.g gVar = (n33.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gVar.f416045d = aVar2.k(intValue);
                return 0;
            case 2:
                gVar.f416046e = aVar2.k(intValue);
                return 0;
            case 3:
                gVar.f416047f = aVar2.g(intValue);
                return 0;
            case 4:
                gVar.f416048g = aVar2.g(intValue);
                return 0;
            case 5:
                gVar.f416049h = aVar2.g(intValue);
                return 0;
            case 6:
                gVar.f416050i = aVar2.k(intValue);
                return 0;
            case 7:
                gVar.f416051m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package wn1;

/* loaded from: classes12.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529024d;

    /* renamed from: e, reason: collision with root package name */
    public int f529025e;

    /* renamed from: f, reason: collision with root package name */
    public int f529026f;

    /* renamed from: g, reason: collision with root package name */
    public int f529027g;

    /* renamed from: h, reason: collision with root package name */
    public int f529028h;

    /* renamed from: i, reason: collision with root package name */
    public int f529029i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f529030m;

    /* renamed from: n, reason: collision with root package name */
    public int f529031n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.v)) {
            return false;
        }
        wn1.v vVar = (wn1.v) fVar;
        return n51.f.a(this.f529024d, vVar.f529024d) && n51.f.a(java.lang.Integer.valueOf(this.f529025e), java.lang.Integer.valueOf(vVar.f529025e)) && n51.f.a(java.lang.Integer.valueOf(this.f529026f), java.lang.Integer.valueOf(vVar.f529026f)) && n51.f.a(java.lang.Integer.valueOf(this.f529027g), java.lang.Integer.valueOf(vVar.f529027g)) && n51.f.a(java.lang.Integer.valueOf(this.f529028h), java.lang.Integer.valueOf(vVar.f529028h)) && n51.f.a(java.lang.Integer.valueOf(this.f529029i), java.lang.Integer.valueOf(vVar.f529029i)) && n51.f.a(this.f529030m, vVar.f529030m) && n51.f.a(java.lang.Integer.valueOf(this.f529031n), java.lang.Integer.valueOf(vVar.f529031n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f529024d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f529025e);
            fVar.e(3, this.f529026f);
            fVar.e(4, this.f529027g);
            fVar.e(5, this.f529028h);
            fVar.e(6, this.f529029i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f529030m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f529031n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f529024d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f529025e) + b36.f.e(3, this.f529026f) + b36.f.e(4, this.f529027g) + b36.f.e(5, this.f529028h) + b36.f.e(6, this.f529029i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f529030m;
            if (gVar2 != null) {
                j17 += b36.f.b(7, gVar2);
            }
            return j17 + b36.f.e(8, this.f529031n);
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
        wn1.v vVar = (wn1.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vVar.f529024d = aVar2.k(intValue);
                return 0;
            case 2:
                vVar.f529025e = aVar2.g(intValue);
                return 0;
            case 3:
                vVar.f529026f = aVar2.g(intValue);
                return 0;
            case 4:
                vVar.f529027g = aVar2.g(intValue);
                return 0;
            case 5:
                vVar.f529028h = aVar2.g(intValue);
                return 0;
            case 6:
                vVar.f529029i = aVar2.g(intValue);
                return 0;
            case 7:
                vVar.f529030m = aVar2.d(intValue);
                return 0;
            case 8:
                vVar.f529031n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

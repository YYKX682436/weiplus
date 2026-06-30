package p45;

/* loaded from: classes14.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433428d;

    /* renamed from: e, reason: collision with root package name */
    public int f433429e;

    /* renamed from: f, reason: collision with root package name */
    public int f433430f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f433431g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f433432h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f433433i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433434m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f433435n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f433436o;

    /* renamed from: p, reason: collision with root package name */
    public int f433437p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.e)) {
            return false;
        }
        p45.e eVar = (p45.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433428d), java.lang.Integer.valueOf(eVar.f433428d)) && n51.f.a(java.lang.Integer.valueOf(this.f433429e), java.lang.Integer.valueOf(eVar.f433429e)) && n51.f.a(java.lang.Integer.valueOf(this.f433430f), java.lang.Integer.valueOf(eVar.f433430f)) && n51.f.a(this.f433431g, eVar.f433431g) && n51.f.a(this.f433432h, eVar.f433432h) && n51.f.a(this.f433433i, eVar.f433433i) && n51.f.a(this.f433434m, eVar.f433434m) && n51.f.a(this.f433435n, eVar.f433435n) && n51.f.a(this.f433436o, eVar.f433436o) && n51.f.a(java.lang.Integer.valueOf(this.f433437p), java.lang.Integer.valueOf(eVar.f433437p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433431g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433428d);
            fVar.e(2, this.f433429e);
            fVar.e(3, this.f433430f);
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f433432h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f433433i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f433434m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f433435n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f433436o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f433437p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433428d) + 0 + b36.f.e(2, this.f433429e) + b36.f.e(3, this.f433430f) + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f433432h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f433433i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f433434m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f433435n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f433436o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f433437p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        p45.e eVar = (p45.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eVar.f433428d = aVar2.g(intValue);
                return 0;
            case 2:
                eVar.f433429e = aVar2.g(intValue);
                return 0;
            case 3:
                eVar.f433430f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    p45.d dVar = new p45.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar.mo11468x92b714fd(bArr2);
                    }
                    eVar.f433431g.add(dVar);
                }
                return 0;
            case 5:
                eVar.f433432h = aVar2.k(intValue);
                return 0;
            case 6:
                eVar.f433433i = aVar2.k(intValue);
                return 0;
            case 7:
                eVar.f433434m = aVar2.k(intValue);
                return 0;
            case 8:
                eVar.f433435n = aVar2.k(intValue);
                return 0;
            case 9:
                eVar.f433436o = aVar2.k(intValue);
                return 0;
            case 10:
                eVar.f433437p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

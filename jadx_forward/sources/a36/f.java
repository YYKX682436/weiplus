package a36;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82666d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82667e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82668f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82669g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82670h;

    /* renamed from: i, reason: collision with root package name */
    public int f82671i;

    /* renamed from: m, reason: collision with root package name */
    public a36.e f82672m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f82673n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f82674o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.f)) {
            return false;
        }
        a36.f fVar2 = (a36.f) fVar;
        return n51.f.a(this.f82666d, fVar2.f82666d) && n51.f.a(this.f82667e, fVar2.f82667e) && n51.f.a(this.f82668f, fVar2.f82668f) && n51.f.a(this.f82669g, fVar2.f82669g) && n51.f.a(this.f82670h, fVar2.f82670h) && n51.f.a(java.lang.Integer.valueOf(this.f82671i), java.lang.Integer.valueOf(fVar2.f82671i)) && n51.f.a(this.f82672m, fVar2.f82672m) && n51.f.a(this.f82673n, fVar2.f82673n) && n51.f.a(this.f82674o, fVar2.f82674o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f82666d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f82667e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f82668f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f82669g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f82670h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f82671i);
            a36.e eVar = this.f82672m;
            if (eVar != null) {
                fVar.i(7, eVar.mo75928xcd1e8d8());
                this.f82672m.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f82673n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f82674o;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f82666d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f82667e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f82668f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f82669g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f82670h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f82671i);
            a36.e eVar2 = this.f82672m;
            if (eVar2 != null) {
                e17 += b36.f.i(7, eVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f82673n;
            if (gVar3 != null) {
                e17 += b36.f.b(8, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f82674o;
            return gVar4 != null ? e17 + b36.f.b(9, gVar4) : e17;
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
        a36.f fVar2 = (a36.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f82666d = aVar2.k(intValue);
                return 0;
            case 2:
                fVar2.f82667e = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f82668f = aVar2.k(intValue);
                return 0;
            case 4:
                fVar2.f82669g = aVar2.k(intValue);
                return 0;
            case 5:
                fVar2.f82670h = aVar2.k(intValue);
                return 0;
            case 6:
                fVar2.f82671i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    a36.e eVar3 = new a36.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.mo11468x92b714fd(bArr);
                    }
                    fVar2.f82672m = eVar3;
                }
                return 0;
            case 8:
                fVar2.f82673n = aVar2.d(intValue);
                return 0;
            case 9:
                fVar2.f82674o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

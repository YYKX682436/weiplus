package uk;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f510016d;

    /* renamed from: e, reason: collision with root package name */
    public int f510017e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f510018f;

    /* renamed from: g, reason: collision with root package name */
    public int f510019g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f510020h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f510021i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f510022m;

    /* renamed from: n, reason: collision with root package name */
    public int f510023n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f510024o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f510016d;
            if (str == null) {
                throw new b36.g("Not all required fields were included: apkMd5");
            }
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f510017e);
            java.lang.String str2 = this.f510018f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f510019g);
            java.lang.String str3 = this.f510020h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f510021i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f510022m);
            fVar.e(8, this.f510023n);
            fVar.a(9, this.f510024o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f510016d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f510017e);
            java.lang.String str6 = this.f510018f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f510019g);
            java.lang.String str7 = this.f510020h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f510021i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.a(7, this.f510022m) + b36.f.e(8, this.f510023n) + b36.f.a(9, this.f510024o);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            if (this.f510016d != null) {
                return 0;
            }
            throw new b36.g("Not all required fields were included: apkMd5");
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        uk.c cVar = (uk.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f510016d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f510017e = aVar2.g(intValue);
                return 0;
            case 3:
                cVar.f510018f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f510019g = aVar2.g(intValue);
                return 0;
            case 5:
                cVar.f510020h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f510021i = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f510022m = aVar2.c(intValue);
                return 0;
            case 8:
                cVar.f510023n = aVar2.g(intValue);
                return 0;
            case 9:
                cVar.f510024o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

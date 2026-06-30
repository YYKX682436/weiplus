package d02;

/* loaded from: classes2.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306829d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f306830e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f306831f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306832g;

    /* renamed from: h, reason: collision with root package name */
    public int f306833h;

    /* renamed from: i, reason: collision with root package name */
    public int f306834i;

    /* renamed from: m, reason: collision with root package name */
    public d02.h f306835m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f306836n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.d)) {
            return false;
        }
        d02.d dVar = (d02.d) fVar;
        return n51.f.a(this.f306829d, dVar.f306829d) && n51.f.a(this.f306830e, dVar.f306830e) && n51.f.a(this.f306831f, dVar.f306831f) && n51.f.a(this.f306832g, dVar.f306832g) && n51.f.a(java.lang.Integer.valueOf(this.f306833h), java.lang.Integer.valueOf(dVar.f306833h)) && n51.f.a(java.lang.Integer.valueOf(this.f306834i), java.lang.Integer.valueOf(dVar.f306834i)) && n51.f.a(this.f306835m, dVar.f306835m) && n51.f.a(this.f306836n, dVar.f306836n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f306829d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f306830e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f306831f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f306832g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f306833h);
            fVar.e(6, this.f306834i);
            d02.h hVar = this.f306835m;
            if (hVar != null) {
                fVar.i(7, hVar.mo75928xcd1e8d8());
                this.f306835m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f306836n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f306829d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f306830e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f306831f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f306832g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f306833h) + b36.f.e(6, this.f306834i);
            d02.h hVar2 = this.f306835m;
            if (hVar2 != null) {
                e17 += b36.f.i(7, hVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f306836n;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        d02.d dVar = (d02.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dVar.f306829d = aVar2.k(intValue);
                return 0;
            case 2:
                dVar.f306830e = aVar2.k(intValue);
                return 0;
            case 3:
                dVar.f306831f = aVar2.k(intValue);
                return 0;
            case 4:
                dVar.f306832g = aVar2.k(intValue);
                return 0;
            case 5:
                dVar.f306833h = aVar2.g(intValue);
                return 0;
            case 6:
                dVar.f306834i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    d02.h hVar3 = new d02.h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.mo11468x92b714fd(bArr);
                    }
                    dVar.f306835m = hVar3;
                }
                return 0;
            case 8:
                dVar.f306836n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

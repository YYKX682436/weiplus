package a36;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public a36.g f82630d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82632f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82633g;

    /* renamed from: h, reason: collision with root package name */
    public int f82634h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f82635i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f82636m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.b)) {
            return false;
        }
        a36.b bVar = (a36.b) fVar;
        return n51.f.a(this.f82630d, bVar.f82630d) && n51.f.a(this.f82631e, bVar.f82631e) && n51.f.a(this.f82632f, bVar.f82632f) && n51.f.a(this.f82633g, bVar.f82633g) && n51.f.a(java.lang.Integer.valueOf(this.f82634h), java.lang.Integer.valueOf(bVar.f82634h)) && n51.f.a(this.f82635i, bVar.f82635i) && n51.f.a(this.f82636m, bVar.f82636m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            a36.g gVar = this.f82630d;
            if (gVar != null) {
                fVar.i(1, gVar.mo75928xcd1e8d8());
                this.f82630d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f82631e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f82632f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f82633g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f82634h);
            java.lang.String str4 = this.f82635i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f82636m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            a36.g gVar2 = this.f82630d;
            int i18 = gVar2 != null ? 0 + b36.f.i(1, gVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f82631e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f82632f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f82633g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int e17 = i18 + b36.f.e(5, this.f82634h);
            java.lang.String str9 = this.f82635i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f82636m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        a36.b bVar = (a36.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    a36.g gVar3 = new a36.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.mo11468x92b714fd(bArr);
                    }
                    bVar.f82630d = gVar3;
                }
                return 0;
            case 2:
                bVar.f82631e = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f82632f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f82633g = aVar2.k(intValue);
                return 0;
            case 5:
                bVar.f82634h = aVar2.g(intValue);
                return 0;
            case 6:
                bVar.f82635i = aVar2.k(intValue);
                return 0;
            case 7:
                bVar.f82636m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

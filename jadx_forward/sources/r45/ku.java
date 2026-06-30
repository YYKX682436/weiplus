package r45;

/* loaded from: classes8.dex */
public class ku extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460479d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460480e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460481f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460482g;

    /* renamed from: h, reason: collision with root package name */
    public int f460483h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460484i;

    /* renamed from: m, reason: collision with root package name */
    public r45.iu f460485m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460486n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ku)) {
            return false;
        }
        r45.ku kuVar = (r45.ku) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460479d), java.lang.Integer.valueOf(kuVar.f460479d)) && n51.f.a(this.f460480e, kuVar.f460480e) && n51.f.a(this.f460481f, kuVar.f460481f) && n51.f.a(this.f460482g, kuVar.f460482g) && n51.f.a(java.lang.Integer.valueOf(this.f460483h), java.lang.Integer.valueOf(kuVar.f460483h)) && n51.f.a(this.f460484i, kuVar.f460484i) && n51.f.a(this.f460485m, kuVar.f460485m) && n51.f.a(this.f460486n, kuVar.f460486n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460479d);
            java.lang.String str = this.f460480e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460481f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460482g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f460483h);
            java.lang.String str4 = this.f460484i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.iu iuVar = this.f460485m;
            if (iuVar != null) {
                fVar.i(7, iuVar.mo75928xcd1e8d8());
                this.f460485m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f460486n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460479d) + 0;
            java.lang.String str6 = this.f460480e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f460481f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f460482g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int e18 = e17 + b36.f.e(5, this.f460483h);
            java.lang.String str9 = this.f460484i;
            if (str9 != null) {
                e18 += b36.f.j(6, str9);
            }
            r45.iu iuVar2 = this.f460485m;
            if (iuVar2 != null) {
                e18 += b36.f.i(7, iuVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f460486n;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.ku kuVar = (r45.ku) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kuVar.f460479d = aVar2.g(intValue);
                return 0;
            case 2:
                kuVar.f460480e = aVar2.k(intValue);
                return 0;
            case 3:
                kuVar.f460481f = aVar2.k(intValue);
                return 0;
            case 4:
                kuVar.f460482g = aVar2.k(intValue);
                return 0;
            case 5:
                kuVar.f460483h = aVar2.g(intValue);
                return 0;
            case 6:
                kuVar.f460484i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr);
                    }
                    kuVar.f460485m = iuVar3;
                }
                return 0;
            case 8:
                kuVar.f460486n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

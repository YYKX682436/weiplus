package r45;

/* loaded from: classes9.dex */
public class iy extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458933d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458934e;

    /* renamed from: f, reason: collision with root package name */
    public long f458935f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458936g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458937h;

    /* renamed from: i, reason: collision with root package name */
    public int f458938i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458939m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458940n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iy)) {
            return false;
        }
        r45.iy iyVar = (r45.iy) fVar;
        return n51.f.a(this.f76494x2de60e5e, iyVar.f76494x2de60e5e) && n51.f.a(this.f458933d, iyVar.f458933d) && n51.f.a(this.f458934e, iyVar.f458934e) && n51.f.a(java.lang.Long.valueOf(this.f458935f), java.lang.Long.valueOf(iyVar.f458935f)) && n51.f.a(this.f458936g, iyVar.f458936g) && n51.f.a(this.f458937h, iyVar.f458937h) && n51.f.a(java.lang.Integer.valueOf(this.f458938i), java.lang.Integer.valueOf(iyVar.f458938i)) && n51.f.a(this.f458939m, iyVar.f458939m) && n51.f.a(this.f458940n, iyVar.f458940n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f458933d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458934e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f458935f);
            java.lang.String str3 = this.f458936g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f458937h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f458938i);
            java.lang.String str5 = this.f458939m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f458940n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f458933d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f458934e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int h17 = i18 + b36.f.h(4, this.f458935f);
            java.lang.String str9 = this.f458936g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f458937h;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            int e17 = h17 + b36.f.e(7, this.f458938i);
            java.lang.String str11 = this.f458939m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f458940n;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.iy iyVar = (r45.iy) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    iyVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                iyVar.f458933d = aVar2.k(intValue);
                return 0;
            case 3:
                iyVar.f458934e = aVar2.k(intValue);
                return 0;
            case 4:
                iyVar.f458935f = aVar2.i(intValue);
                return 0;
            case 5:
                iyVar.f458936g = aVar2.k(intValue);
                return 0;
            case 6:
                iyVar.f458937h = aVar2.k(intValue);
                return 0;
            case 7:
                iyVar.f458938i = aVar2.g(intValue);
                return 0;
            case 8:
                iyVar.f458939m = aVar2.k(intValue);
                return 0;
            case 9:
                iyVar.f458940n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

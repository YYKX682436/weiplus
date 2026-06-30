package r45;

/* loaded from: classes4.dex */
public class k2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459849d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459850e;

    /* renamed from: f, reason: collision with root package name */
    public int f459851f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459852g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459853h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459854i;

    /* renamed from: m, reason: collision with root package name */
    public long f459855m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k2)) {
            return false;
        }
        r45.k2 k2Var = (r45.k2) fVar;
        return n51.f.a(this.f76494x2de60e5e, k2Var.f76494x2de60e5e) && n51.f.a(this.f459849d, k2Var.f459849d) && n51.f.a(this.f459850e, k2Var.f459850e) && n51.f.a(java.lang.Integer.valueOf(this.f459851f), java.lang.Integer.valueOf(k2Var.f459851f)) && n51.f.a(this.f459852g, k2Var.f459852g) && n51.f.a(this.f459853h, k2Var.f459853h) && n51.f.a(this.f459854i, k2Var.f459854i) && n51.f.a(java.lang.Long.valueOf(this.f459855m), java.lang.Long.valueOf(k2Var.f459855m));
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
            java.lang.String str = this.f459849d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f459850e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f459851f);
            java.lang.String str3 = this.f459852g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f459853h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f459854i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f459855m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f459849d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f459850e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f459851f);
            java.lang.String str8 = this.f459852g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f459853h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f459854i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            return e17 + b36.f.h(8, this.f459855m);
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
        r45.k2 k2Var = (r45.k2) objArr[1];
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
                    k2Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                k2Var.f459849d = aVar2.k(intValue);
                return 0;
            case 3:
                k2Var.f459850e = aVar2.k(intValue);
                return 0;
            case 4:
                k2Var.f459851f = aVar2.g(intValue);
                return 0;
            case 5:
                k2Var.f459852g = aVar2.k(intValue);
                return 0;
            case 6:
                k2Var.f459853h = aVar2.k(intValue);
                return 0;
            case 7:
                k2Var.f459854i = aVar2.k(intValue);
                return 0;
            case 8:
                k2Var.f459855m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class of3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463751e;

    /* renamed from: f, reason: collision with root package name */
    public int f463752f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463753g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463755i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463756m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.of3)) {
            return false;
        }
        r45.of3 of3Var = (r45.of3) fVar;
        return n51.f.a(this.f76492x92037252, of3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463750d), java.lang.Integer.valueOf(of3Var.f463750d)) && n51.f.a(this.f463751e, of3Var.f463751e) && n51.f.a(java.lang.Integer.valueOf(this.f463752f), java.lang.Integer.valueOf(of3Var.f463752f)) && n51.f.a(this.f463753g, of3Var.f463753g) && n51.f.a(this.f463754h, of3Var.f463754h) && n51.f.a(this.f463755i, of3Var.f463755i) && n51.f.a(this.f463756m, of3Var.f463756m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463750d);
            java.lang.String str = this.f463751e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f463752f);
            java.lang.String str2 = this.f463753g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f463754h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463755i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f463756m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463750d);
            java.lang.String str6 = this.f463751e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f463752f);
            java.lang.String str7 = this.f463753g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f463754h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f463755i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f463756m;
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
        r45.of3 of3Var = (r45.of3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    of3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                of3Var.f463750d = aVar2.g(intValue);
                return 0;
            case 3:
                of3Var.f463751e = aVar2.k(intValue);
                return 0;
            case 4:
                of3Var.f463752f = aVar2.g(intValue);
                return 0;
            case 5:
                of3Var.f463753g = aVar2.k(intValue);
                return 0;
            case 6:
                of3Var.f463754h = aVar2.k(intValue);
                return 0;
            case 7:
                of3Var.f463755i = aVar2.k(intValue);
                return 0;
            case 8:
                of3Var.f463756m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

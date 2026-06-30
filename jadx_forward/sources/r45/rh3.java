package r45;

/* loaded from: classes9.dex */
public class rh3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466397d;

    /* renamed from: e, reason: collision with root package name */
    public int f466398e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466399f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466400g;

    /* renamed from: h, reason: collision with root package name */
    public int f466401h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466402i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466403m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rh3)) {
            return false;
        }
        r45.rh3 rh3Var = (r45.rh3) fVar;
        return n51.f.a(this.f76492x92037252, rh3Var.f76492x92037252) && n51.f.a(this.f466397d, rh3Var.f466397d) && n51.f.a(java.lang.Integer.valueOf(this.f466398e), java.lang.Integer.valueOf(rh3Var.f466398e)) && n51.f.a(this.f466399f, rh3Var.f466399f) && n51.f.a(this.f466400g, rh3Var.f466400g) && n51.f.a(java.lang.Integer.valueOf(this.f466401h), java.lang.Integer.valueOf(rh3Var.f466401h)) && n51.f.a(this.f466402i, rh3Var.f466402i) && n51.f.a(this.f466403m, rh3Var.f466403m);
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
            java.lang.String str = this.f466397d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f466398e);
            java.lang.String str2 = this.f466399f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f466400g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f466401h);
            java.lang.String str4 = this.f466402i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f466403m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f466397d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int e17 = i18 + b36.f.e(3, this.f466398e);
            java.lang.String str7 = this.f466399f;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f466400g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            int e18 = e17 + b36.f.e(6, this.f466401h);
            java.lang.String str9 = this.f466402i;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f466403m;
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
        r45.rh3 rh3Var = (r45.rh3) objArr[1];
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
                    rh3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                rh3Var.f466397d = aVar2.k(intValue);
                return 0;
            case 3:
                rh3Var.f466398e = aVar2.g(intValue);
                return 0;
            case 4:
                rh3Var.f466399f = aVar2.k(intValue);
                return 0;
            case 5:
                rh3Var.f466400g = aVar2.k(intValue);
                return 0;
            case 6:
                rh3Var.f466401h = aVar2.g(intValue);
                return 0;
            case 7:
                rh3Var.f466402i = aVar2.k(intValue);
                return 0;
            case 8:
                rh3Var.f466403m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

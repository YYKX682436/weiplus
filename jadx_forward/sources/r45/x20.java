package r45;

/* loaded from: classes7.dex */
public class x20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471224e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471225f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471226g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471227h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471228i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x20)) {
            return false;
        }
        r45.x20 x20Var = (r45.x20) fVar;
        return n51.f.a(this.f76492x92037252, x20Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f471223d), java.lang.Integer.valueOf(x20Var.f471223d)) && n51.f.a(this.f471224e, x20Var.f471224e) && n51.f.a(this.f471225f, x20Var.f471225f) && n51.f.a(this.f471226g, x20Var.f471226g) && n51.f.a(this.f471227h, x20Var.f471227h) && n51.f.a(this.f471228i, x20Var.f471228i);
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
            fVar.e(2, this.f471223d);
            java.lang.String str = this.f471224e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f471225f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f471226g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f471227h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f471228i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471223d);
            java.lang.String str6 = this.f471224e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f471225f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f471226g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f471227h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f471228i;
            return str10 != null ? i18 + b36.f.j(7, str10) : i18;
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
        r45.x20 x20Var = (r45.x20) objArr[1];
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
                    x20Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                x20Var.f471223d = aVar2.g(intValue);
                return 0;
            case 3:
                x20Var.f471224e = aVar2.k(intValue);
                return 0;
            case 4:
                x20Var.f471225f = aVar2.k(intValue);
                return 0;
            case 5:
                x20Var.f471226g = aVar2.k(intValue);
                return 0;
            case 6:
                x20Var.f471227h = aVar2.k(intValue);
                return 0;
            case 7:
                x20Var.f471228i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

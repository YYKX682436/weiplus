package r45;

/* loaded from: classes9.dex */
public class bo0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452438d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452439e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452440f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452441g;

    /* renamed from: h, reason: collision with root package name */
    public int f452442h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452443i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452444m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bo0)) {
            return false;
        }
        r45.bo0 bo0Var = (r45.bo0) fVar;
        return n51.f.a(this.f76492x92037252, bo0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f452438d), java.lang.Integer.valueOf(bo0Var.f452438d)) && n51.f.a(this.f452439e, bo0Var.f452439e) && n51.f.a(this.f452440f, bo0Var.f452440f) && n51.f.a(this.f452441g, bo0Var.f452441g) && n51.f.a(java.lang.Integer.valueOf(this.f452442h), java.lang.Integer.valueOf(bo0Var.f452442h)) && n51.f.a(this.f452443i, bo0Var.f452443i) && n51.f.a(this.f452444m, bo0Var.f452444m);
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
            fVar.e(2, this.f452438d);
            java.lang.String str = this.f452439e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f452440f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f452441g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f452442h);
            java.lang.String str4 = this.f452443i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f452444m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452438d);
            java.lang.String str6 = this.f452439e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f452440f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f452441g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f452442h);
            java.lang.String str9 = this.f452443i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f452444m;
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
        r45.bo0 bo0Var = (r45.bo0) objArr[1];
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
                    bo0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                bo0Var.f452438d = aVar2.g(intValue);
                return 0;
            case 3:
                bo0Var.f452439e = aVar2.k(intValue);
                return 0;
            case 4:
                bo0Var.f452440f = aVar2.k(intValue);
                return 0;
            case 5:
                bo0Var.f452441g = aVar2.k(intValue);
                return 0;
            case 6:
                bo0Var.f452442h = aVar2.g(intValue);
                return 0;
            case 7:
                bo0Var.f452443i = aVar2.k(intValue);
                return 0;
            case 8:
                bo0Var.f452444m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

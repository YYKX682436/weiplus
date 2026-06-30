package r45;

/* loaded from: classes4.dex */
public class sz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467557d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467558e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467559f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467560g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467561h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467562i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e77 f467563m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sz)) {
            return false;
        }
        r45.sz szVar = (r45.sz) fVar;
        return n51.f.a(this.f76492x92037252, szVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467557d), java.lang.Integer.valueOf(szVar.f467557d)) && n51.f.a(this.f467558e, szVar.f467558e) && n51.f.a(this.f467559f, szVar.f467559f) && n51.f.a(this.f467560g, szVar.f467560g) && n51.f.a(this.f467561h, szVar.f467561h) && n51.f.a(this.f467562i, szVar.f467562i) && n51.f.a(this.f467563m, szVar.f467563m);
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
            fVar.e(2, this.f467557d);
            java.lang.String str = this.f467558e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f467559f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f467560g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f467561h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f467562i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.e77 e77Var = this.f467563m;
            if (e77Var != null) {
                fVar.i(8, e77Var.mo75928xcd1e8d8());
                this.f467563m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467557d);
            java.lang.String str6 = this.f467558e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f467559f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f467560g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f467561h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f467562i;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            r45.e77 e77Var2 = this.f467563m;
            return e77Var2 != null ? i18 + b36.f.i(8, e77Var2.mo75928xcd1e8d8()) : i18;
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
        r45.sz szVar = (r45.sz) objArr[1];
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
                    szVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                szVar.f467557d = aVar2.g(intValue);
                return 0;
            case 3:
                szVar.f467558e = aVar2.k(intValue);
                return 0;
            case 4:
                szVar.f467559f = aVar2.k(intValue);
                return 0;
            case 5:
                szVar.f467560g = aVar2.k(intValue);
                return 0;
            case 6:
                szVar.f467561h = aVar2.k(intValue);
                return 0;
            case 7:
                szVar.f467562i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e77 e77Var3 = new r45.e77();
                    if (bArr2 != null && bArr2.length > 0) {
                        e77Var3.mo11468x92b714fd(bArr2);
                    }
                    szVar.f467563m = e77Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

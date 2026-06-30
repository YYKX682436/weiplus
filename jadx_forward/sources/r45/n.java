package r45;

/* loaded from: classes9.dex */
public class n extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462493d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462494e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462495f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462496g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g0 f462497h;

    /* renamed from: i, reason: collision with root package name */
    public r45.a f462498i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n)) {
            return false;
        }
        r45.n nVar = (r45.n) fVar;
        return n51.f.a(this.f76492x92037252, nVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f462493d), java.lang.Integer.valueOf(nVar.f462493d)) && n51.f.a(this.f462494e, nVar.f462494e) && n51.f.a(this.f462495f, nVar.f462495f) && n51.f.a(this.f462496g, nVar.f462496g) && n51.f.a(this.f462497h, nVar.f462497h) && n51.f.a(this.f462498i, nVar.f462498i);
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
            fVar.e(2, this.f462493d);
            java.lang.String str = this.f462494e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f462495f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f462496g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.g0 g0Var = this.f462497h;
            if (g0Var != null) {
                fVar.i(7, g0Var.mo75928xcd1e8d8());
                this.f462497h.mo75956x3d5d1f78(fVar);
            }
            r45.a aVar = this.f462498i;
            if (aVar != null) {
                fVar.i(8, aVar.mo75928xcd1e8d8());
                this.f462498i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f462493d);
            java.lang.String str4 = this.f462494e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f462495f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f462496g;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            r45.g0 g0Var2 = this.f462497h;
            if (g0Var2 != null) {
                i18 += b36.f.i(7, g0Var2.mo75928xcd1e8d8());
            }
            r45.a aVar2 = this.f462498i;
            return aVar2 != null ? i18 + b36.f.i(8, aVar2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.n nVar = (r45.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    nVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                nVar.f462493d = aVar4.g(intValue);
                return 0;
            case 3:
                nVar.f462494e = aVar4.k(intValue);
                return 0;
            case 4:
                nVar.f462495f = aVar4.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                nVar.f462496g = aVar4.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g0 g0Var3 = new r45.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var3.mo11468x92b714fd(bArr2);
                    }
                    nVar.f462497h = g0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.mo11468x92b714fd(bArr3);
                    }
                    nVar.f462498i = aVar5;
                }
                return 0;
        }
    }
}

package r45;

/* loaded from: classes4.dex */
public class oz4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464158f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464159g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ka5 f464160h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f464161i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f464162m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oz4)) {
            return false;
        }
        r45.oz4 oz4Var = (r45.oz4) fVar;
        return n51.f.a(this.f76492x92037252, oz4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464156d), java.lang.Integer.valueOf(oz4Var.f464156d)) && n51.f.a(this.f464157e, oz4Var.f464157e) && n51.f.a(this.f464158f, oz4Var.f464158f) && n51.f.a(this.f464159g, oz4Var.f464159g) && n51.f.a(this.f464160h, oz4Var.f464160h) && n51.f.a(java.lang.Boolean.valueOf(this.f464161i), java.lang.Boolean.valueOf(oz4Var.f464161i)) && n51.f.a(java.lang.Boolean.valueOf(this.f464162m), java.lang.Boolean.valueOf(oz4Var.f464162m));
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
            fVar.e(2, this.f464156d);
            java.lang.String str = this.f464157e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f464158f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f464159g;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.ka5 ka5Var = this.f464160h;
            if (ka5Var != null) {
                fVar.i(8, ka5Var.mo75928xcd1e8d8());
                this.f464160h.mo75956x3d5d1f78(fVar);
            }
            fVar.a(9, this.f464161i);
            fVar.a(10, this.f464162m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464156d);
            java.lang.String str4 = this.f464157e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f464158f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f464159g;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            r45.ka5 ka5Var2 = this.f464160h;
            if (ka5Var2 != null) {
                i18 += b36.f.i(8, ka5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(9, this.f464161i) + b36.f.a(10, this.f464162m);
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
        r45.oz4 oz4Var = (r45.oz4) objArr[1];
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
                    oz4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                oz4Var.f464156d = aVar2.g(intValue);
                return 0;
            case 3:
                oz4Var.f464157e = aVar2.k(intValue);
                return 0;
            case 4:
                oz4Var.f464158f = aVar2.k(intValue);
                return 0;
            case 5:
            case 6:
            default:
                return -1;
            case 7:
                oz4Var.f464159g = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ka5 ka5Var3 = new r45.ka5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ka5Var3.mo11468x92b714fd(bArr2);
                    }
                    oz4Var.f464160h = ka5Var3;
                }
                return 0;
            case 9:
                oz4Var.f464161i = aVar2.c(intValue);
                return 0;
            case 10:
                oz4Var.f464162m = aVar2.c(intValue);
                return 0;
        }
    }
}

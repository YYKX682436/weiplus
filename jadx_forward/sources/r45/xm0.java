package r45;

/* loaded from: classes9.dex */
public class xm0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.an0 f471756d;

    /* renamed from: e, reason: collision with root package name */
    public r45.um0 f471757e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vm0 f471758f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471759g;

    /* renamed from: h, reason: collision with root package name */
    public int f471760h;

    /* renamed from: i, reason: collision with root package name */
    public int f471761i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471762m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f471763n;

    static {
        new r45.xm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm0)) {
            return false;
        }
        r45.xm0 xm0Var = (r45.xm0) fVar;
        return n51.f.a(this.f76492x92037252, xm0Var.f76492x92037252) && n51.f.a(this.f471756d, xm0Var.f471756d) && n51.f.a(this.f471757e, xm0Var.f471757e) && n51.f.a(this.f471758f, xm0Var.f471758f) && n51.f.a(this.f471759g, xm0Var.f471759g) && n51.f.a(java.lang.Integer.valueOf(this.f471760h), java.lang.Integer.valueOf(xm0Var.f471760h)) && n51.f.a(java.lang.Integer.valueOf(this.f471761i), java.lang.Integer.valueOf(xm0Var.f471761i)) && n51.f.a(this.f471762m, xm0Var.f471762m) && n51.f.a(java.lang.Boolean.valueOf(this.f471763n), java.lang.Boolean.valueOf(xm0Var.f471763n));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.xm0();
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
            r45.an0 an0Var = this.f471756d;
            if (an0Var != null) {
                fVar.i(2, an0Var.mo75928xcd1e8d8());
                this.f471756d.mo75956x3d5d1f78(fVar);
            }
            r45.um0 um0Var = this.f471757e;
            if (um0Var != null) {
                fVar.i(3, um0Var.mo75928xcd1e8d8());
                this.f471757e.mo75956x3d5d1f78(fVar);
            }
            r45.vm0 vm0Var = this.f471758f;
            if (vm0Var != null) {
                fVar.i(4, vm0Var.mo75928xcd1e8d8());
                this.f471758f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471759g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f471760h);
            fVar.e(7, this.f471761i);
            java.lang.String str2 = this.f471762m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.a(9, this.f471763n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.an0 an0Var2 = this.f471756d;
            if (an0Var2 != null) {
                i18 += b36.f.i(2, an0Var2.mo75928xcd1e8d8());
            }
            r45.um0 um0Var2 = this.f471757e;
            if (um0Var2 != null) {
                i18 += b36.f.i(3, um0Var2.mo75928xcd1e8d8());
            }
            r45.vm0 vm0Var2 = this.f471758f;
            if (vm0Var2 != null) {
                i18 += b36.f.i(4, vm0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f471759g;
            if (str3 != null) {
                i18 += b36.f.j(5, str3);
            }
            int e17 = i18 + b36.f.e(6, this.f471760h) + b36.f.e(7, this.f471761i);
            java.lang.String str4 = this.f471762m;
            if (str4 != null) {
                e17 += b36.f.j(8, str4);
            }
            return e17 + b36.f.a(9, this.f471763n);
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
                    this.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.an0 an0Var3 = new r45.an0();
                    if (bArr2 != null && bArr2.length > 0) {
                        an0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f471756d = an0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.um0 um0Var3 = new r45.um0();
                    if (bArr3 != null && bArr3.length > 0) {
                        um0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f471757e = um0Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.vm0 vm0Var3 = new r45.vm0();
                    if (bArr4 != null && bArr4.length > 0) {
                        vm0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f471758f = vm0Var3;
                }
                return 0;
            case 5:
                this.f471759g = aVar2.k(intValue);
                return 0;
            case 6:
                this.f471760h = aVar2.g(intValue);
                return 0;
            case 7:
                this.f471761i = aVar2.g(intValue);
                return 0;
            case 8:
                this.f471762m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f471763n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.xm0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}

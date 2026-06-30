package r45;

/* loaded from: classes8.dex */
public class ec5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454803g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f454804h;

    static {
        new r45.ec5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ec5)) {
            return false;
        }
        r45.ec5 ec5Var = (r45.ec5) fVar;
        return n51.f.a(this.f76492x92037252, ec5Var.f76492x92037252) && n51.f.a(this.f454800d, ec5Var.f454800d) && n51.f.a(this.f454801e, ec5Var.f454801e) && n51.f.a(this.f454802f, ec5Var.f454802f) && n51.f.a(this.f454803g, ec5Var.f454803g) && n51.f.a(this.f454804h, ec5Var.f454804h);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ec5();
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
            java.lang.String str = this.f454800d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f454801e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f454802f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f454803g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.cu5 cu5Var = this.f454804h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.mo75928xcd1e8d8());
                this.f454804h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f454800d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f454801e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f454802f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f454803g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            r45.cu5 cu5Var2 = this.f454804h;
            return cu5Var2 != null ? i18 + b36.f.i(6, cu5Var2.mo75928xcd1e8d8()) : i18;
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
                this.f454800d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f454801e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f454802f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f454803g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    this.f454804h = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ec5) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}

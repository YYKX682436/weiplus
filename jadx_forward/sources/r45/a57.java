package r45;

/* loaded from: classes7.dex */
public class a57 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.w47 f451275d;

    /* renamed from: e, reason: collision with root package name */
    public r45.m47 f451276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451277f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451278g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451279h;

    /* renamed from: i, reason: collision with root package name */
    public int f451280i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a57)) {
            return false;
        }
        r45.a57 a57Var = (r45.a57) fVar;
        return n51.f.a(this.f451275d, a57Var.f451275d) && n51.f.a(this.f451276e, a57Var.f451276e) && n51.f.a(this.f451277f, a57Var.f451277f) && n51.f.a(this.f451278g, a57Var.f451278g) && n51.f.a(this.f451279h, a57Var.f451279h) && n51.f.a(java.lang.Integer.valueOf(this.f451280i), java.lang.Integer.valueOf(a57Var.f451280i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.w47 w47Var = this.f451275d;
            if (w47Var != null) {
                fVar.i(1, w47Var.mo75928xcd1e8d8());
                this.f451275d.mo75956x3d5d1f78(fVar);
            }
            r45.m47 m47Var = this.f451276e;
            if (m47Var != null) {
                fVar.i(2, m47Var.mo75928xcd1e8d8());
                this.f451276e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f451277f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f451278g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f451279h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f451280i);
            return 0;
        }
        if (i17 == 1) {
            r45.w47 w47Var2 = this.f451275d;
            int i18 = w47Var2 != null ? 0 + b36.f.i(1, w47Var2.mo75928xcd1e8d8()) : 0;
            r45.m47 m47Var2 = this.f451276e;
            if (m47Var2 != null) {
                i18 += b36.f.i(2, m47Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f451277f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f451278g;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f451279h;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f451280i);
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
        r45.a57 a57Var = (r45.a57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.w47 w47Var3 = new r45.w47();
                    if (bArr != null && bArr.length > 0) {
                        w47Var3.mo11468x92b714fd(bArr);
                    }
                    a57Var.f451275d = w47Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.m47 m47Var3 = new r45.m47();
                    if (bArr2 != null && bArr2.length > 0) {
                        m47Var3.mo11468x92b714fd(bArr2);
                    }
                    a57Var.f451276e = m47Var3;
                }
                return 0;
            case 3:
                a57Var.f451277f = aVar2.k(intValue);
                return 0;
            case 4:
                a57Var.f451278g = aVar2.k(intValue);
                return 0;
            case 5:
                a57Var.f451279h = aVar2.k(intValue);
                return 0;
            case 6:
                a57Var.f451280i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

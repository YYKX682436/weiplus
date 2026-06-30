package r45;

/* loaded from: classes9.dex */
public class v20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469352d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469353e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469354f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r65 f469355g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469356h;

    /* renamed from: i, reason: collision with root package name */
    public r45.co6 f469357i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v20)) {
            return false;
        }
        r45.v20 v20Var = (r45.v20) fVar;
        return n51.f.a(this.f76492x92037252, v20Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469352d), java.lang.Integer.valueOf(v20Var.f469352d)) && n51.f.a(this.f469353e, v20Var.f469353e) && n51.f.a(this.f469354f, v20Var.f469354f) && n51.f.a(this.f469355g, v20Var.f469355g) && n51.f.a(this.f469356h, v20Var.f469356h) && n51.f.a(this.f469357i, v20Var.f469357i);
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
            fVar.e(2, this.f469352d);
            java.lang.String str = this.f469353e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f469354f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r65 r65Var = this.f469355g;
            if (r65Var != null) {
                fVar.i(5, r65Var.mo75928xcd1e8d8());
                this.f469355g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f469356h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.co6 co6Var = this.f469357i;
            if (co6Var != null) {
                fVar.i(7, co6Var.mo75928xcd1e8d8());
                this.f469357i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469352d);
            java.lang.String str4 = this.f469353e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f469354f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            r45.r65 r65Var2 = this.f469355g;
            if (r65Var2 != null) {
                i18 += b36.f.i(5, r65Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f469356h;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            r45.co6 co6Var2 = this.f469357i;
            return co6Var2 != null ? i18 + b36.f.i(7, co6Var2.mo75928xcd1e8d8()) : i18;
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
        r45.v20 v20Var = (r45.v20) objArr[1];
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
                    v20Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                v20Var.f469352d = aVar2.g(intValue);
                return 0;
            case 3:
                v20Var.f469353e = aVar2.k(intValue);
                return 0;
            case 4:
                v20Var.f469354f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r65 r65Var3 = new r45.r65();
                    if (bArr2 != null && bArr2.length > 0) {
                        r65Var3.mo11468x92b714fd(bArr2);
                    }
                    v20Var.f469355g = r65Var3;
                }
                return 0;
            case 6:
                v20Var.f469356h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.co6 co6Var3 = new r45.co6();
                    if (bArr3 != null && bArr3.length > 0) {
                        co6Var3.mo11468x92b714fd(bArr3);
                    }
                    v20Var.f469357i = co6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

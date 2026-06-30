package r45;

/* loaded from: classes9.dex */
public class s55 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467053d;

    /* renamed from: e, reason: collision with root package name */
    public int f467054e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467055f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467056g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467057h;

    /* renamed from: i, reason: collision with root package name */
    public r45.v67 f467058i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s55)) {
            return false;
        }
        r45.s55 s55Var = (r45.s55) fVar;
        return n51.f.a(this.f76492x92037252, s55Var.f76492x92037252) && n51.f.a(this.f467053d, s55Var.f467053d) && n51.f.a(java.lang.Integer.valueOf(this.f467054e), java.lang.Integer.valueOf(s55Var.f467054e)) && n51.f.a(this.f467055f, s55Var.f467055f) && n51.f.a(this.f467056g, s55Var.f467056g) && n51.f.a(this.f467057h, s55Var.f467057h) && n51.f.a(this.f467058i, s55Var.f467058i);
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
            java.lang.String str = this.f467053d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f467054e);
            java.lang.String str2 = this.f467055f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f467056g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f467057h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.v67 v67Var = this.f467058i;
            if (v67Var != null) {
                fVar.i(7, v67Var.mo75928xcd1e8d8());
                this.f467058i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f467053d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f467054e);
            java.lang.String str6 = this.f467055f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f467056g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f467057h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            r45.v67 v67Var2 = this.f467058i;
            return v67Var2 != null ? e17 + b36.f.i(7, v67Var2.mo75928xcd1e8d8()) : e17;
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
        r45.s55 s55Var = (r45.s55) objArr[1];
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
                    s55Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                s55Var.f467053d = aVar2.k(intValue);
                return 0;
            case 3:
                s55Var.f467054e = aVar2.g(intValue);
                return 0;
            case 4:
                s55Var.f467055f = aVar2.k(intValue);
                return 0;
            case 5:
                s55Var.f467056g = aVar2.k(intValue);
                return 0;
            case 6:
                s55Var.f467057h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.v67 v67Var3 = new r45.v67();
                    if (bArr2 != null && bArr2.length > 0) {
                        v67Var3.mo11468x92b714fd(bArr2);
                    }
                    s55Var.f467058i = v67Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

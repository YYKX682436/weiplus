package r45;

/* loaded from: classes8.dex */
public class ic5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nl4 f458463d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458464e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458465f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ka7 f458466g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f04 f458467h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ic5)) {
            return false;
        }
        r45.ic5 ic5Var = (r45.ic5) fVar;
        return n51.f.a(this.f76492x92037252, ic5Var.f76492x92037252) && n51.f.a(this.f458463d, ic5Var.f458463d) && n51.f.a(this.f458464e, ic5Var.f458464e) && n51.f.a(this.f458465f, ic5Var.f458465f) && n51.f.a(this.f458466g, ic5Var.f458466g) && n51.f.a(this.f458467h, ic5Var.f458467h);
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
            r45.nl4 nl4Var = this.f458463d;
            if (nl4Var != null) {
                fVar.i(2, nl4Var.mo75928xcd1e8d8());
                this.f458463d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f458464e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f458465f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.ka7 ka7Var = this.f458466g;
            if (ka7Var != null) {
                fVar.i(5, ka7Var.mo75928xcd1e8d8());
                this.f458466g.mo75956x3d5d1f78(fVar);
            }
            r45.f04 f04Var = this.f458467h;
            if (f04Var != null) {
                fVar.i(100, f04Var.mo75928xcd1e8d8());
                this.f458467h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.nl4 nl4Var2 = this.f458463d;
            if (nl4Var2 != null) {
                i18 += b36.f.i(2, nl4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f458464e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f458465f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.ka7 ka7Var2 = this.f458466g;
            if (ka7Var2 != null) {
                i18 += b36.f.i(5, ka7Var2.mo75928xcd1e8d8());
            }
            r45.f04 f04Var2 = this.f458467h;
            return f04Var2 != null ? i18 + b36.f.i(100, f04Var2.mo75928xcd1e8d8()) : i18;
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
        r45.ic5 ic5Var = (r45.ic5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                ic5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nl4 nl4Var3 = new r45.nl4();
                if (bArr2 != null && bArr2.length > 0) {
                    nl4Var3.mo11468x92b714fd(bArr2);
                }
                ic5Var.f458463d = nl4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            ic5Var.f458464e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ic5Var.f458465f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.ka7 ka7Var3 = new r45.ka7();
                if (bArr3 != null && bArr3.length > 0) {
                    ka7Var3.mo11468x92b714fd(bArr3);
                }
                ic5Var.f458466g = ka7Var3;
            }
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.f04 f04Var3 = new r45.f04();
            if (bArr4 != null && bArr4.length > 0) {
                f04Var3.mo11468x92b714fd(bArr4);
            }
            ic5Var.f458467h = f04Var3;
        }
        return 0;
    }
}

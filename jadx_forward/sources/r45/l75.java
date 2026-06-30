package r45;

/* loaded from: classes8.dex */
public class l75 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f460730d;

    /* renamed from: e, reason: collision with root package name */
    public int f460731e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460732f;

    /* renamed from: g, reason: collision with root package name */
    public int f460733g;

    /* renamed from: h, reason: collision with root package name */
    public int f460734h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460735i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l75)) {
            return false;
        }
        r45.l75 l75Var = (r45.l75) fVar;
        return n51.f.a(this.f76492x92037252, l75Var.f76492x92037252) && n51.f.a(this.f460730d, l75Var.f460730d) && n51.f.a(java.lang.Integer.valueOf(this.f460731e), java.lang.Integer.valueOf(l75Var.f460731e)) && n51.f.a(this.f460732f, l75Var.f460732f) && n51.f.a(java.lang.Integer.valueOf(this.f460733g), java.lang.Integer.valueOf(l75Var.f460733g)) && n51.f.a(java.lang.Integer.valueOf(this.f460734h), java.lang.Integer.valueOf(l75Var.f460734h)) && n51.f.a(this.f460735i, l75Var.f460735i);
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
            r45.cu5 cu5Var = this.f460730d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f460730d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f460731e);
            java.lang.String str = this.f460732f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f460733g);
            fVar.e(6, this.f460734h);
            java.lang.String str2 = this.f460735i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f460730d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f460731e);
            java.lang.String str3 = this.f460732f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f460733g) + b36.f.e(6, this.f460734h);
            java.lang.String str4 = this.f460735i;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.l75 l75Var = (r45.l75) objArr[1];
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
                    l75Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    l75Var.f460730d = cu5Var3;
                }
                return 0;
            case 3:
                l75Var.f460731e = aVar2.g(intValue);
                return 0;
            case 4:
                l75Var.f460732f = aVar2.k(intValue);
                return 0;
            case 5:
                l75Var.f460733g = aVar2.g(intValue);
                return 0;
            case 6:
                l75Var.f460734h = aVar2.g(intValue);
                return 0;
            case 7:
                l75Var.f460735i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

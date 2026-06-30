package r45;

/* loaded from: classes4.dex */
public class j86 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f459181d;

    /* renamed from: e, reason: collision with root package name */
    public int f459182e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f459183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459184g;

    /* renamed from: h, reason: collision with root package name */
    public int f459185h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j86)) {
            return false;
        }
        r45.j86 j86Var = (r45.j86) fVar;
        return n51.f.a(this.f76492x92037252, j86Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f459181d), java.lang.Integer.valueOf(j86Var.f459181d)) && n51.f.a(java.lang.Integer.valueOf(this.f459182e), java.lang.Integer.valueOf(j86Var.f459182e)) && n51.f.a(this.f459183f, j86Var.f459183f) && n51.f.a(this.f459184g, j86Var.f459184g) && n51.f.a(java.lang.Integer.valueOf(this.f459185h), java.lang.Integer.valueOf(j86Var.f459185h));
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
            fVar.e(2, this.f459181d);
            fVar.e(3, this.f459182e);
            r45.cu5 cu5Var = this.f459183f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f459183f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f459184g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f459185h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f459181d) + b36.f.e(3, this.f459182e);
            r45.cu5 cu5Var2 = this.f459183f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f459184g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f459185h);
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
        r45.j86 j86Var = (r45.j86) objArr[1];
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
                    j86Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                j86Var.f459181d = aVar2.g(intValue);
                return 0;
            case 3:
                j86Var.f459182e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    j86Var.f459183f = cu5Var3;
                }
                return 0;
            case 5:
                j86Var.f459184g = aVar2.k(intValue);
                return 0;
            case 6:
                j86Var.f459185h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes2.dex */
public class vr0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469987d;

    /* renamed from: e, reason: collision with root package name */
    public int f469988e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469989f;

    /* renamed from: g, reason: collision with root package name */
    public int f469990g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469991h;

    /* renamed from: i, reason: collision with root package name */
    public r45.j32 f469992i;

    /* renamed from: m, reason: collision with root package name */
    public int f469993m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vr0)) {
            return false;
        }
        r45.vr0 vr0Var = (r45.vr0) fVar;
        return n51.f.a(this.f76492x92037252, vr0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469987d), java.lang.Integer.valueOf(vr0Var.f469987d)) && n51.f.a(java.lang.Integer.valueOf(this.f469988e), java.lang.Integer.valueOf(vr0Var.f469988e)) && n51.f.a(this.f469989f, vr0Var.f469989f) && n51.f.a(java.lang.Integer.valueOf(this.f469990g), java.lang.Integer.valueOf(vr0Var.f469990g)) && n51.f.a(this.f469991h, vr0Var.f469991h) && n51.f.a(this.f469992i, vr0Var.f469992i) && n51.f.a(java.lang.Integer.valueOf(this.f469993m), java.lang.Integer.valueOf(vr0Var.f469993m));
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
            fVar.e(2, this.f469987d);
            fVar.e(3, this.f469988e);
            java.lang.String str = this.f469989f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f469990g);
            java.lang.String str2 = this.f469991h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.j32 j32Var = this.f469992i;
            if (j32Var != null) {
                fVar.i(7, j32Var.mo75928xcd1e8d8());
                this.f469992i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(16, this.f469993m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469987d) + b36.f.e(3, this.f469988e);
            java.lang.String str3 = this.f469989f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f469990g);
            java.lang.String str4 = this.f469991h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            r45.j32 j32Var2 = this.f469992i;
            if (j32Var2 != null) {
                e17 += b36.f.i(7, j32Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(16, this.f469993m);
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
        r45.vr0 vr0Var = (r45.vr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 16) {
            vr0Var.f469993m = aVar2.g(intValue);
            return 0;
        }
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
                    vr0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                vr0Var.f469987d = aVar2.g(intValue);
                return 0;
            case 3:
                vr0Var.f469988e = aVar2.g(intValue);
                return 0;
            case 4:
                vr0Var.f469989f = aVar2.k(intValue);
                return 0;
            case 5:
                vr0Var.f469990g = aVar2.g(intValue);
                return 0;
            case 6:
                vr0Var.f469991h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr2 != null && bArr2.length > 0) {
                        j32Var3.mo11468x92b714fd(bArr2);
                    }
                    vr0Var.f469992i = j32Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

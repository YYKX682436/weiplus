package r45;

/* loaded from: classes2.dex */
public class bz3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452705d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452706e;

    /* renamed from: f, reason: collision with root package name */
    public float f452707f;

    /* renamed from: g, reason: collision with root package name */
    public float f452708g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cg0 f452709h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452710i;

    /* renamed from: m, reason: collision with root package name */
    public float f452711m;

    /* renamed from: n, reason: collision with root package name */
    public float f452712n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz3)) {
            return false;
        }
        r45.bz3 bz3Var = (r45.bz3) fVar;
        return n51.f.a(this.f452705d, bz3Var.f452705d) && n51.f.a(this.f452706e, bz3Var.f452706e) && n51.f.a(java.lang.Float.valueOf(this.f452707f), java.lang.Float.valueOf(bz3Var.f452707f)) && n51.f.a(java.lang.Float.valueOf(this.f452708g), java.lang.Float.valueOf(bz3Var.f452708g)) && n51.f.a(this.f452709h, bz3Var.f452709h) && n51.f.a(this.f452710i, bz3Var.f452710i) && n51.f.a(java.lang.Float.valueOf(this.f452711m), java.lang.Float.valueOf(bz3Var.f452711m)) && n51.f.a(java.lang.Float.valueOf(this.f452712n), java.lang.Float.valueOf(bz3Var.f452712n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452705d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452706e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f452707f);
            fVar.d(4, this.f452708g);
            r45.cg0 cg0Var = this.f452709h;
            if (cg0Var != null) {
                fVar.i(6, cg0Var.mo75928xcd1e8d8());
                this.f452709h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f452710i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.d(8, this.f452711m);
            fVar.d(9, this.f452712n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f452705d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f452706e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int d17 = j17 + b36.f.d(3, this.f452707f) + b36.f.d(4, this.f452708g);
            r45.cg0 cg0Var2 = this.f452709h;
            if (cg0Var2 != null) {
                d17 += b36.f.i(6, cg0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f452710i;
            if (str6 != null) {
                d17 += b36.f.j(7, str6);
            }
            return d17 + b36.f.d(8, this.f452711m) + b36.f.d(9, this.f452712n);
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
        r45.bz3 bz3Var = (r45.bz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bz3Var.f452705d = aVar2.k(intValue);
                return 0;
            case 2:
                bz3Var.f452706e = aVar2.k(intValue);
                return 0;
            case 3:
                bz3Var.f452707f = aVar2.f(intValue);
                return 0;
            case 4:
                bz3Var.f452708g = aVar2.f(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cg0 cg0Var3 = new r45.cg0();
                    if (bArr != null && bArr.length > 0) {
                        cg0Var3.mo11468x92b714fd(bArr);
                    }
                    bz3Var.f452709h = cg0Var3;
                }
                return 0;
            case 7:
                bz3Var.f452710i = aVar2.k(intValue);
                return 0;
            case 8:
                bz3Var.f452711m = aVar2.f(intValue);
                return 0;
            case 9:
                bz3Var.f452712n = aVar2.f(intValue);
                return 0;
        }
    }
}

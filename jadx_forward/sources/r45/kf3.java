package r45;

/* loaded from: classes9.dex */
public class kf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f460178d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460179e;

    /* renamed from: f, reason: collision with root package name */
    public int f460180f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f460181g;

    /* renamed from: h, reason: collision with root package name */
    public int f460182h;

    /* renamed from: i, reason: collision with root package name */
    public r45.il6 f460183i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f460184m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f460185n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kf3)) {
            return false;
        }
        r45.kf3 kf3Var = (r45.kf3) fVar;
        return n51.f.a(this.f76492x92037252, kf3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f460178d), java.lang.Integer.valueOf(kf3Var.f460178d)) && n51.f.a(this.f460179e, kf3Var.f460179e) && n51.f.a(java.lang.Integer.valueOf(this.f460180f), java.lang.Integer.valueOf(kf3Var.f460180f)) && n51.f.a(java.lang.Boolean.valueOf(this.f460181g), java.lang.Boolean.valueOf(kf3Var.f460181g)) && n51.f.a(java.lang.Integer.valueOf(this.f460182h), java.lang.Integer.valueOf(kf3Var.f460182h)) && n51.f.a(this.f460183i, kf3Var.f460183i) && n51.f.a(java.lang.Boolean.valueOf(this.f460184m), java.lang.Boolean.valueOf(kf3Var.f460184m)) && n51.f.a(java.lang.Boolean.valueOf(this.f460185n), java.lang.Boolean.valueOf(kf3Var.f460185n));
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
            fVar.e(2, this.f460178d);
            java.lang.String str = this.f460179e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f460180f);
            fVar.a(5, this.f460181g);
            fVar.e(6, this.f460182h);
            r45.il6 il6Var = this.f460183i;
            if (il6Var != null) {
                fVar.i(7, il6Var.mo75928xcd1e8d8());
                this.f460183i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f460184m);
            fVar.a(9, this.f460185n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460178d);
            java.lang.String str2 = this.f460179e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f460180f) + b36.f.a(5, this.f460181g) + b36.f.e(6, this.f460182h);
            r45.il6 il6Var2 = this.f460183i;
            if (il6Var2 != null) {
                e17 += b36.f.i(7, il6Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.a(8, this.f460184m) + b36.f.a(9, this.f460185n);
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
        r45.kf3 kf3Var = (r45.kf3) objArr[1];
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
                    kf3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                kf3Var.f460178d = aVar2.g(intValue);
                return 0;
            case 3:
                kf3Var.f460179e = aVar2.k(intValue);
                return 0;
            case 4:
                kf3Var.f460180f = aVar2.g(intValue);
                return 0;
            case 5:
                kf3Var.f460181g = aVar2.c(intValue);
                return 0;
            case 6:
                kf3Var.f460182h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.il6 il6Var3 = new r45.il6();
                    if (bArr2 != null && bArr2.length > 0) {
                        il6Var3.mo11468x92b714fd(bArr2);
                    }
                    kf3Var.f460183i = il6Var3;
                }
                return 0;
            case 8:
                kf3Var.f460184m = aVar2.c(intValue);
                return 0;
            case 9:
                kf3Var.f460185n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

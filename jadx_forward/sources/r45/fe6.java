package r45;

/* loaded from: classes4.dex */
public class fe6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455791d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455792e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455793f;

    /* renamed from: g, reason: collision with root package name */
    public int f455794g;

    /* renamed from: h, reason: collision with root package name */
    public int f455795h;

    /* renamed from: i, reason: collision with root package name */
    public r45.oi0 f455796i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ni0 f455797m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fe6)) {
            return false;
        }
        r45.fe6 fe6Var = (r45.fe6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455791d), java.lang.Integer.valueOf(fe6Var.f455791d)) && n51.f.a(this.f455792e, fe6Var.f455792e) && n51.f.a(this.f455793f, fe6Var.f455793f) && n51.f.a(java.lang.Integer.valueOf(this.f455794g), java.lang.Integer.valueOf(fe6Var.f455794g)) && n51.f.a(java.lang.Integer.valueOf(this.f455795h), java.lang.Integer.valueOf(fe6Var.f455795h)) && n51.f.a(this.f455796i, fe6Var.f455796i) && n51.f.a(this.f455797m, fe6Var.f455797m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455791d);
            java.lang.String str = this.f455792e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455793f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f455794g);
            fVar.e(5, this.f455795h);
            r45.oi0 oi0Var = this.f455796i;
            if (oi0Var != null) {
                fVar.i(6, oi0Var.mo75928xcd1e8d8());
                this.f455796i.mo75956x3d5d1f78(fVar);
            }
            r45.ni0 ni0Var = this.f455797m;
            if (ni0Var != null) {
                fVar.i(7, ni0Var.mo75928xcd1e8d8());
                this.f455797m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455791d) + 0;
            java.lang.String str2 = this.f455792e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455793f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            int e18 = e17 + b36.f.e(4, this.f455794g) + b36.f.e(5, this.f455795h);
            r45.oi0 oi0Var2 = this.f455796i;
            if (oi0Var2 != null) {
                e18 += b36.f.i(6, oi0Var2.mo75928xcd1e8d8());
            }
            r45.ni0 ni0Var2 = this.f455797m;
            return ni0Var2 != null ? e18 + b36.f.i(7, ni0Var2.mo75928xcd1e8d8()) : e18;
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
        r45.fe6 fe6Var = (r45.fe6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fe6Var.f455791d = aVar2.g(intValue);
                return 0;
            case 2:
                fe6Var.f455792e = aVar2.k(intValue);
                return 0;
            case 3:
                fe6Var.f455793f = aVar2.d(intValue);
                return 0;
            case 4:
                fe6Var.f455794g = aVar2.g(intValue);
                return 0;
            case 5:
                fe6Var.f455795h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.oi0 oi0Var3 = new r45.oi0();
                    if (bArr != null && bArr.length > 0) {
                        oi0Var3.mo11468x92b714fd(bArr);
                    }
                    fe6Var.f455796i = oi0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.ni0 ni0Var3 = new r45.ni0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ni0Var3.mo11468x92b714fd(bArr2);
                    }
                    fe6Var.f455797m = ni0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

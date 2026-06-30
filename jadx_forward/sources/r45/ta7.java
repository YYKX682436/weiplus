package r45;

/* loaded from: classes8.dex */
public class ta7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467793e;

    /* renamed from: f, reason: collision with root package name */
    public int f467794f;

    /* renamed from: g, reason: collision with root package name */
    public int f467795g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wa7 f467796h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta7)) {
            return false;
        }
        r45.ta7 ta7Var = (r45.ta7) fVar;
        return n51.f.a(this.f467792d, ta7Var.f467792d) && n51.f.a(this.f467793e, ta7Var.f467793e) && n51.f.a(java.lang.Integer.valueOf(this.f467794f), java.lang.Integer.valueOf(ta7Var.f467794f)) && n51.f.a(java.lang.Integer.valueOf(this.f467795g), java.lang.Integer.valueOf(ta7Var.f467795g)) && n51.f.a(this.f467796h, ta7Var.f467796h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467792d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467793e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f467794f);
            fVar.e(4, this.f467795g);
            r45.wa7 wa7Var = this.f467796h;
            if (wa7Var != null) {
                fVar.i(5, wa7Var.mo75928xcd1e8d8());
                this.f467796h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467792d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f467793e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int e17 = j17 + b36.f.e(3, this.f467794f) + b36.f.e(4, this.f467795g);
            r45.wa7 wa7Var2 = this.f467796h;
            return wa7Var2 != null ? e17 + b36.f.i(5, wa7Var2.mo75928xcd1e8d8()) : e17;
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
        r45.ta7 ta7Var = (r45.ta7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ta7Var.f467792d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ta7Var.f467793e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ta7Var.f467794f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ta7Var.f467795g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.wa7 wa7Var3 = new r45.wa7();
            if (bArr != null && bArr.length > 0) {
                wa7Var3.mo11468x92b714fd(bArr);
            }
            ta7Var.f467796h = wa7Var3;
        }
        return 0;
    }
}

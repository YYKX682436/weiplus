package r45;

/* loaded from: classes8.dex */
public class t15 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f467597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467598e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oo0 f467599f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t15)) {
            return false;
        }
        r45.t15 t15Var = (r45.t15) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f467597d), java.lang.Boolean.valueOf(t15Var.f467597d)) && n51.f.a(this.f467598e, t15Var.f467598e) && n51.f.a(this.f467599f, t15Var.f467599f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f467597d);
            java.lang.String str = this.f467598e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.oo0 oo0Var = this.f467599f;
            if (oo0Var != null) {
                fVar.i(3, oo0Var.mo75928xcd1e8d8());
                this.f467599f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f467597d) + 0;
            java.lang.String str2 = this.f467598e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            r45.oo0 oo0Var2 = this.f467599f;
            return oo0Var2 != null ? a17 + b36.f.i(3, oo0Var2.mo75928xcd1e8d8()) : a17;
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
        r45.t15 t15Var = (r45.t15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t15Var.f467597d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            t15Var.f467598e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.oo0 oo0Var3 = new r45.oo0();
            if (bArr != null && bArr.length > 0) {
                oo0Var3.mo11468x92b714fd(bArr);
            }
            t15Var.f467599f = oo0Var3;
        }
        return 0;
    }
}

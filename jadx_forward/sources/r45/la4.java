package r45;

/* loaded from: classes4.dex */
public class la4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ka4 f460806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460809g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.la4)) {
            return false;
        }
        r45.la4 la4Var = (r45.la4) fVar;
        return n51.f.a(this.f460806d, la4Var.f460806d) && n51.f.a(this.f460807e, la4Var.f460807e) && n51.f.a(this.f460808f, la4Var.f460808f) && n51.f.a(this.f460809g, la4Var.f460809g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ka4 ka4Var = this.f460806d;
            if (ka4Var != null) {
                fVar.i(1, ka4Var.mo75928xcd1e8d8());
                this.f460806d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460807e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460808f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460809g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ka4 ka4Var2 = this.f460806d;
            int i18 = ka4Var2 != null ? 0 + b36.f.i(1, ka4Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f460807e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f460808f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f460809g;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.la4 la4Var = (r45.la4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                la4Var.f460807e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                la4Var.f460808f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            la4Var.f460809g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ka4 ka4Var3 = new r45.ka4();
            if (bArr != null && bArr.length > 0) {
                ka4Var3.mo11468x92b714fd(bArr);
            }
            la4Var.f460806d = ka4Var3;
        }
        return 0;
    }
}

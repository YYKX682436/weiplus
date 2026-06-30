package r45;

/* loaded from: classes4.dex */
public class t0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467576d;

    /* renamed from: e, reason: collision with root package name */
    public int f467577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467578f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t0)) {
            return false;
        }
        r45.t0 t0Var = (r45.t0) fVar;
        return n51.f.a(this.f76492x92037252, t0Var.f76492x92037252) && n51.f.a(this.f467576d, t0Var.f467576d) && n51.f.a(java.lang.Integer.valueOf(this.f467577e), java.lang.Integer.valueOf(t0Var.f467577e)) && n51.f.a(this.f467578f, t0Var.f467578f);
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
            java.lang.String str = this.f467576d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f467577e);
            java.lang.String str2 = this.f467578f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f467576d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f467577e);
            java.lang.String str4 = this.f467578f;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.t0 t0Var = (r45.t0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                t0Var.f467576d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                t0Var.f467577e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            t0Var.f467578f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            t0Var.f76492x92037252 = ieVar3;
        }
        return 0;
    }
}

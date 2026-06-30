package r45;

/* loaded from: classes8.dex */
public class w55 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470433e;

    /* renamed from: f, reason: collision with root package name */
    public int f470434f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470435g;

    /* renamed from: h, reason: collision with root package name */
    public r45.r1 f470436h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w55)) {
            return false;
        }
        r45.w55 w55Var = (r45.w55) fVar;
        return n51.f.a(this.f76494x2de60e5e, w55Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f470432d), java.lang.Integer.valueOf(w55Var.f470432d)) && n51.f.a(this.f470433e, w55Var.f470433e) && n51.f.a(java.lang.Integer.valueOf(this.f470434f), java.lang.Integer.valueOf(w55Var.f470434f)) && n51.f.a(this.f470435g, w55Var.f470435g) && n51.f.a(this.f470436h, w55Var.f470436h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f470432d);
            java.lang.String str = this.f470433e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f470434f);
            java.lang.String str2 = this.f470435g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.r1 r1Var = this.f470436h;
            if (r1Var != null) {
                fVar.i(6, r1Var.mo75928xcd1e8d8());
                this.f470436h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470432d);
            java.lang.String str3 = this.f470433e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f470434f);
            java.lang.String str4 = this.f470435g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.r1 r1Var2 = this.f470436h;
            return r1Var2 != null ? e17 + b36.f.i(6, r1Var2.mo75928xcd1e8d8()) : e17;
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
        r45.w55 w55Var = (r45.w55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    w55Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                w55Var.f470432d = aVar2.g(intValue);
                return 0;
            case 3:
                w55Var.f470433e = aVar2.k(intValue);
                return 0;
            case 4:
                w55Var.f470434f = aVar2.g(intValue);
                return 0;
            case 5:
                w55Var.f470435g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr2 != null && bArr2.length > 0) {
                        r1Var3.mo11468x92b714fd(bArr2);
                    }
                    w55Var.f470436h = r1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

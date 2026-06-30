package r45;

/* loaded from: classes2.dex */
public class nl3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463015d;

    /* renamed from: e, reason: collision with root package name */
    public int f463016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463017f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nl3)) {
            return false;
        }
        r45.nl3 nl3Var = (r45.nl3) fVar;
        return n51.f.a(this.f76494x2de60e5e, nl3Var.f76494x2de60e5e) && n51.f.a(this.f463015d, nl3Var.f463015d) && n51.f.a(java.lang.Integer.valueOf(this.f463016e), java.lang.Integer.valueOf(nl3Var.f463016e)) && n51.f.a(this.f463017f, nl3Var.f463017f);
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
            java.lang.String str = this.f463015d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f463016e);
            java.lang.String str2 = this.f463017f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f463015d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f463016e);
            java.lang.String str4 = this.f463017f;
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
        r45.nl3 nl3Var = (r45.nl3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                nl3Var.f463015d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                nl3Var.f463016e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            nl3Var.f463017f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.mo11468x92b714fd(bArr);
            }
            nl3Var.f76494x2de60e5e = heVar3;
        }
        return 0;
    }
}

package r45;

/* loaded from: classes2.dex */
public class se4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467187d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467188e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.se4)) {
            return false;
        }
        r45.se4 se4Var = (r45.se4) fVar;
        return n51.f.a(this.f76494x2de60e5e, se4Var.f76494x2de60e5e) && n51.f.a(this.f467187d, se4Var.f467187d) && n51.f.a(this.f467188e, se4Var.f467188e);
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
            java.lang.String str = this.f467187d;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f467188e;
            if (str2 != null) {
                fVar.j(20, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f467187d;
            if (str3 != null) {
                i18 += b36.f.j(10, str3);
            }
            java.lang.String str4 = this.f467188e;
            return str4 != null ? i18 + b36.f.j(20, str4) : i18;
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
        r45.se4 se4Var = (r45.se4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 10) {
                se4Var.f467187d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 20) {
                return -1;
            }
            se4Var.f467188e = aVar2.k(intValue);
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
            se4Var.f76494x2de60e5e = heVar3;
        }
        return 0;
    }
}

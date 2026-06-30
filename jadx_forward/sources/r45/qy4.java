package r45;

/* loaded from: classes2.dex */
public class qy4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465886d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465887e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465888f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qy4)) {
            return false;
        }
        r45.qy4 qy4Var = (r45.qy4) fVar;
        return n51.f.a(this.f76494x2de60e5e, qy4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f465886d), java.lang.Integer.valueOf(qy4Var.f465886d)) && n51.f.a(this.f465887e, qy4Var.f465887e) && n51.f.a(this.f465888f, qy4Var.f465888f);
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
            fVar.e(2, this.f465886d);
            java.lang.String str = this.f465887e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465888f;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465886d);
            java.lang.String str3 = this.f465887e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f465888f;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.qy4 qy4Var = (r45.qy4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                qy4Var.f465886d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                qy4Var.f465887e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            qy4Var.f465888f = aVar2.k(intValue);
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
            qy4Var.f76494x2de60e5e = heVar3;
        }
        return 0;
    }
}

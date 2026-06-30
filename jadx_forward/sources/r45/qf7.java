package r45;

/* loaded from: classes4.dex */
public class qf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f465489d;

    /* renamed from: e, reason: collision with root package name */
    public int f465490e;

    /* renamed from: f, reason: collision with root package name */
    public int f465491f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf7)) {
            return false;
        }
        r45.qf7 qf7Var = (r45.qf7) fVar;
        return n51.f.a(this.f465489d, qf7Var.f465489d) && n51.f.a(java.lang.Integer.valueOf(this.f465490e), java.lang.Integer.valueOf(qf7Var.f465490e)) && n51.f.a(java.lang.Integer.valueOf(this.f465491f), java.lang.Integer.valueOf(qf7Var.f465491f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f465489d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.mo75928xcd1e8d8());
                this.f465489d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465490e);
            fVar.e(3, this.f465491f);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f465489d;
            return (cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465490e) + b36.f.e(3, this.f465491f);
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
        r45.qf7 qf7Var = (r45.qf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                qf7Var.f465490e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            qf7Var.f465491f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr != null && bArr.length > 0) {
                cf7Var3.mo11468x92b714fd(bArr);
            }
            qf7Var.f465489d = cf7Var3;
        }
        return 0;
    }
}

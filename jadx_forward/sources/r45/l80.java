package r45;

/* loaded from: classes4.dex */
public class l80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460752d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460754f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l80)) {
            return false;
        }
        r45.l80 l80Var = (r45.l80) fVar;
        return n51.f.a(this.f76494x2de60e5e, l80Var.f76494x2de60e5e) && n51.f.a(this.f460752d, l80Var.f460752d) && n51.f.a(this.f460753e, l80Var.f460753e) && n51.f.a(this.f460754f, l80Var.f460754f);
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
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f460752d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f460753e;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            java.lang.String str = this.f460754f;
            if (str != null) {
                fVar.j(101, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f460752d;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f460753e;
            if (gVar4 != null) {
                i18 += b36.f.b(3, gVar4);
            }
            java.lang.String str2 = this.f460754f;
            return str2 != null ? i18 + b36.f.j(101, str2) : i18;
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
        r45.l80 l80Var = (r45.l80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                l80Var.f460752d = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 3) {
                l80Var.f460753e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 101) {
                return -1;
            }
            l80Var.f460754f = aVar2.k(intValue);
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
            l80Var.f76494x2de60e5e = heVar3;
        }
        return 0;
    }
}

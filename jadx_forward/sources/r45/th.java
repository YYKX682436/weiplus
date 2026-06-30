package r45;

/* loaded from: classes8.dex */
public class th extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467951d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dy6 f467952e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f467953f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.th)) {
            return false;
        }
        r45.th thVar = (r45.th) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467951d), java.lang.Integer.valueOf(thVar.f467951d)) && n51.f.a(this.f467952e, thVar.f467952e) && n51.f.a(this.f467953f, thVar.f467953f) && n51.f.a(this.f76494x2de60e5e, thVar.f76494x2de60e5e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467951d);
            r45.dy6 dy6Var = this.f467952e;
            if (dy6Var != null) {
                fVar.i(2, dy6Var.mo75928xcd1e8d8());
                this.f467952e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f467953f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(255, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467951d) + 0;
            r45.dy6 dy6Var2 = this.f467952e;
            if (dy6Var2 != null) {
                e17 += b36.f.i(2, dy6Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f467953f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            r45.he heVar2 = this.f76494x2de60e5e;
            return heVar2 != null ? e17 + b36.f.i(255, heVar2.mo75928xcd1e8d8()) : e17;
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
        r45.th thVar = (r45.th) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            thVar.f467951d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.dy6 dy6Var3 = new r45.dy6();
                if (bArr != null && bArr.length > 0) {
                    dy6Var3.mo11468x92b714fd(bArr);
                }
                thVar.f467952e = dy6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            thVar.f467953f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 255) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.mo11468x92b714fd(bArr2);
            }
            thVar.f76494x2de60e5e = heVar3;
        }
        return 0;
    }
}

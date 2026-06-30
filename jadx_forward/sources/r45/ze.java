package r45;

/* loaded from: classes4.dex */
public class ze extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f473480d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f473481e;

    /* renamed from: f, reason: collision with root package name */
    public int f473482f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ze)) {
            return false;
        }
        r45.ze zeVar = (r45.ze) fVar;
        return n51.f.a(this.f76494x2de60e5e, zeVar.f76494x2de60e5e) && n51.f.a(this.f473480d, zeVar.f473480d) && n51.f.a(java.lang.Integer.valueOf(this.f473481e), java.lang.Integer.valueOf(zeVar.f473481e)) && n51.f.a(java.lang.Integer.valueOf(this.f473482f), java.lang.Integer.valueOf(zeVar.f473482f));
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
            fVar.g(2, 8, this.f473480d);
            fVar.e(3, this.f473481e);
            fVar.e(4, this.f473482f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f473480d) + b36.f.e(3, this.f473481e) + b36.f.e(4, this.f473482f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f473480d.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ze zeVar = (r45.ze) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                zeVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                zeVar.f473481e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            zeVar.f473482f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.y55 y55Var = new r45.y55();
            if (bArr3 != null && bArr3.length > 0) {
                y55Var.mo11468x92b714fd(bArr3);
            }
            zeVar.f473480d.add(y55Var);
        }
        return 0;
    }
}

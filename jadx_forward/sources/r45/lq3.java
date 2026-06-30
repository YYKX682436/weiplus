package r45;

/* loaded from: classes9.dex */
public class lq3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f461253d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461254e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aw6 f461255f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lq3)) {
            return false;
        }
        r45.lq3 lq3Var = (r45.lq3) fVar;
        return n51.f.a(this.f461253d, lq3Var.f461253d) && n51.f.a(this.f461254e, lq3Var.f461254e) && n51.f.a(this.f461255f, lq3Var.f461255f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461253d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461254e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.aw6 aw6Var = this.f461255f;
            if (aw6Var != null) {
                fVar.i(5, aw6Var.mo75928xcd1e8d8());
                this.f461255f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461254e;
            if (gVar2 != null) {
                g17 += b36.f.b(2, gVar2);
            }
            r45.aw6 aw6Var2 = this.f461255f;
            return aw6Var2 != null ? g17 + b36.f.i(5, aw6Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.lq3 lq3Var = (r45.lq3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.yv6 yv6Var = new r45.yv6();
                if (bArr2 != null && bArr2.length > 0) {
                    yv6Var.mo11468x92b714fd(bArr2);
                }
                lq3Var.f461253d.add(yv6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            lq3Var.f461254e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.aw6 aw6Var3 = new r45.aw6();
            if (bArr3 != null && bArr3.length > 0) {
                aw6Var3.mo11468x92b714fd(bArr3);
            }
            lq3Var.f461255f = aw6Var3;
        }
        return 0;
    }
}

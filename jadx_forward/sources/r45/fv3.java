package r45;

/* loaded from: classes11.dex */
public class fv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456154d;

    /* renamed from: e, reason: collision with root package name */
    public int f456155e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f456156f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f456157g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fv3)) {
            return false;
        }
        r45.fv3 fv3Var = (r45.fv3) fVar;
        return n51.f.a(this.f456154d, fv3Var.f456154d) && n51.f.a(java.lang.Integer.valueOf(this.f456155e), java.lang.Integer.valueOf(fv3Var.f456155e)) && n51.f.a(this.f456156f, fv3Var.f456156f) && n51.f.a(this.f456157g, fv3Var.f456157g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456154d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f456155e);
            fVar.g(3, 8, this.f456156f);
            fVar.g(4, 2, this.f456157g);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456154d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.e(2, this.f456155e) + b36.f.g(3, 8, this.f456156f) + b36.f.g(4, 2, this.f456157g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456156f.clear();
            this.f456157g.clear();
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
        r45.fv3 fv3Var = (r45.fv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fv3Var.f456154d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            fv3Var.f456155e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            fv3Var.f456157g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.hv3 hv3Var = new r45.hv3();
            if (bArr2 != null && bArr2.length > 0) {
                hv3Var.mo11468x92b714fd(bArr2);
            }
            fv3Var.f456156f.add(hv3Var);
        }
        return 0;
    }
}

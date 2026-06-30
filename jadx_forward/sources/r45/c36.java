package r45;

/* loaded from: classes9.dex */
public class c36 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f452788d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452789e;

    /* renamed from: f, reason: collision with root package name */
    public int f452790f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c36)) {
            return false;
        }
        r45.c36 c36Var = (r45.c36) fVar;
        return n51.f.a(this.f452788d, c36Var.f452788d) && n51.f.a(this.f452789e, c36Var.f452789e) && n51.f.a(java.lang.Integer.valueOf(this.f452790f), java.lang.Integer.valueOf(c36Var.f452790f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f452788d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452789e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f452790f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f452788d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452789e;
            if (gVar2 != null) {
                g17 += b36.f.b(2, gVar2);
            }
            return g17 + b36.f.e(3, this.f452790f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452788d.clear();
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
        r45.c36 c36Var = (r45.c36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c36Var.f452789e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            c36Var.f452790f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.yv6 yv6Var = new r45.yv6();
            if (bArr2 != null && bArr2.length > 0) {
                yv6Var.mo11468x92b714fd(bArr2);
            }
            c36Var.f452788d.add(yv6Var);
        }
        return 0;
    }
}

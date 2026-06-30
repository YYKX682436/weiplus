package r45;

/* loaded from: classes2.dex */
public class gk4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f456848d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f456849e;

    /* renamed from: f, reason: collision with root package name */
    public int f456850f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456851g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gk4)) {
            return false;
        }
        r45.gk4 gk4Var = (r45.gk4) fVar;
        return n51.f.a(this.f456848d, gk4Var.f456848d) && n51.f.a(java.lang.Integer.valueOf(this.f456849e), java.lang.Integer.valueOf(gk4Var.f456849e)) && n51.f.a(java.lang.Integer.valueOf(this.f456850f), java.lang.Integer.valueOf(gk4Var.f456850f)) && n51.f.a(this.f456851g, gk4Var.f456851g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456848d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f456849e);
            fVar.e(3, this.f456850f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456851g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f456849e) + b36.f.e(3, this.f456850f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456851g;
            return gVar2 != null ? g17 + b36.f.b(4, gVar2) : g17;
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
        r45.gk4 gk4Var = (r45.gk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                gk4Var.f456849e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                gk4Var.f456850f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            gk4Var.f456851g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.vx0 vx0Var = new r45.vx0();
            if (bArr2 != null && bArr2.length > 0) {
                vx0Var.mo11468x92b714fd(bArr2);
            }
            gk4Var.f456848d.add(vx0Var);
        }
        return 0;
    }
}

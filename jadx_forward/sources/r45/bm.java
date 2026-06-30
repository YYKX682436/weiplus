package r45;

/* loaded from: classes4.dex */
public class bm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452394d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452395e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f452396f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f452397g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm)) {
            return false;
        }
        r45.bm bmVar = (r45.bm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452394d), java.lang.Integer.valueOf(bmVar.f452394d)) && n51.f.a(this.f452395e, bmVar.f452395e) && n51.f.a(this.f452396f, bmVar.f452396f) && n51.f.a(java.lang.Long.valueOf(this.f452397g), java.lang.Long.valueOf(bmVar.f452397g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452394d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452395e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, this.f452396f);
            fVar.h(4, this.f452397g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452394d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452395e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.g(3, 8, this.f452396f) + b36.f.h(4, this.f452397g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452396f.clear();
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
        r45.bm bmVar = (r45.bm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bmVar.f452394d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bmVar.f452395e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            bmVar.f452397g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.fi5 fi5Var = new r45.fi5();
            if (bArr2 != null && bArr2.length > 0) {
                fi5Var.mo11468x92b714fd(bArr2);
            }
            bmVar.f452396f.add(fi5Var);
        }
        return 0;
    }
}

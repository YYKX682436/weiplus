package p45;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433459d;

    /* renamed from: e, reason: collision with root package name */
    public int f433460e;

    /* renamed from: f, reason: collision with root package name */
    public int f433461f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f433462g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f433463h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.i)) {
            return false;
        }
        p45.i iVar = (p45.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433459d), java.lang.Integer.valueOf(iVar.f433459d)) && n51.f.a(java.lang.Integer.valueOf(this.f433460e), java.lang.Integer.valueOf(iVar.f433460e)) && n51.f.a(java.lang.Integer.valueOf(this.f433461f), java.lang.Integer.valueOf(iVar.f433461f)) && n51.f.a(this.f433462g, iVar.f433462g) && n51.f.a(this.f433463h, iVar.f433463h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433462g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433459d);
            fVar.e(2, this.f433460e);
            fVar.e(3, this.f433461f);
            fVar.g(4, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f433463h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433459d) + 0 + b36.f.e(2, this.f433460e) + b36.f.e(3, this.f433461f) + b36.f.g(4, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f433463h;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        p45.i iVar = (p45.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f433459d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f433460e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f433461f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            iVar.f433463h = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.e eVar = new p45.e();
            if (bArr2 != null && bArr2.length > 0) {
                eVar.mo11468x92b714fd(bArr2);
            }
            iVar.f433462g.add(eVar);
        }
        return 0;
    }
}

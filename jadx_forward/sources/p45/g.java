package p45;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433447d;

    /* renamed from: e, reason: collision with root package name */
    public int f433448e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f433449f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f433450g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.g)) {
            return false;
        }
        p45.g gVar = (p45.g) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433447d), java.lang.Integer.valueOf(gVar.f433447d)) && n51.f.a(java.lang.Integer.valueOf(this.f433448e), java.lang.Integer.valueOf(gVar.f433448e)) && n51.f.a(this.f433449f, gVar.f433449f) && n51.f.a(this.f433450g, gVar.f433450g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433449f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433447d);
            fVar.e(2, this.f433448e);
            fVar.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f433450g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433447d) + 0 + b36.f.e(2, this.f433448e) + b36.f.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f433450g;
            return gVar2 != null ? e17 + b36.f.b(4, gVar2) : e17;
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
        p45.g gVar3 = (p45.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gVar3.f433447d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gVar3.f433448e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            gVar3.f433450g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.b bVar = new p45.b();
            if (bArr2 != null && bArr2.length > 0) {
                bVar.mo11468x92b714fd(bArr2);
            }
            gVar3.f433449f.add(bVar);
        }
        return 0;
    }
}

package p45;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433412d;

    /* renamed from: e, reason: collision with root package name */
    public int f433413e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f433414f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f433415g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.b)) {
            return false;
        }
        p45.b bVar = (p45.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433412d), java.lang.Integer.valueOf(bVar.f433412d)) && n51.f.a(java.lang.Integer.valueOf(this.f433413e), java.lang.Integer.valueOf(bVar.f433413e)) && n51.f.a(this.f433414f, bVar.f433414f) && n51.f.a(java.lang.Integer.valueOf(this.f433415g), java.lang.Integer.valueOf(bVar.f433415g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433414f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433412d);
            fVar.e(2, this.f433413e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f433415g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f433412d) + 0 + b36.f.e(2, this.f433413e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f433415g);
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
        p45.b bVar = (p45.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f433412d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f433413e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            bVar.f433415g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.a aVar3 = new p45.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.mo11468x92b714fd(bArr2);
            }
            bVar.f433414f.add(aVar3);
        }
        return 0;
    }
}

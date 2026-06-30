package p45;

/* loaded from: classes11.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433484d;

    /* renamed from: e, reason: collision with root package name */
    public int f433485e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f433486f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.m)) {
            return false;
        }
        p45.m mVar = (p45.m) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433484d), java.lang.Integer.valueOf(mVar.f433484d)) && n51.f.a(java.lang.Integer.valueOf(this.f433485e), java.lang.Integer.valueOf(mVar.f433485e)) && n51.f.a(this.f433486f, mVar.f433486f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433486f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433484d);
            fVar.e(2, this.f433485e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f433484d) + 0 + b36.f.e(2, this.f433485e) + b36.f.g(3, 8, linkedList);
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
        p45.m mVar = (p45.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.f433484d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mVar.f433485e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.n nVar = new p45.n();
            if (bArr2 != null && bArr2.length > 0) {
                nVar.mo11468x92b714fd(bArr2);
            }
            mVar.f433486f.add(nVar);
        }
        return 0;
    }
}

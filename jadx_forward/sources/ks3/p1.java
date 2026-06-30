package ks3;

/* loaded from: classes2.dex */
public class p1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f393268d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f393269e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f393270f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.p1)) {
            return false;
        }
        ks3.p1 p1Var = (ks3.p1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f393268d), java.lang.Long.valueOf(p1Var.f393268d)) && n51.f.a(this.f393269e, p1Var.f393269e) && n51.f.a(java.lang.Long.valueOf(this.f393270f), java.lang.Long.valueOf(p1Var.f393270f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f393269e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f393268d);
            fVar.g(2, 1, linkedList);
            fVar.h(3, this.f393270f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f393268d) + 0 + b36.f.g(2, 1, linkedList) + b36.f.h(3, this.f393270f);
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
        ks3.p1 p1Var = (ks3.p1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p1Var.f393268d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            p1Var.f393269e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p1Var.f393270f = aVar2.i(intValue);
        return 0;
    }
}

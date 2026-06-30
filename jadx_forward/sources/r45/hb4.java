package r45;

/* loaded from: classes2.dex */
public class hb4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f457537d;

    /* renamed from: e, reason: collision with root package name */
    public int f457538e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f457539f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb4)) {
            return false;
        }
        r45.hb4 hb4Var = (r45.hb4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f457537d), java.lang.Long.valueOf(hb4Var.f457537d)) && n51.f.a(java.lang.Integer.valueOf(this.f457538e), java.lang.Integer.valueOf(hb4Var.f457538e)) && n51.f.a(this.f457539f, hb4Var.f457539f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457539f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f457537d);
            fVar.e(2, this.f457538e);
            fVar.g(3, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f457537d) + 0 + b36.f.e(2, this.f457538e) + b36.f.g(3, 3, linkedList);
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
        r45.hb4 hb4Var = (r45.hb4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hb4Var.f457537d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            hb4Var.f457538e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hb4Var.f457539f.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }
}

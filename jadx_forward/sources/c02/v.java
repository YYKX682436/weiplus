package c02;

/* loaded from: classes4.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f119166d;

    /* renamed from: e, reason: collision with root package name */
    public int f119167e;

    /* renamed from: f, reason: collision with root package name */
    public long f119168f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.v)) {
            return false;
        }
        c02.v vVar = (c02.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f119166d), java.lang.Integer.valueOf(vVar.f119166d)) && n51.f.a(java.lang.Integer.valueOf(this.f119167e), java.lang.Integer.valueOf(vVar.f119167e)) && n51.f.a(java.lang.Long.valueOf(this.f119168f), java.lang.Long.valueOf(vVar.f119168f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f119166d);
            fVar.e(2, this.f119167e);
            fVar.h(3, this.f119168f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f119166d) + 0 + b36.f.e(2, this.f119167e) + b36.f.h(3, this.f119168f);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        c02.v vVar = (c02.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vVar.f119166d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            vVar.f119167e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        vVar.f119168f = aVar2.i(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes4.dex */
public class pq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464830d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464831e;

    /* renamed from: f, reason: collision with root package name */
    public long f464832f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq)) {
            return false;
        }
        r45.pq pqVar = (r45.pq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464830d), java.lang.Integer.valueOf(pqVar.f464830d)) && n51.f.a(this.f464831e, pqVar.f464831e) && n51.f.a(java.lang.Long.valueOf(this.f464832f), java.lang.Long.valueOf(pqVar.f464832f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464830d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f464831e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f464832f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464830d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f464831e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.h(3, this.f464832f);
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
        r45.pq pqVar = (r45.pq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pqVar.f464830d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pqVar.f464831e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        pqVar.f464832f = aVar2.i(intValue);
        return 0;
    }
}

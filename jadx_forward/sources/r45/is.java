package r45;

/* loaded from: classes8.dex */
public class is extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458830d;

    /* renamed from: e, reason: collision with root package name */
    public long f458831e;

    /* renamed from: f, reason: collision with root package name */
    public long f458832f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f458833g;

    /* renamed from: h, reason: collision with root package name */
    public long f458834h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.is)) {
            return false;
        }
        r45.is isVar = (r45.is) fVar;
        return n51.f.a(this.f458830d, isVar.f458830d) && n51.f.a(java.lang.Long.valueOf(this.f458831e), java.lang.Long.valueOf(isVar.f458831e)) && n51.f.a(java.lang.Long.valueOf(this.f458832f), java.lang.Long.valueOf(isVar.f458832f)) && n51.f.a(java.lang.Boolean.valueOf(this.f458833g), java.lang.Boolean.valueOf(isVar.f458833g)) && n51.f.a(java.lang.Long.valueOf(this.f458834h), java.lang.Long.valueOf(isVar.f458834h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458830d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.h(2, this.f458831e);
            fVar.h(3, this.f458832f);
            fVar.a(4, this.f458833g);
            fVar.h(5, this.f458834h);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458830d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.h(2, this.f458831e) + b36.f.h(3, this.f458832f) + b36.f.a(4, this.f458833g) + b36.f.h(5, this.f458834h);
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
        r45.is isVar = (r45.is) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            isVar.f458830d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            isVar.f458831e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            isVar.f458832f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            isVar.f458833g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        isVar.f458834h = aVar2.i(intValue);
        return 0;
    }
}

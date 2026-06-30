package r45;

/* loaded from: classes2.dex */
public class gb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f456598d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456599e;

    /* renamed from: f, reason: collision with root package name */
    public float f456600f;

    /* renamed from: g, reason: collision with root package name */
    public float f456601g;

    /* renamed from: h, reason: collision with root package name */
    public long f456602h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gb)) {
            return false;
        }
        r45.gb gbVar = (r45.gb) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f456598d), java.lang.Float.valueOf(gbVar.f456598d)) && n51.f.a(this.f456599e, gbVar.f456599e) && n51.f.a(java.lang.Float.valueOf(this.f456600f), java.lang.Float.valueOf(gbVar.f456600f)) && n51.f.a(java.lang.Float.valueOf(this.f456601g), java.lang.Float.valueOf(gbVar.f456601g)) && n51.f.a(java.lang.Long.valueOf(this.f456602h), java.lang.Long.valueOf(gbVar.f456602h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f456598d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456599e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.d(3, this.f456600f);
            fVar.d(4, this.f456601g);
            fVar.h(5, this.f456602h);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f456598d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456599e;
            if (gVar2 != null) {
                d17 += b36.f.b(2, gVar2);
            }
            return d17 + b36.f.d(3, this.f456600f) + b36.f.d(4, this.f456601g) + b36.f.h(5, this.f456602h);
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
        r45.gb gbVar = (r45.gb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gbVar.f456598d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            gbVar.f456599e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            gbVar.f456600f = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            gbVar.f456601g = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        gbVar.f456602h = aVar2.i(intValue);
        return 0;
    }
}

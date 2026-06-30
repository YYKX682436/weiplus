package m53;

/* loaded from: classes2.dex */
public class r extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f405527d;

    /* renamed from: e, reason: collision with root package name */
    public int f405528e;

    /* renamed from: f, reason: collision with root package name */
    public long f405529f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405531h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r)) {
            return false;
        }
        m53.r rVar = (m53.r) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f405527d), java.lang.Long.valueOf(rVar.f405527d)) && n51.f.a(java.lang.Integer.valueOf(this.f405528e), java.lang.Integer.valueOf(rVar.f405528e)) && n51.f.a(java.lang.Long.valueOf(this.f405529f), java.lang.Long.valueOf(rVar.f405529f)) && n51.f.a(this.f405530g, rVar.f405530g) && n51.f.a(java.lang.Boolean.valueOf(this.f405531h), java.lang.Boolean.valueOf(rVar.f405531h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f405527d);
            fVar.e(2, this.f405528e);
            fVar.h(3, this.f405529f);
            java.lang.String str = this.f405530g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.a(5, this.f405531h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f405527d) + 0 + b36.f.e(2, this.f405528e) + b36.f.h(3, this.f405529f);
            java.lang.String str2 = this.f405530g;
            if (str2 != null) {
                h17 += b36.f.j(4, str2);
            }
            return h17 + b36.f.a(5, this.f405531h);
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
        m53.r rVar = (m53.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rVar.f405527d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            rVar.f405528e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            rVar.f405529f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            rVar.f405530g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rVar.f405531h = aVar2.c(intValue);
        return 0;
    }
}

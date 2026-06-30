package mj0;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f408531d;

    /* renamed from: e, reason: collision with root package name */
    public long f408532e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f408533f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof mj0.g)) {
            return false;
        }
        mj0.g gVar = (mj0.g) fVar;
        return n51.f.a(this.f408531d, gVar.f408531d) && n51.f.a(java.lang.Long.valueOf(this.f408532e), java.lang.Long.valueOf(gVar.f408532e)) && n51.f.a(java.lang.Boolean.valueOf(this.f408533f), java.lang.Boolean.valueOf(gVar.f408533f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f408531d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f408532e);
            fVar.a(3, this.f408533f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f408531d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f408532e) + b36.f.a(3, this.f408533f);
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
        mj0.g gVar = (mj0.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gVar.f408531d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gVar.f408532e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        gVar.f408533f = aVar2.c(intValue);
        return 0;
    }
}

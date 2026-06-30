package r45;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463317d;

    /* renamed from: e, reason: collision with root package name */
    public long f463318e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o)) {
            return false;
        }
        r45.o oVar = (r45.o) fVar;
        return n51.f.a(this.f463317d, oVar.f463317d) && n51.f.a(java.lang.Long.valueOf(this.f463318e), java.lang.Long.valueOf(oVar.f463318e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463317d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f463318e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f463317d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f463318e);
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
        r45.o oVar = (r45.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oVar.f463317d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        oVar.f463318e = aVar2.i(intValue);
        return 0;
    }
}

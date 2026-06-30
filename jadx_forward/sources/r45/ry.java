package r45;

/* loaded from: classes8.dex */
public class ry extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f466813d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f466814e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ry)) {
            return false;
        }
        r45.ry ryVar = (r45.ry) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f466813d), java.lang.Boolean.valueOf(ryVar.f466813d)) && n51.f.a(java.lang.Boolean.valueOf(this.f466814e), java.lang.Boolean.valueOf(ryVar.f466814e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f466813d);
            fVar.a(2, this.f466814e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f466813d) + 0 + b36.f.a(2, this.f466814e);
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
        r45.ry ryVar = (r45.ry) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ryVar.f466813d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ryVar.f466814e = aVar2.c(intValue);
        return 0;
    }
}

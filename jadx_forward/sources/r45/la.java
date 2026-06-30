package r45;

/* loaded from: classes11.dex */
public class la extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460799d;

    /* renamed from: e, reason: collision with root package name */
    public int f460800e;

    /* renamed from: f, reason: collision with root package name */
    public int f460801f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.la)) {
            return false;
        }
        r45.la laVar = (r45.la) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460799d), java.lang.Integer.valueOf(laVar.f460799d)) && n51.f.a(java.lang.Integer.valueOf(this.f460800e), java.lang.Integer.valueOf(laVar.f460800e)) && n51.f.a(java.lang.Integer.valueOf(this.f460801f), java.lang.Integer.valueOf(laVar.f460801f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460799d);
            fVar.e(2, this.f460800e);
            fVar.e(3, this.f460801f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f460799d) + 0 + b36.f.e(2, this.f460800e) + b36.f.e(3, this.f460801f);
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
        r45.la laVar = (r45.la) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            laVar.f460799d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            laVar.f460800e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        laVar.f460801f = aVar2.g(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes9.dex */
public class hh extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457675d;

    /* renamed from: e, reason: collision with root package name */
    public int f457676e;

    /* renamed from: f, reason: collision with root package name */
    public int f457677f;

    /* renamed from: g, reason: collision with root package name */
    public int f457678g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hh)) {
            return false;
        }
        r45.hh hhVar = (r45.hh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457675d), java.lang.Integer.valueOf(hhVar.f457675d)) && n51.f.a(java.lang.Integer.valueOf(this.f457676e), java.lang.Integer.valueOf(hhVar.f457676e)) && n51.f.a(java.lang.Integer.valueOf(this.f457677f), java.lang.Integer.valueOf(hhVar.f457677f)) && n51.f.a(java.lang.Integer.valueOf(this.f457678g), java.lang.Integer.valueOf(hhVar.f457678g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457675d);
            fVar.e(2, this.f457676e);
            fVar.e(3, this.f457677f);
            fVar.e(4, this.f457678g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f457675d) + 0 + b36.f.e(2, this.f457676e) + b36.f.e(3, this.f457677f) + b36.f.e(4, this.f457678g);
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
        r45.hh hhVar = (r45.hh) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hhVar.f457675d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hhVar.f457676e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hhVar.f457677f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hhVar.f457678g = aVar2.g(intValue);
        return 0;
    }
}

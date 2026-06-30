package r45;

/* loaded from: classes4.dex */
public class hi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457709d;

    /* renamed from: e, reason: collision with root package name */
    public int f457710e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457711f;

    /* renamed from: g, reason: collision with root package name */
    public int f457712g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hi)) {
            return false;
        }
        r45.hi hiVar = (r45.hi) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457709d), java.lang.Integer.valueOf(hiVar.f457709d)) && n51.f.a(java.lang.Integer.valueOf(this.f457710e), java.lang.Integer.valueOf(hiVar.f457710e)) && n51.f.a(this.f457711f, hiVar.f457711f) && n51.f.a(java.lang.Integer.valueOf(this.f457712g), java.lang.Integer.valueOf(hiVar.f457712g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457709d);
            fVar.e(2, this.f457710e);
            java.lang.String str = this.f457711f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f457712g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457709d) + 0 + b36.f.e(2, this.f457710e);
            java.lang.String str2 = this.f457711f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f457712g);
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
        r45.hi hiVar = (r45.hi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hiVar.f457709d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hiVar.f457710e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hiVar.f457711f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hiVar.f457712g = aVar2.g(intValue);
        return 0;
    }
}

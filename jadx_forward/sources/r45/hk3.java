package r45;

/* loaded from: classes4.dex */
public class hk3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457774d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457775e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f457776f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f457777g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hk3)) {
            return false;
        }
        r45.hk3 hk3Var = (r45.hk3) fVar;
        return n51.f.a(this.f457774d, hk3Var.f457774d) && n51.f.a(this.f457775e, hk3Var.f457775e) && n51.f.a(this.f457776f, hk3Var.f457776f) && n51.f.a(java.lang.Integer.valueOf(this.f457777g), java.lang.Integer.valueOf(hk3Var.f457777g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457774d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457775e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, this.f457776f);
            fVar.e(4, this.f457777g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f457774d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f457775e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 1, this.f457776f) + b36.f.e(4, this.f457777g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f457776f.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.hk3 hk3Var = (r45.hk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hk3Var.f457774d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hk3Var.f457775e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hk3Var.f457776f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hk3Var.f457777g = aVar2.g(intValue);
        return 0;
    }
}

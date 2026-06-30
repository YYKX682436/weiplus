package r45;

/* loaded from: classes4.dex */
public class zc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473433e;

    /* renamed from: f, reason: collision with root package name */
    public int f473434f;

    /* renamed from: g, reason: collision with root package name */
    public int f473435g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zc)) {
            return false;
        }
        r45.zc zcVar = (r45.zc) fVar;
        return n51.f.a(this.f473432d, zcVar.f473432d) && n51.f.a(this.f473433e, zcVar.f473433e) && n51.f.a(java.lang.Integer.valueOf(this.f473434f), java.lang.Integer.valueOf(zcVar.f473434f)) && n51.f.a(java.lang.Integer.valueOf(this.f473435g), java.lang.Integer.valueOf(zcVar.f473435g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473432d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473433e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f473434f);
            fVar.e(4, this.f473435g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f473432d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f473433e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f473434f) + b36.f.e(4, this.f473435g);
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
        r45.zc zcVar = (r45.zc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zcVar.f473432d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zcVar.f473433e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zcVar.f473434f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zcVar.f473435g = aVar2.g(intValue);
        return 0;
    }
}

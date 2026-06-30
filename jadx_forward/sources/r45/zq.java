package r45;

/* loaded from: classes9.dex */
public class zq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473833d;

    /* renamed from: e, reason: collision with root package name */
    public int f473834e;

    /* renamed from: f, reason: collision with root package name */
    public long f473835f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zq)) {
            return false;
        }
        r45.zq zqVar = (r45.zq) fVar;
        return n51.f.a(this.f473833d, zqVar.f473833d) && n51.f.a(java.lang.Integer.valueOf(this.f473834e), java.lang.Integer.valueOf(zqVar.f473834e)) && n51.f.a(java.lang.Long.valueOf(this.f473835f), java.lang.Long.valueOf(zqVar.f473835f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473833d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f473834e);
            fVar.h(3, this.f473835f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f473833d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f473834e) + b36.f.h(3, this.f473835f);
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
        r45.zq zqVar = (r45.zq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zqVar.f473833d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zqVar.f473834e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        zqVar.f473835f = aVar2.i(intValue);
        return 0;
    }
}

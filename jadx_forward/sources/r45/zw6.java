package r45;

/* loaded from: classes11.dex */
public class zw6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473978d;

    /* renamed from: e, reason: collision with root package name */
    public int f473979e;

    /* renamed from: f, reason: collision with root package name */
    public int f473980f;

    /* renamed from: g, reason: collision with root package name */
    public int f473981g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zw6)) {
            return false;
        }
        r45.zw6 zw6Var = (r45.zw6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473978d), java.lang.Integer.valueOf(zw6Var.f473978d)) && n51.f.a(java.lang.Integer.valueOf(this.f473979e), java.lang.Integer.valueOf(zw6Var.f473979e)) && n51.f.a(java.lang.Integer.valueOf(this.f473980f), java.lang.Integer.valueOf(zw6Var.f473980f)) && n51.f.a(java.lang.Integer.valueOf(this.f473981g), java.lang.Integer.valueOf(zw6Var.f473981g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473978d);
            fVar.e(2, this.f473979e);
            fVar.e(3, this.f473980f);
            fVar.e(4, this.f473981g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f473978d) + 0 + b36.f.e(2, this.f473979e) + b36.f.e(3, this.f473980f) + b36.f.e(4, this.f473981g);
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
        r45.zw6 zw6Var = (r45.zw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zw6Var.f473978d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            zw6Var.f473979e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            zw6Var.f473980f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zw6Var.f473981g = aVar2.g(intValue);
        return 0;
    }
}

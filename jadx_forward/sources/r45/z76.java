package r45;

/* loaded from: classes4.dex */
public class z76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f473309d;

    /* renamed from: e, reason: collision with root package name */
    public int f473310e;

    /* renamed from: f, reason: collision with root package name */
    public long f473311f;

    /* renamed from: g, reason: collision with root package name */
    public int f473312g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z76)) {
            return false;
        }
        r45.z76 z76Var = (r45.z76) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f473309d), java.lang.Long.valueOf(z76Var.f473309d)) && n51.f.a(java.lang.Integer.valueOf(this.f473310e), java.lang.Integer.valueOf(z76Var.f473310e)) && n51.f.a(java.lang.Long.valueOf(this.f473311f), java.lang.Long.valueOf(z76Var.f473311f)) && n51.f.a(java.lang.Integer.valueOf(this.f473312g), java.lang.Integer.valueOf(z76Var.f473312g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f473309d);
            fVar.e(2, this.f473310e);
            fVar.h(3, this.f473311f);
            fVar.e(4, this.f473312g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f473309d) + 0 + b36.f.e(2, this.f473310e) + b36.f.h(3, this.f473311f) + b36.f.e(4, this.f473312g);
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
        r45.z76 z76Var = (r45.z76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z76Var.f473309d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            z76Var.f473310e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            z76Var.f473311f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        z76Var.f473312g = aVar2.g(intValue);
        return 0;
    }
}

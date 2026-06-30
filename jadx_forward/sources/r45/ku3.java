package r45;

/* loaded from: classes9.dex */
public class ku3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f460487d;

    /* renamed from: e, reason: collision with root package name */
    public float f460488e;

    /* renamed from: f, reason: collision with root package name */
    public float f460489f;

    /* renamed from: g, reason: collision with root package name */
    public long f460490g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ku3)) {
            return false;
        }
        r45.ku3 ku3Var = (r45.ku3) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f460487d), java.lang.Float.valueOf(ku3Var.f460487d)) && n51.f.a(java.lang.Float.valueOf(this.f460488e), java.lang.Float.valueOf(ku3Var.f460488e)) && n51.f.a(java.lang.Float.valueOf(this.f460489f), java.lang.Float.valueOf(ku3Var.f460489f)) && n51.f.a(java.lang.Long.valueOf(this.f460490g), java.lang.Long.valueOf(ku3Var.f460490g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f460487d);
            fVar.d(2, this.f460488e);
            fVar.d(3, this.f460489f);
            fVar.h(4, this.f460490g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f460487d) + 0 + b36.f.d(2, this.f460488e) + b36.f.d(3, this.f460489f) + b36.f.h(4, this.f460490g);
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
        r45.ku3 ku3Var = (r45.ku3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ku3Var.f460487d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            ku3Var.f460488e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            ku3Var.f460489f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ku3Var.f460490g = aVar2.i(intValue);
        return 0;
    }
}

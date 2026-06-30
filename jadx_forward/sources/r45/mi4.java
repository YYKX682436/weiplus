package r45;

/* loaded from: classes2.dex */
public class mi4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f462077d;

    /* renamed from: e, reason: collision with root package name */
    public float f462078e;

    /* renamed from: f, reason: collision with root package name */
    public float f462079f;

    /* renamed from: g, reason: collision with root package name */
    public float f462080g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mi4)) {
            return false;
        }
        r45.mi4 mi4Var = (r45.mi4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f462077d), java.lang.Float.valueOf(mi4Var.f462077d)) && n51.f.a(java.lang.Float.valueOf(this.f462078e), java.lang.Float.valueOf(mi4Var.f462078e)) && n51.f.a(java.lang.Float.valueOf(this.f462079f), java.lang.Float.valueOf(mi4Var.f462079f)) && n51.f.a(java.lang.Float.valueOf(this.f462080g), java.lang.Float.valueOf(mi4Var.f462080g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f462077d);
            fVar.d(2, this.f462078e);
            fVar.d(3, this.f462079f);
            fVar.d(4, this.f462080g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f462077d) + 0 + b36.f.d(2, this.f462078e) + b36.f.d(3, this.f462079f) + b36.f.d(4, this.f462080g);
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
        r45.mi4 mi4Var = (r45.mi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mi4Var.f462077d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            mi4Var.f462078e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            mi4Var.f462079f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mi4Var.f462080g = aVar2.f(intValue);
        return 0;
    }
}

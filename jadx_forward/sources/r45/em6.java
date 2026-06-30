package r45;

/* loaded from: classes8.dex */
public class em6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455144d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f455145e;

    /* renamed from: f, reason: collision with root package name */
    public int f455146f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.em6)) {
            return false;
        }
        r45.em6 em6Var = (r45.em6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455144d), java.lang.Integer.valueOf(em6Var.f455144d)) && n51.f.a(java.lang.Boolean.valueOf(this.f455145e), java.lang.Boolean.valueOf(em6Var.f455145e)) && n51.f.a(java.lang.Integer.valueOf(this.f455146f), java.lang.Integer.valueOf(em6Var.f455146f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455144d);
            fVar.a(2, this.f455145e);
            fVar.e(3, this.f455146f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f455144d) + 0 + b36.f.a(2, this.f455145e) + b36.f.e(3, this.f455146f);
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
        r45.em6 em6Var = (r45.em6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            em6Var.f455144d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            em6Var.f455145e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        em6Var.f455146f = aVar2.g(intValue);
        return 0;
    }
}

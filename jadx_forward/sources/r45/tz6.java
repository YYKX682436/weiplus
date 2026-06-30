package r45;

/* loaded from: classes9.dex */
public class tz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468423d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468424e;

    /* renamed from: f, reason: collision with root package name */
    public long f468425f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f468426g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tz6)) {
            return false;
        }
        r45.tz6 tz6Var = (r45.tz6) fVar;
        return n51.f.a(this.f468423d, tz6Var.f468423d) && n51.f.a(this.f468424e, tz6Var.f468424e) && n51.f.a(java.lang.Long.valueOf(this.f468425f), java.lang.Long.valueOf(tz6Var.f468425f)) && n51.f.a(java.lang.Boolean.valueOf(this.f468426g), java.lang.Boolean.valueOf(tz6Var.f468426g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468423d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468424e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f468425f);
            fVar.a(4, this.f468426g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f468423d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f468424e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f468425f) + b36.f.a(4, this.f468426g);
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
        r45.tz6 tz6Var = (r45.tz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tz6Var.f468423d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tz6Var.f468424e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tz6Var.f468425f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        tz6Var.f468426g = aVar2.c(intValue);
        return 0;
    }
}

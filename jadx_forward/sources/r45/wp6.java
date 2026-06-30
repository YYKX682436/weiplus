package r45;

/* loaded from: classes9.dex */
public class wp6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470912d;

    /* renamed from: e, reason: collision with root package name */
    public long f470913e;

    /* renamed from: f, reason: collision with root package name */
    public long f470914f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp6)) {
            return false;
        }
        r45.wp6 wp6Var = (r45.wp6) fVar;
        return n51.f.a(this.f470912d, wp6Var.f470912d) && n51.f.a(java.lang.Long.valueOf(this.f470913e), java.lang.Long.valueOf(wp6Var.f470913e)) && n51.f.a(java.lang.Long.valueOf(this.f470914f), java.lang.Long.valueOf(wp6Var.f470914f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470912d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f470913e);
            fVar.h(3, this.f470914f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f470912d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f470913e) + b36.f.h(3, this.f470914f);
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
        r45.wp6 wp6Var = (r45.wp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wp6Var.f470912d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wp6Var.f470913e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wp6Var.f470914f = aVar2.i(intValue);
        return 0;
    }
}

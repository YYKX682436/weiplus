package r45;

/* loaded from: classes9.dex */
public class i67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458303e;

    /* renamed from: f, reason: collision with root package name */
    public long f458304f;

    /* renamed from: g, reason: collision with root package name */
    public long f458305g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i67)) {
            return false;
        }
        r45.i67 i67Var = (r45.i67) fVar;
        return n51.f.a(this.f458302d, i67Var.f458302d) && n51.f.a(this.f458303e, i67Var.f458303e) && n51.f.a(java.lang.Long.valueOf(this.f458304f), java.lang.Long.valueOf(i67Var.f458304f)) && n51.f.a(java.lang.Long.valueOf(this.f458305g), java.lang.Long.valueOf(i67Var.f458305g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458302d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458303e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f458304f);
            fVar.h(4, this.f458305g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f458302d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f458303e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f458304f) + b36.f.h(4, this.f458305g);
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
        r45.i67 i67Var = (r45.i67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i67Var.f458302d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            i67Var.f458303e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i67Var.f458304f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        i67Var.f458305g = aVar2.i(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes4.dex */
public class cb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452956d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452957e;

    /* renamed from: f, reason: collision with root package name */
    public int f452958f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cb0)) {
            return false;
        }
        r45.cb0 cb0Var = (r45.cb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452956d), java.lang.Integer.valueOf(cb0Var.f452956d)) && n51.f.a(this.f452957e, cb0Var.f452957e) && n51.f.a(java.lang.Integer.valueOf(this.f452958f), java.lang.Integer.valueOf(cb0Var.f452958f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452956d);
            java.lang.String str = this.f452957e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f452958f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452956d) + 0;
            java.lang.String str2 = this.f452957e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f452958f);
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
        r45.cb0 cb0Var = (r45.cb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cb0Var.f452956d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cb0Var.f452957e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        cb0Var.f452958f = aVar2.g(intValue);
        return 0;
    }
}

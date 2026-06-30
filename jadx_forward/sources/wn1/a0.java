package wn1;

/* loaded from: classes2.dex */
public class a0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f528925d;

    /* renamed from: e, reason: collision with root package name */
    public long f528926e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f528927f;

    /* renamed from: g, reason: collision with root package name */
    public int f528928g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.a0)) {
            return false;
        }
        wn1.a0 a0Var = (wn1.a0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f528925d), java.lang.Long.valueOf(a0Var.f528925d)) && n51.f.a(java.lang.Long.valueOf(this.f528926e), java.lang.Long.valueOf(a0Var.f528926e)) && n51.f.a(this.f528927f, a0Var.f528927f) && n51.f.a(java.lang.Integer.valueOf(this.f528928g), java.lang.Integer.valueOf(a0Var.f528928g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f528925d);
            fVar.h(2, this.f528926e);
            java.lang.String str = this.f528927f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f528928g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f528925d) + 0 + b36.f.h(2, this.f528926e);
            java.lang.String str2 = this.f528927f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.e(4, this.f528928g);
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
        wn1.a0 a0Var = (wn1.a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a0Var.f528925d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            a0Var.f528926e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            a0Var.f528927f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        a0Var.f528928g = aVar2.g(intValue);
        return 0;
    }
}

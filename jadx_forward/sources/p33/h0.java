package p33;

/* loaded from: classes2.dex */
public class h0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433119e;

    /* renamed from: f, reason: collision with root package name */
    public int f433120f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.h0)) {
            return false;
        }
        p33.h0 h0Var = (p33.h0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433118d), java.lang.Integer.valueOf(h0Var.f433118d)) && n51.f.a(this.f433119e, h0Var.f433119e) && n51.f.a(java.lang.Integer.valueOf(this.f433120f), java.lang.Integer.valueOf(h0Var.f433120f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433118d);
            java.lang.String str = this.f433119e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f433120f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433118d) + 0;
            java.lang.String str2 = this.f433119e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f433120f);
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
        p33.h0 h0Var = (p33.h0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h0Var.f433118d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h0Var.f433119e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        h0Var.f433120f = aVar2.g(intValue);
        return 0;
    }
}

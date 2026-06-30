package p33;

/* loaded from: classes4.dex */
public class c0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433057e;

    /* renamed from: f, reason: collision with root package name */
    public int f433058f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.c0)) {
            return false;
        }
        p33.c0 c0Var = (p33.c0) fVar;
        return n51.f.a(this.f433056d, c0Var.f433056d) && n51.f.a(this.f433057e, c0Var.f433057e) && n51.f.a(java.lang.Integer.valueOf(this.f433058f), java.lang.Integer.valueOf(c0Var.f433058f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f433056d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f433057e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f433058f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f433056d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f433057e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f433058f);
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
        p33.c0 c0Var = (p33.c0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c0Var.f433056d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c0Var.f433057e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c0Var.f433058f = aVar2.g(intValue);
        return 0;
    }
}

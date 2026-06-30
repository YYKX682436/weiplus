package ks3;

/* loaded from: classes8.dex */
public class v0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f393288d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393289e;

    /* renamed from: f, reason: collision with root package name */
    public long f393290f;

    /* renamed from: g, reason: collision with root package name */
    public int f393291g;

    /* renamed from: h, reason: collision with root package name */
    public long f393292h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f393293i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.v0)) {
            return false;
        }
        ks3.v0 v0Var = (ks3.v0) fVar;
        return n51.f.a(this.f393288d, v0Var.f393288d) && n51.f.a(this.f393289e, v0Var.f393289e) && n51.f.a(java.lang.Long.valueOf(this.f393290f), java.lang.Long.valueOf(v0Var.f393290f)) && n51.f.a(java.lang.Integer.valueOf(this.f393291g), java.lang.Integer.valueOf(v0Var.f393291g)) && n51.f.a(java.lang.Long.valueOf(this.f393292h), java.lang.Long.valueOf(v0Var.f393292h)) && n51.f.a(this.f393293i, v0Var.f393293i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f393288d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f393289e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f393290f);
            fVar.e(4, this.f393291g);
            fVar.h(5, this.f393292h);
            java.lang.String str3 = this.f393293i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f393288d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f393289e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int h17 = j17 + b36.f.h(3, this.f393290f) + b36.f.e(4, this.f393291g) + b36.f.h(5, this.f393292h);
            java.lang.String str6 = this.f393293i;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
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
        ks3.v0 v0Var = (ks3.v0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v0Var.f393288d = aVar2.k(intValue);
                return 0;
            case 2:
                v0Var.f393289e = aVar2.k(intValue);
                return 0;
            case 3:
                v0Var.f393290f = aVar2.i(intValue);
                return 0;
            case 4:
                v0Var.f393291g = aVar2.g(intValue);
                return 0;
            case 5:
                v0Var.f393292h = aVar2.i(intValue);
                return 0;
            case 6:
                v0Var.f393293i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

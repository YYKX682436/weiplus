package p33;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433121d;

    /* renamed from: e, reason: collision with root package name */
    public int f433122e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f433123f;

    /* renamed from: g, reason: collision with root package name */
    public int f433124g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.i)) {
            return false;
        }
        p33.i iVar = (p33.i) fVar;
        return n51.f.a(this.f433121d, iVar.f433121d) && n51.f.a(java.lang.Integer.valueOf(this.f433122e), java.lang.Integer.valueOf(iVar.f433122e)) && n51.f.a(java.lang.Boolean.valueOf(this.f433123f), java.lang.Boolean.valueOf(iVar.f433123f)) && n51.f.a(java.lang.Integer.valueOf(this.f433124g), java.lang.Integer.valueOf(iVar.f433124g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f433121d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f433122e);
            fVar.a(3, this.f433123f);
            fVar.e(4, this.f433124g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f433121d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f433122e) + b36.f.a(3, this.f433123f) + b36.f.e(4, this.f433124g);
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
        p33.i iVar = (p33.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f433121d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f433122e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f433123f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        iVar.f433124g = aVar2.g(intValue);
        return 0;
    }
}

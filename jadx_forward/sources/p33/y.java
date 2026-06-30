package p33;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433201d;

    /* renamed from: e, reason: collision with root package name */
    public int f433202e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433203f;

    /* renamed from: g, reason: collision with root package name */
    public int f433204g;

    /* renamed from: h, reason: collision with root package name */
    public int f433205h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.y)) {
            return false;
        }
        p33.y yVar = (p33.y) fVar;
        return n51.f.a(this.f433201d, yVar.f433201d) && n51.f.a(java.lang.Integer.valueOf(this.f433202e), java.lang.Integer.valueOf(yVar.f433202e)) && n51.f.a(this.f433203f, yVar.f433203f) && n51.f.a(java.lang.Integer.valueOf(this.f433204g), java.lang.Integer.valueOf(yVar.f433204g)) && n51.f.a(java.lang.Integer.valueOf(this.f433205h), java.lang.Integer.valueOf(yVar.f433205h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f433201d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f433202e);
            java.lang.String str2 = this.f433203f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f433204g);
            fVar.e(5, this.f433205h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f433201d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f433202e);
            java.lang.String str4 = this.f433203f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f433204g) + b36.f.e(5, this.f433205h);
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
        p33.y yVar = (p33.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f433201d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yVar.f433202e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yVar.f433203f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yVar.f433204g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yVar.f433205h = aVar2.g(intValue);
        return 0;
    }
}

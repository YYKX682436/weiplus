package wn1;

/* loaded from: classes12.dex */
public class w extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529032d;

    /* renamed from: e, reason: collision with root package name */
    public int f529033e;

    /* renamed from: f, reason: collision with root package name */
    public int f529034f;

    /* renamed from: g, reason: collision with root package name */
    public int f529035g;

    /* renamed from: h, reason: collision with root package name */
    public int f529036h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.w)) {
            return false;
        }
        wn1.w wVar = (wn1.w) fVar;
        return n51.f.a(this.f529032d, wVar.f529032d) && n51.f.a(java.lang.Integer.valueOf(this.f529033e), java.lang.Integer.valueOf(wVar.f529033e)) && n51.f.a(java.lang.Integer.valueOf(this.f529034f), java.lang.Integer.valueOf(wVar.f529034f)) && n51.f.a(java.lang.Integer.valueOf(this.f529035g), java.lang.Integer.valueOf(wVar.f529035g)) && n51.f.a(java.lang.Integer.valueOf(this.f529036h), java.lang.Integer.valueOf(wVar.f529036h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f529032d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f529033e);
            fVar.e(3, this.f529034f);
            fVar.e(4, this.f529035g);
            fVar.e(5, this.f529036h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f529032d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f529033e) + b36.f.e(3, this.f529034f) + b36.f.e(4, this.f529035g) + b36.f.e(5, this.f529036h);
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
        wn1.w wVar = (wn1.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wVar.f529032d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wVar.f529033e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wVar.f529034f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wVar.f529035g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wVar.f529036h = aVar2.g(intValue);
        return 0;
    }
}

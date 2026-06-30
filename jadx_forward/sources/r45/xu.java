package r45;

/* loaded from: classes8.dex */
public class xu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471953d;

    /* renamed from: e, reason: collision with root package name */
    public long f471954e;

    /* renamed from: f, reason: collision with root package name */
    public int f471955f;

    /* renamed from: g, reason: collision with root package name */
    public int f471956g;

    /* renamed from: h, reason: collision with root package name */
    public int f471957h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xu)) {
            return false;
        }
        r45.xu xuVar = (r45.xu) fVar;
        return n51.f.a(this.f471953d, xuVar.f471953d) && n51.f.a(java.lang.Long.valueOf(this.f471954e), java.lang.Long.valueOf(xuVar.f471954e)) && n51.f.a(java.lang.Integer.valueOf(this.f471955f), java.lang.Integer.valueOf(xuVar.f471955f)) && n51.f.a(java.lang.Integer.valueOf(this.f471956g), java.lang.Integer.valueOf(xuVar.f471956g)) && n51.f.a(java.lang.Integer.valueOf(this.f471957h), java.lang.Integer.valueOf(xuVar.f471957h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471953d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f471954e);
            fVar.e(3, this.f471955f);
            fVar.e(4, this.f471956g);
            fVar.e(5, this.f471957h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f471953d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f471954e) + b36.f.e(3, this.f471955f) + b36.f.e(4, this.f471956g) + b36.f.e(5, this.f471957h);
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
        r45.xu xuVar = (r45.xu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xuVar.f471953d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xuVar.f471954e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            xuVar.f471955f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            xuVar.f471956g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        xuVar.f471957h = aVar2.g(intValue);
        return 0;
    }
}

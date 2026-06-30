package xq3;

/* loaded from: classes15.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537585d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537586e;

    /* renamed from: f, reason: collision with root package name */
    public int f537587f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f537588g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f537589h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.a)) {
            return false;
        }
        xq3.a aVar = (xq3.a) fVar;
        return n51.f.a(this.f537585d, aVar.f537585d) && n51.f.a(this.f537586e, aVar.f537586e) && n51.f.a(java.lang.Integer.valueOf(this.f537587f), java.lang.Integer.valueOf(aVar.f537587f)) && n51.f.a(this.f537588g, aVar.f537588g) && n51.f.a(this.f537589h, aVar.f537589h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f537585d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f537586e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f537587f);
            java.lang.String str3 = this.f537588g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f537589h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f537585d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f537586e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f537587f);
            java.lang.String str7 = this.f537588g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f537589h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        xq3.a aVar3 = (xq3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f537585d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f537586e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f537587f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f537588g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f537589h = aVar2.k(intValue);
        return 0;
    }
}

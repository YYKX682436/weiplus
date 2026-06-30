package o33;

/* loaded from: classes2.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f424265d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f424266e;

    /* renamed from: f, reason: collision with root package name */
    public int f424267f;

    /* renamed from: g, reason: collision with root package name */
    public int f424268g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f424269h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o33.e)) {
            return false;
        }
        o33.e eVar = (o33.e) fVar;
        return n51.f.a(this.f424265d, eVar.f424265d) && n51.f.a(this.f424266e, eVar.f424266e) && n51.f.a(java.lang.Integer.valueOf(this.f424267f), java.lang.Integer.valueOf(eVar.f424267f)) && n51.f.a(java.lang.Integer.valueOf(this.f424268g), java.lang.Integer.valueOf(eVar.f424268g)) && n51.f.a(this.f424269h, eVar.f424269h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f424265d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f424266e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f424267f);
            fVar.e(4, this.f424268g);
            java.lang.String str3 = this.f424269h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f424265d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f424266e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f424267f) + b36.f.e(4, this.f424268g);
            java.lang.String str6 = this.f424269h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        o33.e eVar = (o33.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eVar.f424265d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            eVar.f424266e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            eVar.f424267f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            eVar.f424268g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        eVar.f424269h = aVar2.k(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes7.dex */
public class ta extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467757d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467759f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f467760g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f467761h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta)) {
            return false;
        }
        r45.ta taVar = (r45.ta) fVar;
        return n51.f.a(this.f467757d, taVar.f467757d) && n51.f.a(this.f467758e, taVar.f467758e) && n51.f.a(this.f467759f, taVar.f467759f) && n51.f.a(this.f467760g, taVar.f467760g) && n51.f.a(java.lang.Long.valueOf(this.f467761h), java.lang.Long.valueOf(taVar.f467761h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467757d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467758e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467759f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, this.f467760g);
            fVar.h(5, this.f467761h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f467757d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f467758e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467759f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 1, this.f467760g) + b36.f.h(5, this.f467761h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f467760g.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ta taVar = (r45.ta) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            taVar.f467757d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            taVar.f467758e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            taVar.f467759f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            taVar.f467760g.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        taVar.f467761h = aVar2.i(intValue);
        return 0;
    }
}

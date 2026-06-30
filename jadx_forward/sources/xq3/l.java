package xq3;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537630d;

    /* renamed from: e, reason: collision with root package name */
    public int f537631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f537632f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f537633g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f537634h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.l)) {
            return false;
        }
        xq3.l lVar = (xq3.l) fVar;
        return n51.f.a(this.f537630d, lVar.f537630d) && n51.f.a(java.lang.Integer.valueOf(this.f537631e), java.lang.Integer.valueOf(lVar.f537631e)) && n51.f.a(this.f537632f, lVar.f537632f) && n51.f.a(this.f537633g, lVar.f537633g) && n51.f.a(java.lang.Integer.valueOf(this.f537634h), java.lang.Integer.valueOf(lVar.f537634h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f537630d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f537631e);
            java.lang.String str2 = this.f537632f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f537633g);
            fVar.e(5, this.f537634h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f537630d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f537631e);
            java.lang.String str4 = this.f537632f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.g(4, 8, this.f537633g) + b36.f.e(5, this.f537634h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f537633g.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        xq3.l lVar = (xq3.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lVar.f537630d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            lVar.f537631e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lVar.f537632f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            lVar.f537634h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            xq3.e eVar = new xq3.e();
            if (bArr2 != null && bArr2.length > 0) {
                eVar.mo11468x92b714fd(bArr2);
            }
            lVar.f537633g.add(eVar);
        }
        return 0;
    }
}

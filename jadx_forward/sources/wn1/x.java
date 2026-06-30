package wn1;

/* loaded from: classes11.dex */
public class x extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529037d;

    /* renamed from: e, reason: collision with root package name */
    public long f529038e;

    /* renamed from: f, reason: collision with root package name */
    public long f529039f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f529040g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f529041h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f529042i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.x)) {
            return false;
        }
        wn1.x xVar = (wn1.x) fVar;
        return n51.f.a(this.f529037d, xVar.f529037d) && n51.f.a(java.lang.Long.valueOf(this.f529038e), java.lang.Long.valueOf(xVar.f529038e)) && n51.f.a(java.lang.Long.valueOf(this.f529039f), java.lang.Long.valueOf(xVar.f529039f)) && n51.f.a(this.f529040g, xVar.f529040g) && n51.f.a(this.f529041h, xVar.f529041h) && n51.f.a(this.f529042i, xVar.f529042i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f529042i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f529037d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f529038e);
            fVar.h(3, this.f529039f);
            java.lang.String str2 = this.f529040g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f529041h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f529037d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f529038e) + b36.f.h(3, this.f529039f);
            java.lang.String str5 = this.f529040g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f529041h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        wn1.x xVar = (wn1.x) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xVar.f529037d = aVar2.k(intValue);
                return 0;
            case 2:
                xVar.f529038e = aVar2.i(intValue);
                return 0;
            case 3:
                xVar.f529039f = aVar2.i(intValue);
                return 0;
            case 4:
                xVar.f529040g = aVar2.k(intValue);
                return 0;
            case 5:
                xVar.f529041h = aVar2.k(intValue);
                return 0;
            case 6:
                xVar.f529042i.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}

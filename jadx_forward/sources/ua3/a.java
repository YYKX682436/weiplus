package ua3;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f507502d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f507503e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public double f507504f;

    /* renamed from: g, reason: collision with root package name */
    public double f507505g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f507506h;

    /* renamed from: i, reason: collision with root package name */
    public long f507507i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ua3.a)) {
            return false;
        }
        ua3.a aVar = (ua3.a) fVar;
        return n51.f.a(this.f507502d, aVar.f507502d) && n51.f.a(this.f507503e, aVar.f507503e) && n51.f.a(java.lang.Double.valueOf(this.f507504f), java.lang.Double.valueOf(aVar.f507504f)) && n51.f.a(java.lang.Double.valueOf(this.f507505g), java.lang.Double.valueOf(aVar.f507505g)) && n51.f.a(this.f507506h, aVar.f507506h) && n51.f.a(java.lang.Long.valueOf(this.f507507i), java.lang.Long.valueOf(aVar.f507507i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f507502d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.f507503e);
            fVar.c(3, this.f507504f);
            fVar.c(4, this.f507505g);
            java.lang.String str2 = this.f507506h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f507507i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f507502d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 1, this.f507503e) + b36.f.c(3, this.f507504f) + b36.f.c(4, this.f507505g);
            java.lang.String str4 = this.f507506h;
            if (str4 != null) {
                j17 += b36.f.j(5, str4);
            }
            return j17 + b36.f.h(6, this.f507507i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f507503e.clear();
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
        ua3.a aVar3 = (ua3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f507502d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f507503e.add(aVar2.k(intValue));
                return 0;
            case 3:
                aVar3.f507504f = aVar2.e(intValue);
                return 0;
            case 4:
                aVar3.f507505g = aVar2.e(intValue);
                return 0;
            case 5:
                aVar3.f507506h = aVar2.k(intValue);
                return 0;
            case 6:
                aVar3.f507507i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

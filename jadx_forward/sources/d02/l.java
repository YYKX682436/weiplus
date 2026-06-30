package d02;

/* loaded from: classes2.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f306866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f306867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f306868f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306869g;

    /* renamed from: h, reason: collision with root package name */
    public int f306870h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f306871i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.l)) {
            return false;
        }
        d02.l lVar = (d02.l) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f306866d), java.lang.Boolean.valueOf(lVar.f306866d)) && n51.f.a(this.f306867e, lVar.f306867e) && n51.f.a(this.f306868f, lVar.f306868f) && n51.f.a(this.f306869g, lVar.f306869g) && n51.f.a(java.lang.Integer.valueOf(this.f306870h), java.lang.Integer.valueOf(lVar.f306870h)) && n51.f.a(java.lang.Boolean.valueOf(this.f306871i), java.lang.Boolean.valueOf(lVar.f306871i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f306866d);
            java.lang.String str = this.f306867e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f306868f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f306869g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f306870h);
            fVar.a(6, this.f306871i);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f306866d) + 0;
            java.lang.String str4 = this.f306867e;
            if (str4 != null) {
                a17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f306868f;
            if (str5 != null) {
                a17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f306869g;
            if (str6 != null) {
                a17 += b36.f.j(4, str6);
            }
            return a17 + b36.f.e(5, this.f306870h) + b36.f.a(6, this.f306871i);
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
        d02.l lVar = (d02.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f306866d = aVar2.c(intValue);
                return 0;
            case 2:
                lVar.f306867e = aVar2.k(intValue);
                return 0;
            case 3:
                lVar.f306868f = aVar2.k(intValue);
                return 0;
            case 4:
                lVar.f306869g = aVar2.k(intValue);
                return 0;
            case 5:
                lVar.f306870h = aVar2.g(intValue);
                return 0;
            case 6:
                lVar.f306871i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

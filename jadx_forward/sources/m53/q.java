package m53;

/* loaded from: classes8.dex */
public class q extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405502d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405503e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405504f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405505g;

    /* renamed from: h, reason: collision with root package name */
    public int f405506h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405507i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.q)) {
            return false;
        }
        m53.q qVar = (m53.q) fVar;
        return n51.f.a(this.f405502d, qVar.f405502d) && n51.f.a(this.f405503e, qVar.f405503e) && n51.f.a(this.f405504f, qVar.f405504f) && n51.f.a(this.f405505g, qVar.f405505g) && n51.f.a(java.lang.Integer.valueOf(this.f405506h), java.lang.Integer.valueOf(qVar.f405506h)) && n51.f.a(this.f405507i, qVar.f405507i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405502d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405503e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405504f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405505g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f405506h);
            java.lang.String str5 = this.f405507i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f405502d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f405503e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f405504f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f405505g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f405506h);
            java.lang.String str10 = this.f405507i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        m53.q qVar = (m53.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qVar.f405502d = aVar2.k(intValue);
                return 0;
            case 2:
                qVar.f405503e = aVar2.k(intValue);
                return 0;
            case 3:
                qVar.f405504f = aVar2.k(intValue);
                return 0;
            case 4:
                qVar.f405505g = aVar2.k(intValue);
                return 0;
            case 5:
                qVar.f405506h = aVar2.g(intValue);
                return 0;
            case 6:
                qVar.f405507i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

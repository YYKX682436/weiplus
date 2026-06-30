package r45;

/* loaded from: classes11.dex */
public class pj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464618d;

    /* renamed from: e, reason: collision with root package name */
    public int f464619e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464620f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464621g;

    /* renamed from: h, reason: collision with root package name */
    public int f464622h;

    /* renamed from: i, reason: collision with root package name */
    public int f464623i;

    /* renamed from: m, reason: collision with root package name */
    public int f464624m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464625n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464626o;

    /* renamed from: p, reason: collision with root package name */
    public int f464627p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pj)) {
            return false;
        }
        r45.pj pjVar = (r45.pj) fVar;
        return n51.f.a(this.f464618d, pjVar.f464618d) && n51.f.a(java.lang.Integer.valueOf(this.f464619e), java.lang.Integer.valueOf(pjVar.f464619e)) && n51.f.a(this.f464620f, pjVar.f464620f) && n51.f.a(this.f464621g, pjVar.f464621g) && n51.f.a(java.lang.Integer.valueOf(this.f464622h), java.lang.Integer.valueOf(pjVar.f464622h)) && n51.f.a(java.lang.Integer.valueOf(this.f464623i), java.lang.Integer.valueOf(pjVar.f464623i)) && n51.f.a(java.lang.Integer.valueOf(this.f464624m), java.lang.Integer.valueOf(pjVar.f464624m)) && n51.f.a(this.f464625n, pjVar.f464625n) && n51.f.a(this.f464626o, pjVar.f464626o) && n51.f.a(java.lang.Integer.valueOf(this.f464627p), java.lang.Integer.valueOf(pjVar.f464627p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464618d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464619e);
            java.lang.String str2 = this.f464620f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f464621g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f464622h);
            fVar.e(6, this.f464623i);
            fVar.e(7, this.f464624m);
            java.lang.String str4 = this.f464625n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f464626o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f464627p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f464618d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f464619e);
            java.lang.String str7 = this.f464620f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f464621g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int e17 = j17 + b36.f.e(5, this.f464622h) + b36.f.e(6, this.f464623i) + b36.f.e(7, this.f464624m);
            java.lang.String str9 = this.f464625n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f464626o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f464627p);
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
        r45.pj pjVar = (r45.pj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pjVar.f464618d = aVar2.k(intValue);
                return 0;
            case 2:
                pjVar.f464619e = aVar2.g(intValue);
                return 0;
            case 3:
                pjVar.f464620f = aVar2.k(intValue);
                return 0;
            case 4:
                pjVar.f464621g = aVar2.k(intValue);
                return 0;
            case 5:
                pjVar.f464622h = aVar2.g(intValue);
                return 0;
            case 6:
                pjVar.f464623i = aVar2.g(intValue);
                return 0;
            case 7:
                pjVar.f464624m = aVar2.g(intValue);
                return 0;
            case 8:
                pjVar.f464625n = aVar2.k(intValue);
                return 0;
            case 9:
                pjVar.f464626o = aVar2.k(intValue);
                return 0;
            case 10:
                pjVar.f464627p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

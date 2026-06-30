package r45;

/* loaded from: classes9.dex */
public class me5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461950d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461951e;

    /* renamed from: f, reason: collision with root package name */
    public int f461952f;

    /* renamed from: g, reason: collision with root package name */
    public long f461953g;

    /* renamed from: h, reason: collision with root package name */
    public int f461954h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461955i;

    /* renamed from: m, reason: collision with root package name */
    public int f461956m;

    /* renamed from: n, reason: collision with root package name */
    public int f461957n;

    /* renamed from: o, reason: collision with root package name */
    public int f461958o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me5)) {
            return false;
        }
        r45.me5 me5Var = (r45.me5) fVar;
        return n51.f.a(this.f76494x2de60e5e, me5Var.f76494x2de60e5e) && n51.f.a(this.f461950d, me5Var.f461950d) && n51.f.a(this.f461951e, me5Var.f461951e) && n51.f.a(java.lang.Integer.valueOf(this.f461952f), java.lang.Integer.valueOf(me5Var.f461952f)) && n51.f.a(java.lang.Long.valueOf(this.f461953g), java.lang.Long.valueOf(me5Var.f461953g)) && n51.f.a(java.lang.Integer.valueOf(this.f461954h), java.lang.Integer.valueOf(me5Var.f461954h)) && n51.f.a(this.f461955i, me5Var.f461955i) && n51.f.a(java.lang.Integer.valueOf(this.f461956m), java.lang.Integer.valueOf(me5Var.f461956m)) && n51.f.a(java.lang.Integer.valueOf(this.f461957n), java.lang.Integer.valueOf(me5Var.f461957n)) && n51.f.a(java.lang.Integer.valueOf(this.f461958o), java.lang.Integer.valueOf(me5Var.f461958o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461950d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461951e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f461952f);
            fVar.h(5, this.f461953g);
            fVar.e(6, this.f461954h);
            java.lang.String str3 = this.f461955i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f461956m);
            fVar.e(9, this.f461957n);
            fVar.e(10, this.f461958o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f461950d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f461951e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f461952f) + b36.f.h(5, this.f461953g) + b36.f.e(6, this.f461954h);
            java.lang.String str6 = this.f461955i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f461956m) + b36.f.e(9, this.f461957n) + b36.f.e(10, this.f461958o);
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
        r45.me5 me5Var = (r45.me5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    me5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                me5Var.f461950d = aVar2.k(intValue);
                return 0;
            case 3:
                me5Var.f461951e = aVar2.k(intValue);
                return 0;
            case 4:
                me5Var.f461952f = aVar2.g(intValue);
                return 0;
            case 5:
                me5Var.f461953g = aVar2.i(intValue);
                return 0;
            case 6:
                me5Var.f461954h = aVar2.g(intValue);
                return 0;
            case 7:
                me5Var.f461955i = aVar2.k(intValue);
                return 0;
            case 8:
                me5Var.f461956m = aVar2.g(intValue);
                return 0;
            case 9:
                me5Var.f461957n = aVar2.g(intValue);
                return 0;
            case 10:
                me5Var.f461958o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

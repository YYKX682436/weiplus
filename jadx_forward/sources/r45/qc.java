package r45;

/* loaded from: classes12.dex */
public class qc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465351d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465352e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465353f;

    /* renamed from: g, reason: collision with root package name */
    public int f465354g;

    /* renamed from: h, reason: collision with root package name */
    public long f465355h;

    /* renamed from: i, reason: collision with root package name */
    public int f465356i;

    /* renamed from: m, reason: collision with root package name */
    public int f465357m;

    /* renamed from: n, reason: collision with root package name */
    public long f465358n;

    /* renamed from: o, reason: collision with root package name */
    public long f465359o;

    /* renamed from: p, reason: collision with root package name */
    public long f465360p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465361q;

    /* renamed from: r, reason: collision with root package name */
    public long f465362r;

    /* renamed from: s, reason: collision with root package name */
    public double f465363s;

    /* renamed from: t, reason: collision with root package name */
    public int f465364t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f465365u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qc)) {
            return false;
        }
        r45.qc qcVar = (r45.qc) fVar;
        return n51.f.a(this.f465351d, qcVar.f465351d) && n51.f.a(this.f465352e, qcVar.f465352e) && n51.f.a(this.f465353f, qcVar.f465353f) && n51.f.a(java.lang.Integer.valueOf(this.f465354g), java.lang.Integer.valueOf(qcVar.f465354g)) && n51.f.a(java.lang.Long.valueOf(this.f465355h), java.lang.Long.valueOf(qcVar.f465355h)) && n51.f.a(java.lang.Integer.valueOf(this.f465356i), java.lang.Integer.valueOf(qcVar.f465356i)) && n51.f.a(java.lang.Integer.valueOf(this.f465357m), java.lang.Integer.valueOf(qcVar.f465357m)) && n51.f.a(java.lang.Long.valueOf(this.f465358n), java.lang.Long.valueOf(qcVar.f465358n)) && n51.f.a(java.lang.Long.valueOf(this.f465359o), java.lang.Long.valueOf(qcVar.f465359o)) && n51.f.a(java.lang.Long.valueOf(this.f465360p), java.lang.Long.valueOf(qcVar.f465360p)) && n51.f.a(this.f465361q, qcVar.f465361q) && n51.f.a(java.lang.Long.valueOf(this.f465362r), java.lang.Long.valueOf(qcVar.f465362r)) && n51.f.a(java.lang.Double.valueOf(this.f465363s), java.lang.Double.valueOf(qcVar.f465363s)) && n51.f.a(java.lang.Integer.valueOf(this.f465364t), java.lang.Integer.valueOf(qcVar.f465364t)) && n51.f.a(this.f465365u, qcVar.f465365u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465351d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465352e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465353f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f465354g);
            fVar.h(5, this.f465355h);
            fVar.e(6, this.f465356i);
            fVar.e(7, this.f465357m);
            fVar.h(8, this.f465358n);
            fVar.h(9, this.f465359o);
            fVar.h(10, this.f465360p);
            java.lang.String str4 = this.f465361q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.h(12, this.f465362r);
            fVar.c(13, this.f465363s);
            fVar.e(14, this.f465364t);
            java.lang.String str5 = this.f465365u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f465351d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f465352e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f465353f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f465354g) + b36.f.h(5, this.f465355h) + b36.f.e(6, this.f465356i) + b36.f.e(7, this.f465357m) + b36.f.h(8, this.f465358n) + b36.f.h(9, this.f465359o) + b36.f.h(10, this.f465360p);
            java.lang.String str9 = this.f465361q;
            if (str9 != null) {
                e17 += b36.f.j(11, str9);
            }
            int h17 = e17 + b36.f.h(12, this.f465362r) + b36.f.c(13, this.f465363s) + b36.f.e(14, this.f465364t);
            java.lang.String str10 = this.f465365u;
            return str10 != null ? h17 + b36.f.j(15, str10) : h17;
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
        r45.qc qcVar = (r45.qc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qcVar.f465351d = aVar2.k(intValue);
                return 0;
            case 2:
                qcVar.f465352e = aVar2.k(intValue);
                return 0;
            case 3:
                qcVar.f465353f = aVar2.k(intValue);
                return 0;
            case 4:
                qcVar.f465354g = aVar2.g(intValue);
                return 0;
            case 5:
                qcVar.f465355h = aVar2.i(intValue);
                return 0;
            case 6:
                qcVar.f465356i = aVar2.g(intValue);
                return 0;
            case 7:
                qcVar.f465357m = aVar2.g(intValue);
                return 0;
            case 8:
                qcVar.f465358n = aVar2.i(intValue);
                return 0;
            case 9:
                qcVar.f465359o = aVar2.i(intValue);
                return 0;
            case 10:
                qcVar.f465360p = aVar2.i(intValue);
                return 0;
            case 11:
                qcVar.f465361q = aVar2.k(intValue);
                return 0;
            case 12:
                qcVar.f465362r = aVar2.i(intValue);
                return 0;
            case 13:
                qcVar.f465363s = aVar2.e(intValue);
                return 0;
            case 14:
                qcVar.f465364t = aVar2.g(intValue);
                return 0;
            case 15:
                qcVar.f465365u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes11.dex */
public class mq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462283d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462284e;

    /* renamed from: f, reason: collision with root package name */
    public int f462285f;

    /* renamed from: g, reason: collision with root package name */
    public int f462286g;

    /* renamed from: h, reason: collision with root package name */
    public int f462287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462288i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462289m;

    /* renamed from: n, reason: collision with root package name */
    public int f462290n;

    /* renamed from: o, reason: collision with root package name */
    public int f462291o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462292p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462293q;

    /* renamed from: r, reason: collision with root package name */
    public r45.oq6 f462294r;

    /* renamed from: s, reason: collision with root package name */
    public int f462295s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qk0 f462296t;

    /* renamed from: u, reason: collision with root package name */
    public r45.qk0 f462297u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mq6)) {
            return false;
        }
        r45.mq6 mq6Var = (r45.mq6) fVar;
        return n51.f.a(this.f462283d, mq6Var.f462283d) && n51.f.a(this.f462284e, mq6Var.f462284e) && n51.f.a(java.lang.Integer.valueOf(this.f462285f), java.lang.Integer.valueOf(mq6Var.f462285f)) && n51.f.a(java.lang.Integer.valueOf(this.f462286g), java.lang.Integer.valueOf(mq6Var.f462286g)) && n51.f.a(java.lang.Integer.valueOf(this.f462287h), java.lang.Integer.valueOf(mq6Var.f462287h)) && n51.f.a(this.f462288i, mq6Var.f462288i) && n51.f.a(this.f462289m, mq6Var.f462289m) && n51.f.a(java.lang.Integer.valueOf(this.f462290n), java.lang.Integer.valueOf(mq6Var.f462290n)) && n51.f.a(java.lang.Integer.valueOf(this.f462291o), java.lang.Integer.valueOf(mq6Var.f462291o)) && n51.f.a(this.f462292p, mq6Var.f462292p) && n51.f.a(this.f462293q, mq6Var.f462293q) && n51.f.a(this.f462294r, mq6Var.f462294r) && n51.f.a(java.lang.Integer.valueOf(this.f462295s), java.lang.Integer.valueOf(mq6Var.f462295s)) && n51.f.a(this.f462296t, mq6Var.f462296t) && n51.f.a(this.f462297u, mq6Var.f462297u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462283d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462284e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462285f);
            fVar.e(4, this.f462286g);
            fVar.e(5, this.f462287h);
            java.lang.String str3 = this.f462288i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f462289m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f462290n);
            fVar.e(9, this.f462291o);
            java.lang.String str5 = this.f462292p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f462293q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.oq6 oq6Var = this.f462294r;
            if (oq6Var != null) {
                fVar.i(12, oq6Var.mo75928xcd1e8d8());
                this.f462294r.mo75956x3d5d1f78(fVar);
            }
            fVar.e(13, this.f462295s);
            r45.qk0 qk0Var = this.f462296t;
            if (qk0Var != null) {
                fVar.i(14, qk0Var.mo75928xcd1e8d8());
                this.f462296t.mo75956x3d5d1f78(fVar);
            }
            r45.qk0 qk0Var2 = this.f462297u;
            if (qk0Var2 != null) {
                fVar.i(15, qk0Var2.mo75928xcd1e8d8());
                this.f462297u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f462283d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f462284e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f462285f) + b36.f.e(4, this.f462286g) + b36.f.e(5, this.f462287h);
            java.lang.String str9 = this.f462288i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f462289m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f462290n) + b36.f.e(9, this.f462291o);
            java.lang.String str11 = this.f462292p;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f462293q;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            r45.oq6 oq6Var2 = this.f462294r;
            if (oq6Var2 != null) {
                e18 += b36.f.i(12, oq6Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(13, this.f462295s);
            r45.qk0 qk0Var3 = this.f462296t;
            if (qk0Var3 != null) {
                e19 += b36.f.i(14, qk0Var3.mo75928xcd1e8d8());
            }
            r45.qk0 qk0Var4 = this.f462297u;
            return qk0Var4 != null ? e19 + b36.f.i(15, qk0Var4.mo75928xcd1e8d8()) : e19;
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
        r45.mq6 mq6Var = (r45.mq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mq6Var.f462283d = aVar2.k(intValue);
                return 0;
            case 2:
                mq6Var.f462284e = aVar2.k(intValue);
                return 0;
            case 3:
                mq6Var.f462285f = aVar2.g(intValue);
                return 0;
            case 4:
                mq6Var.f462286g = aVar2.g(intValue);
                return 0;
            case 5:
                mq6Var.f462287h = aVar2.g(intValue);
                return 0;
            case 6:
                mq6Var.f462288i = aVar2.k(intValue);
                return 0;
            case 7:
                mq6Var.f462289m = aVar2.k(intValue);
                return 0;
            case 8:
                mq6Var.f462290n = aVar2.g(intValue);
                return 0;
            case 9:
                mq6Var.f462291o = aVar2.g(intValue);
                return 0;
            case 10:
                mq6Var.f462292p = aVar2.k(intValue);
                return 0;
            case 11:
                mq6Var.f462293q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.oq6 oq6Var3 = new r45.oq6();
                    if (bArr != null && bArr.length > 0) {
                        oq6Var3.mo11468x92b714fd(bArr);
                    }
                    mq6Var.f462294r = oq6Var3;
                }
                return 0;
            case 13:
                mq6Var.f462295s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.qk0 qk0Var5 = new r45.qk0();
                    if (bArr2 != null && bArr2.length > 0) {
                        qk0Var5.mo11468x92b714fd(bArr2);
                    }
                    mq6Var.f462296t = qk0Var5;
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.qk0 qk0Var6 = new r45.qk0();
                    if (bArr3 != null && bArr3.length > 0) {
                        qk0Var6.mo11468x92b714fd(bArr3);
                    }
                    mq6Var.f462297u = qk0Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}

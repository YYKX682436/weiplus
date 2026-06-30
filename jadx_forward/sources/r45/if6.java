package r45;

/* loaded from: classes4.dex */
public class if6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458528d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458529e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458530f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458531g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458532h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458533i;

    /* renamed from: m, reason: collision with root package name */
    public int f458534m;

    /* renamed from: n, reason: collision with root package name */
    public int f458535n;

    /* renamed from: o, reason: collision with root package name */
    public int f458536o;

    /* renamed from: p, reason: collision with root package name */
    public int f458537p;

    /* renamed from: q, reason: collision with root package name */
    public int f458538q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f458539r;

    /* renamed from: s, reason: collision with root package name */
    public r45.df6 f458540s;

    /* renamed from: t, reason: collision with root package name */
    public int f458541t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.if6)) {
            return false;
        }
        r45.if6 if6Var = (r45.if6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458528d), java.lang.Long.valueOf(if6Var.f458528d)) && n51.f.a(this.f458529e, if6Var.f458529e) && n51.f.a(this.f458530f, if6Var.f458530f) && n51.f.a(this.f458531g, if6Var.f458531g) && n51.f.a(this.f458532h, if6Var.f458532h) && n51.f.a(this.f458533i, if6Var.f458533i) && n51.f.a(java.lang.Integer.valueOf(this.f458534m), java.lang.Integer.valueOf(if6Var.f458534m)) && n51.f.a(java.lang.Integer.valueOf(this.f458535n), java.lang.Integer.valueOf(if6Var.f458535n)) && n51.f.a(java.lang.Integer.valueOf(this.f458536o), java.lang.Integer.valueOf(if6Var.f458536o)) && n51.f.a(java.lang.Integer.valueOf(this.f458537p), java.lang.Integer.valueOf(if6Var.f458537p)) && n51.f.a(java.lang.Integer.valueOf(this.f458538q), java.lang.Integer.valueOf(if6Var.f458538q)) && n51.f.a(this.f458539r, if6Var.f458539r) && n51.f.a(this.f458540s, if6Var.f458540s) && n51.f.a(java.lang.Integer.valueOf(this.f458541t), java.lang.Integer.valueOf(if6Var.f458541t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458528d);
            java.lang.String str = this.f458529e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458530f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f458531g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f458532h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f458533i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f458534m);
            fVar.e(8, this.f458535n);
            fVar.e(9, this.f458536o);
            fVar.e(10, this.f458537p);
            fVar.e(11, this.f458538q);
            java.lang.String str6 = this.f458539r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            r45.df6 df6Var = this.f458540s;
            if (df6Var != null) {
                fVar.i(13, df6Var.mo75928xcd1e8d8());
                this.f458540s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(14, this.f458541t);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f458528d) + 0;
            java.lang.String str7 = this.f458529e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f458530f;
            if (str8 != null) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f458531g;
            if (str9 != null) {
                h17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f458532h;
            if (str10 != null) {
                h17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f458533i;
            if (str11 != null) {
                h17 += b36.f.j(6, str11);
            }
            int e17 = h17 + b36.f.e(7, this.f458534m) + b36.f.e(8, this.f458535n) + b36.f.e(9, this.f458536o) + b36.f.e(10, this.f458537p) + b36.f.e(11, this.f458538q);
            java.lang.String str12 = this.f458539r;
            if (str12 != null) {
                e17 += b36.f.j(12, str12);
            }
            r45.df6 df6Var2 = this.f458540s;
            if (df6Var2 != null) {
                e17 += b36.f.i(13, df6Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(14, this.f458541t);
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
        r45.if6 if6Var = (r45.if6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                if6Var.f458528d = aVar2.i(intValue);
                return 0;
            case 2:
                if6Var.f458529e = aVar2.k(intValue);
                return 0;
            case 3:
                if6Var.f458530f = aVar2.k(intValue);
                return 0;
            case 4:
                if6Var.f458531g = aVar2.k(intValue);
                return 0;
            case 5:
                if6Var.f458532h = aVar2.k(intValue);
                return 0;
            case 6:
                if6Var.f458533i = aVar2.k(intValue);
                return 0;
            case 7:
                if6Var.f458534m = aVar2.g(intValue);
                return 0;
            case 8:
                if6Var.f458535n = aVar2.g(intValue);
                return 0;
            case 9:
                if6Var.f458536o = aVar2.g(intValue);
                return 0;
            case 10:
                if6Var.f458537p = aVar2.g(intValue);
                return 0;
            case 11:
                if6Var.f458538q = aVar2.g(intValue);
                return 0;
            case 12:
                if6Var.f458539r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.df6 df6Var3 = new r45.df6();
                    if (bArr != null && bArr.length > 0) {
                        df6Var3.mo11468x92b714fd(bArr);
                    }
                    if6Var.f458540s = df6Var3;
                }
                return 0;
            case 14:
                if6Var.f458541t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

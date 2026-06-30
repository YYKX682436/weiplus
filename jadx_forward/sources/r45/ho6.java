package r45;

/* loaded from: classes10.dex */
public class ho6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457866d;

    /* renamed from: e, reason: collision with root package name */
    public int f457867e;

    /* renamed from: f, reason: collision with root package name */
    public long f457868f;

    /* renamed from: g, reason: collision with root package name */
    public long f457869g;

    /* renamed from: h, reason: collision with root package name */
    public long f457870h;

    /* renamed from: i, reason: collision with root package name */
    public long f457871i;

    /* renamed from: m, reason: collision with root package name */
    public long f457872m;

    /* renamed from: n, reason: collision with root package name */
    public int f457873n;

    /* renamed from: o, reason: collision with root package name */
    public int f457874o;

    /* renamed from: p, reason: collision with root package name */
    public float f457875p;

    /* renamed from: q, reason: collision with root package name */
    public float f457876q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ka0 f457877r;

    /* renamed from: s, reason: collision with root package name */
    public int f457878s;

    /* renamed from: t, reason: collision with root package name */
    public r45.wp6 f457879t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ho6)) {
            return false;
        }
        r45.ho6 ho6Var = (r45.ho6) fVar;
        return n51.f.a(this.f457866d, ho6Var.f457866d) && n51.f.a(java.lang.Integer.valueOf(this.f457867e), java.lang.Integer.valueOf(ho6Var.f457867e)) && n51.f.a(java.lang.Long.valueOf(this.f457868f), java.lang.Long.valueOf(ho6Var.f457868f)) && n51.f.a(java.lang.Long.valueOf(this.f457869g), java.lang.Long.valueOf(ho6Var.f457869g)) && n51.f.a(java.lang.Long.valueOf(this.f457870h), java.lang.Long.valueOf(ho6Var.f457870h)) && n51.f.a(java.lang.Long.valueOf(this.f457871i), java.lang.Long.valueOf(ho6Var.f457871i)) && n51.f.a(java.lang.Long.valueOf(this.f457872m), java.lang.Long.valueOf(ho6Var.f457872m)) && n51.f.a(java.lang.Integer.valueOf(this.f457873n), java.lang.Integer.valueOf(ho6Var.f457873n)) && n51.f.a(java.lang.Integer.valueOf(this.f457874o), java.lang.Integer.valueOf(ho6Var.f457874o)) && n51.f.a(java.lang.Float.valueOf(this.f457875p), java.lang.Float.valueOf(ho6Var.f457875p)) && n51.f.a(java.lang.Float.valueOf(this.f457876q), java.lang.Float.valueOf(ho6Var.f457876q)) && n51.f.a(this.f457877r, ho6Var.f457877r) && n51.f.a(java.lang.Integer.valueOf(this.f457878s), java.lang.Integer.valueOf(ho6Var.f457878s)) && n51.f.a(this.f457879t, ho6Var.f457879t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457866d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f457867e);
            fVar.h(3, this.f457868f);
            fVar.h(4, this.f457869g);
            fVar.h(5, this.f457870h);
            fVar.h(6, this.f457871i);
            fVar.h(7, this.f457872m);
            fVar.e(8, this.f457873n);
            fVar.e(9, this.f457874o);
            fVar.d(10, this.f457875p);
            fVar.d(11, this.f457876q);
            r45.ka0 ka0Var = this.f457877r;
            if (ka0Var != null) {
                fVar.i(12, ka0Var.mo75928xcd1e8d8());
                this.f457877r.mo75956x3d5d1f78(fVar);
            }
            fVar.e(13, this.f457878s);
            r45.wp6 wp6Var = this.f457879t;
            if (wp6Var != null) {
                fVar.i(14, wp6Var.mo75928xcd1e8d8());
                this.f457879t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f457866d;
            int j17 = (str2 != null ? b36.f.j(1, str2) + 0 : 0) + b36.f.e(2, this.f457867e) + b36.f.h(3, this.f457868f) + b36.f.h(4, this.f457869g) + b36.f.h(5, this.f457870h) + b36.f.h(6, this.f457871i) + b36.f.h(7, this.f457872m) + b36.f.e(8, this.f457873n) + b36.f.e(9, this.f457874o) + b36.f.d(10, this.f457875p) + b36.f.d(11, this.f457876q);
            r45.ka0 ka0Var2 = this.f457877r;
            if (ka0Var2 != null) {
                j17 += b36.f.i(12, ka0Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(13, this.f457878s);
            r45.wp6 wp6Var2 = this.f457879t;
            return wp6Var2 != null ? e17 + b36.f.i(14, wp6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.ho6 ho6Var = (r45.ho6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ho6Var.f457866d = aVar2.k(intValue);
                return 0;
            case 2:
                ho6Var.f457867e = aVar2.g(intValue);
                return 0;
            case 3:
                ho6Var.f457868f = aVar2.i(intValue);
                return 0;
            case 4:
                ho6Var.f457869g = aVar2.i(intValue);
                return 0;
            case 5:
                ho6Var.f457870h = aVar2.i(intValue);
                return 0;
            case 6:
                ho6Var.f457871i = aVar2.i(intValue);
                return 0;
            case 7:
                ho6Var.f457872m = aVar2.i(intValue);
                return 0;
            case 8:
                ho6Var.f457873n = aVar2.g(intValue);
                return 0;
            case 9:
                ho6Var.f457874o = aVar2.g(intValue);
                return 0;
            case 10:
                ho6Var.f457875p = aVar2.f(intValue);
                return 0;
            case 11:
                ho6Var.f457876q = aVar2.f(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ka0 ka0Var3 = new r45.ka0();
                    if (bArr != null && bArr.length > 0) {
                        ka0Var3.mo11468x92b714fd(bArr);
                    }
                    ho6Var.f457877r = ka0Var3;
                }
                return 0;
            case 13:
                ho6Var.f457878s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.wp6 wp6Var3 = new r45.wp6();
                    if (bArr2 != null && bArr2.length > 0) {
                        wp6Var3.mo11468x92b714fd(bArr2);
                    }
                    ho6Var.f457879t = wp6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

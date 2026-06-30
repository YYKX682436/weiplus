package r45;

/* loaded from: classes9.dex */
public class aq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451721d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451723f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451725h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451727m;

    /* renamed from: o, reason: collision with root package name */
    public int f451729o;

    /* renamed from: e, reason: collision with root package name */
    public boolean f451722e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451724g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f451726i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f451728n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f451730p = false;

    public final java.lang.String b() {
        return this.f451723f;
    }

    public final java.lang.String c() {
        return this.f451727m;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq0)) {
            return false;
        }
        r45.aq0 aq0Var = (r45.aq0) fVar;
        return n51.f.a(this.f451721d, aq0Var.f451721d) && n51.f.a(this.f451723f, aq0Var.f451723f) && n51.f.a(this.f451725h, aq0Var.f451725h) && n51.f.a(this.f451727m, aq0Var.f451727m) && n51.f.a(java.lang.Integer.valueOf(this.f451729o), java.lang.Integer.valueOf(aq0Var.f451729o));
    }

    public final r45.aq0 d(java.lang.String str) {
        this.f451723f = str;
        this.f451724g = true;
        return this;
    }

    public final r45.aq0 e(java.lang.String str) {
        this.f451727m = str;
        this.f451728n = true;
        return this;
    }

    public final r45.aq0 f(java.lang.String str) {
        this.f451725h = str;
        this.f451726i = true;
        return this;
    }

    public final r45.aq0 g(java.lang.String str) {
        this.f451721d = str;
        this.f451722e = true;
        return this;
    }

    /* renamed from: getThumbUrl */
    public final java.lang.String m161567xd93f812f() {
        return this.f451725h;
    }

    /* renamed from: getTitle */
    public final java.lang.String m161568x7531c8a2() {
        return this.f451721d;
    }

    /* renamed from: getType */
    public final int m161569xfb85f7b0() {
        return this.f451729o;
    }

    public final r45.aq0 i(int i17) {
        this.f451729o = i17;
        this.f451730p = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451721d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451723f;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451725h;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f451727m;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            if (this.f451730p) {
                fVar.e(5, this.f451729o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f451721d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f451723f;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f451725h;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f451727m;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return this.f451730p ? j17 + b36.f.e(5, this.f451729o) : j17;
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
        r45.aq0 aq0Var = (r45.aq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aq0Var.f451721d = aVar2.k(intValue);
            aq0Var.f451722e = true;
            return 0;
        }
        if (intValue == 2) {
            aq0Var.f451723f = aVar2.k(intValue);
            aq0Var.f451724g = true;
            return 0;
        }
        if (intValue == 3) {
            aq0Var.f451725h = aVar2.k(intValue);
            aq0Var.f451726i = true;
            return 0;
        }
        if (intValue == 4) {
            aq0Var.f451727m = aVar2.k(intValue);
            aq0Var.f451728n = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aq0Var.f451729o = aVar2.g(intValue);
        aq0Var.f451730p = true;
        return 0;
    }
}

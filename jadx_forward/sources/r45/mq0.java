package r45;

/* loaded from: classes9.dex */
public class mq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462268d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462270f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462272h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462274m;

    /* renamed from: e, reason: collision with root package name */
    public boolean f462269e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f462271g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f462273i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f462275n = false;

    public final java.lang.String b() {
        return this.f462270f;
    }

    public final java.lang.String c() {
        return this.f462274m;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mq0)) {
            return false;
        }
        r45.mq0 mq0Var = (r45.mq0) fVar;
        return n51.f.a(this.f462268d, mq0Var.f462268d) && n51.f.a(this.f462270f, mq0Var.f462270f) && n51.f.a(this.f462272h, mq0Var.f462272h) && n51.f.a(this.f462274m, mq0Var.f462274m);
    }

    public final r45.mq0 d(java.lang.String str) {
        this.f462270f = str;
        this.f462271g = true;
        return this;
    }

    public final r45.mq0 e(java.lang.String str) {
        this.f462274m = str;
        this.f462275n = true;
        return this;
    }

    public final r45.mq0 f(java.lang.String str) {
        this.f462272h = str;
        this.f462273i = true;
        return this;
    }

    public final r45.mq0 g(java.lang.String str) {
        this.f462268d = str;
        this.f462269e = true;
        return this;
    }

    /* renamed from: getThumbUrl */
    public final java.lang.String m161687xd93f812f() {
        return this.f462272h;
    }

    /* renamed from: getTitle */
    public final java.lang.String m161688x7531c8a2() {
        return this.f462268d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462268d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462270f;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462272h;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f462274m;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f462268d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f462270f;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f462272h;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f462274m;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.mq0 mq0Var = (r45.mq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mq0Var.f462268d = aVar2.k(intValue);
            mq0Var.f462269e = true;
            return 0;
        }
        if (intValue == 2) {
            mq0Var.f462270f = aVar2.k(intValue);
            mq0Var.f462271g = true;
            return 0;
        }
        if (intValue == 3) {
            mq0Var.f462272h = aVar2.k(intValue);
            mq0Var.f462273i = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mq0Var.f462274m = aVar2.k(intValue);
        mq0Var.f462275n = true;
        return 0;
    }
}

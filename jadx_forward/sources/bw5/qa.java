package bw5;

/* loaded from: classes2.dex */
public class qa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: q, reason: collision with root package name */
    public static final bw5.qa f113550q = new bw5.qa();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113551d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113552e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113553f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113554g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f113555h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f113556i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f113557m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f113558n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f113559o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f113560p = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qa)) {
            return false;
        }
        bw5.qa qaVar = (bw5.qa) fVar;
        return n51.f.a(this.f113551d, qaVar.f113551d) && n51.f.a(this.f113552e, qaVar.f113552e) && n51.f.a(this.f113553f, qaVar.f113553f) && n51.f.a(this.f113554g, qaVar.f113554g) && n51.f.a(java.lang.Integer.valueOf(this.f113555h), java.lang.Integer.valueOf(qaVar.f113555h)) && n51.f.a(java.lang.Integer.valueOf(this.f113556i), java.lang.Integer.valueOf(qaVar.f113556i)) && n51.f.a(java.lang.Integer.valueOf(this.f113557m), java.lang.Integer.valueOf(qaVar.f113557m)) && n51.f.a(java.lang.Integer.valueOf(this.f113558n), java.lang.Integer.valueOf(qaVar.f113558n)) && n51.f.a(java.lang.Integer.valueOf(this.f113559o), java.lang.Integer.valueOf(qaVar.f113559o)) && n51.f.a(java.lang.Integer.valueOf(this.f113560p), java.lang.Integer.valueOf(qaVar.f113560p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113551d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113552e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113553f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f113554g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f113555h);
            fVar.e(6, this.f113556i);
            fVar.e(7, this.f113557m);
            fVar.e(8, this.f113558n);
            fVar.e(9, this.f113559o);
            fVar.e(10, this.f113560p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f113551d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f113552e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f113553f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f113554g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f113555h) + b36.f.e(6, this.f113556i) + b36.f.e(7, this.f113557m) + b36.f.e(8, this.f113558n) + b36.f.e(9, this.f113559o) + b36.f.e(10, this.f113560p);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f113551d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f113552e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f113553f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f113554g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f113555h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f113556i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f113557m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f113558n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f113559o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f113560p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.qa) super.mo11468x92b714fd(bArr);
    }
}

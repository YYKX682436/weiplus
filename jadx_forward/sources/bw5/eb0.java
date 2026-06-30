package bw5;

/* loaded from: classes2.dex */
public class eb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108345d;

    /* renamed from: e, reason: collision with root package name */
    public int f108346e;

    /* renamed from: f, reason: collision with root package name */
    public long f108347f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108348g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108349h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f108350i = new boolean[6];

    static {
        new bw5.eb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.eb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eb0)) {
            return false;
        }
        bw5.eb0 eb0Var = (bw5.eb0) fVar;
        return n51.f.a(this.f108345d, eb0Var.f108345d) && n51.f.a(java.lang.Integer.valueOf(this.f108346e), java.lang.Integer.valueOf(eb0Var.f108346e)) && n51.f.a(java.lang.Long.valueOf(this.f108347f), java.lang.Long.valueOf(eb0Var.f108347f)) && n51.f.a(this.f108348g, eb0Var.f108348g) && n51.f.a(this.f108349h, eb0Var.f108349h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.eb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108350i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108345d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108346e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f108347f);
            }
            java.lang.String str2 = this.f108348g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f108349h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f108345d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f108346e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f108347f);
            }
            java.lang.String str5 = this.f108348g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f108349h;
            return (str6 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str6);
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
        if (intValue == 1) {
            this.f108345d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108346e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f108347f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f108348g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f108349h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}

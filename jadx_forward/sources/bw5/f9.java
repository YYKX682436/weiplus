package bw5;

/* loaded from: classes2.dex */
public class f9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108724d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108725e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108726f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108727g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108728h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f108729i = new boolean[6];

    static {
        new bw5.f9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.f9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f9)) {
            return false;
        }
        bw5.f9 f9Var = (bw5.f9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108724d), java.lang.Integer.valueOf(f9Var.f108724d)) && n51.f.a(this.f108725e, f9Var.f108725e) && n51.f.a(this.f108726f, f9Var.f108726f) && n51.f.a(this.f108727g, f9Var.f108727g) && n51.f.a(this.f108728h, f9Var.f108728h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.f9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108729i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108724d);
            }
            java.lang.String str = this.f108725e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f108726f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f108727g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f108728h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108724d) : 0;
            java.lang.String str5 = this.f108725e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f108726f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f108727g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f108728h;
            return (str8 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str8);
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
            this.f108724d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108725e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f108726f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f108727g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f108728h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}

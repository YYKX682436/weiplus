package r45;

/* loaded from: classes2.dex */
public class q5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465215d;

    /* renamed from: e, reason: collision with root package name */
    public int f465216e;

    /* renamed from: f, reason: collision with root package name */
    public long f465217f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465218g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465219h;

    static {
        new r45.q5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.q5 mo11468x92b714fd(byte[] bArr) {
        return (r45.q5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q5)) {
            return false;
        }
        r45.q5 q5Var = (r45.q5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465215d), java.lang.Integer.valueOf(q5Var.f465215d)) && n51.f.a(java.lang.Integer.valueOf(this.f465216e), java.lang.Integer.valueOf(q5Var.f465216e)) && n51.f.a(java.lang.Long.valueOf(this.f465217f), java.lang.Long.valueOf(q5Var.f465217f)) && n51.f.a(this.f465218g, q5Var.f465218g) && n51.f.a(this.f465219h, q5Var.f465219h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.q5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465215d);
            fVar.e(2, this.f465216e);
            fVar.h(3, this.f465217f);
            java.lang.String str = this.f465218g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f465219h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465215d) + 0 + b36.f.e(2, this.f465216e) + b36.f.h(3, this.f465217f);
            java.lang.String str3 = this.f465218g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f465219h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
            this.f465215d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f465216e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f465217f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f465218g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f465219h = aVar2.k(intValue);
        return 0;
    }
}

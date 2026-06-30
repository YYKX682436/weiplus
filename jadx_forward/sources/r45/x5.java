package r45;

/* loaded from: classes2.dex */
public class x5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471315d;

    /* renamed from: e, reason: collision with root package name */
    public int f471316e;

    /* renamed from: f, reason: collision with root package name */
    public int f471317f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471318g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471319h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471320i;

    static {
        new r45.x5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.x5 mo11468x92b714fd(byte[] bArr) {
        return (r45.x5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x5)) {
            return false;
        }
        r45.x5 x5Var = (r45.x5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471315d), java.lang.Integer.valueOf(x5Var.f471315d)) && n51.f.a(java.lang.Integer.valueOf(this.f471316e), java.lang.Integer.valueOf(x5Var.f471316e)) && n51.f.a(java.lang.Integer.valueOf(this.f471317f), java.lang.Integer.valueOf(x5Var.f471317f)) && n51.f.a(this.f471318g, x5Var.f471318g) && n51.f.a(this.f471319h, x5Var.f471319h) && n51.f.a(this.f471320i, x5Var.f471320i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.x5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471315d);
            fVar.e(2, this.f471316e);
            fVar.e(3, this.f471317f);
            java.lang.String str = this.f471318g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f471319h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f471320i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471315d) + 0 + b36.f.e(2, this.f471316e) + b36.f.e(3, this.f471317f);
            java.lang.String str4 = this.f471318g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f471319h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f471320i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
                this.f471315d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f471316e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f471317f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f471318g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f471319h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f471320i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

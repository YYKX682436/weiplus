package r45;

/* loaded from: classes2.dex */
public class nj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462969d;

    /* renamed from: e, reason: collision with root package name */
    public int f462970e;

    /* renamed from: f, reason: collision with root package name */
    public int f462971f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462972g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462973h;

    static {
        new r45.nj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.nj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.nj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nj0)) {
            return false;
        }
        r45.nj0 nj0Var = (r45.nj0) fVar;
        return n51.f.a(this.f462969d, nj0Var.f462969d) && n51.f.a(java.lang.Integer.valueOf(this.f462970e), java.lang.Integer.valueOf(nj0Var.f462970e)) && n51.f.a(java.lang.Integer.valueOf(this.f462971f), java.lang.Integer.valueOf(nj0Var.f462971f)) && n51.f.a(this.f462972g, nj0Var.f462972g) && n51.f.a(this.f462973h, nj0Var.f462973h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.nj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462969d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f462970e);
            fVar.e(3, this.f462971f);
            java.lang.String str2 = this.f462972g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f462973h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f462969d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f462970e) + b36.f.e(3, this.f462971f);
            java.lang.String str5 = this.f462972g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f462973h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
            this.f462969d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f462970e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f462971f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f462972g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f462973h = aVar2.k(intValue);
        return 0;
    }
}

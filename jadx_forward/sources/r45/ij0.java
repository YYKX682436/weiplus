package r45;

/* loaded from: classes9.dex */
public class ij0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458624d;

    /* renamed from: e, reason: collision with root package name */
    public int f458625e;

    /* renamed from: f, reason: collision with root package name */
    public int f458626f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458627g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458628h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jj0 f458629i;

    static {
        new r45.ij0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.ij0 mo11468x92b714fd(byte[] bArr) {
        return (r45.ij0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ij0)) {
            return false;
        }
        r45.ij0 ij0Var = (r45.ij0) fVar;
        return n51.f.a(this.f458624d, ij0Var.f458624d) && n51.f.a(java.lang.Integer.valueOf(this.f458625e), java.lang.Integer.valueOf(ij0Var.f458625e)) && n51.f.a(java.lang.Integer.valueOf(this.f458626f), java.lang.Integer.valueOf(ij0Var.f458626f)) && n51.f.a(this.f458627g, ij0Var.f458627g) && n51.f.a(this.f458628h, ij0Var.f458628h) && n51.f.a(this.f458629i, ij0Var.f458629i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ij0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458624d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f458625e);
            fVar.e(3, this.f458626f);
            java.lang.String str2 = this.f458627g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f458628h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.jj0 jj0Var = this.f458629i;
            if (jj0Var != null) {
                fVar.i(6, jj0Var.mo75928xcd1e8d8());
                this.f458629i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458624d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f458625e) + b36.f.e(3, this.f458626f);
            java.lang.String str5 = this.f458627g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f458628h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            r45.jj0 jj0Var2 = this.f458629i;
            return jj0Var2 != null ? j17 + b36.f.i(6, jj0Var2.mo75928xcd1e8d8()) : j17;
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
                this.f458624d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f458625e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f458626f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f458627g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f458628h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.jj0 jj0Var3 = new r45.jj0();
                    if (bArr != null && bArr.length > 0) {
                        jj0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f458629i = jj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

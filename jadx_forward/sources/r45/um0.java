package r45;

/* loaded from: classes9.dex */
public class um0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469010d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469011e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469012f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469013g;

    static {
        new r45.um0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.um0 mo11468x92b714fd(byte[] bArr) {
        return (r45.um0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.um0)) {
            return false;
        }
        r45.um0 um0Var = (r45.um0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469010d), java.lang.Integer.valueOf(um0Var.f469010d)) && n51.f.a(this.f469011e, um0Var.f469011e) && n51.f.a(this.f469012f, um0Var.f469012f) && n51.f.a(this.f469013g, um0Var.f469013g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.um0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469010d);
            java.lang.String str = this.f469011e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f469012f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f469013g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469010d) + 0;
            java.lang.String str4 = this.f469011e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f469012f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f469013g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
            this.f469010d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f469011e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f469012f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f469013g = aVar2.k(intValue);
        return 0;
    }
}

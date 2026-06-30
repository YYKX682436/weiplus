package r45;

/* loaded from: classes9.dex */
public class vm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469887d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469888e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469889f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469890g;

    static {
        new r45.vm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vm0 mo11468x92b714fd(byte[] bArr) {
        return (r45.vm0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vm0)) {
            return false;
        }
        r45.vm0 vm0Var = (r45.vm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469887d), java.lang.Integer.valueOf(vm0Var.f469887d)) && n51.f.a(this.f469888e, vm0Var.f469888e) && n51.f.a(this.f469889f, vm0Var.f469889f) && n51.f.a(this.f469890g, vm0Var.f469890g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.vm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469887d);
            java.lang.String str = this.f469888e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f469889f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f469890g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469887d) + 0;
            java.lang.String str4 = this.f469888e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f469889f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f469890g;
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
            this.f469887d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f469888e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f469889f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f469890g = aVar2.k(intValue);
        return 0;
    }
}

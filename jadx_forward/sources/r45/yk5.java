package r45;

/* loaded from: classes4.dex */
public class yk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ri0 f472713d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472714e;

    /* renamed from: f, reason: collision with root package name */
    public int f472715f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472716g;

    /* renamed from: h, reason: collision with root package name */
    public int f472717h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472718i;

    static {
        new r45.yk5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.yk5 mo11468x92b714fd(byte[] bArr) {
        return (r45.yk5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yk5)) {
            return false;
        }
        r45.yk5 yk5Var = (r45.yk5) fVar;
        return n51.f.a(this.f472713d, yk5Var.f472713d) && n51.f.a(this.f472714e, yk5Var.f472714e) && n51.f.a(java.lang.Integer.valueOf(this.f472715f), java.lang.Integer.valueOf(yk5Var.f472715f)) && n51.f.a(this.f472716g, yk5Var.f472716g) && n51.f.a(java.lang.Integer.valueOf(this.f472717h), java.lang.Integer.valueOf(yk5Var.f472717h)) && n51.f.a(this.f472718i, yk5Var.f472718i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.yk5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ri0 ri0Var = this.f472713d;
            if (ri0Var != null) {
                fVar.i(1, ri0Var.mo75928xcd1e8d8());
                this.f472713d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472714e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f472715f);
            java.lang.String str2 = this.f472716g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f472717h);
            java.lang.String str3 = this.f472718i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ri0 ri0Var2 = this.f472713d;
            int i18 = ri0Var2 != null ? 0 + b36.f.i(1, ri0Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f472714e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f472715f);
            java.lang.String str5 = this.f472716g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            int e18 = e17 + b36.f.e(5, this.f472717h);
            java.lang.String str6 = this.f472718i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ri0 ri0Var3 = new r45.ri0();
                    if (bArr != null && bArr.length > 0) {
                        ri0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f472713d = ri0Var3;
                }
                return 0;
            case 2:
                this.f472714e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f472715f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f472716g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f472717h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f472718i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

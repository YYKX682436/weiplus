package r45;

/* loaded from: classes4.dex */
public class l35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460640d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460641e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460642f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460643g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460644h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460645i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460646m;

    static {
        new r45.l35();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.l35 mo11468x92b714fd(byte[] bArr) {
        return (r45.l35) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l35)) {
            return false;
        }
        r45.l35 l35Var = (r45.l35) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460640d), java.lang.Integer.valueOf(l35Var.f460640d)) && n51.f.a(this.f460641e, l35Var.f460641e) && n51.f.a(this.f460642f, l35Var.f460642f) && n51.f.a(this.f460643g, l35Var.f460643g) && n51.f.a(this.f460644h, l35Var.f460644h) && n51.f.a(this.f460645i, l35Var.f460645i) && n51.f.a(this.f460646m, l35Var.f460646m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.l35();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460640d);
            java.lang.String str = this.f460641e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460642f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460643g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f460644h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f460645i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f460646m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460640d) + 0;
            java.lang.String str7 = this.f460641e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f460642f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f460643g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f460644h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f460645i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f460646m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
                this.f460640d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f460641e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f460642f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f460643g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f460644h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f460645i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f460646m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

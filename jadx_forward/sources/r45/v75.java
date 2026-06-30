package r45;

/* loaded from: classes12.dex */
public class v75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final r45.v75 f469496n = new r45.v75();

    /* renamed from: d, reason: collision with root package name */
    public int f469497d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469498e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469499f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469500g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469501h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469502i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469503m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.v75 mo11468x92b714fd(byte[] bArr) {
        return (r45.v75) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v75)) {
            return false;
        }
        r45.v75 v75Var = (r45.v75) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469497d), java.lang.Integer.valueOf(v75Var.f469497d)) && n51.f.a(this.f469498e, v75Var.f469498e) && n51.f.a(this.f469499f, v75Var.f469499f) && n51.f.a(this.f469500g, v75Var.f469500g) && n51.f.a(this.f469501h, v75Var.f469501h) && n51.f.a(this.f469502i, v75Var.f469502i) && n51.f.a(this.f469503m, v75Var.f469503m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.v75();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469497d);
            java.lang.String str = this.f469498e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f469499f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f469500g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f469501h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f469502i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f469503m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469497d) + 0;
            java.lang.String str7 = this.f469498e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f469499f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f469500g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f469501h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f469502i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f469503m;
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
                this.f469497d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f469498e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f469499f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f469500g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f469501h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f469502i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f469503m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

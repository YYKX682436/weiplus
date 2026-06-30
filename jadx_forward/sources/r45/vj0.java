package r45;

/* loaded from: classes2.dex */
public class vj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469835f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469836g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469837h;

    /* renamed from: i, reason: collision with root package name */
    public int f469838i;

    /* renamed from: m, reason: collision with root package name */
    public int f469839m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469840n;

    /* renamed from: o, reason: collision with root package name */
    public int f469841o;

    static {
        new r45.vj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.vj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vj0)) {
            return false;
        }
        r45.vj0 vj0Var = (r45.vj0) fVar;
        return n51.f.a(this.f469833d, vj0Var.f469833d) && n51.f.a(this.f469834e, vj0Var.f469834e) && n51.f.a(this.f469835f, vj0Var.f469835f) && n51.f.a(this.f469836g, vj0Var.f469836g) && n51.f.a(this.f469837h, vj0Var.f469837h) && n51.f.a(java.lang.Integer.valueOf(this.f469838i), java.lang.Integer.valueOf(vj0Var.f469838i)) && n51.f.a(java.lang.Integer.valueOf(this.f469839m), java.lang.Integer.valueOf(vj0Var.f469839m)) && n51.f.a(this.f469840n, vj0Var.f469840n) && n51.f.a(java.lang.Integer.valueOf(this.f469841o), java.lang.Integer.valueOf(vj0Var.f469841o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.vj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469833d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469834e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469835f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469836g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f469837h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f469838i);
            fVar.e(7, this.f469839m);
            java.lang.String str6 = this.f469840n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f469841o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f469833d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f469834e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f469835f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f469836g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f469837h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f469838i) + b36.f.e(7, this.f469839m);
            java.lang.String str12 = this.f469840n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            return e17 + b36.f.e(9, this.f469841o);
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
                this.f469833d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f469834e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f469835f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f469836g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f469837h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f469838i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f469839m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f469840n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f469841o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

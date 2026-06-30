package r45;

/* loaded from: classes11.dex */
public class tj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468028d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468029e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468030f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468031g;

    /* renamed from: h, reason: collision with root package name */
    public int f468032h;

    /* renamed from: i, reason: collision with root package name */
    public int f468033i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468034m;

    /* renamed from: n, reason: collision with root package name */
    public int f468035n;

    /* renamed from: o, reason: collision with root package name */
    public long f468036o;

    static {
        new r45.tj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.tj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.tj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tj0)) {
            return false;
        }
        r45.tj0 tj0Var = (r45.tj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468028d), java.lang.Integer.valueOf(tj0Var.f468028d)) && n51.f.a(this.f468029e, tj0Var.f468029e) && n51.f.a(this.f468030f, tj0Var.f468030f) && n51.f.a(this.f468031g, tj0Var.f468031g) && n51.f.a(java.lang.Integer.valueOf(this.f468032h), java.lang.Integer.valueOf(tj0Var.f468032h)) && n51.f.a(java.lang.Integer.valueOf(this.f468033i), java.lang.Integer.valueOf(tj0Var.f468033i)) && n51.f.a(this.f468034m, tj0Var.f468034m) && n51.f.a(java.lang.Integer.valueOf(this.f468035n), java.lang.Integer.valueOf(tj0Var.f468035n)) && n51.f.a(java.lang.Long.valueOf(this.f468036o), java.lang.Long.valueOf(tj0Var.f468036o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.tj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468028d);
            java.lang.String str = this.f468029e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468030f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f468031g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f468032h);
            fVar.e(6, this.f468033i);
            java.lang.String str4 = this.f468034m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f468035n);
            fVar.h(9, this.f468036o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468028d) + 0;
            java.lang.String str5 = this.f468029e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f468030f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f468031g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f468032h) + b36.f.e(6, this.f468033i);
            java.lang.String str8 = this.f468034m;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            return e18 + b36.f.e(8, this.f468035n) + b36.f.h(9, this.f468036o);
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
                this.f468028d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f468029e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f468030f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f468031g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f468032h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f468033i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f468034m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f468035n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f468036o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

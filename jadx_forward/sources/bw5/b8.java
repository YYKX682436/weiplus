package bw5;

/* loaded from: classes9.dex */
public class b8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107094f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107096h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f107097i = new boolean[6];

    static {
        new bw5.b8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b8 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b8) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b8)) {
            return false;
        }
        bw5.b8 b8Var = (bw5.b8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107092d), java.lang.Integer.valueOf(b8Var.f107092d)) && n51.f.a(this.f107093e, b8Var.f107093e) && n51.f.a(this.f107094f, b8Var.f107094f) && n51.f.a(this.f107095g, b8Var.f107095g) && n51.f.a(this.f107096h, b8Var.f107096h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107097i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107092d);
            }
            java.lang.String str = this.f107093e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f107094f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f107095g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f107096h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107092d) : 0;
            java.lang.String str5 = this.f107093e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f107094f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f107095g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f107096h;
            return (str8 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str8);
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
            this.f107092d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107093e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107094f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f107095g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f107096h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}

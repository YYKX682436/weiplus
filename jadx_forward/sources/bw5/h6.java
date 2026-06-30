package bw5;

/* loaded from: classes4.dex */
public class h6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109619d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109620e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109621f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109622g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109623h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109624i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109625m = new boolean[7];

    static {
        new bw5.h6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h6 mo11468x92b714fd(byte[] bArr) {
        return (bw5.h6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h6)) {
            return false;
        }
        bw5.h6 h6Var = (bw5.h6) fVar;
        return n51.f.a(this.f109619d, h6Var.f109619d) && n51.f.a(this.f109620e, h6Var.f109620e) && n51.f.a(this.f109621f, h6Var.f109621f) && n51.f.a(this.f109622g, h6Var.f109622g) && n51.f.a(this.f109623h, h6Var.f109623h) && n51.f.a(this.f109624i, h6Var.f109624i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.h6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109625m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109619d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109620e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f109621f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f109622g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f109623h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f109624i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f109619d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f109620e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f109621f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f109622g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f109623h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f109624i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f109619d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109620e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109621f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109622g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109623h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109624i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

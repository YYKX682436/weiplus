package bw5;

/* loaded from: classes2.dex */
public class f60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108703d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108704e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108705f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108706g;

    /* renamed from: h, reason: collision with root package name */
    public int f108707h;

    /* renamed from: i, reason: collision with root package name */
    public int f108708i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f108709m = new boolean[7];

    static {
        new bw5.f60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.f60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f60)) {
            return false;
        }
        bw5.f60 f60Var = (bw5.f60) fVar;
        return n51.f.a(this.f108703d, f60Var.f108703d) && n51.f.a(this.f108704e, f60Var.f108704e) && n51.f.a(this.f108705f, f60Var.f108705f) && n51.f.a(this.f108706g, f60Var.f108706g) && n51.f.a(java.lang.Integer.valueOf(this.f108707h), java.lang.Integer.valueOf(f60Var.f108707h)) && n51.f.a(java.lang.Integer.valueOf(this.f108708i), java.lang.Integer.valueOf(f60Var.f108708i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.f60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108709m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108703d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108704e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108705f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f108706g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108707h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108708i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f108703d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f108704e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f108705f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f108706g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f108707h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f108708i) : i18;
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
                this.f108703d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108704e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108705f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108706g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108707h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108708i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

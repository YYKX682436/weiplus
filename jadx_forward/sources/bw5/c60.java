package bw5;

/* loaded from: classes2.dex */
public class c60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107476d;

    /* renamed from: e, reason: collision with root package name */
    public int f107477e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107478f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107479g;

    /* renamed from: h, reason: collision with root package name */
    public long f107480h;

    /* renamed from: i, reason: collision with root package name */
    public int f107481i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107482m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107483n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.m80 f107484o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f107485p = new boolean[10];

    static {
        new bw5.c60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c60)) {
            return false;
        }
        bw5.c60 c60Var = (bw5.c60) fVar;
        return n51.f.a(this.f107476d, c60Var.f107476d) && n51.f.a(java.lang.Integer.valueOf(this.f107477e), java.lang.Integer.valueOf(c60Var.f107477e)) && n51.f.a(this.f107478f, c60Var.f107478f) && n51.f.a(this.f107479g, c60Var.f107479g) && n51.f.a(java.lang.Long.valueOf(this.f107480h), java.lang.Long.valueOf(c60Var.f107480h)) && n51.f.a(java.lang.Integer.valueOf(this.f107481i), java.lang.Integer.valueOf(c60Var.f107481i)) && n51.f.a(this.f107482m, c60Var.f107482m) && n51.f.a(this.f107483n, c60Var.f107483n) && n51.f.a(this.f107484o, c60Var.f107484o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107485p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107476d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107477e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107478f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f107479g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f107480h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107481i);
            }
            java.lang.String str3 = this.f107482m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f107483n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            bw5.m80 m80Var = this.f107484o;
            if (m80Var != null && zArr[9]) {
                fVar.i(9, m80Var.mo75928xcd1e8d8());
                this.f107484o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f107476d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f107477e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107478f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str6 = this.f107479g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f107480h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107481i);
            }
            java.lang.String str7 = this.f107482m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f107483n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            bw5.m80 m80Var2 = this.f107484o;
            return (m80Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, m80Var2.mo75928xcd1e8d8());
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
                this.f107476d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107477e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107478f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107479g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107480h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107481i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107482m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107483n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.m80 m80Var3 = new bw5.m80();
                    if (bArr != null && bArr.length > 0) {
                        m80Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107484o = m80Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

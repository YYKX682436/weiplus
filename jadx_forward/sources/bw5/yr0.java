package bw5;

/* loaded from: classes4.dex */
public class yr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117208d;

    /* renamed from: e, reason: collision with root package name */
    public long f117209e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117210f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117211g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117212h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117213i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f117215n;

    /* renamed from: o, reason: collision with root package name */
    public long f117216o;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f117214m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f117217p = new boolean[10];

    static {
        new bw5.yr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.yr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yr0)) {
            return false;
        }
        bw5.yr0 yr0Var = (bw5.yr0) fVar;
        return n51.f.a(this.f117208d, yr0Var.f117208d) && n51.f.a(java.lang.Long.valueOf(this.f117209e), java.lang.Long.valueOf(yr0Var.f117209e)) && n51.f.a(this.f117210f, yr0Var.f117210f) && n51.f.a(this.f117211g, yr0Var.f117211g) && n51.f.a(this.f117212h, yr0Var.f117212h) && n51.f.a(this.f117213i, yr0Var.f117213i) && n51.f.a(this.f117214m, yr0Var.f117214m) && n51.f.a(this.f117215n, yr0Var.f117215n) && n51.f.a(java.lang.Long.valueOf(this.f117216o), java.lang.Long.valueOf(yr0Var.f117216o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117214m;
        int i18 = 0;
        boolean[] zArr = this.f117217p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117208d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f117209e);
            }
            java.lang.String str2 = this.f117210f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f117211g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f117212h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117213i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str5 = this.f117215n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            if (zArr[9]) {
                fVar.h(9, this.f117216o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f117208d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f117209e);
            }
            java.lang.String str7 = this.f117210f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f117211g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f117212h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117213i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList);
            java.lang.String str10 = this.f117215n;
            if (str10 != null && zArr[8]) {
                g17 += b36.f.j(8, str10);
            }
            return zArr[9] ? g17 + b36.f.h(9, this.f117216o) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f117208d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117209e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117210f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117211g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117212h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117213i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.zr0 zr0Var = new bw5.zr0();
                    if (bArr != null && bArr.length > 0) {
                        zr0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(zr0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f117215n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117216o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes2.dex */
public class nh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112214d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112215e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112216f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112217g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112218h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112219i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112220m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f112221n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f112222o = new boolean[13];

    static {
        new bw5.nh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.nh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nh0)) {
            return false;
        }
        bw5.nh0 nh0Var = (bw5.nh0) fVar;
        return n51.f.a(this.f112214d, nh0Var.f112214d) && n51.f.a(this.f112215e, nh0Var.f112215e) && n51.f.a(this.f112216f, nh0Var.f112216f) && n51.f.a(this.f112217g, nh0Var.f112217g) && n51.f.a(this.f112218h, nh0Var.f112218h) && n51.f.a(this.f112219i, nh0Var.f112219i) && n51.f.a(this.f112220m, nh0Var.f112220m) && n51.f.a(this.f112221n, nh0Var.f112221n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112221n;
        int i18 = 0;
        boolean[] zArr = this.f112222o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112214d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112215e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f112216f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f112217g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f112218h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f112219i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f112220m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            fVar.g(12, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f112214d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            java.lang.String str9 = this.f112215e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f112216f;
            if (str10 != null && zArr[3]) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f112217g;
            if (str11 != null && zArr[4]) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f112218h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f112219i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f112220m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            return i18 + b36.f.g(12, 8, linkedList);
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
        if (intValue == 12) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.wh0 wh0Var = new bw5.wh0();
                if (bArr != null && bArr.length > 0) {
                    wh0Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(wh0Var);
            }
            zArr[12] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f112214d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112215e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112216f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112217g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112218h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112219i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112220m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

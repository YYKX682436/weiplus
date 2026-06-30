package bw5;

/* loaded from: classes11.dex */
public class wk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116289d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dj0 f116290e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116291f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116292g;

    /* renamed from: h, reason: collision with root package name */
    public int f116293h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116294i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116295m;

    /* renamed from: n, reason: collision with root package name */
    public int f116296n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f116298p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f116299q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f116300r;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f116297o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f116301s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f116302t = new boolean[15];

    static {
        new bw5.wk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wk0)) {
            return false;
        }
        bw5.wk0 wk0Var = (bw5.wk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116289d), java.lang.Long.valueOf(wk0Var.f116289d)) && n51.f.a(this.f116290e, wk0Var.f116290e) && n51.f.a(this.f116291f, wk0Var.f116291f) && n51.f.a(this.f116292g, wk0Var.f116292g) && n51.f.a(java.lang.Integer.valueOf(this.f116293h), java.lang.Integer.valueOf(wk0Var.f116293h)) && n51.f.a(this.f116294i, wk0Var.f116294i) && n51.f.a(this.f116295m, wk0Var.f116295m) && n51.f.a(java.lang.Integer.valueOf(this.f116296n), java.lang.Integer.valueOf(wk0Var.f116296n)) && n51.f.a(this.f116297o, wk0Var.f116297o) && n51.f.a(this.f116298p, wk0Var.f116298p) && n51.f.a(this.f116299q, wk0Var.f116299q) && n51.f.a(this.f116300r, wk0Var.f116300r) && n51.f.a(this.f116301s, wk0Var.f116301s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116301s;
        java.util.LinkedList linkedList2 = this.f116297o;
        boolean[] zArr = this.f116302t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116289d);
            }
            bw5.dj0 dj0Var = this.f116290e;
            if (dj0Var != null && zArr[2]) {
                fVar.i(2, dj0Var.mo75928xcd1e8d8());
                this.f116290e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116291f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f116292g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116293h);
            }
            java.lang.String str3 = this.f116294i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f116295m;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f116296n);
            }
            fVar.g(10, 8, linkedList2);
            java.lang.String str5 = this.f116298p;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f116299q;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f116300r;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            fVar.g(14, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f116289d) + 0 : 0;
            bw5.dj0 dj0Var2 = this.f116290e;
            if (dj0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, dj0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f116291f;
            if (str8 != null && zArr[4]) {
                h17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f116292g;
            if (str9 != null && zArr[5]) {
                h17 += b36.f.j(5, str9);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f116293h);
            }
            java.lang.String str10 = this.f116294i;
            if (str10 != null && zArr[7]) {
                h17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f116295m;
            if (str11 != null && zArr[8]) {
                h17 += b36.f.j(8, str11);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f116296n);
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList2);
            java.lang.String str12 = this.f116298p;
            if (str12 != null && zArr[11]) {
                g17 += b36.f.j(11, str12);
            }
            java.lang.String str13 = this.f116299q;
            if (str13 != null && zArr[12]) {
                g17 += b36.f.j(12, str13);
            }
            java.lang.String str14 = this.f116300r;
            if (str14 != null && zArr[13]) {
                g17 += b36.f.j(13, str14);
            }
            return g17 + b36.f.g(14, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f116289d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dj0 dj0Var3 = new bw5.dj0();
                    if (bArr != null && bArr.length > 0) {
                        dj0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f116290e = dj0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                this.f116291f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116292g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116293h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116294i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116295m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116296n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.gj0 gj0Var = new bw5.gj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gj0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(gj0Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f116298p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f116299q = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f116300r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.gj0 gj0Var2 = new bw5.gj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gj0Var2.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(gj0Var2);
                }
                zArr[14] = true;
                return 0;
        }
    }
}

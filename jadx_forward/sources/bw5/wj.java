package bw5;

/* loaded from: classes2.dex */
public class wj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116275d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116277f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116278g;

    /* renamed from: i, reason: collision with root package name */
    public int f116280i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.sj f116281m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116282n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f116283o;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f116279h = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116284p = new boolean[10];

    static {
        new bw5.wj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wj mo11468x92b714fd(byte[] bArr) {
        return (bw5.wj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wj)) {
            return false;
        }
        bw5.wj wjVar = (bw5.wj) fVar;
        return n51.f.a(this.f116275d, wjVar.f116275d) && n51.f.a(this.f116276e, wjVar.f116276e) && n51.f.a(this.f116277f, wjVar.f116277f) && n51.f.a(this.f116278g, wjVar.f116278g) && n51.f.a(this.f116279h, wjVar.f116279h) && n51.f.a(java.lang.Integer.valueOf(this.f116280i), java.lang.Integer.valueOf(wjVar.f116280i)) && n51.f.a(this.f116281m, wjVar.f116281m) && n51.f.a(this.f116282n, wjVar.f116282n) && n51.f.a(this.f116283o, wjVar.f116283o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116279h;
        int i18 = 0;
        boolean[] zArr = this.f116284p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116275d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f116276e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f116277f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f116278g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            fVar.g(5, 8, linkedList);
            if (zArr[6]) {
                fVar.e(6, this.f116280i);
            }
            bw5.sj sjVar = this.f116281m;
            if (sjVar != null && zArr[7]) {
                fVar.i(7, sjVar.mo75928xcd1e8d8());
                this.f116281m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f116282n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f116283o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f116275d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f116276e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f116277f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f116278g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f116280i);
            }
            bw5.sj sjVar2 = this.f116281m;
            if (sjVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, sjVar2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f116282n;
            if (str11 != null && zArr[8]) {
                g17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f116283o;
            return (str12 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str12);
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
                this.f116275d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116276e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116277f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116278g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.vj vjVar = new bw5.vj();
                    if (bArr != null && bArr.length > 0) {
                        vjVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(vjVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f116280i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sj sjVar3 = new bw5.sj();
                    if (bArr2 != null && bArr2.length > 0) {
                        sjVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f116281m = sjVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f116282n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116283o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

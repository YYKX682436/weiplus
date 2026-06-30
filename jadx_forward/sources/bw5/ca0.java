package bw5;

/* loaded from: classes2.dex */
public class ca0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107539d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107540e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107541f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107542g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107543h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107544i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.mc0 f107545m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.ba0 f107546n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107547o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f107548p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f107549q = new boolean[11];

    static {
        new bw5.ca0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ca0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ca0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ca0)) {
            return false;
        }
        bw5.ca0 ca0Var = (bw5.ca0) fVar;
        return n51.f.a(this.f107539d, ca0Var.f107539d) && n51.f.a(this.f107540e, ca0Var.f107540e) && n51.f.a(this.f107541f, ca0Var.f107541f) && n51.f.a(this.f107542g, ca0Var.f107542g) && n51.f.a(this.f107543h, ca0Var.f107543h) && n51.f.a(this.f107544i, ca0Var.f107544i) && n51.f.a(this.f107545m, ca0Var.f107545m) && n51.f.a(this.f107546n, ca0Var.f107546n) && n51.f.a(this.f107547o, ca0Var.f107547o) && n51.f.a(this.f107548p, ca0Var.f107548p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ca0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107548p;
        int i18 = 0;
        boolean[] zArr = this.f107549q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107539d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107540e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f107541f;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f107542g;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f107543h;
            if (str5 != null && zArr[2]) {
                fVar.j(2, str5);
            }
            java.lang.String str6 = this.f107544i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            bw5.mc0 mc0Var = this.f107545m;
            if (mc0Var != null && zArr[7]) {
                fVar.i(7, mc0Var.mo75928xcd1e8d8());
                this.f107545m.mo75956x3d5d1f78(fVar);
            }
            bw5.ba0 ba0Var = this.f107546n;
            if (ba0Var != null && zArr[8]) {
                fVar.i(8, ba0Var.mo75928xcd1e8d8());
                this.f107546n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.f107547o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f107539d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            java.lang.String str9 = this.f107540e;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f107541f;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f107542g;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f107543h;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f107544i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            bw5.mc0 mc0Var2 = this.f107545m;
            if (mc0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, mc0Var2.mo75928xcd1e8d8());
            }
            bw5.ba0 ba0Var2 = this.f107546n;
            if (ba0Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, ba0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f107547o;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            return i18 + b36.f.g(10, 8, linkedList);
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
                this.f107539d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107543h = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107540e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107541f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107542g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107544i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107545m = mc0Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ba0 ba0Var3 = new bw5.ba0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ba0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107546n = ba0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f107547o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.c70 c70Var = new bw5.c70();
                    if (bArr3 != null && bArr3.length > 0) {
                        c70Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(c70Var);
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}

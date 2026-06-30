package bw5;

/* loaded from: classes2.dex */
public class qr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113763d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113764e;

    /* renamed from: f, reason: collision with root package name */
    public double f113765f;

    /* renamed from: g, reason: collision with root package name */
    public int f113766g;

    /* renamed from: m, reason: collision with root package name */
    public double f113769m;

    /* renamed from: p, reason: collision with root package name */
    public int f113772p;

    /* renamed from: q, reason: collision with root package name */
    public int f113773q;

    /* renamed from: r, reason: collision with root package name */
    public int f113774r;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f113767h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f113768i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f113770n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f113771o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f113775s = new boolean[14];

    static {
        new bw5.qr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qr mo11468x92b714fd(byte[] bArr) {
        return (bw5.qr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qr)) {
            return false;
        }
        bw5.qr qrVar = (bw5.qr) fVar;
        return n51.f.a(this.f113763d, qrVar.f113763d) && n51.f.a(this.f113764e, qrVar.f113764e) && n51.f.a(java.lang.Double.valueOf(this.f113765f), java.lang.Double.valueOf(qrVar.f113765f)) && n51.f.a(java.lang.Integer.valueOf(this.f113766g), java.lang.Integer.valueOf(qrVar.f113766g)) && n51.f.a(this.f113767h, qrVar.f113767h) && n51.f.a(this.f113768i, qrVar.f113768i) && n51.f.a(java.lang.Double.valueOf(this.f113769m), java.lang.Double.valueOf(qrVar.f113769m)) && n51.f.a(this.f113770n, qrVar.f113770n) && n51.f.a(this.f113771o, qrVar.f113771o) && n51.f.a(java.lang.Integer.valueOf(this.f113772p), java.lang.Integer.valueOf(qrVar.f113772p)) && n51.f.a(java.lang.Integer.valueOf(this.f113773q), java.lang.Integer.valueOf(qrVar.f113773q)) && n51.f.a(java.lang.Integer.valueOf(this.f113774r), java.lang.Integer.valueOf(qrVar.f113774r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113771o;
        java.util.LinkedList linkedList2 = this.f113770n;
        java.util.LinkedList linkedList3 = this.f113768i;
        java.util.LinkedList linkedList4 = this.f113767h;
        int i18 = 0;
        boolean[] zArr = this.f113775s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113763d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113764e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[4]) {
                fVar.c(4, this.f113765f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113766g);
            }
            fVar.g(6, 1, linkedList4);
            fVar.g(7, 8, linkedList3);
            if (zArr[8]) {
                fVar.c(8, this.f113769m);
            }
            fVar.g(9, 8, linkedList2);
            fVar.g(10, 8, linkedList);
            if (zArr[11]) {
                fVar.e(11, this.f113772p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f113773q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f113774r);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f113763d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            java.lang.String str4 = this.f113764e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.c(4, this.f113765f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f113766g);
            }
            int g17 = i18 + b36.f.g(6, 1, linkedList4) + b36.f.g(7, 8, linkedList3);
            if (zArr[8]) {
                g17 += b36.f.c(8, this.f113769m);
            }
            int g18 = g17 + b36.f.g(9, 8, linkedList2) + b36.f.g(10, 8, linkedList);
            if (zArr[11]) {
                g18 += b36.f.e(11, this.f113772p);
            }
            if (zArr[12]) {
                g18 += b36.f.e(12, this.f113773q);
            }
            return zArr[13] ? g18 + b36.f.e(13, this.f113774r) : g18;
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
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
                this.f113763d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113764e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                this.f113765f = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113766g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList4.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.cg0 cg0Var = new bw5.cg0();
                    if (bArr != null && bArr.length > 0) {
                        cg0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList3.add(cg0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f113769m = aVar2.e(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.i00 i00Var = new bw5.i00();
                    if (bArr2 != null && bArr2.length > 0) {
                        i00Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(i00Var);
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.eg0 eg0Var = new bw5.eg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        eg0Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(eg0Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f113772p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113773q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113774r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
        }
    }
}

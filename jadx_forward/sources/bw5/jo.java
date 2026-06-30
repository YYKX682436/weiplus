package bw5;

/* loaded from: classes2.dex */
public class jo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110590d;

    /* renamed from: e, reason: collision with root package name */
    public long f110591e;

    /* renamed from: f, reason: collision with root package name */
    public int f110592f;

    /* renamed from: g, reason: collision with root package name */
    public int f110593g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.lo f110594h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mo f110595i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f110597n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f110598o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f110599p;

    /* renamed from: q, reason: collision with root package name */
    public long f110600q;

    /* renamed from: r, reason: collision with root package name */
    public int f110601r;

    /* renamed from: s, reason: collision with root package name */
    public long f110602s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f110596m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f110603t = new boolean[18];

    static {
        new bw5.jo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jo mo11468x92b714fd(byte[] bArr) {
        return (bw5.jo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jo)) {
            return false;
        }
        bw5.jo joVar = (bw5.jo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110590d), java.lang.Integer.valueOf(joVar.f110590d)) && n51.f.a(java.lang.Long.valueOf(this.f110591e), java.lang.Long.valueOf(joVar.f110591e)) && n51.f.a(java.lang.Integer.valueOf(this.f110592f), java.lang.Integer.valueOf(joVar.f110592f)) && n51.f.a(java.lang.Integer.valueOf(this.f110593g), java.lang.Integer.valueOf(joVar.f110593g)) && n51.f.a(this.f110594h, joVar.f110594h) && n51.f.a(this.f110595i, joVar.f110595i) && n51.f.a(this.f110596m, joVar.f110596m) && n51.f.a(this.f110597n, joVar.f110597n) && n51.f.a(this.f110598o, joVar.f110598o) && n51.f.a(this.f110599p, joVar.f110599p) && n51.f.a(java.lang.Long.valueOf(this.f110600q), java.lang.Long.valueOf(joVar.f110600q)) && n51.f.a(java.lang.Integer.valueOf(this.f110601r), java.lang.Integer.valueOf(joVar.f110601r)) && n51.f.a(java.lang.Long.valueOf(this.f110602s), java.lang.Long.valueOf(joVar.f110602s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110596m;
        boolean[] zArr = this.f110603t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110590d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f110591e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110592f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110593g);
            }
            bw5.lo loVar = this.f110594h;
            if (loVar != null && zArr[6]) {
                fVar.i(6, loVar.mo75928xcd1e8d8());
                this.f110594h.mo75956x3d5d1f78(fVar);
            }
            bw5.mo moVar = this.f110595i;
            if (moVar != null && zArr[7]) {
                fVar.i(7, moVar.mo75928xcd1e8d8());
                this.f110595i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str = this.f110597n;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f110598o;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f110599p;
            if (str3 != null && zArr[12]) {
                fVar.j(12, str3);
            }
            if (zArr[15]) {
                fVar.h(15, this.f110600q);
            }
            if (zArr[16]) {
                fVar.e(16, this.f110601r);
            }
            if (!zArr[17]) {
                return 0;
            }
            fVar.h(17, this.f110602s);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f110590d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f110591e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f110592f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f110593g);
            }
            bw5.lo loVar2 = this.f110594h;
            if (loVar2 != null && zArr[6]) {
                e17 += b36.f.i(6, loVar2.mo75928xcd1e8d8());
            }
            bw5.mo moVar2 = this.f110595i;
            if (moVar2 != null && zArr[7]) {
                e17 += b36.f.i(7, moVar2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList);
            java.lang.String str4 = this.f110597n;
            if (str4 != null && zArr[10]) {
                g17 += b36.f.j(10, str4);
            }
            java.lang.String str5 = this.f110598o;
            if (str5 != null && zArr[11]) {
                g17 += b36.f.j(11, str5);
            }
            java.lang.String str6 = this.f110599p;
            if (str6 != null && zArr[12]) {
                g17 += b36.f.j(12, str6);
            }
            if (zArr[15]) {
                g17 += b36.f.h(15, this.f110600q);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f110601r);
            }
            return zArr[17] ? g17 + b36.f.h(17, this.f110602s) : g17;
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
                this.f110590d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110591e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110592f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110593g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 9:
            case 13:
            case 14:
            default:
                return -1;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lo loVar3 = new bw5.lo();
                    if (bArr != null && bArr.length > 0) {
                        loVar3.mo11468x92b714fd(bArr);
                    }
                    this.f110594h = loVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.mo moVar3 = new bw5.mo();
                    if (bArr2 != null && bArr2.length > 0) {
                        moVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f110595i = moVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.t30 t30Var = new bw5.t30();
                    if (bArr3 != null && bArr3.length > 0) {
                        t30Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(t30Var);
                }
                zArr[8] = true;
                return 0;
            case 10:
                this.f110597n = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110598o = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110599p = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 15:
                this.f110600q = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f110601r = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f110602s = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
        }
    }
}

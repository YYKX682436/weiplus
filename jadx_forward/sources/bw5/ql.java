package bw5;

/* loaded from: classes2.dex */
public class ql extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f113685d;

    /* renamed from: e, reason: collision with root package name */
    public int f113686e;

    /* renamed from: f, reason: collision with root package name */
    public int f113687f;

    /* renamed from: g, reason: collision with root package name */
    public int f113688g;

    /* renamed from: h, reason: collision with root package name */
    public int f113689h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.yk f113690i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113691m;

    /* renamed from: n, reason: collision with root package name */
    public int f113692n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f113693o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113694p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f113695q;

    /* renamed from: s, reason: collision with root package name */
    public long f113697s;

    /* renamed from: t, reason: collision with root package name */
    public long f113698t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.w30 f113699u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.tk f113700v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.rl f113701w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.rm f113702x;

    /* renamed from: y, reason: collision with root package name */
    public int f113703y;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f113696r = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f113704z = new boolean[26];

    static {
        new bw5.ql();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ql mo11468x92b714fd(byte[] bArr) {
        return (bw5.ql) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ql)) {
            return false;
        }
        bw5.ql qlVar = (bw5.ql) fVar;
        return n51.f.a(this.f113685d, qlVar.f113685d) && n51.f.a(java.lang.Integer.valueOf(this.f113686e), java.lang.Integer.valueOf(qlVar.f113686e)) && n51.f.a(java.lang.Integer.valueOf(this.f113687f), java.lang.Integer.valueOf(qlVar.f113687f)) && n51.f.a(java.lang.Integer.valueOf(this.f113688g), java.lang.Integer.valueOf(qlVar.f113688g)) && n51.f.a(java.lang.Integer.valueOf(this.f113689h), java.lang.Integer.valueOf(qlVar.f113689h)) && n51.f.a(this.f113690i, qlVar.f113690i) && n51.f.a(this.f113691m, qlVar.f113691m) && n51.f.a(java.lang.Integer.valueOf(this.f113692n), java.lang.Integer.valueOf(qlVar.f113692n)) && n51.f.a(this.f113693o, qlVar.f113693o) && n51.f.a(this.f113694p, qlVar.f113694p) && n51.f.a(java.lang.Boolean.valueOf(this.f113695q), java.lang.Boolean.valueOf(qlVar.f113695q)) && n51.f.a(this.f113696r, qlVar.f113696r) && n51.f.a(java.lang.Long.valueOf(this.f113697s), java.lang.Long.valueOf(qlVar.f113697s)) && n51.f.a(java.lang.Long.valueOf(this.f113698t), java.lang.Long.valueOf(qlVar.f113698t)) && n51.f.a(this.f113699u, qlVar.f113699u) && n51.f.a(this.f113700v, qlVar.f113700v) && n51.f.a(this.f113701w, qlVar.f113701w) && n51.f.a(this.f113702x, qlVar.f113702x) && n51.f.a(java.lang.Integer.valueOf(this.f113703y), java.lang.Integer.valueOf(qlVar.f113703y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ql();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113696r;
        int i18 = 0;
        boolean[] zArr = this.f113704z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f113685d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.mo75928xcd1e8d8());
                this.f113685d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113686e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113687f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113688g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113689h);
            }
            bw5.yk ykVar = this.f113690i;
            if (ykVar != null && zArr[6]) {
                fVar.i(6, ykVar.mo75928xcd1e8d8());
                this.f113690i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f113691m;
            if (str != null && zArr[9]) {
                fVar.j(9, str);
            }
            if (zArr[10]) {
                fVar.e(10, this.f113692n);
            }
            java.lang.String str2 = this.f113693o;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113694p;
            if (gVar != null && zArr[12]) {
                fVar.b(12, gVar);
            }
            if (zArr[13]) {
                fVar.a(13, this.f113695q);
            }
            fVar.g(14, 8, linkedList);
            if (zArr[16]) {
                fVar.h(16, this.f113697s);
            }
            if (zArr[18]) {
                fVar.h(18, this.f113698t);
            }
            bw5.w30 w30Var = this.f113699u;
            if (w30Var != null && zArr[19]) {
                fVar.i(19, w30Var.mo75928xcd1e8d8());
                this.f113699u.mo75956x3d5d1f78(fVar);
            }
            bw5.tk tkVar = this.f113700v;
            if (tkVar != null && zArr[21]) {
                fVar.i(21, tkVar.mo75928xcd1e8d8());
                this.f113700v.mo75956x3d5d1f78(fVar);
            }
            bw5.rl rlVar = this.f113701w;
            if (rlVar != null && zArr[22]) {
                fVar.i(22, rlVar.mo75928xcd1e8d8());
                this.f113701w.mo75956x3d5d1f78(fVar);
            }
            bw5.rm rmVar = this.f113702x;
            if (rmVar != null && zArr[23]) {
                fVar.i(23, rmVar.mo75928xcd1e8d8());
                this.f113702x.mo75956x3d5d1f78(fVar);
            }
            if (zArr[25]) {
                fVar.e(25, this.f113703y);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f113685d;
            if (aeVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, aeVar2.mo75928xcd1e8d8()) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f113686e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f113687f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f113688g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f113689h);
            }
            bw5.yk ykVar2 = this.f113690i;
            if (ykVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, ykVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f113691m;
            if (str3 != null && zArr[9]) {
                i18 += b36.f.j(9, str3);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f113692n);
            }
            java.lang.String str4 = this.f113693o;
            if (str4 != null && zArr[11]) {
                i18 += b36.f.j(11, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113694p;
            if (gVar2 != null && zArr[12]) {
                i18 += b36.f.b(12, gVar2);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f113695q);
            }
            int g17 = i18 + b36.f.g(14, 8, linkedList);
            if (zArr[16]) {
                g17 += b36.f.h(16, this.f113697s);
            }
            if (zArr[18]) {
                g17 += b36.f.h(18, this.f113698t);
            }
            bw5.w30 w30Var2 = this.f113699u;
            if (w30Var2 != null && zArr[19]) {
                g17 += b36.f.i(19, w30Var2.mo75928xcd1e8d8());
            }
            bw5.tk tkVar2 = this.f113700v;
            if (tkVar2 != null && zArr[21]) {
                g17 += b36.f.i(21, tkVar2.mo75928xcd1e8d8());
            }
            bw5.rl rlVar2 = this.f113701w;
            if (rlVar2 != null && zArr[22]) {
                g17 += b36.f.i(22, rlVar2.mo75928xcd1e8d8());
            }
            bw5.rm rmVar2 = this.f113702x;
            if (rmVar2 != null && zArr[23]) {
                g17 += b36.f.i(23, rmVar2.mo75928xcd1e8d8());
            }
            return zArr[25] ? g17 + b36.f.e(25, this.f113703y) : g17;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113685d = aeVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f113686e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113687f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113688g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113689h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yk ykVar3 = new bw5.yk();
                    if (bArr2 != null && bArr2.length > 0) {
                        ykVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f113690i = ykVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
            case 8:
            case 15:
            case 17:
            case 20:
            case 24:
            default:
                return -1;
            case 9:
                this.f113691m = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113692n = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113693o = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113694p = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113695q = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.yk ykVar4 = new bw5.yk();
                    if (bArr3 != null && bArr3.length > 0) {
                        ykVar4.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(ykVar4);
                }
                zArr[14] = true;
                return 0;
            case 16:
                this.f113697s = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 18:
                this.f113698t = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.w30 w30Var3 = new bw5.w30();
                    if (bArr4 != null && bArr4.length > 0) {
                        w30Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f113699u = w30Var3;
                }
                zArr[19] = true;
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.tk tkVar3 = new bw5.tk();
                    if (bArr5 != null && bArr5.length > 0) {
                        tkVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f113700v = tkVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.rl rlVar3 = new bw5.rl();
                    if (bArr6 != null && bArr6.length > 0) {
                        rlVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f113701w = rlVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.rm rmVar3 = new bw5.rm();
                    if (bArr7 != null && bArr7.length > 0) {
                        rmVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f113702x = rmVar3;
                }
                zArr[23] = true;
                return 0;
            case 25:
                this.f113703y = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
        }
    }
}

package bw5;

/* loaded from: classes7.dex */
public class zf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public long A;
    public long B;
    public long C;
    public long D;
    public final boolean[] E = new boolean[25];

    /* renamed from: d, reason: collision with root package name */
    public bw5.wf f117490d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vf f117491e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yf f117492f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xf f117493g;

    /* renamed from: h, reason: collision with root package name */
    public int f117494h;

    /* renamed from: i, reason: collision with root package name */
    public int f117495i;

    /* renamed from: m, reason: collision with root package name */
    public int f117496m;

    /* renamed from: n, reason: collision with root package name */
    public int f117497n;

    /* renamed from: o, reason: collision with root package name */
    public int f117498o;

    /* renamed from: p, reason: collision with root package name */
    public int f117499p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117500q;

    /* renamed from: r, reason: collision with root package name */
    public int f117501r;

    /* renamed from: s, reason: collision with root package name */
    public int f117502s;

    /* renamed from: t, reason: collision with root package name */
    public int f117503t;

    /* renamed from: u, reason: collision with root package name */
    public int f117504u;

    /* renamed from: v, reason: collision with root package name */
    public int f117505v;

    /* renamed from: w, reason: collision with root package name */
    public long f117506w;

    /* renamed from: x, reason: collision with root package name */
    public long f117507x;

    /* renamed from: y, reason: collision with root package name */
    public long f117508y;

    /* renamed from: z, reason: collision with root package name */
    public long f117509z;

    static {
        new bw5.zf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zf mo11468x92b714fd(byte[] bArr) {
        return (bw5.zf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zf)) {
            return false;
        }
        bw5.zf zfVar = (bw5.zf) fVar;
        return n51.f.a(this.f117490d, zfVar.f117490d) && n51.f.a(this.f117491e, zfVar.f117491e) && n51.f.a(this.f117492f, zfVar.f117492f) && n51.f.a(this.f117493g, zfVar.f117493g) && n51.f.a(java.lang.Integer.valueOf(this.f117494h), java.lang.Integer.valueOf(zfVar.f117494h)) && n51.f.a(java.lang.Integer.valueOf(this.f117495i), java.lang.Integer.valueOf(zfVar.f117495i)) && n51.f.a(java.lang.Integer.valueOf(this.f117496m), java.lang.Integer.valueOf(zfVar.f117496m)) && n51.f.a(java.lang.Integer.valueOf(this.f117497n), java.lang.Integer.valueOf(zfVar.f117497n)) && n51.f.a(java.lang.Integer.valueOf(this.f117498o), java.lang.Integer.valueOf(zfVar.f117498o)) && n51.f.a(java.lang.Integer.valueOf(this.f117499p), java.lang.Integer.valueOf(zfVar.f117499p)) && n51.f.a(this.f117500q, zfVar.f117500q) && n51.f.a(java.lang.Integer.valueOf(this.f117501r), java.lang.Integer.valueOf(zfVar.f117501r)) && n51.f.a(java.lang.Integer.valueOf(this.f117502s), java.lang.Integer.valueOf(zfVar.f117502s)) && n51.f.a(java.lang.Integer.valueOf(this.f117503t), java.lang.Integer.valueOf(zfVar.f117503t)) && n51.f.a(java.lang.Integer.valueOf(this.f117504u), java.lang.Integer.valueOf(zfVar.f117504u)) && n51.f.a(java.lang.Integer.valueOf(this.f117505v), java.lang.Integer.valueOf(zfVar.f117505v)) && n51.f.a(java.lang.Long.valueOf(this.f117506w), java.lang.Long.valueOf(zfVar.f117506w)) && n51.f.a(java.lang.Long.valueOf(this.f117507x), java.lang.Long.valueOf(zfVar.f117507x)) && n51.f.a(java.lang.Long.valueOf(this.f117508y), java.lang.Long.valueOf(zfVar.f117508y)) && n51.f.a(java.lang.Long.valueOf(this.f117509z), java.lang.Long.valueOf(zfVar.f117509z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(zfVar.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(zfVar.B)) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(zfVar.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(zfVar.D));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wf wfVar = this.f117490d;
            if (wfVar != null && zArr[1]) {
                fVar.e(1, wfVar.f116216d);
            }
            bw5.vf vfVar = this.f117491e;
            if (vfVar != null && zArr[2]) {
                fVar.e(2, vfVar.f115881d);
            }
            bw5.yf yfVar = this.f117492f;
            if (yfVar != null && zArr[3]) {
                fVar.e(3, yfVar.f116999d);
            }
            bw5.xf xfVar = this.f117493g;
            if (xfVar != null && zArr[4]) {
                fVar.e(4, xfVar.f116620d);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117494h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117495i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f117496m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f117497n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f117498o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f117499p);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117500q;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f117501r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f117502s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f117503t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f117504u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f117505v);
            }
            if (zArr[17]) {
                fVar.h(17, this.f117506w);
            }
            if (zArr[18]) {
                fVar.h(18, this.f117507x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f117508y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f117509z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.h(23, this.C);
            }
            if (zArr[24]) {
                fVar.h(24, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.wf wfVar2 = this.f117490d;
            if (wfVar2 != null && zArr[1]) {
                i18 = b36.f.e(1, wfVar2.f116216d) + 0;
            }
            bw5.vf vfVar2 = this.f117491e;
            if (vfVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, vfVar2.f115881d);
            }
            bw5.yf yfVar2 = this.f117492f;
            if (yfVar2 != null && zArr[3]) {
                i18 += b36.f.e(3, yfVar2.f116999d);
            }
            bw5.xf xfVar2 = this.f117493g;
            if (xfVar2 != null && zArr[4]) {
                i18 += b36.f.e(4, xfVar2.f116620d);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f117494h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f117495i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f117496m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f117497n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f117498o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f117499p);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117500q;
            if (gVar2 != null && zArr[11]) {
                i18 += b36.f.b(11, gVar2);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f117501r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f117502s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f117503t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f117504u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f117505v);
            }
            if (zArr[17]) {
                i18 += b36.f.h(17, this.f117506w);
            }
            if (zArr[18]) {
                i18 += b36.f.h(18, this.f117507x);
            }
            if (zArr[19]) {
                i18 += b36.f.h(19, this.f117508y);
            }
            if (zArr[20]) {
                i18 += b36.f.h(20, this.f117509z);
            }
            if (zArr[21]) {
                i18 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                i18 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                i18 += b36.f.h(23, this.C);
            }
            return zArr[24] ? i18 + b36.f.h(24, this.D) : i18;
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
                int g17 = aVar2.g(intValue);
                this.f117490d = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : bw5.wf.FRESH_AFTER_CACHE : bw5.wf.NAV_LIVE : bw5.wf.LIVE : bw5.wf.FRESH : bw5.wf.HOT;
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                this.f117491e = g18 != 1 ? g18 != 2 ? null : bw5.vf.SLIDE : bw5.vf.TAG;
                zArr[2] = true;
                return 0;
            case 3:
                int g19 = aVar2.g(intValue);
                this.f117492f = g19 != 0 ? g19 != 1 ? g19 != 2 ? null : bw5.yf.PULL_TYPE_BOTTOM : bw5.yf.PULL_TYPE_TOP : bw5.yf.PULL_TYPE_ENTER;
                zArr[3] = true;
                return 0;
            case 4:
                int g27 = aVar2.g(intValue);
                this.f117493g = g27 != 1 ? g27 != 2 ? g27 != 3 ? g27 != 4 ? null : bw5.xf.JumpOther : bw5.xf.ChangeTag : bw5.xf.ReturnFinder : bw5.xf.Normal;
                zArr[4] = true;
                return 0;
            case 5:
                this.f117494h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117495i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117496m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117497n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117498o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117499p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f117500q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f117501r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f117502s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117503t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f117504u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f117505v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f117506w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f117507x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f117508y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f117509z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            default:
                return -1;
        }
    }
}

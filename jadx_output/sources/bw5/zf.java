package bw5;

/* loaded from: classes7.dex */
public class zf extends com.tencent.mm.protobuf.f {
    public long A;
    public long B;
    public long C;
    public long D;
    public final boolean[] E = new boolean[25];

    /* renamed from: d, reason: collision with root package name */
    public bw5.wf f35957d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vf f35958e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yf f35959f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xf f35960g;

    /* renamed from: h, reason: collision with root package name */
    public int f35961h;

    /* renamed from: i, reason: collision with root package name */
    public int f35962i;

    /* renamed from: m, reason: collision with root package name */
    public int f35963m;

    /* renamed from: n, reason: collision with root package name */
    public int f35964n;

    /* renamed from: o, reason: collision with root package name */
    public int f35965o;

    /* renamed from: p, reason: collision with root package name */
    public int f35966p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35967q;

    /* renamed from: r, reason: collision with root package name */
    public int f35968r;

    /* renamed from: s, reason: collision with root package name */
    public int f35969s;

    /* renamed from: t, reason: collision with root package name */
    public int f35970t;

    /* renamed from: u, reason: collision with root package name */
    public int f35971u;

    /* renamed from: v, reason: collision with root package name */
    public int f35972v;

    /* renamed from: w, reason: collision with root package name */
    public long f35973w;

    /* renamed from: x, reason: collision with root package name */
    public long f35974x;

    /* renamed from: y, reason: collision with root package name */
    public long f35975y;

    /* renamed from: z, reason: collision with root package name */
    public long f35976z;

    static {
        new bw5.zf();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zf parseFrom(byte[] bArr) {
        return (bw5.zf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zf)) {
            return false;
        }
        bw5.zf zfVar = (bw5.zf) fVar;
        return n51.f.a(this.f35957d, zfVar.f35957d) && n51.f.a(this.f35958e, zfVar.f35958e) && n51.f.a(this.f35959f, zfVar.f35959f) && n51.f.a(this.f35960g, zfVar.f35960g) && n51.f.a(java.lang.Integer.valueOf(this.f35961h), java.lang.Integer.valueOf(zfVar.f35961h)) && n51.f.a(java.lang.Integer.valueOf(this.f35962i), java.lang.Integer.valueOf(zfVar.f35962i)) && n51.f.a(java.lang.Integer.valueOf(this.f35963m), java.lang.Integer.valueOf(zfVar.f35963m)) && n51.f.a(java.lang.Integer.valueOf(this.f35964n), java.lang.Integer.valueOf(zfVar.f35964n)) && n51.f.a(java.lang.Integer.valueOf(this.f35965o), java.lang.Integer.valueOf(zfVar.f35965o)) && n51.f.a(java.lang.Integer.valueOf(this.f35966p), java.lang.Integer.valueOf(zfVar.f35966p)) && n51.f.a(this.f35967q, zfVar.f35967q) && n51.f.a(java.lang.Integer.valueOf(this.f35968r), java.lang.Integer.valueOf(zfVar.f35968r)) && n51.f.a(java.lang.Integer.valueOf(this.f35969s), java.lang.Integer.valueOf(zfVar.f35969s)) && n51.f.a(java.lang.Integer.valueOf(this.f35970t), java.lang.Integer.valueOf(zfVar.f35970t)) && n51.f.a(java.lang.Integer.valueOf(this.f35971u), java.lang.Integer.valueOf(zfVar.f35971u)) && n51.f.a(java.lang.Integer.valueOf(this.f35972v), java.lang.Integer.valueOf(zfVar.f35972v)) && n51.f.a(java.lang.Long.valueOf(this.f35973w), java.lang.Long.valueOf(zfVar.f35973w)) && n51.f.a(java.lang.Long.valueOf(this.f35974x), java.lang.Long.valueOf(zfVar.f35974x)) && n51.f.a(java.lang.Long.valueOf(this.f35975y), java.lang.Long.valueOf(zfVar.f35975y)) && n51.f.a(java.lang.Long.valueOf(this.f35976z), java.lang.Long.valueOf(zfVar.f35976z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(zfVar.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(zfVar.B)) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(zfVar.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(zfVar.D));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wf wfVar = this.f35957d;
            if (wfVar != null && zArr[1]) {
                fVar.e(1, wfVar.f34683d);
            }
            bw5.vf vfVar = this.f35958e;
            if (vfVar != null && zArr[2]) {
                fVar.e(2, vfVar.f34348d);
            }
            bw5.yf yfVar = this.f35959f;
            if (yfVar != null && zArr[3]) {
                fVar.e(3, yfVar.f35466d);
            }
            bw5.xf xfVar = this.f35960g;
            if (xfVar != null && zArr[4]) {
                fVar.e(4, xfVar.f35087d);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35961h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35962i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f35963m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f35964n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f35965o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f35966p);
            }
            com.tencent.mm.protobuf.g gVar = this.f35967q;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f35968r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f35969s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f35970t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f35971u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f35972v);
            }
            if (zArr[17]) {
                fVar.h(17, this.f35973w);
            }
            if (zArr[18]) {
                fVar.h(18, this.f35974x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f35975y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f35976z);
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
            bw5.wf wfVar2 = this.f35957d;
            if (wfVar2 != null && zArr[1]) {
                i18 = b36.f.e(1, wfVar2.f34683d) + 0;
            }
            bw5.vf vfVar2 = this.f35958e;
            if (vfVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, vfVar2.f34348d);
            }
            bw5.yf yfVar2 = this.f35959f;
            if (yfVar2 != null && zArr[3]) {
                i18 += b36.f.e(3, yfVar2.f35466d);
            }
            bw5.xf xfVar2 = this.f35960g;
            if (xfVar2 != null && zArr[4]) {
                i18 += b36.f.e(4, xfVar2.f35087d);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f35961h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f35962i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f35963m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f35964n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f35965o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f35966p);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35967q;
            if (gVar2 != null && zArr[11]) {
                i18 += b36.f.b(11, gVar2);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f35968r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f35969s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f35970t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f35971u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f35972v);
            }
            if (zArr[17]) {
                i18 += b36.f.h(17, this.f35973w);
            }
            if (zArr[18]) {
                i18 += b36.f.h(18, this.f35974x);
            }
            if (zArr[19]) {
                i18 += b36.f.h(19, this.f35975y);
            }
            if (zArr[20]) {
                i18 += b36.f.h(20, this.f35976z);
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
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f35957d = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : bw5.wf.FRESH_AFTER_CACHE : bw5.wf.NAV_LIVE : bw5.wf.LIVE : bw5.wf.FRESH : bw5.wf.HOT;
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                this.f35958e = g18 != 1 ? g18 != 2 ? null : bw5.vf.SLIDE : bw5.vf.TAG;
                zArr[2] = true;
                return 0;
            case 3:
                int g19 = aVar2.g(intValue);
                this.f35959f = g19 != 0 ? g19 != 1 ? g19 != 2 ? null : bw5.yf.PULL_TYPE_BOTTOM : bw5.yf.PULL_TYPE_TOP : bw5.yf.PULL_TYPE_ENTER;
                zArr[3] = true;
                return 0;
            case 4:
                int g27 = aVar2.g(intValue);
                this.f35960g = g27 != 1 ? g27 != 2 ? g27 != 3 ? g27 != 4 ? null : bw5.xf.JumpOther : bw5.xf.ChangeTag : bw5.xf.ReturnFinder : bw5.xf.Normal;
                zArr[4] = true;
                return 0;
            case 5:
                this.f35961h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35962i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35963m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35964n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35965o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35966p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35967q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f35968r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35969s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35970t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f35971u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f35972v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f35973w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f35974x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f35975y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f35976z = aVar2.i(intValue);
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

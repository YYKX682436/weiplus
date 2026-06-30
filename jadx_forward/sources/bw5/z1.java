package bw5;

/* loaded from: classes2.dex */
public class z1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117301d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a2 f117302e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117303f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117304g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xa0 f117305h;

    /* renamed from: m, reason: collision with root package name */
    public bw5.i60 f117307m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f117308n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117309o;

    /* renamed from: p, reason: collision with root package name */
    public int f117310p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.h2 f117311q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.o60 f117312r;

    /* renamed from: s, reason: collision with root package name */
    public int f117313s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f117314t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f117315u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f117316v;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f117306i = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f117317w = new boolean[17];

    static {
        new bw5.z1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z1)) {
            return false;
        }
        bw5.z1 z1Var = (bw5.z1) fVar;
        return n51.f.a(this.f117301d, z1Var.f117301d) && n51.f.a(this.f117302e, z1Var.f117302e) && n51.f.a(this.f117303f, z1Var.f117303f) && n51.f.a(this.f117304g, z1Var.f117304g) && n51.f.a(this.f117305h, z1Var.f117305h) && n51.f.a(this.f117306i, z1Var.f117306i) && n51.f.a(this.f117307m, z1Var.f117307m) && n51.f.a(java.lang.Boolean.valueOf(this.f117308n), java.lang.Boolean.valueOf(z1Var.f117308n)) && n51.f.a(this.f117309o, z1Var.f117309o) && n51.f.a(java.lang.Integer.valueOf(this.f117310p), java.lang.Integer.valueOf(z1Var.f117310p)) && n51.f.a(this.f117311q, z1Var.f117311q) && n51.f.a(this.f117312r, z1Var.f117312r) && n51.f.a(java.lang.Integer.valueOf(this.f117313s), java.lang.Integer.valueOf(z1Var.f117313s)) && n51.f.a(java.lang.Boolean.valueOf(this.f117314t), java.lang.Boolean.valueOf(z1Var.f117314t)) && n51.f.a(java.lang.Boolean.valueOf(this.f117315u), java.lang.Boolean.valueOf(z1Var.f117315u)) && n51.f.a(java.lang.Boolean.valueOf(this.f117316v), java.lang.Boolean.valueOf(z1Var.f117316v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117306i;
        int i18 = 0;
        boolean[] zArr = this.f117317w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117301d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.a2 a2Var = this.f117302e;
            if (a2Var != null && zArr[2]) {
                fVar.e(2, a2Var.f106509d);
            }
            java.lang.String str2 = this.f117303f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117304g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            bw5.xa0 xa0Var = this.f117305h;
            if (xa0Var != null && zArr[5]) {
                fVar.i(5, xa0Var.mo75928xcd1e8d8());
                this.f117305h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            bw5.i60 i60Var = this.f117307m;
            if (i60Var != null && zArr[7]) {
                fVar.i(7, i60Var.mo75928xcd1e8d8());
                this.f117307m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f117308n);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117309o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f117310p);
            }
            bw5.h2 h2Var = this.f117311q;
            if (h2Var != null && zArr[11]) {
                fVar.e(11, h2Var.f109586d);
            }
            bw5.o60 o60Var = this.f117312r;
            if (o60Var != null && zArr[12]) {
                fVar.i(12, o60Var.mo75928xcd1e8d8());
                this.f117312r.mo75956x3d5d1f78(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f117313s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f117314t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f117315u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f117316v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f117301d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            bw5.a2 a2Var2 = this.f117302e;
            if (a2Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, a2Var2.f106509d);
            }
            java.lang.String str4 = this.f117303f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f117304g;
            if (gVar3 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar3);
            }
            bw5.xa0 xa0Var2 = this.f117305h;
            if (xa0Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, xa0Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            bw5.i60 i60Var2 = this.f117307m;
            if (i60Var2 != null && zArr[7]) {
                g17 += b36.f.i(7, i60Var2.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f117308n);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f117309o;
            if (gVar4 != null && zArr[9]) {
                g17 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f117310p);
            }
            bw5.h2 h2Var2 = this.f117311q;
            if (h2Var2 != null && zArr[11]) {
                g17 += b36.f.e(11, h2Var2.f109586d);
            }
            bw5.o60 o60Var2 = this.f117312r;
            if (o60Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, o60Var2.mo75928xcd1e8d8());
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f117313s);
            }
            if (zArr[14]) {
                g17 += b36.f.a(14, this.f117314t);
            }
            if (zArr[15]) {
                g17 += b36.f.a(15, this.f117315u);
            }
            return zArr[16] ? g17 + b36.f.a(16, this.f117316v) : g17;
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
        bw5.a2 a2Var3 = null;
        bw5.h2 h2Var3 = null;
        switch (intValue) {
            case 1:
                this.f117301d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_None;
                } else if (g18 == 21) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_LoadMore;
                } else if (g18 == 31) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_PullRefresh;
                } else if (g18 == 41) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_RedDotPreload;
                } else if (g18 == 11) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_FirstScreen;
                } else if (g18 == 12) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_FirstScreen_Force;
                }
                this.f117302e = a2Var3;
                zArr[2] = true;
                return 0;
            case 3:
                this.f117303f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117304g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f117305h = xa0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(v70Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.i60 i60Var3 = new bw5.i60();
                    if (bArr3 != null && bArr3.length > 0) {
                        i60Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f117307m = i60Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f117308n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117309o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117310p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    h2Var3 = bw5.h2.UnKnown;
                } else if (g19 == 1) {
                    h2Var3 = bw5.h2.RedDotLoad;
                } else if (g19 == 2) {
                    h2Var3 = bw5.h2.ReLoad;
                } else if (g19 == 3) {
                    h2Var3 = bw5.h2.NormalInitLoad;
                }
                this.f117311q = h2Var3;
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.o60 o60Var3 = new bw5.o60();
                    if (bArr4 != null && bArr4.length > 0) {
                        o60Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f117312r = o60Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f117313s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117314t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f117315u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f117316v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.z1) super.mo11468x92b714fd(bArr);
    }
}

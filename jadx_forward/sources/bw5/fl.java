package bw5;

/* loaded from: classes2.dex */
public class fl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108877d;

    /* renamed from: e, reason: collision with root package name */
    public long f108878e;

    /* renamed from: f, reason: collision with root package name */
    public int f108879f;

    /* renamed from: g, reason: collision with root package name */
    public int f108880g;

    /* renamed from: i, reason: collision with root package name */
    public int f108882i;

    /* renamed from: m, reason: collision with root package name */
    public long f108883m;

    /* renamed from: n, reason: collision with root package name */
    public int f108884n;

    /* renamed from: p, reason: collision with root package name */
    public int f108886p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108887q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.al f108888r;

    /* renamed from: s, reason: collision with root package name */
    public int f108889s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f108890t;

    /* renamed from: u, reason: collision with root package name */
    public int f108891u;

    /* renamed from: v, reason: collision with root package name */
    public long f108892v;

    /* renamed from: w, reason: collision with root package name */
    public int f108893w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f108881h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f108885o = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f108894x = new boolean[20];

    static {
        new bw5.fl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fl mo11468x92b714fd(byte[] bArr) {
        return (bw5.fl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fl)) {
            return false;
        }
        bw5.fl flVar = (bw5.fl) fVar;
        return n51.f.a(this.f108877d, flVar.f108877d) && n51.f.a(java.lang.Long.valueOf(this.f108878e), java.lang.Long.valueOf(flVar.f108878e)) && n51.f.a(java.lang.Integer.valueOf(this.f108879f), java.lang.Integer.valueOf(flVar.f108879f)) && n51.f.a(java.lang.Integer.valueOf(this.f108880g), java.lang.Integer.valueOf(flVar.f108880g)) && n51.f.a(this.f108881h, flVar.f108881h) && n51.f.a(java.lang.Integer.valueOf(this.f108882i), java.lang.Integer.valueOf(flVar.f108882i)) && n51.f.a(java.lang.Long.valueOf(this.f108883m), java.lang.Long.valueOf(flVar.f108883m)) && n51.f.a(java.lang.Integer.valueOf(this.f108884n), java.lang.Integer.valueOf(flVar.f108884n)) && n51.f.a(this.f108885o, flVar.f108885o) && n51.f.a(java.lang.Integer.valueOf(this.f108886p), java.lang.Integer.valueOf(flVar.f108886p)) && n51.f.a(this.f108887q, flVar.f108887q) && n51.f.a(this.f108888r, flVar.f108888r) && n51.f.a(java.lang.Integer.valueOf(this.f108889s), java.lang.Integer.valueOf(flVar.f108889s)) && n51.f.a(java.lang.Boolean.valueOf(this.f108890t), java.lang.Boolean.valueOf(flVar.f108890t)) && n51.f.a(java.lang.Integer.valueOf(this.f108891u), java.lang.Integer.valueOf(flVar.f108891u)) && n51.f.a(java.lang.Long.valueOf(this.f108892v), java.lang.Long.valueOf(flVar.f108892v)) && n51.f.a(java.lang.Integer.valueOf(this.f108893w), java.lang.Integer.valueOf(flVar.f108893w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108885o;
        java.util.LinkedList linkedList2 = this.f108881h;
        int i18 = 0;
        boolean[] zArr = this.f108894x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108877d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f108878e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108879f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f108880g);
            }
            fVar.g(6, 8, linkedList2);
            if (zArr[7]) {
                fVar.e(7, this.f108882i);
            }
            if (zArr[8]) {
                fVar.h(8, this.f108883m);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108884n);
            }
            fVar.g(11, 8, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f108886p);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108887q;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            bw5.al alVar = this.f108888r;
            if (alVar != null && zArr[14]) {
                fVar.i(14, alVar.mo75928xcd1e8d8());
                this.f108888r.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f108889s);
            }
            if (zArr[16]) {
                fVar.a(16, this.f108890t);
            }
            if (zArr[17]) {
                fVar.e(17, this.f108891u);
            }
            if (zArr[18]) {
                fVar.h(18, this.f108892v);
            }
            if (zArr[19]) {
                fVar.e(19, this.f108893w);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f108877d;
            if (str2 != null && zArr[1]) {
                i18 = b36.f.j(1, str2) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f108878e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f108879f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f108880g);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList2);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f108882i);
            }
            if (zArr[8]) {
                g17 += b36.f.h(8, this.f108883m);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f108884n);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList);
            if (zArr[12]) {
                g18 += b36.f.e(12, this.f108886p);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108887q;
            if (gVar2 != null && zArr[13]) {
                g18 += b36.f.b(13, gVar2);
            }
            bw5.al alVar2 = this.f108888r;
            if (alVar2 != null && zArr[14]) {
                g18 += b36.f.i(14, alVar2.mo75928xcd1e8d8());
            }
            if (zArr[15]) {
                g18 += b36.f.e(15, this.f108889s);
            }
            if (zArr[16]) {
                g18 += b36.f.a(16, this.f108890t);
            }
            if (zArr[17]) {
                g18 += b36.f.e(17, this.f108891u);
            }
            if (zArr[18]) {
                g18 += b36.f.h(18, this.f108892v);
            }
            return zArr[19] ? g18 + b36.f.e(19, this.f108893w) : g18;
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
                this.f108877d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108878e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108879f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108880g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 9:
            default:
                return -1;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.cl clVar = new bw5.cl();
                    if (bArr != null && bArr.length > 0) {
                        clVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(clVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f108882i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108883m = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 10:
                this.f108884n = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.kn knVar = new bw5.kn();
                    if (bArr2 != null && bArr2.length > 0) {
                        knVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(knVar);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f108886p = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108887q = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.al alVar3 = new bw5.al();
                    if (bArr3 != null && bArr3.length > 0) {
                        alVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f108888r = alVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f108889s = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108890t = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108891u = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108892v = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f108893w = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
        }
    }
}

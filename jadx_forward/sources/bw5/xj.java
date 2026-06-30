package bw5;

/* loaded from: classes2.dex */
public class xj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.dg A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116662d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116663e;

    /* renamed from: f, reason: collision with root package name */
    public long f116664f;

    /* renamed from: g, reason: collision with root package name */
    public int f116665g;

    /* renamed from: h, reason: collision with root package name */
    public int f116666h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116667i;

    /* renamed from: m, reason: collision with root package name */
    public long f116668m;

    /* renamed from: n, reason: collision with root package name */
    public int f116669n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ee f116670o;

    /* renamed from: p, reason: collision with root package name */
    public int f116671p;

    /* renamed from: q, reason: collision with root package name */
    public int f116672q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f116673r;

    /* renamed from: s, reason: collision with root package name */
    public int f116674s;

    /* renamed from: t, reason: collision with root package name */
    public int f116675t;

    /* renamed from: u, reason: collision with root package name */
    public int f116676u;

    /* renamed from: v, reason: collision with root package name */
    public int f116677v;

    /* renamed from: w, reason: collision with root package name */
    public int f116678w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.eu f116679x;

    /* renamed from: z, reason: collision with root package name */
    public bw5.dh f116681z;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f116680y = new java.util.LinkedList();
    public final boolean[] B = new boolean[23];

    static {
        new bw5.xj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xj mo11468x92b714fd(byte[] bArr) {
        return (bw5.xj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xj)) {
            return false;
        }
        bw5.xj xjVar = (bw5.xj) fVar;
        return n51.f.a(this.f116662d, xjVar.f116662d) && n51.f.a(this.f116663e, xjVar.f116663e) && n51.f.a(java.lang.Long.valueOf(this.f116664f), java.lang.Long.valueOf(xjVar.f116664f)) && n51.f.a(java.lang.Integer.valueOf(this.f116665g), java.lang.Integer.valueOf(xjVar.f116665g)) && n51.f.a(java.lang.Integer.valueOf(this.f116666h), java.lang.Integer.valueOf(xjVar.f116666h)) && n51.f.a(this.f116667i, xjVar.f116667i) && n51.f.a(java.lang.Long.valueOf(this.f116668m), java.lang.Long.valueOf(xjVar.f116668m)) && n51.f.a(java.lang.Integer.valueOf(this.f116669n), java.lang.Integer.valueOf(xjVar.f116669n)) && n51.f.a(this.f116670o, xjVar.f116670o) && n51.f.a(java.lang.Integer.valueOf(this.f116671p), java.lang.Integer.valueOf(xjVar.f116671p)) && n51.f.a(java.lang.Integer.valueOf(this.f116672q), java.lang.Integer.valueOf(xjVar.f116672q)) && n51.f.a(this.f116673r, xjVar.f116673r) && n51.f.a(java.lang.Integer.valueOf(this.f116674s), java.lang.Integer.valueOf(xjVar.f116674s)) && n51.f.a(java.lang.Integer.valueOf(this.f116675t), java.lang.Integer.valueOf(xjVar.f116675t)) && n51.f.a(java.lang.Integer.valueOf(this.f116676u), java.lang.Integer.valueOf(xjVar.f116676u)) && n51.f.a(java.lang.Integer.valueOf(this.f116677v), java.lang.Integer.valueOf(xjVar.f116677v)) && n51.f.a(java.lang.Integer.valueOf(this.f116678w), java.lang.Integer.valueOf(xjVar.f116678w)) && n51.f.a(this.f116679x, xjVar.f116679x) && n51.f.a(this.f116680y, xjVar.f116680y) && n51.f.a(this.f116681z, xjVar.f116681z) && n51.f.a(this.A, xjVar.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116662d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f116663e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f116664f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116665g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116666h);
            }
            java.lang.String str3 = this.f116667i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.h(7, this.f116668m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f116669n);
            }
            bw5.ee eeVar = this.f116670o;
            if (eeVar != null && zArr[9]) {
                fVar.i(9, eeVar.mo75928xcd1e8d8());
                this.f116670o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f116671p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f116672q);
            }
            java.lang.String str4 = this.f116673r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            if (zArr[13]) {
                fVar.e(13, this.f116674s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f116675t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f116676u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f116677v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f116678w);
            }
            bw5.eu euVar = this.f116679x;
            if (euVar != null && zArr[18]) {
                fVar.i(18, euVar.mo75928xcd1e8d8());
                this.f116679x.mo75956x3d5d1f78(fVar);
            }
            fVar.g(20, 8, this.f116680y);
            bw5.dh dhVar = this.f116681z;
            if (dhVar != null && zArr[21]) {
                fVar.i(21, dhVar.mo75928xcd1e8d8());
                this.f116681z.mo75956x3d5d1f78(fVar);
            }
            bw5.dg dgVar = this.A;
            if (dgVar != null && zArr[22]) {
                fVar.i(22, dgVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f116662d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            java.lang.String str6 = this.f116663e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f116664f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f116665g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f116666h);
            }
            java.lang.String str7 = this.f116667i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f116668m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f116669n);
            }
            bw5.ee eeVar2 = this.f116670o;
            if (eeVar2 != null && zArr[9]) {
                i18 += b36.f.i(9, eeVar2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f116671p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f116672q);
            }
            java.lang.String str8 = this.f116673r;
            if (str8 != null && zArr[12]) {
                i18 += b36.f.j(12, str8);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f116674s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f116675t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f116676u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f116677v);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f116678w);
            }
            bw5.eu euVar2 = this.f116679x;
            if (euVar2 != null && zArr[18]) {
                i18 += b36.f.i(18, euVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(20, 8, this.f116680y);
            bw5.dh dhVar2 = this.f116681z;
            if (dhVar2 != null && zArr[21]) {
                g17 += b36.f.i(21, dhVar2.mo75928xcd1e8d8());
            }
            bw5.dg dgVar2 = this.A;
            return (dgVar2 == null || !zArr[22]) ? g17 : g17 + b36.f.i(22, dgVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f116680y.clear();
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
                this.f116662d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116663e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116664f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116665g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116666h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116667i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116668m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116669n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ee eeVar3 = new bw5.ee();
                    if (bArr != null && bArr.length > 0) {
                        eeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f116670o = eeVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f116671p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f116672q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f116673r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f116674s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f116675t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f116676u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f116677v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f116678w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.eu euVar3 = new bw5.eu();
                    if (bArr2 != null && bArr2.length > 0) {
                        euVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f116679x = euVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
            default:
                return -1;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.eh ehVar = new bw5.eh();
                    if (bArr3 != null && bArr3.length > 0) {
                        ehVar.mo11468x92b714fd(bArr3);
                    }
                    this.f116680y.add(ehVar);
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.dh dhVar3 = new bw5.dh();
                    if (bArr4 != null && bArr4.length > 0) {
                        dhVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f116681z = dhVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.dg dgVar3 = new bw5.dg();
                    if (bArr5 != null && bArr5.length > 0) {
                        dgVar3.mo11468x92b714fd(bArr5);
                    }
                    this.A = dgVar3;
                }
                zArr[22] = true;
                return 0;
        }
    }
}

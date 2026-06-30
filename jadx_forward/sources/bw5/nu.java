package bw5;

/* loaded from: classes2.dex */
public class nu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f112349d;

    /* renamed from: e, reason: collision with root package name */
    public float f112350e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qu f112351f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ou f112352g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pu f112353h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f112354i;

    /* renamed from: m, reason: collision with root package name */
    public int f112355m;

    /* renamed from: n, reason: collision with root package name */
    public int f112356n;

    /* renamed from: o, reason: collision with root package name */
    public int f112357o;

    /* renamed from: p, reason: collision with root package name */
    public int f112358p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f112359q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f112360r = new boolean[16];

    static {
        new bw5.nu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nu mo11468x92b714fd(byte[] bArr) {
        return (bw5.nu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nu)) {
            return false;
        }
        bw5.nu nuVar = (bw5.nu) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f112349d), java.lang.Long.valueOf(nuVar.f112349d)) && n51.f.a(java.lang.Float.valueOf(this.f112350e), java.lang.Float.valueOf(nuVar.f112350e)) && n51.f.a(this.f112351f, nuVar.f112351f) && n51.f.a(this.f112352g, nuVar.f112352g) && n51.f.a(this.f112353h, nuVar.f112353h) && n51.f.a(java.lang.Boolean.valueOf(this.f112354i), java.lang.Boolean.valueOf(nuVar.f112354i)) && n51.f.a(java.lang.Integer.valueOf(this.f112355m), java.lang.Integer.valueOf(nuVar.f112355m)) && n51.f.a(java.lang.Integer.valueOf(this.f112356n), java.lang.Integer.valueOf(nuVar.f112356n)) && n51.f.a(java.lang.Integer.valueOf(this.f112357o), java.lang.Integer.valueOf(nuVar.f112357o)) && n51.f.a(java.lang.Integer.valueOf(this.f112358p), java.lang.Integer.valueOf(nuVar.f112358p)) && n51.f.a(this.f112359q, nuVar.f112359q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112359q;
        boolean[] zArr = this.f112360r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f112349d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f112350e);
            }
            bw5.qu quVar = this.f112351f;
            if (quVar != null && zArr[3]) {
                fVar.i(3, quVar.mo75928xcd1e8d8());
                this.f112351f.mo75956x3d5d1f78(fVar);
            }
            bw5.ou ouVar = this.f112352g;
            if (ouVar != null && zArr[4]) {
                fVar.i(4, ouVar.mo75928xcd1e8d8());
                this.f112352g.mo75956x3d5d1f78(fVar);
            }
            bw5.pu puVar = this.f112353h;
            if (puVar != null && zArr[5]) {
                fVar.i(5, puVar.mo75928xcd1e8d8());
                this.f112353h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f112354i);
            }
            if (zArr[11]) {
                fVar.e(11, this.f112355m);
            }
            if (zArr[12]) {
                fVar.e(12, this.f112356n);
            }
            if (zArr[13]) {
                fVar.e(13, this.f112357o);
            }
            if (zArr[14]) {
                fVar.e(14, this.f112358p);
            }
            fVar.g(15, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f112349d) : 0;
            if (zArr[2]) {
                h17 += b36.f.d(2, this.f112350e);
            }
            bw5.qu quVar2 = this.f112351f;
            if (quVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, quVar2.mo75928xcd1e8d8());
            }
            bw5.ou ouVar2 = this.f112352g;
            if (ouVar2 != null && zArr[4]) {
                h17 += b36.f.i(4, ouVar2.mo75928xcd1e8d8());
            }
            bw5.pu puVar2 = this.f112353h;
            if (puVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, puVar2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f112354i);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f112355m);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f112356n);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f112357o);
            }
            if (zArr[14]) {
                h17 += b36.f.e(14, this.f112358p);
            }
            return h17 + b36.f.g(15, 8, linkedList);
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
        if (intValue == 1) {
            this.f112349d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112350e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.qu quVar3 = new bw5.qu();
                if (bArr != null && bArr.length > 0) {
                    quVar3.mo11468x92b714fd(bArr);
                }
                this.f112351f = quVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.ou ouVar3 = new bw5.ou();
                if (bArr2 != null && bArr2.length > 0) {
                    ouVar3.mo11468x92b714fd(bArr2);
                }
                this.f112352g = ouVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.pu puVar3 = new bw5.pu();
                if (bArr3 != null && bArr3.length > 0) {
                    puVar3.mo11468x92b714fd(bArr3);
                }
                this.f112353h = puVar3;
            }
            zArr[5] = true;
            return 0;
        }
        switch (intValue) {
            case 10:
                this.f112354i = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f112355m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f112356n = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f112357o = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f112358p = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.rp rpVar = new bw5.rp();
                    if (bArr4 != null && bArr4.length > 0) {
                        rpVar.mo11468x92b714fd(bArr4);
                    }
                    linkedList.add(rpVar);
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}

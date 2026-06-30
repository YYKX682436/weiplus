package bw5;

/* loaded from: classes2.dex */
public class bl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public boolean f107256f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107257g;

    /* renamed from: h, reason: collision with root package name */
    public int f107258h;

    /* renamed from: i, reason: collision with root package name */
    public int f107259i;

    /* renamed from: m, reason: collision with root package name */
    public int f107260m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107261n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f107254d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f107255e = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f107262o = new boolean[13];

    static {
        new bw5.bl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bl mo11468x92b714fd(byte[] bArr) {
        return (bw5.bl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bl)) {
            return false;
        }
        bw5.bl blVar = (bw5.bl) fVar;
        return n51.f.a(this.f107254d, blVar.f107254d) && n51.f.a(this.f107255e, blVar.f107255e) && n51.f.a(java.lang.Boolean.valueOf(this.f107256f), java.lang.Boolean.valueOf(blVar.f107256f)) && n51.f.a(java.lang.Boolean.valueOf(this.f107257g), java.lang.Boolean.valueOf(blVar.f107257g)) && n51.f.a(java.lang.Integer.valueOf(this.f107258h), java.lang.Integer.valueOf(blVar.f107258h)) && n51.f.a(java.lang.Integer.valueOf(this.f107259i), java.lang.Integer.valueOf(blVar.f107259i)) && n51.f.a(java.lang.Integer.valueOf(this.f107260m), java.lang.Integer.valueOf(blVar.f107260m)) && n51.f.a(this.f107261n, blVar.f107261n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107255e;
        java.util.LinkedList linkedList2 = this.f107254d;
        boolean[] zArr = this.f107262o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.a(7, this.f107256f);
            }
            if (zArr[8]) {
                fVar.a(8, this.f107257g);
            }
            if (zArr[9]) {
                fVar.e(9, this.f107258h);
            }
            if (zArr[10]) {
                fVar.e(10, this.f107259i);
            }
            if (zArr[11]) {
                fVar.e(11, this.f107260m);
            }
            java.lang.String str = this.f107261n;
            if (str != null && zArr[12]) {
                fVar.j(12, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(5, 8, linkedList2) + 0 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f107256f);
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f107257g);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f107258h);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f107259i);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f107260m);
            }
            java.lang.String str2 = this.f107261n;
            return (str2 == null || !zArr[12]) ? g17 : g17 + b36.f.j(12, str2);
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
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dl dlVar = new bw5.dl();
                    if (bArr != null && bArr.length > 0) {
                        dlVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(dlVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.el elVar = new bw5.el();
                    if (bArr2 != null && bArr2.length > 0) {
                        elVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(elVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f107256f = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107257g = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107258h = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107259i = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107260m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107261n = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}

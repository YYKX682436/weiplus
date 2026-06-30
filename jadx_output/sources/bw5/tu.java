package bw5;

/* loaded from: classes2.dex */
public class tu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33603d;

    /* renamed from: e, reason: collision with root package name */
    public float f33604e;

    /* renamed from: f, reason: collision with root package name */
    public int f33605f;

    /* renamed from: g, reason: collision with root package name */
    public int f33606g;

    /* renamed from: h, reason: collision with root package name */
    public int f33607h;

    /* renamed from: i, reason: collision with root package name */
    public int f33608i;

    /* renamed from: n, reason: collision with root package name */
    public float f33610n;

    /* renamed from: p, reason: collision with root package name */
    public int f33612p;

    /* renamed from: q, reason: collision with root package name */
    public int f33613q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f33609m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f33611o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f33614r = new boolean[12];

    static {
        new bw5.tu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tu parseFrom(byte[] bArr) {
        return (bw5.tu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tu)) {
            return false;
        }
        bw5.tu tuVar = (bw5.tu) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33603d), java.lang.Integer.valueOf(tuVar.f33603d)) && n51.f.a(java.lang.Float.valueOf(this.f33604e), java.lang.Float.valueOf(tuVar.f33604e)) && n51.f.a(java.lang.Integer.valueOf(this.f33605f), java.lang.Integer.valueOf(tuVar.f33605f)) && n51.f.a(java.lang.Integer.valueOf(this.f33606g), java.lang.Integer.valueOf(tuVar.f33606g)) && n51.f.a(java.lang.Integer.valueOf(this.f33607h), java.lang.Integer.valueOf(tuVar.f33607h)) && n51.f.a(java.lang.Integer.valueOf(this.f33608i), java.lang.Integer.valueOf(tuVar.f33608i)) && n51.f.a(this.f33609m, tuVar.f33609m) && n51.f.a(java.lang.Float.valueOf(this.f33610n), java.lang.Float.valueOf(tuVar.f33610n)) && n51.f.a(this.f33611o, tuVar.f33611o) && n51.f.a(java.lang.Integer.valueOf(this.f33612p), java.lang.Integer.valueOf(tuVar.f33612p)) && n51.f.a(java.lang.Integer.valueOf(this.f33613q), java.lang.Integer.valueOf(tuVar.f33613q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33611o;
        java.util.LinkedList linkedList2 = this.f33609m;
        boolean[] zArr = this.f33614r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33603d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f33604e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33605f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33606g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33607h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33608i);
            }
            fVar.g(7, 1, linkedList2);
            if (zArr[8]) {
                fVar.d(8, this.f33610n);
            }
            fVar.g(9, 8, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f33612p);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.e(11, this.f33613q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33603d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f33604e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f33605f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f33606g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f33607h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f33608i);
            }
            int g17 = e17 + b36.f.g(7, 1, linkedList2);
            if (zArr[8]) {
                g17 += b36.f.d(8, this.f33610n);
            }
            int g18 = g17 + b36.f.g(9, 8, linkedList);
            if (zArr[10]) {
                g18 += b36.f.e(10, this.f33612p);
            }
            return zArr[11] ? g18 + b36.f.e(11, this.f33613q) : g18;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                this.f33603d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33604e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33605f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33606g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33607h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33608i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                this.f33610n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.uu uuVar = new bw5.uu();
                    if (bArr != null && bArr.length > 0) {
                        uuVar.parseFrom(bArr);
                    }
                    linkedList.add(uuVar);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f33612p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33613q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}

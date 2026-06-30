package bw5;

/* loaded from: classes2.dex */
public class fl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27344d;

    /* renamed from: e, reason: collision with root package name */
    public long f27345e;

    /* renamed from: f, reason: collision with root package name */
    public int f27346f;

    /* renamed from: g, reason: collision with root package name */
    public int f27347g;

    /* renamed from: i, reason: collision with root package name */
    public int f27349i;

    /* renamed from: m, reason: collision with root package name */
    public long f27350m;

    /* renamed from: n, reason: collision with root package name */
    public int f27351n;

    /* renamed from: p, reason: collision with root package name */
    public int f27353p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27354q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.al f27355r;

    /* renamed from: s, reason: collision with root package name */
    public int f27356s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27357t;

    /* renamed from: u, reason: collision with root package name */
    public int f27358u;

    /* renamed from: v, reason: collision with root package name */
    public long f27359v;

    /* renamed from: w, reason: collision with root package name */
    public int f27360w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f27348h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f27352o = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f27361x = new boolean[20];

    static {
        new bw5.fl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fl parseFrom(byte[] bArr) {
        return (bw5.fl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fl)) {
            return false;
        }
        bw5.fl flVar = (bw5.fl) fVar;
        return n51.f.a(this.f27344d, flVar.f27344d) && n51.f.a(java.lang.Long.valueOf(this.f27345e), java.lang.Long.valueOf(flVar.f27345e)) && n51.f.a(java.lang.Integer.valueOf(this.f27346f), java.lang.Integer.valueOf(flVar.f27346f)) && n51.f.a(java.lang.Integer.valueOf(this.f27347g), java.lang.Integer.valueOf(flVar.f27347g)) && n51.f.a(this.f27348h, flVar.f27348h) && n51.f.a(java.lang.Integer.valueOf(this.f27349i), java.lang.Integer.valueOf(flVar.f27349i)) && n51.f.a(java.lang.Long.valueOf(this.f27350m), java.lang.Long.valueOf(flVar.f27350m)) && n51.f.a(java.lang.Integer.valueOf(this.f27351n), java.lang.Integer.valueOf(flVar.f27351n)) && n51.f.a(this.f27352o, flVar.f27352o) && n51.f.a(java.lang.Integer.valueOf(this.f27353p), java.lang.Integer.valueOf(flVar.f27353p)) && n51.f.a(this.f27354q, flVar.f27354q) && n51.f.a(this.f27355r, flVar.f27355r) && n51.f.a(java.lang.Integer.valueOf(this.f27356s), java.lang.Integer.valueOf(flVar.f27356s)) && n51.f.a(java.lang.Boolean.valueOf(this.f27357t), java.lang.Boolean.valueOf(flVar.f27357t)) && n51.f.a(java.lang.Integer.valueOf(this.f27358u), java.lang.Integer.valueOf(flVar.f27358u)) && n51.f.a(java.lang.Long.valueOf(this.f27359v), java.lang.Long.valueOf(flVar.f27359v)) && n51.f.a(java.lang.Integer.valueOf(this.f27360w), java.lang.Integer.valueOf(flVar.f27360w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27352o;
        java.util.LinkedList linkedList2 = this.f27348h;
        int i18 = 0;
        boolean[] zArr = this.f27361x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27344d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f27345e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27346f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27347g);
            }
            fVar.g(6, 8, linkedList2);
            if (zArr[7]) {
                fVar.e(7, this.f27349i);
            }
            if (zArr[8]) {
                fVar.h(8, this.f27350m);
            }
            if (zArr[10]) {
                fVar.e(10, this.f27351n);
            }
            fVar.g(11, 8, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f27353p);
            }
            com.tencent.mm.protobuf.g gVar = this.f27354q;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            bw5.al alVar = this.f27355r;
            if (alVar != null && zArr[14]) {
                fVar.i(14, alVar.computeSize());
                this.f27355r.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f27356s);
            }
            if (zArr[16]) {
                fVar.a(16, this.f27357t);
            }
            if (zArr[17]) {
                fVar.e(17, this.f27358u);
            }
            if (zArr[18]) {
                fVar.h(18, this.f27359v);
            }
            if (zArr[19]) {
                fVar.e(19, this.f27360w);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27344d;
            if (str2 != null && zArr[1]) {
                i18 = b36.f.j(1, str2) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f27345e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27346f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f27347g);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList2);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f27349i);
            }
            if (zArr[8]) {
                g17 += b36.f.h(8, this.f27350m);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f27351n);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList);
            if (zArr[12]) {
                g18 += b36.f.e(12, this.f27353p);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27354q;
            if (gVar2 != null && zArr[13]) {
                g18 += b36.f.b(13, gVar2);
            }
            bw5.al alVar2 = this.f27355r;
            if (alVar2 != null && zArr[14]) {
                g18 += b36.f.i(14, alVar2.computeSize());
            }
            if (zArr[15]) {
                g18 += b36.f.e(15, this.f27356s);
            }
            if (zArr[16]) {
                g18 += b36.f.a(16, this.f27357t);
            }
            if (zArr[17]) {
                g18 += b36.f.e(17, this.f27358u);
            }
            if (zArr[18]) {
                g18 += b36.f.h(18, this.f27359v);
            }
            return zArr[19] ? g18 + b36.f.e(19, this.f27360w) : g18;
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
                this.f27344d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27345e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27346f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27347g = aVar2.g(intValue);
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
                        clVar.parseFrom(bArr);
                    }
                    linkedList2.add(clVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f27349i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27350m = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 10:
                this.f27351n = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.kn knVar = new bw5.kn();
                    if (bArr2 != null && bArr2.length > 0) {
                        knVar.parseFrom(bArr2);
                    }
                    linkedList.add(knVar);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f27353p = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27354q = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.al alVar3 = new bw5.al();
                    if (bArr3 != null && bArr3.length > 0) {
                        alVar3.parseFrom(bArr3);
                    }
                    this.f27355r = alVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f27356s = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27357t = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27358u = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27359v = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27360w = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
        }
    }
}

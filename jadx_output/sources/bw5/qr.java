package bw5;

/* loaded from: classes2.dex */
public class qr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32230d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32231e;

    /* renamed from: f, reason: collision with root package name */
    public double f32232f;

    /* renamed from: g, reason: collision with root package name */
    public int f32233g;

    /* renamed from: m, reason: collision with root package name */
    public double f32236m;

    /* renamed from: p, reason: collision with root package name */
    public int f32239p;

    /* renamed from: q, reason: collision with root package name */
    public int f32240q;

    /* renamed from: r, reason: collision with root package name */
    public int f32241r;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f32234h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f32235i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f32237n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f32238o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f32242s = new boolean[14];

    static {
        new bw5.qr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qr parseFrom(byte[] bArr) {
        return (bw5.qr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qr)) {
            return false;
        }
        bw5.qr qrVar = (bw5.qr) fVar;
        return n51.f.a(this.f32230d, qrVar.f32230d) && n51.f.a(this.f32231e, qrVar.f32231e) && n51.f.a(java.lang.Double.valueOf(this.f32232f), java.lang.Double.valueOf(qrVar.f32232f)) && n51.f.a(java.lang.Integer.valueOf(this.f32233g), java.lang.Integer.valueOf(qrVar.f32233g)) && n51.f.a(this.f32234h, qrVar.f32234h) && n51.f.a(this.f32235i, qrVar.f32235i) && n51.f.a(java.lang.Double.valueOf(this.f32236m), java.lang.Double.valueOf(qrVar.f32236m)) && n51.f.a(this.f32237n, qrVar.f32237n) && n51.f.a(this.f32238o, qrVar.f32238o) && n51.f.a(java.lang.Integer.valueOf(this.f32239p), java.lang.Integer.valueOf(qrVar.f32239p)) && n51.f.a(java.lang.Integer.valueOf(this.f32240q), java.lang.Integer.valueOf(qrVar.f32240q)) && n51.f.a(java.lang.Integer.valueOf(this.f32241r), java.lang.Integer.valueOf(qrVar.f32241r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32238o;
        java.util.LinkedList linkedList2 = this.f32237n;
        java.util.LinkedList linkedList3 = this.f32235i;
        java.util.LinkedList linkedList4 = this.f32234h;
        int i18 = 0;
        boolean[] zArr = this.f32242s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32230d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32231e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[4]) {
                fVar.c(4, this.f32232f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32233g);
            }
            fVar.g(6, 1, linkedList4);
            fVar.g(7, 8, linkedList3);
            if (zArr[8]) {
                fVar.c(8, this.f32236m);
            }
            fVar.g(9, 8, linkedList2);
            fVar.g(10, 8, linkedList);
            if (zArr[11]) {
                fVar.e(11, this.f32239p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32240q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32241r);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f32230d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            java.lang.String str4 = this.f32231e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.c(4, this.f32232f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f32233g);
            }
            int g17 = i18 + b36.f.g(6, 1, linkedList4) + b36.f.g(7, 8, linkedList3);
            if (zArr[8]) {
                g17 += b36.f.c(8, this.f32236m);
            }
            int g18 = g17 + b36.f.g(9, 8, linkedList2) + b36.f.g(10, 8, linkedList);
            if (zArr[11]) {
                g18 += b36.f.e(11, this.f32239p);
            }
            if (zArr[12]) {
                g18 += b36.f.e(12, this.f32240q);
            }
            return zArr[13] ? g18 + b36.f.e(13, this.f32241r) : g18;
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
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
                this.f32230d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32231e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                this.f32232f = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32233g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList4.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.cg0 cg0Var = new bw5.cg0();
                    if (bArr != null && bArr.length > 0) {
                        cg0Var.parseFrom(bArr);
                    }
                    linkedList3.add(cg0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f32236m = aVar2.e(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.i00 i00Var = new bw5.i00();
                    if (bArr2 != null && bArr2.length > 0) {
                        i00Var.parseFrom(bArr2);
                    }
                    linkedList2.add(i00Var);
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.eg0 eg0Var = new bw5.eg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        eg0Var.parseFrom(bArr3);
                    }
                    linkedList.add(eg0Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f32239p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32240q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32241r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
        }
    }
}

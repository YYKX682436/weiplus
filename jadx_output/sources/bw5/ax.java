package bw5;

/* loaded from: classes2.dex */
public class ax extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25444d;

    /* renamed from: e, reason: collision with root package name */
    public long f25445e;

    /* renamed from: f, reason: collision with root package name */
    public long f25446f;

    /* renamed from: g, reason: collision with root package name */
    public long f25447g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f25448h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f25449i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25450m = new boolean[7];

    static {
        new bw5.ax();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ax parseFrom(byte[] bArr) {
        return (bw5.ax) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ax)) {
            return false;
        }
        bw5.ax axVar = (bw5.ax) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25444d), java.lang.Integer.valueOf(axVar.f25444d)) && n51.f.a(java.lang.Long.valueOf(this.f25445e), java.lang.Long.valueOf(axVar.f25445e)) && n51.f.a(java.lang.Long.valueOf(this.f25446f), java.lang.Long.valueOf(axVar.f25446f)) && n51.f.a(java.lang.Long.valueOf(this.f25447g), java.lang.Long.valueOf(axVar.f25447g)) && n51.f.a(this.f25448h, axVar.f25448h) && n51.f.a(this.f25449i, axVar.f25449i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ax();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25449i;
        java.util.LinkedList linkedList2 = this.f25448h;
        boolean[] zArr = this.f25450m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25444d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25445e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f25446f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25447g);
            }
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25444d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f25445e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f25446f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f25447g);
            }
            return e17 + b36.f.g(5, 8, linkedList2) + b36.f.g(6, 8, linkedList);
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
                this.f25444d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25445e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25446f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25447g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dx dxVar = new bw5.dx();
                    if (bArr != null && bArr.length > 0) {
                        dxVar.parseFrom(bArr);
                    }
                    linkedList2.add(dxVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.cx cxVar = new bw5.cx();
                    if (bArr2 != null && bArr2.length > 0) {
                        cxVar.parseFrom(bArr2);
                    }
                    linkedList.add(cxVar);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

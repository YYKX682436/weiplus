package bw5;

/* loaded from: classes2.dex */
public class tn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33526d;

    /* renamed from: i, reason: collision with root package name */
    public int f33531i;

    /* renamed from: m, reason: collision with root package name */
    public int f33532m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f33527e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f33528f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f33529g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f33530h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f33533n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f33534o = new boolean[9];

    static {
        new bw5.tn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tn parseFrom(byte[] bArr) {
        return (bw5.tn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tn)) {
            return false;
        }
        bw5.tn tnVar = (bw5.tn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33526d), java.lang.Integer.valueOf(tnVar.f33526d)) && n51.f.a(this.f33527e, tnVar.f33527e) && n51.f.a(this.f33528f, tnVar.f33528f) && n51.f.a(this.f33529g, tnVar.f33529g) && n51.f.a(this.f33530h, tnVar.f33530h) && n51.f.a(java.lang.Integer.valueOf(this.f33531i), java.lang.Integer.valueOf(tnVar.f33531i)) && n51.f.a(java.lang.Integer.valueOf(this.f33532m), java.lang.Integer.valueOf(tnVar.f33532m)) && n51.f.a(this.f33533n, tnVar.f33533n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33533n;
        java.util.LinkedList linkedList2 = this.f33530h;
        java.util.LinkedList linkedList3 = this.f33529g;
        java.util.LinkedList linkedList4 = this.f33528f;
        java.util.LinkedList linkedList5 = this.f33527e;
        boolean[] zArr = this.f33534o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33526d);
            }
            fVar.g(2, 1, linkedList5);
            fVar.g(3, 1, linkedList4);
            fVar.g(4, 1, linkedList3);
            fVar.g(5, 1, linkedList2);
            if (zArr[6]) {
                fVar.e(6, this.f33531i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33532m);
            }
            fVar.g(8, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f33526d) : 0) + b36.f.g(2, 1, linkedList5) + b36.f.g(3, 1, linkedList4) + b36.f.g(4, 1, linkedList3) + b36.f.g(5, 1, linkedList2);
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f33531i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f33532m);
            }
            return e17 + b36.f.g(8, 2, linkedList);
        }
        if (i17 == 2) {
            linkedList5.clear();
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
                this.f33526d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList5.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                linkedList4.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                linkedList3.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                linkedList2.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f33531i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33532m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

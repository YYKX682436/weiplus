package bw5;

/* loaded from: classes2.dex */
public class ew extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27084d;

    /* renamed from: e, reason: collision with root package name */
    public int f27085e;

    /* renamed from: f, reason: collision with root package name */
    public int f27086f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f27087g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27088h = new boolean[5];

    static {
        new bw5.ew();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ew parseFrom(byte[] bArr) {
        return (bw5.ew) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ew)) {
            return false;
        }
        bw5.ew ewVar = (bw5.ew) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27084d), java.lang.Integer.valueOf(ewVar.f27084d)) && n51.f.a(java.lang.Integer.valueOf(this.f27085e), java.lang.Integer.valueOf(ewVar.f27085e)) && n51.f.a(java.lang.Integer.valueOf(this.f27086f), java.lang.Integer.valueOf(ewVar.f27086f)) && n51.f.a(this.f27087g, ewVar.f27087g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ew();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27087g;
        boolean[] zArr = this.f27088h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27084d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27085e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27086f);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27084d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27085e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27086f);
            }
            return e17 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.f27084d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27085e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27086f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ae aeVar = new bw5.ae();
            if (bArr != null && bArr.length > 0) {
                aeVar.parseFrom(bArr);
            }
            linkedList.add(aeVar);
        }
        zArr[4] = true;
        return 0;
    }
}

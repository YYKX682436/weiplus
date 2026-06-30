package bw5;

/* loaded from: classes2.dex */
public class oh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31095d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f31096e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f31097f = new boolean[3];

    static {
        new bw5.oh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oh parseFrom(byte[] bArr) {
        return (bw5.oh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oh)) {
            return false;
        }
        bw5.oh ohVar = (bw5.oh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31095d), java.lang.Integer.valueOf(ohVar.f31095d)) && n51.f.a(this.f31096e, ohVar.f31096e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31096e;
        boolean[] zArr = this.f31097f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31095d);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.e(1, this.f31095d) : 0) + b36.f.g(2, 8, linkedList);
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
            this.f31095d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.nh nhVar = new bw5.nh();
            if (bArr != null && bArr.length > 0) {
                nhVar.parseFrom(bArr);
            }
            linkedList.add(nhVar);
        }
        zArr[2] = true;
        return 0;
    }
}

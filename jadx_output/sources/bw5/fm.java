package bw5;

/* loaded from: classes2.dex */
public class fm extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f27367e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f27366d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27368f = new boolean[3];

    static {
        new bw5.fm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fm parseFrom(byte[] bArr) {
        return (bw5.fm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fm)) {
            return false;
        }
        bw5.fm fmVar = (bw5.fm) fVar;
        return n51.f.a(this.f27366d, fmVar.f27366d) && n51.f.a(java.lang.Integer.valueOf(this.f27367e), java.lang.Integer.valueOf(fmVar.f27367e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27368f;
        java.util.LinkedList linkedList = this.f27366d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f27367e);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            return zArr[2] ? g17 + b36.f.e(2, this.f27367e) : g17;
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f27367e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.em emVar = new bw5.em();
            if (bArr != null && bArr.length > 0) {
                emVar.parseFrom(bArr);
            }
            linkedList.add(emVar);
        }
        zArr[1] = true;
        return 0;
    }
}

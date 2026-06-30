package bw5;

/* loaded from: classes2.dex */
public class eo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f26974d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f26975e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f26976f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f26977g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26978h = new boolean[5];

    static {
        new bw5.eo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eo parseFrom(byte[] bArr) {
        return (bw5.eo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eo)) {
            return false;
        }
        bw5.eo eoVar = (bw5.eo) fVar;
        return n51.f.a(this.f26974d, eoVar.f26974d) && n51.f.a(this.f26975e, eoVar.f26975e) && n51.f.a(this.f26976f, eoVar.f26976f) && n51.f.a(this.f26977g, eoVar.f26977g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.eo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26977g;
        java.util.LinkedList linkedList2 = this.f26976f;
        java.util.LinkedList linkedList3 = this.f26975e;
        java.util.LinkedList linkedList4 = this.f26974d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList4);
            fVar.g(2, 8, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, linkedList4) + 0 + b36.f.g(2, 8, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 2, linkedList);
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
        boolean[] zArr = this.f26978h;
        if (intValue == 1) {
            linkedList4.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.Cdo cdo = new bw5.Cdo();
            if (bArr != null && bArr.length > 0) {
                cdo.parseFrom(bArr);
            }
            linkedList3.add(cdo);
        }
        zArr[2] = true;
        return 0;
    }
}

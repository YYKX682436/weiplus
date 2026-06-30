package bw5;

/* loaded from: classes2.dex */
public class ck extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26121e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f26120d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26122f = new boolean[3];

    static {
        new bw5.ck();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ck parseFrom(byte[] bArr) {
        return (bw5.ck) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ck)) {
            return false;
        }
        bw5.ck ckVar = (bw5.ck) fVar;
        return n51.f.a(this.f26120d, ckVar.f26120d) && n51.f.a(this.f26121e, ckVar.f26121e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ck();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26122f;
        java.util.LinkedList linkedList = this.f26120d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f26121e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f26121e;
            return (gVar2 == null || !zArr[2]) ? g17 : g17 + b36.f.b(2, gVar2);
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
            this.f26121e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.bk bkVar = new bw5.bk();
            if (bArr != null && bArr.length > 0) {
                bkVar.parseFrom(bArr);
            }
            linkedList.add(bkVar);
        }
        zArr[1] = true;
        return 0;
    }
}

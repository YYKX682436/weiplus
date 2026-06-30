package bw5;

/* loaded from: classes2.dex */
public class yt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ds f35698d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35699e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35700f = new boolean[3];

    static {
        new bw5.yt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yt parseFrom(byte[] bArr) {
        return (bw5.yt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yt)) {
            return false;
        }
        bw5.yt ytVar = (bw5.yt) fVar;
        return n51.f.a(this.f35698d, ytVar.f35698d) && n51.f.a(this.f35699e, ytVar.f35699e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35700f;
        java.util.LinkedList linkedList = this.f35699e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ds dsVar = this.f35698d;
            if (dsVar != null && zArr[1]) {
                fVar.i(1, dsVar.computeSize());
                this.f35698d.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.ds dsVar2 = this.f35698d;
            if (dsVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dsVar2.computeSize());
            }
            return i18 + b36.f.g(2, 1, linkedList);
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
            linkedList.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ds dsVar3 = new bw5.ds();
            if (bArr != null && bArr.length > 0) {
                dsVar3.parseFrom(bArr);
            }
            this.f35698d = dsVar3;
        }
        zArr[1] = true;
        return 0;
    }
}

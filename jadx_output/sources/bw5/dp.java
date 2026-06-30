package bw5;

/* loaded from: classes2.dex */
public class dp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fl f26577d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bn f26578e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26580g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f26579f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26581h = new boolean[5];

    static {
        new bw5.dp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dp parseFrom(byte[] bArr) {
        return (bw5.dp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dp)) {
            return false;
        }
        bw5.dp dpVar = (bw5.dp) fVar;
        return n51.f.a(this.f26577d, dpVar.f26577d) && n51.f.a(this.f26578e, dpVar.f26578e) && n51.f.a(this.f26579f, dpVar.f26579f) && n51.f.a(this.f26580g, dpVar.f26580g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26579f;
        boolean[] zArr = this.f26581h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fl flVar = this.f26577d;
            if (flVar != null && zArr[1]) {
                fVar.i(1, flVar.computeSize());
                this.f26577d.writeFields(fVar);
            }
            bw5.bn bnVar = this.f26578e;
            if (bnVar != null && zArr[2]) {
                fVar.i(2, bnVar.computeSize());
                this.f26578e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f26580g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fl flVar2 = this.f26577d;
            if (flVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, flVar2.computeSize());
            }
            bw5.bn bnVar2 = this.f26578e;
            if (bnVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, bnVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f26580g;
            return (gVar2 == null || !zArr[4]) ? g17 : g17 + b36.f.b(4, gVar2);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.fl flVar3 = new bw5.fl();
                if (bArr != null && bArr.length > 0) {
                    flVar3.parseFrom(bArr);
                }
                this.f26577d = flVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.bn bnVar3 = new bw5.bn();
                if (bArr2 != null && bArr2.length > 0) {
                    bnVar3.parseFrom(bArr2);
                }
                this.f26578e = bnVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f26580g = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.bn bnVar4 = new bw5.bn();
            if (bArr3 != null && bArr3.length > 0) {
                bnVar4.parseFrom(bArr3);
            }
            linkedList.add(bnVar4);
        }
        zArr[3] = true;
        return 0;
    }
}

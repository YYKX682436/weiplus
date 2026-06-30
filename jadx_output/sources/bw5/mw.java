package bw5;

/* loaded from: classes2.dex */
public class mw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f30399d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f30400e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f30401f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30402g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30403h = new boolean[5];

    static {
        new bw5.mw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mw parseFrom(byte[] bArr) {
        return (bw5.mw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mw)) {
            return false;
        }
        bw5.mw mwVar = (bw5.mw) fVar;
        return n51.f.a(this.f30399d, mwVar.f30399d) && n51.f.a(this.f30400e, mwVar.f30400e) && n51.f.a(this.f30401f, mwVar.f30401f) && n51.f.a(this.f30402g, mwVar.f30402g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30402g;
        java.util.LinkedList linkedList2 = this.f30401f;
        java.util.LinkedList linkedList3 = this.f30400e;
        java.util.LinkedList linkedList4 = this.f30399d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList4);
            fVar.g(2, 8, linkedList3);
            fVar.g(3, 3, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList4) + 0 + b36.f.g(2, 8, linkedList3) + b36.f.g(3, 3, linkedList2) + b36.f.g(4, 8, linkedList);
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
        boolean[] zArr = this.f30403h;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.kw kwVar = new bw5.kw();
                if (bArr != null && bArr.length > 0) {
                    kwVar.parseFrom(bArr);
                }
                linkedList4.add(kwVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.hw hwVar = new bw5.hw();
                if (bArr2 != null && bArr2.length > 0) {
                    hwVar.parseFrom(bArr2);
                }
                linkedList3.add(hwVar);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.vo voVar = new bw5.vo();
            if (bArr3 != null && bArr3.length > 0) {
                voVar.parseFrom(bArr3);
            }
            linkedList.add(voVar);
        }
        zArr[4] = true;
        return 0;
    }
}

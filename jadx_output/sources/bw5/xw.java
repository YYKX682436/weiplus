package bw5;

/* loaded from: classes2.dex */
public class xw extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f35278e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35279f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f35277d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35280g = new boolean[4];

    static {
        new bw5.xw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xw parseFrom(byte[] bArr) {
        return (bw5.xw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xw)) {
            return false;
        }
        bw5.xw xwVar = (bw5.xw) fVar;
        return n51.f.a(this.f35277d, xwVar.f35277d) && n51.f.a(java.lang.Integer.valueOf(this.f35278e), java.lang.Integer.valueOf(xwVar.f35278e)) && n51.f.a(this.f35279f, xwVar.f35279f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35277d;
        boolean[] zArr = this.f35280g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f35278e);
            }
            com.tencent.mm.protobuf.g gVar = this.f35279f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f35278e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35279f;
            return (gVar2 == null || !zArr[3]) ? g17 : g17 + b36.f.b(3, gVar2);
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
            if (intValue == 2) {
                this.f35278e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f35279f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ww wwVar = new bw5.ww();
            if (bArr != null && bArr.length > 0) {
                wwVar.parseFrom(bArr);
            }
            linkedList.add(wwVar);
        }
        zArr[1] = true;
        return 0;
    }
}

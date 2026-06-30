package bw5;

/* loaded from: classes2.dex */
public class us extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.mv f34041d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34043f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34042e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34044g = new boolean[4];

    static {
        new bw5.us();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.us parseFrom(byte[] bArr) {
        return (bw5.us) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.us)) {
            return false;
        }
        bw5.us usVar = (bw5.us) fVar;
        return n51.f.a(this.f34041d, usVar.f34041d) && n51.f.a(this.f34042e, usVar.f34042e) && n51.f.a(this.f34043f, usVar.f34043f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.us();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34042e;
        boolean[] zArr = this.f34044g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.mv mvVar = this.f34041d;
            if (mvVar != null && zArr[1]) {
                fVar.i(1, mvVar.computeSize());
                this.f34041d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f34043f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.mv mvVar2 = this.f34041d;
            if (mvVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, mvVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f34043f;
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.mv mvVar3 = new bw5.mv();
                if (bArr != null && bArr.length > 0) {
                    mvVar3.parseFrom(bArr);
                }
                this.f34041d = mvVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f34043f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mv mvVar4 = new bw5.mv();
            if (bArr2 != null && bArr2.length > 0) {
                mvVar4.parseFrom(bArr2);
            }
            linkedList.add(mvVar4);
        }
        zArr[2] = true;
        return 0;
    }
}

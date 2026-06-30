package bw5;

/* loaded from: classes2.dex */
public class lz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30010d;

    /* renamed from: e, reason: collision with root package name */
    public long f30011e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f30012f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30013g = new boolean[4];

    static {
        new bw5.lz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lz parseFrom(byte[] bArr) {
        return (bw5.lz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lz)) {
            return false;
        }
        bw5.lz lzVar = (bw5.lz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30010d), java.lang.Long.valueOf(lzVar.f30010d)) && n51.f.a(java.lang.Long.valueOf(this.f30011e), java.lang.Long.valueOf(lzVar.f30011e)) && n51.f.a(this.f30012f, lzVar.f30012f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30012f;
        boolean[] zArr = this.f30013g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30010d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f30011e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30010d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f30011e);
            }
            return h17 + b36.f.g(3, 8, linkedList);
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
            this.f30010d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30011e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.kz kzVar = new bw5.kz();
            if (bArr != null && bArr.length > 0) {
                kzVar.parseFrom(bArr);
            }
            linkedList.add(kzVar);
        }
        zArr[3] = true;
        return 0;
    }
}

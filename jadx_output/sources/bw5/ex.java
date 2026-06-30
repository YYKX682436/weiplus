package bw5;

/* loaded from: classes2.dex */
public class ex extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bx f27089d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27090e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f27091f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27092g = new boolean[4];

    static {
        new bw5.ex();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ex parseFrom(byte[] bArr) {
        return (bw5.ex) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ex)) {
            return false;
        }
        bw5.ex exVar = (bw5.ex) fVar;
        return n51.f.a(this.f27089d, exVar.f27089d) && n51.f.a(this.f27090e, exVar.f27090e) && n51.f.a(this.f27091f, exVar.f27091f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ex();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27091f;
        boolean[] zArr = this.f27092g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bx bxVar = this.f27089d;
            if (bxVar != null && zArr[1]) {
                fVar.e(1, bxVar.f25860d);
            }
            java.lang.String str = this.f27090e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.bx bxVar2 = this.f27089d;
            if (bxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bxVar2.f25860d);
            }
            java.lang.String str2 = this.f27090e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
            int g17 = aVar2.g(intValue);
            this.f27089d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 30000 ? null : bw5.bx.Invalid : bw5.bx.Origin : bw5.bx.English : bw5.bx.Chinese;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27090e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fx fxVar = new bw5.fx();
            if (bArr != null && bArr.length > 0) {
                fxVar.parseFrom(bArr);
            }
            linkedList.add(fxVar);
        }
        zArr[3] = true;
        return 0;
    }
}

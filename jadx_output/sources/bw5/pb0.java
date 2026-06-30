package bw5;

/* loaded from: classes2.dex */
public class pb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31556d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f31557e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f31558f = new boolean[3];

    static {
        new bw5.pb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pb0 parseFrom(byte[] bArr) {
        return (bw5.pb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pb0)) {
            return false;
        }
        bw5.pb0 pb0Var = (bw5.pb0) fVar;
        return n51.f.a(this.f31556d, pb0Var.f31556d) && n51.f.a(this.f31557e, pb0Var.f31557e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31558f;
        java.util.LinkedList linkedList = this.f31557e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31556d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f31556d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 8, linkedList);
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
            this.f31556d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.o50 o50Var = new bw5.o50();
            if (bArr != null && bArr.length > 0) {
                o50Var.parseFrom(bArr);
            }
            linkedList.add(o50Var);
        }
        zArr[2] = true;
        return 0;
    }
}

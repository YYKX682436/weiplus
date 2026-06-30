package bw5;

/* loaded from: classes2.dex */
public class n00 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30447e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f30448f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30449g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f30446d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30450h = new boolean[5];

    static {
        new bw5.n00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n00 parseFrom(byte[] bArr) {
        return (bw5.n00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n00)) {
            return false;
        }
        bw5.n00 n00Var = (bw5.n00) fVar;
        return n51.f.a(this.f30446d, n00Var.f30446d) && n51.f.a(this.f30447e, n00Var.f30447e) && n51.f.a(this.f30448f, n00Var.f30448f) && n51.f.a(this.f30449g, n00Var.f30449g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30446d;
        boolean[] zArr = this.f30450h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            java.lang.String str = this.f30447e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.x7 x7Var = this.f30448f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f30448f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f30449g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList) + 0;
            java.lang.String str2 = this.f30447e;
            if (str2 != null && zArr[2]) {
                g17 += b36.f.j(2, str2);
            }
            bw5.x7 x7Var2 = this.f30448f;
            if (x7Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, x7Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30449g;
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
            linkedList.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30447e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f30449g = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f30448f = x7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}

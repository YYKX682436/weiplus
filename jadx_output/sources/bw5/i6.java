package bw5;

/* loaded from: classes4.dex */
public class i6 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.h6 f28474e;

    /* renamed from: f, reason: collision with root package name */
    public long f28475f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g6 f28477h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28473d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f28476g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28478i = new boolean[6];

    static {
        new bw5.i6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i6 parseFrom(byte[] bArr) {
        return (bw5.i6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i6)) {
            return false;
        }
        bw5.i6 i6Var = (bw5.i6) fVar;
        return n51.f.a(this.f28473d, i6Var.f28473d) && n51.f.a(this.f28474e, i6Var.f28474e) && n51.f.a(java.lang.Long.valueOf(this.f28475f), java.lang.Long.valueOf(i6Var.f28475f)) && n51.f.a(this.f28476g, i6Var.f28476g) && n51.f.a(this.f28477h, i6Var.f28477h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28476g;
        java.util.LinkedList linkedList2 = this.f28473d;
        boolean[] zArr = this.f28478i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            bw5.h6 h6Var = this.f28474e;
            if (h6Var != null && zArr[2]) {
                fVar.i(2, h6Var.computeSize());
                this.f28474e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28475f);
            }
            fVar.g(4, 8, linkedList);
            bw5.g6 g6Var = this.f28477h;
            if (g6Var != null && zArr[5]) {
                fVar.i(5, g6Var.computeSize());
                this.f28477h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList2) + 0;
            bw5.h6 h6Var2 = this.f28474e;
            if (h6Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, h6Var2.computeSize());
            }
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f28475f);
            }
            int g18 = g17 + b36.f.g(4, 8, linkedList);
            bw5.g6 g6Var2 = this.f28477h;
            return (g6Var2 == null || !zArr[5]) ? g18 : g18 + b36.f.i(5, g6Var2.computeSize());
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            linkedList2.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.h6 h6Var3 = new bw5.h6();
                if (bArr != null && bArr.length > 0) {
                    h6Var3.parseFrom(bArr);
                }
                this.f28474e = h6Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28475f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.e9 e9Var = new bw5.e9();
                if (bArr2 != null && bArr2.length > 0) {
                    e9Var.parseFrom(bArr2);
                }
                linkedList.add(e9Var);
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.g6 g6Var3 = new bw5.g6();
            if (bArr3 != null && bArr3.length > 0) {
                g6Var3.parseFrom(bArr3);
            }
            this.f28477h = g6Var3;
        }
        zArr[5] = true;
        return 0;
    }
}

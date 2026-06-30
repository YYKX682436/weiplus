package bw5;

/* loaded from: classes2.dex */
public class m1 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.a20 f30034e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.k1 f30035f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.k1 f30036g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.l1 f30037h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f30033d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30038i = new boolean[6];

    static {
        new bw5.m1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m1 parseFrom(byte[] bArr) {
        return (bw5.m1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m1)) {
            return false;
        }
        bw5.m1 m1Var = (bw5.m1) fVar;
        return n51.f.a(this.f30033d, m1Var.f30033d) && n51.f.a(this.f30034e, m1Var.f30034e) && n51.f.a(this.f30035f, m1Var.f30035f) && n51.f.a(this.f30036g, m1Var.f30036g) && n51.f.a(this.f30037h, m1Var.f30037h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30033d;
        boolean[] zArr = this.f30038i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.a20 a20Var = this.f30034e;
            if (a20Var != null && zArr[2]) {
                fVar.i(2, a20Var.computeSize());
                this.f30034e.writeFields(fVar);
            }
            bw5.k1 k1Var = this.f30035f;
            if (k1Var != null && zArr[3]) {
                fVar.i(3, k1Var.computeSize());
                this.f30035f.writeFields(fVar);
            }
            bw5.k1 k1Var2 = this.f30036g;
            if (k1Var2 != null && zArr[4]) {
                fVar.i(4, k1Var2.computeSize());
                this.f30036g.writeFields(fVar);
            }
            bw5.l1 l1Var = this.f30037h;
            if (l1Var != null && zArr[5]) {
                fVar.i(5, l1Var.computeSize());
                this.f30037h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.a20 a20Var2 = this.f30034e;
            if (a20Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, a20Var2.computeSize());
            }
            bw5.k1 k1Var3 = this.f30035f;
            if (k1Var3 != null && zArr[3]) {
                g17 += b36.f.i(3, k1Var3.computeSize());
            }
            bw5.k1 k1Var4 = this.f30036g;
            if (k1Var4 != null && zArr[4]) {
                g17 += b36.f.i(4, k1Var4.computeSize());
            }
            bw5.l1 l1Var2 = this.f30037h;
            return (l1Var2 == null || !zArr[5]) ? g17 : g17 + b36.f.i(5, l1Var2.computeSize());
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.cm cmVar = new bw5.cm();
                if (bArr != null && bArr.length > 0) {
                    cmVar.parseFrom(bArr);
                }
                linkedList.add(cmVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.a20 a20Var3 = new bw5.a20();
                if (bArr2 != null && bArr2.length > 0) {
                    a20Var3.parseFrom(bArr2);
                }
                this.f30034e = a20Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.k1 k1Var5 = new bw5.k1();
                if (bArr3 != null && bArr3.length > 0) {
                    k1Var5.parseFrom(bArr3);
                }
                this.f30035f = k1Var5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                bw5.k1 k1Var6 = new bw5.k1();
                if (bArr4 != null && bArr4.length > 0) {
                    k1Var6.parseFrom(bArr4);
                }
                this.f30036g = k1Var6;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i29 = 0; i29 < size5; i29++) {
            byte[] bArr5 = (byte[]) j28.get(i29);
            bw5.l1 l1Var3 = new bw5.l1();
            if (bArr5 != null && bArr5.length > 0) {
                l1Var3.parseFrom(bArr5);
            }
            this.f30037h = l1Var3;
        }
        zArr[5] = true;
        return 0;
    }
}

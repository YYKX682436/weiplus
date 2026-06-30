package bw5;

/* loaded from: classes2.dex */
public class s3 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public bw5.x3 f32778g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.z3 f32779h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f32775d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f32776e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f32777f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f32780i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f32781m = new boolean[7];

    static {
        new bw5.s3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s3 parseFrom(byte[] bArr) {
        return (bw5.s3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s3)) {
            return false;
        }
        bw5.s3 s3Var = (bw5.s3) fVar;
        return n51.f.a(this.f32775d, s3Var.f32775d) && n51.f.a(this.f32776e, s3Var.f32776e) && n51.f.a(this.f32777f, s3Var.f32777f) && n51.f.a(this.f32778g, s3Var.f32778g) && n51.f.a(this.f32779h, s3Var.f32779h) && n51.f.a(this.f32780i, s3Var.f32780i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32780i;
        java.util.LinkedList linkedList2 = this.f32777f;
        java.util.LinkedList linkedList3 = this.f32776e;
        java.util.LinkedList linkedList4 = this.f32775d;
        boolean[] zArr = this.f32781m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList4);
            fVar.g(2, 8, linkedList3);
            fVar.g(3, 8, linkedList2);
            bw5.x3 x3Var = this.f32778g;
            if (x3Var != null && zArr[4]) {
                fVar.i(4, x3Var.computeSize());
                this.f32778g.writeFields(fVar);
            }
            bw5.z3 z3Var = this.f32779h;
            if (z3Var != null && zArr[5]) {
                fVar.i(5, z3Var.computeSize());
                this.f32779h.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList4) + 0 + b36.f.g(2, 8, linkedList3) + b36.f.g(3, 8, linkedList2);
            bw5.x3 x3Var2 = this.f32778g;
            if (x3Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, x3Var2.computeSize());
            }
            bw5.z3 z3Var2 = this.f32779h;
            if (z3Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, z3Var2.computeSize());
            }
            return g17 + b36.f.g(6, 8, linkedList);
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.t3 t3Var = new bw5.t3();
                    if (bArr != null && bArr.length > 0) {
                        t3Var.parseFrom(bArr);
                    }
                    linkedList4.add(t3Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.u3 u3Var = new bw5.u3();
                    if (bArr2 != null && bArr2.length > 0) {
                        u3Var.parseFrom(bArr2);
                    }
                    linkedList3.add(u3Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.c4 c4Var = new bw5.c4();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4Var.parseFrom(bArr3);
                    }
                    linkedList2.add(c4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.x3 x3Var3 = new bw5.x3();
                    if (bArr4 != null && bArr4.length > 0) {
                        x3Var3.parseFrom(bArr4);
                    }
                    this.f32778g = x3Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.z3 z3Var3 = new bw5.z3();
                    if (bArr5 != null && bArr5.length > 0) {
                        z3Var3.parseFrom(bArr5);
                    }
                    this.f32779h = z3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.r3 r3Var = new bw5.r3();
                    if (bArr6 != null && bArr6.length > 0) {
                        r3Var.parseFrom(bArr6);
                    }
                    linkedList.add(r3Var);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

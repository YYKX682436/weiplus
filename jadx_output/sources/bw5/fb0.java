package bw5;

/* loaded from: classes2.dex */
public class fb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.cb0 f27208e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27209f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.db0 f27210g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qb0 f27211h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27212i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.eb0 f27213m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f27207d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27214n = new boolean[8];

    static {
        new bw5.fb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fb0 parseFrom(byte[] bArr) {
        return (bw5.fb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fb0)) {
            return false;
        }
        bw5.fb0 fb0Var = (bw5.fb0) fVar;
        return n51.f.a(this.f27207d, fb0Var.f27207d) && n51.f.a(this.f27208e, fb0Var.f27208e) && n51.f.a(this.f27209f, fb0Var.f27209f) && n51.f.a(this.f27210g, fb0Var.f27210g) && n51.f.a(this.f27211h, fb0Var.f27211h) && n51.f.a(this.f27212i, fb0Var.f27212i) && n51.f.a(this.f27213m, fb0Var.f27213m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27207d;
        boolean[] zArr = this.f27214n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.cb0 cb0Var = this.f27208e;
            if (cb0Var != null && zArr[2]) {
                fVar.i(2, cb0Var.computeSize());
                this.f27208e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f27209f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.db0 db0Var = this.f27210g;
            if (db0Var != null && zArr[4]) {
                fVar.i(4, db0Var.computeSize());
                this.f27210g.writeFields(fVar);
            }
            bw5.qb0 qb0Var = this.f27211h;
            if (qb0Var != null && zArr[5]) {
                fVar.i(5, qb0Var.computeSize());
                this.f27211h.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27212i;
            if (gVar2 != null && zArr[6]) {
                fVar.b(6, gVar2);
            }
            bw5.eb0 eb0Var = this.f27213m;
            if (eb0Var != null && zArr[7]) {
                fVar.i(7, eb0Var.computeSize());
                this.f27213m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.cb0 cb0Var2 = this.f27208e;
            if (cb0Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, cb0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f27209f;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            bw5.db0 db0Var2 = this.f27210g;
            if (db0Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, db0Var2.computeSize());
            }
            bw5.qb0 qb0Var2 = this.f27211h;
            if (qb0Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, qb0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f27212i;
            if (gVar4 != null && zArr[6]) {
                g17 += b36.f.b(6, gVar4);
            }
            bw5.eb0 eb0Var2 = this.f27213m;
            return (eb0Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, eb0Var2.computeSize());
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ab0 ab0Var = new bw5.ab0();
                    if (bArr != null && bArr.length > 0) {
                        ab0Var.parseFrom(bArr);
                    }
                    linkedList.add(ab0Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.cb0 cb0Var3 = new bw5.cb0();
                    if (bArr2 != null && bArr2.length > 0) {
                        cb0Var3.parseFrom(bArr2);
                    }
                    this.f27208e = cb0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f27209f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.db0 db0Var3 = new bw5.db0();
                    if (bArr3 != null && bArr3.length > 0) {
                        db0Var3.parseFrom(bArr3);
                    }
                    this.f27210g = db0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qb0 qb0Var3 = new bw5.qb0();
                    if (bArr4 != null && bArr4.length > 0) {
                        qb0Var3.parseFrom(bArr4);
                    }
                    this.f27211h = qb0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f27212i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.eb0 eb0Var3 = new bw5.eb0();
                    if (bArr5 != null && bArr5.length > 0) {
                        eb0Var3.parseFrom(bArr5);
                    }
                    this.f27213m = eb0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

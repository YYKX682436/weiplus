package bw5;

/* loaded from: classes2.dex */
public class y3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f35336d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.pj f35337e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pj f35338f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj f35339g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pj f35340h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35341i = new boolean[6];

    static {
        new bw5.y3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y3 parseFrom(byte[] bArr) {
        return (bw5.y3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y3)) {
            return false;
        }
        bw5.y3 y3Var = (bw5.y3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35336d), java.lang.Long.valueOf(y3Var.f35336d)) && n51.f.a(this.f35337e, y3Var.f35337e) && n51.f.a(this.f35338f, y3Var.f35338f) && n51.f.a(this.f35339g, y3Var.f35339g) && n51.f.a(this.f35340h, y3Var.f35340h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35341i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f35336d);
            }
            bw5.pj pjVar = this.f35337e;
            if (pjVar != null && zArr[2]) {
                fVar.i(2, pjVar.computeSize());
                this.f35337e.writeFields(fVar);
            }
            bw5.pj pjVar2 = this.f35338f;
            if (pjVar2 != null && zArr[3]) {
                fVar.i(3, pjVar2.computeSize());
                this.f35338f.writeFields(fVar);
            }
            bw5.pj pjVar3 = this.f35339g;
            if (pjVar3 != null && zArr[4]) {
                fVar.i(4, pjVar3.computeSize());
                this.f35339g.writeFields(fVar);
            }
            bw5.pj pjVar4 = this.f35340h;
            if (pjVar4 != null && zArr[5]) {
                fVar.i(5, pjVar4.computeSize());
                this.f35340h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f35336d) : 0;
            bw5.pj pjVar5 = this.f35337e;
            if (pjVar5 != null && zArr[2]) {
                h17 += b36.f.i(2, pjVar5.computeSize());
            }
            bw5.pj pjVar6 = this.f35338f;
            if (pjVar6 != null && zArr[3]) {
                h17 += b36.f.i(3, pjVar6.computeSize());
            }
            bw5.pj pjVar7 = this.f35339g;
            if (pjVar7 != null && zArr[4]) {
                h17 += b36.f.i(4, pjVar7.computeSize());
            }
            bw5.pj pjVar8 = this.f35340h;
            return (pjVar8 == null || !zArr[5]) ? h17 : h17 + b36.f.i(5, pjVar8.computeSize());
        }
        if (i17 == 2) {
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
            this.f35336d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.pj pjVar9 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar9.parseFrom(bArr);
                }
                this.f35337e = pjVar9;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.pj pjVar10 = new bw5.pj();
                if (bArr2 != null && bArr2.length > 0) {
                    pjVar10.parseFrom(bArr2);
                }
                this.f35338f = pjVar10;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.pj pjVar11 = new bw5.pj();
                if (bArr3 != null && bArr3.length > 0) {
                    pjVar11.parseFrom(bArr3);
                }
                this.f35339g = pjVar11;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            bw5.pj pjVar12 = new bw5.pj();
            if (bArr4 != null && bArr4.length > 0) {
                pjVar12.parseFrom(bArr4);
            }
            this.f35340h = pjVar12;
        }
        zArr[5] = true;
        return 0;
    }
}

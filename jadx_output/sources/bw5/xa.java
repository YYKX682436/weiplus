package bw5;

/* loaded from: classes11.dex */
public class xa extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.s f35017d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.r1 f35018e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xk0 f35019f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.wk0 f35020g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.yk0 f35021h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35022i = new boolean[6];

    static {
        new bw5.xa();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xa parseFrom(byte[] bArr) {
        return (bw5.xa) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xa)) {
            return false;
        }
        bw5.xa xaVar = (bw5.xa) fVar;
        return n51.f.a(this.f35017d, xaVar.f35017d) && n51.f.a(this.f35018e, xaVar.f35018e) && n51.f.a(this.f35019f, xaVar.f35019f) && n51.f.a(this.f35020g, xaVar.f35020g) && n51.f.a(this.f35021h, xaVar.f35021h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xa();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35022i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.s sVar = this.f35017d;
            if (sVar != null && zArr[1]) {
                fVar.i(1, sVar.computeSize());
                this.f35017d.writeFields(fVar);
            }
            bw5.r1 r1Var = this.f35018e;
            if (r1Var != null && zArr[2]) {
                fVar.i(2, r1Var.computeSize());
                this.f35018e.writeFields(fVar);
            }
            bw5.xk0 xk0Var = this.f35019f;
            if (xk0Var != null && zArr[3]) {
                fVar.i(3, xk0Var.computeSize());
                this.f35019f.writeFields(fVar);
            }
            bw5.wk0 wk0Var = this.f35020g;
            if (wk0Var != null && zArr[4]) {
                fVar.i(4, wk0Var.computeSize());
                this.f35020g.writeFields(fVar);
            }
            bw5.yk0 yk0Var = this.f35021h;
            if (yk0Var != null && zArr[5]) {
                fVar.i(5, yk0Var.computeSize());
                this.f35021h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.s sVar2 = this.f35017d;
            if (sVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, sVar2.computeSize());
            }
            bw5.r1 r1Var2 = this.f35018e;
            if (r1Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, r1Var2.computeSize());
            }
            bw5.xk0 xk0Var2 = this.f35019f;
            if (xk0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, xk0Var2.computeSize());
            }
            bw5.wk0 wk0Var2 = this.f35020g;
            if (wk0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, wk0Var2.computeSize());
            }
            bw5.yk0 yk0Var2 = this.f35021h;
            return (yk0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, yk0Var2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.s sVar3 = new bw5.s();
                if (bArr != null && bArr.length > 0) {
                    sVar3.parseFrom(bArr);
                }
                this.f35017d = sVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.r1 r1Var3 = new bw5.r1();
                if (bArr2 != null && bArr2.length > 0) {
                    r1Var3.parseFrom(bArr2);
                }
                this.f35018e = r1Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.xk0 xk0Var3 = new bw5.xk0();
                if (bArr3 != null && bArr3.length > 0) {
                    xk0Var3.parseFrom(bArr3);
                }
                this.f35019f = xk0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.wk0 wk0Var3 = new bw5.wk0();
                if (bArr4 != null && bArr4.length > 0) {
                    wk0Var3.parseFrom(bArr4);
                }
                this.f35020g = wk0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            bw5.yk0 yk0Var3 = new bw5.yk0();
            if (bArr5 != null && bArr5.length > 0) {
                yk0Var3.parseFrom(bArr5);
            }
            this.f35021h = yk0Var3;
        }
        zArr[5] = true;
        return 0;
    }
}

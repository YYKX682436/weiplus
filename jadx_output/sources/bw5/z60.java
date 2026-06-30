package bw5;

/* loaded from: classes2.dex */
public class z60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.b50 f35838d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sb0 f35839e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pb0 f35840f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ka0 f35841g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.rb0 f35842h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35843i = new boolean[6];

    static {
        new bw5.z60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z60 parseFrom(byte[] bArr) {
        return (bw5.z60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z60)) {
            return false;
        }
        bw5.z60 z60Var = (bw5.z60) fVar;
        return n51.f.a(this.f35838d, z60Var.f35838d) && n51.f.a(this.f35839e, z60Var.f35839e) && n51.f.a(this.f35840f, z60Var.f35840f) && n51.f.a(this.f35841g, z60Var.f35841g) && n51.f.a(this.f35842h, z60Var.f35842h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35843i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.b50 b50Var = this.f35838d;
            if (b50Var != null && zArr[1]) {
                fVar.i(1, b50Var.computeSize());
                this.f35838d.writeFields(fVar);
            }
            bw5.sb0 sb0Var = this.f35839e;
            if (sb0Var != null && zArr[2]) {
                fVar.i(2, sb0Var.computeSize());
                this.f35839e.writeFields(fVar);
            }
            bw5.pb0 pb0Var = this.f35840f;
            if (pb0Var != null && zArr[3]) {
                fVar.i(3, pb0Var.computeSize());
                this.f35840f.writeFields(fVar);
            }
            bw5.ka0 ka0Var = this.f35841g;
            if (ka0Var != null && zArr[4]) {
                fVar.i(4, ka0Var.computeSize());
                this.f35841g.writeFields(fVar);
            }
            bw5.rb0 rb0Var = this.f35842h;
            if (rb0Var != null && zArr[5]) {
                fVar.i(5, rb0Var.computeSize());
                this.f35842h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.b50 b50Var2 = this.f35838d;
            if (b50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, b50Var2.computeSize());
            }
            bw5.sb0 sb0Var2 = this.f35839e;
            if (sb0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, sb0Var2.computeSize());
            }
            bw5.pb0 pb0Var2 = this.f35840f;
            if (pb0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, pb0Var2.computeSize());
            }
            bw5.ka0 ka0Var2 = this.f35841g;
            if (ka0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, ka0Var2.computeSize());
            }
            bw5.rb0 rb0Var2 = this.f35842h;
            return (rb0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, rb0Var2.computeSize());
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
                bw5.b50 b50Var3 = new bw5.b50();
                if (bArr != null && bArr.length > 0) {
                    b50Var3.parseFrom(bArr);
                }
                this.f35838d = b50Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.sb0 sb0Var3 = new bw5.sb0();
                if (bArr2 != null && bArr2.length > 0) {
                    sb0Var3.parseFrom(bArr2);
                }
                this.f35839e = sb0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.pb0 pb0Var3 = new bw5.pb0();
                if (bArr3 != null && bArr3.length > 0) {
                    pb0Var3.parseFrom(bArr3);
                }
                this.f35840f = pb0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.ka0 ka0Var3 = new bw5.ka0();
                if (bArr4 != null && bArr4.length > 0) {
                    ka0Var3.parseFrom(bArr4);
                }
                this.f35841g = ka0Var3;
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
            bw5.rb0 rb0Var3 = new bw5.rb0();
            if (bArr5 != null && bArr5.length > 0) {
                rb0Var3.parseFrom(bArr5);
            }
            this.f35842h = rb0Var3;
        }
        zArr[5] = true;
        return 0;
    }
}

package bw5;

/* loaded from: classes11.dex */
public class k0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.k0 f29188m = new bw5.k0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.p0 f29189d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.q0 f29190e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o0 f29191f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.g0 f29192g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.aj0 f29193h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29194i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k0)) {
            return false;
        }
        bw5.k0 k0Var = (bw5.k0) fVar;
        return n51.f.a(this.f29189d, k0Var.f29189d) && n51.f.a(this.f29190e, k0Var.f29190e) && n51.f.a(this.f29191f, k0Var.f29191f) && n51.f.a(this.f29192g, k0Var.f29192g) && n51.f.a(this.f29193h, k0Var.f29193h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29194i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.p0 p0Var = this.f29189d;
            if (p0Var != null && zArr[1]) {
                fVar.i(1, p0Var.computeSize());
                this.f29189d.writeFields(fVar);
            }
            bw5.q0 q0Var = this.f29190e;
            if (q0Var != null && zArr[2]) {
                fVar.i(2, q0Var.computeSize());
                this.f29190e.writeFields(fVar);
            }
            bw5.o0 o0Var = this.f29191f;
            if (o0Var != null && zArr[3]) {
                fVar.i(3, o0Var.computeSize());
                this.f29191f.writeFields(fVar);
            }
            bw5.g0 g0Var = this.f29192g;
            if (g0Var != null && zArr[4]) {
                fVar.i(4, g0Var.computeSize());
                this.f29192g.writeFields(fVar);
            }
            bw5.aj0 aj0Var = this.f29193h;
            if (aj0Var != null && zArr[5]) {
                fVar.i(5, aj0Var.computeSize());
                this.f29193h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.p0 p0Var2 = this.f29189d;
            if (p0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, p0Var2.computeSize());
            }
            bw5.q0 q0Var2 = this.f29190e;
            if (q0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, q0Var2.computeSize());
            }
            bw5.o0 o0Var2 = this.f29191f;
            if (o0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, o0Var2.computeSize());
            }
            bw5.g0 g0Var2 = this.f29192g;
            if (g0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, g0Var2.computeSize());
            }
            bw5.aj0 aj0Var2 = this.f29193h;
            return (aj0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, aj0Var2.computeSize());
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
                bw5.p0 p0Var3 = new bw5.p0();
                if (bArr != null && bArr.length > 0) {
                    p0Var3.parseFrom(bArr);
                }
                this.f29189d = p0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.q0 q0Var3 = new bw5.q0();
                if (bArr2 != null && bArr2.length > 0) {
                    q0Var3.parseFrom(bArr2);
                }
                this.f29190e = q0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.o0 o0Var3 = new bw5.o0();
                if (bArr3 != null && bArr3.length > 0) {
                    o0Var3.parseFrom(bArr3);
                }
                this.f29191f = o0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.g0 g0Var3 = new bw5.g0();
                if (bArr4 != null && bArr4.length > 0) {
                    g0Var3.parseFrom(bArr4);
                }
                this.f29192g = g0Var3;
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
            bw5.aj0 aj0Var3 = new bw5.aj0();
            if (bArr5 != null && bArr5.length > 0) {
                aj0Var3.parseFrom(bArr5);
            }
            this.f29193h = aj0Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.k0) super.parseFrom(bArr);
    }
}

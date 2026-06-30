package bw5;

/* loaded from: classes2.dex */
public class j90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.o50 f28878d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a70 f28879e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ja0 f28880f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.r50 f28881g;

    /* renamed from: h, reason: collision with root package name */
    public int f28882h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v70 f28883i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa0 f28884m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f28885n = new boolean[8];

    static {
        new bw5.j90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j90 parseFrom(byte[] bArr) {
        return (bw5.j90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j90)) {
            return false;
        }
        bw5.j90 j90Var = (bw5.j90) fVar;
        return n51.f.a(this.f28878d, j90Var.f28878d) && n51.f.a(this.f28879e, j90Var.f28879e) && n51.f.a(this.f28880f, j90Var.f28880f) && n51.f.a(this.f28881g, j90Var.f28881g) && n51.f.a(java.lang.Integer.valueOf(this.f28882h), java.lang.Integer.valueOf(j90Var.f28882h)) && n51.f.a(this.f28883i, j90Var.f28883i) && n51.f.a(this.f28884m, j90Var.f28884m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28885n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.o50 o50Var = this.f28878d;
            if (o50Var != null && zArr[1]) {
                fVar.i(1, o50Var.computeSize());
                this.f28878d.writeFields(fVar);
            }
            bw5.a70 a70Var = this.f28879e;
            if (a70Var != null && zArr[2]) {
                fVar.i(2, a70Var.computeSize());
                this.f28879e.writeFields(fVar);
            }
            bw5.ja0 ja0Var = this.f28880f;
            if (ja0Var != null && zArr[3]) {
                fVar.i(3, ja0Var.computeSize());
                this.f28880f.writeFields(fVar);
            }
            bw5.r50 r50Var = this.f28881g;
            if (r50Var != null && zArr[4]) {
                fVar.i(4, r50Var.computeSize());
                this.f28881g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28882h);
            }
            bw5.v70 v70Var = this.f28883i;
            if (v70Var != null && zArr[6]) {
                fVar.i(6, v70Var.computeSize());
                this.f28883i.writeFields(fVar);
            }
            bw5.xa0 xa0Var = this.f28884m;
            if (xa0Var != null && zArr[7]) {
                fVar.i(7, xa0Var.computeSize());
                this.f28884m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.o50 o50Var2 = this.f28878d;
            if (o50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, o50Var2.computeSize());
            }
            bw5.a70 a70Var2 = this.f28879e;
            if (a70Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, a70Var2.computeSize());
            }
            bw5.ja0 ja0Var2 = this.f28880f;
            if (ja0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, ja0Var2.computeSize());
            }
            bw5.r50 r50Var2 = this.f28881g;
            if (r50Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, r50Var2.computeSize());
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f28882h);
            }
            bw5.v70 v70Var2 = this.f28883i;
            if (v70Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, v70Var2.computeSize());
            }
            bw5.xa0 xa0Var2 = this.f28884m;
            return (xa0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, xa0Var2.computeSize());
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var3.parseFrom(bArr);
                    }
                    this.f28878d = o50Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.a70 a70Var3 = new bw5.a70();
                    if (bArr2 != null && bArr2.length > 0) {
                        a70Var3.parseFrom(bArr2);
                    }
                    this.f28879e = a70Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ja0 ja0Var3 = new bw5.ja0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ja0Var3.parseFrom(bArr3);
                    }
                    this.f28880f = ja0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.r50 r50Var3 = new bw5.r50();
                    if (bArr4 != null && bArr4.length > 0) {
                        r50Var3.parseFrom(bArr4);
                    }
                    this.f28881g = r50Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f28882h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr5 != null && bArr5.length > 0) {
                        v70Var3.parseFrom(bArr5);
                    }
                    this.f28883i = v70Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr6 != null && bArr6.length > 0) {
                        xa0Var3.parseFrom(bArr6);
                    }
                    this.f28884m = xa0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

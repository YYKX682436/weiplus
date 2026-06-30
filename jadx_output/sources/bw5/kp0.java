package bw5;

/* loaded from: classes14.dex */
public class kp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.rq0 f29460d;

    /* renamed from: e, reason: collision with root package name */
    public int f29461e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.rq0 f29462f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.rq0 f29463g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.rq0 f29464h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.rq0 f29465i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.rq0 f29466m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f29467n = new boolean[8];

    static {
        new bw5.kp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kp0)) {
            return false;
        }
        bw5.kp0 kp0Var = (bw5.kp0) fVar;
        return n51.f.a(this.f29460d, kp0Var.f29460d) && n51.f.a(java.lang.Integer.valueOf(this.f29461e), java.lang.Integer.valueOf(kp0Var.f29461e)) && n51.f.a(this.f29462f, kp0Var.f29462f) && n51.f.a(this.f29463g, kp0Var.f29463g) && n51.f.a(this.f29464h, kp0Var.f29464h) && n51.f.a(this.f29465i, kp0Var.f29465i) && n51.f.a(this.f29466m, kp0Var.f29466m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29467n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.rq0 rq0Var = this.f29460d;
            if (rq0Var != null && zArr[1]) {
                fVar.i(1, rq0Var.computeSize());
                this.f29460d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29461e);
            }
            bw5.rq0 rq0Var2 = this.f29462f;
            if (rq0Var2 != null && zArr[3]) {
                fVar.i(3, rq0Var2.computeSize());
                this.f29462f.writeFields(fVar);
            }
            bw5.rq0 rq0Var3 = this.f29463g;
            if (rq0Var3 != null && zArr[4]) {
                fVar.i(4, rq0Var3.computeSize());
                this.f29463g.writeFields(fVar);
            }
            bw5.rq0 rq0Var4 = this.f29464h;
            if (rq0Var4 != null && zArr[5]) {
                fVar.i(5, rq0Var4.computeSize());
                this.f29464h.writeFields(fVar);
            }
            bw5.rq0 rq0Var5 = this.f29465i;
            if (rq0Var5 != null && zArr[6]) {
                fVar.i(6, rq0Var5.computeSize());
                this.f29465i.writeFields(fVar);
            }
            bw5.rq0 rq0Var6 = this.f29466m;
            if (rq0Var6 != null && zArr[7]) {
                fVar.i(7, rq0Var6.computeSize());
                this.f29466m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.rq0 rq0Var7 = this.f29460d;
            if (rq0Var7 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, rq0Var7.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29461e);
            }
            bw5.rq0 rq0Var8 = this.f29462f;
            if (rq0Var8 != null && zArr[3]) {
                i18 += b36.f.i(3, rq0Var8.computeSize());
            }
            bw5.rq0 rq0Var9 = this.f29463g;
            if (rq0Var9 != null && zArr[4]) {
                i18 += b36.f.i(4, rq0Var9.computeSize());
            }
            bw5.rq0 rq0Var10 = this.f29464h;
            if (rq0Var10 != null && zArr[5]) {
                i18 += b36.f.i(5, rq0Var10.computeSize());
            }
            bw5.rq0 rq0Var11 = this.f29465i;
            if (rq0Var11 != null && zArr[6]) {
                i18 += b36.f.i(6, rq0Var11.computeSize());
            }
            bw5.rq0 rq0Var12 = this.f29466m;
            return (rq0Var12 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, rq0Var12.computeSize());
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
                    bw5.rq0 rq0Var13 = new bw5.rq0();
                    if (bArr != null && bArr.length > 0) {
                        rq0Var13.parseFrom(bArr);
                    }
                    this.f29460d = rq0Var13;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f29461e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.rq0 rq0Var14 = new bw5.rq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        rq0Var14.parseFrom(bArr2);
                    }
                    this.f29462f = rq0Var14;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.rq0 rq0Var15 = new bw5.rq0();
                    if (bArr3 != null && bArr3.length > 0) {
                        rq0Var15.parseFrom(bArr3);
                    }
                    this.f29463g = rq0Var15;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.rq0 rq0Var16 = new bw5.rq0();
                    if (bArr4 != null && bArr4.length > 0) {
                        rq0Var16.parseFrom(bArr4);
                    }
                    this.f29464h = rq0Var16;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.rq0 rq0Var17 = new bw5.rq0();
                    if (bArr5 != null && bArr5.length > 0) {
                        rq0Var17.parseFrom(bArr5);
                    }
                    this.f29465i = rq0Var17;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.rq0 rq0Var18 = new bw5.rq0();
                    if (bArr6 != null && bArr6.length > 0) {
                        rq0Var18.parseFrom(bArr6);
                    }
                    this.f29466m = rq0Var18;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.kp0) super.parseFrom(bArr);
    }
}

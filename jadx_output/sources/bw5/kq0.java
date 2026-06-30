package bw5;

/* loaded from: classes2.dex */
public class kq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lp0 f29488d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f29489e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ip0 f29490f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.gq0 f29491g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.r50 f29492h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.br0 f29493i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29494m = new boolean[7];

    static {
        new bw5.kq0();
    }

    public bw5.lp0 b() {
        return this.f29494m[1] ? this.f29488d : new bw5.lp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.kq0 parseFrom(byte[] bArr) {
        return (bw5.kq0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kq0)) {
            return false;
        }
        bw5.kq0 kq0Var = (bw5.kq0) fVar;
        return n51.f.a(this.f29488d, kq0Var.f29488d) && n51.f.a(this.f29489e, kq0Var.f29489e) && n51.f.a(this.f29490f, kq0Var.f29490f) && n51.f.a(this.f29491g, kq0Var.f29491g) && n51.f.a(this.f29492h, kq0Var.f29492h) && n51.f.a(this.f29493i, kq0Var.f29493i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29494m;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.lp0 lp0Var = this.f29488d;
            if (lp0Var != null && zArr[1]) {
                fVar.i(1, lp0Var.computeSize());
                this.f29488d.writeFields(fVar);
            }
            bw5.lp0 lp0Var2 = this.f29489e;
            if (lp0Var2 != null && zArr[2]) {
                fVar.i(2, lp0Var2.computeSize());
                this.f29489e.writeFields(fVar);
            }
            bw5.ip0 ip0Var = this.f29490f;
            if (ip0Var != null && zArr[3]) {
                fVar.i(3, ip0Var.computeSize());
                this.f29490f.writeFields(fVar);
            }
            bw5.gq0 gq0Var = this.f29491g;
            if (gq0Var != null && zArr[4]) {
                fVar.i(4, gq0Var.computeSize());
                this.f29491g.writeFields(fVar);
            }
            bw5.r50 r50Var = this.f29492h;
            if (r50Var != null && zArr[5]) {
                fVar.i(5, r50Var.computeSize());
                this.f29492h.writeFields(fVar);
            }
            bw5.br0 br0Var = this.f29493i;
            if (br0Var != null && zArr[6]) {
                fVar.i(6, br0Var.computeSize());
                this.f29493i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.lp0 lp0Var3 = this.f29488d;
            if (lp0Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lp0Var3.computeSize());
            }
            bw5.lp0 lp0Var4 = this.f29489e;
            if (lp0Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, lp0Var4.computeSize());
            }
            bw5.ip0 ip0Var2 = this.f29490f;
            if (ip0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, ip0Var2.computeSize());
            }
            bw5.gq0 gq0Var2 = this.f29491g;
            if (gq0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, gq0Var2.computeSize());
            }
            bw5.r50 r50Var2 = this.f29492h;
            if (r50Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, r50Var2.computeSize());
            }
            bw5.br0 br0Var2 = this.f29493i;
            return (br0Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, br0Var2.computeSize());
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
                    bw5.lp0 lp0Var5 = new bw5.lp0();
                    if (bArr != null && bArr.length > 0) {
                        lp0Var5.parseFrom(bArr);
                    }
                    this.f29488d = lp0Var5;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lp0 lp0Var6 = new bw5.lp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lp0Var6.parseFrom(bArr2);
                    }
                    this.f29489e = lp0Var6;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ip0 ip0Var3 = new bw5.ip0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ip0Var3.parseFrom(bArr3);
                    }
                    this.f29490f = ip0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.gq0 gq0Var3 = new bw5.gq0();
                    if (bArr4 != null && bArr4.length > 0) {
                        gq0Var3.parseFrom(bArr4);
                    }
                    this.f29491g = gq0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.r50 r50Var3 = new bw5.r50();
                    if (bArr5 != null && bArr5.length > 0) {
                        r50Var3.parseFrom(bArr5);
                    }
                    this.f29492h = r50Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.br0 br0Var3 = new bw5.br0();
                    if (bArr6 != null && bArr6.length > 0) {
                        br0Var3.parseFrom(bArr6);
                    }
                    this.f29493i = br0Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

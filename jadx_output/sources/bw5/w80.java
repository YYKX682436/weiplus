package bw5;

/* loaded from: classes4.dex */
public class w80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34605d;

    /* renamed from: e, reason: collision with root package name */
    public int f34606e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.t80 f34607f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.s80 f34608g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.r70 f34609h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v80 f34610i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.q80 f34611m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.r80 f34612n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f34613o = new boolean[9];

    static {
        new bw5.w80();
    }

    public bw5.v80 b() {
        return this.f34613o[6] ? this.f34610i : new bw5.v80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.w80 parseFrom(byte[] bArr) {
        return (bw5.w80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w80)) {
            return false;
        }
        bw5.w80 w80Var = (bw5.w80) fVar;
        return n51.f.a(this.f34605d, w80Var.f34605d) && n51.f.a(java.lang.Integer.valueOf(this.f34606e), java.lang.Integer.valueOf(w80Var.f34606e)) && n51.f.a(this.f34607f, w80Var.f34607f) && n51.f.a(this.f34608g, w80Var.f34608g) && n51.f.a(this.f34609h, w80Var.f34609h) && n51.f.a(this.f34610i, w80Var.f34610i) && n51.f.a(this.f34611m, w80Var.f34611m) && n51.f.a(this.f34612n, w80Var.f34612n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34613o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34605d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34606e);
            }
            bw5.t80 t80Var = this.f34607f;
            if (t80Var != null && zArr[3]) {
                fVar.i(3, t80Var.computeSize());
                this.f34607f.writeFields(fVar);
            }
            bw5.s80 s80Var = this.f34608g;
            if (s80Var != null && zArr[4]) {
                fVar.i(4, s80Var.computeSize());
                this.f34608g.writeFields(fVar);
            }
            bw5.r70 r70Var = this.f34609h;
            if (r70Var != null && zArr[5]) {
                fVar.i(5, r70Var.computeSize());
                this.f34609h.writeFields(fVar);
            }
            bw5.v80 v80Var = this.f34610i;
            if (v80Var != null && zArr[6]) {
                fVar.i(6, v80Var.computeSize());
                this.f34610i.writeFields(fVar);
            }
            bw5.q80 q80Var = this.f34611m;
            if (q80Var != null && zArr[7]) {
                fVar.i(7, q80Var.computeSize());
                this.f34611m.writeFields(fVar);
            }
            bw5.r80 r80Var = this.f34612n;
            if (r80Var != null && zArr[8]) {
                fVar.i(8, r80Var.computeSize());
                this.f34612n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f34605d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34606e);
            }
            bw5.t80 t80Var2 = this.f34607f;
            if (t80Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, t80Var2.computeSize());
            }
            bw5.s80 s80Var2 = this.f34608g;
            if (s80Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, s80Var2.computeSize());
            }
            bw5.r70 r70Var2 = this.f34609h;
            if (r70Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, r70Var2.computeSize());
            }
            bw5.v80 v80Var2 = this.f34610i;
            if (v80Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, v80Var2.computeSize());
            }
            bw5.q80 q80Var2 = this.f34611m;
            if (q80Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, q80Var2.computeSize());
            }
            bw5.r80 r80Var2 = this.f34612n;
            return (r80Var2 == null || !zArr[8]) ? i18 : i18 + b36.f.i(8, r80Var2.computeSize());
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
                this.f34605d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34606e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.t80 t80Var3 = new bw5.t80();
                    if (bArr != null && bArr.length > 0) {
                        t80Var3.parseFrom(bArr);
                    }
                    this.f34607f = t80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.s80 s80Var3 = new bw5.s80();
                    if (bArr2 != null && bArr2.length > 0) {
                        s80Var3.parseFrom(bArr2);
                    }
                    this.f34608g = s80Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.r70 r70Var3 = new bw5.r70();
                    if (bArr3 != null && bArr3.length > 0) {
                        r70Var3.parseFrom(bArr3);
                    }
                    this.f34609h = r70Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.v80 v80Var3 = new bw5.v80();
                    if (bArr4 != null && bArr4.length > 0) {
                        v80Var3.parseFrom(bArr4);
                    }
                    this.f34610i = v80Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.q80 q80Var3 = new bw5.q80();
                    if (bArr5 != null && bArr5.length > 0) {
                        q80Var3.parseFrom(bArr5);
                    }
                    this.f34611m = q80Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.r80 r80Var3 = new bw5.r80();
                    if (bArr6 != null && bArr6.length > 0) {
                        r80Var3.parseFrom(bArr6);
                    }
                    this.f34612n = r80Var3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}

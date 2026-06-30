package bw5;

/* loaded from: classes2.dex */
public class cb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bb0 f26017d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f26018e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xa0 f26019f;

    /* renamed from: g, reason: collision with root package name */
    public int f26020g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26021h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.q90 f26022i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.t40 f26023m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.s50 f26024n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f26025o = new boolean[10];

    static {
        new bw5.cb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cb0 parseFrom(byte[] bArr) {
        return (bw5.cb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cb0)) {
            return false;
        }
        bw5.cb0 cb0Var = (bw5.cb0) fVar;
        return n51.f.a(this.f26017d, cb0Var.f26017d) && n51.f.a(this.f26018e, cb0Var.f26018e) && n51.f.a(this.f26019f, cb0Var.f26019f) && n51.f.a(java.lang.Integer.valueOf(this.f26020g), java.lang.Integer.valueOf(cb0Var.f26020g)) && n51.f.a(this.f26021h, cb0Var.f26021h) && n51.f.a(this.f26022i, cb0Var.f26022i) && n51.f.a(this.f26023m, cb0Var.f26023m) && n51.f.a(this.f26024n, cb0Var.f26024n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26025o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bb0 bb0Var = this.f26017d;
            if (bb0Var != null && zArr[1]) {
                fVar.e(1, bb0Var.f25595d);
            }
            bw5.o50 o50Var = this.f26018e;
            if (o50Var != null && zArr[2]) {
                fVar.i(2, o50Var.computeSize());
                this.f26018e.writeFields(fVar);
            }
            bw5.xa0 xa0Var = this.f26019f;
            if (xa0Var != null && zArr[3]) {
                fVar.i(3, xa0Var.computeSize());
                this.f26019f.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26020g);
            }
            com.tencent.mm.protobuf.g gVar = this.f26021h;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            bw5.q90 q90Var = this.f26022i;
            if (q90Var != null && zArr[7]) {
                fVar.i(7, q90Var.computeSize());
                this.f26022i.writeFields(fVar);
            }
            bw5.t40 t40Var = this.f26023m;
            if (t40Var != null && zArr[8]) {
                fVar.i(8, t40Var.computeSize());
                this.f26023m.writeFields(fVar);
            }
            bw5.s50 s50Var = this.f26024n;
            if (s50Var != null && zArr[9]) {
                fVar.i(9, s50Var.computeSize());
                this.f26024n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bb0 bb0Var2 = this.f26017d;
            if (bb0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bb0Var2.f25595d);
            }
            bw5.o50 o50Var2 = this.f26018e;
            if (o50Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, o50Var2.computeSize());
            }
            bw5.xa0 xa0Var2 = this.f26019f;
            if (xa0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, xa0Var2.computeSize());
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26020g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26021h;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            bw5.q90 q90Var2 = this.f26022i;
            if (q90Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, q90Var2.computeSize());
            }
            bw5.t40 t40Var2 = this.f26023m;
            if (t40Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, t40Var2.computeSize());
            }
            bw5.s50 s50Var2 = this.f26024n;
            return (s50Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, s50Var2.computeSize());
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
                int g17 = aVar2.g(intValue);
                this.f26017d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.bb0.kCircleX : bw5.bb0.kAudioDiscover : bw5.bb0.kMusicDiscover : bw5.bb0.kCategory : bw5.bb0.kDefault;
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var3.parseFrom(bArr);
                    }
                    this.f26018e = o50Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.parseFrom(bArr2);
                    }
                    this.f26019f = xa0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f26020g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26021h = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.q90 q90Var3 = new bw5.q90();
                    if (bArr3 != null && bArr3.length > 0) {
                        q90Var3.parseFrom(bArr3);
                    }
                    this.f26022i = q90Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.t40 t40Var3 = new bw5.t40();
                    if (bArr4 != null && bArr4.length > 0) {
                        t40Var3.parseFrom(bArr4);
                    }
                    this.f26023m = t40Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.s50 s50Var3 = new bw5.s50();
                    if (bArr5 != null && bArr5.length > 0) {
                        s50Var3.parseFrom(bArr5);
                    }
                    this.f26024n = s50Var3;
                }
                zArr[9] = true;
                return 0;
        }
    }
}

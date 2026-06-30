package bw5;

/* loaded from: classes2.dex */
public class tc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33365d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wc f33366e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.l00 f33367f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.av f33368g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.wc f33369h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.fw f33370i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33371m = new boolean[7];

    static {
        new bw5.tc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tc parseFrom(byte[] bArr) {
        return (bw5.tc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tc)) {
            return false;
        }
        bw5.tc tcVar = (bw5.tc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33365d), java.lang.Integer.valueOf(tcVar.f33365d)) && n51.f.a(this.f33366e, tcVar.f33366e) && n51.f.a(this.f33367f, tcVar.f33367f) && n51.f.a(this.f33368g, tcVar.f33368g) && n51.f.a(this.f33369h, tcVar.f33369h) && n51.f.a(this.f33370i, tcVar.f33370i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33371m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33365d);
            }
            bw5.wc wcVar = this.f33366e;
            if (wcVar != null && zArr[2]) {
                fVar.i(2, wcVar.computeSize());
                this.f33366e.writeFields(fVar);
            }
            bw5.l00 l00Var = this.f33367f;
            if (l00Var != null && zArr[3]) {
                fVar.i(3, l00Var.computeSize());
                this.f33367f.writeFields(fVar);
            }
            bw5.av avVar = this.f33368g;
            if (avVar != null && zArr[4]) {
                fVar.i(4, avVar.computeSize());
                this.f33368g.writeFields(fVar);
            }
            bw5.wc wcVar2 = this.f33369h;
            if (wcVar2 != null && zArr[5]) {
                fVar.i(5, wcVar2.computeSize());
                this.f33369h.writeFields(fVar);
            }
            bw5.fw fwVar = this.f33370i;
            if (fwVar != null && zArr[6]) {
                fVar.i(6, fwVar.computeSize());
                this.f33370i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33365d) : 0;
            bw5.wc wcVar3 = this.f33366e;
            if (wcVar3 != null && zArr[2]) {
                e17 += b36.f.i(2, wcVar3.computeSize());
            }
            bw5.l00 l00Var2 = this.f33367f;
            if (l00Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, l00Var2.computeSize());
            }
            bw5.av avVar2 = this.f33368g;
            if (avVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, avVar2.computeSize());
            }
            bw5.wc wcVar4 = this.f33369h;
            if (wcVar4 != null && zArr[5]) {
                e17 += b36.f.i(5, wcVar4.computeSize());
            }
            bw5.fw fwVar2 = this.f33370i;
            return (fwVar2 == null || !zArr[6]) ? e17 : e17 + b36.f.i(6, fwVar2.computeSize());
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
                this.f33365d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.wc wcVar5 = new bw5.wc();
                    if (bArr != null && bArr.length > 0) {
                        wcVar5.parseFrom(bArr);
                    }
                    this.f33366e = wcVar5;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.l00 l00Var3 = new bw5.l00();
                    if (bArr2 != null && bArr2.length > 0) {
                        l00Var3.parseFrom(bArr2);
                    }
                    this.f33367f = l00Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.av avVar3 = new bw5.av();
                    if (bArr3 != null && bArr3.length > 0) {
                        avVar3.parseFrom(bArr3);
                    }
                    this.f33368g = avVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.wc wcVar6 = new bw5.wc();
                    if (bArr4 != null && bArr4.length > 0) {
                        wcVar6.parseFrom(bArr4);
                    }
                    this.f33369h = wcVar6;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.fw fwVar3 = new bw5.fw();
                    if (bArr5 != null && bArr5.length > 0) {
                        fwVar3.parseFrom(bArr5);
                    }
                    this.f33370i = fwVar3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

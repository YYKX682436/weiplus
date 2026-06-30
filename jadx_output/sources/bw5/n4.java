package bw5;

/* loaded from: classes2.dex */
public class n4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30477d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.am f30478e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f30479f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.am f30480g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f30481h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.am f30482i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.am f30483m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30484n = new boolean[8];

    static {
        new bw5.n4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n4 parseFrom(byte[] bArr) {
        return (bw5.n4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n4)) {
            return false;
        }
        bw5.n4 n4Var = (bw5.n4) fVar;
        return n51.f.a(this.f30477d, n4Var.f30477d) && n51.f.a(this.f30478e, n4Var.f30478e) && n51.f.a(this.f30479f, n4Var.f30479f) && n51.f.a(this.f30480g, n4Var.f30480g) && n51.f.a(this.f30481h, n4Var.f30481h) && n51.f.a(this.f30482i, n4Var.f30482i) && n51.f.a(this.f30483m, n4Var.f30483m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30484n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30477d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.am amVar = this.f30478e;
            if (amVar != null && zArr[2]) {
                fVar.i(2, amVar.computeSize());
                this.f30478e.writeFields(fVar);
            }
            bw5.am amVar2 = this.f30479f;
            if (amVar2 != null && zArr[3]) {
                fVar.i(3, amVar2.computeSize());
                this.f30479f.writeFields(fVar);
            }
            bw5.am amVar3 = this.f30480g;
            if (amVar3 != null && zArr[4]) {
                fVar.i(4, amVar3.computeSize());
                this.f30480g.writeFields(fVar);
            }
            bw5.am amVar4 = this.f30481h;
            if (amVar4 != null && zArr[5]) {
                fVar.i(5, amVar4.computeSize());
                this.f30481h.writeFields(fVar);
            }
            bw5.am amVar5 = this.f30482i;
            if (amVar5 != null && zArr[6]) {
                fVar.i(6, amVar5.computeSize());
                this.f30482i.writeFields(fVar);
            }
            bw5.am amVar6 = this.f30483m;
            if (amVar6 != null && zArr[7]) {
                fVar.i(7, amVar6.computeSize());
                this.f30483m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f30477d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.am amVar7 = this.f30478e;
            if (amVar7 != null && zArr[2]) {
                i18 += b36.f.i(2, amVar7.computeSize());
            }
            bw5.am amVar8 = this.f30479f;
            if (amVar8 != null && zArr[3]) {
                i18 += b36.f.i(3, amVar8.computeSize());
            }
            bw5.am amVar9 = this.f30480g;
            if (amVar9 != null && zArr[4]) {
                i18 += b36.f.i(4, amVar9.computeSize());
            }
            bw5.am amVar10 = this.f30481h;
            if (amVar10 != null && zArr[5]) {
                i18 += b36.f.i(5, amVar10.computeSize());
            }
            bw5.am amVar11 = this.f30482i;
            if (amVar11 != null && zArr[6]) {
                i18 += b36.f.i(6, amVar11.computeSize());
            }
            bw5.am amVar12 = this.f30483m;
            return (amVar12 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, amVar12.computeSize());
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
                this.f30477d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.am amVar13 = new bw5.am();
                    if (bArr != null && bArr.length > 0) {
                        amVar13.parseFrom(bArr);
                    }
                    this.f30478e = amVar13;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.am amVar14 = new bw5.am();
                    if (bArr2 != null && bArr2.length > 0) {
                        amVar14.parseFrom(bArr2);
                    }
                    this.f30479f = amVar14;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.am amVar15 = new bw5.am();
                    if (bArr3 != null && bArr3.length > 0) {
                        amVar15.parseFrom(bArr3);
                    }
                    this.f30480g = amVar15;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.am amVar16 = new bw5.am();
                    if (bArr4 != null && bArr4.length > 0) {
                        amVar16.parseFrom(bArr4);
                    }
                    this.f30481h = amVar16;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.am amVar17 = new bw5.am();
                    if (bArr5 != null && bArr5.length > 0) {
                        amVar17.parseFrom(bArr5);
                    }
                    this.f30482i = amVar17;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.am amVar18 = new bw5.am();
                    if (bArr6 != null && bArr6.length > 0) {
                        amVar18.parseFrom(bArr6);
                    }
                    this.f30483m = amVar18;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

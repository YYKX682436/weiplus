package bw5;

/* loaded from: classes2.dex */
public class j00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f28751d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28752e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28753f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28754g;

    /* renamed from: h, reason: collision with root package name */
    public int f28755h;

    /* renamed from: i, reason: collision with root package name */
    public int f28756i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.pj f28757m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f28758n = new boolean[8];

    static {
        new bw5.j00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j00 parseFrom(byte[] bArr) {
        return (bw5.j00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j00)) {
            return false;
        }
        bw5.j00 j00Var = (bw5.j00) fVar;
        return n51.f.a(this.f28751d, j00Var.f28751d) && n51.f.a(this.f28752e, j00Var.f28752e) && n51.f.a(this.f28753f, j00Var.f28753f) && n51.f.a(this.f28754g, j00Var.f28754g) && n51.f.a(java.lang.Integer.valueOf(this.f28755h), java.lang.Integer.valueOf(j00Var.f28755h)) && n51.f.a(java.lang.Integer.valueOf(this.f28756i), java.lang.Integer.valueOf(j00Var.f28756i)) && n51.f.a(this.f28757m, j00Var.f28757m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28758n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f28751d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f28751d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f28752e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f28753f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f28754g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28755h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28756i);
            }
            bw5.pj pjVar = this.f28757m;
            if (pjVar != null && zArr[7]) {
                fVar.i(7, pjVar.computeSize());
                this.f28757m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f28751d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28752e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str3 = this.f28753f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f28754g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f28755h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f28756i);
            }
            bw5.pj pjVar2 = this.f28757m;
            return (pjVar2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, pjVar2.computeSize());
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
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.parseFrom(bArr);
                    }
                    this.f28751d = aeVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f28752e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28753f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28754g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28755h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28756i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar3.parseFrom(bArr2);
                    }
                    this.f28757m = pjVar3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

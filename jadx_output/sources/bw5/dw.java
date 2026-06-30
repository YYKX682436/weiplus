package bw5;

/* loaded from: classes2.dex */
public class dw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f26630d;

    /* renamed from: e, reason: collision with root package name */
    public int f26631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26632f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.er f26633g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.yj f26634h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f26635i = new boolean[6];

    static {
        new bw5.dw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dw parseFrom(byte[] bArr) {
        return (bw5.dw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dw)) {
            return false;
        }
        bw5.dw dwVar = (bw5.dw) fVar;
        return n51.f.a(this.f26630d, dwVar.f26630d) && n51.f.a(java.lang.Integer.valueOf(this.f26631e), java.lang.Integer.valueOf(dwVar.f26631e)) && n51.f.a(this.f26632f, dwVar.f26632f) && n51.f.a(this.f26633g, dwVar.f26633g) && n51.f.a(this.f26634h, dwVar.f26634h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26635i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f26630d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f26630d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26631e);
            }
            java.lang.String str = this.f26632f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.er erVar = this.f26633g;
            if (erVar != null && zArr[4]) {
                fVar.i(4, erVar.computeSize());
                this.f26633g.writeFields(fVar);
            }
            bw5.yj yjVar = this.f26634h;
            if (yjVar != null && zArr[5]) {
                fVar.i(5, yjVar.computeSize());
                this.f26634h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f26630d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f26631e);
            }
            java.lang.String str2 = this.f26632f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            bw5.er erVar2 = this.f26633g;
            if (erVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, erVar2.computeSize());
            }
            bw5.yj yjVar2 = this.f26634h;
            return (yjVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, yjVar2.computeSize());
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
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.parseFrom(bArr);
                }
                this.f26630d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26631e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26632f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.er erVar3 = new bw5.er();
                if (bArr2 != null && bArr2.length > 0) {
                    erVar3.parseFrom(bArr2);
                }
                this.f26633g = erVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.yj yjVar3 = new bw5.yj();
            if (bArr3 != null && bArr3.length > 0) {
                yjVar3.parseFrom(bArr3);
            }
            this.f26634h = yjVar3;
        }
        zArr[5] = true;
        return 0;
    }
}

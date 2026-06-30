package bw5;

/* loaded from: classes2.dex */
public class gt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27995d;

    /* renamed from: e, reason: collision with root package name */
    public int f27996e;

    /* renamed from: f, reason: collision with root package name */
    public int f27997f;

    /* renamed from: h, reason: collision with root package name */
    public int f27999h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.st f28000i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f27998g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28001m = new boolean[81];

    static {
        new bw5.gt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gt parseFrom(byte[] bArr) {
        return (bw5.gt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gt)) {
            return false;
        }
        bw5.gt gtVar = (bw5.gt) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27995d), java.lang.Integer.valueOf(gtVar.f27995d)) && n51.f.a(java.lang.Integer.valueOf(this.f27996e), java.lang.Integer.valueOf(gtVar.f27996e)) && n51.f.a(java.lang.Integer.valueOf(this.f27997f), java.lang.Integer.valueOf(gtVar.f27997f)) && n51.f.a(this.f27998g, gtVar.f27998g) && n51.f.a(java.lang.Integer.valueOf(this.f27999h), java.lang.Integer.valueOf(gtVar.f27999h)) && n51.f.a(this.f28000i, gtVar.f28000i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27998g;
        boolean[] zArr = this.f28001m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27995d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27996e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27997f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f27999h);
            }
            bw5.st stVar = this.f28000i;
            if (stVar != null && zArr[80]) {
                fVar.i(80, stVar.computeSize());
                this.f28000i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27995d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27996e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27997f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f27999h);
            }
            bw5.st stVar2 = this.f28000i;
            return (stVar2 == null || !zArr[80]) ? g17 : g17 + b36.f.i(80, stVar2.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f27995d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27996e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27997f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.vd vdVar = new bw5.vd();
                if (bArr != null && bArr.length > 0) {
                    vdVar.parseFrom(bArr);
                }
                linkedList.add(vdVar);
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f27999h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        if (intValue != 80) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.st stVar3 = new bw5.st();
            if (bArr2 != null && bArr2.length > 0) {
                stVar3.parseFrom(bArr2);
            }
            this.f28000i = stVar3;
        }
        zArr[80] = true;
        return 0;
    }
}

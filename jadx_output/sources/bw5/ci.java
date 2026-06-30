package bw5;

/* loaded from: classes2.dex */
public class ci extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.wh f26090d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wh f26091e;

    /* renamed from: f, reason: collision with root package name */
    public int f26092f;

    /* renamed from: g, reason: collision with root package name */
    public int f26093g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26094h = new boolean[5];

    static {
        new bw5.ci();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ci parseFrom(byte[] bArr) {
        return (bw5.ci) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ci)) {
            return false;
        }
        bw5.ci ciVar = (bw5.ci) fVar;
        return n51.f.a(this.f26090d, ciVar.f26090d) && n51.f.a(this.f26091e, ciVar.f26091e) && n51.f.a(java.lang.Integer.valueOf(this.f26092f), java.lang.Integer.valueOf(ciVar.f26092f)) && n51.f.a(java.lang.Integer.valueOf(this.f26093g), java.lang.Integer.valueOf(ciVar.f26093g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ci();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26094h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wh whVar = this.f26090d;
            if (whVar != null && zArr[1]) {
                fVar.i(1, whVar.computeSize());
                this.f26090d.writeFields(fVar);
            }
            bw5.wh whVar2 = this.f26091e;
            if (whVar2 != null && zArr[2]) {
                fVar.i(2, whVar2.computeSize());
                this.f26091e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26092f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26093g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.wh whVar3 = this.f26090d;
            if (whVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, whVar3.computeSize());
            }
            bw5.wh whVar4 = this.f26091e;
            if (whVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, whVar4.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26092f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f26093g) : i18;
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
                bw5.wh whVar5 = new bw5.wh();
                if (bArr != null && bArr.length > 0) {
                    whVar5.parseFrom(bArr);
                }
                this.f26090d = whVar5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f26092f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f26093g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.wh whVar6 = new bw5.wh();
            if (bArr2 != null && bArr2.length > 0) {
                whVar6.parseFrom(bArr2);
            }
            this.f26091e = whVar6;
        }
        zArr[2] = true;
        return 0;
    }
}

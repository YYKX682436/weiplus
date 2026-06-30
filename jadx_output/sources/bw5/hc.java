package bw5;

/* loaded from: classes2.dex */
public class hc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28145d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wz f28146e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.wq f28147f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.qj f28148g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28149h = new boolean[5];

    static {
        new bw5.hc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hc parseFrom(byte[] bArr) {
        return (bw5.hc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hc)) {
            return false;
        }
        bw5.hc hcVar = (bw5.hc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28145d), java.lang.Integer.valueOf(hcVar.f28145d)) && n51.f.a(this.f28146e, hcVar.f28146e) && n51.f.a(this.f28147f, hcVar.f28147f) && n51.f.a(this.f28148g, hcVar.f28148g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28149h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28145d);
            }
            bw5.wz wzVar = this.f28146e;
            if (wzVar != null && zArr[2]) {
                fVar.i(2, wzVar.computeSize());
                this.f28146e.writeFields(fVar);
            }
            bw5.wq wqVar = this.f28147f;
            if (wqVar != null && zArr[3]) {
                fVar.i(3, wqVar.computeSize());
                this.f28147f.writeFields(fVar);
            }
            bw5.qj qjVar = this.f28148g;
            if (qjVar != null && zArr[4]) {
                fVar.i(4, qjVar.computeSize());
                this.f28148g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28145d) : 0;
            bw5.wz wzVar2 = this.f28146e;
            if (wzVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, wzVar2.computeSize());
            }
            bw5.wq wqVar2 = this.f28147f;
            if (wqVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, wqVar2.computeSize());
            }
            bw5.qj qjVar2 = this.f28148g;
            return (qjVar2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, qjVar2.computeSize());
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
            this.f28145d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.wz wzVar3 = new bw5.wz();
                if (bArr != null && bArr.length > 0) {
                    wzVar3.parseFrom(bArr);
                }
                this.f28146e = wzVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.wq wqVar3 = new bw5.wq();
                if (bArr2 != null && bArr2.length > 0) {
                    wqVar3.parseFrom(bArr2);
                }
                this.f28147f = wqVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.qj qjVar3 = new bw5.qj();
            if (bArr3 != null && bArr3.length > 0) {
                qjVar3.parseFrom(bArr3);
            }
            this.f28148g = qjVar3;
        }
        zArr[4] = true;
        return 0;
    }
}

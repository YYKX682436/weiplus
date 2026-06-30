package bw5;

/* loaded from: classes2.dex */
public class kl extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f29410e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f29409d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29411f = new boolean[3];

    static {
        new bw5.kl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kl parseFrom(byte[] bArr) {
        return (bw5.kl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kl)) {
            return false;
        }
        bw5.kl klVar = (bw5.kl) fVar;
        return n51.f.a(this.f29409d, klVar.f29409d) && n51.f.a(java.lang.Boolean.valueOf(this.f29410e), java.lang.Boolean.valueOf(klVar.f29410e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29411f;
        java.util.LinkedList linkedList = this.f29409d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f29410e);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            return zArr[2] ? g17 + b36.f.a(2, this.f29410e) : g17;
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f29410e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.g10 g10Var = new bw5.g10();
            if (bArr != null && bArr.length > 0) {
                g10Var.parseFrom(bArr);
            }
            linkedList.add(g10Var);
        }
        zArr[1] = true;
        return 0;
    }
}

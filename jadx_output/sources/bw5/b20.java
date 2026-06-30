package bw5;

/* loaded from: classes2.dex */
public class b20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25495d;

    /* renamed from: e, reason: collision with root package name */
    public long f25496e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.q5 f25497f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25498g = new boolean[4];

    static {
        new bw5.b20();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b20 parseFrom(byte[] bArr) {
        return (bw5.b20) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b20)) {
            return false;
        }
        bw5.b20 b20Var = (bw5.b20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25495d), java.lang.Integer.valueOf(b20Var.f25495d)) && n51.f.a(java.lang.Long.valueOf(this.f25496e), java.lang.Long.valueOf(b20Var.f25496e)) && n51.f.a(this.f25497f, b20Var.f25497f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25498g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25495d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25496e);
            }
            bw5.q5 q5Var = this.f25497f;
            if (q5Var != null && zArr[3]) {
                fVar.i(3, q5Var.computeSize());
                this.f25497f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25495d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f25496e);
            }
            bw5.q5 q5Var2 = this.f25497f;
            return (q5Var2 == null || !zArr[3]) ? e17 : e17 + b36.f.i(3, q5Var2.computeSize());
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
            this.f25495d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25496e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.q5 q5Var3 = new bw5.q5();
            if (bArr != null && bArr.length > 0) {
                q5Var3.parseFrom(bArr);
            }
            this.f25497f = q5Var3;
        }
        zArr[3] = true;
        return 0;
    }
}

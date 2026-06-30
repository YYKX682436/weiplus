package bw5;

/* loaded from: classes2.dex */
public class db0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26418d;

    /* renamed from: e, reason: collision with root package name */
    public float f26419e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26420f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26421g = new boolean[4];

    static {
        new bw5.db0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.db0 parseFrom(byte[] bArr) {
        return (bw5.db0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.db0)) {
            return false;
        }
        bw5.db0 db0Var = (bw5.db0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26418d), java.lang.Integer.valueOf(db0Var.f26418d)) && n51.f.a(java.lang.Float.valueOf(this.f26419e), java.lang.Float.valueOf(db0Var.f26419e)) && n51.f.a(this.f26420f, db0Var.f26420f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.db0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26421g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26418d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f26419e);
            }
            com.tencent.mm.protobuf.g gVar = this.f26420f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26418d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f26419e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26420f;
            return (gVar2 == null || !zArr[3]) ? e17 : e17 + b36.f.b(3, gVar2);
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
            this.f26418d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26419e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f26420f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }
}
